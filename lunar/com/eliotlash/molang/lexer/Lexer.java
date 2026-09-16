package com.eliotlash.molang.lexer;

import java.util.ArrayList;
import java.util.List;

public class Lexer {
   private final String input;
   private final List<Token> tokens = new ArrayList<>();
   private int startPos;
   private int nextPos = 0;

   public static List<Token> tokenize(String var0) {
      return new Lexer(var0).scanTokens();
   }

   public Lexer(String var1) {
      this.input = var1;
   }

   private boolean hasNextChar() {
      return this.nextPos < this.input.length();
   }

   private char peek() {
      return this.nextPos >= this.input.length() ? '\u0000' : this.input.charAt(this.nextPos);
   }

   private char peekNext() {
      return this.nextPos + 1 >= this.input.length() ? '\u0000' : this.input.charAt(this.nextPos + 1);
   }

   private char advance() {
      return this.input.charAt(this.nextPos++);
   }

   public List<Token> scanTokens() {
      while (this.hasNextChar()) {
         this.startPos = this.nextPos;
         this.scanToken();
      }

      this.tokens.add(new Token(TokenType.EOF, ""));
      return this.tokens;
   }

   private void scanToken() {
      char var1 = this.advance();
      if (Character.isWhitespace(var1)) {
         this.eatWhitespace();
      } else {
         TokenType var2 = this.tryOperator(var1);
         if (var2 != null) {
            if (var2 == TokenType.QUOTE) {
               try {
                  this.eatString();
                  return;
               } catch (Exception var4) {
                  throw new RuntimeException(var4);
               }
            }

            this.setToken(var2);
         } else if (isDigit(var1)) {
            this.eatNumeral();
         } else if (isIdentifierStart(var1)) {
            this.eatIdentifier();
         }
      }
   }

   private void eatString() {
      this.startPos++;

      while (this.hasNextChar() && this.peek() != '\'') {
         this.advance();
      }

      if (this.hasNextChar() && this.peek() == '\'') {
         this.setToken(TokenType.STRING);
         this.advance();
      } else {
         System.out.println(this.peek());
         throw new Exception("string not closed");
      }
   }

   private void eatWhitespace() {
      while (Character.isWhitespace(this.peek())) {
         this.advance();
      }
   }

   private void eatNumeral() {
      while (isDigit(this.peek())) {
         this.advance();
      }

      if (this.peek() == '.' && isDigit(this.peekNext())) {
         this.advance();

         while (isDigit(this.peek())) {
            this.advance();
         }
      }

      this.setToken(TokenType.NUMERAL);
   }

   private void eatIdentifier() {
      while (isIdentifier(this.peek())) {
         this.advance();
      }

      this.setToken(TokenType.IDENTIFIER);
   }

   private TokenType tryOperator(char var1) {
      switch (var1) {
         case '!':
            if (this.match('=')) {
               return TokenType.BANG_EQUAL;
            }

            return TokenType.NOT;
         case '&':
            if (this.match('&')) {
               return TokenType.AND;
            }

            return TokenType.AND;
         case '-':
            if (this.match('>')) {
               return TokenType.ARROW;
            }

            return TokenType.MINUS;
         case '<':
            if (this.match('=')) {
               return TokenType.LESS_EQUAL;
            }

            return TokenType.LESS_THAN;
         case '=':
            if (this.match('=')) {
               return TokenType.EQUAL_EQUAL;
            }

            return TokenType.EQUALS;
         case '>':
            if (this.match('=')) {
               return TokenType.GREATER_EQUAL;
            }

            return TokenType.GREATER_THAN;
         case '?':
            if (this.match('?')) {
               return TokenType.COALESCE;
            }

            return TokenType.QUESTION;
         case '|':
            if (this.match('|')) {
               return TokenType.OR;
            }

            return TokenType.OR;
         default:
            return switch (var1) {
               case '%' -> TokenType.PERCENT;
               case '\'' -> TokenType.QUOTE;
               case '(' -> TokenType.OPEN_PAREN;
               case ')' -> TokenType.CLOSE_PAREN;
               case '*' -> TokenType.STAR;
               case '+' -> TokenType.PLUS;
               case ',' -> TokenType.COMMA;
               case '.' -> TokenType.DOT;
               case '/' -> TokenType.SLASH;
               case ':' -> TokenType.COLON;
               case ';' -> TokenType.SEMICOLON;
               case '[' -> TokenType.OPEN_BRACKET;
               case ']' -> TokenType.CLOSE_BRACKET;
               case '^' -> TokenType.CARET;
               case '{' -> TokenType.OPEN_BRACE;
               case '}' -> TokenType.CLOSE_BRACE;
               default -> null;
            };
      }
   }

   private boolean match(char var1) {
      if (this.hasNextChar() && this.peek() == var1) {
         this.advance();
         return true;
      } else {
         return false;
      }
   }

   private void setToken(TokenType var1) {
      this.tokens.add(new Token(var1, this.input.substring(this.startPos, this.nextPos)));
   }

   private static boolean isIdentifier(char var0) {
      return Character.isAlphabetic(var0) || isDigit(var0) || var0 == '_';
   }

   private static boolean isIdentifierStart(char var0) {
      return Character.isAlphabetic(var0) || var0 == '_';
   }

   private static boolean isDigit(char var0) {
      return var0 >= '0' && var0 <= '9';
   }
}
