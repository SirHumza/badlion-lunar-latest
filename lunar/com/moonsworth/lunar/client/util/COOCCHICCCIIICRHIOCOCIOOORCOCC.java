package com.moonsworth.lunar.client.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.util.Locale;
import java.util.Optional;
import lombok.Generated;

public final class COOCCHICCCIIICRHIOCOCIOOORCOCC {
   private static final NumberFormat COCCCHIHHRHHICIHHCHROIHOIIIICO = NumberFormat.getCompactNumberInstance(Locale.US, Style.SHORT);
   private static final DecimalFormat OHOCRCRRRHOHRRHHOROCRIICIROHCO = new DecimalFormat("###,###,###");

   public static long IIRIROIRHRRRHRRHCROIRHCROCCCOC(String var0) {
      try {
         return Long.parseLong(var0);
      } catch (NumberFormatException var2) {
         return 0L;
      }
   }

   public static double ORHHIORCCIOHCRRHOCHCHORIHHROOO(String var0) {
      try {
         return Double.parseDouble(var0);
      } catch (NumberFormatException var2) {
         return 0.0;
      }
   }

   public static int IOORROIRICCOCCOOCCIROIIIHRCCCC(String var0) {
      try {
         return Integer.parseInt(var0);
      } catch (NumberFormatException var2) {
         return 0;
      }
   }

   public static int RIROICHCRROROHCCROOCCCCOCHCCRI(String var0, int var1) {
      try {
         return Integer.parseInt(var0);
      } catch (NumberFormatException var3) {
         return var1;
      }
   }

   public static int RCOIHOICHRIIHOCCCIHRRHHRROORCR(String var0) {
      try {
         return IOHOOIOHCHICOCHIICHCICCOHRCIII.RHOOIIHCIOORCHHHRCHORROICICIHO(var0);
      } catch (Exception var2) {
         return IOORROIRICCOCCOOCCIROIIIHRCCCC(var0);
      }
   }

   public static Optional<Long> IHOOORHRIIRHRCCCCORHRIRHIROHIO(String var0) {
      try {
         return Optional.of(Long.parseLong(var0));
      } catch (NumberFormatException var2) {
         return Optional.empty();
      }
   }

   public static Optional<Double> IIIOHRRCOOORCCICORHROCCHCRRRIR(String var0) {
      try {
         return Optional.of(Double.parseDouble(var0));
      } catch (NumberFormatException var2) {
         return Optional.empty();
      }
   }

   public static Optional<Integer> HCHRCOICHOOIOROORHRIIIOIIHIHOC(String var0) {
      try {
         return Optional.of(Integer.parseInt(var0));
      } catch (NumberFormatException var2) {
         return Optional.empty();
      }
   }

   public static int HOHCOIRRHIICOCOORHHRRRCRIOOIHR(String var0) {
      char var1 = Character.toLowerCase(var0.charAt(var0.length() - 1));
      switch (var1) {
         case 'b':
            float var4 = Float.parseFloat(var0.substring(0, var0.length() - 1));
            return Math.round(var4 * 1.0E9F);
         case 'k':
            float var3 = Float.parseFloat(var0.substring(0, var0.length() - 1));
            return Math.round(var3 * 1000.0F);
         case 'm':
            float var2 = Float.parseFloat(var0.substring(0, var0.length() - 1));
            return Math.round(var2 * 1000000.0F);
         default:
            return Integer.parseInt(var0.replaceAll(",", ""));
      }
   }

   public static String RRHHORICORICIRHICOHHROHIIHICCH(long var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 0, 1);
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(long var0, int var2, int var3) {
      COCCCHIHHRHHICIHHCHROIHOIIIICO.setMinimumFractionDigits(var2);
      COCCCHIHHRHHICIHHCHROIHOIIIICO.setMaximumFractionDigits(var3);
      return COCCCHIHHRHHICIHHCHROIHOIIIICO.format(var0);
   }

   public static String IROCHOHCORHCOCCCOCHORCICRORIIC(double var0) {
      return OHOCRCRRRHOHRRHHOROCRIICIROHCO.format(var0);
   }

   @Generated
   private COOCCHICCCIIICRHIOCOCIOOORCOCC() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
