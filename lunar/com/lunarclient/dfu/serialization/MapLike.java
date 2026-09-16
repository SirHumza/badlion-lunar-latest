package com.lunarclient.dfu.serialization;

import com.lunarclient.dfu.datafixers.util.Pair;
import java.util.Map;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public interface MapLike<T> {
   MapLike<Object> EMPTY = new MapLike<Object>() {
      @Nullable
      @Override
      public Object get(Object var1) {
         return null;
      }

      @Nullable
      @Override
      public Object get(String var1) {
         return null;
      }

      @Override
      public Stream<Pair<Object, Object>> entries() {
         return Stream.empty();
      }

      @Override
      public String toString() {
         return "EmptyMapLike";
      }
   };

   static <T> MapLike<T> empty() {
      return (MapLike<T>)EMPTY;
   }

   @Nullable
   T get(T var1);

   @Nullable
   T get(String var1);

   Stream<Pair<T, T>> entries();

   static <T> MapLike<T> forMap(final Map<T, T> var0, final DynamicOps<T> var1) {
      return var0.isEmpty() ? empty() : new MapLike<T>() {
         @Nullable
         @Override
         public T get(T var1x) {
            return (T)var0.get(var1x);
         }

         @Nullable
         @Override
         public T get(String var1x) {
            return (T)this.get((T)var1.createString(var1x));
         }

         @Override
         public Stream<Pair<T, T>> entries() {
            return var0.entrySet().stream().map(var0xx -> Pair.of((T)var0xx.getKey(), (T)var0xx.getValue()));
         }

         @Override
         public String toString() {
            return "MapLike[" + var0 + "]";
         }
      };
   }
}
