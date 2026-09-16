package com.lunarclient.dfu.serialization;

import java.util.function.Supplier;
import java.util.stream.Stream;

public interface Keyable {
   <T> Stream<T> keys(DynamicOps<T> var1);

   static Keyable forStrings(final Supplier<Stream<String>> var0) {
      return new Keyable() {
         @Override
         public <T> Stream<T> keys(DynamicOps<T> var1) {
            return ((Stream)var0.get()).map(var1::createString);
         }
      };
   }
}
