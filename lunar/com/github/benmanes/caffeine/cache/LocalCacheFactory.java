package com.github.benmanes.caffeine.cache;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MethodHandles.Lookup;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.checkerframework.checker.nullness.qual.Nullable;

interface LocalCacheFactory {
   Lookup LOOKUP = MethodHandles.lookup();
   MethodType FACTORY = MethodType.methodType(void.class, Caffeine.class, AsyncCacheLoader.class, boolean.class);
   MethodType FACTORY_CALL = FACTORY.changeReturnType(BoundedLocalCache.class);
   ConcurrentMap<String, LocalCacheFactory> FACTORIES = new ConcurrentHashMap<>();

   <K, V> BoundedLocalCache<K, V> newInstance(Caffeine<K, V> var1, @Nullable AsyncCacheLoader<? super K, V> var2, boolean var3);

   static <K, V> BoundedLocalCache<K, V> newBoundedLocalCache(Caffeine<K, V> var0, @Nullable AsyncCacheLoader<? super K, V> var1, boolean var2) {
      String var3 = getClassName(var0);
      LocalCacheFactory var4 = loadFactory(var3);

      try {
         return var4.newInstance(var0, var1, var2);
      } catch (RuntimeException | Error var6) {
         throw var6;
      } catch (Throwable var7) {
         throw new IllegalStateException(var3, var7);
      }
   }

   static String getClassName(Caffeine<?, ?> var0) {
      StringBuilder var1 = new StringBuilder();
      if (var0.isStrongKeys()) {
         var1.append('S');
      } else {
         var1.append('W');
      }

      if (var0.isStrongValues()) {
         var1.append('S');
      } else {
         var1.append('I');
      }

      if (var0.removalListener != null) {
         var1.append('L');
      }

      if (var0.isRecordingStats()) {
         var1.append('S');
      }

      if (var0.evicts()) {
         var1.append('M');
         if (var0.isWeighted()) {
            var1.append('W');
         } else {
            var1.append('S');
         }
      }

      if (var0.expiresAfterAccess() || var0.expiresVariable()) {
         var1.append('A');
      }

      if (var0.expiresAfterWrite()) {
         var1.append('W');
      }

      if (var0.refreshAfterWrite()) {
         var1.append('R');
      }

      return var1.toString();
   }

   static LocalCacheFactory loadFactory(String var0) {
      LocalCacheFactory var1 = FACTORIES.get(var0);
      if (var1 == null) {
         var1 = FACTORIES.computeIfAbsent(var0, LocalCacheFactory::newFactory);
      }

      return var1;
   }

   static LocalCacheFactory newFactory(String var0) {
      try {
         Class var1 = LOOKUP.findClass(LocalCacheFactory.class.getPackageName() + "." + var0);

         try {
            return (LocalCacheFactory)LOOKUP.findStaticVarHandle(var1, "FACTORY", LocalCacheFactory.class).get();
         } catch (NoSuchFieldException var3) {
            return new LocalCacheFactory.MethodHandleBasedFactory(var1);
         }
      } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException var4) {
         throw new IllegalStateException(var0, var4);
      }
   }

   final class MethodHandleBasedFactory implements LocalCacheFactory {
      final MethodHandle methodHandle;

      MethodHandleBasedFactory(Class<?> var1) {
         this.methodHandle = LOOKUP.findConstructor(var1, FACTORY).asType(FACTORY_CALL);
      }

      @Override
      public <K, V> BoundedLocalCache<K, V> newInstance(Caffeine<K, V> var1, @Nullable AsyncCacheLoader<? super K, V> var2, boolean var3) {
         return (BoundedLocalCache)this.methodHandle.invokeExact((Caffeine)var1, (AsyncCacheLoader)var2, (boolean)var3);
      }
   }
}
