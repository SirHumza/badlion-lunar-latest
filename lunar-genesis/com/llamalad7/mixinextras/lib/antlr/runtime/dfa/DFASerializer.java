package com.llamalad7.mixinextras.lib.antlr.runtime.dfa;

import com.llamalad7.mixinextras.lib.antlr.runtime.Vocabulary;
import java.util.Arrays;

public class DFASerializer {
   private final DFA dfa;
   private final Vocabulary vocabulary;

   public DFASerializer(DFA var1, Vocabulary var2) {
      this.dfa = var1;
      this.vocabulary = var2;
   }

   @Override
   public String toString() {
      if (this.dfa.s0 == null) {
         return null;
      }

      StringBuilder var1 = new StringBuilder();

      for (DFAState var4 : this.dfa.getStates()) {
         int var5 = 0;
         if (var4.edges != null) {
            var5 = var4.edges.length;
         }

         for (int var6 = 0; var6 < var5; var6++) {
            DFAState var7 = var4.edges[var6];
            if (var7 != null && var7.stateNumber != Integer.MAX_VALUE) {
               var1.append(this.getStateString(var4));
               String var8 = this.getEdgeLabel(var6);
               var1.append("-").append(var8).append("->").append(this.getStateString(var7)).append('\n');
            }
         }
      }

      String var9 = var1.toString();
      return var9.length() == 0 ? null : var9;
   }

   protected String getEdgeLabel(int var1) {
      return this.vocabulary.getDisplayName(var1 - 1);
   }

   protected String getStateString(DFAState var1) {
      int var2 = var1.stateNumber;
      String var3 = (var1.isAcceptState ? ":" : "") + "s" + var2 + (var1.requiresFullContext ? "^" : "");
      if (var1.isAcceptState) {
         return var1.predicates != null ? var3 + "=>" + Arrays.toString(var1.predicates) : var3 + "=>" + var1.prediction;
      } else {
         return var3;
      }
   }
}
