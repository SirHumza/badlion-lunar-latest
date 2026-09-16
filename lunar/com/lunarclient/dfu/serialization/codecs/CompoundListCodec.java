package com.lunarclient.dfu.serialization.codecs;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList.Builder;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.datafixers.util.Unit;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Lifecycle;
import com.lunarclient.dfu.serialization.RecordBuilder;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public final class CompoundListCodec<K, V> implements Codec<List<Pair<K, V>>> {
   private final Codec<K> keyCodec;
   private final Codec<V> elementCodec;

   public CompoundListCodec(Codec<K> var1, Codec<V> var2) {
      this.keyCodec = var1;
      this.elementCodec = var2;
   }

   @Override
   public <T> DataResult<Pair<List<Pair<K, V>>, T>> decode(DynamicOps<T> var1, T var2) {
      return var1.getMapEntries(var2).flatMap(var2x -> {
         Builder var3 = ImmutableList.builder();
         com.google.common.collect.ImmutableMap.Builder var4 = ImmutableMap.builder();
         AtomicReference var5 = new AtomicReference<>(DataResult.success(Unit.INSTANCE, Lifecycle.experimental()));
         var2x.accept((var5x, var6x) -> {
            DataResult var7x = this.keyCodec.parse(var1, var5x);
            DataResult var8x = this.elementCodec.parse(var1, var6x);
            DataResult var9 = var7x.apply2stable(Pair::new, var8x);
            var9.error().ifPresent(var3xx -> var4.put(var5x, var6x));
            var5.setPlain(((DataResult)var5.getPlain()).apply2stable((var1xxx, var2xxx) -> {
               var3.add(var2xxx);
               return var1xxx;
            }, var9));
         });
         ImmutableList var6 = var3.build();
         Object var7 = var1.createMap(var4.build());
         Pair var8 = Pair.of(var6, var7);
         return ((DataResult)var5.getPlain()).<Pair<List<Pair<K, V>>, T>>map(var1xx -> var8).setPartial(var8);
      });
   }

   public <T> DataResult<T> encode(List<Pair<K, V>> var1, DynamicOps<T> var2, T var3) {
      RecordBuilder var4 = var2.mapBuilder();

      for (Pair var6 : var1) {
         var4.add(this.keyCodec.encodeStart(var2, (K)var6.getFirst()), this.elementCodec.encodeStart(var2, (V)var6.getSecond()));
      }

      return (DataResult<T>)var4.build(var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         CompoundListCodec var2 = (CompoundListCodec)var1;
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
      return "CompoundListCodec[" + this.keyCodec + " -> " + this.elementCodec + "]";
   }
}
