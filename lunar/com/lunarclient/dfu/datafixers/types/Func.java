package com.lunarclient.dfu.datafixers.types;

import com.lunarclient.dfu.datafixers.types.templates.TypeTemplate;
import com.lunarclient.dfu.serialization.Codec;
import com.lunarclient.dfu.serialization.Decoder;
import com.lunarclient.dfu.serialization.Encoder;
import java.util.function.Function;

public final class Func<A, B> extends Type<Function<A, B>> {
   protected final Type<A> first;
   protected final Type<B> second;

   public Func(Type<A> var1, Type<B> var2) {
      this.first = var1;
      this.second = var2;
   }

   @Override
   public TypeTemplate buildTemplate() {
      throw new UnsupportedOperationException("No template for function types.");
   }

   @Override
   protected Codec<Function<A, B>> buildCodec() {
      return Codec.of(Encoder.error("Cannot save a function"), Decoder.error("Cannot read a function"));
   }

   @Override
   public String toString() {
      return "(" + this.first + " -> " + this.second + ")";
   }

   @Override
   public boolean equals(Object var1, boolean var2, boolean var3) {
      return !(var1 instanceof Func var4) ? false : this.first.equals(var4.first, var2, var3) && this.second.equals(var4.second, var2, var3);
   }

   @Override
   public int hashCode() {
      int var1 = this.first.hashCode();
      return 31 * var1 + this.second.hashCode();
   }

   public Type<A> first() {
      return this.first;
   }

   public Type<B> second() {
      return this.second;
   }
}
