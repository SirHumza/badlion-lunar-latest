package com.moonsworth.lunar.client.util;

import java.nio.FloatBuffer;
import java.util.function.BiConsumer;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector2d;
import org.joml.Vector3d;
import org.joml.Vector4f;

public final class CCRHOICIRORRHOOOCIHHHHCHCICHOH {
   public static final Matrix4f CCOOOIOCOIOOIRCIOHHCRCOIRHRRRC = new Matrix4f();
   private static final Matrix4f OIIORHIIRHRROOHIHORIRCHIIHCHIC = new Matrix4f();
   public static final Matrix4f OHRHORHIRHOOCCOOIHICHOCHHIRICR = new Matrix4f();
   private static final Matrix4f OHHRROOHICIIIIOCOOOOHOCHOCCRRC = new Matrix4f();
   private static final Matrix4f CICRRROHRHRORHHIROHOIRIRIHRRCI = new Matrix4f();
   private static final float[] CHRRIIIHOOCCIOIRHHCOIIROHHHCRO = new float[16];
   private static final float[] ORRIHIHCRIOCOHCICIHIOCCHCIHCRO = new float[16];
   private static final FloatBuffer CCOHIRRCOOOOOHIRHOHCIIHICROOCO = FloatBuffer.wrap(CHRRIIIHOOCCIOIRHHCOIIROHHHCRO);
   private static final FloatBuffer CHROOOHOIHCHCICCICOOHCOCOIROHO = FloatBuffer.wrap(ORRIHIHCRIOCOHCICIHIOCCHCIHCRO);
   private static int HIIOHOROHRCIOCRRIICOIOCOOROIIC;
   private static int OOCCHORROHRRIIIHCHHHRHIOOCCOII;
   private static double IIOOCHCHRHRRIRHHOHCCHIHRORCOHI;
   private static double CCIHCOCIRIOCCCRCCHCHRRCCOORROH;
   private static double IOIRHCHCCIRRROHCHIRCICIORRICCR;

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var0, double var2, double var4, BiConsumer<FloatBuffer, FloatBuffer> var6) {
      CRHHOOCRCOHHRHOOOCHCROOHIOOCOH var7 = com.moonsworth.lunar.client.IIHRRHORCRCROCHHOHORCHCROCIHRO.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.ROHHOOHOHCHRIICCCHCOHCORROHRIH();
      IIOOCHCHRHRRIRHHOHCCHIHRORCOHI = var0;
      CCIHCOCIRIOCCCRCCHCHRRCCOORROH = var2;
      IOIRHCHCCIRRROHCHIRCICIORRICCR = var4;
      HIIOHOROHRCIOCRRIICOIOCOOROIIC = var7.getScaledWidth();
      OOCCHORROHRRIIIHCHHHRHIOOCCOII = var7.getScaledHeight();
      var6.accept(CCOHIRRCOOOOOHIRHOHCIIHICROOCO, CHROOOHOIHCHCICCICOOHCOCOIROHO);
      OIIORHIIRHRROOHIHORIRCHIIHCHIC.set(CHRRIIIHOOCCIOIRHHCOIIROHHHCRO);
      OHRHORHIRHOOCCOOIHICHOCHHIRICR.set(ORRIHIHCRIOCOHCICIHIOCCHCIHCRO);
      OHRHORHIRHOOCCOOIHICHOCHHIRICR.invert(CICRRROHRHRORHHIROHOIRIRIHRRCI);
      OIIORHIIRHRROOHIHORIRCHIIHCHIC.invert(OHHRROOHICIIIIOCOOOOHOCHOCCRRC);
   }

   @Nullable
   private static Vector2d IOIICIRIICICIIOORHCIIIIRRIHRHI(float var0, float var1, float var2, float var3) {
      Vector4f var4 = new Vector4f(var0, var1, var2, var3);
      OIIORHIIRHRROOHIHORIRCHIIHCHIC.transform(var4);
      OHRHORHIRHOOCCOOIHICHOCHHIRICR.transform(var4);
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 39 ? !(var4.w >= 0.0F) : !(var4.w <= 0.0F)) {
         var4.x = var4.x / var4.w;
         var4.y = var4.y / var4.w;
         double var5 = (var4.x + 1.0) / 2.0 * HIIOHOROHRCIOCRRIICOIOCOOROIIC;
         double var7 = (1.0 - (var4.y + 1.0) / 2.0) * OOCCHORROHRRIIIHCHHHRHIOOCCOII;
         return new Vector2d(var5, var7);
      } else {
         return null;
      }
   }

   @Nullable
   public static Vector2d HCHRIROHHHCORIOCROOCHRCIOROOCI(double var0, double var2, double var4) {
      return IOIICIRIICICIIOORHCIIIIRRIHRHI(
         (float)(var0 - IIOOCHCHRHRRIRHHOHCCHIHRORCOHI), (float)(var2 - CCIHCOCIRIOCCCRCCHCHRRCCOORROH), (float)(var4 - IOIRHCHCCIRRROHCHIRCICIORRICCR), 1.0F
      );
   }

   public static Vector3d IHIRRIIORRHORHRORIHOROIRCORCOO(double var0, double var2) {
      float var4 = (float)(var0 / HIIOHOROHRCIOCRRIICOIOCOOROIIC * 2.0 - 1.0);
      float var5 = (float)((1.0 - var2 / OOCCHORROHRRIIIHCHHHRHIOOCCOII) * 2.0 - 1.0);
      Vector4f var6 = new Vector4f(var4, var5, -1.0F, 1.0F);
      Vector4f var7 = new Vector4f(var4, var5, 1.0F, 1.0F);
      CICRRROHRHRORHHIROHOIRIRIHRRCI.transform(var6);
      CICRRROHRHRORHHIROHOIRIRIHRRCI.transform(var7);
      if (var6.w != 0.0F && var7.w != 0.0F) {
         var6.div(var6.w);
         var7.div(var7.w);
         OHHRROOHICIIIIOCOOOOHOCHOCCRRC.transform(var6);
         OHHRROOHICIIIIOCOOOOHOCHOCCRRC.transform(var7);
         if (var6.w != 0.0F && var7.w != 0.0F) {
            var6.div(var6.w);
            var7.div(var7.w);
            Vector3d var8 = new Vector3d(var7.x - var6.x, var7.y - var6.y, var7.z - var6.z).normalize();
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 39) {
               var8.negate();
            }

            return var8;
         } else {
            return new Vector3d(0.0, 0.0, -1.0);
         }
      } else {
         return new Vector3d(0.0, 0.0, -1.0);
      }
   }

   public static Vector3d OIIHIIHCOHIIOICCIIHCHOROICHCRO() {
      return new Vector3d(IIOOCHCHRHRRIRHHOHCCHIHRORCOHI, CCIHCOCIRIOCCCRCCHCHRRCCOORROH, IOIRHCHCCIRRROHCHIRCICIORRICCR);
   }

   @Generated
   private CCRHOICIRORRHOOOCIHHHHCHCICHOH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   @Generated
   public static int getScaledWidth() {
      return HIIOHOROHRCIOCRRIICOIOCOOROIIC;
   }

   @Generated
   public static int getScaledHeight() {
      return OOCCHORROHRRIIIHCHHHRHIOOCCOII;
   }
}
