package com.moonsworth.lunar.client.HICHRCOHCCRHOHCICOOCHOIHCCHIRI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.OCOHORHCROHICRRIHCIHHRRCIHICRI;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.lwjgl.nanovg.NSVGImage;
import org.lwjgl.nanovg.NVGColor;
import org.lwjgl.nanovg.NVGPaint;
import org.lwjgl.nanovg.NanoSVG;
import org.lwjgl.nanovg.NanoVG;
import org.lwjgl.nanovg.NanoVGGL2;
import org.lwjgl.nanovg.NanoVGGL3;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryUtil;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   public static final int DEFAULT_FLAGS = 7;
   private static final Map<String, CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> CHOOHCRHICHHHROIIICOIOROCIHCHO = new HashMap<>();
   private static long CCHRORICHHHHIORHHRHROOOHHRICRI = -1L;

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      OCOHORHCROHICRRIHCIHHRRCIHICRI var0, Consumer<CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> var1
   ) {
      boolean var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().IHOCROCOHHORCOIHOCIOICCHOHRRRH();
      if (CCHRORICHHHHIORHHRHROOOHHRICRI == -1L) {
         CCHRORICHHHHIORHHRHROOOHHRICRI = var2 ? NanoVGGL3.nvgCreate(1) : NanoVGGL2.nvgCreate(1);
         if (CCHRORICHHHHIORHHRHROOOHHRICRI <= 0L) {
            throw new RuntimeException("Failed to create nvg context");
         }
      }

      RRCRRCORICCHOHHIRCHIROOHIIOHCO var3 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHRCROHROHOCCHIHOHRROHOCOIRHIO();
      var0.push();
      int var4 = GL11.glGetInteger(32873);
      int var5 = GL11.glGetInteger(32969);
      int var6 = GL11.glGetInteger(32968);
      int var7 = GL11.glGetInteger(32971);
      int var8 = GL11.glGetInteger(32970);
      int var9 = var2 ? GL11.glGetInteger(34962) : -1;
      int var10 = var2 ? GL11.glGetInteger(34229) : -1;
      boolean var11 = var0.RRROIHOIHOORCCOHOOCHRRRCIIRHHH();
      boolean var12 = GL11.glIsEnabled(2884);
      boolean var13 = GL11.glIsEnabled(2929);
      NanoVG.nvgBeginFrame(CCHRORICHHHHIORHHRHROOOHHRICRI, var3.bridge$displayWidth(), var3.bridge$displayHeight(), 1.0F);
      var1.accept(new CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH());
      NanoVG.nvgEndFrame(CCHRORICHHHHIORHHRHROOOHHRICRI);
      var0.pop();
      if (var13) {
         GL11.glEnable(2929);
      } else {
         GL11.glDisable(2929);
      }

      if (var12) {
         GL11.glEnable(2884);
      } else {
         GL11.glDisable(2884);
      }

      if (var11) {
         GL11.glEnable(3042);
      } else {
         GL11.glDisable(3042);
      }

      GL14.glBlendFuncSeparate(var5, var6, var7, var8);
      GL11.glBindTexture(3553, var4);
      if (var2) {
         GL15.glBindBuffer(34962, var9);
         GL30.glBindVertexArray(var10);
      }
   }

   public static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      @Nullable
      private static InputStream RHCHRCOCCOIIIHCHRHIRCORHRHRICR(RCIROOOOICRHCCRRCIORHHIRCOIIIC var0) {
         com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI()
            .bridge$getResourceManager()
            .bridge$getResource(var0);
         return var1 != null
            ? var1.bridge$getInputStream()
            : CRRRICCRROCOHHOHIICIHORCOORRRH.class
               .getClassLoader()
               .getResourceAsStream(String.format("assets/%s/%s", var0.bridge$getDomain(), var0.bridge$getPath()));
      }

      @Nullable
      private CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, float var2, float var3
      ) {
         try {
            return CRRRICCRROCOHHOHIICIHORCOORRRH.CHOOHCRHICHHHROIIICOIOROCIHCHO
               .computeIfAbsent(
                  String.format("%s-%s-%sx%s", var1.bridge$getDomain(), var1.bridge$getPath(), var2, var3),
                  var3x -> {
                     NSVGImage var4;
                     try {
                        InputStream var5x = RHCHRCOCCOIIIHCHRHIRCORHRHRICR(var1);
                        if (var5x == null) {
                           return null;
                        }

                        StringBuilder var6 = new StringBuilder();

                        String var8;
                        try (BufferedReader var7 = new BufferedReader(new InputStreamReader(var5x))) {
                           while ((var8 = var7.readLine()) != null) {
                              var6.append(var8);
                           }
                        }

                        var4 = NanoSVG.nsvgParse(var6.toString(), "px", 96.0F);
                     } catch (IOException var15) {
                        return null;
                     }

                     if (var4 == null) {
                        return null;
                     }

                     long var16 = NanoSVG.nsvgCreateRasterizer();
                     float var17 = var4.width();
                     float var19 = var4.height();
                     float var9 = Math.max(var2 / var17, var3 / var19);
                     var17 *= var9;
                     var19 *= var9;
                     int var10 = (int)var17;
                     int var11 = (int)var19;
                     ByteBuffer var12 = MemoryUtil.memAlloc(var10 * var11 * 4);
                     NanoSVG.nsvgRasterize(var16, var4, 0.0F, 0.0F, var9, var12, var10, var11, var10 * 4);
                     NanoSVG.nsvgDeleteRasterizer(var16);
                     NanoSVG.nsvgDelete(var4);
                     return new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        NanoVG.nvgCreateImageRGBA(CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI, var10, var11, 7, var12), var10, var11
                     );
                  }
               );
         } catch (Throwable var5) {
            throw var5;
         }
      }

      public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(float var1, float var2, float var3, float var4, int var5) {
         NanoVG.nvgBeginPath(CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI);
         NanoVG.nvgRect(CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI, var1, var2, var3, var4);
         NVGColor var6 = this.ICORIROICCORCRROCRCIRRRHHHOOIR(var5);

         try {
            NanoVG.nvgFillColor(CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI, var6);
            NanoVG.nvgFill(CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI);
         } catch (Throwable var10) {
            if (var6 != null) {
               try {
                  var6.close();
               } catch (Throwable var9) {
                  var10.addSuppressed(var9);
               }
            }

            throw var10;
         }

         if (var6 != null) {
            var6.close();
         }
      }

      public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1, float var2, float var3, float var4, float var5) {
         CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var4, var5);
         if (var6 != null && var6.RHICICHIIICRHORROICHICCOICHOCC != null) {
            NVGPaint var7 = NVGPaint.calloc();

            try {
               NanoVG.nvgBeginPath(CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI);
               NanoVG.nvgImagePattern(
                  CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI,
                  var2,
                  var3,
                  var6.OHROCIOOOCRIOOCCOCOOCCIOIRCIII,
                  var6.HCOOHCIOIRRORHCRRCRIHHHOOCOCCH,
                  0.0F,
                  var6.RHICICHIIICRHORROICHICCOICHOCC,
                  1.0F,
                  var7
               );
               NanoVG.nvgRect(
                  CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI,
                  var2,
                  var3,
                  var6.OHROCIOOOCRIOOCCOCOOCCIOIRCIII,
                  var6.HCOOHCIOIRRORHCRRCRIHHHOOCOCCH
               );
               NanoVG.nvgFillPaint(CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI, var7);
               NanoVG.nvgFill(CRRRICCRROCOHHOHIICIHORCOORRRH.CCHRORICHHHHIORHHRHROOOHHRICRI);
            } catch (Throwable var11) {
               if (var7 != null) {
                  try {
                     var7.close();
                  } catch (Throwable var10) {
                     var11.addSuppressed(var10);
                  }
               }

               throw var11;
            }

            if (var7 != null) {
               var7.close();
            }
         }
      }

      public NVGColor ICORIROICCORCRROCRCIRRRHHHOOIR(int var1) {
         NVGColor var2 = NVGColor.calloc();
         NanoVG.nvgRGBA((byte)(var1 >> 16 & 0xFF), (byte)(var1 >> 8 & 0xFF), (byte)(var1 & 0xFF), (byte)(var1 >> 24 & 0xFF), var2);
         return var2;
      }
   }

   public record RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      private final Integer RHICICHIIICRHORROICHICCOICHOCC;
      private final int OHROCIOOOCRIOOCCOCOOCCIOIRCIII;
      private final int HCOOHCIOIRRORHCRRCRIHHHOOCOCCH;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Integer var1, int var2, int var3) {
         this.RHICICHIIICRHORROICHICCOICHOCC = var1;
         this.OHROCIOOOCRIOOCCOCOOCCIOIRCIII = var2;
         this.HCOOHCIOIRRORHCRRCRIHHHOOCOCCH = var3;
      }

      public Integer HOIIRCOOOHCRCHRHOHROOHHCHHRCRI() {
         return this.RHICICHIIICRHORROICHICCOICHOCC;
      }

      public int OOIRCOCROHROCRHRICCHIHORHROHII() {
         return this.OHROCIOOOCRIOOCCOCOOCCIOIRCIII;
      }

      public int ORCOCCCOOOOCROCIHIRIICOIHCIRHR() {
         return this.HCOOHCIOIRRORHCRRCRIHHHOOCOCCH;
      }
   }
}
