package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

public final class RuleTransition extends Transition {
   public final int ruleIndex;
   public final int precedence;
   public ATNState followState;

   public RuleTransition(RuleStartState var1, int var2, int var3, ATNState var4) {
      super(var1);
      this.ruleIndex = var2;
      this.precedence = var3;
      this.followState = var4;
   }

   @Override
   public int getSerializationType() {
      return 3;
   }

   @Override
   public boolean isEpsilon() {
      return true;
   }

   @Override
   public boolean matches(int var1, int var2, int var3) {
      return false;
   }
}
