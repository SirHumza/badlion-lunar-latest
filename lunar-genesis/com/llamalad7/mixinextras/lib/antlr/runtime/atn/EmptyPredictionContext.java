package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

public class EmptyPredictionContext extends SingletonPredictionContext {
   public static final EmptyPredictionContext Instance = new EmptyPredictionContext();

   private EmptyPredictionContext() {
      super(null, Integer.MAX_VALUE);
   }

   @Override
   public boolean isEmpty() {
      return true;
   }

   @Override
   public int size() {
      return 1;
   }

   @Override
   public PredictionContext getParent(int var1) {
      return null;
   }

   @Override
   public int getReturnState(int var1) {
      return this.returnState;
   }

   @Override
   public boolean equals(Object var1) {
      return this == var1;
   }

   @Override
   public String toString() {
      return "$";
   }
}
