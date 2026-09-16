package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.CRHROHHHCIHHCOHCOORCRIHHIICROR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RORCHCIIICOHIRROOORHOCCCCIOCCI;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.function.DoubleSupplier;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector3f;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 8)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static final float CORIIOCHORRHIIOCIHCOIOCHRCHOOH = 64.0F;

   public static IRRCCOICORICIHCHRHIHIHROIRHOCR OOROOCCIRCCRHOIOIORIHCHHOOCCOR(IRRCCOICORICIHCHRHIHIHROIRHOCR var0) {
      return com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         )
         .map(var1 -> var1.lunar$unwrapRenderType(var0))
         .orElse(var0);
   }

   public static boolean IHRORICIROCROIOHOIIHRCHOHOCCHH() {
      com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0 = com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR(
            com.moonsworth.lunar.client.CORCOCICIRIOHROHROIIOOHICCHCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.class
         )
         .orElse(null);
      return var0 != null && var0.lunar$areShadersEnabledInConfig() && !"(off)".equals(var0.lunar$getShaderPack());
   }

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = var0.bridge$copy();
      var1.bridge$invert();
      var1.bridge$transpose();
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = var1.bridge$truncateToMatrix3f();
      var2.bridge$invert();
      return var2;
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      double var0,
      double var2,
      double var4,
      @Nullable RORCHCIIICOHIRROOORHOCCCCIOCCI var6,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7
   ) {
      if (var6 == null) {
         var7.bridge$translate((float)(-var0), (float)(-var2), (float)(-var4));
      } else {
         var7.bridge$translate((float)(var6.bridge$getX() - var0), (float)(var6.bridge$getY() - var2), (float)(var6.bridge$getZ() - var4));
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      IRRCCOICORICIHCHRHIHIHROIRHOCR var1,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2
   ) {
      var2.bridge$bind();
      var2.bridge$drawWithoutFog(var0, var1);
      var2.bridge$unbind();
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      IRRCCOICORICIHCHRHIHIHROIRHOCR var0,
      @Nullable CRHROHHHCIHHCOHCOORCRIHHIICROR var1,
      @Nullable RORCHCIIICOHIRROOORHOCCCCIOCCI var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3,
      DoubleSupplier var4,
      long var5,
      boolean var7,
      boolean var8
   ) {
      if (var1 != null
         && var3 instanceof com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9
         && (var7 || !var8 || RRCRRCORICCHOHHIRCHIROOHIIOHCO(var4.getAsDouble(), var5))) {
         if (var2 == null) {
            var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, new Vector3f((float)var1.bridge$xCoord(), (float)var1.bridge$yCoord(), (float)var1.bridge$zCoord()));
         } else {
            var9.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var0,
               new Vector3f(
                  (float)(var1.bridge$xCoord() - var2.bridge$getX()),
                  (float)(var1.bridge$yCoord() - var2.bridge$getY()),
                  (float)(var1.bridge$zCoord() - var2.bridge$getZ())
               )
            );
         }
      }
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var0) {
      return var0.ICOIOIRCHCIOCHCOHOHIOOCORIICRO() <= 64.0F;
   }

   public static int HHCCIRHCCCIIRHCROHIORHIRHHIORH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var0) {
      float var1 = var0.ROIOORIOHOHIOIHRHCOCCCCORROIRH()[3];
      int var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$getGameSettings().bridge$getEffectiveRenderDistance();
      return var1 != 1.0F ? var2 : (int)Math.floor(Math.min(var2 * 16.0F, var0.RCRICHOCHHHCRCORROOIHCROOIICOC() + 0.5F) / 16.0F);
   }

   public static float CRRRICCRROCOHHOHIICIHORCOORRRH(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var0) {
      return var0.ICORRRIOCIIRICCCOIHCRRIORHOIIC() + 1.0F;
   }

   private static boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(double var0, long var2) {
      if (var0 < 256.0) {
         return true;
      } else if (var0 < 512.0) {
         return var2 % 4L != 0L;
      } else if (var0 < 1024.0) {
         return var2 % 3L != 0L;
      } else if (var0 < 2048.0) {
         return var2 % 2L == 0L;
      } else if (var0 < 4096.0) {
         return var2 % 3L == 0L;
      } else {
         return var0 < 8192.0 ? var2 % 4L == 0L : var2 % 5L == 0L;
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1,
      IRRCCOICORICIHCHRHIHIHROIRHOCR var2,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3
   ) {
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .HRICOCOIOCCCICCIORHIIIIOROCOHC();
      Vector3f[] var5 = var4.IOHCIORRIOICRRORHROOCCRICHOHRH();
      Vector3f[] var6 = new Vector3f[]{new Vector3f(var5[0]), new Vector3f(var5[1])};
      Vector3f[] var7 = new Vector3f[2];

      for (int var8 = 0; var8 < 2; var8++) {
         Vector3f var9 = var6[var8];
         var7[var8] = new Vector3f(
            var0.bridge$getTransformX(var9.x, var9.y, var9.z),
            var0.bridge$getTransformY(var9.x, var9.y, var9.z),
            var0.bridge$getTransformZ(var9.x, var9.y, var9.z)
         );
      }

      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7[0], var7[1]);
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2, var3);
      var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6[0], var6[1]);
   }
}
