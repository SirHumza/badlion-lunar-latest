package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.atn.ATNConfigSet;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Interval;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Utils;
import java.util.Locale;

public class LexerNoViableAltException extends RecognitionException {
   private final int startIndex;
   private final ATNConfigSet deadEndConfigs;

   public LexerNoViableAltException(Lexer var1, CharStream var2, int var3, ATNConfigSet var4) {
      super(var1, var2, null);
      this.startIndex = var3;
      this.deadEndConfigs = var4;
   }

   public CharStream getInputStream() {
      return (CharStream)super.getInputStream();
   }

   @Override
   public String toString() {
      String var1 = "";
      if (this.startIndex >= 0 && this.startIndex < this.getInputStream().size()) {
         var1 = this.getInputStream().getText(Interval.of(this.startIndex, this.startIndex));
         var1 = Utils.escapeWhitespace(var1, false);
      }

      return String.format(Locale.getDefault(), "%s('%s')", LexerNoViableAltException.class.getSimpleName(), var1);
   }
}
