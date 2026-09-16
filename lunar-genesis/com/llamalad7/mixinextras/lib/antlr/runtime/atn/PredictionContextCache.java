package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import java.util.HashMap;
import java.util.Map;

public class PredictionContextCache {
   protected final Map<PredictionContext, PredictionContext> cache = new HashMap<>();

   public PredictionContext add(PredictionContext var1) {
      if (var1 == EmptyPredictionContext.Instance) {
         return EmptyPredictionContext.Instance;
      }

      PredictionContext var2 = this.cache.get(var1);
      if (var2 != null) {
         return var2;
      }

      this.cache.put(var1, var1);
      return var1;
   }

   public PredictionContext get(PredictionContext var1) {
      return this.cache.get(var1);
   }
}
