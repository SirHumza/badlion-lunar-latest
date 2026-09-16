package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import org.joml.Vector3d;
import org.joml.Vector3dc;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO<com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH, com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CRRRICCRROCOHHOHIICIHORCOORRRH(
      Vector3d var0
   ) {
      double var1 = RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0);
      int var3 = 0;
      int var4 = 0;
      Vector3d var5 = null;
      Vector3d var6 = null;
      double var7 = 0.0;
      double var9 = Double.MAX_VALUE;

      for (int var11 = 150; var11 < 250; var11++) {
         double var12 = Math.PI * var11 / 200.0;
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var14 = ORHIOICIOCRRHOOCOHRORIHICHRCRR(var1, var12, var0.y);
         double var15 = var0.distanceSquared((Vector3dc)var14.OHICIOOICHICOIOCOROIIOCCHRRCIC);
         if (var15 < var9) {
            var9 = var15;
            var7 = var12;
            var3 = (Integer)var14.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC;
            var5 = (Vector3d)var14.OHICIOOICHICOIOCOROIIOCCHRRCIC;
         }
      }

      double var27 = 0.0;
      double var13 = Double.MAX_VALUE;

      for (int var28 = 250; var28 < 300; var28++) {
         double var16 = Math.PI * var28 / 200.0;
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var18 = ORHIOICIOCRRHOOCOHRORIHICHRCRR(var1, var16, var0.y);
         double var19 = var0.distanceSquared((Vector3dc)var18.OHICIOOICHICOIOCOROIIOCCHRRCIC);
         if (var19 < var13) {
            var13 = var19;
            var27 = var16;
            var4 = (Integer)var18.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC;
            var6 = (Vector3d)var18.OHICIOOICHICOIOCOROIIOCCHRRCIC;
         }
      }

      double var29 = -Math.sin(var1) * Math.cos(var7);
      double var17 = -Math.sin(var7);
      double var30 = Math.cos(var1) * Math.cos(var7);
      double var21 = -Math.sin(var1) * Math.cos(var27);
      double var23 = -Math.sin(var27);
      double var25 = Math.cos(var1) * Math.cos(var27);
      return RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(
         new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new Vector3d(var29 * 10.0, var17 * 10.0, var30 * 10.0), var3, var5
         ),
         new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            new Vector3d(var21 * 10.0, var23 * 10.0, var25 * 10.0), var4, var6
         )
      );
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO<Vector3d, Integer> ORHIOICIOCRRHOOCOHRORIHICHRCRR(double var0, double var2, double var4) {
      double var6 = 1.5;
      double var8 = -Math.sin(var0) * Math.cos(var2);
      double var10 = -Math.sin(var2);
      double var12 = Math.cos(var0) * Math.cos(var2);
      Vector3d var14 = new Vector3d(var8, var10, var12).normalize().mul(var6);
      double var15 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getPosX();
      double var17 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getPosY() + 1.7;
      double var19 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getPosZ();
      double var21 = var14.x;
      double var23 = var14.y;
      double var25 = var14.z;
      int var27 = 0;

      while (var17 > var4 || var23 > 0.0) {
         var27++;
         var15 += var21;
         var17 += var23;
         var19 += var25;
         var21 *= 0.99;
         var23 *= 0.99;
         var25 *= 0.99;
         var23 -= 0.03;
      }

      return RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(new Vector3d(var15, var17, var19), var27);
   }

   public static com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Vector3d var0, boolean var1
   ) {
      double var2 = RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0);
      int var4 = 0;
      Vector3d var5 = null;
      double var6 = 0.0;
      double var8 = Double.MAX_VALUE;

      for (byte var10 = 100; var10 < 300; var10 += 10) {
         double var11 = Math.PI * var10 / 200.0;
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var13 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var11, var1);
         double var14 = var0.distanceSquared((Vector3dc)var13.OHICIOOICHICOIOCOROIIOCCHRRCIC);
         if (var14 < var8) {
            var8 = var14;
            var6 = var10;
            var5 = (Vector3d)var13.OHICIOOICHICOIOCOROIIOCCHRRCIC;
            var4 = (Integer)var13.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC;
         }
      }

      for (double var18 = var6 - 5.0; var18 <= var6 + 5.0; var18++) {
         double var12 = Math.PI * var18 / 200.0;
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var23 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var12, var1);
         double var15 = var0.distanceSquared((Vector3dc)var23.OHICIOOICHICOIOCOROIIOCCHRRCIC);
         if (var15 < var8) {
            var8 = var15;
            var6 = var18;
            var5 = (Vector3d)var23.OHICIOOICHICOIOCOROIIOCCHRRCIC;
            var4 = (Integer)var23.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC;
         }
      }

      for (double var19 = var6 - 0.5; var19 <= var6 + 0.5; var19 += 0.2) {
         double var21 = Math.PI * var19 / 200.0;
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var24 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var21, var1);
         double var26 = var0.distanceSquared((Vector3dc)var24.OHICIOOICHICOIOCOROIIOCCHRRCIC);
         if (var26 < var8) {
            var8 = var26;
            var6 = var19;
            var5 = (Vector3d)var24.OHICIOOICHICOIOCOROIIOCCHRRCIC;
            var4 = (Integer)var24.CICIHRHOHOHIOCRHRIHCHHIHRIHIIC;
         }
      }

      double var20 = Math.PI * var6 / 200.0;
      double var22 = -Math.sin(var2) * Math.cos(var20);
      double var25 = -Math.sin(var20);
      double var16 = Math.cos(var2) * Math.cos(var20);
      return new com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.CORCOCICIRIOHROHROIIOOHICCHCRR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         new Vector3d(var22 * 10.0, var25 * 10.0, var16 * 10.0), var4, var5
      );
   }

   public static RRCRRCORICCHOHHIRCHIROOHIIOHCO<Vector3d, Integer> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var0, double var2, boolean var4) {
      double var5 = 1.5;
      double var7 = -Math.sin(var0) * Math.cos(var2);
      double var9 = -Math.sin(var2);
      double var11 = Math.cos(var0) * Math.cos(var2);
      Vector3d var13 = new Vector3d(var7, var9, var11).normalize().mul(var5);
      double var14 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getPosX();
      double var16 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getPosY() + 1.7;
      double var18 = IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getPosZ();
      double var20 = var13.x;
      double var22 = var13.y;
      double var24 = var13.z;
      int var26 = 0;
      Vector3d var27 = new Vector3d(var14, var16, var18);

      while (var16 > 0.0) {
         if (!var4 || ++var26 % 3 == 0) {
            Vector3d var28 = new Vector3d(var14 + var20, var16 + var22, var18 + var24);
            IRCIIHHICIHRCOCRROCOICRIHHCCHH var29 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                  com.moonsworth.lunar.client.util.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HRCHRHRICROHICIIIIHCOOICCRIIOI
               )
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var27, var28)
               .OCOHORHCROHICRRIHCIHHRRCIHICRI(
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::bridge$isSolid
               )
               .OHCOIORHOCCRICIHIOIRHRIRROCHRR()
               .CHRCRHHRCCOICCOOIIRIOHCOHCHHIC(IICCOOCHCHROORHHIIHROHCCRHRCOR.RIIOCICROIOIORIIRIICORCHHRIIRH());
            var27 = var28;
            if (var29 != null && var29.OCOCOIHOCHCIOORHOCIRIHRCHICORO() == HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.BLOCK) {
               var14 = var29.IIHOCOIHHIROCHIHHCCCORRCOHCHRC().bridge$xCoord();
               var16 = var29.IIHOCOIHHIROCHIHHCCCORRCOHCHRC().bridge$yCoord();
               var18 = var29.IIHOCOIHHIROCHIHHCCCORRCOHCHRC().bridge$zCoord();
               break;
            }
         }

         var14 += var20;
         var16 += var22;
         var18 += var24;
         var20 *= 0.99;
         var22 *= 0.99;
         var24 *= 0.99;
         var22 -= 0.03;
      }

      return RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORCOCORROHIROCCIORORRRRCHIOOCH(new Vector3d(var14, var16, var18), var26);
   }

   public static double RRCRRCORICCHOHHIRCHIROOHIIOHCO(Vector3d var0) {
      double var1 = Math.atan(
         (var0.x - IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getPosX())
            / (var0.z - IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getPosZ())
      );
      var1 = Math.PI - var1;
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.OHORHCCCORHIRHHCROHIRORRROROOH().bridge$getPosZ() > var0.z) {
         var1 += Math.PI;
      }

      return var1;
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final Vector3d IHHROCRHIORHHORRHIHOIIICORRRCR;
      private final int ROCHHHHORHHHRCROHROHRHIORORCIR;
      private final Vector3d IIROCROIORHCIIROIICIRRIHCIORII;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Vector3d var1, int var2, Vector3d var3) {
         this.IHHROCRHIORHHORRHIHOIIICORRRCR = var1;
         this.ROCHHHHORHHHRCROHROHRHIORORCIR = var2;
         this.IIROCROIORHCIIROIICIRRIHCIORII = var3;
      }

      public Vector3d CHOCIIOCOHOIHOHRIHCCCCHHIHCOCO() {
         return this.IHHROCRHIORHHORRHIHOIIICORRRCR;
      }

      public int RCCOORIRRRIIOCICOIRHHORIHHRHHC() {
         return this.ROCHHHHORHHHRCROHROHRHIORORCIR;
      }

      public Vector3d ICIIIOICCCOOICIHRHRHIHRCCCIOCI() {
         return this.IIROCROIORHCIIROIICIRRIHCIORII;
      }
   }
}
