package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.MapCodec;
import com.lunarclient.dfu.serialization.MapLike;
import com.lunarclient.dfu.serialization.RecordBuilder;
import java.util.Objects;
import java.util.stream.Stream;

public final class EitherMapCodec<F, S> extends MapCodec<Either<F, S>> {
   private final MapCodec<F> first;
   private final MapCodec<S> second;

   public EitherMapCodec(MapCodec<F> var1, MapCodec<S> var2) {
      this.first = var1;
      this.second = var2;
   }

   @Override
   public <T> DataResult<Either<F, S>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      DataResult var3 = this.first.decode(var1, var2).map(Either::left);
      if (var3.isSuccess()) {
         return var3;
      }

      DataResult var4 = this.second.decode(var1, var2).map(Either::right);
      return var4.isSuccess() ? var4 : var3.apply2((var0, var1x) -> var1x, var4);
   }

   public <T> RecordBuilder<T> encode(Either<F, S> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      return var1.map(var3x -> this.first.encode((F)var3x, var2, var3), var3x -> this.second.encode((S)var3x, var2, var3));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         EitherMapCodec var2 = (EitherMapCodec)var1;
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
      return "EitherMapCodec[" + this.first + ", " + this.second + "]";
   }

   @Override
   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Stream.concat(this.first.keys(var1), this.second.keys(var1));
   }
}
