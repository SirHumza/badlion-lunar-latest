package com.eliotlash.molang;

import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.ast.Stmt;
import com.eliotlash.molang.lexer.Lexer;
import java.util.List;

public class Molang {
   public static List<Stmt> parse(String var0) {
      return new Parser(Lexer.tokenize(var0)).parse();
   }

   public static Stmt parseSingle(String var0) {
      return new Parser(Lexer.tokenize(var0)).parseStatement();
   }

   public static Expr parseExpression(String var0) {
      return new Parser(Lexer.tokenize(var0)).parseExpression();
   }
}
