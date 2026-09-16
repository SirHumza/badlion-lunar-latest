package org.cadixdev.lorenz.model;

import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import org.cadixdev.bombe.analysis.InheritanceCompletable;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;

public interface ClassMapping<M extends ClassMapping, P> extends InheritanceCompletable, Mapping<M, P> {
   @Override
   String getSimpleObfuscatedName();

   @Override
   String getSimpleDeobfuscatedName();

   String getObfuscatedPackage();

   String getDeobfuscatedPackage();

   Collection<FieldMapping> getFieldMappings();

   Map<String, FieldMapping> getFieldsByName();

   Optional<FieldMapping> getFieldMapping(FieldSignature var1);

   Optional<FieldMapping> getFieldMapping(String var1);

   Optional<FieldMapping> computeFieldMapping(FieldSignature var1);

   FieldMapping createFieldMapping(FieldSignature var1, String var2);

   default FieldMapping createFieldMapping(String var1, String var2) {
      return this.createFieldMapping(new FieldSignature(var1), var2);
   }

   default FieldMapping createFieldMapping(FieldSignature var1) {
      return this.createFieldMapping(var1, var1.getName());
   }

   default FieldMapping createFieldMapping(String var1) {
      return this.createFieldMapping(var1, var1);
   }

   default FieldMapping getOrCreateFieldMapping(FieldSignature var1) {
      return this.getFieldMapping(var1).orElseGet(() -> this.createFieldMapping(var1));
   }

   default FieldMapping getOrCreateFieldMapping(String var1) {
      return this.getFieldMapping(var1).orElseGet(() -> this.createFieldMapping(var1));
   }

   default FieldMapping getOrCreateFieldMapping(String var1, String var2) {
      return this.getOrCreateFieldMapping(new FieldSignature(var1, FieldType.of(var2)));
   }

   default FieldMapping getOrCreateFieldMapping(String var1, FieldType var2) {
      return this.getOrCreateFieldMapping(new FieldSignature(var1, var2));
   }

   boolean hasFieldMapping(FieldSignature var1);

   default boolean hasFieldMapping(String var1) {
      return this.hasFieldMapping(new FieldSignature(var1));
   }

   void removeFieldMapping(FieldSignature var1);

   void removeFieldMapping(FieldMapping var1);

   void removeFieldMapping(String var1);

   Collection<MethodMapping> getMethodMappings();

   Optional<MethodMapping> getMethodMapping(MethodSignature var1);

   default Optional<MethodMapping> getMethodMapping(String var1, String var2) {
      return this.getMethodMapping(MethodSignature.of(var1, var2));
   }

   MethodMapping createMethodMapping(MethodSignature var1, String var2);

   default MethodMapping createMethodMapping(MethodSignature var1) {
      return this.createMethodMapping(var1, var1.getName());
   }

   default MethodMapping createMethodMapping(String var1, String var2) {
      return this.createMethodMapping(MethodSignature.of(var1, var2));
   }

   default MethodMapping createMethodMapping(String var1, MethodDescriptor var2) {
      return this.createMethodMapping(new MethodSignature(var1, var2));
   }

   default MethodMapping getOrCreateMethodMapping(MethodSignature var1) {
      return this.getMethodMapping(var1).orElseGet(() -> this.createMethodMapping(var1));
   }

   default MethodMapping getOrCreateMethodMapping(String var1, String var2) {
      return this.getOrCreateMethodMapping(MethodSignature.of(var1, var2));
   }

   default MethodMapping getOrCreateMethodMapping(String var1, MethodDescriptor var2) {
      return this.getOrCreateMethodMapping(new MethodSignature(var1, var2));
   }

   boolean hasMethodMapping(MethodSignature var1);

   void removeMethodMapping(MethodSignature var1);

   void removeMethodMapping(MethodMapping var1);

   Collection<InnerClassMapping> getInnerClassMappings();

   Optional<InnerClassMapping> getInnerClassMapping(String var1);

   InnerClassMapping createInnerClassMapping(String var1, String var2);

   default InnerClassMapping createInnerClassMapping(String var1) {
      return this.createInnerClassMapping(var1, var1);
   }

   default InnerClassMapping getOrCreateInnerClassMapping(String var1) {
      return this.getInnerClassMapping(var1).orElseGet(() -> this.createInnerClassMapping(var1));
   }

   boolean hasInnerClassMapping(String var1);

   void removeInnerClassMapping(String var1);

   void removeInnerClassMapping(ClassMapping<?, ?> var1);

   default boolean hasMappings() {
      return this.hasDeobfuscatedName()
         || this.getFieldMappings().stream().anyMatch(Mapping::hasDeobfuscatedName)
         || this.getMethodMappings().stream().anyMatch(MethodMapping::hasMappings)
         || this.getInnerClassMappings().stream().anyMatch(ClassMapping::hasMappings);
   }

   @Override
   default Optional<InheritanceProvider.ClassInfo> provideInheritance(InheritanceProvider var1, Object var2) {
      return var1.provide(this.getFullObfuscatedName(), var2);
   }
}
