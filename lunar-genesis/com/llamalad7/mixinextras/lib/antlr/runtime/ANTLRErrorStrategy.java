package com.llamalad7.mixinextras.lib.antlr.runtime;

public interface ANTLRErrorStrategy {
   void reset(Parser var1);

   Token recoverInline(Parser var1);

   void recover(Parser var1, RecognitionException var2);

   void sync(Parser var1);

   boolean inErrorRecoveryMode(Parser var1);

   void reportMatch(Parser var1);

   void reportError(Parser var1, RecognitionException var2);
}
