package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNConfigSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.dfa.DFA;
import java.util.BitSet;
import java.util.Collection;

public class ProxyErrorListener implements ANTLRErrorListener {
   private final Collection<? extends ANTLRErrorListener> delegates;

   public ProxyErrorListener(Collection<? extends ANTLRErrorListener> var1) {
      if (var1 == null) {
         throw new NullPointerException("delegates");
      }

      this.delegates = var1;
   }

   @Override
   public void syntaxError(Recognizer<?, ?> var1, Object var2, int var3, int var4, String var5, RecognitionException var6) {
      for (ANTLRErrorListener var8 : this.delegates) {
         var8.syntaxError(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void reportAmbiguity(Parser var1, DFA var2, int var3, int var4, boolean var5, BitSet var6, ATNConfigSet var7) {
      for (ANTLRErrorListener var9 : this.delegates) {
         var9.reportAmbiguity(var1, var2, var3, var4, var5, var6, var7);
      }
   }

   @Override
   public void reportAttemptingFullContext(Parser var1, DFA var2, int var3, int var4, BitSet var5, ATNConfigSet var6) {
      for (ANTLRErrorListener var8 : this.delegates) {
         var8.reportAttemptingFullContext(var1, var2, var3, var4, var5, var6);
      }
   }

   @Override
   public void reportContextSensitivity(Parser var1, DFA var2, int var3, int var4, int var5, ATNConfigSet var6) {
      for (ANTLRErrorListener var8 : this.delegates) {
         var8.reportContextSensitivity(var1, var2, var3, var4, var5, var6);
      }
   }
}
