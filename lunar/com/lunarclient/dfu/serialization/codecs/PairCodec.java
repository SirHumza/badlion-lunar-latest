package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Objects;

public final class PairCodec<F, S> implements Codec<Pair<F, S>> {
   private final Codec<F> first;
   private final Codec<S> second;

   public PairCodec(Codec<F> var1, Codec<S> var2) {
      this.first = var1;
      this.second = var2;
   }

   @Override
   public <T> DataResult<Pair<Pair<F, S>, T>> decode(DynamicOps<T> var1, T var2) {
      return this.first
         .decode(var1, var2)
         .flatMap(
            var2x -> this.second
               .decode(var1, var2x.getSecond())
               .map(var1xx -> (Pair<Pair<F, S>, T>)Pair.of(Pair.of((F)var2x.getFirst(), var1xx.getFirst()), var1xx.getSecond()))
         );
   }

   public <T> DataResult<T> encode(Pair<F, S> var1, DynamicOps<T> var2, T var3) {
      return this.second.encode((S)var1.getSecond(), var2, var3).flatMap(var3x -> this.first.encode((F)var1.getFirst(), var2, (T)var3x));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         PairCodec var2 = (PairCodec)var1;
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
      return "PairCodec[" + this.first + ", " + this.second + "]";
   }
}
