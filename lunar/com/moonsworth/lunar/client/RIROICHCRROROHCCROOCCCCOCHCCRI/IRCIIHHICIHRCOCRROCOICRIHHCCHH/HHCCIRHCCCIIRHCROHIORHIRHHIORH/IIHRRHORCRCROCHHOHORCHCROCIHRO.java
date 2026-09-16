package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRRCCOICORICIHCHRHIHIHROIRHOCR;
import java.awt.Color;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.IntConsumer;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   private static final IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH HOHIHRRCRHRCRHIOICROHIRROCRRHR = new IIHRRHORCRCROCHHOHORCHCROCIHRO.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   private static ByteBuffer OIHRRIIHOCRHIICCCHHHCCIRHRRCRH = null;
   private static final Map<com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH, IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> HRRHHOOCIOROROCIRIHHRCCCHOHIOO = new WeakHashMap<>();

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 5)
   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var0) {
      IRRCCOICORICIHCHRHIHIHROIRHOCR var1 = var0.HIIIOOOORHRCHOCCCRIICORHHCRORR().get(var0.IOOOIRHOHCOIIOCOCROCCOHCOOORHR());
      GL11.glShadeModel(7425);
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = var0.RCCIRCCCIICOCRRHCICIOIHROCHHHH();
      IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = HRRHHOOCIOROROCIRIHHRCCCHOHIOO.computeIfAbsent(
         var2, var0x -> new IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()
      );
      float[] var4 = var0.HCRRIOCCIRCCHROCIIORRHIICHIRCH() ? var3.OOIRHHIHRCCHCICROOHCCCOCIICRII : var3.RCRRCIIOOORIOCHOIORHHORHRHRIOC;
      int var5;
      if (var4 == null) {
         for (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7 : var2.RRHHORIIRIROCCRCHHIOICHCCOCRCH) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var7, var0.OCHCIOIOOROICOHCCHRIHHOCRRHORH() == IHHCHHHCRIHOOCOIOOCRIIICIOROIR.EMISSIVE, false, var0.HCRRIOCCIRCCHROCIIORRHIICHIRCH()
            );
         }

         com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCHHROCIRRRICRHROHROHOCCCHOIOH;
         if (var9.size == 0) {
            return;
         }

         var4 = var9.RCRRCIIOOORIOCHOIORHHORHRHRIOC;
         var5 = var9.size;
         var9.size = 0;
         float[] var12 = new float[var5];
         System.arraycopy(var4, 0, var12, 0, var5);
         if (var0.HCRRIOCCIRCCHROCIIORRHIICHIRCH()) {
            var3.OOIRHHIHRCCHCICROOHCCCOCIICRII = var12;
         } else {
            var3.RCRRCIIOOORIOCHOIORHHORHRHRIOC = var12;
         }
      } else {
         var5 = var4.length;
         int var10 = 0;

         for (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var8 : var2.RRHHORIIRIROCCRCHHIOICHCCOCRCH) {
            var10 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var8,
               var0.OCHCIOIOOROICOHCCHRIHHOCRRHORH() == IHHCHHHCRIHOOCOIOOCRIIICIOROIR.EMISSIVE,
               var4,
               var10,
               false,
               var0.HCRRIOCCIRCCHROCIIORRHIICHIRCH()
            );
         }
      }

      ByteBuffer var11 = OIHRRIIHOCRHIICCCHHHCCIRHRRCRH;
      if (var11 == null || var11.capacity() < var5 * 4) {
         OIHRRIIHOCRHIICCCHHHCCIRHRRCRH = var11 = BufferUtils.createByteBuffer(var5 * 4);
      }

      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
         .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
         .CRICCOOHHHCHOORCICOCOHIHOIRHOO(
            var0.HRIRCIHIHIIHRHIRROROOOHOOCOCOC().getRed() / 255.0F,
            var0.HRIRCIHIHIIHRHIRROROOOHOOCOCOC().getGreen() / 255.0F,
            var0.HRIRCIHIHIIHRHIRROROOOHOOCOCOC().getBlue() / 255.0F,
            var0.HRIRCIHIHIIHRHIRROROOOHOOCOCOC().getAlpha() / 255.0F
         );
      var11.asFloatBuffer().put(var4, 0, var5);
      var1.bridge$setupRenderState();
      GL11.glEnableClientState(32884);
      GL11.glVertexPointer(3, 5126, 24, var11);
      GL11.glEnableClientState(32888);
      var11.position(12);
      GL11.glTexCoordPointer(2, 5126, 24, var11);
      GL11.glEnableClientState(32885);
      var11.position(20);
      GL11.glNormalPointer(5120, 24, var11);
      GL11.glDrawArrays(7, 0, var5 / 6);
      if (var0.OCHCIOIOOROICOHCCHRIHHOCRRHORH() == IHHCHHHCRIHOOCOIOOCRIIICIOROIR.NORMAL_GLINT) {
         HIOCCRCCCRICORCIIHHRIRROICHRIC(var5);
      }

      GL11.glDisableClientState(32885);
      GL11.glDisableClientState(32888);
      GL11.glDisableClientState(32884);
      var11.position(0);
      var1.bridge$clearRenderState();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 5)
   private static void HIOCCRCCCRICORCIIHHRIRROICHRIC(int var0) {
      if (HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HCROIHIIHRIOHIORRORHHROHOOIIIH()) {
         IntConsumer var2 = var1x -> {
            Color var2x = new Color(var1x);
            com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
               .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
               .CRICCOOHHHCHOORCICOCOHIHOIRHOO(var2x.getRed() / 255.0F, var2x.getGreen() / 255.0F, var2x.getBlue() / 255.0F, var2x.getAlpha() / 255.0F);
            GL11.glDrawArrays(7, 0, var0 / 6);
         };
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
      } else {
         Color var1 = HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHHRIOHRROOOCOICCICIOIOIIOCRHH();
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH()
            .COIIIOIIOHICCOCIOROOHIIHHIOIOR()
            .CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1.getRed() / 255.0F, var1.getGreen() / 255.0F, var1.getBlue() / 255.0F, var1.getAlpha() / 255.0F);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.OROCHHOHIIICHRRRORROHCOHIORORH();
         GL11.glDrawArrays(7, 0, var0 / 6);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.IHRHOHCCHHOCRRICIHIROOCRCCIROO();
         GL11.glDrawArrays(7, 0, var0 / 6);
         HICHRCOHCCRHOHCICOOCHOIHCCHIRI.ROHORCCCOROICIHRIHCRIICIRHOOOR();
      }
   }

   private static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      boolean var1,
      float[] var2,
      int var3,
      boolean var4,
      boolean var5
   ) {
      HOHIHRRCRHRCRHIOICROHIRROCRRHR.push();
      CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, HOHIHRRCRHRCRHIOICROHIRROCRRHR.HCORIHRIOCHROCOOROCICIHOCCIOCI());
      List var6 = var0.HOCHRCRIHOIHCIIOHRRORICICORIOO;
      int var7 = 0;

      for (int var8 = var6.size(); var7 < var8; var7++) {
         com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var9 = (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var6.get(
            var7
         );
         HOHIHRRCRHRCRHIOICROHIRROCRRHR.push();
         var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, var1, var2, var3, var0.isHidden | var4, var5);
         HOHIHRRCRHRCRHIOICROHIRROCRRHR.pop();
      }

      List var10 = var0.IOHORIRHHROHCHIIOHRHRROCICIHHR;
      int var11 = 0;

      for (int var12 = var10.size(); var11 < var12; var11++) {
         var3 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var10.get(
               var11
            ),
            var1,
            var2,
            var3,
            var0.isHidden | var4,
            var5
         );
      }

      HOHIHRRCRHRCRHIOICROHIRROCRRHR.pop();
      return var3;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0,
      boolean var1,
      boolean var2,
      boolean var3
   ) {
      HOHIHRRCRHRCRHIOICROHIRROCRRHR.push();
      CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, HOHIHRRCRHRCRHIOICROHIRROCRRHR.HCORIHRIOCHROCOOROCICIHOCCIOCI());
      List var4 = var0.HOCHRCRIHOIHCIIOHRRORICICORIOO;
      int var5 = 0;

      for (int var6 = var4.size(); var5 < var6; var5++) {
         com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH)var4.get(
            var5
         );
         HOHIHRRCRHRCRHIOICROHIRROCRRHR.push();
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var1, var0.isHidden | var2, var3);
         HOHIHRRCRHRCRHIOICROHIRROCRRHR.pop();
      }

      List var8 = var0.IOHORIRHHROHCHIIOHRHRROCICIHHR;
      int var9 = 0;

      for (int var10 = var8.size(); var9 < var10; var9++) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var8.get(
               var9
            ),
            var1,
            var0.isHidden | var2,
            var3
         );
      }

      HOHIHRRCRHRCRHIOICROHIRROCRRHR.pop();
   }

   private static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      boolean var1,
      float[] var2,
      int var3,
      boolean var4,
      boolean var5
   ) {
      CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, HOHIHRRCRHRCRHIOICROHIRROCRRHR.HCORIHRIOCHROCOOROCICIHOCCIOCI());
      Vector3f var6 = new Vector3f();
      Matrix4f var7 = HOHIHRRCRHRCRHIOICROHIRROCRRHR.HCORIHRIOCHROCOOROCICIHOCCIOCI();

      for (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var11 : var0.CCHIOCRCOIRHHRHICRHRRHRCRCHIRR) {
         if (var11 != null) {
            if (var4) {
               var2[var3] = var2[var3 + 2] = 0.0F;
               var2[var3 + 6] = var2[var3 + 8] = 0.0F;
               var2[var3 + 12] = var2[var3 + 14] = 0.0F;
               var2[var3 + 18] = var2[var3 + 20] = 0.0F;
               var3 += 24;
            } else {
               float var12;
               if (var1) {
                  var12 = Float.intBitsToFloat(8355711);
               } else {
                  var7.transformDirection(var11.RIHORHHHIOHROICOOCIHOIHHHHCHOR, var6);
                  if ((var0.HROHOIICORHIIRORRORCOHCHHRIIHH.y == 0.0F || var0.HROHOIICORHIIRORRORCOHCHHRIIHH.z == 0.0F) && var6.x < 0.0F) {
                     var6.x *= -1.0F;
                  }

                  if ((var0.HROHOIICORHIIRORRORCOHCHHRIIHH.x == 0.0F || var0.HROHOIICORHIIRORRORCOHCHHRIIHH.z == 0.0F) && var6.y < 0.0F) {
                     var6.y *= -1.0F;
                  }

                  if ((var0.HROHOIICORHIIRORRORCOHCHHRIIHH.x == 0.0F || var0.HROHOIICORHIIRORRORCOHCHHRIIHH.y == 0.0F) && var6.z < 0.0F) {
                     var6.z *= -1.0F;
                  }

                  int var13 = ((int)(var6.x * 127.0F) & 0xFF) << 24;
                  var13 |= ((int)(var6.y * 127.0F) & 0xFF) << 16;
                  var13 |= ((int)(var6.z * 127.0F) & 0xFF) << 8;
                  var12 = Float.intBitsToFloat(Integer.reverseBytes(var13));
               }

               int[] var24 = var11.OIIHIOIORRHHRCRRCCORRHHCHRHORH(var5);
               Vector3f var14 = var11.COROIIIORHCIHRHICOROCOHORHOHRO[var24[0]].RORHCIIHHROOIOHIORIHCRHOHRROCI;
               Vector3f var15 = var11.COROIIIORHCIHRHICOROCOHORHOHRO[var24[1]].RORHCIIHHROOIOHIORIHCRHOHRROCI;
               Vector3f var16 = var11.COROIIIORHCIHRHICOROCOHORHOHRO[var24[2]].RORHCIIHHROOIOHIORIHCRHOHRROCI;
               Vector3f var17 = var11.COROIIIORHCIHRHICOROCOHORHOHRO[var24[3]].RORHCIIHHROOIOHIORIHCRHOHRROCI;
               float var18 = var7.m00();
               float var19 = var7.m10();
               float var20 = var7.m20();
               float var21 = var7.m30();
               var2[var3] = var18 * var14.x + var19 * var14.y + var20 * var14.z + var21;
               var2[var3 + 6] = var18 * var15.x + var19 * var15.y + var20 * var15.z + var21;
               var2[var3 + 12] = var18 * var16.x + var19 * var16.y + var20 * var16.z + var21;
               var2[var3 + 18] = var18 * var17.x + var19 * var17.y + var20 * var17.z + var21;
               var18 = var7.m01();
               var19 = var7.m11();
               var20 = var7.m21();
               var21 = var7.m31();
               var2[var3 + 1] = var18 * var14.x + var19 * var14.y + var20 * var14.z + var21;
               var2[var3 + 7] = var18 * var15.x + var19 * var15.y + var20 * var15.z + var21;
               var2[var3 + 13] = var18 * var16.x + var19 * var16.y + var20 * var16.z + var21;
               var2[var3 + 19] = var18 * var17.x + var19 * var17.y + var20 * var17.z + var21;
               var18 = var7.m02();
               var19 = var7.m12();
               var20 = var7.m22();
               var21 = var7.m32();
               var2[var3 + 2] = var18 * var14.x + var19 * var14.y + var20 * var14.z + var21;
               var2[var3 + 8] = var18 * var15.x + var19 * var15.y + var20 * var15.z + var21;
               var2[var3 + 14] = var18 * var16.x + var19 * var16.y + var20 * var16.z + var21;
               var2[var3 + 20] = var18 * var17.x + var19 * var17.y + var20 * var17.z + var21;
               var2[var3 + 5] = var2[var3 + 11] = var2[var3 + 17] = var2[var3 + 23] = var12;
               var3 += 24;
            }
         }
      }

      return var3;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0,
      boolean var1,
      boolean var2,
      boolean var3
   ) {
      float var4 = var2 ? 0.0F : 1.0F;
      CIOHHCORHRCCRICCCORIHCRHCCCRRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, HOHIHRRCRHRCRHIOICROHIRROCRRHR.HCORIHRIOCHROCOOROCICIHOCCIOCI());
      com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = com.moonsworth.lunar.client.util.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCHHROCIRRRICRHROHROHOCCCHOIOH;
      Vector3f var6 = new Vector3f();
      Vector3f var7 = new Vector3f();
      Matrix4f var8 = HOHIHRRCRHRCRHIOICROHIRROCRRHR.HCORIHRIOCHROCOOROCICIHOCCIOCI();

      for (com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH var12 : var0.CCHIOCRCOIRHHRHICRHRRHRCRCHIRR) {
         if (var12 != null) {
            float var13;
            if (!var1) {
               var8.transformDirection(var12.RIHORHHHIOHROICOOCIHOIHHHHCHOR, var6);
               if ((var0.HROHOIICORHIIRORRORCOHCHHRIIHH.y == 0.0F || var0.HROHOIICORHIIRORRORCOHCHHRIIHH.z == 0.0F) && var6.x < 0.0F) {
                  var6.x *= -1.0F;
               }

               if ((var0.HROHOIICORHIIRORRORCOHCHHRIIHH.x == 0.0F || var0.HROHOIICORHIIRORRORCOHCHHRIIHH.z == 0.0F) && var6.y < 0.0F) {
                  var6.y *= -1.0F;
               }

               if ((var0.HROHOIICORHIIRORRORCOHCHHRIIHH.x == 0.0F || var0.HROHOIICORHIIRORRORCOHCHHRIIHH.y == 0.0F) && var6.z < 0.0F) {
                  var6.z *= -1.0F;
               }

               int var14 = ((int)(var6.x * 127.0F) & 0xFF) << 24;
               var14 |= ((int)(var6.y * 127.0F) & 0xFF) << 16;
               var14 |= ((int)(var6.z * 127.0F) & 0xFF) << 8;
               var13 = Float.intBitsToFloat(Integer.reverseBytes(var14));
            } else {
               var13 = Float.intBitsToFloat(8355711);
            }

            var5.OOCHRIIIRIHRRCRIORHCROIIHCRRIC(24);
            float[] var24 = var5.RCRRCIIOOORIOCHOIORHHORHRHRIOC;
            int var15 = var5.size;

            for (int var19 : var12.OIIHIOIORRHHRCRRCCORRHHCHRHORH(var3)) {
               com.moonsworth.lunar.client.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var20 = var12.COROIIIORHCIHRHICOROCOHORHOHRO[var19];
               Vector3f var21 = var20.RORHCIIHHROOIOHIORIHCRHOHRROCI;
               var8.transformPosition(var21.x, var21.y, var21.z, var7);
               var24[var15] = var7.x * var4;
               var24[var15 + 1] = var7.y * var4;
               var24[var15 + 2] = var7.z * var4;
               var24[var15 + 3] = var20.CRRCHRCROCHIICROIROHCOIORROOCI;
               var24[var15 + 4] = var20.OOCHRRHHIHRCCIICOIOCRHIIIIOIIR;
               var24[var15 + 5] = var13;
               var15 += 6;
            }

            var5.size += 24;
         }
      }
   }

   public static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      public Matrix4f[] OOCHOOOIHIIIHCRCHOOIRCIIICRCOC = new Matrix4f[32];
      public int index = 0;

      public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         this.OOCHOOOIHIIIHCRCHOOIRCIIICRCOC[0] = new Matrix4f();
      }

      public void push() {
         Matrix4f var1 = this.OOCHOOOIHIIIHCRCHOOIRCIIICRCOC[this.index++];
         Matrix4f var2 = this.OOCHOOOIHIIIHCRCHOOIRCIIICRCOC[this.index];
         if (var2 == null) {
            this.OOCHOOOIHIIIHCRCHOOIRCIIICRCOC[this.index] = var2 = new Matrix4f();
         }

         var2.set(var1);
      }

      public void pop() {
         this.index--;
      }

      public Matrix4f HCORIHRIOCHROCOOROCICIHOCCIOCI() {
         return this.OOCHOOOIHIIIHCRCHOOIRCIIICRCOC[this.index];
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private float[] RCRRCIIOOORIOCHOIORHHORHRHRIOC = null;
      private float[] OOIRHHIHRCCHCICROOHCCCOCIICRII = null;
   }
}
