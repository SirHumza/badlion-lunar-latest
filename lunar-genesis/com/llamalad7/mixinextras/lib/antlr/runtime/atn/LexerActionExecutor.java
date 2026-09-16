package com.llamalad7.mixinextras.lib.antlr.runtime.atn;

import com.llamalad7.mixinextras.lib.antlr.runtime.CharStream;
import com.llamalad7.mixinextras.lib.antlr.runtime.Lexer;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.MurmurHash;
import java.util.Arrays;

public class LexerActionExecutor {
   private final LexerAction[] lexerActions;
   private final int hashCode;

   public LexerActionExecutor(LexerAction[] var1) {
      this.lexerActions = var1;
      int var2 = MurmurHash.initialize();

      for (LexerAction var6 : var1) {
         var2 = MurmurHash.update(var2, var6);
      }

      this.hashCode = MurmurHash.finish(var2, var1.length);
   }

   public static LexerActionExecutor append(LexerActionExecutor var0, LexerAction var1) {
      if (var0 == null) {
         return new LexerActionExecutor(new LexerAction[]{var1});
      }

      LexerAction[] var2 = Arrays.copyOf(var0.lexerActions, var0.lexerActions.length + 1);
      var2[var2.length - 1] = var1;
      return new LexerActionExecutor(var2);
   }

   public LexerActionExecutor fixOffsetBeforeMatch(int var1) {
      LexerAction[] var2 = null;

      for (int var3 = 0; var3 < this.lexerActions.length; var3++) {
         if (this.lexerActions[var3].isPositionDependent() && !(this.lexerActions[var3] instanceof LexerIndexedCustomAction)) {
            if (var2 == null) {
               var2 = (LexerAction[])this.lexerActions.clone();
            }

            var2[var3] = new LexerIndexedCustomAction(var1, this.lexerActions[var3]);
         }
      }

      return var2 == null ? this : new LexerActionExecutor(var2);
   }

   public void execute(Lexer var1, CharStream var2, int var3) {
      boolean var4 = false;
      int var5 = var2.index();

      try {
         for (LexerAction var9 : this.lexerActions) {
            if (var9 instanceof LexerIndexedCustomAction) {
               int var10 = ((LexerIndexedCustomAction)var9).getOffset();
               var2.seek(var3 + var10);
               var9 = ((LexerIndexedCustomAction)var9).getAction();
               var4 = var3 + var10 != var5;
            } else if (var9.isPositionDependent()) {
               var2.seek(var5);
               var4 = false;
            }

            var9.execute(var1);
         }
      } finally {
         if (var4) {
            var2.seek(var5);
         }
      }
   }

   @Override
   public int hashCode() {
      return this.hashCode;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof LexerActionExecutor)) {
         return false;
      }

      LexerActionExecutor var2 = (LexerActionExecutor)var1;
      return this.hashCode == var2.hashCode && Arrays.equals(this.lexerActions, var2.lexerActions);
   }
}
