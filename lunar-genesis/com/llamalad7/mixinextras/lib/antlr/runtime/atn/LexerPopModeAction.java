package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.Lexer;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;

public final class LexerPopModeAction implements LexerAction {
   public static final LexerPopModeAction INSTANCE = new LexerPopModeAction();

   private LexerPopModeAction() {
   }

   public LexerActionType getActionType() {
      return LexerActionType.POP_MODE;
   }

   @Override
   public boolean isPositionDependent() {
      return false;
   }

   @Override
   public void execute(Lexer var1) {
      var1.popMode();
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();
      var1 = MurmurHash.update(var1, this.getActionType().ordinal());
      return MurmurHash.finish(var1, 1);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 == this;
   }

   @Override
   public String toString() {
      return "popMode";
   }
}
