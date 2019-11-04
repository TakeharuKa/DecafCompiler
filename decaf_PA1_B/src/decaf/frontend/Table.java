/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: /Users/lixiao/Documents/2018fall/????/??/decaf_PA1_B/src/decaf/frontend/Parser.spec
 * Options: unstrict mode
 * Generated at: Sun Nov 04 23:25:13 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 13
    public static final int BOOL = 258; //# line 13
    public static final int INT = 259; //# line 13
    public static final int STRING = 260; //# line 13
    public static final int CLASS = 261; //# line 13
    public static final int NULL = 262; //# line 14
    public static final int EXTENDS = 263; //# line 14
    public static final int THIS = 264; //# line 14
    public static final int WHILE = 265; //# line 14
    public static final int FOR = 266; //# line 14
    public static final int IF = 267; //# line 15
    public static final int ELSE = 268; //# line 15
    public static final int RETURN = 269; //# line 15
    public static final int BREAK = 270; //# line 15
    public static final int NEW = 271; //# line 15
    public static final int PRINT = 272; //# line 16
    public static final int READ_INTEGER = 273; //# line 16
    public static final int READ_LINE = 274; //# line 16
    public static final int LITERAL = 275; //# line 17
    public static final int IDENTIFIER = 276; //# line 18
    public static final int AND = 277; //# line 18
    public static final int OR = 278; //# line 18
    public static final int STATIC = 279; //# line 18
    public static final int INSTANCEOF = 280; //# line 18
    public static final int LESS_EQUAL = 281; //# line 19
    public static final int GREATER_EQUAL = 282; //# line 19
    public static final int EQUAL = 283; //# line 19
    public static final int NOT_EQUAL = 284; //# line 19
    public static final int SCOPY = 285; //# line 22
    public static final int SEALED = 286; //# line 22
    public static final int GUARD = 287; //# line 22
    public static final int VAR = 288; //# line 22
    public static final int ARRAYINIT = 289; //# line 22
    public static final int ARRAYCONCAT = 290; //# line 22
    public static final int DEFAULT = 291; //# line 23
    public static final int IN = 292; //# line 23
    public static final int FOREACH = 293; //# line 23
    public static final int COMPL = 294; //# line 23
    public static final int COMPR = 295; //# line 23
    
    public static final int VariableDef = 296;
    public static final int ExprT5 = 297;
    public static final int BoundVariable = 298;
    public static final int Oper3 = 299;
    public static final int ExprT4A = 300;
    public static final int Oper6 = 301;
    public static final int ExprT4B = 302;
    public static final int VariableList = 303;
    public static final int Formals = 304;
    public static final int Oper7 = 305;
    public static final int IfSubStmt = 306;
    public static final int Expr8 = 307;
    public static final int AfterSimpleTypeExpr = 308;
    public static final int Expr2 = 309;
    public static final int Oper2 = 310;
    public static final int ExprT8A = 311;
    public static final int Expr6 = 312;
    public static final int BreakStmt = 313;
    public static final int ExprT2 = 314;
    public static final int StmtList = 315;
    public static final int Constant = 316;
    public static final int SubVariableList = 317;
    public static final int PrintStmt = 318;
    public static final int ForStmt = 319;
    public static final int Expr9 = 320;
    public static final int Expr1 = 321;
    public static final int ForeachStmt = 322;
    public static final int ArrayConstant = 323;
    public static final int GuardedStmt = 324;
    public static final int Oper1 = 325;
    public static final int ElseClause = 326;
    public static final int FieldList = 327;
    public static final int ArrayConstants = 328;
    public static final int IfBranch = 329;
    public static final int SubExprList = 330;
    public static final int ExprT8B = 331;
    public static final int AfterParenExpr = 332;
    public static final int ClassDef = 333;
    public static final int ReturnStmt = 334;
    public static final int ExprList = 335;
    public static final int StmtBlock = 336;
    public static final int FunctionField = 337;
    public static final int AfterIdentExpr = 338;
    public static final int IfSuffix = 339;
    public static final int Program = 340;
    public static final int Expr = 341;
    public static final int Expr4B = 342;
    public static final int ArraySuffix = 343;
    public static final int Type = 344;
    public static final int Expr5 = 345;
    public static final int AfterNewExpr = 346;
    public static final int Assignment = 347;
    public static final int ExtendsClause = 348;
    public static final int Expr4A = 349;
    public static final int Oper5 = 350;
    public static final int ArrayType = 351;
    public static final int Expr3 = 352;
    public static final int Actuals = 353;
    public static final int Variable = 354;
    public static final int ExprT3 = 355;
    public static final int Stmt = 356;
    public static final int SimpleStmt = 357;
    public static final int SimpleType = 358;
    public static final int WhileStmt = 359;
    public static final int ExprT1 = 360;
    public static final int Expr4 = 361;
    public static final int ExprT4 = 362;
    public static final int ReturnExpr = 363;
    public static final int IfStmt = 364;
    public static final int WhileBoolExpr = 365;
    public static final int OCStmt = 366;
    public static final int IfBoolExpr = 367;
    public static final int ExprT6 = 368;
    public static final int ExprT8 = 369;
    public static final int Expr7 = 370;
    public static final int ClassList = 371;
    public static final int Oper4 = 372;
    public static final int Field = 373;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 296;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "SCOPY", "SEALED",
        "GUARD", "VAR", "ARRAYINIT", "ARRAYCONCAT", "DEFAULT",
        "IN", "FOREACH", "COMPL", "COMPR", "VariableDef",
        "ExprT5", "BoundVariable", "Oper3", "ExprT4A", "Oper6",
        "ExprT4B", "VariableList", "Formals", "Oper7", "IfSubStmt",
        "Expr8", "AfterSimpleTypeExpr", "Expr2", "Oper2", "ExprT8A",
        "Expr6", "BreakStmt", "ExprT2", "StmtList", "Constant",
        "SubVariableList", "PrintStmt", "ForStmt", "Expr9", "Expr1",
        "ForeachStmt", "ArrayConstant", "GuardedStmt", "Oper1", "ElseClause",
        "FieldList", "ArrayConstants", "IfBranch", "SubExprList", "ExprT8B",
        "AfterParenExpr", "ClassDef", "ReturnStmt", "ExprList", "StmtBlock",
        "FunctionField", "AfterIdentExpr", "IfSuffix", "Program", "Expr",
        "Expr4B", "ArraySuffix", "Type", "Expr5", "AfterNewExpr",
        "Assignment", "ExtendsClause", "Expr4A", "Oper5", "ArrayType",
        "Expr3", "Actuals", "Variable", "ExprT3", "Stmt",
        "SimpleStmt", "SimpleType", "WhileStmt", "ExprT1", "Expr4",
        "ExprT4", "ReturnExpr", "IfStmt", "WhileBoolExpr", "OCStmt",
        "IfBoolExpr", "ExprT6", "ExprT8", "Expr7", "ClassList",
        "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {VAR, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL},
        {ARRAYCONCAT, LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {ARRAYINIT, LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {GUARD, Integer.valueOf('}')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), COMPL, Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {AND},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT, DEFAULT},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {BREAK},
        {AND, Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {FOR},
        {LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {FOREACH},
        {Integer.valueOf('[')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), COMPL, Integer.valueOf('['), READ_INTEGER, Integer.valueOf('}')},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('['), Integer.valueOf(']')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), COMPL, Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), Integer.valueOf(':')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), COMPL, Integer.valueOf('['), READ_INTEGER, CLASS},
        {CLASS, SEALED},
        {RETURN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), COMPL, Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('('), Integer.valueOf('{')},
        {CLASS, SEALED},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, COMPL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), COMPL, Integer.valueOf('['), READ_INTEGER, Integer.valueOf(')')},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{'), SCOPY, FOREACH},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), COMPL, Integer.valueOf('['), READ_INTEGER, Integer.valueOf(';'), Integer.valueOf(')'), VAR},
        {INT, VOID, BOOL, STRING, CLASS},
        {WHILE},
        {OR, Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), COMPR, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), FOR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), COMPL, Integer.valueOf('['), READ_INTEGER, Integer.valueOf(';')},
        {IF},
        {WHILE, Integer.valueOf(')')},
        {SCOPY},
        {IF, COMPR},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('-'), Integer.valueOf('!'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {CLASS, SEALED, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 296);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {IN},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, IF, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), COMPR, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('}')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('}')},
        {Integer.valueOf(']')},
        {GUARD, Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {CLASS, SEALED, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {eof, eos},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), COMPR, IF, Integer.valueOf(';')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(']')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('.'), Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';'), Integer.valueOf(','), IN, Integer.valueOf(')')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), Integer.valueOf(')'), Integer.valueOf(','), WHILE, Integer.valueOf('='), COMPR, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, COMPR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), COMPL, Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {COMPR},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, ARRAYCONCAT, GREATER_EQUAL, Integer.valueOf('-'), Integer.valueOf(':'), EQUAL, Integer.valueOf(')'), NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), OR, Integer.valueOf('+'), COMPR, AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%'), ARRAYINIT},
        {eof, eos},
        {Integer.valueOf('!'), Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 296);
    }
    
    public Table() {
        for (int i = 0; i < 78; i++) {
            begin.add(new HashSet<>(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet<>(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Map.Entry<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 48
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(0, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 606
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(1, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case COMPR:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 259
            case BoundVariable: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(3, Arrays.asList(VAR, IDENTIFIER));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(4, Arrays.asList(Variable));
                    default: return null;
                }
            }
            //# line 323
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(5, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 548
            case ExprT4A: {
                switch (lookahead) {
                    case ARRAYCONCAT:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(ARRAYCONCAT, Expr4B, ExprT4A));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case COMPR:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 369
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 565
            case ExprT4B: {
                switch (lookahead) {
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList(ARRAYINIT, Expr5, ExprT4B));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case COMPR:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 168
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 158
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList());
                    default: return null;
                }
            }
            //# line 386
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 963
            case IfSubStmt: {
                switch (lookahead) {
                    case GUARD:
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(GUARD, IfBranch, IfSubStmt));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList());
                    default: return null;
                }
            }
            //# line 662
            case Expr8: {
                switch (lookahead) {
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(21, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 819
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case COMPL:
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(23, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 448
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 316
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 742
            case ExprT8A: {
                switch (lookahead) {
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case COMPR:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(26, Arrays.asList(ExprT8));
                    case DEFAULT:
                        return new AbstractMap.SimpleEntry<>(27, Arrays.asList(DEFAULT, Expr9));
                    default: return null;
                }
            }
            //# line 623
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(28, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 928
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(29, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 460
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(30, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case FOR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case COMPR:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 195
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case COMPL:
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(32, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 843
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList(LITERAL));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(35, Arrays.asList(NULL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(ArrayConstant));
                    default: return null;
                }
            }
            //# line 178
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(37, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1002
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(39, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 922
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 763
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(41, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(42, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(43, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(44, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(46, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(48, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    default: return null;
                }
            }
            //# line 419
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 253
            case ForeachStmt: {
                switch (lookahead) {
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList(FOREACH, Integer.valueOf('('), BoundVariable, IN, Expr, WhileBoolExpr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 857
            case ArrayConstant: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(51, Arrays.asList(Integer.valueOf('['), ArrayConstants, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 950
            case GuardedStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case COMPL:
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(IfBranch, IfSubStmt));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList());
                    default: return null;
                }
            }
            //# line 309
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 982
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case '}':
                    case GUARD:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case COMPL:
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 118
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(58, Arrays.asList());
                    default: return null;
                }
            }
            //# line 863
            case ArrayConstants: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(59, Arrays.asList(Constant, ArraySuffix));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(60, Arrays.asList());
                    default: return null;
                }
            }
            //# line 974
            case IfBranch: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case COMPL:
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(61, Arrays.asList(Expr, Integer.valueOf(':'), Stmt));
                    default: return null;
                }
            }
            //# line 903
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList());
                    default: return null;
                }
            }
            //# line 728
            case ExprT8B: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(64, Arrays.asList(Integer.valueOf(']'), ExprT8A));
                    case ':':
                        return new AbstractMap.SimpleEntry<>(65, Arrays.asList(Integer.valueOf(':'), Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 831
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case COMPL:
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(66, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 101
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(68, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList(SEALED, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 989
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 895
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case COMPL:
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 189
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 150
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(73, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 756
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(75, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '.':
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case COMPR:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 940
            case IfSuffix: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(77, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(78, Arrays.asList(Integer.valueOf('{'), GuardedStmt, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 26
            case Program: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 399
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(80, Arrays.asList(Expr1));
                    case COMPL:
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList(COMPL, Expr, FOR, IDENTIFIER, IN, Expr, IfBoolExpr, COMPR));
                    default: return null;
                }
            }
            //# line 582
            case Expr4B: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(82, Arrays.asList(Expr5, ExprT4B));
                    default: return null;
                }
            }
            //# line 874
            case ArraySuffix: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(83, Arrays.asList(Integer.valueOf(','), Constant, ArraySuffix));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(84, Arrays.asList());
                    default: return null;
                }
            }
            //# line 82
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(85, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 594
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(86, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 805
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(87, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(88, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 300
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(89, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 111
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(91, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 535
            case Expr4A: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(93, Arrays.asList(Expr4B, ExprT4A));
                    default: return null;
                }
            }
            //# line 357
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(95, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 91
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(96, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(97, Arrays.asList());
                    default: return null;
                }
            }
            //# line 477
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(98, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 885
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case COMPL:
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(100, Arrays.asList());
                    default: return null;
                }
            }
            //# line 54
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 489
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(102, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case FOR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case COMPR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 203
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(104, Arrays.asList(VariableDef));
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case COMPL:
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(106, Arrays.asList(IfStmt));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(107, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(109, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(110, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(111, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(112, Arrays.asList(StmtBlock));
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(OCStmt, Integer.valueOf(';')));
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(114, Arrays.asList(ForeachStmt));
                    default: return null;
                }
            }
            //# line 285
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case COMPL:
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(Expr, Assignment));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(117, Arrays.asList(VAR, IDENTIFIER, Integer.valueOf('='), Expr));
                    default: return null;
                }
            }
            //# line 60
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(118, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(119, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(120, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(121, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(122, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 916
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(123, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 431
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(124, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case FOR:
                    case ':':
                    case ')':
                    case ',':
                    case WHILE:
                    case '=':
                    case COMPR:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 506
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(126, Arrays.asList(Expr4A, ExprT4));
                    default: return null;
                }
            }
            //# line 518
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(127, Arrays.asList(Oper4, Expr5, ExprT4));
                    case ']':
                    case FOR:
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case COMPR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 995
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case COMPL:
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(129, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 934
            case IfStmt: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList(IF, IfSuffix));
                    default: return null;
                }
            }
            //# line 269
            case WhileBoolExpr: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(132, Arrays.asList(WHILE, Expr));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(133, Arrays.asList());
                    default: return null;
                }
            }
            //# line 279
            case OCStmt: {
                switch (lookahead) {
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(134, Arrays.asList(SCOPY, Integer.valueOf('('), IDENTIFIER, Integer.valueOf(','), Expr, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 409
            case IfBoolExpr: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(135, Arrays.asList(IF, Expr));
                    case COMPR:
                        return new AbstractMap.SimpleEntry<>(136, Arrays.asList());
                    default: return null;
                }
            }
            //# line 635
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(137, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case COMPR:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 692
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList(Integer.valueOf('['), Expr, ExprT8B));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(140, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case ARRAYCONCAT:
                    case GREATER_EQUAL:
                    case '-':
                    case ':':
                    case EQUAL:
                    case ')':
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case OR:
                    case '+':
                    case COMPR:
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                    case ARRAYINIT:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 652
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(Oper7, Expr8));
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(143, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 37
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(144, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(145, Arrays.asList());
                    default: return null;
                }
            }
            //# line 335
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(147, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(148, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 134
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(151, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 49
                params[0].vdef = params[1].vdef;
                return;
            }
            case 1: {
                //# line 607
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 2: {
                /* no action */
                return;
            }
            case 3: {
                //# line 260
                params[0].stmt = new Tree.ArrayVar(params[2].ident, params[1].loc);
                return;
            }
            case 4: {
                //# line 264
                params[0].stmt = params[1].vdef;
                return;
            }
            case 5: {
                //# line 324
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 6: {
                //# line 329
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 7: {
                //# line 549
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(Tree.ARRAYCONCAT);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 8: {
                /* no action */
                return;
            }
            case 9: {
                //# line 370
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 375
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 380
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 12: {
                //# line 566
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(Tree.ARRAYINIT);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 13: {
                /* no action */
                return;
            }
            case 14: {
                //# line 169
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 15: {
                //# line 159
                params[0].vlist = params[1].vlist;
                return;
            }
            case 16: {
                //# line 163
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 17: {
                //# line 387
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 18: {
                //# line 392
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 19: {
                //# line 964
                params[0].slist = params[3].slist;
                params[0].slist.add(0, params[2].stmt);
                return;
            }
            case 20: {
                //# line 969
                params[0] = new SemValue();
                return;
            }
            case 21: {
                //# line 663
                if(params[2].tag == 0) {  /* primitive way */
                    params[0].expr = params[1].expr;
                    params[0].loc = params[1].loc;
                    if (params[2].vec != null) {
                        for (SemValue v : params[2].vec) {
                            if (v.expr != null) {
                                params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                            } else if (v.elist != null) {
                                params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                                params[0].loc = v.loc;
                            } else {
                                params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                                params[0].loc = v.loc;
                            }
                        }
                    }
                } else if(params[2].tag == 1) {  /*  default format  */
                    params[0].expr = new Tree.Ternary(Tree.ARRAYDEFAULT, params[1].expr, params[2].expr, params[2].expr1, params[1].loc);
                } else {  /*  subarray  */
                    params[0].expr = new Tree.Binary(Tree.ARRAYREF, params[1].expr, params[2].expr, params[1].loc);
                    /* params[0].expr = new SubArray(params[1].expr, params[2].expr, params[2].expr1, params[1].loc); */
                }
                return;
            }
            case 22: {
                //# line 820
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 23: {
                //# line 825
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 24: {
                //# line 449
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 25: {
                //# line 317
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 26: {
                //# line 743
                params[0] = new SemValue();
                params[0].vec = params[1].vec;
                params[0].tag = 0;
                return;
            }
            case 27: {
                //# line 749
                params[0] = new SemValue();
                params[0].tag = 1;
                params[0].expr = params[2].expr;
                return;
            }
            case 28: {
                //# line 624
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 29: {
                //# line 929
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 30: {
                //# line 461
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 31: {
                /* no action */
                return;
            }
            case 32: {
                //# line 196
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 33: {
                /* no action */
                return;
            }
            case 34: {
                //# line 844
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 35: {
                //# line 848
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 36: {
                //# line 852
                params[0].expr = params[1].expr;
                return;
            }
            case 37: {
                //# line 179
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 38: {
                /* no action */
                return;
            }
            case 39: {
                //# line 1003
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 40: {
                //# line 923
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 41: {
                //# line 764
                params[0].expr = params[1].expr;
                return;
            }
            case 42: {
                //# line 768
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 43: {
                //# line 772
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 44: {
                //# line 776
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 45: {
                //# line 780
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 46: {
                //# line 788
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 47: {
                //# line 792
                params[0].expr = params[2].expr;
                return;
            }
            case 48: {
                //# line 796
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 49: {
                //# line 420
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 50: {
                //# line 254
                params[0].stmt = new Tree.ArrayForeach(params[3].stmt, params[5].expr, params[6].expr, params[8].stmt, params[1].loc);
                return;
            }
            case 51: {
                //# line 858
                params[0].expr = new Tree.Literal(Tree.ARRAYCONSTANT, params[2].elist, params[1].loc);
                return;
            }
            case 52: {
                //# line 951
                params[2].slist.add(0, params[1].stmt);
                params[0].stmt = new Tree.Guarded(params[2].slist, params[1].loc);
                return;
            }
            case 53: {
                //# line 956
                params[0].stmt = new Tree.Guarded(new ArrayList<Tree>(), params[0].loc);
                return;
            }
            case 54: {
                //# line 310
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 55: {
                //# line 983
                params[0].stmt = params[2].stmt;
                return;
            }
            case 56: {
                /* no action */
                return;
            }
            case 57: {
                //# line 119
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 58: {
                //# line 129
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 59: {
                //# line 864
                params[2].elist.add(0, params[1].expr);
                params[0].elist = params[2].elist;
                return;
            }
            case 60: {
                //# line 869
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 61: {
                //# line 975
                params[0].stmt = new Tree.IfBranch(params[1].expr, params[3].stmt, params[1].loc);
                return;
            }
            case 62: {
                //# line 904
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 63: {
                //# line 910
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 64: {
                //# line 729
                params[0] = new SemValue();
                params[0].tag = params[2].tag;
                params[0].vec = params[2].vec;
                params[0].expr = params[2].expr;
                return;
            }
            case 65: {
                //# line 736
                params[0].tag = 2;
                params[0].expr = params[2].expr;
                return;
            }
            case 66: {
                //# line 832
                params[0].expr = params[1].expr;
                return;
            }
            case 67: {
                //# line 836
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 68: {
                //# line 102
                params[0].cdef = new Tree.ClassDef(params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 69: {
                //# line 106
                params[0].cdef = new Tree.SealedClassDef(params[3].ident, params[4].ident, params[6].flist, params[2].loc);
                return;
            }
            case 70: {
                //# line 990
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 71: {
                //# line 896
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 72: {
                //# line 190
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 73: {
                //# line 151
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 74: {
                /* no action */
                return;
            }
            case 75: {
                //# line 757
                params[0].elist = params[2].elist;
                return;
            }
            case 76: {
                /* no action */
                return;
            }
            case 77: {
                //# line 941
                params[0].stmt = new Tree.If(params[2].expr, params[4].stmt, params[5].stmt, params[1].loc);
                return;
            }
            case 78: {
                //# line 945
                params[0].stmt = params[2].stmt;
                return;
            }
            case 79: {
                //# line 27
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 80: {
                //# line 400
                params[0].expr = params[1].expr;
                return;
            }
            case 81: {
                //# line 404
                params[0].expr = new Tree.ArrayComp(params[2].expr, params[4].ident, params[6].expr, params[7].expr, params[1].loc);
                return;
            }
            case 82: {
                //# line 583
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 83: {
                //# line 875
                params[3].elist.add(0, params[2].expr);
                params[0].elist = params[3].elist;
                return;
            }
            case 84: {
                //# line 880
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 85: {
                //# line 83
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 86: {
                //# line 595
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 87: {
                //# line 806
                params[0].ident = params[1].ident;
                return;
            }
            case 88: {
                //# line 810
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 89: {
                //# line 301
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 90: {
                /* no action */
                return;
            }
            case 91: {
                //# line 112
                params[0].ident = params[2].ident;
                return;
            }
            case 92: {
                /* no action */
                return;
            }
            case 93: {
                //# line 536
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    params[0].expr = params[2].evec.get(params[2].evec.size() - 1);
                    for(int i = params[2].evec.size() - 1; i > 0; i--) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(0), params[2].evec.get(i - 1), params[2].evec.get(i), params[2].lvec.get(i - 1));
                    }
                    params[0].expr = new Tree.Binary(params[2].svec.get(0), params[1].expr, params[0].expr, params[1].loc);
                }
                return;
            }
            case 94: {
                //# line 358
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 95: {
                //# line 363
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 96: {
                //# line 92
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 97: {
                //# line 96
                params[0].counter = 0;
                return;
            }
            case 98: {
                //# line 478
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 99: {
                //# line 886
                params[0].elist = params[1].elist;
                return;
            }
            case 100: {
                //# line 890
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 101: {
                //# line 55
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 102: {
                //# line 490
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 103: {
                /* no action */
                return;
            }
            case 104: {
                //# line 204
                params[0].stmt = params[1].vdef;
                return;
            }
            case 105: {
                //# line 208
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 106: {
                //# line 216
                params[0].stmt = params[1].stmt;
                return;
            }
            case 107: {
                //# line 220
                params[0].stmt = params[1].stmt;
                return;
            }
            case 108: {
                //# line 224
                params[0].stmt = params[1].stmt;
                return;
            }
            case 109: {
                //# line 228
                params[0].stmt = params[1].stmt;
                return;
            }
            case 110: {
                //# line 232
                params[0].stmt = params[1].stmt;
                return;
            }
            case 111: {
                //# line 236
                params[0].stmt = params[1].stmt;
                return;
            }
            case 112: {
                //# line 240
                params[0].stmt = params[1].stmt;
                return;
            }
            case 113: {
                //# line 244
                params[0].stmt = params[1].stmt;
                return;
            }
            case 114: {
                //# line 248
                params[0].stmt = params[1].stmt;
                return;
            }
            case 115: {
                //# line 286
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 116: {
                /* no action */
                return;
            }
            case 117: {
                //# line 295
                params[0].stmt = new Tree.Var(params[2].ident, params[4].expr, params[1].loc);
                return;
            }
            case 118: {
                //# line 61
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 119: {
                //# line 65
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 120: {
                //# line 69
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 121: {
                //# line 73
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 122: {
                //# line 77
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 123: {
                //# line 917
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 124: {
                //# line 432
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 125: {
                /* no action */
                return;
            }
            case 126: {
                //# line 507
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 127: {
                //# line 519
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 128: {
                /* no action */
                return;
            }
            case 129: {
                //# line 996
                params[0].expr = params[1].expr;
                return;
            }
            case 130: {
                /* no action */
                return;
            }
            case 131: {
                //# line 935
                params[0].stmt = params[2].stmt;
                return;
            }
            case 132: {
                //# line 270
                params[0].expr = params[2].expr;
                return;
            }
            case 133: {
                //# line 274
                params[0] = new SemValue();
                return;
            }
            case 134: {
                //# line 280
                params[0].stmt = new Tree.Scopy(params[3].ident, params[5].expr, params[1].loc);
                return;
            }
            case 135: {
                //# line 410
                params[0].expr = params[2].expr;
                return;
            }
            case 136: {
                //# line 414
                params[0] = new SemValue();
                return;
            }
            case 137: {
                //# line 636
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 138: {
                /* no action */
                return;
            }
            case 139: {
                //# line 693
                if(params[3].tag == 0) {
                    SemValue sem = new SemValue();
                    sem.expr = params[2].expr;
                    params[0].tag = params[3].tag;
                    params[0].vec = new Vector<SemValue>();
                    params[0].vec.add(sem);
                    if (params[3].vec != null) {
                        params[0].vec.addAll(params[3].vec);
                    }
                } else if(params[3].tag == 1) {
                    params[0] = new SemValue();
                    params[0].tag = 1;
                    params[0].expr = params[2].expr;
                    params[0].expr1 = params[3].expr;
                } else {
                    params[0].tag = 2;
                    params[0].expr = new Tree.Binary(Tree.ARRAYRANGE, params[2].expr, params[3].expr, params[1].loc);
                }
                return;
            }
            case 140: {
                //# line 714
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 141: {
                /* no action */
                return;
            }
            case 142: {
                //# line 653
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 143: {
                //# line 657
                params[0].expr = params[1].expr;
                return;
            }
            case 144: {
                //# line 38
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 145: {
                /* no action */
                return;
            }
            case 146: {
                //# line 336
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 147: {
                //# line 341
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 148: {
                //# line 346
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 149: {
                //# line 351
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 150: {
                //# line 135
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 151: {
                //# line 140
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
