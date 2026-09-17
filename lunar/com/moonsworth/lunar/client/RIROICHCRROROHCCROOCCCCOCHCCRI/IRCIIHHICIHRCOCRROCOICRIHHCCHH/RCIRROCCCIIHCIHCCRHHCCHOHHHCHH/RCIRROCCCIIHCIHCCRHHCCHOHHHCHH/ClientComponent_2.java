package com.moonsworth.lunar.client.RIROICHCRROROHCCROOCCCCOCHCCRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   public static void HOICRHRRRCIROIRIHRHCIHRHCIIOHR() {
      if (!HHCCIRHCCCIIRHCROHIORHIRHHIORH.HICCIIICOHOHRHCIIROIHOOIRHCRCH()) {
         boolean var0 = false;
         boolean var1 = false;
         if (OCCHOOOCIIRCOOIIOCCRRROOHCCCIC()) {
            CORCOCICIRIOHROHROIIOOHICCHCRR var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
               .get()
               .getShaders();
            if (var2.isRenderingDfb()) {
               if (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.getMinecraftVersion().OOICHHIHHIHROCCRRRIIIIRIRICCIH()) {
                  IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$overrideMainRenderTarget(null, false, true);
               }

               var2.bindTargetDfb();
               var1 = true;
               if (!HHCCIRHCCCIIRHCROHIORHIRHHIORH.RHHIIOCOCCOIHHRRCOIHOCOOOHIHHH()) {
                  var2.restoreViewport();
                  var0 = true;
               }
            }
         }

         if (!var1) {
            IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$overrideMainRenderTarget(null, false, true);
         }

         if (!var0) {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH.restoreViewport();
         }
      }
   }

   public static boolean OCCHOOOCIIRCOOIIOCCRRROOHCCCIC() {
      return com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR().map(var0 -> {
         CORCOCICIRIOHROHROIIOOHICCHCRR var1 = var0.getShaders();
         String var2 = var1.getShaderPack();
         return var2 != null && !var1.getPackNone().equals(var2);
      }).orElse(false);
   }

   public static String OHHRIOHROOIHOROCIRHCHORIHRRRRI(String var0, int var1) {
      StringBuilder var2 = new StringBuilder();
      Pattern var3 = Pattern.compile("(\\d+):(\\d+):");
      Pattern var4 = Pattern.compile("(\\d+)\\((\\d+)\\)");
      String[] var5 = var0.split("\n");

      for (String var9 : var5) {
         Matcher var10 = var3.matcher(var9);
         if (var10.find()) {
            String var11 = var10.group(1);
            int var12 = Integer.parseInt(var10.group(2)) - var1;
            var9 = var10.replaceFirst(var11 + ":" + var12 + ":");
         }

         Matcher var14 = var4.matcher(var9);
         if (var14.find()) {
            String var15 = var14.group(1);
            int var13 = Integer.parseInt(var14.group(2)) - var1;
            var9 = var14.replaceFirst(var15 + "(" + var13 + ")");
         }

         var2.append(var9).append("\n");
      }

      return var2.toString();
   }
}
