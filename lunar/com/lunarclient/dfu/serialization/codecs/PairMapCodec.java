package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.MapCodec;
import com.lunarclient.dfu.serialization.MapLike;
import com.lunarclient.dfu.serialization.RecordBuilder;
import java.util.Objects;
import java.util.stream.Stream;

public final class PairMapCodec<F, S> extends MapCodec<Pair<F, S>> {
   private final MapCodec<F> first;
   private final MapCodec<S> second;

   public PairMapCodec(MapCodec<F> var1, MapCodec<S> var2) {
      this.first = var1;
      this.second = var2;
   }

   @Override
   public <T> DataResult<Pair<F, S>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      return this.first.decode(var1, var2).flatMap(var3 -> this.second.decode(var1, var2).map(var1xx -> Pair.of((F)var3, (S)var1xx)));
   }

   public <T> RecordBuilder<T> encode(Pair<F, S> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      return this.first.encode((F)var1.getFirst(), var2, this.second.encode((S)var1.getSecond(), var2, var3));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         PairMapCodec var2 = (PairMapCodec)var1;
         return Objects.equals(this.first, var2.first) && Objects.equals(this.second, var2.second);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.first, this.second);
   }

   @Override
   public String toString() {
      return "PairMapCodec[" + this.first + ", " + this.second + "]";
   }

   @Override
   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Stream.concat(this.first.keys(var1), this.second.keys(var1));
   }
}
