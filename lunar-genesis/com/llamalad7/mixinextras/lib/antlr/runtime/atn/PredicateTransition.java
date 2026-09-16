package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

public final class PredicateTransition extends AbstractPredicateTransition {
   public final int ruleIndex;
   public final int predIndex;
   public final boolean isCtxDependent;

   public PredicateTransition(ATNState var1, int var2, int var3, boolean var4) {
      super(var1);
      this.ruleIndex = var2;
      this.predIndex = var3;
      this.isCtxDependent = var4;
   }

   @Override
   public int getSerializationType() {
      return 4;
   }

   @Override
   public boolean isEpsilon() {
      return true;
   }

   @Override
   public boolean matches(int var1, int var2, int var3) {
      return false;
   }

   public SemanticContext.Predicate getPredicate() {
      return new SemanticContext.Predicate(this.ruleIndex, this.predIndex, this.isCtxDependent);
   }

   @Override
   public String toString() {
      return "pred_" + this.ruleIndex + ":" + this.predIndex;
   }
}
