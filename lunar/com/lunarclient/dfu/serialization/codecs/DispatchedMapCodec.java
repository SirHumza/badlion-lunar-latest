package com.lunarclient.dfu.serialization.codecs;

import com.google.common.collect.ImmutableMap;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.datafixers.util.Unit;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Lifecycle;
import com.lunarclient.dfu.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public record DispatchedMapCodec<K, V>() implements Codec<Map<K, V>> {
   private final Codec<K> keyCodec;
   private final Function<K, Codec<? extends V>> valueCodecFunction;

   public DispatchedMapCodec(Codec<K> var1, Function<K, Codec<? extends V>> var2) {
      this.keyCodec = var1;
      this.valueCodecFunction = var2;
   }

   public <T> DataResult<T> encode(Map<K, V> var1, DynamicOps<T> var2, T var3) {
      RecordBuilder var4 = var2.mapBuilder();

      for (Entry var6 : var1.entrySet()) {
         var4.add(
            this.keyCodec.encodeStart(var2, (K)var6.getKey()), this.encodeValue(this.valueCodecFunction.apply((K)var6.getKey()), (V)var6.getValue(), var2)
         );
      }

      return (DataResult<T>)var4.build(var3);
   }

   private <T, V2 extends V> DataResult<T> encodeValue(Codec<V2> var1, V var2, DynamicOps<T> var3) {
      return var1.encodeStart(var3, var2);
   }

   @Override
   public <T> DataResult<Pair<Map<K, V>, T>> decode(DynamicOps<T> var1, T var2) {
      return var1.getMap(var2)
         .flatMap(
            var3 -> {
               Object2ObjectArrayMap var4 = new Object2ObjectArrayMap();
               Builder var5 = Stream.builder();
               DataResult var6 = var3.entries()
                  .reduce(
                     DataResult.success(Unit.INSTANCE, Lifecycle.stable()),
                     (var4x, var5x) -> this.parseEntry(var4x, var1, (Pair<Object, Object>)var5x, var4, var5),
                     (var0, var1xx) -> var0.apply2stable((var0x, var1xxx) -> var0x, var1xx)
                  );
               Pair var7 = Pair.of(ImmutableMap.copyOf(var4), var2);
               Object var8 = var1.createMap(var5.build());
               return var6.<Pair<Map<K, V>, T>>map(var1xx -> var7).setPartial(var7).mapError(var1xx -> var1xx + " missed input: " + var8);
            }
         );
   }

   private <T> DataResult<Unit> parseEntry(DataResult<Unit> var1, DynamicOps<T> var2, Pair<T, T> var3, Map<K, V> var4, Builder<Pair<T, T>> var5) {
      DataResult var6 = this.keyCodec.parse(var2, var3.getFirst());
      DataResult var7 = var6.map(this.valueCodecFunction).flatMap(var2x -> var2x.parse(var2, var3.getSecond()).map(Function.identity()));
      DataResult var8 = var6.apply2stable(Pair::of, var7);
      Optional var9 = var8.resultOrPartial();
      if (var9.isPresent()) {
         Object var10 = ((Pair)var9.get()).getFirst();
         Object var11 = ((Pair)var9.get()).getSecond();
         if (var4.putIfAbsent(var10, var11) != null) {
            var5.add(var3);
            return var1.apply2stable((var0, var1x) -> var0, DataResult.error(() -> "Duplicate entry for key: '" + var10 + "'"));
         }
      }

      if (var8.isError()) {
         var5.add(var3);
      }

      return var1.apply2stable((var0, var1x) -> var0, var8);
   }
}
