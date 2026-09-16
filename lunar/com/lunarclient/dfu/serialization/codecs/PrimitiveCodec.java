package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.datafixers.util.Pair;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;

public interface PrimitiveCodec<A> extends Codec<A> {
   <T> DataResult<A> read(DynamicOps<T> var1, T var2);

   <T> T write(DynamicOps<T> var1, A var2);

   @Override
   default <T> DataResult<Pair<A, T>> decode(DynamicOps<T> var1, T var2) {
      return this.read(var1, var2).map(var1x -> Pair.of((A)var1x, (T)var1.empty()));
   }

   @Override
   default <T> DataResult<T> encode(A var1, DynamicOps<T> var2, T var3) {
      return (DataResult<T>)var2.mergeToPrimitive(var3, this.write(var2, (A)var1));
   }
}
