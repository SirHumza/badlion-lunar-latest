package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.Lexer;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;

public final class LexerCustomAction implements LexerAction {
   private final int ruleIndex;
   private final int actionIndex;

   public LexerCustomAction(int var1, int var2) {
      this.ruleIndex = var1;
      this.actionIndex = var2;
   }

   public LexerActionType getActionType() {
      return LexerActionType.CUSTOM;
   }

   @Override
   public boolean isPositionDependent() {
      return true;
   }

   @Override
   public void execute(Lexer var1) {
      var1.action(null, this.ruleIndex, this.actionIndex);
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();
      var1 = MurmurHash.update(var1, this.getActionType().ordinal());
      var1 = MurmurHash.update(var1, this.ruleIndex);
      var1 = MurmurHash.update(var1, this.actionIndex);
      return MurmurHash.finish(var1, 3);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof LexerCustomAction)) {
         return false;
      }

      LexerCustomAction var2 = (LexerCustomAction)var1;
      return this.ruleIndex == var2.ruleIndex && this.actionIndex == var2.actionIndex;
   }
}
