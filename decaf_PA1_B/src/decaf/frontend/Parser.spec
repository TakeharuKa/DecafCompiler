%package decaf.frontend
%import
decaf.Location
decaf.tree.Tree
decaf.tree.Tree.*
java.util.*

%class Table
%sem SemValue
%start Program

%tokens
VOID   BOOL  INT   STRING   CLASS
NULL   EXTENDS     THIS     WHILE   FOR
IF     ELSE        RETURN   BREAK   NEW
PRINT  READ_INTEGER         READ_LINE
LITERAL
IDENTIFIER   AND      OR    STATIC  INSTANCEOF
LESS_EQUAL   GREATER_EQUAL  EQUAL   NOT_EQUAL
'+'  '-'  '*'  '/'  '%'  '='  '>'  '<'  '.'
','  ';'  '!'  '('  ')'  '['  ']'  '{'  '}'  ':'
SCOPY  SEALED  GUARD  VAR  ARRAYINIT  ARRAYCONCAT
DEFAULT  IN  FOREACH  COMPL  COMPR
%%

Program         :   ClassDef ClassList
                    {
                        $$.clist = new ArrayList<ClassDef>();
                        $$.clist.add($1.cdef);
                        if ($2.clist != null) {
                            $$.clist.addAll($2.clist);
                        }
                        $$.prog = new Tree.TopLevel($$.clist, $$.loc);
                    }
                ;

ClassList       :   ClassDef ClassList
                    {
                        $$.clist = new ArrayList<ClassDef>();
                        $$.clist.add($1.cdef);
                        if ($2.clist != null) {
                            $$.clist.addAll($2.clist);
                        }
                    }
                |   /* empty */
                ;

VariableDef     :   Variable ';'
                    {
                        $$.vdef = $1.vdef;
                    }
                ;

Variable        :   Type IDENTIFIER
                    {
                        $$.vdef = new Tree.VarDef($2.ident, $1.type, $2.loc);
                    }
                ;

SimpleType      :   INT
                    {
                        $$.type = new Tree.TypeIdent(Tree.INT, $1.loc);
                    }
                |   VOID
                    {
                        $$.type = new Tree.TypeIdent(Tree.VOID, $1.loc);
                    }
                |   BOOL
                    {
                        $$.type = new Tree.TypeIdent(Tree.BOOL, $1.loc);
                    }
                |   STRING
                    {
                        $$.type = new Tree.TypeIdent(Tree.STRING, $1.loc);
                    }
                |   CLASS IDENTIFIER
                    {
                        $$.type = new Tree.TypeClass($2.ident, $1.loc);
                    }
                ;

Type            :   SimpleType ArrayType
                    {
                        $$.type = $1.type;
                        for (int i = 0; i < $2.counter; ++i) {
                            $$.type = new Tree.TypeArray($$.type, $1.loc);
                        }
                    }
                ;

ArrayType       :   '[' ']' ArrayType
                    {
                        $$.counter = 1 + $3.counter;
                    }
                |   /* empty */
                    {
                        $$.counter = 0;
                    }
                ;

ClassDef        :   CLASS IDENTIFIER ExtendsClause '{' FieldList '}'
                    {
                        $$.cdef = new Tree.ClassDef($2.ident, $3.ident, $5.flist, $1.loc);
                    }
                |   SEALED CLASS IDENTIFIER ExtendsClause '{' FieldList '}'
                    {
                        $$.cdef = new Tree.SealedClassDef($3.ident, $4.ident, $6.flist, $2.loc);
                    }
                ;

ExtendsClause   :   EXTENDS IDENTIFIER
                    {
                        $$.ident = $2.ident;
                    }
                |   /* empty */
                ;

FieldList       :   Field FieldList
                    {
                        $$.flist = new ArrayList<Tree>();
                        if ($1.vdef != null) {
                            $$.flist.add($1.vdef);
                        } else {
                            $$.flist.add($1.fdef);
                        }
                        $$.flist.addAll($2.flist);
                    }
                |   /* empty */
                    {
                        $$.flist = new ArrayList<Tree>();
                    }
                ;

Field           :   STATIC Type IDENTIFIER '(' Formals ')' StmtBlock
                    {
                        $$.fdef = new Tree.MethodDef(true, $3.ident, $2.type, $5.vlist,
                            (Block) $7.stmt, $3.loc);
                    }
                |   Type IDENTIFIER FunctionField
                    {
                        if ($3.vlist != null) {
                            $$.fdef = new Tree.MethodDef(false, $2.ident, $1.type, $3.vlist,
                                (Block) $3.stmt, $2.loc);
                        } else {
                            $$.vdef = new Tree.VarDef($2.ident, $1.type, $2.loc);
                        }
                    }
                ;

FunctionField   :   '(' Formals ')' StmtBlock // function arguments with body
                    {
                        $$.vlist = $2.vlist;
                        $$.stmt = $4.stmt;
                    }
                |   ';' // just variable definition
                ;

Formals         :   VariableList
                    {
                        $$.vlist = $1.vlist;
                    }
                |   /* empty */
                    {
                        $$.vlist = new ArrayList<VarDef>();
                    }
                ;

VariableList    :   Variable SubVariableList
                    {
                        $$.vlist = new ArrayList<VarDef>();
                        $$.vlist.add($1.vdef);
                        if ($2.vlist != null) {
                            $$.vlist.addAll($2.vlist);
                        }
                    }
                ;

SubVariableList :   ',' Variable SubVariableList
                    {
                        $$.vlist = new ArrayList<VarDef>();
                        $$.vlist.add($2.vdef);
                        if ($3.vlist != null) {
                            $$.vlist.addAll($3.vlist);
                        }
                    }
                |   /* empty */
                ;

StmtBlock       :   '{' StmtList '}'
                    {
                        $$.stmt = new Tree.Block($2.slist, $1.loc);
                    }
                ;

StmtList        :   Stmt StmtList
                    {
                        $$.slist.add($1.stmt);
                        $$.slist.addAll($2.slist);
                    }
                |   /* empty */
                ;

Stmt            :   VariableDef
                    {
                        $$.stmt = $1.vdef;
                    }
                |   SimpleStmt ';'
                    {
                        if ($1.stmt == null) {
                            $$.stmt = new Tree.Skip($2.loc);
                        } else {
                            $$.stmt = $1.stmt;
                        }
                    }
                |   IfStmt
                    {
                        $$.stmt = $1.stmt;
                    }
                |   WhileStmt
                    {
                        $$.stmt = $1.stmt;
                    }
                |   ForStmt
                    {
                        $$.stmt = $1.stmt;
                    }
                |   ReturnStmt ';'
                    {
                        $$.stmt = $1.stmt;
                    }
                |   PrintStmt ';'
                    {
                        $$.stmt = $1.stmt;
                    }
                |   BreakStmt ';'
                    {
                        $$.stmt = $1.stmt;
                    }
                |   StmtBlock
                    {
                        $$.stmt = $1.stmt;
                    }
                |   OCStmt ';'
                    {
                        $$.stmt = $1.stmt;
                    }
                |   ForeachStmt
                    {
                        $$.stmt = $1.stmt;
                    }
                ;

ForeachStmt     :   FOREACH '(' BoundVariable IN Expr WhileBoolExpr ')' Stmt
                    {
                        $$.stmt = new Tree.ArrayForeach($3.stmt, $5.expr, $6.expr, $8.stmt, $1.loc);
                    }
                ;

BoundVariable   :   VAR IDENTIFIER
                    {
                        $$.stmt = new Tree.ArrayVar($2.ident, $1.loc);
                    }
                |   Variable
                    {
                        $$.stmt = $1.vdef;
                    }
                ;

WhileBoolExpr   :   WHILE Expr
                    {
                        $$.expr = $2.expr;
                    }
                |   /* empty */
                    {
                        $$ = new SemValue();
                    }
                ;

OCStmt          :   SCOPY '(' IDENTIFIER ',' Expr ')'
                {
                    $$.stmt = new Tree.Scopy($3.ident, $5.expr, $1.loc);
                }
                ;

SimpleStmt      :   Expr Assignment
                    {
                        if ($2.expr == null) {
                            $$.stmt = new Tree.Calculate($1.expr, $1.loc);
                        } else {
                            $$.stmt = new Tree.Assign($1.expr, $2.expr, $2.loc);
                        }
                    }
                |   /* empty */
                |   VAR IDENTIFIER '=' Expr
                    {
                        $$.stmt = new Tree.Var($2.ident, $4.expr, $1.loc);
                    }
                ;

Assignment      :   '=' Expr
                    {
                        $$.loc = $1.loc;
                        $$.expr = $2.expr;
                    }
                |   /* empty */
                ;

// operators
Oper1           :   OR
                    {
                        $$.counter = Tree.OR;
                        $$.loc = $1.loc;
                    }
                ;

Oper2           :   AND
                    {
                        $$.counter = Tree.AND;
                        $$.loc = $1.loc;
                    }
                ;

Oper3           :   EQUAL
                    {
                        $$.counter = Tree.EQ;
                        $$.loc = $1.loc;
                    }
                |   NOT_EQUAL
                    {
                        $$.counter = Tree.NE;
                        $$.loc = $1.loc;
                    }
                ;

Oper4           :   LESS_EQUAL
                    {
                        $$.counter = Tree.LE;
                        $$.loc = $1.loc;
                    }
                |   GREATER_EQUAL
                    {
                        $$.counter = Tree.GE;
                        $$.loc = $1.loc;
                    }
                |   '<'
                    {
                        $$.counter = Tree.LT;
                        $$.loc = $1.loc;
                    }
                |   '>'
                    {
                        $$.counter = Tree.GT;
                        $$.loc = $1.loc;
                    }
                ;

Oper5           :   '+'
                    {
                        $$.counter = Tree.PLUS;
                        $$.loc = $1.loc;
                    }
                |   '-'
                    {
                        $$.counter = Tree.MINUS;
                        $$.loc = $1.loc;
                    }
                ;

Oper6           :   '*'
                    {
                        $$.counter = Tree.MUL;
                        $$.loc = $1.loc;
                    }
                |   '/'
                    {
                        $$.counter = Tree.DIV;
                        $$.loc = $1.loc;
                    }
                |   '%'
                    {
                        $$.counter = Tree.MOD;
                        $$.loc = $1.loc;
                    }
                ;

Oper7           :   '-'
                    {
                        $$.counter = Tree.NEG;
                        $$.loc = $1.loc;
                    }
                |   '!'
                    {
                        $$.counter = Tree.NOT;
                        $$.loc = $1.loc;
                    }
                ;

// expressions
Expr            :   Expr1
                    {
                        $$.expr = $1.expr;
                    }
                |   COMPL Expr FOR IDENTIFIER IN Expr IfBoolExpr COMPR
                    {
                        $$.expr = new Tree.ArrayComp($2.expr, $4.ident, $6.expr, $7.expr, $1.loc);
                    }
                ;

IfBoolExpr      :   IF Expr
                    {
                        $$.expr = $2.expr;
                    }
                |   /* empty */
                    {
                        $$ = new SemValue();
                    }
                ;

Expr1           :   Expr2 ExprT1
                    {
                        $$.expr = $1.expr;
                        if ($2.svec != null) {
                            for (int i = 0; i < $2.svec.size(); ++i) {
                                $$.expr = new Tree.Binary($2.svec.get(i), $$.expr,
                                    $2.evec.get(i), $2.lvec.get(i));
                            }
                        }
                    }
                ;

ExprT1          :   Oper1 Expr2 ExprT1
                    {
                        $$.svec = new Vector<Integer>();
                        $$.lvec = new Vector<Location>();
                        $$.evec = new Vector<Expr>();
                        $$.svec.add($1.counter);
                        $$.lvec.add($1.loc);
                        $$.evec.add($2.expr);
                        if ($3.svec != null) {
                            $$.svec.addAll($3.svec);
                            $$.lvec.addAll($3.lvec);
                            $$.evec.addAll($3.evec);
                        }
                    }
                |   /* empty */
                ;

Expr2           :   Expr3 ExprT2
                    {
                        $$.expr = $1.expr;
                        if ($2.svec != null) {
                            for (int i = 0; i < $2.svec.size(); ++i) {
                                $$.expr = new Tree.Binary($2.svec.get(i), $$.expr,
                                    $2.evec.get(i), $2.lvec.get(i));
                            }
                        }
                    }
                ;

ExprT2          :   Oper2 Expr3 ExprT2
                    {
                        $$.svec = new Vector<Integer>();
                        $$.lvec = new Vector<Location>();
                        $$.evec = new Vector<Expr>();
                        $$.svec.add($1.counter);
                        $$.lvec.add($1.loc);
                        $$.evec.add($2.expr);
                        if ($3.svec != null) {
                            $$.svec.addAll($3.svec);
                            $$.lvec.addAll($3.lvec);
                            $$.evec.addAll($3.evec);
                        }
                    }
                |   /* empty */
                ;

Expr3           :   Expr4 ExprT3
                    {
                        $$.expr = $1.expr;
                        if ($2.svec != null) {
                            for (int i = 0; i < $2.svec.size(); ++i) {
                                $$.expr = new Tree.Binary($2.svec.get(i), $$.expr,
                                    $2.evec.get(i), $2.lvec.get(i));
                            }
                        }
                    }
                ;

ExprT3          :   Oper3 Expr4 ExprT3
                    {
                        $$.svec = new Vector<Integer>();
                        $$.lvec = new Vector<Location>();
                        $$.evec = new Vector<Expr>();
                        $$.svec.add($1.counter);
                        $$.lvec.add($1.loc);
                        $$.evec.add($2.expr);
                        if ($3.svec != null) {
                            $$.svec.addAll($3.svec);
                            $$.lvec.addAll($3.lvec);
                            $$.evec.addAll($3.evec);
                        }
                    }
                |   /* empty */
                ;

Expr4           :   Expr4A ExprT4
                    {
                        $$.expr = $1.expr;
                        if ($2.svec != null) {
                            for (int i = 0; i < $2.svec.size(); ++i) {
                                $$.expr = new Tree.Binary($2.svec.get(i), $$.expr,
                                    $2.evec.get(i), $2.lvec.get(i));
                            }
                        }
                    }
                ;

ExprT4          :   Oper4 Expr5 ExprT4
                    {
                        $$.svec = new Vector<Integer>();
                        $$.lvec = new Vector<Location>();
                        $$.evec = new Vector<Expr>();
                        $$.svec.add($1.counter);
                        $$.lvec.add($1.loc);
                        $$.evec.add($2.expr);
                        if ($3.svec != null) {
                            $$.svec.addAll($3.svec);
                            $$.lvec.addAll($3.lvec);
                            $$.evec.addAll($3.evec);
                        }
                    }
                |   /* empty */
                ;

Expr4A          :   Expr4B ExprT4A
                    {
                        $$.expr = $1.expr;
                        if ($2.svec != null) {
                            $$.expr = $2.evec.get($2.evec.size() - 1);
                            for(int i = $2.evec.size() - 1; i > 0; i--) {
                                $$.expr = new Tree.Binary($2.svec.get(0), $2.evec.get(i - 1), $2.evec.get(i), $2.lvec.get(i - 1));
                            }
                            $$.expr = new Tree.Binary($2.svec.get(0), $1.expr, $$.expr, $1.loc);
                        }
                    }
                ;

ExprT4A         :   ARRAYCONCAT Expr4B ExprT4A
                    {
                        $$.svec = new Vector<Integer>();
                        $$.lvec = new Vector<Location>();
                        $$.evec = new Vector<Expr>();
                        $$.svec.add(Tree.ARRAYCONCAT);
                        $$.lvec.add($1.loc);
                        $$.evec.add($2.expr);
                        if ($3.svec != null) {
                            $$.svec.addAll($3.svec);
                            $$.lvec.addAll($3.lvec);
                            $$.evec.addAll($3.evec);
                        }
                    }
                |   /* empty */
                ;

ExprT4B         :   ARRAYINIT Expr5 ExprT4B
                    {
                        $$.svec = new Vector<Integer>();
                        $$.lvec = new Vector<Location>();
                        $$.evec = new Vector<Expr>();
                        $$.svec.add(Tree.ARRAYINIT);
                        $$.lvec.add($1.loc);
                        $$.evec.add($2.expr);
                        if ($3.svec != null) {
                            $$.svec.addAll($3.svec);
                            $$.lvec.addAll($3.lvec);
                            $$.evec.addAll($3.evec);
                        }
                    }
                |   /* empty */
                ;

Expr4B          :   Expr5 ExprT4B
                    {
                        $$.expr = $1.expr;
                        if ($2.svec != null) {
                            for (int i = 0; i < $2.svec.size(); ++i) {
                                $$.expr = new Tree.Binary($2.svec.get(i), $$.expr,
                                    $2.evec.get(i), $2.lvec.get(i));
                            }
                        }
                    }
                ;

Expr5           :   Expr6 ExprT5
                    {
                        $$.expr = $1.expr;
                        if ($2.svec != null) {
                            for (int i = 0; i < $2.svec.size(); ++i) {
                                $$.expr = new Tree.Binary($2.svec.get(i), $$.expr,
                                    $2.evec.get(i), $2.lvec.get(i));
                            }
                        }
                    }
                ;

ExprT5          :   Oper5 Expr6 ExprT5
                    {
                        $$.svec = new Vector<Integer>();
                        $$.lvec = new Vector<Location>();
                        $$.evec = new Vector<Expr>();
                        $$.svec.add($1.counter);
                        $$.lvec.add($1.loc);
                        $$.evec.add($2.expr);
                        if ($3.svec != null) {
                            $$.svec.addAll($3.svec);
                            $$.lvec.addAll($3.lvec);
                            $$.evec.addAll($3.evec);
                        }
                    }
                |   /* empty */
                ;

Expr6           :   Expr7 ExprT6
                    {
                        $$.expr = $1.expr;
                        if ($2.svec != null) {
                            for (int i = 0; i < $2.svec.size(); ++i) {
                                $$.expr = new Tree.Binary($2.svec.get(i), $$.expr,
                                    $2.evec.get(i), $2.lvec.get(i));
                            }
                        }
                    }
                ;

ExprT6          :   Oper6 Expr7 ExprT6
                    {
                        $$.svec = new Vector<Integer>();
                        $$.lvec = new Vector<Location>();
                        $$.evec = new Vector<Expr>();
                        $$.svec.add($1.counter);
                        $$.lvec.add($1.loc);
                        $$.evec.add($2.expr);
                        if ($3.svec != null) {
                            $$.svec.addAll($3.svec);
                            $$.lvec.addAll($3.lvec);
                            $$.evec.addAll($3.evec);
                        }
                    }
                |   /* empty */
                ;

Expr7           :   Oper7 Expr8
                    {
                        $$.expr = new Tree.Unary($1.counter, $2.expr, $1.loc);
                    }
                |   Expr8
                    {
                        $$.expr = $1.expr;
                    }
                ;

Expr8           :   Expr9 ExprT8
                    {
                        if($2.tag == 0) {  /* primitive way */
                            $$.expr = $1.expr;
                            $$.loc = $1.loc;
                            if ($2.vec != null) {
                                for (SemValue v : $2.vec) {
                                    if (v.expr != null) {
                                        $$.expr = new Tree.Indexed($$.expr, v.expr, $$.loc);
                                    } else if (v.elist != null) {
                                        $$.expr = new Tree.CallExpr($$.expr, v.ident, v.elist, v.loc);
                                        $$.loc = v.loc;
                                    } else {
                                        $$.expr = new Tree.Ident($$.expr, v.ident, v.loc);
                                        $$.loc = v.loc;
                                    }
                                }
                            }
                        } else if($2.tag == 1) {  /*  default format  */
                            $$.expr = new Tree.Ternary(Tree.ARRAYDEFAULT, $1.expr, $2.expr, $2.expr1, $1.loc);
                        } else {  /*  subarray  */
                            $$.expr = new Tree.Binary(Tree.ARRAYREF, $1.expr, $2.expr, $1.loc);
                            /* $$.expr = new SubArray($1.expr, $2.expr, $2.expr1, $1.loc); */
                        }
                    }
                ;




ExprT8          :   '[' Expr  ExprT8B
                    {
                        if($3.tag == 0) {
                            SemValue sem = new SemValue();
                            sem.expr = $2.expr;
                            $$.tag = $3.tag;
                            $$.vec = new Vector<SemValue>();
                            $$.vec.add(sem);
                            if ($3.vec != null) {
                                $$.vec.addAll($3.vec);
                            }
                        } else if($3.tag == 1) {
                            $$ = new SemValue();
                            $$.tag = 1;
                            $$.expr = $2.expr;
                            $$.expr1 = $3.expr;
                        } else {
                            $$.tag = 2;
                            $$.expr = new Tree.Binary(Tree.ARRAYRANGE, $2.expr, $3.expr, $1.loc);
                        }
                    }
                |   '.' IDENTIFIER AfterIdentExpr ExprT8
                    {
                        SemValue sem = new SemValue();
                        sem.ident = $2.ident;
                        sem.loc = $2.loc;
                        sem.elist = $3.elist;
                        $$.vec = new Vector<SemValue>();
                        $$.vec.add(sem);
                        if ($4.vec != null) {
                            $$.vec.addAll($4.vec);
                        }
                    }
                |   /* empty */
                ;

ExprT8B         :   ']' ExprT8A
                    {
                        $$ = new SemValue();
                        $$.tag = $2.tag;
                        $$.vec = $2.vec;
                        $$.expr = $2.expr;
                    }
                |   ':' Expr ']'
                    {
                        $$.tag = 2;
                        $$.expr = $2.expr;
                    }
                ;

ExprT8A         :   ExprT8
                    {
                        $$ = new SemValue();
                        $$.vec = $1.vec;
                        $$.tag = 0;
                    }
                |   DEFAULT Expr9
                    {
                        $$ = new SemValue();
                        $$.tag = 1;
                        $$.expr = $2.expr;
                    }
                ;

AfterIdentExpr  :   '(' Actuals ')'
                    {
                        $$.elist = $2.elist;
                    }
                |   /* empty */
                ;

Expr9           :   Constant
                    {
                        $$.expr = $1.expr;
                    }
                |   READ_INTEGER '(' ')'
                    {
                        $$.expr = new Tree.ReadIntExpr($1.loc);
                    }
                |   READ_LINE '(' ')'
                    {
                        $$.expr = new Tree.ReadLineExpr($1.loc);
                    }
                |   THIS
                    {
                        $$.expr = new Tree.ThisExpr($1.loc);
                    }
                |   NEW AfterNewExpr
                    {
                        if ($2.ident != null) {
                            $$.expr = new Tree.NewClass($2.ident, $1.loc);
                        } else {
                            $$.expr = new Tree.NewArray($2.type, $2.expr, $1.loc);
                        }
                    }
                |   INSTANCEOF '(' Expr ',' IDENTIFIER ')'
                    {
                        $$.expr = new Tree.TypeTest($3.expr, $5.ident, $1.loc);
                    }
                |   '(' AfterParenExpr
                    {
                        $$.expr = $2.expr;
                    }
                |   IDENTIFIER AfterIdentExpr
                    {
                        if ($2.elist != null) {
                            $$.expr = new Tree.CallExpr(null, $1.ident, $2.elist, $1.loc);
                        } else {
                            $$.expr = new Tree.Ident(null, $1.ident, $1.loc);
                        }
                    }
                ;

AfterNewExpr    :   IDENTIFIER '(' ')'
                    {
                        $$.ident = $1.ident;
                    }
                |   SimpleType '[' AfterSimpleTypeExpr
                    {
                        $$.type = $1.type;
                        for (int i = 0; i < $3.counter; ++i) {
                            $$.type = new Tree.TypeArray($$.type, $1.loc);
                        }
                        $$.expr = $3.expr;
                    }
                ;

AfterSimpleTypeExpr :   ']' '[' AfterSimpleTypeExpr
                        {
                            $$.expr = $3.expr;
                            $$.counter = 1 + $3.counter;
                        }
                    |   Expr ']'
                        {
                            $$.expr = $1.expr;
                            $$.counter = 0;
                        }
                    ;

AfterParenExpr  :   Expr ')'
                    {
                        $$.expr = $1.expr;
                    }
                |   CLASS IDENTIFIER ')' Expr9
                    {
                        $$.expr = new Tree.TypeCast($2.ident, $4.expr, $4.loc);
                    }
                ;

// end of expressions

Constant        :   LITERAL
                    {
                        $$.expr = new Tree.Literal($1.typeTag, $1.literal, $1.loc);
                    }
                |   NULL
                    {
                        $$.expr = new Null($1.loc);
                    }
                |   ArrayConstant
                    {
                        $$.expr = $1.expr;
                    }
                ;

ArrayConstant   :   '[' ArrayConstants ']'
                    {
                        $$.expr = new Tree.Literal(Tree.ARRAYCONSTANT, $2.elist, $1.loc);
                    }
                ;

ArrayConstants  :   Constant ArraySuffix
                    {
                        $2.elist.add(0, $1.expr);
                        $$.elist = $2.elist;
                    }
                |   /* empty */
                    {
                        $$.elist = new ArrayList<Tree.Expr>();
                    }
                ;

ArraySuffix     :  ',' Constant ArraySuffix
                    {
                        $3.elist.add(0, $2.expr);
                        $$.elist = $3.elist;
                    }
                | /* empty */
                    {
                        $$.elist = new ArrayList<Tree.Expr>();
                    }


Actuals         :   ExprList
                    {
                        $$.elist = $1.elist;
                    }
                |   /* empty */
                    {
                        $$.elist = new ArrayList<Tree.Expr>();
                    }
                ;

ExprList        :   Expr SubExprList
                    {
                        $$.elist = new ArrayList<Tree.Expr>();
                        $$.elist.add($1.expr);
                        $$.elist.addAll($2.elist);
                    }
                ;

SubExprList     :   ',' Expr SubExprList
                    {
                        $$.elist = new ArrayList<Tree.Expr>();
                        $$.elist.add($2.expr);
                        $$.elist.addAll($3.elist);
                    }
                |   /* empty */
                    {
                        $$.elist = new ArrayList<Tree.Expr>();
                    }
                ;

// statements
WhileStmt       :   WHILE '(' Expr ')' Stmt
                    {
                        $$.stmt = new Tree.WhileLoop($3.expr, $5.stmt, $1.loc);
                    }
                ;

ForStmt         :   FOR '(' SimpleStmt ';' Expr ';' SimpleStmt ')' Stmt
                    {
                        $$.stmt = new Tree.ForLoop($3.stmt, $5.expr, $7.stmt, $9.stmt, $1.loc);
                    }
                ;

BreakStmt       :   BREAK
                    {
                        $$.stmt = new Tree.Break($1.loc);
                    }
                ;

IfStmt          :   IF IfSuffix
                    {
                        $$.stmt = $2.stmt;
                    }
                ;

IfSuffix        :   '(' Expr ')' Stmt ElseClause
                    {
                        $$.stmt = new Tree.If($2.expr, $4.stmt, $5.stmt, $1.loc);
                    }
                |   '{' GuardedStmt '}'
                    {
                        $$.stmt = $2.stmt;
                    }
                ;

GuardedStmt     :   IfBranch IfSubStmt
                    {
                        $2.slist.add(0, $1.stmt);
                        $$.stmt = new Tree.Guarded($2.slist, $1.loc);
                    }
                |   /* empty */
                    {
                        $$.stmt = new Tree.Guarded(new ArrayList<Tree>(), $$.loc);
                    }
                ;



IfSubStmt       :   GUARD IfBranch IfSubStmt
                    {
                        $$.slist = $3.slist;
                        $$.slist.add(0, $2.stmt);
                    }
                |   /* empty */
                    {
                        $$ = new SemValue();
                    }
                ;

IfBranch        :   Expr ':' Stmt
                    {
                        $$.stmt = new Tree.IfBranch($1.expr, $3.stmt, $1.loc);
                    }
                ;



ElseClause      :   ELSE Stmt // higher priority
                    {
                        $$.stmt = $2.stmt;
                    }
                |   /* empty */
                ;

ReturnStmt      :   RETURN ReturnExpr
                    {
                        $$.stmt = new Tree.Return($2.expr, $1.loc);
                    }
                ;

ReturnExpr      :   Expr
                    {
                        $$.expr = $1.expr;
                    }
                |   /* empty */
                ;

PrintStmt       :   PRINT '(' ExprList ')'
                    {
                        $$.stmt = new Tree.Print($3.elist, $1.loc);
                    }
                ;
