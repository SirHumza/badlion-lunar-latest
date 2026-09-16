package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;

public final class AtomTransition extends Transition {
   public final int label;

   public AtomTransition(ATNState var1, int var2) {
      super(var1);
      this.label = var2;
   }

   @Override
   public int getSerializationType() {
      return 5;
   }

   @Override
   public IntervalSet label() {
      return IntervalSet.of(this.label);
   }

   @Override
   public boolean matches(int var1, int var2, int var3) {
      return this.label == var1;
   }

   @Override
   public String toString() {
      return String.valueOf(this.label);
   }
}
