package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.lang.reflect.InvocationTargetException;

public class IOIICIRIICICIIOORHCIIIIRRIHRHI {
   private static final boolean OIRHIRIROOCROORHCOORHOCHHCHIHI = System.getProperty("org.graalvm.nativeimage.imagecode") != null;

   private IOIICIRIICICIIOORHCIIIIRRIHRHI() {
   }

   private static boolean OOOOHCCRHOOOHCHICCIIOHRIIHRCRC() {
      return OIRHIRIROOCROORHCOORHOCHHCHIHI && "runtime".equals(System.getProperty("org.graalvm.nativeimage.imagecode"));
   }

   public static boolean RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(Throwable var0) {
      if (!OOOOHCCRHOOOHCHICCIIOHRIIHRCRC()) {
         return false;
      }

      if (var0 instanceof InvocationTargetException) {
         var0 = var0.getCause();
      }

      return var0.getClass().getName().equals("com.oracle.svm.core.jdk.UnsupportedFeatureError");
   }

   public static boolean CROCIHOHROHRCOHRHOCHICOCRIIIHO(Class<?> var0) {
      return !OOOOHCCRHOOOHCHICCIIOHRIIHRCRC()
         ? false
         : (var0.getDeclaredFields().length == 0 || OOROOCCIRCCRHOIOIORIHCHHOOCCOR.ORCORCRRIRIROIORRCCCCHRHRCOHOH(var0))
            && var0.getDeclaredMethods().length == 0
            && var0.getDeclaredConstructors().length == 0;
   }
}
