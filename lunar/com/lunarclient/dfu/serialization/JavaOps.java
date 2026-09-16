package com.lunarclient.dfu.serialization;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.lunarclient.dfu.datafixers.util.Pair;
import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import it.unimi.dsi.fastutil.bytes.ByteList;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class JavaOps implements DynamicOps<Object> {
   public static final JavaOps INSTANCE = new JavaOps();

   private JavaOps() {
   }

   @Override
   public Object empty() {
      return null;
   }

   @Override
   public Object emptyMap() {
      return Map.of();
   }

   @Override
   public Object emptyList() {
      return List.of();
   }

   @Override
   public <U> U convertTo(DynamicOps<U> var1, Object var2) {
      if (var2 == null) {
         return (U)var1.empty();
      } else if (var2 instanceof Map) {
         return this.convertMap(var1, var2);
      } else if (var2 instanceof ByteList var14) {
         return (U)var1.createByteList(ByteBuffer.wrap(var14.toByteArray()));
      } else if (var2 instanceof IntList var13) {
         return (U)var1.createIntList(var13.intStream());
      } else if (var2 instanceof LongList var12) {
         return (U)var1.createLongList(var12.longStream());
      } else if (var2 instanceof List) {
         return this.convertList(var1, var2);
      } else if (var2 instanceof String var11) {
         return (U)var1.createString(var11);
      } else if (var2 instanceof Boolean var10) {
         return (U)var1.createBoolean(var10);
      } else if (var2 instanceof Byte var9) {
         return (U)var1.createByte(var9);
      } else if (var2 instanceof Short var8) {
         return (U)var1.createShort(var8);
      } else if (var2 instanceof Integer var7) {
         return (U)var1.createInt(var7);
      } else if (var2 instanceof Long var6) {
         return (U)var1.createLong(var6);
      } else if (var2 instanceof Float var5) {
         return (U)var1.createFloat(var5);
      } else if (var2 instanceof Double var4) {
         return (U)var1.createDouble(var4);
      } else if (var2 instanceof Number var3) {
         return (U)var1.createNumeric(var3);
      } else {
         throw new IllegalStateException("Don't know how to convert " + var2);
      }
   }

   @Override
   public DataResult<Number> getNumberValue(Object var1) {
      return var1 instanceof Number var2 ? DataResult.success(var2) : DataResult.error(() -> "Not a number: " + var1);
   }

   @Override
   public Object createNumeric(Number var1) {
      return var1;
   }

   @Override
   public Object createByte(byte var1) {
      return var1;
   }

   @Override
   public Object createShort(short var1) {
      return var1;
   }

   @Override
   public Object createInt(int var1) {
      return var1;
   }

   @Override
   public Object createLong(long var1) {
      return var1;
   }

   @Override
   public Object createFloat(float var1) {
      return var1;
   }

   @Override
   public Object createDouble(double var1) {
      return var1;
   }

   @Override
   public DataResult<Boolean> getBooleanValue(Object var1) {
      return var1 instanceof Boolean var2 ? DataResult.success(var2) : DataResult.error(() -> "Not a boolean: " + var1);
   }

   @Override
   public Object createBoolean(boolean var1) {
      return var1;
   }

   @Override
   public DataResult<String> getStringValue(Object var1) {
      return var1 instanceof String var2 ? DataResult.success(var2) : DataResult.error(() -> "Not a string: " + var1);
   }

   @Override
   public Object createString(String var1) {
      return var1;
   }

   @Override
   public DataResult<Object> mergeToList(Object var1, Object var2) {
      if (var1 == this.empty()) {
         return DataResult.success(List.of(var2));
      } else if (var1 instanceof List var3) {
         return var3.isEmpty() ? DataResult.success(List.of(var2)) : DataResult.success(ImmutableList.builder().addAll(var3).add(var2).build());
      } else {
         return DataResult.error(() -> "Not a list: " + var1);
      }
   }

   @Override
   public DataResult<Object> mergeToList(Object var1, List<Object> var2) {
      if (var1 == this.empty()) {
         return DataResult.success(var2);
      }

      if (var1 instanceof List var3) {
         if (var2.isEmpty()) {
            return DataResult.success(var3);
         } else {
            return var3.isEmpty() ? DataResult.success(var2) : DataResult.success(ImmutableList.builder().addAll(var3).addAll(var2).build());
         }
      } else {
         return DataResult.error(() -> "Not a list: " + var1);
      }
   }

   @Override
   public DataResult<Object> mergeToMap(Object var1, Object var2, Object var3) {
      if (var1 == this.empty()) {
         return DataResult.success(Map.of(var2, var3));
      }

      if (var1 instanceof Map var4) {
         if (var4.isEmpty()) {
            return DataResult.success(Map.of(var2, var3));
         }

         Builder var5 = ImmutableMap.builderWithExpectedSize(var4.size() + 1);
         var5.putAll(var4);
         var5.put(var2, var3);
         return DataResult.success(var5.buildKeepingLast());
      } else {
         return DataResult.error(() -> "Not a map: " + var1);
      }
   }

   @Override
   public DataResult<Object> mergeToMap(Object var1, Map<Object, Object> var2) {
      if (var1 == this.empty()) {
         return DataResult.success(var2);
      }

      if (var1 instanceof Map var3) {
         if (var2.isEmpty()) {
            return DataResult.success(var3);
         }

         if (var3.isEmpty()) {
            return DataResult.success(var2);
         }

         Builder var4 = ImmutableMap.builderWithExpectedSize(var3.size() + var2.size());
         var4.putAll(var3);
         var4.putAll(var2);
         return DataResult.success(var4.buildKeepingLast());
      } else {
         return DataResult.error(() -> "Not a map: " + var1);
      }
   }

   private static Map<Object, Object> mapLikeToMap(MapLike<Object> var0) {
      return var0.entries().collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
   }

   @Override
   public DataResult<Object> mergeToMap(Object var1, MapLike<Object> var2) {
      if (var1 == this.empty()) {
         return DataResult.success(mapLikeToMap(var2));
      }

      if (var1 instanceof Map var3) {
         if (var3.isEmpty()) {
            return DataResult.success(mapLikeToMap(var2));
         }

         Iterator var4 = var2.entries().iterator();
         if (!var4.hasNext()) {
            return DataResult.success(var3);
         }

         Builder var5 = ImmutableMap.builderWithExpectedSize(var3.size());
         var5.putAll(var3);
         var4.forEachRemaining(var1x -> var5.put(var1x.getFirst(), var1x.getSecond()));
         return DataResult.success(var5.buildKeepingLast());
      } else {
         return DataResult.error(() -> "Not a map: " + var1);
      }
   }

   private static Stream<Pair<Object, Object>> getMapEntries(Map<?, ?> var0) {
      return var0.entrySet().stream().map(var0x -> Pair.of(var0x.getKey(), var0x.getValue()));
   }

   @Override
   public DataResult<Stream<Pair<Object, Object>>> getMapValues(Object var1) {
      return var1 instanceof Map var2 ? DataResult.success(getMapEntries(var2)) : DataResult.error(() -> "Not a map: " + var1);
   }

   @Override
   public DataResult<Consumer<BiConsumer<Object, Object>>> getMapEntries(Object var1) {
      return var1 instanceof Map var2 ? DataResult.success(var2::forEach) : DataResult.error(() -> "Not a map: " + var1);
   }

   @Override
   public Object createMap(Stream<Pair<Object, Object>> var1) {
      return var1.collect(ImmutableMap.toImmutableMap(Pair::getFirst, Pair::getSecond));
   }

   @Override
   public DataResult<MapLike<Object>> getMap(Object var1) {
      return var1 instanceof Map var2 ? DataResult.success(new MapLike<Object>() {
         @Nullable
         @Override
         public Object get(Object var1) {
            return var2.get(var1);
         }

         @Nullable
         @Override
         public Object get(String var1) {
            return var2.get(var1);
         }

         @Override
         public Stream<Pair<Object, Object>> entries() {
            return JavaOps.getMapEntries(var2);
         }

         @Override
         public String toString() {
            return "MapLike[" + var2 + "]";
         }
      }) : DataResult.error(() -> "Not a map: " + var1);
   }

   @Override
   public Object createMap(Map<Object, Object> var1) {
      return var1;
   }

   @Override
   public DataResult<Stream<Object>> getStream(Object var1) {
      return var1 instanceof List var2 ? DataResult.success(var2.stream().map(var0 -> (Object)var0)) : DataResult.error(() -> "Not an list: " + var1);
   }

   @Override
   public DataResult<Consumer<Consumer<Object>>> getList(Object var1) {
      return var1 instanceof List var2 ? DataResult.success(var2::forEach) : DataResult.error(() -> "Not an list: " + var1);
   }

   @Override
   public Object createList(Stream<Object> var1) {
      return var1.toList();
   }

   @Override
   public DataResult<ByteBuffer> getByteBuffer(Object var1) {
      return var1 instanceof ByteList var2 ? DataResult.success(ByteBuffer.wrap(var2.toByteArray())) : DataResult.error(() -> "Not a byte list: " + var1);
   }

   @Override
   public Object createByteList(ByteBuffer var1) {
      ByteBuffer var2 = var1.duplicate().clear();
      ByteArrayList var3 = new ByteArrayList();
      var3.size(var2.capacity());
      var2.get(0, var3.elements(), 0, var3.size());
      return var3;
   }

   @Override
   public DataResult<IntStream> getIntStream(Object var1) {
      return var1 instanceof IntList var2 ? DataResult.success(var2.intStream()) : DataResult.error(() -> "Not an int list: " + var1);
   }

   @Override
   public Object createIntList(IntStream var1) {
      return IntArrayList.toList(var1);
   }

   @Override
   public DataResult<LongStream> getLongStream(Object var1) {
      return var1 instanceof LongList var2 ? DataResult.success(var2.longStream()) : DataResult.error(() -> "Not a long list: " + var1);
   }

   @Override
   public Object createLongList(LongStream var1) {
      return LongArrayList.toList(var1);
   }

   @Override
   public Object remove(Object var1, String var2) {
      if (var1 instanceof Map var3) {
         LinkedHashMap var4 = new LinkedHashMap(var3);
         var4.remove(var2);
         return Map.copyOf(var4);
      } else {
         return var1;
      }
   }

   @Override
   public RecordBuilder<Object> mapBuilder() {
      return new JavaOps.FixedMapBuilder<>(this);
   }

   @Override
   public String toString() {
      return "Java";
   }

   private static final class FixedMapBuilder<T> extends RecordBuilder.AbstractUniversalBuilder<T, Builder<T, T>> {
      public FixedMapBuilder(DynamicOps<T> var1) {
         super(var1);
      }

      protected Builder<T, T> initBuilder() {
         return ImmutableMap.builder();
      }

      protected Builder<T, T> append(T var1, T var2, Builder<T, T> var3) {
         return var3.put(var1, var2);
      }

      protected DataResult<T> build(Builder<T, T> var1, T var2) {
         ImmutableMap var3 = var1.buildKeepingLast();
         return this.ops().mergeToMap((T)var2, var3);
      }
   }
}
