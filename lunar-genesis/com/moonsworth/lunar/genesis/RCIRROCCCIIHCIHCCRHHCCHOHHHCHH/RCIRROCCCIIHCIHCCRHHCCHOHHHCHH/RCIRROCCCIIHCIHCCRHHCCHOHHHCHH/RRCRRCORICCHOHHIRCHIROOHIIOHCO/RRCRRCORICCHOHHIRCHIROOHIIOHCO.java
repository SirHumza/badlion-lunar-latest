package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private final Map<Character, String> IRCCOIIOCCICHOIOROCCHIHIHRRICC;
   private int max = -1;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      this.IRCCOIIOCCICHOIOROCCHIHIHRRICC = new HashMap<>();
   }

   @CanIgnoreReturnValue
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char var1, String var2) {
      this.IRCCOIIOCCICHOIOROCCHIHIHRRICC.put(var1, IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2));
      if (var1 > this.max) {
         this.max = var1;
      }

      return this;
   }

   @CanIgnoreReturnValue
   public RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[] var1, String var2) {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var2);

      for (char var6 : var1) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var2);
      }

      return this;
   }

   public char[][] toArray() {
      char[][] var1 = new char[this.max + 1][];

      for (Entry var3 : this.IRCCOIIOCCICHOIOROCCHIHIHRRICC.entrySet()) {
         var1[var3.getKey()] = ((String)var3.getValue()).toCharArray();
      }

      return var1;
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI HOHIRRIRCIICCIRIRIOCIRCIRRRROR() {
      return new RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.toArray());
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends CRRRICCRROCOHHOHIICIHORCOORRRH {
      private final char[][] IHHOCHRCHHRHRROHCHROCOIHHIOIHC;
      private final int OOHCRORIIHOCHIIRIHOOIICICHIIIC;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(char[][] var1) {
         this.IHHOCHRCHHRHRROHCHROCOIHHIOIHC = var1;
         this.OOHCRORIIHOCHIIRIHOOIICICHIIIC = var1.length;
      }

      @Override
      public String escape(String var1) {
         int var2 = var1.length();

         for (int var3 = 0; var3 < var2; var3++) {
            char var4 = var1.charAt(var3);
            if (var4 < this.IHHOCHRCHHRHRROHCHROCOIHHIOIHC.length && this.IHHOCHRCHHRHRROHCHROCOIHHIOIHC[var4] != null) {
               return this.IHCRORHRORIICHRHRCHRRIRRHHOCOO(var1, var3);
            }
         }

         return var1;
      }

      @Override
      protected char[] escape(char var1) {
         return var1 < this.OOHCRORIIHOCHIIRIHOOIICICHIIIC ? this.IHHOCHRCHHRHRROHCHROCOIHHIOIHC[var1] : null;
      }
   }
}
