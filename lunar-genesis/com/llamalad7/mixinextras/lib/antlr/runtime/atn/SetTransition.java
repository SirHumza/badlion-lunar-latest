package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;

public class SetTransition extends Transition {
   public final IntervalSet set;

   public SetTransition(ATNState var1, IntervalSet var2) {
      super(var1);
      if (var2 == null) {
         var2 = IntervalSet.of(0);
      }

      this.set = var2;
   }

   @Override
   public int getSerializationType() {
      return 7;
   }

   @Override
   public IntervalSet label() {
      return this.set;
   }

   @Override
   public boolean matches(int var1, int var2, int var3) {
      return this.set.contains(var1);
   }

   @Override
   public String toString() {
      return this.set.toString();
   }
}
