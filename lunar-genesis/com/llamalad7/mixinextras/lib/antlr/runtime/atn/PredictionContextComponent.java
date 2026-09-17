package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import java.util.Arrays;

public class ArrayPredictionContext extends PredictionContext {
   public final PredictionContext[] parents;
   public final int[] returnStates;

   public ArrayPredictionContext(SingletonPredictionContext var1) {
      this(new PredictionContext[]{var1.parent}, new int[]{var1.returnState});
   }

   public ArrayPredictionContext(PredictionContext[] var1, int[] var2) {
      super(calculateHashCode(var1, var2));
      assert var1 != null && var1.length > 0;
      assert var2 != null && var2.length > 0;
      this.parents = var1;
      this.returnStates = var2;
   }

   @Override
   public boolean isEmpty() {
      return this.returnStates[0] == Integer.MAX_VALUE;
   }

   @Override
   public int size() {
      return this.returnStates.length;
   }

   @Override
   public PredictionContext getParent(int var1) {
      return this.parents[var1];
   }

   @Override
   public int getReturnState(int var1) {
      return this.returnStates[var1];
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof ArrayPredictionContext)) {
         return false;
      }

      if (this.hashCode() != var1.hashCode()) {
         return false;
      }

      ArrayPredictionContext var2 = (ArrayPredictionContext)var1;
      return Arrays.equals(this.returnStates, var2.returnStates) && Arrays.equals(this.parents, var2.parents);
   }

   @Override
   public String toString() {
      if (this.isEmpty()) {
         return "[]";
      }

      StringBuilder var1 = new StringBuilder();
      var1.append("[");

      for (int var2 = 0; var2 < this.returnStates.length; var2++) {
         if (var2 > 0) {
            var1.append(", ");
         }

         if (this.returnStates[var2] == Integer.MAX_VALUE) {
            var1.append("$");
         } else {
            var1.append(this.returnStates[var2]);
            if (this.parents[var2] != null) {
               var1.append(' ');
               var1.append(this.parents[var2].toString());
            } else {
               var1.append("null");
            }
         }
      }

      var1.append("]");
      return var1.toString();
   }
}
