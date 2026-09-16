package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

public final class WildcardTransition extends Transition {
   public WildcardTransition(ATNState var1) {
      super(var1);
   }

   @Override
   public int getSerializationType() {
      return 9;
   }

   @Override
   public boolean matches(int var1, int var2, int var3) {
      return var1 >= var2 && var1 <= var3;
   }

   @Override
   public String toString() {
      return ".";
   }
}
