package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.dfa.DFAState;
import java.util.IdentityHashMap;

public abstract class ATNSimulator {
   public static final DFAState ERROR = new DFAState(new ATNConfigSet());
   public final ATN atn;
   protected final PredictionContextCache sharedContextCache;

   public ATNSimulator(ATN var1, PredictionContextCache var2) {
      this.atn = var1;
      this.sharedContextCache = var2;
   }

   public abstract void reset();

   public PredictionContext getCachedContext(PredictionContext var1) {
      if (this.sharedContextCache == null) {
         return var1;
      }

      synchronized (this.sharedContextCache) {
         IdentityHashMap var3 = new IdentityHashMap();
         return PredictionContext.getCachedContext(var1, this.sharedContextCache, var3);
      }
   }

   static {
      ERROR.stateNumber = Integer.MAX_VALUE;
   }
}
