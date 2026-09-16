package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   POINTS(0, 0, 1, 1, false),
   LINES(4, 1, 2, 2, false),
   LINE_LOOP(6, 2, 2, 1, true),
   LINE_STRIP(5, 3, 2, 1, true),
   TRIANGLES(4, 4, 3, 3, false),
   TRIANGLE_STRIP(5, 5, 3, 1, true),
   TRIANGLE_FAN(6, 6, 3, 1, true),
   QUADS(4, 7, 7, 4, false),
   DEBUG_LINES(1, 1, 2, 2, false),
   DEBUG_LINE_STRIP(3, 3, 2, 1, true);

   private final int mcGLMode;
   private final int realGLMode;
   private final int primitiveLength;
   private final int primitiveStride;
   private final boolean connectedPrimitives;

   public int indexCount(int var1) {
      return switch (this) {
         case LINE_STRIP, DEBUG_LINES, DEBUG_LINE_STRIP, TRIANGLES, TRIANGLE_STRIP, TRIANGLE_FAN -> var1;
         case LINES, QUADS -> var1 / 4 * 6;
         default -> 0;
      };
   }

   public int getGLMode(boolean var1) {
      return var1 ? this.mcGLMode : this.realGLMode;
   }

   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH fromGlMode(int var0) {
      return switch (var0) {
         case 0 -> POINTS;
         case 1 -> LINES;
         case 2 -> LINE_LOOP;
         case 3 -> LINE_STRIP;
         case 4 -> TRIANGLES;
         case 5 -> TRIANGLE_STRIP;
         case 6 -> TRIANGLE_FAN;
         case 7 -> QUADS;
         case 8 -> throw new IllegalStateException("The GL_POLYGON draw mode is not supported on the core profile!");
         default -> throw new IllegalStateException("Unknown GL draw mode: " + var0);
      };
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var3, int var4, int var5, int var6, boolean var7) {
      this.mcGLMode = var3;
      this.realGLMode = var4;
      this.primitiveLength = var5;
      this.primitiveStride = var6;
      this.connectedPrimitives = var7;
   }

   @Generated
   public int getPrimitiveLength() {
      return this.primitiveLength;
   }

   @Generated
   public int getPrimitiveStride() {
      return this.primitiveStride;
   }

   @Generated
   public boolean isConnectedPrimitives() {
      return this.connectedPrimitives;
   }
}
