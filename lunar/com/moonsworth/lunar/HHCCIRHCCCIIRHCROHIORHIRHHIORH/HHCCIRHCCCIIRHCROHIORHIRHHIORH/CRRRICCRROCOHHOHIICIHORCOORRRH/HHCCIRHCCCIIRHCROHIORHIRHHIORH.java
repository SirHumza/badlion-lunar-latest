package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.File;
import lombok.Generated;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 6)
public interface HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   int bridge$getWidth();

   int bridge$getHeight();

   void bridge$checkAllocated();

   long bridge$getPixels();

   long bridge$size();

   void bridge$close();

   void bridge$writeToFile(File var1);

   HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getFormat();

   enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      RGBA(4, true, true, true, false, true, 0, 8, 16, 255, 24, true),
      RGB(3, true, true, true, false, false, 0, 8, 16, 255, 255, true),
      LUMINANCE_ALPHA(2, false, false, false, true, true, 255, 255, 255, 0, 8, true),
      LUMINANCE(1, false, false, false, true, false, 0, 0, 0, 0, 255, true);

      private final int components;
      private final boolean hasRed;
      private final boolean hasGreen;
      private final boolean hasBlue;
      private final boolean hasLuminance;
      private final boolean hasAlpha;
      private final int redOffset;
      private final int greenOffset;
      private final int blueOffset;
      private final int luminanceOffset;
      private final int alphaOffset;
      private final boolean supportedByStb;

      public boolean hasLuminanceOrRed() {
         return this.hasLuminance || this.hasRed;
      }

      public boolean hasLuminanceOrGreen() {
         return this.hasLuminance || this.hasGreen;
      }

      public boolean hasLuminanceOrBlue() {
         return this.hasLuminance || this.hasBlue;
      }

      public boolean hasLuminanceOrAlpha() {
         return this.hasLuminance || this.hasAlpha;
      }

      public int luminanceOrRedOffset() {
         return this.hasLuminance ? this.luminanceOffset : this.redOffset;
      }

      public int luminanceOrGreenOffset() {
         return this.hasLuminance ? this.luminanceOffset : this.greenOffset;
      }

      public int luminanceOrBlueOffset() {
         return this.hasLuminance ? this.luminanceOffset : this.blueOffset;
      }

      public int luminanceOrAlphaOffset() {
         return this.hasLuminance ? this.luminanceOffset : this.alphaOffset;
      }

      public static HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH getStbFormat(int var0) {
         return switch (var0) {
            case 1 -> LUMINANCE;
            case 2 -> LUMINANCE_ALPHA;
            case 3 -> RGB;
            default -> RGBA;
         };
      }

      @Generated
      public int components() {
         return this.components;
      }

      @Generated
      public boolean hasRed() {
         return this.hasRed;
      }

      @Generated
      public boolean hasGreen() {
         return this.hasGreen;
      }

      @Generated
      public boolean hasBlue() {
         return this.hasBlue;
      }

      @Generated
      public boolean hasLuminance() {
         return this.hasLuminance;
      }

      @Generated
      public boolean hasAlpha() {
         return this.hasAlpha;
      }

      @Generated
      public int redOffset() {
         return this.redOffset;
      }

      @Generated
      public int greenOffset() {
         return this.greenOffset;
      }

      @Generated
      public int blueOffset() {
         return this.blueOffset;
      }

      @Generated
      public int luminanceOffset() {
         return this.luminanceOffset;
      }

      @Generated
      public int alphaOffset() {
         return this.alphaOffset;
      }

      @Generated
      public boolean supportedByStb() {
         return this.supportedByStb;
      }

      @Generated
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         int var3, boolean var4, boolean var5, boolean var6, boolean var7, boolean var8, int var9, int var10, int var11, int var12, int var13, boolean var14
      ) {
         this.components = var3;
         this.hasRed = var4;
         this.hasGreen = var5;
         this.hasBlue = var6;
         this.hasLuminance = var7;
         this.hasAlpha = var8;
         this.redOffset = var9;
         this.greenOffset = var10;
         this.blueOffset = var11;
         this.luminanceOffset = var12;
         this.alphaOffset = var13;
         this.supportedByStb = var14;
      }
   }
}
