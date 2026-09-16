package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.io.Serializable;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   LOWER_HYPHEN(RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR('-'), "-") {
      @Override
      String normalizeWord(String var1) {
         return HHCCIRHCCCIIRHCROHIORHIRHHIORH.toLowerCase(var1);
      }

      @Override
      String convert(CRRRICCRROCOHHOHIICIHORCOORRRH var1, String var2) {
         if (var1 == LOWER_UNDERSCORE) {
            return var2.replace('-', '_');
         } else {
            return var1 == UPPER_UNDERSCORE ? HHCCIRHCCCIIRHCROHIORHIRHHIORH.toUpperCase(var2.replace('-', '_')) : super.convert(var1, var2);
         }
      }
   },
   LOWER_UNDERSCORE(RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR('_'), "_") {
      @Override
      String normalizeWord(String var1) {
         return HHCCIRHCCCIIRHCROHIORHIRHHIORH.toLowerCase(var1);
      }

      @Override
      String convert(CRRRICCRROCOHHOHIICIHORCOORRRH var1, String var2) {
         if (var1 == LOWER_HYPHEN) {
            return var2.replace('_', '-');
         } else {
            return var1 == UPPER_UNDERSCORE ? HHCCIRHCCCIIRHCROHIORHIRHHIORH.toUpperCase(var2) : super.convert(var1, var2);
         }
      }
   },
   LOWER_CAMEL(RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH('A', 'Z'), "") {
      @Override
      String normalizeWord(String var1) {
         return CRRRICCRROCOHHOHIICIHORCOORRRH.firstCharOnlyToUpper(var1);
      }

      @Override
      String normalizeFirstWord(String var1) {
         return HHCCIRHCCCIIRHCROHIORHIRHHIORH.toLowerCase(var1);
      }
   },
   UPPER_CAMEL(RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH('A', 'Z'), "") {
      @Override
      String normalizeWord(String var1) {
         return CRRRICCRROCOHHOHIICIHORCOORRRH.firstCharOnlyToUpper(var1);
      }
   },
   UPPER_UNDERSCORE(RRCRRCORICCHOHHIRCHIROOHIIOHCO.CIOHHCORHRCCRICCCORIHCRHCCCRRR('_'), "_") {
      @Override
      String normalizeWord(String var1) {
         return HHCCIRHCCCIIRHCROHIORHIRHHIORH.toUpperCase(var1);
      }

      @Override
      String convert(CRRRICCRROCOHHOHIICIHORCOORRRH var1, String var2) {
         if (var1 == LOWER_HYPHEN) {
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH.toLowerCase(var2.replace('_', '-'));
         } else {
            return var1 == LOWER_UNDERSCORE ? HHCCIRHCCCIIRHCROHIORHIRHHIORH.toLowerCase(var2) : super.convert(var1, var2);
         }
      }
   };

   private final RRCRRCORICCHOHHIRCHIROOHIIOHCO wordBoundary;
   private final String wordSeparator;

   CRRRICCRROCOHHOHIICIHORCOORRRH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var3, String var4) {
      this.wordBoundary = var3;
      this.wordSeparator = var4;
   }

   public final String to(CRRRICCRROCOHHOHIICIHORCOORRRH var1, String var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      return var1 == this ? var2 : this.convert(var1, var2);
   }

   String convert(CRRRICCRROCOHHOHIICIHORCOORRRH var1, String var2) {
      StringBuilder var3 = null;
      int var4 = 0;
      int var5 = -1;

      while (true) {
         var5++;
         if ((var5 = this.wordBoundary.indexIn(var2, var5)) == -1) {
            return var4 == 0 ? var1.normalizeFirstWord(var2) : var3.append(var1.normalizeWord(var2.substring(var4))).toString();
         }

         if (var4 == 0) {
            var3 = new StringBuilder(var2.length() + 4 * var1.wordSeparator.length());
            var3.append(var1.normalizeFirstWord(var2.substring(var4, var5)));
         } else {
            var3.append(var1.normalizeWord(var2.substring(var4, var5)));
         }

         var3.append(var1.wordSeparator);
         var4 = var5 + this.wordSeparator.length();
      }
   }

   public CORCOCICIRIOHROHROIIOOHICCHCRR<String, String> converterTo(CRRRICCRROCOHHOHIICIHORCOORRRH var1) {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this, var1);
   }

   abstract String normalizeWord(String var1);

   String normalizeFirstWord(String var1) {
      return this.normalizeWord(var1);
   }

   private static String firstCharOnlyToUpper(String var0) {
      return var0.isEmpty() ? var0 : HHCCIRHCCCIIRHCROHIORHIRHHIORH.toUpperCase(var0.charAt(0)) + HHCCIRHCCCIIRHCROHIORHIRHHIORH.toLowerCase(var0.substring(1));
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CORCOCICIRIOHROHROIIOOHICCHCRR<String, String> implements Serializable {
      private final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH RROHOCCHRORHCCHHIHHHHIIRRIOOIH;
      private final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH IOOHHORIICIIORRIIOCCHRCCIHICCR;
      private static final long HOHOOHCRHIRHOIRCOCHHHRHHCIHCCH = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var2
      ) {
         this.RROHOCCHRORHCCHHIHHHHIIRRIOOIH = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1);
         this.IOOHHORIICIIORRIIOCCHRCCIHICCR = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);
      }

      protected String doForward(String var1) {
         return this.RROHOCCHRORHCCHHIHHHHIIRRIOOIH.to(this.IOOHHORIICIIORRIIOCCHRCCIHICCR, var1);
      }

      protected String doBackward(String var1) {
         return this.IOOHHORIICIIORRIIOCCHRCCIHICCR.to(this.RROHOCCHRORHCCHHIHHHHIIRRIOOIH, var1);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (!(
            var1 instanceof com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
         )) {
            return false;
         }

         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         return this.RROHOCCHRORHCCHHIHHHHIIRRIOOIH.equals(var2.RROHOCCHRORHCCHHIHHHHIIRRIOOIH)
            && this.IOOHHORIICIIORRIIOCCHRCCIHICCR.equals(var2.IOOHHORIICIIORRIIOCCHRCCIHICCR);
      }

      @Override
      public int hashCode() {
         return this.RROHOCCHRORHCCHHIHHHHIIRRIOOIH.hashCode() ^ this.IOOHHORIICIIORRIIOCCHRCCIHICCR.hashCode();
      }

      @Override
      public String toString() {
         return this.RROHOCCHRORHCCHHIHHHHIIRRIOOIH + ".converterTo(" + this.IOOHHORIICIIORRIIOCCHRCCIHICCR + ")";
      }
   }
}
