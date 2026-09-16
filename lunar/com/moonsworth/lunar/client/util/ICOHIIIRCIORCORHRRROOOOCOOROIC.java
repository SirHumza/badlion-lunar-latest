package com.moonsworth.lunar.client.util;

import com.google.common.base.CaseFormat;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.apache.commons.lang3.text.WordUtils;
import org.intellij.lang.annotations.Subst;

public final class ICOHIIIRCIORCORHRRROOOOCOOROIC {
   public static List<String> IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var0, float var1, boolean var2) {
      var1 -= var2 ? 15.5F : 0.0F;
      if (!var0.contains(" ")) {
         return com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOIHCHOOHORCORHHHCHCORHORHCOOC()
            .CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1);
      }

      ArrayList var3 = new ArrayList();
      StringBuilder var4 = new StringBuilder();
      float var5 = 0.0F;

      for (String var9 : var0.split(" ")) {
         float var10 = var5
            + com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOIHCHOOHORCORHHHCHCORHORHCOOC()
               .IOOOHRRHCHICHHHCRIRHIICORRCIRO(var9);
         if (var10 < var1) {
            var4.append(var9).append(" ");
            var5 = var10 + 1.0F;
         } else if (var5 == 0.0F) {
            var3.addAll(IRCIIHHICIHRCOCRROCOICRIHHCCHH(var9, var1, false));
         } else {
            var3.add(var4.toString().charAt(var4.length() - 1) == ' ' ? var4.toString().substring(0, var4.toString().length() - 1) : var4.toString());
            var5 = com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CIOHHCORHRCCRICCCORIHCRHCCCRRR.IOIHCHOOHORCORHHHCHCORHORHCOOC()
                  .IOOOHRRHCHICHHHCRIRHIICORRCIRO(var9)
               + 1.0F;
            var4 = new StringBuilder(var9).append(" ");
         }
      }

      var3.add(var4.toString().charAt(var4.length() - 1) == ' ' ? var4.toString().substring(0, var4.toString().length() - 1) : var4.toString());
      return var3;
   }

   public static boolean IOICCCHOCCOIIHICRCIRIRROHRCHCC(String var0) {
      return var0.length() <= 16 && var0.chars().filter(var0x -> var0x <= 32 || var0x >= 127).findAny().isEmpty();
   }

   public static String IOOOCCROCOCHCICCHIHOCCRHROHOHC(String var0) {
      return var0.isEmpty() ? " " : var0.substring(0, 1).toUpperCase();
   }

   public static String OORRROHOHHOOROORRRCCCOCCOOCCHI(String var0) {
      String var1 = var0.replaceAll("_", " ");
      return WordUtils.capitalize(var1);
   }

   @Subst("UPPER_SNAKE")
   public static String RHIIORHOIHHICHORHRIRHIIROCHOHO(String var0) {
      var0 = var0.replace("-", "_");
      StringBuilder var1 = new StringBuilder(String.valueOf(Character.toUpperCase(var0.charAt(0))));
      boolean var2 = false;

      for (int var3 = 1; var3 < var0.length(); var3++) {
         char var4 = var0.charAt(var3);
         if (var4 == '_') {
            var2 = true;
            var1.append(var4);
         } else if (Character.isLowerCase(var4)) {
            var2 = false;
            var1.append(Character.toUpperCase(var4));
         } else {
            if (!var2) {
               var1.append("_");
            }

            var2 = true;
            var1.append(var4);
         }
      }

      return var1.toString();
   }

   @Subst("CamelCase")
   public static String OOCCRCRCOHIIORCCORCRCIRRROIOOR(String var0, boolean var1) {
      var0 = var0.replace("-", "_");
      StringBuilder var2 = new StringBuilder();
      boolean var3 = !var1;

      for (int var4 = 0; var4 < var0.length(); var4++) {
         char var5 = var0.charAt(var4);
         if (var5 == '_') {
            var3 = false;
         } else if (var3) {
            var2.append(Character.toLowerCase(var5));
         } else {
            var2.append(Character.toUpperCase(var5));
            var3 = true;
         }
      }

      return var2.toString();
   }

   @Subst("kebab-case")
   public static String RCCIROHIHIOOOIOOCIRORHCRROIROR(String var0) {
      return CaseFormat.LOWER_CAMEL.to(CaseFormat.LOWER_HYPHEN, var0);
   }

   @Generated
   private ICOHIIIRCIORCORHRRROOOOCOOROIC() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
