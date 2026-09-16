package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Lifecycle;
import com.lunarclient.dfu.serialization.MapLike;
import java.util.Map;

public record UnboundedMapCodec<K, V>() implements Codec<Map<K, V>>, BaseMapCodec<K, V> {
   private final Codec<K> keyCodec;
   private final Codec<V> elementCodec;

   public UnboundedMapCodec(Codec<K> var1, Codec<V> var2) {
      this.keyCodec = var1;
      this.elementCodec = var2;
   }

   @Override
   public <T> DataResult<Pair<Map<K, V>, T>> decode(DynamicOps<T> var1, T var2) {
      return var1.getMap(var2)
         .setLifecycle(Lifecycle.stable())
         .flatMap(var2x -> this.decode(var1, (MapLike<Object>)var2x))
         .map(var1x -> Pair.of((Map<K, V>)var1x, (T)var2));
   }

   public <T> DataResult<T> encode(Map<K, V> var1, DynamicOps<T> var2, T var3) {
      return this.<T>encode(var1, var2, var2.mapBuilder()).build((T)var3);
   }

   @Override
   public String toString() {
      return "UnboundedMapCodec[" + this.keyCodec + " -> " + this.elementCodec + "]";
   }
}
