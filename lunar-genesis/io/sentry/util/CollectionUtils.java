package io.sentry.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class CollectionUtils {
   private CollectionUtils() {
   }

   public static int size(@NotNull Iterable<?> var0) {
      if (var0 instanceof Collection) {
         return ((Collection)var0).size();
      }

      int var1 = 0;

      for (Object var3 : var0) {
         var1++;
      }

      return var1;
   }

   @Nullable
   public static <K, V> Map<K, V> newConcurrentHashMap(@Nullable Map<K, V> var0) {
      if (var0 != null) {
         ConcurrentHashMap var1 = new ConcurrentHashMap();

         for (Entry var3 : var0.entrySet()) {
            if (var3.getKey() != null && var3.getValue() != null) {
               var1.put(var3.getKey(), var3.getValue());
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   @Nullable
   public static <K, V> Map<K, @NotNull V> newHashMap(@Nullable Map<K, @NotNull V> var0) {
      return var0 != null ? new HashMap<>(var0) : null;
   }

   @Nullable
   public static <T> List<T> newArrayList(@Nullable List<T> var0) {
      return var0 != null ? new ArrayList<>(var0) : null;
   }

   @NotNull
   public static <K, V> Map<K, V> filterMapEntries(@NotNull Map<K, V> var0, @NotNull CollectionUtils.Predicate<Entry<K, V>> var1) {
      HashMap var2 = new HashMap();

      for (Entry var4 : var0.entrySet()) {
         if (var1.test(var4)) {
            var2.put(var4.getKey(), var4.getValue());
         }
      }

      return var2;
   }

   @NotNull
   public static <T, R> List<R> map(@NotNull List<T> var0, @NotNull CollectionUtils.Mapper<T, R> var1) {
      ArrayList var2 = new ArrayList(var0.size());

      for (Object var4 : var0) {
         var2.add(var1.map(var4));
      }

      return var2;
   }

   @NotNull
   public static <T> List<T> filterListEntries(@NotNull List<T> var0, @NotNull CollectionUtils.Predicate<T> var1) {
      ArrayList var2 = new ArrayList(var0.size());

      for (Object var4 : var0) {
         if (var1.test(var4)) {
            var2.add(var4);
         }
      }

      return var2;
   }

   public static <T> boolean contains(@NotNull T[] var0, @NotNull T var1) {
      for (Object var5 : var0) {
         if (var1.equals(var5)) {
            return true;
         }
      }

      return false;
   }

   public interface Mapper<T, R> {
      R map(T var1);
   }

   public interface Predicate<T> {
      boolean test(T var1);
   }
}
