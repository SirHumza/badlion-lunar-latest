package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNConfigSet;

public class NoViableAltException extends RecognitionException {
   private final ATNConfigSet deadEndConfigs;
   private final Token startToken;

   public NoViableAltException(Parser var1) {
      this(var1, var1.getInputStream(), var1.getCurrentToken(), var1.getCurrentToken(), null, var1._ctx);
   }

   public NoViableAltException(Parser var1, TokenStream var2, Token var3, Token var4, ATNConfigSet var5, ParserRuleContext var6) {
      super(var1, var2, var6);
      this.deadEndConfigs = var5;
      this.startToken = var3;
      this.setOffendingToken(var4);
   }

   public Token getStartToken() {
      return this.startToken;
   }
}
