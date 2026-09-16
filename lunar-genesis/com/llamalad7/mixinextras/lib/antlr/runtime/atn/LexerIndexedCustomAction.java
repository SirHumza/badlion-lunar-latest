package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.Lexer;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;

public final class LexerIndexedCustomAction implements LexerAction {
   private final int offset;
   private final LexerAction action;

   public LexerIndexedCustomAction(int var1, LexerAction var2) {
      this.offset = var1;
      this.action = var2;
   }

   public int getOffset() {
      return this.offset;
   }

   public LexerAction getAction() {
      return this.action;
   }

   @Override
   public boolean isPositionDependent() {
      return true;
   }

   @Override
   public void execute(Lexer var1) {
      this.action.execute(var1);
   }

   @Override
   public int hashCode() {
      int var1 = MurmurHash.initialize();
      var1 = MurmurHash.update(var1, this.offset);
      var1 = MurmurHash.update(var1, this.action);
      return MurmurHash.finish(var1, 2);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof LexerIndexedCustomAction)) {
         return false;
      }

      LexerIndexedCustomAction var2 = (LexerIndexedCustomAction)var1;
      return this.offset == var2.offset && this.action.equals(var2.action);
   }
}
