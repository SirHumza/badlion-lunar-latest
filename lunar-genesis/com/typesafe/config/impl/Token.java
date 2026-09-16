package com.typesafe.config.impl;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigOrigin;

class Token {
   private final TokenType tokenType;
   private final String debugString;
   private final ConfigOrigin origin;
   private final String tokenText;

   Token(TokenType var1, ConfigOrigin var2) {
      this(var1, var2, null);
   }

   Token(TokenType var1, ConfigOrigin var2, String var3) {
      this(var1, var2, var3, null);
   }

   Token(TokenType var1, ConfigOrigin var2, String var3, String var4) {
      this.tokenType = var1;
      this.origin = var2;
      this.debugString = var4;
      this.tokenText = var3;
   }

   static Token newWithoutOrigin(TokenType var0, String var1, String var2) {
      return new Token(var0, null, var2, var1);
   }

   final TokenType tokenType() {
      return this.tokenType;
   }

   public String tokenText() {
      return this.tokenText;
   }

   final ConfigOrigin origin() {
      if (this.origin == null) {
         throw new ConfigException.BugOrBroken("tried to get origin from token that doesn't have one: " + this);
      } else {
         return this.origin;
      }
   }

   final int lineNumber() {
      return this.origin != null ? this.origin.lineNumber() : -1;
   }

   @Override
   public String toString() {
      return this.debugString != null ? this.debugString : this.tokenType.name();
   }

   protected boolean canEqual(Object var1) {
      return var1 instanceof Token;
   }

   @Override
   public boolean equals(Object var1) {
      return !(var1 instanceof Token) ? false : this.canEqual(var1) && this.tokenType == ((Token)var1).tokenType;
   }

   @Override
   public int hashCode() {
      return this.tokenType.hashCode();
   }
}
