package org.cadixdev.lorenz.model;

import org.cadixdev.lorenz.merge.MappingSetMerger;

public interface MethodParameterMapping extends MemberMapping<MethodParameterMapping, MethodMapping> {
   int getIndex();

   @Override
   default String getObfuscatedName() {
      return String.valueOf(this.getIndex());
   }

   default MethodParameterMapping reverse(MethodMapping var1) {
      return var1.createParameterMapping(this.getIndex(), this.getDeobfuscatedName());
   }

   default MethodParameterMapping merge(MethodParameterMapping var1, MethodMapping var2) {
      return MappingSetMerger.create(this.getMappings(), var1.getMappings()).mergeMethodParameter(this, var1, var2);
   }

   default MethodParameterMapping copy(MethodMapping var1) {
      return var1.createParameterMapping(this.getIndex(), this.getDeobfuscatedName());
   }
}
