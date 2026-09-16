package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.Lexer;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;

public class LexerTypeAction implements LexerAction {
   private final int type;

   public LexerTypeAction(int var1) {
      this.type = var1;
   }

   public LexerActionType getActionType() {
      return LexerActionType.TYPE;
   }

   @Override
   public boolean isPositionDependent() {
      return false;
   }

   @Override
   public void execute(Lexer var1) {
      var1.setType(this.type);
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();
      var1 = MurmurHash.update(var1, this.getActionType().ordinal());
      var1 = MurmurHash.update(var1, this.type);
      return MurmurHash.finish(var1, 2);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else {
         return !(var1 instanceof LexerTypeAction) ? false : this.type == ((LexerTypeAction)var1).type;
      }
   }

   @Override
   public String toString() {
      return String.format("type(%d)", this.type);
   }
}
