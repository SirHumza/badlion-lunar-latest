package com.llamalad7.mixinextras.lib.semver;

public class ParseException extends RuntimeException {
   public ParseException() {
   }

   public ParseException(String var1) {
      super(var1);
   }

   public ParseException(String var1, UnexpectedCharacterException var2) {
      super(var1);
      this.initCause(var2);
   }

   @Override
   public String toString() {
      Throwable var1 = this.getCause();
      String var2 = this.getMessage();
      if (var2 != null) {
         return var2 + (var1 != null ? " (" + var1 + ")" : "");
      } else {
         return var1 != null ? var1.toString() : "";
      }
   }
}
