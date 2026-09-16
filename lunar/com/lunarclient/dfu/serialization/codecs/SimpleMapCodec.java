package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Keyable;
import com.lunarclient.dfu.serialization.MapCodec;
import com.lunarclient.dfu.serialization.MapLike;
import com.lunarclient.dfu.serialization.RecordBuilder;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;

public final class SimpleMapCodec<K, V> extends MapCodec<Map<K, V>> implements BaseMapCodec<K, V> {
   private final Codec<K> keyCodec;
   private final Codec<V> elementCodec;
   private final Keyable keys;

   public SimpleMapCodec(Codec<K> var1, Codec<V> var2, Keyable var3) {
      this.keyCodec = var1;
      this.elementCodec = var2;
      this.keys = var3;
   }

   @Override
   public Codec<K> keyCodec() {
      return this.keyCodec;
   }

   @Override
   public Codec<V> elementCodec() {
      return this.elementCodec;
   }

   @Override
   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return this.keys.keys(var1);
   }

   @Override
   public <T> DataResult<Map<K, V>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      return BaseMapCodec.super.decode(var1, var2);
   }

   @Override
   public <T> RecordBuilder<T> encode(Map<K, V> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      return BaseMapCodec.super.encode(var1, var2, var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         SimpleMapCodec var2 = (SimpleMapCodec)var1;
         return Objects.equals(this.keyCodec, var2.keyCodec) && Objects.equals(this.elementCodec, var2.elementCodec);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.keyCodec, this.elementCodec);
   }

   @Override
   public String toString() {
      return "SimpleMapCodec[" + this.keyCodec + " -> " + this.elementCodec + "]";
   }
}
