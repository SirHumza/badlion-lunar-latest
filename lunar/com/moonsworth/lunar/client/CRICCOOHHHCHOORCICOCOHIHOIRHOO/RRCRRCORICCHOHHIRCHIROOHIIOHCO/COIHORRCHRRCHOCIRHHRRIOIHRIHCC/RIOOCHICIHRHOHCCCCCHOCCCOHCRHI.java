package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.COIHORRCHRRCHOCIRHHRRIOIHRIHCC;

import com.moonsworth.lunar.lib.adventure.text.format.Style;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private List<Object> OHIROROIHRHCOOICCICHRORRIHHIRC = new ArrayList<>();
   private StringBuilder HRIRRCRROCHIHRIHOCRRIHHCCRCCRI = new StringBuilder();

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
   }

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      Consumer<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var1
   ) {
      var1.accept(this);
   }

   public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI IOICICOROHHHOHROOOHCRCCOIRIOHO(String var0) {
      return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
         var1 -> new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               var1
            )
            .accept(var0)
      );
   }

   public void CRRRICCRROCOHHOHIICIHORCOORRRH(Object var1, int var2) {
      this.OHIROROIHRHCOOICCICHRORRIHHIRC.add(var1);
      this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI.appendCodePoint(var2);
      if (!Character.isBmpCodePoint(var2)) {
         this.OHIROROIHRHCOOICCICHRORRIHHIRC.add(var1);
      }
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var1, Style var2, int var3) {
      this.CRRRICCRROCOHHOHIICIHORCOORRRH(var2, var3);
      return true;
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Pattern var1, String var2) {
      Matcher var3 = var1.matcher(this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI);
      if (var3.find()) {
         int var4 = var2.length();
         int var5 = 0;
         ArrayList var6 = new ArrayList();
         StringBuilder var7 = new StringBuilder();

         do {
            int var8 = var3.start();
            int var9 = var3.end();

            for (int var10 = var5; var10 < var8; var10++) {
               var6.add(this.OHIROROIHRHCOOICCICHRORRIHHIRC.get(var10));
               var7.append(this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI.charAt(var10));
            }

            int var16 = var9 - var8;
            float var11 = (float)var16 / var4;
            float var12 = var8;

            for (int var13 = 0; var13 < var4; var13++) {
               var7.append(var2.charAt(var13));
               int var14 = Math.min((int)var12, var9);
               var6.add(this.OHIROROIHRHCOOICCICHRORRIHHIRC.get(var14));
               var12 += var11;
            }

            var5 = var9;
         } while (var3.find());

         for (int var15 = var5; var15 < this.OHIROROIHRHCOOICCICHRORRIHHIRC.size(); var15++) {
            var6.add(this.OHIROROIHRHCOOICCICHRORRIHHIRC.get(var15));
            var7.append(this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI.charAt(var15));
         }

         if (var6.size() != var7.length()) {
            throw new IllegalStateException(
               "Internal inconsistency while processing "
                  + var1
                  + " -> "
                  + var2
                  + " on "
                  + this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI
                  + " with styles "
                  + this.OHIROROIHRHCOOICCICHRORRIHHIRC
            );
         }

         this.OHIROROIHRHCOOICCICHRORRIHHIRC = var6;
         this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI = var7;
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (this.OHIROROIHRHCOOICCICHRORRIHHIRC.size() != this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI.length()) {
         throw new IllegalStateException();
      }

      for (int var2 = 0; var2 < this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI.length(); var2++) {
         char var3 = this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI.charAt(var2);
         int var4 = var3;
         if (Character.isHighSurrogate(var3) && var2 + 1 < this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI.length()) {
            var4 = Character.toCodePoint(var3, this.HRIRRCRROCHIHRIHOCRRIHHCCRCCRI.charAt(++var2));
         }

         var1.accept(var2, this.OHIROROIHRHCOOICCICHRORRIHHIRC.get(var2), var4);
      }
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((var1x, var2, var3) -> var1.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, (Style)var2, var3));
   }

   public String OCRHCCOCICIHHHOHICIRRRRIROIRHC() {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1 = new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      return var1.getResult();
   }

   public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      void accept(int var1, Object var2, int var3);
   }
}
