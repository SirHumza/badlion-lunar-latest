package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.moonsworth.lunar.client.util.OHRRHHOCROROCCIRROIHOCCHCIHCIR;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import toxi.geom.Circle;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private static final float OOHCCHOOIHRCIHCROIHHRCRRRIOOOH = 0.01F;

   public static List<HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> var0, float var1, float var2, int var3
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 20, 50, var1, var2, 1.0, var3);
   }

   public static List<HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> var0, float var1, float var2, double var3, int var5
   ) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 20, 50, var1, var2, var3, var5);
   }

   public static List<HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> var0, int var1, int var2, float var3, float var4, double var5, int var7
   ) {
      ArrayList var8 = new ArrayList(var0);
      ArrayList var9 = new ArrayList();
      int var10 = 0;

      while (var10 < var2 && var8.size() >= var7) {
         HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11 = null;

         for (int var12 = 0; var12 < var1; var12++) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var13 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var8, var3, var4, var5, var7);
            if (var13 != null && (var11 == null || var11.HHROROIRCORRIRHOOROICHOHRRCCOC() < var13.HHROROIRCORRIRHOOROICHOHRRCCOC())) {
               var11 = var13;
            }
         }

         if (var11 == null) {
            var10++;
         } else {
            var10 = 0;
            double var16 = 0.0;

            for (int var15 : var11.OIHHRIRHOOCIHRRRIICIIRCOCOOHHR()) {
               var16 += ((IIRHCHHOICHRICOOCRORCCIOOIHOIR)var8.get(var15)).RHOIIHOOIOOIIRCICHCIHHOCOICIIC();
            }

            var16 /= var11.OIHHRIRHOOCIHRRRIICIIRCOCOOHHR().size();

            for (int var20 : var11.OIHHRIRHOOCIHRRRIICIIRCOCOOHHR()) {
               OHRRHHOCROROCCIRROIHOCCHCIHCIR.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var8, var20);
            }

            Circle var19 = var11.RRIIRCCOCIRCIHHCHCICOHCOIOIOIC();
            var9.add(
               new HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
                  var19.x, var19.y, var16, var19.getRadius(), var11.OIHHRIRHOOCIHRRRIICIIRCOCOOHHR().size()
               )
            );
         }
      }

      return var9;
   }

   @Nullable
   private static HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      List<IIRHCHHOICHRICOOCRORCCIOOIHOIR> var0, float var1, float var2, double var3, int var5
   ) {
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var6 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var0.get((int)(var0.size() * Math.random()));
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var7 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var0.get((int)(var0.size() * Math.random()));
      IIRHCHHOICHRICOOCRORCCIOOIHOIR var8 = (IIRHCHHOICHRICOOCRORCCIOOIHOIR)var0.get((int)(var0.size() * Math.random()));
      if (var6 != var7 && var6 != var8 && var7 != var8) {
         Circle var9 = Circle.from3Points(var6.HIHRCOIOCHRIIOIRCIIROHIOOIROHC(), var7.HIHRCOIOCHRIIOIRCIIROHIOOIROHC(), var8.HIHRCOIOCHRIIOIRCIIROHIOOIROHC());
         if (var9 == null) {
            return null;
         }

         float var10 = var9.getRadius();
         if (!Float.isNaN(var10) && !(var10 < var1 - 0.01F) && !(var10 > var2 + 0.01F)) {
            ArrayList var11 = new ArrayList();
            double var12 = 0.0;

            for (int var14 = 0; var14 < var0.size(); var14++) {
               double var15 = Math.abs(var9.distanceTo(((IIRHCHHOICHRICOOCRORCCIOOIHOIR)var0.get(var14)).HIHRCOIOCHRIIOIRCIIROHIOOIROHC()) - var10);
               if (var15 < var3) {
                  var11.add(var14);
                  var12 += var3 - var15;
               }
            }

            if (var11.size() >= var5) {
               Collections.reverse(var11);
               return new HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var9, var11);
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      private final double RIRRIIRORORHHIIRRRHHCHRCCCHCIH;
      private final double RCIHHIROCCHRHCRRICRICCCCRCIRRH;
      private final double ROOHORCIHCOOOCCOOOCHHOHROOOCCR;
      private final double radius;
      private final int CHCCHOIRIRCCCCOHCRHOHIHRHIIHCO;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH(double var1, double var3, double var5, double var7, int var9) {
         this.RIRRIIRORORHHIIRRRHHCHRCCCHCIH = var1;
         this.RCIHHIROCCHRHCRRICRICCCCRCIRRH = var3;
         this.ROOHORCIHCOOOCCOOOCHHOHROOOCCR = var5;
         this.radius = var7;
         this.CHCCHOIRIRCCCCOHCRHOHIHRHIIHCO = var9;
      }

      public double RIHCCRIHORRHIHHRRHRIRHIRRRIHRO() {
         return this.RIRRIIRORORHHIIRRRHHCHRCCCHCIH;
      }

      public double IOOIOCCCORIIRCCHRRRRCCHORHCOIC() {
         return this.RCIHHIROCCHRHCRRICRICCCCRCIRRH;
      }

      public double HRIROHHRRCHCIRHCCIOCIOOIHOIIHR() {
         return this.ROOHORCIHCOOOCCOOOCHHOHROOOCCR;
      }

      public double RRHOOCRCCIHCOCOOIOIHICOOICRHOR() {
         return this.radius;
      }

      public int ROIOOHRHCRCRCOCHICIHCICHIIHIOH() {
         return this.CHCCHOIRIRCCCCOHCRHOHIHRHIIHCO;
      }
   }

   private record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final double HOHHCIORIHCOCHRHHHCRRRRCIOOHHH;
      private final Circle circle;
      private final ArrayList<Integer> HHIOOHIHIIOIRIIIIRRCCHCCHCROIH;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1, Circle var3, ArrayList<Integer> var4) {
         this.HOHHCIORIHCOCHRHHHCRRRRCIOOHHH = var1;
         this.circle = var3;
         this.HHIOOHIHIIOIRIIIIRRCCHCCHCROIH = var4;
      }

      public double HHROROIRCORRIRHOOROICHOHRRCCOC() {
         return this.HOHHCIORIHCOCHRHHHCRRRRCIOOHHH;
      }

      public Circle RRIIRCCOCIRCIHHCHCICOHCOIOIOIC() {
         return this.circle;
      }

      public ArrayList<Integer> OIHHRIRHOOCIHRRRIICIIRCOCOOHHR() {
         return this.HHIOOHIHIIOIRIIIIRRCCHCCHCROIH;
      }
   }
}
