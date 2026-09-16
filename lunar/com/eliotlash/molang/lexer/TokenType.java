package com.eliotlash.molang.lexer;

public enum TokenType {
   NUMERAL,
   IDENTIFIER,
   STRING,
   NOT,
   EQUALS,
   LESS_THAN,
   GREATER_THAN,
   PLUS,
   MINUS,
   STAR,
   SLASH,
   PERCENT,
   OPEN_PAREN,
   CLOSE_PAREN,
   OPEN_BRACKET,
   CLOSE_BRACKET,
   OPEN_BRACE,
   CLOSE_BRACE,
   COMMA,
   SEMICOLON,
   COLON,
   QUESTION,
   DOT,
   CARET,
   AND,
   OR,
   BANG_EQUAL,
   EQUAL_EQUAL,
   LESS_EQUAL,
   GREATER_EQUAL,
   ARROW,
   COALESCE,
   QUOTE,
   EOF,
   ERROR;

   public boolean isOpenDelim() {
      return switch (this) {
         case OPEN_PAREN, OPEN_BRACKET, OPEN_BRACE -> true;
         default -> false;
      };
   }

   public boolean isCloseDelim() {
      return switch (this) {
         case CLOSE_PAREN, CLOSE_BRACKET, CLOSE_BRACE -> true;
         default -> false;
      };
   }
}
