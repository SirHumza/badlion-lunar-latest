package com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import java.nio.FloatBuffer;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.List;
import javax.vecmath.Matrix3f;
import org.lwjgl.BufferUtils;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   public static final FloatBuffer HHROICOIHCHHCHROCRIIHOHOIHOIRH = BufferUtils.createFloatBuffer(16);
   public static final float[] HRCOIIOOHHRIOOCICROCIOOOORRRHC = new float[16];

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var0,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1,
      List<HRCHROOHRIHCRCRHRIIROCIRHOIRHH> var2
   ) {
      if (!var2.isEmpty()) {
         if (com.moonsworth.lunar.client.ORHIOICIOCRRHOOCOHRORIHICHRCRR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHIORHHICIIRRCOCORRROIOOOCORCR()
            )
          {
            var2.sort((var1x, var2x) -> {
               double var3x = var1x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
               double var5x = var2x.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
               if (var3x < var5x) {
                  return 1;
               } else {
                  return var3x > var5x ? -1 : 0;
               }
            });
         }

         EnumMap var3 = new EnumMap<>(RRCRRCORICCHOHHIRCHIROOHIIOHCO.class);

         for (HRCHROOHRIHCRCRHRIIROCIRHOIRHH var5 : var2) {
            var3.computeIfAbsent(var5.CCHRCOHOCCROCHIOHRHICIIRCRCICC(), var0x -> new LinkedList<>()).add(var5);
         }

         if (HHCCIRHCCCIIRHCROHIORHIRHHIORH.CIIOORORHHCCHICIRRROIHICRCOOCR && var0.OCICRRCHRIRORHIRHIHOIRCCIHCHRH()) {
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO()
               .bridge$getGameRenderer()
               .bridge$disableLightmap();
         }

         var0.push();
         List var8 = (List)var3.get(RRCRRCORICCHOHHIRCHIROOHIIOHCO.PARTICLE);
         if (var8 != null && !var8.isEmpty()) {
            for (HRCHROOHRIHCRCRHRIIROCIRHOIRHH var6 : var8) {
               var6.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
            }
         }

         List var10 = (List)var3.get(RRCRRCORICCHOHHIRCHIROOHIIOHCO.BLOCK);
         if (var10 != null && !var10.isEmpty()) {
            for (HRCHROOHRIHCRCRHRIIROCIRHOIRHH var7 : var10) {
               var7.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
            }
         }

         var0.pop();
      }
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OCOHORHCROHICRRIHCIHHRRCIHICRI var0, Matrix3f var1) {
      float var2 = RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var1.m00, var1.m10, var1.m20);
      float var3 = RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var1.m01, var1.m11, var1.m21);
      float var4 = RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var1.m02, var1.m12, var1.m22);
      var0.scale(var2, var3, var4);
      Matrix3f var5 = new Matrix3f();
      if (var2 != 0.0F) {
         var5.m00 = var1.m00 / var2;
         var5.m10 = var1.m10 / var2;
         var5.m20 = var1.m20 / var2;
      }

      if (var3 != 0.0F) {
         var5.m01 = var1.m01 / var3;
         var5.m11 = var1.m11 / var3;
         var5.m21 = var1.m21 / var3;
      }

      if (var4 != 0.0F) {
         var5.m02 = var1.m02 / var4;
         var5.m12 = var1.m12 / var4;
         var5.m22 = var1.m22 / var4;
      }

      float var6 = (float)Math.atan2(var5.m20, var5.m00);
      float var7 = (float)Math.atan2(-var5.m10, Math.sqrt(var5.m00 * var5.m00 + var5.m20 * var5.m20));
      float var8 = (float)Math.atan2(var5.m12, var5.m11);
      var0.RRCRRCORICCHOHHIRCHIROOHIIOHCO((float)Math.toDegrees(var6), 0.0F, 1.0F, 0.0F);
      var0.RRCRRCORICCHOHHIRCHIROOHIIOHCO((float)Math.toDegrees(var7), 1.0F, 0.0F, 0.0F);
      var0.RRCRRCORICCHOHHIRCHIROOHIIOHCO((float)Math.toDegrees(var8), 0.0F, 0.0F, 1.0F);
   }

   private static float RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(float var0, float var1, float var2) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1 + var2 * var2);
   }
}
