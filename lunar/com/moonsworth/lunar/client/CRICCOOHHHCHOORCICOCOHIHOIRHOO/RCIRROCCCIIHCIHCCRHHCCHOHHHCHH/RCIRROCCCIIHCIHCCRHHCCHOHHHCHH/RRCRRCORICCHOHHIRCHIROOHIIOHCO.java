package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.client.util.RCOCOHHCOOICCICCRCCORORROHRCCC;
import java.time.Duration;
import org.jetbrains.annotations.Nullable;

public final class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<Duration> {
   public static final RRCRRCORICCHOHHIRCHIROOHIIOHCO ICCCIHRHOCCOICCORHORCHHHROOIRC = new RRCRRCORICCHOHHIRCHIROOHIIOHCO();
   private static final char[] ROROHIHORCCOHCIRHRHOCHCIIOCIIO = new char[]{'s', 'm', 'h', 'd'};

   @Nullable
   public Duration RRCRRCORICCHOHHIRCHIROOHIIOHCO(RCOCOHHCOOICCICCRCCORORROHRCCC var1) {
      if (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && var1.peek() != ' ') {
         int var2 = var1.getCursor();

         while (var1.ICRRHCIHROICCROIIRHRCRRIHRRCCC() && var1.peek() != ' ') {
            var1.skip();
         }

         String var3 = var1.getString().substring(var2, var1.getCursor());
         Duration var4 = OCICRRIRIIHROCCOOCOICRCRROOIOC(var3);
         if (var4 == null) {
            var1.RIRCCRRRCOROICICCOORORHCHICRCC(var2);
            return null;
         } else {
            return var4;
         }
      } else {
         return null;
      }
   }

   @Override
   public com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRRRICCRROCOHHOHIICIHORCOORRRH ROROORRHRIIOOIIIOIOCCORHORRRII() {
      return (var0, var1) -> {
         String var2 = var1.CIHCOIIRIOOCOCRHHHHRCCIOHCRCCH();

         int var3;
         for (var3 = 0; var3 < var2.length(); var3++) {
            char var4 = var2.charAt(var3);
            if (!Character.isDigit(var4) && var4 != '.' && (var3 != 0 || var4 != '-')) {
               break;
            }
         }

         String var10 = var2.substring(0, var3);
         if (!var10.isEmpty() && !var10.equals("-") && !var10.equals(".")) {
            for (char var8 : ROROHIHORCCOHCIRHRHOCHCIIOCIIO) {
               String var9 = var10 + var8;
               if (var9.startsWith(var2)) {
                  var1.OHRCIORHOCHOORCRHHOHRRRCCOICCO(var9);
               }
            }
         }
      };
   }

   @Nullable
   public static Duration OCICRRIRIIHROCCOOCOICRCRROOIOC(String var0) {
      if (var0 != null && var0.length() >= 2) {
         char var1 = var0.charAt(var0.length() - 1);
         String var2 = var0.substring(0, var0.length() - 1);

         double var3;
         try {
            var3 = Double.parseDouble(var2);
         } catch (NumberFormatException var7) {
            return null;
         }

         if (!Double.isFinite(var3)) {
            return null;
         }

         long var5;
         switch (var1) {
            case 'd':
               var5 = (long)(var3 * 24.0 * 60.0 * 60.0 * 1000.0);
               break;
            case 'h':
               var5 = (long)(var3 * 60.0 * 60.0 * 1000.0);
               break;
            case 'm':
               var5 = (long)(var3 * 60.0 * 1000.0);
               break;
            case 's':
               var5 = (long)(var3 * 1000.0);
               break;
            default:
               return null;
         }

         return Duration.ofMillis(var5);
      } else {
         return null;
      }
   }
}
