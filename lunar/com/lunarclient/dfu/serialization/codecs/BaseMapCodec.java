package com.lunarclient.dfu.serialization.codecs;

import com.google.common.collect.ImmutableMap;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.datafixers.util.Unit;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Lifecycle;
import com.lunarclient.dfu.serialization.MapLike;
import com.lunarclient.dfu.serialization.RecordBuilder;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public interface BaseMapCodec<K, V> {
   Codec<K> keyCodec();

   Codec<V> elementCodec();

   default <T> DataResult<Map<K, V>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      Object2ObjectArrayMap var3 = new Object2ObjectArrayMap();
      Builder var4 = Stream.builder();
      DataResult var5 = var2.entries().reduce(DataResult.success(Unit.INSTANCE, Lifecycle.stable()), (var4x, var5x) -> {
         DataResult var6x = this.keyCodec().parse(var1, var5x.getFirst());
         DataResult var7x = this.elementCodec().parse(var1, var5x.getSecond());
         DataResult var8 = var6x.apply2stable(Pair::of, var7x);
         Optional var9 = var8.resultOrPartial();
         if (var9.isPresent()) {
            Object var10 = var3.putIfAbsent(((Pair)var9.get()).getFirst(), ((Pair)var9.get()).getSecond());
            if (var10 != null) {
               var4.add(var5x);
               return var4x.apply2stable((var0, var1xx) -> var0, DataResult.error(() -> "Duplicate entry for key: '" + ((Pair)var9.get()).getFirst() + "'"));
            }
         }

         if (var8.isError()) {
            var4.add(var5x);
         }

         return var4x.apply2stable((var0, var1xx) -> var0, var8);
      }, (var0, var1x) -> var0.apply2stable((var0x, var1xx) -> var0x, var1x));
      ImmutableMap var6 = ImmutableMap.copyOf(var3);
      Object var7 = var1.createMap(var4.build());
      return var5.<Map<K, V>>map(var1x -> var6).setPartial(var6).mapError(var1x -> var1x + " missed input: " + var7);
   }

   default <T> RecordBuilder<T> encode(Map<K, V> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      for (Entry var5 : var1.entrySet()) {
         var3.add(this.keyCodec().encodeStart(var2, (K)var5.getKey()), this.elementCodec().encodeStart(var2, (V)var5.getValue()));
      }

      return var3;
   }
}
