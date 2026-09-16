package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;

public final class NotSetTransition extends SetTransition {
   public NotSetTransition(ATNState var1, IntervalSet var2) {
      super(var1, var2);
   }

   @Override
   public int getSerializationType() {
      return 8;
   }

   @Override
   public boolean matches(int var1, int var2, int var3) {
      return var1 >= var2 && var1 <= var3 && !super.matches(var1, var2, var3);
   }

   @Override
   public String toString() {
      return '~' + super.toString();
   }
}
