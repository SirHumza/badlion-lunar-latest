package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.RuleContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class LL1Analyzer {
   public final ATN atn;

   public LL1Analyzer(ATN var1) {
      this.atn = var1;
   }

   public IntervalSet LOOK(ATNState var1, RuleContext var2) {
      return this.LOOK(var1, null, var2);
   }

   public IntervalSet LOOK(ATNState var1, ATNState var2, RuleContext var3) {
      IntervalSet var4 = new IntervalSet();
      boolean var5 = true;
      PredictionContext var6 = var3 != null ? PredictionContext.fromRuleContext(var1.atn, var3) : null;
      this._LOOK(var1, var2, var6, var4, new HashSet<>(), new BitSet(), var5, true);
      return var4;
   }

   protected void _LOOK(ATNState var1, ATNState var2, PredictionContext var3, IntervalSet var4, Set<ATNConfig> var5, BitSet var6, boolean var7, boolean var8) {
      ATNConfig var9 = new ATNConfig(var1, 0, var3);
      if (var5.add(var9)) {
         if (var1 == var2) {
            if (var3 == null) {
               var4.add(-2);
               return;
            }

            if (var3.isEmpty() && var8) {
               var4.add(-1);
               return;
            }
         }

         if (var1 instanceof RuleStopState) {
            if (var3 == null) {
               var4.add(-2);
               return;
            }

            if (var3.isEmpty() && var8) {
               var4.add(-1);
               return;
            }

            if (var3 != EmptyPredictionContext.Instance) {
               boolean var21 = var6.get(var1.ruleIndex);

               try {
                  var6.clear(var1.ruleIndex);

                  for (int var22 = 0; var22 < var3.size(); var22++) {
                     ATNState var23 = this.atn.states.get(var3.getReturnState(var22));
                     this._LOOK(var23, var2, var3.getParent(var22), var4, var5, var6, var7, var8);
                  }
               } finally {
                  if (var21) {
                     var6.set(var1.ruleIndex);
                  }
               }

               return;
            }
         }

         int var10 = var1.getNumberOfTransitions();

         for (int var11 = 0; var11 < var10; var11++) {
            Transition var12 = var1.transition(var11);
            if (var12.getClass() == RuleTransition.class) {
               if (!var6.get(((RuleTransition)var12).target.ruleIndex)) {
                  SingletonPredictionContext var13 = SingletonPredictionContext.create(var3, ((RuleTransition)var12).followState.stateNumber);

                  try {
                     var6.set(((RuleTransition)var12).target.ruleIndex);
                     this._LOOK(var12.target, var2, var13, var4, var5, var6, var7, var8);
                  } finally {
                     var6.clear(((RuleTransition)var12).target.ruleIndex);
                  }
               }
            } else if (var12 instanceof AbstractPredicateTransition) {
               if (var7) {
                  this._LOOK(var12.target, var2, var3, var4, var5, var6, var7, var8);
               } else {
                  var4.add(0);
               }
            } else if (var12.isEpsilon()) {
               this._LOOK(var12.target, var2, var3, var4, var5, var6, var7, var8);
            } else if (var12.getClass() == WildcardTransition.class) {
               var4.addAll(IntervalSet.of(1, this.atn.maxTokenType));
            } else {
               IntervalSet var24 = var12.label();
               if (var24 != null) {
                  if (var12 instanceof NotSetTransition) {
                     var24 = var24.complement(IntervalSet.of(1, this.atn.maxTokenType));
                  }

                  var4.addAll(var24);
               }
            }
         }
      }
   }
}
