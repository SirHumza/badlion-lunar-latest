package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNState;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.AbstractPredicateTransition;
import com.llamalad7.mixinextras.lib.antlr.runtime.atn.PredicateTransition;
import java.util.Locale;

public class FailedPredicateException extends RecognitionException {
   private final int ruleIndex;
   private final int predicateIndex;
   private final String predicate;

   public FailedPredicateException(Parser var1, String var2) {
      this(var1, var2, null);
   }

   public FailedPredicateException(Parser var1, String var2, String var3) {
      super(formatMessage(var2, var3), var1, var1.getInputStream(), var1._ctx);
      ATNState var4 = var1.getInterpreter().atn.states.get(var1.getState());
      AbstractPredicateTransition var5 = (AbstractPredicateTransition)var4.transition(0);
      if (var5 instanceof PredicateTransition) {
         this.ruleIndex = ((PredicateTransition)var5).ruleIndex;
         this.predicateIndex = ((PredicateTransition)var5).predIndex;
      } else {
         this.ruleIndex = 0;
         this.predicateIndex = 0;
      }

      this.predicate = var2;
      this.setOffendingToken(var1.getCurrentToken());
   }

   private static String formatMessage(String var0, String var1) {
      return var1 != null ? var1 : String.format(Locale.getDefault(), "failed predicate: {%s}?", var0);
   }
}
