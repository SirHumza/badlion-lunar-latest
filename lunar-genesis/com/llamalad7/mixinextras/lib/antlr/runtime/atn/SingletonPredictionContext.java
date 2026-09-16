package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

public class SingletonPredictionContext extends PredictionContext {
   public final PredictionContext parent;
   public final int returnState;

   SingletonPredictionContext(PredictionContext var1, int var2) {
      super(var1 != null ? calculateHashCode(var1, var2) : calculateEmptyHashCode());
      assert var2 != -1;
      this.parent = var1;
      this.returnState = var2;
   }

   public static SingletonPredictionContext create(PredictionContext var0, int var1) {
      return var1 == Integer.MAX_VALUE && var0 == null ? EmptyPredictionContext.Instance : new SingletonPredictionContext(var0, var1);
   }

   @Override
   public int size() {
      return 1;
   }

   @Override
   public PredictionContext getParent(int var1) {
      assert var1 == 0;
      return this.parent;
   }

   @Override
   public int getReturnState(int var1) {
      assert var1 == 0;
      return this.returnState;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof SingletonPredictionContext)) {
         return false;
      }

      if (this.hashCode() != var1.hashCode()) {
         return false;
      }

      SingletonPredictionContext var2 = (SingletonPredictionContext)var1;
      return this.returnState == var2.returnState && this.parent != null && this.parent.equals(var2.parent);
   }

   @Override
   public String toString() {
      String var1 = this.parent != null ? this.parent.toString() : "";
      if (var1.length() == 0) {
         return this.returnState == Integer.MAX_VALUE ? "$" : String.valueOf(this.returnState);
      } else {
         return this.returnState + " " + var1;
      }
   }
}
