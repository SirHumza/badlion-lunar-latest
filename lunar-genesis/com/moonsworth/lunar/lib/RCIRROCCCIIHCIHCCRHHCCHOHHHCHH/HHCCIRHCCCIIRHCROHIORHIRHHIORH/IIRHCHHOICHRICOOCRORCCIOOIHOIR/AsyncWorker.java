package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIRHCHHOICHRICOOCRORCCIOOIHOIR;

import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   private static final Class<?> CIOHOICIRIORRCCIRIHRICOCCRRIOC = Object.class;
   private static final Annotation[] HHOHCORHCIHROIOIICOIRRHRORHOOO = new Annotation[0];
   private static final OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] CIHHORIRRCCCORCRCRICOICIICIRCO = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[0];
   private static final Iterator<?> HRCCOHHIRIOHCICIIIOHOHIIRCORCO = Collections.emptyIterator();

   public static <T> Iterator<T> OCIHOHRHOCIRCCROHHHIHIICCIHHOC() {
      return (Iterator<T>)HRCCOHHIRIOHCICIIIOHOHIIRCORCO;
   }

   public static List<com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var0, Class<?> var1, boolean var2
   ) {
      if (var0 != null && !var0.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(var1) && !var0.RIHOOCIHRICOCHRHCOOCCOIHOCHRCR(Object.class)) {
         ArrayList var3 = new ArrayList(8);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var3, var2);
         return var3;
      } else {
         return Collections.emptyList();
      }
   }

   public static List<Class<?>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var0, Class<?> var1, boolean var2) {
      if (var0 != null && var0 != var1 && var0 != Object.class) {
         ArrayList var3 = new ArrayList(8);
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var3, var2);
         return var3;
      } else {
         return Collections.emptyList();
      }
   }

   public static List<Class<?>> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Class<?> var0, Class<?> var1, boolean var2) {
      ArrayList var3 = new ArrayList(8);
      if (var0 != null && var0 != var1) {
         if (var2) {
            var3.add(var0);
         }

         while ((var0 = var0.getSuperclass()) != null && var0 != var1) {
            var3.add(var0);
         }
      }

      return var3;
   }

   @Deprecated
   public static List<Class<?>> IOIICIRIICICIIOORHCIIIIRRIHRHI(Class<?> var0, Class<?> var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, new ArrayList<>(8));
   }

   @Deprecated
   public static List<Class<?>> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var0, Class<?> var1, List<Class<?>> var2) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, false);
      return var2;
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var0,
      Class<?> var1,
      Collection<com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI> var2,
      boolean var3
   ) {
      if (var0 != null) {
         Class var4 = var0.RRICIOOORRIORHHICIRCIOCHRHRCHH();
         if (var4 != var1 && var4 != Object.class) {
            if (var3) {
               if (var2.contains(var0)) {
                  return;
               }

               var2.add(var0);
            }

            for (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var6 : var0.getInterfaces()) {
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6, var1, var2, true);
            }

            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.ROIOOCRIOROIICCRHICRHRCCIOOIHH(), var1, var2, true);
         }
      }
   }

   private static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var0, Class<?> var1, Collection<Class<?>> var2, boolean var3) {
      if (var0 != var1 && var0 != null && var0 != Object.class) {
         if (var3) {
            if (var2.contains(var0)) {
               return;
            }

            var2.add(var0);
         }

         for (Class var7 : IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(var0)) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var7, var1, var2, true);
         }

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getSuperclass(), var1, var2, true);
      }
   }

   public static String CIIIIIHIHRHCOOHOIORCHHCORHRCCO(Class<?> var0) {
      if (var0.isAnnotation()) {
         return "annotation";
      } else if (var0.isArray()) {
         return "array";
      } else if (Enum.class.isAssignableFrom(var0)) {
         return "enum";
      } else {
         return var0.isPrimitive() ? "primitive" : null;
      }
   }

   public static String IRCIIHHICIHRCOCRROCOICRIHHCCHH(Class<?> var0, boolean var1) {
      try {
         boolean var2 = Modifier.isStatic(var0.getModifiers());
         if (!var2 && HICRCHHRCHOIRCOHROCIHHORHIOOCH(var0)) {
            return "local/anonymous";
         }

         if (!var1 && !var2 && HIIRCRROICHCOROOCCCCOIOOOCCIIC(var0) != null) {
            return "non-static member class";
         }
      } catch (SecurityException var3) {
      } catch (NullPointerException var4) {
      }

      return null;
   }

   public static Class<?> HRICIORORHCRHCCCIIIHRRHCICOHOR(Class<?> var0) {
      if (!Modifier.isStatic(var0.getModifiers())) {
         try {
            if (HICRCHHRCHOIRCOHROCIHHORHIOOCH(var0)) {
               return null;
            }

            return HIIRCRROICHCOROOCCCCOIOOOCCIIC(var0);
         } catch (SecurityException var2) {
         }
      }

      return null;
   }

   public static boolean IHHCHIIHOOHRROCRRRHHHCOOHCOORC(Class<?> var0) {
      String var1 = var0.getName();
      return var1.startsWith("net.sf.cglib.proxy.") || var1.startsWith("org.hibernate.proxy.");
   }

   public static boolean CICOOHICHIROHIRCRRIOIIRRIHCCHC(Class<?> var0) {
      int var1 = var0.getModifiers();
      return (var1 & 1536) == 0;
   }

   public static boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(Member var0) {
      int var1 = var0.getModifiers();
      return (var1 & 1536) == 0;
   }

   public static boolean IRRIHROCORIOOCHHCHCHOHCIOHHRRI(Class<?> var0) {
      if (var0.isArray()) {
         return true;
      } else {
         return Collection.class.isAssignableFrom(var0) ? true : Map.class.isAssignableFrom(var0);
      }
   }

   public static boolean IHRCROHROHOCCHIHOHRROHOCOIRHIO(Class<?> var0) {
      return var0 == Void.class
         || var0 == void.class
         || var0
            == com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.class;
   }

   public static boolean ORCORCRRIRIROIORRCCCCHRHRCOHOH(Class<?> var0) {
      Class var1 = var0.getSuperclass();
      return var1 != null && "java.lang.Record".equals(var1.getName());
   }

   public static boolean COOOIIOHIRCRCHIHRHHICOOHIOORRR(Class<?> var0) {
      return var0 == CIOHOICIRIORRCCIRIHRICOCCRRIOC || var0.isPrimitive();
   }

   public static boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(Object var0, Class<?> var1) {
      return var0 != null && var0.getClass() == var1;
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var0, Object var1, String var2) {
      if (var1.getClass() != var0) {
         throw new IllegalStateException(String.format("Sub-class %s (of class %s) must override method '%s'", var1.getClass().getName(), var0.getName(), var2));
      }
   }

   @Deprecated
   public static boolean HICHRCOHCCRHOHCICOOCHOIHCCHIRI(Method var0) {
      if (Modifier.isStatic(var0.getModifiers())) {
         return false;
      }

      Class[] var1 = var0.getParameterTypes();
      return var1 != null && var1.length != 0 ? false : void.class != var0.getReturnType();
   }

   public static Throwable OHHRIOHROOIHOROCIRHCHORIHRRRRI(Throwable var0) {
      if (var0 instanceof Error) {
         throw (Error)var0;
      } else {
         return var0;
      }
   }

   public static Throwable RHOCHHIRRCHHHOHOIRROIROHHHIHIO(Throwable var0) {
      if (var0 instanceof RuntimeException) {
         throw (RuntimeException)var0;
      } else {
         return var0;
      }
   }

   public static Throwable IRRCCOICORICIHCHRHIHIHROIRHOCR(Throwable var0) {
      if (var0 instanceof IOException) {
         throw (IOException)var0;
      } else {
         return var0;
      }
   }

   public static Throwable getRootCause(Throwable var0) {
      while (var0.getCause() != null) {
         var0 = var0.getCause();
      }

      return var0;
   }

   public static Throwable RICRIRRCOHRCOCRRHHCRHRROOIOHHR(Throwable var0) {
      return IRRCCOICORICIHCHRHIHIHROIRHOCR(getRootCause(var0));
   }

   public static void HICRRICCHCCROOHHCHOCOCCHOIHHOC(Throwable var0) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var0.getMessage());
   }

   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Throwable var0, String var1) {
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var0);
      OHHRIOHROOIHOROCIRHCHORIHRRRRI(var0);
      throw new IllegalArgumentException(var1, var0);
   }

   public static <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var0, IOException var1
   ) {
      if (var1 instanceof com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR) {
         throw (com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR)var1;
      } else {
         throw com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var0, var1.getMessage()
            )
            .IHHCHHHCRIHOOCOIOOCRIIICIOROIR(var1);
      }
   }

   public static void RIROICHCRROROHCCROOCCCCOCHCCRI(Throwable var0) {
      HICRRICCHCCROOHHCHOCOCCHOIHHOC(getRootCause(var0));
   }

   public static void CRRRICCRROCOHHOHIICIHORCOORRRH(Throwable var0, String var1) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH(getRootCause(var0), var1);
   }

   public static void IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var0, Exception var1
   ) {
      var0.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.AUTO_CLOSE_JSON_CONTENT
      );

      try {
         var0.close();
      } catch (Exception var3) {
         var1.addSuppressed(var3);
      }

      IRRCCOICORICIHCHRHIHIHROIRHOCR(var1);
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var1);
      throw new RuntimeException(var1);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO var0,
      Closeable var1,
      Exception var2
   ) {
      if (var0 != null) {
         var0.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.AUTO_CLOSE_JSON_CONTENT
         );

         try {
            var0.close();
         } catch (Exception var5) {
            var2.addSuppressed(var5);
         }
      }

      if (var1 != null) {
         try {
            var1.close();
         } catch (Exception var4) {
            var2.addSuppressed(var4);
         }
      }

      IRRCCOICORICIHCHRHIHIHROIRHOCR(var2);
      RHOCHHIRRCHHHOHOIRROIROHHHIHIO(var2);
      throw new RuntimeException(var2);
   }

   public static <T> T HHCCIRHCCCIIRHCROHIORHIRHHIORH(Class<T> var0, boolean var1) {
      Constructor var2 = CRRRICCRROCOHHOHIICIHORCOORRRH(var0, var1);
      if (var2 == null) {
         throw new IllegalArgumentException("Class " + var0.getName() + " has no default (no arg) constructor");
      }

      try {
         return (T)var2.newInstance();
      } catch (Exception var4) {
         CRRRICCRROCOHHOHIICIHORCOORRRH(var4, "Failed to instantiate class " + var0.getName() + ", problem: " + var4.getMessage());
         return null;
      }
   }

   public static <T> Constructor<T> CRRRICCRROCOHHOHIICIHORCOORRRH(Class<T> var0, boolean var1) {
      try {
         Constructor var2 = var0.getDeclaredConstructor();
         if (var1) {
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, var1);
         } else if (!Modifier.isPublic(var2.getModifiers())) {
            throw new IllegalArgumentException(
               "Default constructor for "
                  + var0.getName()
                  + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type"
            );
         }

         return var2;
      } catch (NoSuchMethodException var3) {
      } catch (Exception var4) {
         CRRRICCRROCOHHOHIICIHORCOORRRH(var4, "Failed to find default constructor of class " + var0.getName() + ", problem: " + var4.getMessage());
      }

      return null;
   }

   public static Class<?> IHCCOOCIIIIIIHIOHRICIIHCCIIIIH(Object var0) {
      return var0 == null ? null : var0.getClass();
   }

   public static Class<?> OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var0
   ) {
      return var0 == null ? null : var0.RRICIOOORRIORHHICIRCIOCHRHRCHH();
   }

   public static <T> T OHRRHHOCROROCCIRROIHOCCHCIHCIR(T var0, T var1) {
      return (T)(var0 == null ? var1 : var0);
   }

   public static String RICCOIOIORIHORRIRIOCRICRHRRIRC(Object var0) {
      return var0 == null ? null : var0.toString();
   }

   public static String CRIRROHICRHRROCIHOHRCICCRCORHO(String var0) {
      return var0 == null ? "" : var0;
   }

   public static String OCOHORHCROHICRRIHCIHHRRCIHICRI(Object var0, String var1) {
      return var0 == null ? var1 : String.format("\"%s\"", var0);
   }

   public static String IRCRHHCRHIIIHROOCORCHHHRIIROIR(Object var0) {
      if (var0 == null) {
         return "unknown";
      }

      Class var1 = var0 instanceof Class ? (Class)var0 : var0.getClass();
      return ROIHROCROORRCCOIRRIHHORCROOORO(var1);
   }

   public static String RRORCOIRRIICOOICOIOCORHORCHCOC(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var0
   ) {
      if (var0 == null) {
         return "[null]";
      }

      StringBuilder var1 = new StringBuilder(80).append('`');
      var1.append(var0.HCCHHHRCIRCOOIHHOOCOIHROOCOORI());
      return var1.append('`').toString();
   }

   public static String RRROIHOIHOORCCOHOOCHRRRCIIRHHH(Object var0) {
      if (var0 == null) {
         return "[null]";
      }

      Class var1 = var0 instanceof Class ? (Class)var0 : var0.getClass();
      return ROIHROCROORRCCOIRRIHHORCROOORO(var1);
   }

   public static String ROIHROCROORRCCOIRRIHHORCROOORO(Class<?> var0) {
      if (var0 == null) {
         return "[null]";
      }

      int var1 = 0;

      while (var0.isArray()) {
         var1++;
         var0 = var0.getComponentType();
      }

      String var2 = var0.isPrimitive() ? var0.getSimpleName() : var0.getName();
      if (var1 > 0) {
         StringBuilder var3 = new StringBuilder(var2);

         do {
            var3.append("[]");
         } while (--var1 > 0);

         var2 = var3.toString();
      }

      return OCHRROICICIRRCOCRRRICIIRCHIORR(var2);
   }

   public static String RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IHIRRIIORRHORHRORIHOROIRCORCOO var0) {
      return var0 == null ? "[null]" : CRHRICHCCHHIHHOROCHOIHHOCCIHHH(var0.getName());
   }

   public static String ROCICROOOORCIRIIRRCICIHRHIORHH(String var0) {
      return var0 == null ? "[null]" : CRHRICHCCHHIHHOROCHOIHHOCCIHHH(var0);
   }

   public static String CIOHHCORHRCCRICCCORIHCRHCCCRRR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHCRORHRORIICHRHRCHRRIRRHHOCOO var0
   ) {
      return var0 == null ? "[null]" : CRHRICHCCHHIHHOROCHOIHHOCCIHHH(var0.getSimpleName());
   }

   public static String OCHRROICICIRRCOCRRRICIIRCHIORR(String var0) {
      return var0 == null ? "[null]" : new StringBuilder(var0.length() + 2).append('`').append(var0).append('`').toString();
   }

   public static String CRHRICHCCHHIHHOROCHOIHHOCCIHHH(String var0) {
      return var0 == null ? "[null]" : new StringBuilder(var0.length() + 2).append('\'').append(var0).append('\'').toString();
   }

   public static String IHIRRIIORRHORHRORIHOROIRCORCOO(Throwable var0) {
      if (var0 instanceof com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO) {
         return ((com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO)var0)
            .ICHOCIOOCIORHHOCCCORRRCIHCOCCR();
      } else {
         return var0 instanceof InvocationTargetException && var0.getCause() != null ? var0.getCause().getMessage() : var0.getMessage();
      }
   }

   public static Object defaultValue(Class<?> var0) {
      if (var0 == int.class) {
         return 0;
      } else if (var0 == long.class) {
         return 0L;
      } else if (var0 == boolean.class) {
         return Boolean.FALSE;
      } else if (var0 == double.class) {
         return 0.0;
      } else if (var0 == float.class) {
         return 0.0F;
      } else if (var0 == byte.class) {
         return (byte)0;
      } else if (var0 == short.class) {
         return (short)0;
      } else if (var0 == char.class) {
         return '\u0000';
      } else {
         throw new IllegalArgumentException("Class " + var0.getName() + " is not a primitive type");
      }
   }

   public static Class<?> OHHHIRCIIIRRCORHHRICIRCOORORCH(Class<?> var0) {
      if (var0 == int.class) {
         return Integer.class;
      } else if (var0 == long.class) {
         return Long.class;
      } else if (var0 == boolean.class) {
         return Boolean.class;
      } else if (var0 == double.class) {
         return Double.class;
      } else if (var0 == float.class) {
         return Float.class;
      } else if (var0 == byte.class) {
         return Byte.class;
      } else if (var0 == short.class) {
         return Short.class;
      } else if (var0 == char.class) {
         return Character.class;
      } else {
         throw new IllegalArgumentException("Class " + var0.getName() + " is not a primitive type");
      }
   }

   public static Class<?> RHCICHRICRIIIHRRCICHOOOIOOOICH(Class<?> var0) {
      if (var0.isPrimitive()) {
         return var0;
      } else if (var0 == Integer.class) {
         return int.class;
      } else if (var0 == Long.class) {
         return long.class;
      } else if (var0 == Boolean.class) {
         return boolean.class;
      } else if (var0 == Double.class) {
         return double.class;
      } else if (var0 == Float.class) {
         return float.class;
      } else if (var0 == Byte.class) {
         return byte.class;
      } else if (var0 == Short.class) {
         return short.class;
      } else {
         return var0 == Character.class ? char.class : null;
      }
   }

   @Deprecated
   public static void HHCCIRHCCCIIRHCROHIORHIRHHIORH(Member var0) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, false);
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Member var0, boolean var1) {
      AccessibleObject var2 = (AccessibleObject)var0;

      try {
         Class var3 = var0.getDeclaringClass();
         boolean var7 = Modifier.isPublic(var0.getModifiers()) && Modifier.isPublic(var3.getModifiers());
         if (!var7 || var1 && !RCCICOCCCHROHOCCHIHORIHHCOHOHH(var3)) {
            var2.setAccessible(true);
         }
      } catch (SecurityException var5) {
         if (!var2.isAccessible()) {
            Class var4 = var0.getDeclaringClass();
            throw new IllegalArgumentException("Cannot access " + var0 + " (from class " + var4.getName() + "; failed to set access: " + var5.getMessage());
         }
      } catch (RuntimeException var6) {
         if ("InaccessibleObjectException".equals(var6.getClass().getSimpleName())) {
            throw new IllegalArgumentException(
               String.format(
                  "Failed to call `setAccess()` on %s '%s' (of class %s) due to `%s`, problem: %s",
                  var0.getClass().getSimpleName(),
                  var0.getName(),
                  ROIHROCROORRCCOIRRIHHORCROOORO(var0.getDeclaringClass()),
                  var6.getClass().getName(),
                  var6.getMessage()
               ),
               var6
            );
         }

         throw var6;
      }
   }

   public static boolean HIORIIIIOCCCRCHCOROROCCOIOOIIR(Class<?> var0) {
      return Enum.class.isAssignableFrom(var0);
   }

   public static Class<? extends Enum<?>> CRRRICCRROCOHHOHIICIHORCOORRRH(EnumSet<?> var0) {
      return !var0.isEmpty()
         ? HHCCIRHCCCIIRHCROHIORHIRHHIORH((Enum<?>)var0.iterator().next())
         : OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOCOOOCRIOIRCHIRRROOHRHCHHHHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var0);
   }

   public static Class<? extends Enum<?>> RRCRRCORICCHOHHIRCHIROOHIIOHCO(EnumMap<?, ?> var0) {
      return !var0.isEmpty()
         ? HHCCIRHCCCIIRHCROHIORHIRHHIORH((Enum<?>)var0.keySet().iterator().next())
         : OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IOCOOOCRIOIRCHIRRROOHRHCHHHHIC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var0);
   }

   public static Class<? extends Enum<?>> HHCCIRHCCCIIRHCROHIORHIRHHIORH(Enum<?> var0) {
      return (Class<? extends Enum<?>>)var0.getDeclaringClass();
   }

   public static Class<? extends Enum<?>> RHCHHROCORIHCIORRRIIOHIRHCRIOH(Class<?> var0) {
      if (var0.getSuperclass() != Enum.class) {
         var0 = var0.getSuperclass();
      }

      return var0;
   }

   public static <T extends Annotation> Enum<?> HHRIICOIOORCHCOIICOOIHIRHHICRI(Class<Enum<?>> var0, Class<T> var1) {
      Field[] var2 = var0.getDeclaredFields();

      for (Field var6 : var2) {
         if (var6.isEnumConstant()) {
            Annotation var7 = var6.getAnnotation(var1);
            if (var7 != null) {
               String var8 = var6.getName();

               for (Enum var12 : (Enum[])var0.getEnumConstants()) {
                  if (var8.equals(var12.name())) {
                     return var12;
                  }
               }
            }
         }
      }

      return null;
   }

   public static boolean IRIOOHCHIHIHRCOOHOCHOOOCIIICIO(Object var0) {
      return var0 == null || OOOOCHIHOOCHCCIHHRRICIRIOHOCRO(var0.getClass());
   }

   public static boolean OOOOCHIHOOCHCCIHHRRICIRIOHOCRO(Class<?> var0) {
      return var0.getAnnotation(
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.class
         )
         != null;
   }

   public static boolean RCCICOCCCHROHOCCHIHORIHHCOHOHH(Class<?> var0) {
      String var1 = var0.getName();
      return var1.startsWith("java.") || var1.startsWith("javax.");
   }

   public static boolean CIICIRCHRCIOCOHIOCHHCHCCOICROR() {
      try {
         return CCICIRIHROCOOICIOICICIHHICHRRI() >= 17;
      } catch (Throwable var1) {
         OCOHORHCROHICRRIHCIHHRRCIHICRI.IOIICIRIICICIIOORHCIIIIRRIHRHI(var1);
         System.err.println("Failed to determine JDK major version, assuming pre-JDK-17; problem: " + var1);
         return false;
      }
   }

   public static int CCICIRIHROCOOICIOICICIHHICHRRI() {
      String var0;
      try {
         var0 = System.getProperty("java.version");
      } catch (SecurityException var5) {
         throw new IllegalStateException("Could not access 'java.version': cannot determine JDK major version");
      }

      if (var0.startsWith("1.")) {
         return 8;
      }

      int var1 = var0.indexOf(".");
      String var2 = var1 < 0 ? var0 : var0.substring(0, var1);

      try {
         return Integer.parseInt(var2);
      } catch (NumberFormatException var4) {
         throw new IllegalStateException("Invalid JDK version String '" + var0 + "' cannot determine JDK major version");
      }
   }

   public static boolean CIHHIHOORIIHCOORRRICHHCCRRRCHO(Class<?> var0) {
      return !Modifier.isStatic(var0.getModifiers()) && HIIRCRROICHCOROOCCCCOIOOOCCIIC(var0) != null;
   }

   @Deprecated
   public static String getPackageName(Class<?> var0) {
      Package var1 = var0.getPackage();
      return var1 == null ? null : var1.getName();
   }

   public static boolean HICRCHHRCHOIRCOHROCIHHORHIOOCH(Class<?> var0) {
      return !COOOIIOHIRCRCHIHRHHICOOHIOORRR(var0) && var0.getEnclosingMethod() != null;
   }

   @Deprecated
   public static Field[] HOIRRRIRHICOHCCORHIHCOHIIIHCCO(Class<?> var0) {
      return var0.getDeclaredFields();
   }

   @Deprecated
   public static Method[] getDeclaredMethods(Class<?> var0) {
      return var0.getDeclaredMethods();
   }

   public static Annotation[] CCHCOROOHHCIHOHOCHIHRHOHOCROII(Class<?> var0) {
      return COOOIIOHIRCRCHIHRHHICOOHIOORRR(var0) ? HHOHCORHCIHROIOIICOIRRHRORHOOO : var0.getDeclaredAnnotations();
   }

   public static Method[] RCICHHOCCHOROIORCOHOHIRRHCIIOR(Class<?> var0) {
      try {
         return var0.getDeclaredMethods();
      } catch (NoClassDefFoundError var7) {
         ClassLoader var2 = Thread.currentThread().getContextClassLoader();
         if (var2 == null) {
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var7);
         }

         Class var3;
         try {
            var3 = var2.loadClass(var0.getName());
         } catch (ClassNotFoundException var6) {
            var7.addSuppressed(var6);
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var7);
         }

         try {
            return var3.getDeclaredMethods();
         } catch (Exception var5) {
            return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var5);
         }
      } catch (Exception var8) {
         return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0, var8);
      }
   }

   private static Method[] HHCCIRHCCCIIRHCROHIORHIRHHIORH(Class<?> var0, Throwable var1) {
      throw new IllegalArgumentException(
         String.format("Failed on call to `getDeclaredMethods()` on class `%s`, problem: (%s) %s", var0.getName(), var1.getClass().getName(), var1.getMessage()),
         var1
      );
   }

   public static OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] RHCHRCCRRHORIOCIOHHCRHCHICRIHH(Class<?> var0) {
      if (!var0.isInterface() && !COOOIIOHIRCRCHIHRHHICOOHIOORRR(var0)) {
         Constructor[] var1 = var0.getDeclaredConstructors();
         int var2 = var1.length;
         OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[] var3 = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH[var2];

         for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1[var4]);
         }

         return var3;
      } else {
         return CIHHORIRRCCCORCRCRICOICIICIRCO;
      }
   }

   public static Class<?> RCOCHOROICROOIRHRCRIOHIHCOCIII(Class<?> var0) {
      return COOOIIOHIRCRCHIHRHHICOOHIOORRR(var0) ? null : var0.getDeclaringClass();
   }

   public static Type HCIHORIHHCOOORRIOHIHIICCRHHOHC(Class<?> var0) {
      return var0.getGenericSuperclass();
   }

   public static Type[] OICIRICHOHHIIHIRRRROORCRRRCORH(Class<?> var0) {
      return var0.getGenericInterfaces();
   }

   public static Class<?> HIIRCRROICHCOROOCCCCOIOOOCCIIC(Class<?> var0) {
      return COOOIIOHIRCRCHIHRHHICOOHIOORRR(var0) ? null : var0.getEnclosingClass();
   }

   private static Class<?>[] IRRCHIRICCIHCCIHOHRCHRHRHCRCOH(Class<?> var0) {
      return var0.getInterfaces();
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      static final OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH IOCOOOCRIOIRCHIRRROOHRHCHHHHIC = new OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      private final Field IOROOIRRHICRICHIRRCRIHCCIHOOOO;
      private final Field COCCRHHHRROIIOHCIIHRHIHRICHOIC;
      private final String OCIHOORCIRIIICIIHHIRHCIIOHIRRI;
      private final String HCICIHOCOCHCCIOHHOHORCRRHCOORH;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         Field var1 = null;
         String var2 = null;

         try {
            var1 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EnumSet.class, "elementType", Class.class);
         } catch (Exception var5) {
            var2 = var5.toString();
         }

         this.IOROOIRRHICRICHIRRCRIHCCIHOOOO = var1;
         this.OCIHOORCIRIIICIIHHIRHCIIOHIRRI = var2;
         var1 = null;
         var2 = null;

         try {
            var1 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EnumMap.class, "keyType", Class.class);
         } catch (Exception var4) {
            var2 = var4.toString();
         }

         this.COCCRHHHRROIIOHCIIHRHIHRICHOIC = var1;
         this.HCICIHOCOCHCCIOHHOHORCRRHCOORH = var2;
      }

      public Class<? extends Enum<?>> RRCRRCORICCHOHHIRCHIROOHIIOHCO(EnumSet<?> var1) {
         if (this.IOROOIRRHICRICHIRRCRIHCCIHOOOO != null) {
            return (Class<? extends Enum<?>>)this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.IOROOIRRHICRICHIRRCRIHCCIHOOOO);
         } else {
            throw new IllegalStateException(
               "Cannot figure out type parameter for `EnumSet` (odd JDK platform?), problem: " + this.OCIHOORCIRIIICIIHHIRHCIIOHIRRI
            );
         }
      }

      public Class<? extends Enum<?>> RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(EnumMap<?, ?> var1) {
         if (this.COCCRHHHRROIIOHCIIHRHIHRICHOIC != null) {
            return (Class<? extends Enum<?>>)this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.COCCRHHHRROIIOHCIIHRHIHRICHOIC);
         } else {
            throw new IllegalStateException(
               "Cannot figure out type parameter for `EnumMap` (odd JDK platform?), problem: " + this.HCICIHOCOCHCCIOHHOHORCRRHCOORH
            );
         }
      }

      private Object RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var1, Field var2) {
         try {
            return var2.get(var1);
         } catch (Exception var4) {
            throw new IllegalArgumentException(var4);
         }
      }

      private static Field RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Class<?> var0, String var1, Class<?> var2) {
         Field[] var3 = var0.getDeclaredFields();

         for (Field var7 : var3) {
            if (var1.equals(var7.getName()) && var7.getType() == var2) {
               var7.setAccessible(true);
               return var7;
            }
         }

         throw new IllegalStateException(String.format("No field named '%s' in class '%s'", var1, var0.getName()));
      }
   }

   public static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      public final Constructor<?> IRHRCRHIIHROOIIIIRHRHHHCCOHIIH;
      private transient Annotation[] CRRICCOOHRCRHOHCHROCHCOICCROHR;
      private transient Annotation[][] RRHRIOIHHRRIIRCCIOHCHRRIHRCRRR;
      private int RHIOOCHCIIIHORCOOICCOHHRIOCIIO = -1;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Constructor<?> var1) {
         this.IRHRCRHIIHROOIIIIRHRHHHCCOHIIH = var1;
      }

      public Constructor<?> IRCOOROHOCCHOICOIRIRIRCRRHCIRH() {
         return this.IRHRCRHIIHROOIIIIRHRHHHCCOHIIH;
      }

      public int HHHIRIRHRCRHIHIIRCIRHICORRCHIC() {
         int var1 = this.RHIOOCHCIIIHORCOOICCOHHRIOCIIO;
         if (var1 < 0) {
            var1 = this.IRHRCRHIIHROOIIIIRHRHHHCCOHIIH.getParameterCount();
            this.RHIOOCHCIIIHORCOOICCOHHRIOCIIO = var1;
         }

         return var1;
      }

      public Class<?> getDeclaringClass() {
         return this.IRHRCRHIIHROOIIIIRHRHHHCCOHIIH.getDeclaringClass();
      }

      public Annotation[] getDeclaredAnnotations() {
         Annotation[] var1 = this.CRRICCOOHRCRHOHCHROCHCOICCROHR;
         if (var1 == null) {
            var1 = this.IRHRCRHIIHROOIIIIRHRHHHCCOHIIH.getDeclaredAnnotations();
            this.CRRICCOOHRCRHOHCHROCHCOICCROHR = var1;
         }

         return var1;
      }

      public Annotation[][] getParameterAnnotations() {
         Annotation[][] var1 = this.RRHRIOIHHRRIIRCCIOHCHRRIHRCRRR;
         if (var1 == null) {
            var1 = this.IRHRCRHIIHROOIIIIRHRHHHCCOHIIH.getParameterAnnotations();
            this.RRHRIOIHHRRIIRCCIOHCHRRIHRCRRR = var1;
         }

         return var1;
      }
   }
}
