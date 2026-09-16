package com.llamalad7.mixinextras.expression.impl;

public class ExpressionSource {
   public final String expression;
   public final int startIndex;
   public final int endIndex;

   public ExpressionSource(String var1, int var2, int var3) {
      this.expression = var1;
      this.startIndex = var2;
      this.endIndex = var3;
   }

   @Override
   public String toString() {
      return this.expression.substring(this.startIndex, this.endIndex + 1);
   }
}
