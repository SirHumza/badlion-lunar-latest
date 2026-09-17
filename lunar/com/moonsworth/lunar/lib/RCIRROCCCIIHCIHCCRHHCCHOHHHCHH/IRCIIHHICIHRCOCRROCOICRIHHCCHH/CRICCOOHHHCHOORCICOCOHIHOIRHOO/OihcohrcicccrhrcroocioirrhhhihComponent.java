package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OIHCOHRCICCCRHRCROOCIOIRRHHHIH;
import com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;

public class IRRCCOICORICIHCHRHIHIHROIRHOCR {
   private static final Pattern ICCORIHOOOHCHHHRHOICHIICCCRHIO = Pattern.compile("[-_./;:]");

   protected IRRCCOICORICIHCHRHIHIHROIRHOCR() {
   }

   @Deprecated
   public OIHCOHRCICCCRHRCROOCIOIRRHHHIH version() {
      return OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RRCIOHOROHCHCRIICCIOICORCRIIOR();
   }

   public static OIHCOHRCICCCRHRCROOCIOIRRHHHIH ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(Class<?> var0) {
      OIHCOHRCICCCRHRCROOCIOIRRHHHIH var1 = null;

      try {
         String var2 = var0.getPackage().getName() + ".PackageVersion";
         Class var3 = Class.forName(var2, true, var0.getClassLoader());

         try {
            var1 = ((ROOCOCCCIRHHHIRIOIHHHHRHIICHHR)var3.getDeclaredConstructor().newInstance()).version();
         } catch (Exception var5) {
            throw new IllegalArgumentException("Failed to get Versioned out of " + var3);
         }
      } catch (Exception var6) {
      }

      return var1 == null ? OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RRCIOHOROHCHCRIICCIOICORCRIIOR() : var1;
   }

   @Deprecated
   public static OIHCOHRCICCCRHRCROOCIOIRRHHHIH HRHIHIRHRCHHRORRRCORHOCIRHRIOR(Class<?> var0) {
      return ORRCOOOCHCIIRRRCORIIOOHHOHCOIH(var0);
   }

   @Deprecated
   public static OIHCOHRCICCCRHRCROOCIOIRRHHHIH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ClassLoader var0, String var1, String var2) {
      InputStream var3 = var0.getResourceAsStream("META-INF/maven/" + var1.replaceAll("\\.", "/") + "/" + var2 + "/pom.properties");
      if (var3 != null) {
         try {
            Properties var4 = new Properties();
            var4.load(var3);
            String var5 = var4.getProperty("version");
            String var6 = var4.getProperty("artifactId");
            String var7 = var4.getProperty("groupId");
            return IHIRRIIORRHORHRORIHOROIRCORCOO(var5, var7, var6);
         } catch (IOException var12) {
         } finally {
            HHCCIRHCCCIIRHCROHIORHIRHHIORH(var3);
         }
      }

      return OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RRCIOHOROHCHCRIICCIOICORCRIIOR();
   }

   public static OIHCOHRCICCCRHRCROOCIOIRRHHHIH IHIRRIIORRHORHRORIHOROIRCORCOO(String var0, String var1, String var2) {
      if (var0 != null && (var0 = var0.trim()).length() > 0) {
         String[] var3 = ICCORIHOOOHCHHHRHOICHIICCCRHIO.split(var0);
         return new OIHCOHRCICCCRHRCROOCIOIRRHHHIH(
            OHIHHORORHROIOICRRCCROHHCIOCIO(var3[0]),
            var3.length > 1 ? OHIHHORORHROIOICRRCCROHHCIOCIO(var3[1]) : 0,
            var3.length > 2 ? OHIHHORORHROIOICRRCCROHHCIOCIO(var3[2]) : 0,
            var3.length > 3 ? var3[3] : null,
            var1,
            var2
         );
      } else {
         return OIHCOHRCICCCRHRCROOCIOIRRHHHIH.RRCIOHOROHCHCRIICCIOICORCRIIOR();
      }
   }

   protected static int OHIHHORORHROIOICRRCCROHHCIOCIO(String var0) {
      int var1 = 0;
      int var2 = 0;

      for (int var3 = var0.length(); var2 < var3; var2++) {
         char var4 = var0.charAt(var2);
         if (var4 > '9' || var4 < '0') {
            break;
         }

         var1 = var1 * 10 + (var4 - '0');
      }

      return var1;
   }

   private static final void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Closeable var0) {
      try {
         var0.close();
      } catch (IOException var2) {
      }
   }

   public static final void CRRRICCCHCIICICCCIOOIIOOOCCOCH() {
      throw new RuntimeException("Internal error: this code path should never get executed");
   }
}
