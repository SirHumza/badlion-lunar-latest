package com.eliotlash.molang.lexer;

public record Token() {
   private final TokenType tokenType;
   private final String lexeme;

   public Token(TokenType var1, String var2) {
      this.tokenType = var1;
      this.lexeme = var2;
   }
}
