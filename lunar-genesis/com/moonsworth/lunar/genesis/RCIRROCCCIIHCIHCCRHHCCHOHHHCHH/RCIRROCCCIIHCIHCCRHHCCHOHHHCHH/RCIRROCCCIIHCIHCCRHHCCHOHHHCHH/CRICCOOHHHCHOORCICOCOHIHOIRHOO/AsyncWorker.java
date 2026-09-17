package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCHOIICIHOCIRCIOORIOHRCRHOCRCR;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class ROOCOCCCIRHHHIRIOIHHHHRHIICHHR {
   private ROOCOCCCIRHHHIRIOIHHHHRHIICHHR() {
   }

   public static HRCHROOHRIHCRCRHRIIROCIRHOIRHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(URL var0) {
      return new ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   public static HICHRCOHCCRHOHCICOOCHOIHCCHIRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URL var0, Charset var1) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0).CRRRICCRROCOHHOHIICIHORCOORRRH(var1);
   }

   public static byte[] toByteArray(URL var0) {
      return IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0).read();
   }

   public static String toString(URL var0, Charset var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1).read();
   }

   @CanIgnoreReturnValue
   public static <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URL var0, Charset var1, IHIRRIIORRHORHRORIHOROIRCORCOO<T> var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1).RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2);
   }

   public static List<String> readLines(URL var0, Charset var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, new IHIRRIIORRHORHRORIHOROIRCORCOO<List<String>>() {
         final List<String> IIHOCHRIHROHHRRCHOHHHOIHOCROCI = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayList();

         @Override
         public boolean processLine(String var1) {
            this.IIHOCHRIHROHHRRCHOHHHOIHOCROCI.add(var1);
            return true;
         }

         public List<String> getResult() {
            return this.IIHOCHRIHROHHRRCHOHHHOIHOCROCI;
         }
      });
   }

   public static void copy(URL var0, OutputStream var1) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH(var0).copyTo(var1);
   }

   @CanIgnoreReturnValue
   public static URL getResource(String var0) {
      ClassLoader var1 = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOIICIRIICICIIOORHCIIIIRRIHRHI.firstNonNull(
         Thread.currentThread().getContextClassLoader(), ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.class.getClassLoader()
      );
      URL var2 = var1.getResource(var0);
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2 != null, "resource %s not found.", var0
      );
      return var2;
   }

   @CanIgnoreReturnValue
   public static URL getResource(Class<?> var0, String var1) {
      URL var2 = var0.getResource(var1);
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2 != null, "resource %s relative to %s not found.", var1, var0.getName()
      );
      return var2;
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
      private final URL RCOHCCCHCHORCIOHCCOIRHICCORIOR;

      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(URL var1) {
         this.RCOHCCCHCHORCIOHCCOIRHICCORIOR = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public InputStream openStream() {
         return this.RCOHCCCHCHORCIOHCCOIRHICCORIOR.openStream();
      }

      @Override
      public String toString() {
         return "Resources.asByteSource(" + this.RCOHCCCHCHORCIOHCCOIRHICCORIOR + ")";
      }
   }
}
