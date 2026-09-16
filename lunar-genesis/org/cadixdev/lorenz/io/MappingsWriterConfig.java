package org.cadixdev.lorenz.io;

import java.util.Comparator;
import java.util.function.Function;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.Mapping;
import org.cadixdev.lorenz.model.MethodMapping;

public class MappingsWriterConfig {
   private final Comparator<ClassMapping<?, ?>> classMappingComparator;
   private final Comparator<FieldMapping> fieldMappingComparator;
   private final Comparator<MethodMapping> methodMappingComparator;

   public static MappingsWriterConfig.Builder builder() {
      return new MappingsWriterConfig.Builder();
   }

   MappingsWriterConfig(MappingsWriterConfig.Builder var1) {
      this.classMappingComparator = var1.classMappingComparator;
      this.fieldMappingComparator = var1.fieldMappingComparator;
      this.methodMappingComparator = var1.methodMappingComparator;
   }

   public Comparator<ClassMapping<?, ?>> getClassMappingComparator() {
      return this.classMappingComparator;
   }

   public Comparator<FieldMapping> getFieldMappingComparator() {
      return this.fieldMappingComparator;
   }

   public Comparator<MethodMapping> getMethodMappingComparator() {
      return this.methodMappingComparator;
   }

   public static class Builder {
      private Comparator<ClassMapping<?, ?>> classMappingComparator = MappingsWriterConfig.Utils.comparingLength(Mapping::getFullObfuscatedName);
      private Comparator<FieldMapping> fieldMappingComparator = Comparator.comparing(
         var0 -> var0.getFullObfuscatedName() + var0.getType().map(Object::toString).orElse("")
      );
      private Comparator<MethodMapping> methodMappingComparator = Comparator.comparing(var0 -> var0.getFullObfuscatedName() + var0.getDescriptor().toString());

      public MappingsWriterConfig.Builder classMappingComparator(Comparator<ClassMapping<?, ?>> var1) {
         if (var1 == null) {
            throw new NullPointerException("classMappingComparator cannot be null!");
         }

         this.classMappingComparator = var1;
         return this;
      }

      public MappingsWriterConfig.Builder fieldMappingComparator(Comparator<FieldMapping> var1) {
         if (var1 == null) {
            throw new NullPointerException("fieldMappingComparator cannot be null!");
         }

         this.fieldMappingComparator = var1;
         return this;
      }

      public MappingsWriterConfig.Builder methodMappingComparator(Comparator<MethodMapping> var1) {
         if (var1 == null) {
            throw new NullPointerException("methodMappingComparator cannot be null!");
         }

         this.methodMappingComparator = var1;
         return this;
      }

      public MappingsWriterConfig build() {
         return new MappingsWriterConfig(this);
      }
   }

   public static class Utils {
      public static <T> Comparator<T> comparingLength(Function<? super T, String> var0) {
         return (var1, var2) -> {
            String var3 = (String)var0.apply(var1);
            String var4 = (String)var0.apply(var2);
            return var3.length() != var4.length() ? var3.length() - var4.length() : var3.compareTo(var4);
         };
      }

      private Utils() {
      }
   }
}
