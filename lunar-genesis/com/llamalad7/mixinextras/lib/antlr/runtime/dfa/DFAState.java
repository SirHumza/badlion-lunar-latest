package com.llamalad7.mixinextras.lib.antlr.runtime.dfa;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNConfigSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.LexerActionExecutor;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.SemanticContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;
import java.util.Arrays;

public class DFAState {
   public int stateNumber = -1;
   public ATNConfigSet configs = new ATNConfigSet();
   public DFAState[] edges;
   public boolean isAcceptState = false;
   public int prediction;
   public LexerActionExecutor lexerActionExecutor;
   public boolean requiresFullContext;
   public DFAState.PredPrediction[] predicates;

   public DFAState() {
   }

   public DFAState(ATNConfigSet var1) {
      this.configs = var1;
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize(7);
      var1 = MurmurHash.update(var1, this.configs.hashCode());
      return MurmurHash.finish(var1, 1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof DFAState)) {
         return false;
      }

      DFAState var2 = (DFAState)var1;
      return this.configs.equals(var2.configs);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.stateNumber).append(":").append(this.configs);
      if (this.isAcceptState) {
         var1.append("=>");
         if (this.predicates != null) {
            var1.append(Arrays.toString(this.predicates));
         } else {
            var1.append(this.prediction);
         }
      }

      return var1.toString();
   }

   public static class PredPrediction {
      public SemanticContext pred;
      public int alt;

      public PredPrediction(SemanticContext var1, int var2) {
         this.alt = var2;
         this.pred = var1;
      }

      @Override
      public String toString() {
         return "(" + this.pred + ", " + this.alt + ")";
      }
   }
}
