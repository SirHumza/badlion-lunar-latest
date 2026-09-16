package com.eliotlash.molang.lexer;

import java.util.Locale;

public enum Keyword {
   THIS("this"),
   RETURN("return"),
   LOOP("loop"),
   FOR_EACH("for_each"),
   BREAK("break"),
   CONTINUE("continue"),
   IF("if"),
   ELSE("else"),
   ELSE_IF("elif");

   private final String lexeme;

   Keyword(String var3) {
      this.lexeme = var3;
   }

   public boolean matches(String var1) {
      return this.lexeme.equals(var1.toLowerCase(Locale.ROOT));
   }
}
