package org.cadixdev.lorenz.model;

import java.util.Collection;
import java.util.Optional;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.merge.MappingSetMerger;

public interface MethodMapping extends MemberMapping<MethodMapping, ClassMapping> {
   MethodSignature getSignature();

   default MethodSignature getDeobfuscatedSignature() {
      return new MethodSignature(this.getDeobfuscatedName(), this.getMappings().deobfuscate(this.getDescriptor()));
   }

   default MethodDescriptor getDescriptor() {
      return this.getSignature().getDescriptor();
   }

   default String getObfuscatedDescriptor() {
      return this.getDescriptor().toString();
   }

   default String getDeobfuscatedDescriptor() {
      return this.getDeobfuscatedSignature().getDescriptor().toString();
   }

   Collection<MethodParameterMapping> getParameterMappings();

   MethodParameterMapping createParameterMapping(int var1, String var2);

   Optional<MethodParameterMapping> getParameterMapping(int var1);

   default MethodParameterMapping getOrCreateParameterMapping(int var1) {
      return this.getParameterMapping(var1).orElseGet(() -> this.createParameterMapping(var1, String.valueOf(var1)));
   }

   boolean hasParameterMapping(int var1);

   default boolean hasMappings() {
      return this.hasDeobfuscatedName() || this.getParameterMappings().stream().anyMatch(Mapping::hasDeobfuscatedName);
   }

   @Override
   default String getFullObfuscatedName() {
      return String.format("%s/%s", this.getParent().getFullObfuscatedName(), this.getObfuscatedName());
   }

   @Override
   default String getFullDeobfuscatedName() {
      return String.format("%s/%s", this.getParent().getFullDeobfuscatedName(), this.getDeobfuscatedName());
   }

   default MethodMapping reverse(ClassMapping var1) {
      MethodMapping var2 = var1.createMethodMapping(this.getDeobfuscatedSignature(), this.getObfuscatedName());
      this.getParameterMappings().forEach(var1x -> var1x.reverse(var2));
      return var2;
   }

   default MethodMapping merge(MethodMapping var1, ClassMapping var2) {
      return MappingSetMerger.create(this.getMappings(), var1.getMappings()).mergeMethod(this, var1, var2);
   }

   default MethodMapping copy(ClassMapping var1) {
      MethodMapping var2 = var1.createMethodMapping(this.getSignature(), this.getDeobfuscatedName());
      this.getParameterMappings().forEach(var1x -> var1x.copy(var2));
      return var2;
   }
}
