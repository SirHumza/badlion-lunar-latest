package org.cadixdev.lorenz.model;

import java.util.Optional;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.lorenz.merge.MappingSetMerger;

public interface FieldMapping extends MemberMapping<FieldMapping, ClassMapping> {
   FieldSignature getSignature();

   default FieldSignature getDeobfuscatedSignature() {
      return this.getType()
         .map(var1 -> new FieldSignature(this.getDeobfuscatedName(), this.getMappings().deobfuscate(var1)))
         .orElseGet(() -> new FieldSignature(this.getDeobfuscatedName()));
   }

   @Override
   default String getObfuscatedName() {
      return this.getSignature().getName();
   }

   default Optional<FieldType> getType() {
      return this.getSignature().getType().isPresent() ? this.getSignature().getType() : this.getMappings().getFieldTypeProvider().provide(this);
   }

   @Override
   default String getFullObfuscatedName() {
      return String.format("%s/%s", this.getParent().getFullObfuscatedName(), this.getObfuscatedName());
   }

   @Override
   default String getFullDeobfuscatedName() {
      return String.format("%s/%s", this.getParent().getFullDeobfuscatedName(), this.getDeobfuscatedName());
   }

   default FieldMapping reverse(ClassMapping var1) {
      return var1.createFieldMapping(this.getDeobfuscatedSignature(), this.getObfuscatedName());
   }

   default FieldMapping merge(FieldMapping var1, ClassMapping var2) {
      return MappingSetMerger.create(this.getMappings(), var1.getMappings()).mergeField(this, var1, var2);
   }

   default FieldMapping copy(ClassMapping var1) {
      return var1.createFieldMapping(this.getSignature(), this.getDeobfuscatedName());
   }
}
