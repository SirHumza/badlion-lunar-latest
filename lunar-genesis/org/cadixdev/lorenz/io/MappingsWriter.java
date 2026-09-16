package org.cadixdev.lorenz.io;

import java.io.Closeable;
import java.util.Comparator;
import java.util.function.Function;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.Mapping;
import org.cadixdev.lorenz.model.MethodMapping;

public abstract class MappingsWriter implements Closeable {
   @Deprecated
   protected static final Comparator<Mapping> ALPHABETISE_MAPPINGS = comparingLength(Mapping::getFullObfuscatedName);
   @Deprecated
   protected static final Comparator<FieldMapping> ALPHABETISE_FIELDS = Comparator.comparing(
      var0 -> var0.getFullObfuscatedName() + var0.getType().map(Object::toString).orElse("")
   );
   @Deprecated
   protected static final Comparator<MethodMapping> ALPHABETISE_METHODS = Comparator.comparing(
      var0 -> var0.getFullObfuscatedName() + var0.getDescriptor().toString()
   );
   protected MappingsWriterConfig config = MappingsWriterConfig.builder().build();

   private static <T> Comparator<T> comparingLength(Function<? super T, String> var0) {
      return (var1, var2) -> {
         String var3 = (String)var0.apply(var1);
         String var4 = (String)var0.apply(var2);
         return var3.length() != var4.length() ? var3.length() - var4.length() : var3.compareTo(var4);
      };
   }

   public MappingsWriterConfig getConfig() {
      return this.config;
   }

   public void setConfig(MappingsWriterConfig var1) {
      if (var1 == null) {
         throw new NullPointerException("config cannot be null!");
      }

      this.config = var1;
   }

   public abstract void write(MappingSet var1);
}
