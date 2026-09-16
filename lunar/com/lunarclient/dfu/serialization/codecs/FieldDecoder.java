package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.Decoder;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.MapDecoder;
import com.lunarclient.dfu.serialization.MapLike;
import java.util.Objects;
import java.util.stream.Stream;

public final class FieldDecoder<A> extends MapDecoder.Implementation<A> {
   protected final String name;
   private final Decoder<A> elementCodec;

   public FieldDecoder(String var1, Decoder<A> var2) {
      this.name = var1;
      this.elementCodec = var2;
   }

   @Override
   public <T> DataResult<A> decode(DynamicOps<T> var1, MapLike<T> var2) {
      Object var3 = var2.get(this.name);
      return var3 == null ? DataResult.error(() -> "No key " + this.name + " in " + var2) : this.elementCodec.parse(var1, var3);
   }

   @Override
   public <T> Stream<T> keys(DynamicOps<T> var1) {
      return Stream.of((T)var1.createString(this.name));
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         FieldDecoder var2 = (FieldDecoder)var1;
         return Objects.equals(this.name, var2.name) && Objects.equals(this.elementCodec, var2.elementCodec);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name, this.elementCodec);
   }

   @Override
   public String toString() {
      return "FieldDecoder[" + this.name + ": " + this.elementCodec + "]";
   }
}
