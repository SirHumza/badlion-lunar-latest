package com.eliotlash.molang;

import com.eliotlash.molang.ast.Assignable;
import com.eliotlash.molang.ast.Expr;
import com.eliotlash.molang.ast.Operator;
import com.eliotlash.molang.ast.Stmt;
import com.eliotlash.molang.lexer.Keyword;
import com.eliotlash.molang.lexer.Token;
import com.eliotlash.molang.lexer.TokenType;
import com.eliotlash.molang.utils.ParserUtils;
import java.util.ArrayList;
import java.util.List;

public class Parser {
   private final List<Token> input;
   private int current = 0;
   private final CompileConstants constants = new CompileConstants();

   public Parser(List<Token> var1) {
      this.input = var1;
   }

   public void reset() {
      this.current = 0;
   }

   public Expr parseExpression() {
      Expr var1 = this.expression();
      this.consume(TokenType.EOF, "Expect end of expression");
      return var1;
   }

   public Stmt parseStatement() {
      Stmt var1 = this.statement();
      this.consume(TokenType.EOF, "Expect end of statement");
      return var1;
   }

   public List<Stmt> parse() {
      ArrayList var1 = new ArrayList();

      while (!this.isAtEnd()) {
         var1.add(this.statement());
      }

      ArrayList var2 = var1;
      this.consume(TokenType.EOF, "Expect end of expression.");
      return var2;
   }

   private Stmt statement() {
      if (this.matchKeyword(Keyword.RETURN)) {
         return this.returnStatement();
      } else if (this.matchKeyword(Keyword.BREAK)) {
         return this.breakStatement();
      } else if (this.matchKeyword(Keyword.CONTINUE)) {
         return this.continueStatement();
      } else if (this.matchKeyword(Keyword.LOOP)) {
         return this.loopStatement();
      } else {
         return this.matchKeyword(Keyword.IF) ? this.ifStatement() : this.expressionStatement();
      }
   }

   private Stmt.Expression expressionStatement() {
      Expr var1 = this.expression();
      this.consume(TokenType.SEMICOLON, "Expect ';' after expression");
      return new Stmt.Expression(var1);
   }

   private Stmt breakStatement() {
      this.consume(TokenType.SEMICOLON, "Expect ';' after break statement");
      return new Stmt.Break();
   }

   private Stmt continueStatement() {
      this.consume(TokenType.SEMICOLON, "Expect ';' after continue statement");
      return new Stmt.Continue();
   }

   private Stmt loopStatement() {
      this.consume(TokenType.OPEN_PAREN, "Expect '(' for loop args");
      List var1 = this.arguments();
      if (var1.size() != 2) {
         throw this.error(this.peek(), "Expect 2 arguments for loop");
      }

      this.consume(TokenType.SEMICOLON, "Expect ';' after loop statement");
      Expr var2 = (Expr)var1.get(0);
      Expr var3 = (Expr)var1.get(1);
      return new Stmt.Loop(var2, var3);
   }

   private Stmt ifStatement() {
      this.consume(TokenType.OPEN_PAREN, "Expect '(' after 'if'");
      List var1 = this.arguments();
      if (var1.size() != 1) {
         throw this.error(this.peek(), "Expect condition for if statement");
      }

      Expr var2 = this.expression();
      if (var2 instanceof Expr.Block var3) {
         List var6 = new ArrayList();
         Expr.Block var5 = null;
         if (this.matchKeyword(Keyword.ELSE_IF)) {
            var6 = this.elifStatements();
         }

         if (this.matchKeyword(Keyword.ELSE)) {
            var5 = this.elseStatement();
         }

         return new Stmt.If((Expr)var1.get(0), var3, var6, var5);
      } else {
         throw this.error(this.peek(), "Expect block after if statement");
      }
   }

   private List<Stmt.If> elifStatements() {
      this.consume(TokenType.OPEN_PAREN, "Expect '(' after 'elif'");
      List var1 = this.arguments();
      if (var1.size() != 1) {
         throw this.error(this.peek(), "Expect condition for elif statement");
      }

      Expr var2 = this.expression();
      List var3 = new ArrayList();
      if (var2 instanceof Expr.Block var4) {
         if (this.matchKeyword(Keyword.ELSE_IF)) {
            var3 = this.elifStatements();
         }

         var3.add(0, new Stmt.If((Expr)var1.get(0), var4, new ArrayList<>(), null));
         return var3;
      } else {
         throw this.error(this.peek(), "Expect block after elif statement");
      }
   }

   private Expr.Block elseStatement() {
      Expr var1 = this.expression();
      if (var1 instanceof Expr.Block var2) {
         return var2;
      } else {
         throw this.error(this.peek(), "Expect block after else statement");
      }
   }

   private Stmt returnStatement() {
      Expr var1 = this.expression();
      this.consume(TokenType.SEMICOLON, "Expect ';' after return statement");
      return new Stmt.Return(var1);
   }

   private Expr expression() {
      return this.assignment();
   }

   private Expr assignment() {
      Expr var1 = this.coalesce();
      if (this.match(TokenType.EQUALS)) {
         Token var2 = this.previous();
         Expr var3 = this.assignment();
         if (var1 instanceof Assignable var4) {
            return new Expr.Assignment(var4, var3);
         } else {
            throw this.error(var2, "Invalid assignment target");
         }
      } else {
         return var1;
      }
   }

   private Expr disjunction() {
      Expr var1 = this.conjunction();

      while (this.match(TokenType.OR)) {
         Expr var2 = this.conjunction();
         var1 = new Expr.BinOp(Operator.OR, var1, var2);
      }

      return var1;
   }

   private Expr conjunction() {
      Expr var1 = this.equality();

      while (this.match(TokenType.AND)) {
         Expr var2 = this.equality();
         var1 = new Expr.BinOp(Operator.AND, var1, var2);
      }

      return var1;
   }

   private Expr equality() {
      Expr var1 = this.comparison();

      while (this.match(TokenType.BANG_EQUAL, TokenType.EQUAL_EQUAL)) {
         Token var2 = this.previous();
         Expr var3 = this.comparison();
         var1 = new Expr.BinOp(Operator.from(var2), var1, var3);
      }

      return var1;
   }

   private Expr comparison() {
      Expr var1 = this.term();

      while (this.match(TokenType.GREATER_THAN, TokenType.GREATER_EQUAL, TokenType.LESS_THAN, TokenType.LESS_EQUAL)) {
         Token var2 = this.previous();
         Expr var3 = this.term();
         var1 = new Expr.BinOp(Operator.from(var2), var1, var3);
      }

      return var1;
   }

   private Expr coalesce() {
      Expr var1 = this.ternary();

      while (this.match(TokenType.COALESCE)) {
         Expr var2 = this.ternary();
         var1 = new Expr.Coalesce(var1, var2);
      }

      return var1;
   }

   private Expr term() {
      Expr var1 = this.factor();

      while (this.match(TokenType.MINUS, TokenType.PLUS)) {
         Token var2 = this.previous();
         Expr var3 = this.factor();
         var1 = new Expr.BinOp(Operator.from(var2), var1, var3);
      }

      return var1;
   }

   private Expr factor() {
      Expr var1 = this.exponentiation();

      while (this.match(TokenType.STAR, TokenType.SLASH, TokenType.PERCENT)) {
         Token var2 = this.previous();
         Expr var3 = this.exponentiation();
         var1 = new Expr.BinOp(Operator.from(var2), var1, var3);
      }

      return var1;
   }

   private Expr exponentiation() {
      Expr var1 = this.unary();

      while (this.match(TokenType.CARET)) {
         Token var2 = this.previous();
         Expr var3 = this.unary();
         var1 = new Expr.BinOp(Operator.from(var2), var1, var3);
      }

      return var1;
   }

   private Expr ternary() {
      Expr var1 = this.disjunction();
      if (this.match(TokenType.QUESTION)) {
         Expr var2 = this.expression();
         if (this.match(TokenType.COLON)) {
            Expr var3 = this.expression();
            return new Expr.Ternary(var1, var2, var3);
         } else {
            return new Expr.Conditional(var1, var2);
         }
      } else {
         return var1;
      }
   }

   private Expr unary() {
      if (this.match(TokenType.NOT)) {
         return new Expr.Not(this.unary());
      }

      if (this.match(TokenType.MINUS)) {
         return new Expr.Negate(this.unary());
      }

      Expr var1 = this.access();
      if (this.match(TokenType.ARROW)) {
         Expr var2 = this.expression();
         if (var1 instanceof Expr.Access var3) {
            return new Expr.SwitchContext(var3, var2);
         } else {
            throw this.error(this.previous(), "Arrow operator must be used on an ACCESS target");
         }
      } else {
         return var1;
      }
   }

   private Expr access() {
      Expr var1 = this.primary();
      if (this.match(TokenType.DOT)) {
         Token var2 = this.previous();
         if (var1 instanceof Expr.Variable var3) {
            if (this.match(TokenType.IDENTIFIER)) {
               return this.finishAccess(var3);
            } else {
               throw this.error(var2, "Expect identifier after '.'");
            }
         } else {
            throw this.error(var2, "Invalid access target");
         }
      } else {
         return var1;
      }
   }

   private Expr finishAccess(Expr.Variable var1) {
      Token var2 = this.previous();
      if (this.match(TokenType.OPEN_PAREN)) {
         List var5 = this.arguments();
         return new Expr.Call(var1, var2.lexeme(), var5);
      } else if (this.match(TokenType.DOT)) {
         Expr.Struct var3 = new Expr.Struct(var1, null, new ArrayList<>());
         Expr.Struct var4 = this.finishStruct(var3);
         return new Expr.Access(var4, var4.target().name());
      } else {
         return new Expr.Access(var1, var2.lexeme());
      }
   }

   private Expr.Struct finishStruct(Expr.Struct var1) {
      if (this.match(TokenType.IDENTIFIER)) {
         Expr.Struct var2 = new Expr.Struct(ParserUtils.createVariableFromString(this.previous().lexeme()), var1, new ArrayList<>());
         var1.children().add(var2);
         if (!this.match(TokenType.DOT)) {
            return var2;
         }

         var1 = this.finishStruct(var2);
      }

      return var1;
   }

   private List<Expr> arguments() {
      ArrayList var1 = new ArrayList();
      if (!this.check(TokenType.CLOSE_PAREN)) {
         do {
            var1.add(this.expression());
         } while (this.match(TokenType.COMMA));
      }

      this.consume(TokenType.CLOSE_PAREN, "Expect ')' after arguments");
      return var1;
   }

   private Expr primary() {
      if (this.match(TokenType.OPEN_BRACE)) {
         return this.block();
      }

      if (this.match(TokenType.IDENTIFIER)) {
         String var3 = this.previous().lexeme();
         if (!var3.toLowerCase().equals(var3)) {
            throw this.error(this.previous(), "Variable names must be lowercase");
         }

         Expr var2 = this.constants.get(var3);
         return var2 == null ? ParserUtils.createVariableFromString(var3) : var2;
      } else if (this.match(TokenType.NUMERAL)) {
         return new Expr.Constant(Double.parseDouble(this.previous().lexeme()));
      } else if (this.match(TokenType.STRING)) {
         return new Expr.Str(this.previous().lexeme());
      } else if (this.match(TokenType.OPEN_PAREN)) {
         Expr var1 = this.expression();
         this.consume(TokenType.CLOSE_PAREN, "Expect ')' after expression");
         return new Expr.Group(var1);
      } else {
         throw this.error(this.peek(), "Expect expression");
      }
   }

   private Expr.Block block() {
      ArrayList var1 = new ArrayList();

      while (!this.isAtEnd() && !this.check(TokenType.CLOSE_BRACE)) {
         var1.add(this.statement());
      }

      this.consume(TokenType.CLOSE_BRACE, "Expect '}' after block");
      return new Expr.Block(var1);
   }

   private Token consume(TokenType var1, String var2) {
      if (this.check(var1)) {
         return this.advance();
      } else {
         throw this.error(this.peek(), var2);
      }
   }

   private boolean matchKeyword(Keyword... var1) {
      for (Keyword var5 : var1) {
         if (this.check(TokenType.IDENTIFIER) && var5.matches(this.peek().lexeme())) {
            this.advance();
            return true;
         }
      }

      return false;
   }

   private boolean match(TokenType... var1) {
      for (TokenType var5 : var1) {
         if (this.check(var5)) {
            this.advance();
            return true;
         }
      }

      return false;
   }

   private ParseException error(Token var1, String var2) {
      return new ParseException(var1, var2);
   }

   private boolean isAtEnd() {
      return this.peek().tokenType() == TokenType.EOF;
   }

   private boolean check(TokenType var1) {
      return this.peek().tokenType() == var1;
   }

   private boolean checkNext(TokenType var1) {
      return this.peekNext().tokenType() == var1;
   }

   private Token advance() {
      return this.input.get(this.current++);
   }

   private Token peek() {
      return this.current >= this.input.size() ? this.input.get(this.input.size() - 1) : this.input.get(this.current);
   }

   private Token peekNext() {
      return this.current + 1 >= this.input.size() ? this.input.get(this.input.size() - 1) : this.input.get(this.current + 1);
   }

   private Token previous() {
      return this.input.get(this.current - 1);
   }
}
