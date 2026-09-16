package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

public final class EpsilonTransition extends Transition {
   private final int outermostPrecedenceReturn;

   public EpsilonTransition(ATNState var1) {
      this(var1, -1);
   }

   public EpsilonTransition(ATNState var1, int var2) {
      super(var1);
      this.outermostPrecedenceReturn = var2;
   }

   public int outermostPrecedenceReturn() {
      return this.outermostPrecedenceReturn;
   }

   @Override
   public int getSerializationType() {
      return 1;
   }

   @Override
   public boolean isEpsilon() {
      return true;
   }

   @Override
   public boolean matches(int var1, int var2, int var3) {
      return false;
   }

   @Override
   public String toString() {
      return "epsilon";
   }
}
