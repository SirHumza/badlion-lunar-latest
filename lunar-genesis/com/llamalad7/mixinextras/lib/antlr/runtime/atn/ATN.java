package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.RuleContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ATN {
   public final List<ATNState> states = new ArrayList<>();
   public final List<DecisionState> decisionToState = new ArrayList<>();
   public RuleStartState[] ruleToStartState;
   public RuleStopState[] ruleToStopState;
   public final Map<String, TokensStartState> modeNameToStartState = new LinkedHashMap<>();
   public final ATNType grammarType;
   public final int maxTokenType;
   public int[] ruleToTokenType;
   public LexerAction[] lexerActions;
   public final List<TokensStartState> modeToStartState = new ArrayList<>();

   public ATN(ATNType var1, int var2) {
      this.grammarType = var1;
      this.maxTokenType = var2;
   }

   public IntervalSet nextTokens(ATNState var1, RuleContext var2) {
      LL1Analyzer var3 = new LL1Analyzer(this);
      return var3.LOOK(var1, var2);
   }

   public IntervalSet nextTokens(ATNState var1) {
      if (var1.nextTokenWithinRule != null) {
         return var1.nextTokenWithinRule;
      }

      var1.nextTokenWithinRule = this.nextTokens(var1, null);
      var1.nextTokenWithinRule.setReadonly(true);
      return var1.nextTokenWithinRule;
   }

   public void addState(ATNState var1) {
      if (var1 != null) {
         var1.atn = this;
         var1.stateNumber = this.states.size();
      }

      this.states.add(var1);
   }

   public int defineDecisionState(DecisionState var1) {
      this.decisionToState.add(var1);
      var1.decision = this.decisionToState.size() - 1;
      return var1.decision;
   }

   public DecisionState getDecisionState(int var1) {
      return !this.decisionToState.isEmpty() ? this.decisionToState.get(var1) : null;
   }

   public int getNumberOfDecisions() {
      return this.decisionToState.size();
   }

   public IntervalSet getExpectedTokens(int var1, RuleContext var2) {
      if (var1 >= 0 && var1 < this.states.size()) {
         RuleContext var3 = var2;
         ATNState var4 = this.states.get(var1);
         IntervalSet var5 = this.nextTokens(var4);
         if (!var5.contains(-2)) {
            return var5;
         }

         IntervalSet var6 = new IntervalSet();
         var6.addAll(var5);
         var6.remove(-2);

         while (var3 != null && var3.invokingState >= 0 && var5.contains(-2)) {
            ATNState var7 = this.states.get(var3.invokingState);
            RuleTransition var8 = (RuleTransition)var7.transition(0);
            var5 = this.nextTokens(var8.followState);
            var6.addAll(var5);
            var6.remove(-2);
            var3 = var3.parent;
         }

         if (var5.contains(-2)) {
            var6.add(-1);
         }

         return var6;
      } else {
         throw new IllegalArgumentException("Invalid state number.");
      }
   }
}
