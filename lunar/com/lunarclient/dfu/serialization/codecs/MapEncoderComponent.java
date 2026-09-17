package com.lunarclient.dfu.serialization.codecs;

import com.lunarclient.dfu.serialization.DataResult;
import com.lunarclient.dfu.serialization.DynamicOps;
import com.lunarclient.dfu.serialization.Encoder;
import com.lunarclient.dfu.serialization.MapEncoder;
import com.lunarclient.dfu.serialization.RecordBuilder;
import java.util.Objects;
import java.util.stream.Stream;

public class FieldEncoder<A> extends MapEncoder.Implementation<A> {
   private final String name;
   private final Encoder<A> elementCodec;

   public FieldEncoder(String var1, Encoder<A> var2) {
      this.name = var1;
      this.elementCodec = var2;
   }

   @Override
   public <T> RecordBuilder<T> encode(A var1, DynamicOps<T> var2, RecordBuilder<T> var3) {
      DataResult var4 = this.elementCodec.encodeStart(var2, (A)var1);
      return var3.add(this.name, var4);
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
         FieldEncoder var2 = (FieldEncoder)var1;
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
      return "FieldEncoder[" + this.name + ": " + this.elementCodec + "]";
   }
}
