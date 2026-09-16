package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.joml.Vector3dc;
import org.joml.Vector3i;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   private final HHCCIRHCCCIIRHCROHIORHIRHHIORH RRCHROIHCOOHHRCICICOHRICCOHRCC;
   private final CRRRICCRROCOHHOHIICIHORCOORRRH ICIIRCRHICRHOHOICOCOIHHCRRICIH;
   private final Vector3dc OHOROOOHRRHCCIHOIHOOORIHCCRRHO;
   private final List<Vector3dc> points = new ArrayList<>();
   private final long CHIORRHHCRROHHOIIIORROCROIHCRO;
   public Vector3i HOHCRHOOIIRHCRHIHHIHIIIOICHRHC;
   public long ORRIOROIIHIIHRIHCORCCOCORHRHCR;
   private Vector3dc HCRRCIHHHICIORROHOIIOHORICHHRO;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(CRRRICCRROCOHHOHIICIHORCOORRRH var1, HHCCIRHCCCIIRHCROHIORHIRHHIORH var2, Vector3dc var3, Vector3dc var4) {
      this.ICIIRCRHICRHOHOICOCOIHHCRRICIH = var1;
      this.RRCHROIHCOOHHRCICICOHRICCOHRCC = var2;
      this.HCRRCIHHHICIORROHOIIOHORICHHRO = var3;
      this.OHOROOOHRRHCCIHOIHOOORIHCCRRHO = var4;
      this.CHIORRHHCRROHHOIIIORROCROIHCRO = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3dc var1) {
      return var1.distanceSquared(this.HCRRCIHHHICIORROHOIIOHORICHHRO) < 9.0;
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Vector3dc var1) {
      if (this.points.size() <= 7) {
         if (this.points.isEmpty() || !var1.equals(this.points.get(this.points.size() - 1))) {
            if (this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1)) {
               this.points.add(var1);
               if (this.points.size() > 3) {
                  this.OORRIIRCRRCRORRCHICCROCOIICRHO();
               }
            }
         }
      }
   }

   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Vector3dc var1) {
      this.ORRIOROIIHIIHRIHCORCCOCORHRHCR = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime();
      this.HCRRCIHHHICIORROHOIIOHORICHHRO = var1;
   }

   private void OORRIIRCRRCRORRCHICCROCOIICRHO() {
      this.HOHCRHOOIIRHCRHIHHIHIIIOICHRHC = null;
      Vector3i var1 = this.ORHCICCHIOHHRRIOCHOICIHCOHRCOR();
      if (!this.RRCHROIHCOOHHRCICICOHRICCOHRCC.CIHCIHHRRIHICHOIRIRHCHICIOIORC().contains(var1)
         && this.ICIIRCRHICRHOHOICOCOIHHCRRICIH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1)) {
         this.HOHCRHOOIIRHCRHIHHIHIIIOICHRHC = var1;
      }
   }

   private static double bezier(double var0, double var2, double var4, double var6, double var8) {
      double var10 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var2, var4, var6);
      double var12 = IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0, var4, var6, var8);
      return lerp(var0, var10, var12);
   }

   private static double IRCIIHHICIHRCOCRROCOICRIHHCCHH(double var0, double var2, double var4, double var6) {
      return (var2 * (1.0 - var0) + var4 * var0) * (1.0 - var0) + (var4 * (1.0 - var0) + var6 * var0) * var0;
   }

   private static double lerp(double var0, double var2, double var4) {
      return var2 * (1.0 - var0) + var4 * var0;
   }

   private Vector3i ORHCICCHIOHHRRIOCHOICIHCOHRCOR() {
      double var1 = this.points.get(0).y();
      double var3 = var1 + this.OHOROOOHRRHCCIHOIHOOORIHCCRRHO.y() * 4.0 + 3.0;
      double var5 = Double.MAX_VALUE;
      int var7 = 80;
      double var8 = 0.0;

      for (int var10 = 70; var10 <= 100; var10++) {
         double var11 = var10 + 4;
         double var13 = var10 + 1;
         double var15 = 0.0;
         double var17 = 0.2;
         double var19 = Double.MAX_VALUE;
         double var21 = 0.0;

         label44:
         for (int var23 = 0; var23 < 10; var23++) {
            double var24 = (var17 - var15) / 1000.0;

            for (int var26 = 0; var26 <= 1000; var26++) {
               double var27 = var15 + var24 * var26;
               double var29 = 0.0;

               for (int var31 = 1; var31 < this.points.size(); var31++) {
                  double var32 = bezier(var27 * var31, var1, var3, var11, var13);
                  double var34 = Math.pow(this.points.get(var31).y() - var32, 2.0);
                  var29 += var34;
               }

               if (var29 < var19) {
                  var19 = var29;
                  var21 = var27;
                  if (var19 == 0.0) {
                     break label44;
                  }
               }
            }

            var15 = Math.max(0.0, var21 - var24);
            var17 = Math.min(0.2, var21 + var24);
         }

         if (var19 < var5) {
            var5 = var19;
            var7 = var10;
            var8 = var21;
         }
      }

      return new Vector3i(
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var8,
            -283,
            200,
            this.points.get(0).x(),
            this.points.get(0).x() + this.OHOROOOHRRHCCIHOIHOOORIHCCRRHO.x() * 4.0,
            this.points.stream().<Double>map(Vector3dc::x).toList()
         ),
         var7,
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var8,
            -230,
            200,
            this.points.get(0).z(),
            this.points.get(0).z() + this.OHOROOOHRRHCCIHOIHOOORIHCCRRHO.z() * 4.0,
            this.points.stream().<Double>map(Vector3dc::z).toList()
         )
      );
   }

   private int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var1, int var3, int var4, double var5, double var7, List<Double> var9) {
      double var10 = Double.MAX_VALUE;
      int var12 = 0;

      for (int var13 = var3; var13 < var4; var13++) {
         double var14 = var13 + 0.5;
         double var16 = 0.0;

         for (int var18 = 1; var18 < var9.size(); var18++) {
            double var19 = bezier(var1 * var18, var5, var7, var14, var14);
            double var21 = Math.pow((Double)var9.get(var18) - var19, 2.0);
            var16 += var21;
         }

         if (var16 < var10) {
            var10 = var16;
            var12 = var13;
         }
      }

      return var12;
   }

   public boolean IOIHIOIHROOCRCIHOIHHIOHORHIROC() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime() - this.CHIORRHHCRROHHOIIIORROCROIHCRO < 2000L;
   }

   public boolean CRHCHIHRICCCIRRHHOOHCCOCORHHHC() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getSystemTime() - this.CHIORRHHCRROHHOIIIORROCROIHCRO < 10L;
   }

   @Generated
   public void CIOHHCORHRCCRICCCORIHCRHCCCRRR(Vector3i var1) {
      this.HOHCRHOOIIRHCRHIHHIHIIIOICHRHC = var1;
   }

   @Generated
   public void RCCCROCHCICCROHCOCCRRROCIIHCCH(long var1) {
      this.ORRIOROIIHIIHRIHCORCCOCORHRHCR = var1;
   }
}
