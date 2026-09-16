package com.eliotlash.molang;

import com.eliotlash.molang.lexer.Token;

public class ParseException extends RuntimeException {
   private final Token faulty;

   public ParseException(Token var1, String var2) {
      super(var2);
      this.faulty = var1;
   }

   @Override
   public String getMessage() {
      return super.getMessage() + ": \"" + this.faulty.lexeme() + "\"";
   }
}
