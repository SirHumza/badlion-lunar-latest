package com.moonsworth.lunar.ichor.api;

import com.moonsworth.lunar.ichor.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.ichor.util.OOROOCCIRCCRHOIOIORIHCHHOOCCOR;
import java.util.Optional;
import java.util.ServiceLoader;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

@OOROOCCIRCCRHOIOIORIHCHHOOCCOR
public class IchorAPI {
   private static boolean canCacheClasses = Boolean.parseBoolean(System.getProperty("ichor.prebakeClasses", "true"));
   private static CORCOCICIRIOHROHROIIOOHICCHCRR classCacheLevel = null;

   public static Optional<com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR> getPipeline(@Nullable Object var0) {
      com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR var1 = null;
      if (var0 instanceof ClassLoader var2) {
         var1 = findPipeline(var2);
      }

      if (var1 == null && var0 != null) {
         if (var0 instanceof Class var3) {
            var1 = findPipeline(var3.getClassLoader());
         } else {
            var1 = findPipeline(var0.getClass().getClassLoader());
         }
      }

      if (var1 == null) {
         var1 = findPipeline(Thread.currentThread().getContextClassLoader());
      }

      if (var1 == null) {
         var1 = findPipeline(IchorAPI.class.getClassLoader());
      }

      return Optional.ofNullable(var1);
   }

   private static com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR findPipeline(ClassLoader var0) {
      while (var0 != null) {
         if (var0 instanceof IRCIIHHICIHRCOCRROCOICRIHHCCHH var7) {
            return var7.IHIRRIIORRHORHRORIHOROIRCORCOO();
         }

         Class[] var1 = var0.getClass().getInterfaces();

         for (Class var5 : var1) {
            if (var5.getName().equals(IRCIIHHICIHRCOCRROCOICRIHHCCHH.class.getName())) {
               IRCIIHHICIHRCOCRROCOICRIHHCCHH var6 = (IRCIIHHICIHRCOCRROCOICRIHHCCHH)var0;
               return var6.IHIRRIIORRHORHRORIHOROIRCORCOO();
            }
         }

         var0 = var0.getParent();
      }

      return null;
   }

   public static boolean canCacheClasses() {
      return canCacheClasses;
   }

   public static void doNotCacheClasses() {
      canCacheClasses = false;
   }

   public static Class<?> forName(String var0, Class<?> var1) {
      try {
         if (var1.getClassLoader() instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var5) {
            return var5.loadClass(var0);
         } else {
            Optional var2 = getPipeline(var1);
            if (var2.isPresent()) {
               ClassLoader var6 = ((com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var2.get()).HCCHROOOCOOCRORRORIRIHIHCCHIIH();
               return Class.forName(var0.replace('/', '.'), true, var6);
            } else {
               return Class.forName(var0);
            }
         }
      } catch (Throwable var4) {
         throw var4;
      }
   }

   public static ServiceLoader<?> loadService(Class<?> var0, Class<?> var1) {
      if (var1.getClassLoader() instanceof com.moonsworth.lunar.ichor.IRCIIHHICIHRCOCRROCOICRIHHCCHH var4) {
         return ServiceLoader.load(var0, var4);
      } else {
         Optional var2 = getPipeline(null);
         if (var2.isPresent()) {
            ClassLoader var5 = ((com.moonsworth.lunar.ichor.OOROOCCIRCCRHOIOIORIHCHHOOCCOR)var2.get()).HCCHROOOCOOCRORRORIRIHIHCCHIIH();
            return ServiceLoader.load(var0, var5);
         } else {
            return ServiceLoader.load(var0);
         }
      }
   }

   @Generated
   public static CORCOCICIRIOHROHROIIOOHICCHCRR getClassCacheLevel() {
      return classCacheLevel;
   }

   @Generated
   public static void setClassCacheLevel(CORCOCICIRIOHROHROIIOOHICCHCRR var0) {
      classCacheLevel = var0;
   }
}
