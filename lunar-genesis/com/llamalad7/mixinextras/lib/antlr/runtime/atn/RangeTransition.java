package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;

public final class RangeTransition extends Transition {
   public final int from;
   public final int to;

   public RangeTransition(ATNState var1, int var2, int var3) {
      super(var1);
      this.from = var2;
      this.to = var3;
   }

   @Override
   public int getSerializationType() {
      return 2;
   }

   @Override
   public IntervalSet label() {
      return IntervalSet.of(this.from, this.to);
   }

   @Override
   public boolean matches(int var1, int var2, int var3) {
      return var1 >= this.from && var1 <= this.to;
   }

   @Override
   public String toString() {
      return new StringBuilder("'").appendCodePoint(this.from).append("'..'").appendCodePoint(this.to).append("'").toString();
   }
}
