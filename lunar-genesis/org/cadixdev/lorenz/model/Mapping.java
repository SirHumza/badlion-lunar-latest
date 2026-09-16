package org.cadixdev.lorenz.model;

import java.util.Optional;
import java.util.function.Supplier;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.util.Reversible;

public interface Mapping<M extends Mapping, P> extends Reversible<M, P> {
   String getObfuscatedName();

   String getDeobfuscatedName();

   M setDeobfuscatedName(String var1);

   default String getSimpleObfuscatedName() {
      return this.getObfuscatedName();
   }

   default String getSimpleDeobfuscatedName() {
      return this.getDeobfuscatedName();
   }

   String getFullObfuscatedName();

   String getFullDeobfuscatedName();

   boolean hasDeobfuscatedName();

   MappingSet getMappings();

   M merge(M var1, P var2);

   M copy(P var1);

   <T> Optional<T> get(ExtensionKey<T> var1);

   default <T> T getOrCreate(ExtensionKey<T> var1, Supplier<T> var2) {
      return this.<T>get(var1).orElseGet(() -> {
         Object var3 = var2.get();
         this.set(var1, var3);
         return (T)var3;
      });
   }

   <T> void set(ExtensionKey<T> var1, T var2);
}
