package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.MapCodec;
import com.lunarclient.dfu.serialization.MapDecoder;
import com.lunarclient.dfu.serialization.MapEncoder;
import com.lunarclient.dfu.serialization.MapLike;
import com.lunarclient.dfu.serialization.RecordBuilder;
import java.util.function.Function;
import java.util.stream.Stream;

public class KeyDispatchCodec<K, V> extends MapCodec<V> {
   private static final String COMPRESSED_VALUE_KEY = "value";
   private final MapCodec<K> keyCodec;
   private final Function<? super V, ? extends DataResult<? extends K>> type;
   private final Function<? super K, ? extends DataResult<? extends MapDecoder<? extends V>>> decoder;
   private final Function<? super V, ? extends DataResult<? extends MapEncoder<V>>> encoder;

   protected KeyDispatchCodec(
      MapCodec<K> var1,
      Function<? super V, ? extends DataResult<? extends K>> var2,
      Function<? super K, ? extends DataResult<? extends MapDecoder<? extends V>>> var3,
      Function<? super V, ? extends DataResult<? extends MapEncoder<V>>> var4
   ) {
      this.keyCodec = var1;
      this.type = var2;
      this.decoder = var3;
      this.encoder = var4;
   }

   public KeyDispatchCodec(
      MapCodec<K> var1,
      Function<? super V, ? extends DataResult<? extends K>> var2,
      Function<? super K, ? extends DataResult<? extends MapCodec<? extends V>>> var3
   ) {
      this(var1, var2, var3, var2x -> getCodec(var2, var3, (V)var2x));
   }

   @Override
   public <T> DataResult<V> decode(DynamicOps<T> var1, MapLike<T> var2) {
      return this.keyCodec
         .decode(var1, var2)
         .flatMap(
            var3 -> this.decoder
               .apply(var3)
               .flatMap(
                  var2xx -> {
                     if (var1.compressMaps()) {
                        Object var3x = var2.get(var1.createString("value"));
                        return var3x == null
                           ? DataResult.error(() -> "Input does not have a \"value\" entry: " + var2)
                           : var2xx.decoder().parse(var1, var3x).map(Function.identity());
                     } else {
                        return var2xx.decode(var1, var2).map(Function.identity());
                     }
                  }
               )
         );
   }

   @Override
   public <T> RecordBuilder<T> encode(V var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      DataResult var4 = this.encoder.apply((V)var1);
      DataResult var5 = this.type.apply((V)var1);
      RecordBuilder var6 = var3.withErrorsFrom(var4).withErrorsFrom(var5);
      if (!var4.isError() && !var5.isError()) {
         MapEncoder var7 = (MapEncoder)var4.getOrThrow();
         Object var8 = var5.getOrThrow();
         if (var2.compressMaps()) {
            return this.keyCodec.<T>encode((K)var8, var2, var6).add("value", var7.encoder().encodeStart(var2, var1));
         }

         RecordBuilder var9 = var7.encode(var1, var2, var6);
         return this.keyCodec.encode((K)var8, var2, var9);
      } else {
         return var6;
      }
   }

   @Override
   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Stream.concat(this.keyCodec.keys(var1), Stream.of((T)var1.createString("value")));
   }

   private static <K, V> DataResult<? extends MapEncoder<V>> getCodec(
      Function<? super V, ? extends DataResult<? extends K>> var0, Function<? super K, ? extends DataResult<? extends MapEncoder<? extends V>>> var1, V var2
   ) {
      return ((DataResult)var0.apply(var2))
         .<MapEncoder>flatMap(var1x -> ((DataResult)var1.apply(var1x)).map(Function.identity()))
         .map(var0x -> (MapEncoder<V>)var0x);
   }

   @Override
   public String toString() {
      return "KeyDispatchCodec[" + this.keyCodec.toString() + " " + this.type + " " + this.decoder + "]";
   }
}
