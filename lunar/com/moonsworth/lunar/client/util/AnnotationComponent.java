package com.moonsworth.lunar.client.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private static List<Class<?>> CCIHHRIOOOOCOHRCIHOHROOICIORCC(Class<?> var0) {
      ArrayList var1 = new ArrayList();

      do {
         var1.add(var0);
         var0 = var0.getSuperclass();
      } while (var0 != null);

      return var1;
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Class<?> var0, Class<? extends Annotation> var1) {
      for (Class var3 : CCIHHRIOOOOCOHRCIHOHROOICIORCC(var0)) {
         for (Method var7 : var3.getDeclaredMethods()) {
            if (var7.isAnnotationPresent(var1) && Modifier.isStatic(var7.getModifiers())) {
               throw new IllegalStateException(
                  "All methods annotated with @" + var1.getName() + " must not be static (" + var3.getName() + "#" + var7.getName() + ")"
               );
            }
         }
      }
   }

   public static void CRRRICCRROCOHHOHIICIHORCOORRRH(Class<?> var0, Class<? extends Annotation> var1) {
      for (Class var3 : CCIHHRIOOOOCOHRCIHOHROOICIORCC(var0)) {
         for (Field var7 : var3.getDeclaredFields()) {
            if (var7.isAnnotationPresent(var1) && Modifier.isFinal(var7.getModifiers())) {
               throw new IllegalStateException(
                  "All fields annotated with @" + var1.getName() + " must not be final (" + var3.getName() + "#" + var7.getName() + ")"
               );
            }
         }
      }
   }

   public static void RRCRRCORICCHOHHIRCHIROOHIIOHCO(Class<?> var0, Class<? extends Annotation> var1) {
      for (Class var3 : CCIHHRIOOOOCOHRCIHOHROOICIORCC(var0)) {
         for (Field var7 : var3.getDeclaredFields()) {
            if (var7.isAnnotationPresent(var1) && Modifier.isStatic(var7.getModifiers())) {
               throw new IllegalStateException(
                  "All fields annotated with @" + var1.getName() + " must not be static (" + var3.getName() + "#" + var7.getName() + ")"
               );
            }
         }
      }
   }

   public static Stream<Method> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(Class<?> var0, Class<? extends Annotation> var1) {
      return CCIHHRIOOOOCOHRCIHOHROOICIORCC(var0)
         .stream()
         .flatMap(var0x -> Arrays.stream(var0x.getDeclaredMethods()))
         .filter(var1x -> var1x.isAnnotationPresent(var1));
   }

   public static Stream<Field> HRCHROOHRIHCRCRHRIIROCIRHOIRHH(Class<?> var0, Class<? extends Annotation> var1) {
      return CCIHHRIOOOOCOHRCIHOHROOICIORCC(var0)
         .stream()
         .flatMap(var0x -> Arrays.stream(var0x.getDeclaredFields()))
         .filter(var1x -> var1x.isAnnotationPresent(var1));
   }

   public static Class<? extends com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Method var0, Class<?> var1
   ) {
      Class[] var2 = var0.getParameterTypes();
      if (var2.length == 0) {
         throw new IllegalStateException("EventHandler " + var1.getName() + "#" + var0.getName() + " has no parameters");
      } else if (var2.length != 1) {
         throw new IllegalStateException("EventHandler " + var1.getName() + "#" + var0.getName() + " has an incorrect number of parameters (expected 1)");
      } else if (!com.moonsworth.lunar.client.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class.isAssignableFrom(var2[0])) {
         throw new IllegalStateException("EventHandler " + var1.getName() + "#" + var0.getName() + " parameter is not an instance of Event!");
      } else {
         return var2[0];
      }
   }
}
