package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.Lexer;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;

public final class LexerPushModeAction implements LexerAction {
   private final int mode;

   public LexerPushModeAction(int var1) {
      this.mode = var1;
   }

   public LexerActionType getActionType() {
      return LexerActionType.PUSH_MODE;
   }

   @Override
   public boolean isPositionDependent() {
      return false;
   }

   @Override
   public void execute(Lexer var1) {
      var1.pushMode(this.mode);
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();
      var1 = MurmurHash.update(var1, this.getActionType().ordinal());
      var1 = MurmurHash.update(var1, this.mode);
      return MurmurHash.finish(var1, 2);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof LexerPushModeAction) ? false : this.mode == ((LexerPushModeAction)var1).mode;
      }
   }

   @Override
   public String toString() {
      return String.format("pushMode(%d)", this.mode);
   }
}
