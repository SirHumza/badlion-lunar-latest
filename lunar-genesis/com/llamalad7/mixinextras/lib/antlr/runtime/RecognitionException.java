package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;

public class RecognitionException extends RuntimeException {
   private final Recognizer<?, ?> recognizer;
   private final RuleContext ctx;
   private final IntStream input;
   private Token offendingToken;
   private int offendingState = -1;

   public RecognitionException(Recognizer<?, ?> var1, IntStream var2, ParserRuleContext var3) {
      this.recognizer = var1;
      this.input = var2;
      this.ctx = var3;
      if (var1 != null) {
         this.offendingState = var1.getState();
      }
   }

   public RecognitionException(String var1, Recognizer<?, ?> var2, IntStream var3, ParserRuleContext var4) {
      super(var1);
      this.recognizer = var2;
      this.input = var3;
      this.ctx = var4;
      if (var2 != null) {
         this.offendingState = var2.getState();
      }
   }

   protected final void setOffendingState(int var1) {
      this.offendingState = var1;
   }

   public IntervalSet getExpectedTokens() {
      return this.recognizer != null ? this.recognizer.getATN().getExpectedTokens(this.offendingState, this.ctx) : null;
   }

   public IntStream getInputStream() {
      return this.input;
   }

   public Token getOffendingToken() {
      return this.offendingToken;
   }

   protected final void setOffendingToken(Token var1) {
      this.offendingToken = var1;
   }
}
