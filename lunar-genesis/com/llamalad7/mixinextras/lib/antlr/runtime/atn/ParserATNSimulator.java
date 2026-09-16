package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.NoViableAltException;
import com.llamalad7.mixinextras.lib.antlr.runtime.Parser;
import com.llamalad7.mixinextras.lib.antlr.runtime.ParserRuleContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.RuleContext;
import com.llamalad7.mixinextras.lib.antlr.runtime.TokenStream;
import com.llamalad7.mixinextras.lib.antlr.runtime.Vocabulary;
import com.llamalad7.mixinextras.lib.antlr.runtime.VocabularyImpl;
import com.llamalad7.mixinextras.lib.antlr.runtime.dfa.DFA;
import com.llamalad7.mixinextras.lib.antlr.runtime.dfa.DFAState;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.DoubleKeyMap;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Interval;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.IntervalSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Pair;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ParserATNSimulator extends ATNSimulator {
   public static boolean debug = false;
   public static boolean trace_atn_sim = false;
   public static boolean dfa_debug = false;
   public static boolean retry_debug = false;
   public static final boolean TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT = Boolean.parseBoolean(getSafeEnv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT"));
   protected final Parser parser;
   public final DFA[] decisionToDFA;
   private PredictionMode mode = PredictionMode.LL;
   protected DoubleKeyMap<PredictionContext, PredictionContext, PredictionContext> mergeCache;
   protected TokenStream _input;
   protected int _startIndex;
   protected ParserRuleContext _outerContext;
   protected DFA _dfa;

   public ParserATNSimulator(Parser var1, ATN var2, DFA[] var3, PredictionContextCache var4) {
      super(var2, var4);
      this.parser = var1;
      this.decisionToDFA = var3;
   }

   @Override
   public void reset() {
   }

   public int adaptivePredict(TokenStream var1, int var2, ParserRuleContext var3) {
      if (debug || trace_atn_sim) {
         System.out
            .println(
               "adaptivePredict decision "
                  + var2
                  + " exec LA(1)=="
                  + this.getLookaheadName(var1)
                  + " line "
                  + var1.LT(1).getLine()
                  + ":"
                  + var1.LT(1).getCharPositionInLine()
            );
      }

      this._input = var1;
      this._startIndex = var1.index();
      this._outerContext = var3;
      DFA var4 = this.decisionToDFA[var2];
      this._dfa = var4;
      int var5 = var1.mark();
      int var6 = this._startIndex;

      try {
         DFAState var7;
         if (var4.isPrecedenceDfa()) {
            var7 = var4.getPrecedenceStartState(this.parser.getPrecedence());
         } else {
            var7 = var4.s0;
         }

         if (var7 == null) {
            if (var3 == null) {
               var3 = ParserRuleContext.EMPTY;
            }

            boolean var8 = false;
            ATNConfigSet var9 = this.computeStartState(var4.atnStartState, ParserRuleContext.EMPTY, var8);
            if (var4.isPrecedenceDfa()) {
               var4.s0.configs = var9;
               var9 = this.applyPrecedenceFilter(var9);
               var7 = this.addDFAState(var4, new DFAState(var9));
               var4.setPrecedenceStartState(this.parser.getPrecedence(), var7);
            } else {
               var7 = this.addDFAState(var4, new DFAState(var9));
               var4.s0 = var7;
            }
         }

         int var13 = this.execATN(var4, var7, var1, var6, var3);
         if (debug) {
            System.out.println("DFA after predictATN: " + var4.toString(this.parser.getVocabulary()));
         }

         return var13;
      } finally {
         this.mergeCache = null;
         this._dfa = null;
         var1.seek(var6);
         var1.release(var5);
      }
   }

   protected int execATN(DFA var1, DFAState var2, TokenStream var3, int var4, ParserRuleContext var5) {
      if (debug || trace_atn_sim) {
         System.out
            .println(
               "execATN decision "
                  + var1.decision
                  + ", DFA state "
                  + var2
                  + ", LA(1)=="
                  + this.getLookaheadName(var3)
                  + " line "
                  + var3.LT(1).getLine()
                  + ":"
                  + var3.LT(1).getCharPositionInLine()
            );
      }

      DFAState var6 = var2;
      int var7 = var3.LA(1);

      while (true) {
         DFAState var8 = this.getExistingTargetState(var6, var7);
         if (var8 == null) {
            var8 = this.computeTargetState(var1, var6, var7);
         }

         if (var8 == ERROR) {
            NoViableAltException var14 = this.noViableAlt(var3, var5, var6.configs, var4);
            var3.seek(var4);
            int var17 = this.getSynValidOrSemInvalidAltThatFinishedDecisionEntryRule(var6.configs, var5);
            if (var17 != 0) {
               return var17;
            }

            throw var14;
         }

         if (var8.requiresFullContext && this.mode != PredictionMode.SLL) {
            BitSet var13 = var8.configs.conflictingAlts;
            if (var8.predicates != null) {
               if (debug) {
                  System.out.println("DFA state has preds in DFA sim LL failover");
               }

               int var15 = var3.index();
               if (var15 != var4) {
                  var3.seek(var4);
               }

               var13 = this.evalSemanticContext(var8.predicates, var5, true);
               if (var13.cardinality() == 1) {
                  if (debug) {
                     System.out.println("Full LL avoided");
                  }

                  return var13.nextSetBit(0);
               }

               if (var15 != var4) {
                  var3.seek(var15);
               }
            }

            if (dfa_debug) {
               System.out.println("ctx sensitive state " + var5 + " in " + var8);
            }

            boolean var16 = true;
            ATNConfigSet var11 = this.computeStartState(var1.atnStartState, var5, var16);
            this.reportAttemptingFullContext(var1, var13, var8.configs, var4, var3.index());
            return this.execATNWithFullContext(var1, var8, var11, var3, var4, var5);
         }

         if (var8.isAcceptState) {
            if (var8.predicates == null) {
               return var8.prediction;
            }

            int var9 = var3.index();
            var3.seek(var4);
            BitSet var10 = this.evalSemanticContext(var8.predicates, var5, true);
            switch (var10.cardinality()) {
               case 0:
                  throw this.noViableAlt(var3, var5, var8.configs, var4);
               case 1:
                  return var10.nextSetBit(0);
               default:
                  this.reportAmbiguity(var1, var8, var4, var9, false, var10, var8.configs);
                  return var10.nextSetBit(0);
            }
         }

         var6 = var8;
         if (var7 != -1) {
            var3.consume();
            var7 = var3.LA(1);
         }
      }
   }

   protected DFAState getExistingTargetState(DFAState var1, int var2) {
      DFAState[] var3 = var1.edges;
      return var3 != null && var2 + 1 >= 0 && var2 + 1 < var3.length ? var3[var2 + 1] : null;
   }

   protected DFAState computeTargetState(DFA var1, DFAState var2, int var3) {
      ATNConfigSet var4 = this.computeReachSet(var2.configs, var3, false);
      if (var4 == null) {
         this.addDFAEdge(var1, var2, var3, ERROR);
         return ERROR;
      }

      DFAState var5 = new DFAState(var4);
      int var6 = getUniqueAlt(var4);
      if (debug) {
         Collection var7 = PredictionMode.getConflictingAltSubsets(var4);
         System.out
            .println(
               "SLL altSubSets="
                  + var7
                  + ", configs="
                  + var4
                  + ", predict="
                  + var6
                  + ", allSubsetsConflict="
                  + PredictionMode.allSubsetsConflict(var7)
                  + ", conflictingAlts="
                  + this.getConflictingAlts(var4)
            );
      }

      if (var6 != 0) {
         var5.isAcceptState = true;
         var5.configs.uniqueAlt = var6;
         var5.prediction = var6;
      } else if (PredictionMode.hasSLLConflictTerminatingPrediction(this.mode, var4)) {
         var5.configs.conflictingAlts = this.getConflictingAlts(var4);
         var5.requiresFullContext = true;
         var5.isAcceptState = true;
         var5.prediction = var5.configs.conflictingAlts.nextSetBit(0);
      }

      if (var5.isAcceptState && var5.configs.hasSemanticContext) {
         this.predicateDFAState(var5, this.atn.getDecisionState(var1.decision));
         if (var5.predicates != null) {
            var5.prediction = 0;
         }
      }

      return this.addDFAEdge(var1, var2, var3, var5);
   }

   protected void predicateDFAState(DFAState var1, DecisionState var2) {
      int var3 = var2.getNumberOfTransitions();
      BitSet var4 = this.getConflictingAltsOrUniqueAlt(var1.configs);
      SemanticContext[] var5 = this.getPredsForAmbigAlts(var4, var1.configs, var3);
      if (var5 != null) {
         var1.predicates = this.getPredicatePredictions(var4, var5);
         var1.prediction = 0;
      } else {
         var1.prediction = var4.nextSetBit(0);
      }
   }

   protected int execATNWithFullContext(DFA var1, DFAState var2, ATNConfigSet var3, TokenStream var4, int var5, ParserRuleContext var6) {
      if (debug || trace_atn_sim) {
         System.out.println("execATNWithFullContext " + var3);
      }

      boolean var7 = true;
      boolean var8 = false;
      ATNConfigSet var9 = null;
      ATNConfigSet var10 = var3;
      var4.seek(var5);
      int var11 = var4.LA(1);

      while (true) {
         var9 = this.computeReachSet(var10, var11, var7);
         if (var9 == null) {
            NoViableAltException var16 = this.noViableAlt(var4, var6, var10, var5);
            var4.seek(var5);
            int var14 = this.getSynValidOrSemInvalidAltThatFinishedDecisionEntryRule(var10, var6);
            if (var14 != 0) {
               return var14;
            }

            throw var16;
         }

         Collection var13 = PredictionMode.getConflictingAltSubsets(var9);
         if (debug) {
            System.out
               .println(
                  "LL altSubSets="
                     + var13
                     + ", predict="
                     + PredictionMode.getUniqueAlt(var13)
                     + ", resolvesToJustOneViableAlt="
                     + PredictionMode.resolvesToJustOneViableAlt(var13)
               );
         }

         var9.uniqueAlt = getUniqueAlt(var9);
         int var12;
         if (var9.uniqueAlt != 0) {
            var12 = var9.uniqueAlt;
         } else {
            label58: {
               if (this.mode != PredictionMode.LL_EXACT_AMBIG_DETECTION) {
                  var12 = PredictionMode.resolvesToJustOneViableAlt(var13);
                  if (var12 != 0) {
                     break label58;
                  }
               } else if (PredictionMode.allSubsetsConflict(var13) && PredictionMode.allSubsetsEqual(var13)) {
                  var8 = true;
                  var12 = PredictionMode.getSingleViableAlt(var13);
                  break label58;
               }

               var10 = var9;
               if (var11 != -1) {
                  var4.consume();
                  var11 = var4.LA(1);
               }
               continue;
            }
         }

         if (var9.uniqueAlt != 0) {
            this.reportContextSensitivity(var1, var12, var9, var5, var4.index());
            return var12;
         }

         this.reportAmbiguity(var1, var2, var5, var4.index(), var8, var9.getAlts(), var9);
         return var12;
      }
   }

   protected ATNConfigSet computeReachSet(ATNConfigSet var1, int var2, boolean var3) {
      if (debug) {
         System.out.println("in computeReachSet, starting closure: " + var1);
      }

      if (this.mergeCache == null) {
         this.mergeCache = new DoubleKeyMap<>();
      }

      ATNConfigSet var4 = new ATNConfigSet(var3);
      ArrayList var5 = null;

      for (ATNConfig var7 : var1) {
         if (debug) {
            System.out.println("testing " + this.getTokenName(var2) + " at " + var7.toString());
         }

         if (var7.state instanceof RuleStopState) {
            assert var7.context.isEmpty();
            if (var3 || var2 == -1) {
               if (var5 == null) {
                  var5 = new ArrayList();
               }

               var5.add(var7);
            }
         } else {
            int var8 = var7.state.getNumberOfTransitions();

            for (int var9 = 0; var9 < var8; var9++) {
               Transition var10 = var7.state.transition(var9);
               ATNState var11 = this.getReachableTarget(var10, var2);
               if (var11 != null) {
                  var4.add(new ATNConfig(var7, var11), this.mergeCache);
               }
            }
         }
      }

      ATNConfigSet var12 = null;
      if (var5 == null && var2 != -1) {
         if (var4.size() == 1) {
            var12 = var4;
         } else if (getUniqueAlt(var4) != 0) {
            var12 = var4;
         }
      }

      if (var12 == null) {
         var12 = new ATNConfigSet(var3);
         HashSet var13 = new HashSet();
         boolean var15 = var2 == -1;

         for (ATNConfig var18 : var4) {
            this.closure(var18, var12, var13, false, var3, var15);
         }
      }

      if (var2 == -1) {
         var12 = this.removeAllConfigsNotInRuleStopState(var12, var12 == var4);
      }

      if (var5 != null && (!var3 || !PredictionMode.hasConfigInRuleStopState(var12))) {
         assert !var5.isEmpty();

         for (ATNConfig var16 : var5) {
            var12.add(var16, this.mergeCache);
         }
      }

      if (trace_atn_sim) {
         System.out.println("computeReachSet " + var1 + " -> " + var12);
      }

      return var12.isEmpty() ? null : var12;
   }

   protected ATNConfigSet removeAllConfigsNotInRuleStopState(ATNConfigSet var1, boolean var2) {
      if (PredictionMode.allConfigsInRuleStopStates(var1)) {
         return var1;
      }

      ATNConfigSet var3 = new ATNConfigSet(var1.fullCtx);

      for (ATNConfig var5 : var1) {
         if (var5.state instanceof RuleStopState) {
            var3.add(var5, this.mergeCache);
         } else if (var2 && var5.state.onlyHasEpsilonTransitions()) {
            IntervalSet var6 = this.atn.nextTokens(var5.state);
            if (var6.contains(-2)) {
               RuleStopState var7 = this.atn.ruleToStopState[var5.state.ruleIndex];
               var3.add(new ATNConfig(var5, var7), this.mergeCache);
            }
         }
      }

      return var3;
   }

   protected ATNConfigSet computeStartState(ATNState var1, RuleContext var2, boolean var3) {
      PredictionContext var4 = PredictionContext.fromRuleContext(this.atn, var2);
      ATNConfigSet var5 = new ATNConfigSet(var3);
      if (trace_atn_sim) {
         System.out.println("computeStartState from ATN state " + var1 + " initialContext=" + var4.toString(this.parser));
      }

      for (int var6 = 0; var6 < var1.getNumberOfTransitions(); var6++) {
         ATNState var7 = var1.transition(var6).target;
         ATNConfig var8 = new ATNConfig(var7, var6 + 1, var4);
         HashSet var9 = new HashSet();
         this.closure(var8, var5, var9, true, var3, false);
      }

      return var5;
   }

   protected ATNConfigSet applyPrecedenceFilter(ATNConfigSet var1) {
      HashMap var2 = new HashMap();
      ATNConfigSet var3 = new ATNConfigSet(var1.fullCtx);

      for (ATNConfig var5 : var1) {
         if (var5.alt == 1) {
            SemanticContext var6 = var5.semanticContext.evalPrecedence(this.parser, this._outerContext);
            if (var6 != null) {
               var2.put(var5.state.stateNumber, var5.context);
               if (var6 != var5.semanticContext) {
                  var3.add(new ATNConfig(var5, var6), this.mergeCache);
               } else {
                  var3.add(var5, this.mergeCache);
               }
            }
         }
      }

      for (ATNConfig var8 : var1) {
         if (var8.alt != 1) {
            if (!var8.isPrecedenceFilterSuppressed()) {
               PredictionContext var9 = (PredictionContext)var2.get(var8.state.stateNumber);
               if (var9 != null && var9.equals(var8.context)) {
                  continue;
               }
            }

            var3.add(var8, this.mergeCache);
         }
      }

      return var3;
   }

   protected ATNState getReachableTarget(Transition var1, int var2) {
      return var1.matches(var2, 0, this.atn.maxTokenType) ? var1.target : null;
   }

   protected SemanticContext[] getPredsForAmbigAlts(BitSet var1, ATNConfigSet var2, int var3) {
      SemanticContext[] var4 = new SemanticContext[var3 + 1];

      for (ATNConfig var6 : var2) {
         if (var1.get(var6.alt)) {
            var4[var6.alt] = SemanticContext.or(var4[var6.alt], var6.semanticContext);
         }
      }

      int var7 = 0;

      for (int var8 = 1; var8 <= var3; var8++) {
         if (var4[var8] == null) {
            var4[var8] = SemanticContext.Empty.Instance;
         } else if (var4[var8] != SemanticContext.Empty.Instance) {
            var7++;
         }
      }

      if (var7 == 0) {
         var4 = null;
      }

      if (debug) {
         System.out.println("getPredsForAmbigAlts result " + Arrays.toString(var4));
      }

      return var4;
   }

   protected DFAState.PredPrediction[] getPredicatePredictions(BitSet var1, SemanticContext[] var2) {
      ArrayList var3 = new ArrayList();
      boolean var4 = false;

      for (int var5 = 1; var5 < var2.length; var5++) {
         SemanticContext var6 = var2[var5];
         assert var6 != null;
         if (var1 != null && var1.get(var5)) {
            var3.add(new DFAState.PredPrediction(var6, var5));
         }

         if (var6 != SemanticContext.Empty.Instance) {
            var4 = true;
         }
      }

      return !var4 ? null : var3.toArray(new DFAState.PredPrediction[0]);
   }

   protected int getSynValidOrSemInvalidAltThatFinishedDecisionEntryRule(ATNConfigSet var1, ParserRuleContext var2) {
      Pair var3 = this.splitAccordingToSemanticValidity(var1, var2);
      ATNConfigSet var4 = (ATNConfigSet)var3.a;
      ATNConfigSet var5 = (ATNConfigSet)var3.b;
      int var6 = this.getAltThatFinishedDecisionEntryRule(var4);
      if (var6 != 0) {
         return var6;
      }

      if (var5.size() > 0) {
         var6 = this.getAltThatFinishedDecisionEntryRule(var5);
         if (var6 != 0) {
            return var6;
         }
      }

      return 0;
   }

   protected int getAltThatFinishedDecisionEntryRule(ATNConfigSet var1) {
      IntervalSet var2 = new IntervalSet();

      for (ATNConfig var4 : var1) {
         if (var4.getOuterContextDepth() > 0 || var4.state instanceof RuleStopState && var4.context.hasEmptyPath()) {
            var2.add(var4.alt);
         }
      }

      return var2.size() == 0 ? 0 : var2.getMinElement();
   }

   protected Pair<ATNConfigSet, ATNConfigSet> splitAccordingToSemanticValidity(ATNConfigSet var1, ParserRuleContext var2) {
      ATNConfigSet var3 = new ATNConfigSet(var1.fullCtx);
      ATNConfigSet var4 = new ATNConfigSet(var1.fullCtx);

      for (ATNConfig var6 : var1) {
         if (var6.semanticContext != SemanticContext.Empty.Instance) {
            boolean var7 = this.evalSemanticContext(var6.semanticContext, var2, var6.alt, var1.fullCtx);
            if (var7) {
               var3.add(var6);
            } else {
               var4.add(var6);
            }
         } else {
            var3.add(var6);
         }
      }

      return new Pair<>(var3, var4);
   }

   protected BitSet evalSemanticContext(DFAState.PredPrediction[] var1, ParserRuleContext var2, boolean var3) {
      BitSet var4 = new BitSet();

      for (DFAState.PredPrediction var8 : var1) {
         if (var8.pred == SemanticContext.Empty.Instance) {
            var4.set(var8.alt);
            if (!var3) {
               break;
            }
         } else {
            boolean var9 = false;
            boolean var10 = this.evalSemanticContext(var8.pred, var2, var8.alt, var9);
            if (debug || dfa_debug) {
               System.out.println("eval pred " + var8 + "=" + var10);
            }

            if (var10) {
               if (debug || dfa_debug) {
                  System.out.println("PREDICT " + var8.alt);
               }

               var4.set(var8.alt);
               if (!var3) {
                  break;
               }
            }
         }
      }

      return var4;
   }

   protected boolean evalSemanticContext(SemanticContext var1, ParserRuleContext var2, int var3, boolean var4) {
      return var1.eval(this.parser, var2);
   }

   protected void closure(ATNConfig var1, ATNConfigSet var2, Set<ATNConfig> var3, boolean var4, boolean var5, boolean var6) {
      boolean var7 = false;
      this.closureCheckingStopState(var1, var2, var3, var4, var5, 0, var6);
      assert !var5 || !var2.dipsIntoOuterContext;
   }

   protected void closureCheckingStopState(ATNConfig var1, ATNConfigSet var2, Set<ATNConfig> var3, boolean var4, boolean var5, int var6, boolean var7) {
      if (trace_atn_sim) {
         System.out.println("closure(" + var1.toString(this.parser, true) + ")");
      }

      if (var1.state instanceof RuleStopState) {
         if (!var1.context.isEmpty()) {
            for (int var8 = 0; var8 < var1.context.size(); var8++) {
               if (var1.context.getReturnState(var8) == Integer.MAX_VALUE) {
                  if (var5) {
                     var2.add(new ATNConfig(var1, var1.state, EmptyPredictionContext.Instance), this.mergeCache);
                  } else {
                     if (debug) {
                        System.out.println("FALLING off rule " + this.getRuleName(var1.state.ruleIndex));
                     }

                     this.closure_(var1, var2, var3, var4, var5, var6, var7);
                  }
               } else {
                  ATNState var9 = this.atn.states.get(var1.context.getReturnState(var8));
                  PredictionContext var10 = var1.context.getParent(var8);
                  ATNConfig var11 = new ATNConfig(var9, var1.alt, var10, var1.semanticContext);
                  var11.reachesIntoOuterContext = var1.reachesIntoOuterContext;
                  assert var6 > Integer.MIN_VALUE;
                  this.closureCheckingStopState(var11, var2, var3, var4, var5, var6 - 1, var7);
               }
            }

            return;
         }

         if (var5) {
            var2.add(var1, this.mergeCache);
            return;
         }

         if (debug) {
            System.out.println("FALLING off rule " + this.getRuleName(var1.state.ruleIndex));
         }
      }

      this.closure_(var1, var2, var3, var4, var5, var6, var7);
   }

   protected void closure_(ATNConfig var1, ATNConfigSet var2, Set<ATNConfig> var3, boolean var4, boolean var5, int var6, boolean var7) {
      ATNState var8 = var1.state;
      if (!var8.onlyHasEpsilonTransitions()) {
         var2.add(var1, this.mergeCache);
      }

      for (int var9 = 0; var9 < var8.getNumberOfTransitions(); var9++) {
         if (var9 != 0 || !this.canDropLoopEntryEdgeInLeftRecursiveRule(var1)) {
            Transition var10 = var8.transition(var9);
            boolean var11 = !(var10 instanceof ActionTransition) && var4;
            ATNConfig var12 = this.getEpsilonTarget(var1, var10, var11, var6 == 0, var5, var7);
            if (var12 != null) {
               int var13 = var6;
               if (var1.state instanceof RuleStopState) {
                  assert !var5;
                  if (this._dfa != null && this._dfa.isPrecedenceDfa()) {
                     int var14 = ((EpsilonTransition)var10).outermostPrecedenceReturn();
                     if (var14 == this._dfa.atnStartState.ruleIndex) {
                        var12.setPrecedenceFilterSuppressed(true);
                     }
                  }

                  var12.reachesIntoOuterContext++;
                  if (!var3.add(var12)) {
                     continue;
                  }

                  var2.dipsIntoOuterContext = true;
                  assert var13 > Integer.MIN_VALUE;
                  var13--;
                  if (debug) {
                     System.out.println("dips into outer ctx: " + var12);
                  }
               } else {
                  if (!var10.isEpsilon() && !var3.add(var12)) {
                     continue;
                  }

                  if (var10 instanceof RuleTransition && var13 >= 0) {
                     var13++;
                  }
               }

               this.closureCheckingStopState(var12, var2, var3, var11, var5, var13, var7);
            }
         }
      }
   }

   protected boolean canDropLoopEntryEdgeInLeftRecursiveRule(ATNConfig var1) {
      if (TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT) {
         return false;
      }

      ATNState var2 = var1.state;
      if (var2.getStateType() == 10 && ((StarLoopEntryState)var2).isPrecedenceDecision && !var1.context.isEmpty() && !var1.context.hasEmptyPath()) {
         int var3 = var1.context.size();

         for (int var4 = 0; var4 < var3; var4++) {
            ATNState var5 = this.atn.states.get(var1.context.getReturnState(var4));
            if (var5.ruleIndex != var2.ruleIndex) {
               return false;
            }
         }

         BlockStartState var11 = (BlockStartState)var2.transition(0).target;
         int var12 = var11.endState.stateNumber;
         BlockEndState var6 = (BlockEndState)this.atn.states.get(var12);
         int var7 = 0;

         while (var7 < var3) {
            int var8 = var1.context.getReturnState(var7);
            ATNState var9 = this.atn.states.get(var8);
            if (var9.getNumberOfTransitions() == 1 && var9.transition(0).isEpsilon()) {
               ATNState var10 = var9.transition(0).target;
               if (var9.getStateType() == 8 && var10 == var2
                  || var9 == var6
                  || var10 == var6
                  || var10.getStateType() == 8 && var10.getNumberOfTransitions() == 1 && var10.transition(0).isEpsilon() && var10.transition(0).target == var2) {
                  var7++;
                  continue;
               }

               return false;
            }

            return false;
         }

         return true;
      } else {
         return false;
      }
   }

   public String getRuleName(int var1) {
      return this.parser != null && var1 >= 0 ? this.parser.getRuleNames()[var1] : "<rule " + var1 + ">";
   }

   protected ATNConfig getEpsilonTarget(ATNConfig var1, Transition var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      switch (var2.getSerializationType()) {
         case 1:
            return new ATNConfig(var1, var2.target);
         case 2:
         case 5:
         case 7:
            if (var6 && var2.matches(-1, 0, 1)) {
               return new ATNConfig(var1, var2.target);
            }

            return null;
         case 3:
            return this.ruleTransition(var1, (RuleTransition)var2);
         case 4:
            return this.predTransition(var1, (PredicateTransition)var2, var3, var4, var5);
         case 6:
            return this.actionTransition(var1, (ActionTransition)var2);
         case 8:
         case 9:
         default:
            return null;
         case 10:
            return this.precedenceTransition(var1, (PrecedencePredicateTransition)var2, var3, var4, var5);
      }
   }

   protected ATNConfig actionTransition(ATNConfig var1, ActionTransition var2) {
      if (debug) {
         System.out.println("ACTION edge " + var2.ruleIndex + ":" + var2.actionIndex);
      }

      return new ATNConfig(var1, var2.target);
   }

   public ATNConfig precedenceTransition(ATNConfig var1, PrecedencePredicateTransition var2, boolean var3, boolean var4, boolean var5) {
      if (debug) {
         System.out.println("PRED (collectPredicates=" + var3 + ") " + var2.precedence + ">=_p, ctx dependent=true");
         if (this.parser != null) {
            System.out.println("context surrounding pred is " + this.parser.getRuleInvocationStack());
         }
      }

      ATNConfig var6 = null;
      if (!var3 || !var4) {
         var6 = new ATNConfig(var1, var2.target);
      } else if (var5) {
         int var7 = this._input.index();
         this._input.seek(this._startIndex);
         boolean var8 = this.evalSemanticContext(var2.getPredicate(), this._outerContext, var1.alt, var5);
         this._input.seek(var7);
         if (var8) {
            var6 = new ATNConfig(var1, var2.target);
         }
      } else {
         SemanticContext var9 = SemanticContext.and(var1.semanticContext, var2.getPredicate());
         var6 = new ATNConfig(var1, var2.target, var9);
      }

      if (debug) {
         System.out.println("config from pred transition=" + var6);
      }

      return var6;
   }

   protected ATNConfig predTransition(ATNConfig var1, PredicateTransition var2, boolean var3, boolean var4, boolean var5) {
      if (debug) {
         System.out.println("PRED (collectPredicates=" + var3 + ") " + var2.ruleIndex + ":" + var2.predIndex + ", ctx dependent=" + var2.isCtxDependent);
         if (this.parser != null) {
            System.out.println("context surrounding pred is " + this.parser.getRuleInvocationStack());
         }
      }

      ATNConfig var6 = null;
      if (var3 && (!var2.isCtxDependent || var2.isCtxDependent && var4)) {
         if (var5) {
            int var7 = this._input.index();
            this._input.seek(this._startIndex);
            boolean var8 = this.evalSemanticContext(var2.getPredicate(), this._outerContext, var1.alt, var5);
            this._input.seek(var7);
            if (var8) {
               var6 = new ATNConfig(var1, var2.target);
            }
         } else {
            SemanticContext var9 = SemanticContext.and(var1.semanticContext, var2.getPredicate());
            var6 = new ATNConfig(var1, var2.target, var9);
         }
      } else {
         var6 = new ATNConfig(var1, var2.target);
      }

      if (debug) {
         System.out.println("config from pred transition=" + var6);
      }

      return var6;
   }

   protected ATNConfig ruleTransition(ATNConfig var1, RuleTransition var2) {
      if (debug) {
         System.out.println("CALL rule " + this.getRuleName(var2.target.ruleIndex) + ", ctx=" + var1.context);
      }

      ATNState var3 = var2.followState;
      SingletonPredictionContext var4 = SingletonPredictionContext.create(var1.context, var3.stateNumber);
      return new ATNConfig(var1, var2.target, var4);
   }

   protected BitSet getConflictingAlts(ATNConfigSet var1) {
      Collection var2 = PredictionMode.getConflictingAltSubsets(var1);
      return PredictionMode.getAlts(var2);
   }

   protected BitSet getConflictingAltsOrUniqueAlt(ATNConfigSet var1) {
      BitSet var2;
      if (var1.uniqueAlt != 0) {
         var2 = new BitSet();
         var2.set(var1.uniqueAlt);
      } else {
         var2 = var1.conflictingAlts;
      }

      return var2;
   }

   public String getTokenName(int var1) {
      if (var1 == -1) {
         return "EOF";
      }

      Vocabulary var2 = this.parser != null ? this.parser.getVocabulary() : VocabularyImpl.EMPTY_VOCABULARY;
      String var3 = var2.getDisplayName(var1);
      return var3.equals(Integer.toString(var1)) ? var3 : var3 + "<" + var1 + ">";
   }

   public String getLookaheadName(TokenStream var1) {
      return this.getTokenName(var1.LA(1));
   }

   protected NoViableAltException noViableAlt(TokenStream var1, ParserRuleContext var2, ATNConfigSet var3, int var4) {
      return new NoViableAltException(this.parser, var1, var1.get(var4), var1.LT(1), var3, var2);
   }

   protected static int getUniqueAlt(ATNConfigSet var0) {
      int var1 = 0;

      for (ATNConfig var3 : var0) {
         if (var1 == 0) {
            var1 = var3.alt;
         } else if (var3.alt != var1) {
            return 0;
         }
      }

      return var1;
   }

   protected DFAState addDFAEdge(DFA var1, DFAState var2, int var3, DFAState var4) {
      if (debug) {
         System.out.println("EDGE " + var2 + " -> " + var4 + " upon " + this.getTokenName(var3));
      }

      if (var4 == null) {
         return null;
      }

      var4 = this.addDFAState(var1, var4);
      if (var2 != null && var3 >= -1 && var3 <= this.atn.maxTokenType) {
         synchronized (var2) {
            if (var2.edges == null) {
               var2.edges = new DFAState[this.atn.maxTokenType + 1 + 1];
            }

            var2.edges[var3 + 1] = var4;
         }

         if (debug) {
            System.out.println("DFA=\n" + var1.toString(this.parser != null ? this.parser.getVocabulary() : VocabularyImpl.EMPTY_VOCABULARY));
         }

         return var4;
      } else {
         return var4;
      }
   }

   protected DFAState addDFAState(DFA var1, DFAState var2) {
      if (var2 == ERROR) {
         return var2;
      }

      synchronized (var1.states) {
         DFAState var4 = var1.states.get(var2);
         if (var4 != null) {
            if (trace_atn_sim) {
               System.out.println("addDFAState " + var2 + " exists");
            }

            return var4;
         } else {
            var2.stateNumber = var1.states.size();
            if (!var2.configs.isReadonly()) {
               var2.configs.optimizeConfigs(this);
               var2.configs.setReadonly(true);
            }

            if (trace_atn_sim) {
               System.out.println("addDFAState new " + var2);
            }

            var1.states.put(var2, var2);
            return var2;
         }
      }
   }

   protected void reportAttemptingFullContext(DFA var1, BitSet var2, ATNConfigSet var3, int var4, int var5) {
      if (debug || retry_debug) {
         Interval var6 = Interval.of(var4, var5);
         System.out.println("reportAttemptingFullContext decision=" + var1.decision + ":" + var3 + ", input=" + this.parser.getTokenStream().getText(var6));
      }

      if (this.parser != null) {
         this.parser.getErrorListenerDispatch().reportAttemptingFullContext(this.parser, var1, var4, var5, var2, var3);
      }
   }

   protected void reportContextSensitivity(DFA var1, int var2, ATNConfigSet var3, int var4, int var5) {
      if (debug || retry_debug) {
         Interval var6 = Interval.of(var4, var5);
         System.out.println("reportContextSensitivity decision=" + var1.decision + ":" + var3 + ", input=" + this.parser.getTokenStream().getText(var6));
      }

      if (this.parser != null) {
         this.parser.getErrorListenerDispatch().reportContextSensitivity(this.parser, var1, var4, var5, var2, var3);
      }
   }

   protected void reportAmbiguity(DFA var1, DFAState var2, int var3, int var4, boolean var5, BitSet var6, ATNConfigSet var7) {
      if (debug || retry_debug) {
         Interval var8 = Interval.of(var3, var4);
         System.out.println("reportAmbiguity " + var6 + ":" + var7 + ", input=" + this.parser.getTokenStream().getText(var8));
      }

      if (this.parser != null) {
         this.parser.getErrorListenerDispatch().reportAmbiguity(this.parser, var1, var3, var4, var5, var6, var7);
      }
   }

   public static String getSafeEnv(final String var0) {
      try {
         return AccessController.doPrivileged(new PrivilegedAction<String>() {
            public String run() {
               return System.getenv(var0);
            }
         });
      } catch (SecurityException var2) {
         return null;
      }
   }
}
