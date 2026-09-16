package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNConfigSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.dfa.DFA;
import java.util.BitSet;

public class BaseErrorListener implements ANTLRErrorListener {
   @Override
   public void syntaxError(Recognizer<?, ?> var1, Object var2, int var3, int var4, String var5, RecognitionException var6) {
   }

   @Override
   public void reportAmbiguity(Parser var1, DFA var2, int var3, int var4, boolean var5, BitSet var6, ATNConfigSet var7) {
   }

   @Override
   public void reportAttemptingFullContext(Parser var1, DFA var2, int var3, int var4, BitSet var5, ATNConfigSet var6) {
   }

   @Override
   public void reportContextSensitivity(Parser var1, DFA var2, int var3, int var4, int var5, ATNConfigSet var6) {
   }
}
