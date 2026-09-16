package com.llamalad7.mixinextras.lib.antlr.runtime;

import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Interval;
import com.llamalad7.mixinextras.lib.antlr.runtime.misc.Pair;

public class CommonTokenFactory implements TokenFactory<CommonToken> {
   public static final TokenFactory<CommonToken> DEFAULT = new CommonTokenFactory();
   protected final boolean copyText;

   public CommonTokenFactory(boolean var1) {
      this.copyText = var1;
   }

   public CommonTokenFactory() {
      this(false);
   }

   public CommonToken create(Pair<TokenSource, CharStream> var1, int var2, String var3, int var4, int var5, int var6, int var7, int var8) {
      CommonToken var9 = new CommonToken(var1, var2, var4, var5, var6);
      var9.setLine(var7);
      var9.setCharPositionInLine(var8);
      if (var3 != null) {
         var9.setText(var3);
      } else if (this.copyText && var1.b != null) {
         var9.setText(((CharStream)var1.b).getText(Interval.of(var5, var6)));
      }

      return var9;
   }
}
