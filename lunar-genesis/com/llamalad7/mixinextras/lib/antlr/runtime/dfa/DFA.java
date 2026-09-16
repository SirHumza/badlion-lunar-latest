package com.llamalad7.mixinextras.lib.antlr.runtime.dfa;

import com.llamalad7.mixinextras.lib.antlr.runtime.Vocabulary;
import com.llamalad7.mixinextras.lib.antlr.runtime.VocabularyImpl;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNConfigSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.DecisionState;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.StarLoopEntryState;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DFA {
   public final Map<DFAState, DFAState> states = new HashMap<>();
   public volatile DFAState s0;
   public final int decision;
   public final DecisionState atnStartState;
   private final boolean precedenceDfa;

   public DFA(DecisionState var1, int var2) {
      this.atnStartState = var1;
      this.decision = var2;
      boolean var3 = false;
      if (var1 instanceof StarLoopEntryState && ((StarLoopEntryState)var1).isPrecedenceDecision) {
         var3 = true;
         DFAState var4 = new DFAState(new ATNConfigSet());
         var4.edges = new DFAState[0];
         var4.isAcceptState = false;
         var4.requiresFullContext = false;
         this.s0 = var4;
      }

      this.precedenceDfa = var3;
   }

   public final boolean isPrecedenceDfa() {
      return this.precedenceDfa;
   }

   public final DFAState getPrecedenceStartState(int var1) {
      if (!this.isPrecedenceDfa()) {
         throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
      } else {
         return var1 >= 0 && var1 < this.s0.edges.length ? this.s0.edges[var1] : null;
      }
   }

   public final void setPrecedenceStartState(int var1, DFAState var2) {
      if (!this.isPrecedenceDfa()) {
         throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
      }

      if (var1 >= 0) {
         synchronized (this.s0) {
            if (var1 >= this.s0.edges.length) {
               this.s0.edges = Arrays.copyOf(this.s0.edges, var1 + 1);
            }

            this.s0.edges[var1] = var2;
         }
      }
   }

   public List<DFAState> getStates() {
      ArrayList var1 = new ArrayList<>(this.states.keySet());
      Collections.sort(var1, new Comparator<DFAState>() {
         public int compare(DFAState var1, DFAState var2) {
            return var1.stateNumber - var2.stateNumber;
         }
      });
      return var1;
   }

   @Override
   public String toString() {
      return this.toString(VocabularyImpl.EMPTY_VOCABULARY);
   }

   public String toString(Vocabulary var1) {
      if (this.s0 == null) {
         return "";
      }

      DFASerializer var2 = new DFASerializer(this, var1);
      return var2.toString();
   }
}
