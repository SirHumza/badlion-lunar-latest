package net.kyori.ansi;

import java.util.Locale;
import org.jetbrains.annotations.NotNull;

public enum ColorLevel {
   NONE {
      @NotNull
      @Override
      public String determineEscape(int var1) {
         return "";
      }
   },
   TRUE_COLOR {
      @NotNull
      @Override
      public String determineEscape(int var1) {
         return "38;2;" + (var1 >> 16 & 0xFF) + ';' + (var1 >> 8 & 0xFF) + ';' + (var1 & 0xFF);
      }
   },
   INDEXED_256 {
      @NotNull
      @Override
      public String determineEscape(int var1) {
         if (ColorLevel.indexed256ColorTable == null) {
            ColorLevel.indexed256ColorTable = new int[256];

            for (int var2 = 0; var2 < ColorLevel.indexed256ColorTable.length; var2++) {
               if (var2 < 16) {
                  ColorLevel.indexed256ColorTable[var2] = ColorLevel.StandardColor.values()[var2].color;
               } else {
                  int var3;
                  int var4;
                  int var5;
                  if (var2 < 232) {
                     int var6 = var2 - 16;
                     int var7 = var6 / 36;
                     int var8 = var6 / 6 % 6;
                     int var9 = var6 % 6;
                     var3 = var7 == 0 ? 0 : var7 * 40 + 55;
                     var4 = var8 == 0 ? 0 : var8 * 40 + 55;
                     var5 = var9 == 0 ? 0 : var9 * 40 + 55;
                  } else {
                     int var16 = 8 + (var2 - 232) * 10;
                     var3 = var16;
                     var4 = var16;
                     var5 = var16;
                  }

                  ColorLevel.indexed256ColorTable[var2] = var3 << 16 | var4 << 8 | var5;
               }
            }
         }

         int var12 = -1;
         int var13 = Integer.MAX_VALUE;
         int var14 = var1 >> 16 & 0xFF;
         int var15 = var1 >> 8 & 0xFF;
         int var17 = var1 & 0xFF;

         for (int var18 = 0; var18 < ColorLevel.indexed256ColorTable.length; var18++) {
            int var19 = ColorLevel.indexed256ColorTable[var18] >> 16 & 0xFF;
            int var20 = ColorLevel.indexed256ColorTable[var18] >> 8 & 0xFF;
            int var10 = ColorLevel.indexed256ColorTable[var18] & 0xFF;
            int var11 = Math.abs(var14 - var19) + Math.abs(var15 - var20) + Math.abs(var17 - var10);
            if (var11 < var13) {
               var13 = var11;
               var12 = var18;
            }

            if (var11 == 0) {
               break;
            }
         }

         return "38;5;" + var12;
      }
   },
   INDEXED_16 {
      @NotNull
      @Override
      public String determineEscape(int var1) {
         return ColorLevel.findClosestColorEscape(var1, ColorLevel.StandardColor.VALUES_INDEXED16);
      }
   },
   INDEXED_8 {
      @NotNull
      @Override
      public String determineEscape(int var1) {
         return ColorLevel.findClosestColorEscape(var1, ColorLevel.StandardColor.VALUES_INDEXED8);
      }
   };

   public static final String COLOR_LEVEL_PROPERTY = "net.kyori.ansi.colorLevel";
   public static final String TERMINAL_ANSI_OVERRIDE_PROPERTY = "terminal.ansi";
   private static final String COLORTERM = System.getenv("COLORTERM");
   private static final String TERM = System.getenv("TERM");
   private static final String WT_SESSION = System.getenv("WT_SESSION");
   private static int[] indexed256ColorTable = null;

   ColorLevel() {
   }

   @NotNull
   public static ColorLevel compute() {
      String var0 = System.getProperty("net.kyori.ansi.colorLevel");
      if (var0 != null) {
         switch (var0.toLowerCase(Locale.ROOT)) {
            case "none":
               return NONE;
            case "truecolor":
               return TRUE_COLOR;
            case "indexed256":
               return INDEXED_256;
            case "indexed16":
               return INDEXED_16;
            case "indexed8":
               return INDEXED_8;
         }
      }

      String var3 = System.getProperty("terminal.ansi");
      if (var3 != null && var3.equals("false")) {
         return NONE;
      }

      if (COLORTERM != null) {
         if (COLORTERM.contains("truecolor") || COLORTERM.contains("24bit")) {
            return TRUE_COLOR;
         }
      } else {
         if (TERM == null) {
            if (WT_SESSION != null) {
               return TRUE_COLOR;
            }

            if (SystemConsole.isTerminal()) {
               if (JAnsiColorLevel.isAvailable()) {
                  return JAnsiColorLevel.computeFromJAnsi();
               }

               return INDEXED_16;
            }

            return NONE;
         }

         if (TERM.contains("truecolor") || TERM.contains("-direct")) {
            return TRUE_COLOR;
         }

         if (TERM.contains("-256color")) {
            return INDEXED_256;
         }
      }

      return INDEXED_16;
   }

   @NotNull
   public abstract String determineEscape(int var1);

   private static String findClosestColorEscape(int var0, ColorLevel.StandardColor[] var1) {
      float var2 = Float.MAX_VALUE;
      ColorLevel.StandardColor var3 = ColorLevel.StandardColor.BLACK;

      for (ColorLevel.StandardColor var7 : var1) {
         float var8 = ColorLevel.HSV.fromRGB(var0).distance(ColorLevel.HSV.fromRGB(var7.color));
         if (var8 < var2) {
            var3 = var7;
            var2 = var8;
         }

         if (var8 == 0.0F) {
            break;
         }
      }

      return var3.index;
   }

   private static class HSV {
      float h;
      float s;
      float v;

      HSV(float var1, float var2, float var3) {
         this.h = var1;
         this.s = var2;
         this.v = var3;
      }

      private float distance(@NotNull ColorLevel.HSV var1) {
         float var2 = 3.0F * Math.min(Math.abs(this.h - var1.h), 1.0F - Math.abs(this.h - var1.h));
         float var3 = this.s - var1.s;
         float var4 = this.v - var1.v;
         return var2 * var2 + var3 * var3 + var4 * var4;
      }

      private static ColorLevel.HSV fromRGB(int var0) {
         float var1 = (var0 >> 16 & 0xFF) / 255.0F;
         float var2 = (var0 >> 8 & 0xFF) / 255.0F;
         float var3 = (var0 & 0xFF) / 255.0F;
         float var4 = Math.min(var1, Math.min(var2, var3));
         float var5 = Math.max(var1, Math.max(var2, var3));
         float var6 = var5 - var4;
         float var7;
         if (var5 != 0.0F) {
            var7 = var6 / var5;
         } else {
            var7 = 0.0F;
         }

         if (var7 == 0.0F) {
            return new ColorLevel.HSV(0.0F, var7, var5);
         }

         float var8;
         if (var1 == var5) {
            var8 = (var2 - var3) / var6;
         } else if (var2 == var5) {
            var8 = 2.0F + (var3 - var1) / var6;
         } else {
            var8 = 4.0F + (var1 - var2) / var6;
         }

         var8 *= 60.0F;
         if (var8 < 0.0F) {
            var8 += 360.0F;
         }

         return new ColorLevel.HSV(var8 / 360.0F, var7, var5);
      }
   }

   private enum StandardColor {
      BLACK(0, "30"),
      DARK_RED(11141120, "31"),
      DARK_GREEN(43520, "32"),
      GOLD(16755200, "33"),
      DARK_BLUE(170, "34"),
      DARK_PURPLE(11141290, "35"),
      DARK_AQUA(43690, "36"),
      GRAY(11184810, "37"),
      DARK_GRAY(5592405, "90"),
      RED(16733525, "91"),
      GREEN(5635925, "92"),
      YELLOW(16777045, "93"),
      BLUE(5592575, "94"),
      LIGHT_PURPLE(16733695, "95"),
      AQUA(5636095, "96"),
      WHITE(16777215, "97");

      static final ColorLevel.StandardColor[] VALUES_INDEXED16 = values();
      static final ColorLevel.StandardColor[] VALUES_INDEXED8;
      final int color;
      final String index;

      StandardColor(int var3, String var4) {
         this.color = var3;
         this.index = var4;
      }

      static {
         ColorLevel.StandardColor[] var0 = new ColorLevel.StandardColor[8];
         System.arraycopy(values(), 0, var0, 0, 8);
         VALUES_INDEXED8 = var0;
      }
   }
}
