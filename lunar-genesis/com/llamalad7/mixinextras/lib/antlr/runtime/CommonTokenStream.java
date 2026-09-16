package com.llamalad7.mixinextras.lib.antlr.runtime;

public class CommonTokenStream extends BufferedTokenStream {
   protected int channel = 0;

   public CommonTokenStream(TokenSource var1) {
      super(var1);
   }

   @Override
   protected int adjustSeekIndex(int var1) {
      return this.nextTokenOnChannel(var1, this.channel);
   }

   @Override
   protected Token LB(int var1) {
      if (var1 != 0 && this.p - var1 >= 0) {
         int var2 = this.p;

         for (int var3 = 1; var3 <= var1 && var2 > 0; var3++) {
            var2 = this.previousTokenOnChannel(var2 - 1, this.channel);
         }

         return var2 < 0 ? null : this.tokens.get(var2);
      } else {
         return null;
      }
   }

   @Override
   public Token LT(int var1) {
      this.lazyInit();
      if (var1 == 0) {
         return null;
      }

      if (var1 < 0) {
         return this.LB(-var1);
      }

      int var2 = this.p;

      for (int var3 = 1; var3 < var1; var3++) {
         if (this.sync(var2 + 1)) {
            var2 = this.nextTokenOnChannel(var2 + 1, this.channel);
         }
      }

      return this.tokens.get(var2);
   }
}
