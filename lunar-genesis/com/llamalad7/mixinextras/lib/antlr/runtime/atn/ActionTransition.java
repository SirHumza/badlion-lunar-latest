package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

public final class ActionTransition extends Transition {
   public final int ruleIndex;
   public final int actionIndex;
   public final boolean isCtxDependent;

   public ActionTransition(ATNState var1, int var2, int var3, boolean var4) {
      super(var1);
      this.ruleIndex = var2;
      this.actionIndex = var3;
      this.isCtxDependent = var4;
   }

   @Override
   public int getSerializationType() {
      return 6;
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
      return "action_" + this.ruleIndex + ":" + this.actionIndex;
   }
}
