package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.ObjectEqualityComparator;

public class LexerATNConfig extends ATNConfig {
   private final LexerActionExecutor lexerActionExecutor;
   private final boolean passedThroughNonGreedyDecision;

   public LexerATNConfig(ATNState var1, int var2, PredictionContext var3) {
      super(var1, var2, var3, SemanticContext.Empty.Instance);
      this.passedThroughNonGreedyDecision = false;
      this.lexerActionExecutor = null;
   }

   public LexerATNConfig(LexerATNConfig var1, ATNState var2) {
      super(var1, var2, var1.context, var1.semanticContext);
      this.lexerActionExecutor = var1.lexerActionExecutor;
      this.passedThroughNonGreedyDecision = checkNonGreedyDecision(var1, var2);
   }

   public LexerATNConfig(LexerATNConfig var1, ATNState var2, LexerActionExecutor var3) {
      super(var1, var2, var1.context, var1.semanticContext);
      this.lexerActionExecutor = var3;
      this.passedThroughNonGreedyDecision = checkNonGreedyDecision(var1, var2);
   }

   public LexerATNConfig(LexerATNConfig var1, ATNState var2, PredictionContext var3) {
      super(var1, var2, var3, var1.semanticContext);
      this.lexerActionExecutor = var1.lexerActionExecutor;
      this.passedThroughNonGreedyDecision = checkNonGreedyDecision(var1, var2);
   }

   public final LexerActionExecutor getLexerActionExecutor() {
      return this.lexerActionExecutor;
   }

   public final boolean hasPassedThroughNonGreedyDecision() {
      return this.passedThroughNonGreedyDecision;
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize(7);
      var1 = MurmurHash.update(var1, this.state.stateNumber);
      var1 = MurmurHash.update(var1, this.alt);
      var1 = MurmurHash.update(var1, this.context);
      var1 = MurmurHash.update(var1, this.semanticContext);
      var1 = MurmurHash.update(var1, this.passedThroughNonGreedyDecision ? 1 : 0);
      var1 = MurmurHash.update(var1, this.lexerActionExecutor);
      return MurmurHash.finish(var1, 6);
   }

   @Override
   public boolean equals(ATNConfig var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof LexerATNConfig)) {
         return false;
      } else {
         LexerATNConfig var2 = (LexerATNConfig)var1;
         if (this.passedThroughNonGreedyDecision != var2.passedThroughNonGreedyDecision) {
            return false;
         } else {
            return !ObjectEqualityComparator.INSTANCE.equals(this.lexerActionExecutor, var2.lexerActionExecutor) ? false : super.equals(var1);
         }
      }
   }

   private static boolean checkNonGreedyDecision(LexerATNConfig var0, ATNState var1) {
      return var0.passedThroughNonGreedyDecision || var1 instanceof DecisionState && ((DecisionState)var1).nonGreedy;
   }
}
