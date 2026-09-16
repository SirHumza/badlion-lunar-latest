package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public abstract class ATNState {
   public static final List<String> serializationNames = Collections.unmodifiableList(
      Arrays.asList(
         "INVALID",
         "BASIC",
         "RULE_START",
         "BLOCK_START",
         "PLUS_BLOCK_START",
         "STAR_BLOCK_START",
         "TOKEN_START",
         "RULE_STOP",
         "BLOCK_END",
         "STAR_LOOP_BACK",
         "STAR_LOOP_ENTRY",
         "PLUS_LOOP_BACK",
         "LOOP_END"
      )
   );
   public ATN atn = null;
   public int stateNumber = -1;
   public int ruleIndex;
   public boolean epsilonOnlyTransitions = false;
   protected final List<Transition> transitions = new ArrayList<>(4);
   public IntervalSet nextTokenWithinRule;

   @Override
   public int hashCode() {
      return this.stateNumber;
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof ATNState ? this.stateNumber == ((ATNState)var1).stateNumber : false;
   }

   @Override
   public String toString() {
      return String.valueOf(this.stateNumber);
   }

   public int getNumberOfTransitions() {
      return this.transitions.size();
   }

   public void addTransition(Transition var1) {
      this.addTransition(this.transitions.size(), var1);
   }

   public void addTransition(int var1, Transition var2) {
      if (this.transitions.isEmpty()) {
         this.epsilonOnlyTransitions = var2.isEpsilon();
      } else if (this.epsilonOnlyTransitions != var2.isEpsilon()) {
         System.err.format(Locale.getDefault(), "ATN state %d has both epsilon and non-epsilon transitions.\n", this.stateNumber);
         this.epsilonOnlyTransitions = false;
      }

      boolean var3 = false;

      for (Transition var5 : this.transitions) {
         if (var5.target.stateNumber == var2.target.stateNumber) {
            if (var5.label() != null && var2.label() != null && var5.label().equals(var2.label())) {
               var3 = true;
               break;
            }

            if (var5.isEpsilon() && var2.isEpsilon()) {
               var3 = true;
               break;
            }
         }
      }

      if (!var3) {
         this.transitions.add(var1, var2);
      }
   }

   public Transition transition(int var1) {
      return this.transitions.get(var1);
   }

   public Transition removeTransition(int var1) {
      return this.transitions.remove(var1);
   }

   public abstract int getStateType();

   public final boolean onlyHasEpsilonTransitions() {
      return this.epsilonOnlyTransitions;
   }
}
