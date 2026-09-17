package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends CORCOCICIRIOHROHROIIOOHICCHCRR {
   private final char[][] CIRIHROCRROOICRORRIICIIRHCROCR;
   private final int HRHCRORRHHRRORRRCRHRHOCRHROOIR;
   private final int HIRHCRHHORHCOCCRHIHCCRHRCOCOHI;
   private final int IHIIIHHOOCIRIORHICIRCRIIIIRORH;
   private final char CHICORIIHCRRHRCHRHCROHHHRCOCOC;
   private final char HHCOHRIRRORHHROIRCCHRIOHOHRHCH;

   protected HHCCIRHCCCIIRHCROHIORHIRHHIORH(Map<Character, String> var1, int var2, int var3, @Nullable String var4) {
      this(IRCIIHHICIHRCOCRROCOICRIHHCCHH.COIHORRCHRRCHOCIRHHRRIOIHRIHCC(var1), var2, var3, var4);
   }

   protected HHCCIRHCCCIIRHCROHIORHIRHHIORH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1, int var2, int var3, @Nullable String var4) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      this.CIRIHROCRROOICRORRIICIIRHCROCR = var1.getReplacementArray();
      this.HRHCRORRHHRRORRRCRHRHOCRHROOIR = this.CIRIHROCRROOICRORRIICIIRHCROCR.length;
      if (var3 < var2) {
         var3 = -1;
         var2 = Integer.MAX_VALUE;
      }

      this.HIRHCRHHORHCOCCRHIHCCRHRCOCOHI = var2;
      this.IHIIIHHOOCIRIORHICIRCRIIIIRORH = var3;
      if (var2 >= 55296) {
         this.CHICORIIHCRRHRCHRHCROHHHRCOCOC = '\uffff';
         this.HHCOHRIRRORHHROIRCCHRIOHOHRHCH = 0;
      } else {
         this.CHICORIIHCRRHRCHRHCROHHHRCOCOC = (char)var2;
         this.HHCOHRIRRORHHROIRCCHRIOHOHRHCH = (char)Math.min(var3, 55295);
      }
   }

   @Override
   public final String escape(String var1) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);

      for (int var2 = 0; var2 < var1.length(); var2++) {
         char var3 = var1.charAt(var2);
         if (var3 < this.HRHCRORRHHRRORRRCRHRHOCRHROOIR && this.CIRIHROCRROOICRORRIICIIRHCROCR[var3] != null
            || var3 > this.HHCOHRIRRORHHROIRCCHRIOHOHRHCH
            || var3 < this.CHICORIIHCRRHRCHRHCROHHHRCOCOC) {
            return this.ICICIOCHHHIHOCHCOHORIHRCOHHOCR(var1, var2);
         }
      }

      return var1;
   }

   @Override
   protected final char[] escape(int var1) {
      if (var1 < this.HRHCRORRHHRRORRRCRHRHOCRHROOIR) {
         char[] var2 = this.CIRIHROCRROOICRORRIICIIRHCROCR[var1];
         if (var2 != null) {
            return var2;
         }
      }

      return var1 >= this.HIRHCRHHORHCOCCRHIHCCRHRCOCOHI && var1 <= this.IHIIIHHOOCIRIORHICIRCRIIIIRORH ? null : this.escapeUnsafe(var1);
   }

   @Override
   protected final int nextEscapeIndex(CharSequence var1, int var2, int var3) {
      while (var2 < var3) {
         char var4 = var1.charAt(var2);
         if ((var4 >= this.HRHCRORRHHRRORRRCRHRHOCRHROOIR || this.CIRIHROCRROOICRORRIICIIRHCROCR[var4] == null)
            && var4 <= this.HHCOHRIRRORHHROIRCCHRIOHOHRHCH
            && var4 >= this.CHICORIIHCRRHRCHRHCROHHHRCOCOC) {
            var2++;
            continue;
         }
         break;
      }

      return var2;
   }

   protected abstract char[] escapeUnsafe(int var1);
}
