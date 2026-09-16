package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.datafixers.util.Either;
import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import java.util.Optional;

public record XorCodec<F, S>() implements Codec<Either<F, S>> {
   private final Codec<F> first;
   private final Codec<S> second;

   public XorCodec(Codec<F> var1, Codec<S> var2) {
      this.first = var1;
      this.second = var2;
   }

   @Override
   public <T> DataResult<Pair<Either<F, S>, T>> decode(DynamicOps<T> var1, T var2) {
      DataResult var3 = this.first.decode(var1, var2).map(var0 -> var0.mapFirst(Either::left));
      DataResult var4 = this.second.decode(var1, var2).map(var0 -> var0.mapFirst(Either::right));
      Optional var5 = var3.result();
      Optional var6 = var4.result();
      if (var5.isPresent() && var6.isPresent()) {
         return DataResult.error(
            () -> "Both alternatives read successfully, can not pick the correct one; first: " + var5.get() + " second: " + var6.get(),
            (Pair<Either<F, S>, T>)var5.get()
         );
      } else if (var5.isPresent()) {
         return var3;
      } else {
         return var6.isPresent() ? var4 : var3.apply2((var0, var1x) -> var1x, var4);
      }
   }

   public <T> DataResult<T> encode(Either<F, S> var1, DynamicOps<T> var2, T var3) {
      return var1.map(var3x -> this.first.encode((F)var3x, var2, (T)var3), var3x -> this.second.encode((S)var3x, var2, (T)var3));
   }
}
