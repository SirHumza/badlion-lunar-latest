package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

public final class PrecedencePredicateTransition extends AbstractPredicateTransition {
   public final int precedence;

   public PrecedencePredicateTransition(ATNState var1, int var2) {
      super(var1);
      this.precedence = var2;
   }

   @Override
   public int getSerializationType() {
      return 10;
   }

   @Override
   public boolean isEpsilon() {
      return true;
   }

   @Override
   public boolean matches(int var1, int var2, int var3) {
      return false;
   }

   public SemanticContext.PrecedencePredicate getPredicate() {
      return new SemanticContext.PrecedencePredicate(this.precedence);
   }

   @Override
   public String toString() {
      return this.precedence + " >= _p";
   }
}
