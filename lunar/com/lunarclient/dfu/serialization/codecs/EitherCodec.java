package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;

public record EitherCodec<F, S>() implements Codec<Either<F, S>> {
   private final Codec<F> first;
   private final Codec<S> second;

   public EitherCodec(Codec<F> var1, Codec<S> var2) {
      this.first = var1;
      this.second = var2;
   }

   @Override
   public <T> DataResult<Pair<Either<F, S>, T>> decode(DynamicOps<T> var1, T var2) {
      DataResult var3 = this.first.decode(var1, var2).map(var0 -> var0.mapFirst(Either::left));
      if (var3.isSuccess()) {
         return var3;
      } else {
         DataResult var4 = this.second.decode(var1, var2).map(var0 -> var0.mapFirst(Either::right));
         if (var4.isSuccess()) {
            return var4;
         } else if (var3.hasResultOrPartial()) {
            return var3;
         } else {
            return var4.hasResultOrPartial()
               ? var4
               : DataResult.error(
                  () -> "Failed to parse either. First: "
                     + ((DataResult.Error)var3.error().orElseThrow()).message()
                     + "; Second: "
                     + ((DataResult.Error)var4.error().orElseThrow()).message()
               );
         }
      }
   }

   public <T> DataResult<T> encode(Either<F, S> var1, DynamicOps<T> var2, T var3) {
      return var1.map(var3x -> this.first.encode((F)var3x, var2, (T)var3), var3x -> this.second.encode((S)var3x, var2, (T)var3));
   }
}
