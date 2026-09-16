package com.moonsworth.lunar.lib.adventure.text.event;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.util.Services;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import net.kyori.examination.Examinable;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class DataComponentValueConverterRegistry {
   private static final Set<DataComponentValueConverterRegistry.Provider> PROVIDERS = Services.services(DataComponentValueConverterRegistry.Provider.class);

   private DataComponentValueConverterRegistry() {
   }

   public static Set<Key> knownProviders() {
      return Collections.unmodifiableSet(PROVIDERS.stream().map(DataComponentValueConverterRegistry.Provider::id).collect(Collectors.toSet()));
   }

   @NotNull
   public static <O extends DataComponentValue> O convert(@NotNull Class<O> var0, @NotNull Key var1, @NotNull DataComponentValue var2) {
      if (var0.isInstance(var2)) {
         return (O)var0.cast(var2);
      }

      DataComponentValueConverterRegistry.RegisteredConversion var3 = DataComponentValueConverterRegistry.ConversionCache.converter(
         (Class<? extends DataComponentValue>)var2.getClass(), var0
      );
      if (var3 == null) {
         throw new IllegalArgumentException(
            "There is no data holder converter registered to convert from a " + var2.getClass() + " instance to a " + var0 + " (on field " + var1 + ")"
         );
      }

      try {
         return (O)((DataComponentValueConverterRegistry.Conversion<DataComponentValue, ?>)var3.conversion).convert(var1, var2);
      } catch (Exception var5) {
         throw new IllegalStateException(
            "Failed to convert data component value of type "
               + var2.getClass()
               + " to type "
               + var0
               + " due to an error in a converter provided by "
               + var3.provider.asString()
               + "!",
            var5
         );
      }
   }

   @ApiStatus.NonExtendable
   public interface Conversion<I, O> extends Examinable {
      @NotNull
      static <I1, O1> DataComponentValueConverterRegistry.Conversion<I1, O1> convert(
         @NotNull Class<I1> var0, @NotNull Class<O1> var1, @NotNull BiFunction<Key, I1, O1> var2
      ) {
         return new DataComponentValueConversionImpl(
            Objects.requireNonNull(var0, "src"), Objects.requireNonNull(var1, "dst"), Objects.requireNonNull(var2, "op")
         );
      }

      @Contract(pure = true)
      @NotNull
      Class<I> source();

      @Contract(pure = true)
      @NotNull
      Class<O> destination();

      @NotNull
      O convert(@NotNull Key var1, @NotNull I var2);
   }

   static final class ConversionCache {
      private static final ConcurrentMap<Class<?>, ConcurrentMap<Class<?>, DataComponentValueConverterRegistry.RegisteredConversion>> CACHE = new ConcurrentHashMap<>();
      private static final Map<Class<?>, Set<DataComponentValueConverterRegistry.RegisteredConversion>> CONVERSIONS = collectConversions();

      private static Map<Class<?>, Set<DataComponentValueConverterRegistry.RegisteredConversion>> collectConversions() {
         ConcurrentHashMap var0 = new ConcurrentHashMap();

         for (DataComponentValueConverterRegistry.Provider var2 : DataComponentValueConverterRegistry.PROVIDERS) {
            Key var3 = Objects.requireNonNull(var2.id(), () -> "ID of provider " + var2 + " is null");

            for (DataComponentValueConverterRegistry.Conversion var5 : var2.conversions()) {
               var0.computeIfAbsent(var5.source(), var0x -> ConcurrentHashMap.newKeySet())
                  .add(new DataComponentValueConverterRegistry.RegisteredConversion(var3, var5));
            }
         }

         for (Entry var7 : var0.entrySet()) {
            var7.setValue(Collections.unmodifiableSet((Set)var7.getValue()));
         }

         return new ConcurrentHashMap<>(var0);
      }

      static DataComponentValueConverterRegistry.RegisteredConversion compute(Class<?> var0, Class<?> var1) {
         ArrayDeque var2 = new ArrayDeque();
         var2.add(var0);

         Class var3;
         while ((var3 = (Class)var2.poll()) != null) {
            Set var4 = CONVERSIONS.get(var3);
            if (var4 != null) {
               DataComponentValueConverterRegistry.RegisteredConversion var5 = null;

               for (DataComponentValueConverterRegistry.RegisteredConversion var7 : var4) {
                  Class var8 = var7.conversion.destination();
                  if (var1.equals(var8)) {
                     return var7;
                  }

                  if (var1.isAssignableFrom(var8) && (var5 == null || var8.isAssignableFrom(var5.conversion.destination()))) {
                     var5 = var7;
                  }
               }

               if (var5 != null) {
                  return var5;
               }
            }

            addSupertypes(var3, var2);
         }

         return DataComponentValueConverterRegistry.RegisteredConversion.NONE;
      }

      private static void addSupertypes(Class<?> var0, Deque<Class<?>> var1) {
         if (var0.getSuperclass() != null) {
            var1.add(var0.getSuperclass());
         }

         var1.addAll(Arrays.asList(var0.getInterfaces()));
      }

      @Nullable
      static DataComponentValueConverterRegistry.RegisteredConversion converter(
         Class<? extends DataComponentValue> var0, Class<? extends DataComponentValue> var1
      ) {
         DataComponentValueConverterRegistry.RegisteredConversion var2 = CACHE.computeIfAbsent(var0, var0x -> new ConcurrentHashMap<>())
            .computeIfAbsent(var1, var2x -> compute(var0, var1));
         return var2 == DataComponentValueConverterRegistry.RegisteredConversion.NONE ? null : var2;
      }
   }

   public interface Provider {
      @NotNull
      Key id();

      @NotNull
      Iterable<DataComponentValueConverterRegistry.Conversion<?, ?>> conversions();
   }

   static final class RegisteredConversion {
      static final DataComponentValueConverterRegistry.RegisteredConversion NONE = new DataComponentValueConverterRegistry.RegisteredConversion(null, null);
      final Key provider;
      final DataComponentValueConverterRegistry.Conversion<?, ?> conversion;

      RegisteredConversion(Key var1, DataComponentValueConverterRegistry.Conversion<?, ?> var2) {
         this.provider = var1;
         this.conversion = var2;
      }
   }
}
