package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.MapCodec;
import com.lunarclient.dfu.serialization.MapLike;
import com.lunarclient.dfu.serialization.RecordBuilder;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalFieldCodec<A> extends MapCodec<Optional<A>> {
   private final String name;
   private final Codec<A> elementCodec;
   private final boolean lenient;

   public OptionalFieldCodec(String var1, Codec<A> var2, boolean var3) {
      this.name = var1;
      this.elementCodec = var2;
      this.lenient = var3;
   }

   @Override
   public <T> DataResult<Optional<A>> decode(DynamicOps<T> var1, MapLike<T> var2) {
      Object var3 = var2.get(this.name);
      if (var3 == null) {
         return DataResult.success(Optional.empty());
      }

      DataResult var4 = this.elementCodec.parse(var1, var3);
      return var4.isError() && this.lenient ? DataResult.success(Optional.empty()) : var4.map(Optional::of).setPartial(var4.resultOrPartial());
   }

   public <T> RecordBuilder<T> encode(Optional<A> var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      return var1.isPresent() ? var3.add(this.name, this.elementCodec.encodeStart(var2, (A)var1.get())) : var3;
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
         OptionalFieldCodec var2 = (OptionalFieldCodec)var1;
         return Objects.equals(this.name, var2.name) && Objects.equals(this.elementCodec, var2.elementCodec) && this.lenient == var2.lenient;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name, this.elementCodec, this.lenient);
   }

   @Override
   public String toString() {
      return "OptionalFieldCodec[" + this.name + ": " + this.elementCodec + "]";
   }
}
