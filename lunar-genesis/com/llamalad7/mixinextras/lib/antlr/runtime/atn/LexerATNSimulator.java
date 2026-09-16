package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.CharStream;
import com.llamalad7.mixinextras.lib.antlr.runtime.Lexer;
import com.llamalad7.mixinextras.lib.antlr.runtime.LexerNoViableAltException;
import com.llamalad7.mixinextras.lib.antlr.runtime.dfa.DFA;
import com.llamalad7.mixinextras.lib.antlr.runtime.dfa.DFAState;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Interval;

public class LexerATNSimulator extends ATNSimulator {
   protected final Lexer recog;
   protected int startIndex = -1;
   protected int line = 1;
   protected int charPositionInLine = 0;
   public final DFA[] decisionToDFA;
   protected int mode = 0;
   protected final LexerATNSimulator.SimState prevAccept = new LexerATNSimulator.SimState();

   public LexerATNSimulator(Lexer var1, ATN var2, DFA[] var3, PredictionContextCache var4) {
      super(var2, var4);
      this.decisionToDFA = var3;
      this.recog = var1;
   }

   public int match(CharStream var1, int var2) {
      this.mode = var2;
      int var3 = var1.mark();

      try {
         this.startIndex = var1.index();
         this.prevAccept.reset();
         DFA var4 = this.decisionToDFA[var2];
         return var4.s0 == null ? this.matchATN(var1) : this.execATN(var1, var4.s0);
      } finally {
         var1.release(var3);
      }
   }

   @Override
   public void reset() {
      this.prevAccept.reset();
      this.startIndex = -1;
      this.line = 1;
      this.charPositionInLine = 0;
      this.mode = 0;
   }

   protected int matchATN(CharStream var1) {
      ATNState var2 = this.atn.modeToStartState.get(this.mode);
      int var3 = this.mode;
      ATNConfigSet var4 = this.computeStartState(var1, var2);
      boolean var5 = var4.hasSemanticContext;
      var4.hasSemanticContext = false;
      DFAState var6 = this.addDFAState(var4);
      if (!var5) {
         this.decisionToDFA[this.mode].s0 = var6;
      }

      return this.execATN(var1, var6);
   }

   protected int execATN(CharStream var1, DFAState var2) {
      if (var2.isAcceptState) {
         this.captureSimState(this.prevAccept, var1, var2);
      }

      int var3 = var1.LA(1);
      DFAState var4 = var2;

      while (true) {
         DFAState var5 = this.getExistingTargetState(var4, var3);
         if (var5 == null) {
            var5 = this.computeTargetState(var1, var4, var3);
         }

         if (var5 == ERROR) {
            break;
         }

         if (var3 != -1) {
            this.consume(var1);
         }

         if (var5.isAcceptState) {
            this.captureSimState(this.prevAccept, var1, var5);
            if (var3 == -1) {
               break;
            }
         }

         var3 = var1.LA(1);
         var4 = var5;
      }

      return this.failOrAccept(this.prevAccept, var1, var4.configs, var3);
   }

   protected DFAState getExistingTargetState(DFAState var1, int var2) {
      return var1.edges != null && var2 >= 0 && var2 <= 127 ? var1.edges[var2 - 0] : null;
   }

   protected DFAState computeTargetState(CharStream var1, DFAState var2, int var3) {
      OrderedATNConfigSet var4 = new OrderedATNConfigSet();
      this.getReachableConfigSet(var1, var2.configs, var4, var3);
      if (var4.isEmpty()) {
         if (!var4.hasSemanticContext) {
            this.addDFAEdge(var2, var3, ERROR);
         }

         return ERROR;
      } else {
         return this.addDFAEdge(var2, var3, var4);
      }
   }

   protected int failOrAccept(LexerATNSimulator.SimState var1, CharStream var2, ATNConfigSet var3, int var4) {
      if (var1.dfaState != null) {
         LexerActionExecutor var5 = var1.dfaState.lexerActionExecutor;
         this.accept(var2, var5, this.startIndex, var1.index, var1.line, var1.charPos);
         return var1.dfaState.prediction;
      } else if (var4 == -1 && var2.index() == this.startIndex) {
         return -1;
      } else {
         throw new LexerNoViableAltException(this.recog, var2, this.startIndex, var3);
      }
   }

   protected void getReachableConfigSet(CharStream var1, ATNConfigSet var2, ATNConfigSet var3, int var4) {
      int var5 = 0;

      for (ATNConfig var7 : var2) {
         boolean var8 = var7.alt == var5;
         if (!var8 || !((LexerATNConfig)var7).hasPassedThroughNonGreedyDecision()) {
            int var9 = var7.state.getNumberOfTransitions();

            for (int var10 = 0; var10 < var9; var10++) {
               Transition var11 = var7.state.transition(var10);
               ATNState var12 = this.getReachableTarget(var11, var4);
               if (var12 != null) {
                  LexerActionExecutor var13 = ((LexerATNConfig)var7).getLexerActionExecutor();
                  if (var13 != null) {
                     var13 = var13.fixOffsetBeforeMatch(var1.index() - this.startIndex);
                  }

                  boolean var14 = var4 == -1;
                  if (this.closure(var1, new LexerATNConfig((LexerATNConfig)var7, var12, var13), var3, var8, true, var14)) {
                     var5 = var7.alt;
                     break;
                  }
               }
            }
         }
      }
   }

   protected void accept(CharStream var1, LexerActionExecutor var2, int var3, int var4, int var5, int var6) {
      var1.seek(var4);
      this.line = var5;
      this.charPositionInLine = var6;
      if (var2 != null && this.recog != null) {
         var2.execute(this.recog, var1, var3);
      }
   }

   protected ATNState getReachableTarget(Transition var1, int var2) {
      return var1.matches(var2, 0, 1114111) ? var1.target : null;
   }

   protected ATNConfigSet computeStartState(CharStream var1, ATNState var2) {
      EmptyPredictionContext var3 = EmptyPredictionContext.Instance;
      OrderedATNConfigSet var4 = new OrderedATNConfigSet();

      for (int var5 = 0; var5 < var2.getNumberOfTransitions(); var5++) {
         ATNState var6 = var2.transition(var5).target;
         LexerATNConfig var7 = new LexerATNConfig(var6, var5 + 1, var3);
         this.closure(var1, var7, var4, false, false, false);
      }

      return var4;
   }

   protected boolean closure(CharStream var1, LexerATNConfig var2, ATNConfigSet var3, boolean var4, boolean var5, boolean var6) {
      if (var2.state instanceof RuleStopState) {
         if (var2.context == null || var2.context.hasEmptyPath()) {
            if (var2.context == null || var2.context.isEmpty()) {
               var3.add(var2);
               return true;
            }

            var3.add(new LexerATNConfig(var2, var2.state, EmptyPredictionContext.Instance));
            var4 = true;
         }

         if (var2.context != null && !var2.context.isEmpty()) {
            for (int var11 = 0; var11 < var2.context.size(); var11++) {
               if (var2.context.getReturnState(var11) != Integer.MAX_VALUE) {
                  PredictionContext var12 = var2.context.getParent(var11);
                  ATNState var13 = this.atn.states.get(var2.context.getReturnState(var11));
                  LexerATNConfig var14 = new LexerATNConfig(var2, var13, var12);
                  var4 = this.closure(var1, var14, var3, var4, var5, var6);
               }
            }
         }

         return var4;
      } else {
         if (!var2.state.onlyHasEpsilonTransitions() && (!var4 || !var2.hasPassedThroughNonGreedyDecision())) {
            var3.add(var2);
         }

         ATNState var7 = var2.state;

         for (int var8 = 0; var8 < var7.getNumberOfTransitions(); var8++) {
            Transition var9 = var7.transition(var8);
            LexerATNConfig var10 = this.getEpsilonTarget(var1, var2, var9, var3, var5, var6);
            if (var10 != null) {
               var4 = this.closure(var1, var10, var3, var4, var5, var6);
            }
         }

         return var4;
      }
   }

   protected LexerATNConfig getEpsilonTarget(CharStream var1, LexerATNConfig var2, Transition var3, ATNConfigSet var4, boolean var5, boolean var6) {
      LexerATNConfig var7 = null;
      switch (var3.getSerializationType()) {
         case 1:
            var7 = new LexerATNConfig(var2, var3.target);
            break;
         case 2:
         case 5:
         case 7:
            if (var6 && var3.matches(-1, 0, 1114111)) {
               var7 = new LexerATNConfig(var2, var3.target);
            }
            break;
         case 3:
            RuleTransition var8 = (RuleTransition)var3;
            SingletonPredictionContext var9 = SingletonPredictionContext.create(var2.context, var8.followState.stateNumber);
            var7 = new LexerATNConfig(var2, var3.target, var9);
            break;
         case 4:
            PredicateTransition var10 = (PredicateTransition)var3;
            var4.hasSemanticContext = true;
            if (this.evaluatePredicate(var1, var10.ruleIndex, var10.predIndex, var5)) {
               var7 = new LexerATNConfig(var2, var3.target);
            }
            break;
         case 6:
            if (var2.context != null && !var2.context.hasEmptyPath()) {
               var7 = new LexerATNConfig(var2, var3.target);
            } else {
               LexerActionExecutor var11 = LexerActionExecutor.append(
                  var2.getLexerActionExecutor(), this.atn.lexerActions[((ActionTransition)var3).actionIndex]
               );
               var7 = new LexerATNConfig(var2, var3.target, var11);
            }
         case 8:
         case 9:
         default:
            break;
         case 10:
            throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
      }

      return var7;
   }

   protected boolean evaluatePredicate(CharStream var1, int var2, int var3, boolean var4) {
      if (this.recog == null) {
         return true;
      }

      if (!var4) {
         return this.recog.sempred(null, var2, var3);
      }

      int var5 = this.charPositionInLine;
      int var6 = this.line;
      int var7 = var1.index();
      int var8 = var1.mark();

      try {
         this.consume(var1);
         return this.recog.sempred(null, var2, var3);
      } finally {
         this.charPositionInLine = var5;
         this.line = var6;
         var1.seek(var7);
         var1.release(var8);
      }
   }

   protected void captureSimState(LexerATNSimulator.SimState var1, CharStream var2, DFAState var3) {
      var1.index = var2.index();
      var1.line = this.line;
      var1.charPos = this.charPositionInLine;
      var1.dfaState = var3;
   }

   protected DFAState addDFAEdge(DFAState var1, int var2, ATNConfigSet var3) {
      boolean var4 = var3.hasSemanticContext;
      var3.hasSemanticContext = false;
      DFAState var5 = this.addDFAState(var3);
      if (var4) {
         return var5;
      }

      this.addDFAEdge(var1, var2, var5);
      return var5;
   }

   protected void addDFAEdge(DFAState var1, int var2, DFAState var3) {
      if (var2 >= 0 && var2 <= 127) {
         synchronized (var1) {
            if (var1.edges == null) {
               var1.edges = new DFAState[128];
            }

            var1.edges[var2 - 0] = var3;
         }
      }
   }

   protected DFAState addDFAState(ATNConfigSet var1) {
      assert !var1.hasSemanticContext;
      DFAState var2 = new DFAState(var1);
      ATNConfig var3 = null;

      for (ATNConfig var5 : var1) {
         if (var5.state instanceof RuleStopState) {
            var3 = var5;
            break;
         }
      }

      if (var3 != null) {
         var2.isAcceptState = true;
         var2.lexerActionExecutor = ((LexerATNConfig)var3).getLexerActionExecutor();
         var2.prediction = this.atn.ruleToTokenType[var3.state.ruleIndex];
      }

      DFA var10 = this.decisionToDFA[this.mode];
      synchronized (var10.states) {
         DFAState var6 = var10.states.get(var2);
         if (var6 != null) {
            return var6;
         }

         DFAState var7 = var2;
         var7.stateNumber = var10.states.size();
         var1.setReadonly(true);
         var7.configs = var1;
         var10.states.put(var7, var7);
         return var7;
      }
   }

   public String getText(CharStream var1) {
      return var1.getText(Interval.of(this.startIndex, var1.index() - 1));
   }

   public int getLine() {
      return this.line;
   }

   public int getCharPositionInLine() {
      return this.charPositionInLine;
   }

   public void consume(CharStream var1) {
      int var2 = var1.LA(1);
      if (var2 == 10) {
         this.line++;
         this.charPositionInLine = 0;
      } else {
         this.charPositionInLine++;
      }

      var1.consume();
   }

   protected static class SimState {
      protected int index = -1;
      protected int line = 0;
      protected int charPos = -1;
      protected DFAState dfaState;

      protected void reset() {
         this.index = -1;
         this.line = 0;
         this.charPos = -1;
         this.dfaState = null;
      }
   }
}
