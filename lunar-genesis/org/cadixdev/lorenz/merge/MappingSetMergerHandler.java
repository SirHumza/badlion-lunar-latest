package org.cadixdev.lorenz.merge;

import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.cadixdev.lorenz.model.MethodParameterMapping;
import org.cadixdev.lorenz.model.TopLevelClassMapping;

public interface MappingSetMergerHandler {
   static MappingSetMergerHandler create() {
      return new MappingSetMergerHandler() {};
   }

   default MergeResult<TopLevelClassMapping> mergeTopLevelClassMappings(
      TopLevelClassMapping var1, TopLevelClassMapping var2, MappingSet var3, MergeContext var4
   ) {
      return new MergeResult<>(var3.createTopLevelClassMapping(var1.getObfuscatedName(), var2.getDeobfuscatedName()), var2);
   }

   default MergeResult<TopLevelClassMapping> mergeDuplicateTopLevelClassMappings(
      TopLevelClassMapping var1, TopLevelClassMapping var2, TopLevelClassMapping var3, MappingSet var4, MergeContext var5
   ) {
      return this.addRightTopLevelClassMapping(var2, var4, var5);
   }

   default MergeResult<TopLevelClassMapping> addLeftTopLevelClassMapping(TopLevelClassMapping var1, MappingSet var2, MergeContext var3) {
      return new MergeResult<>(var2.createTopLevelClassMapping(var1.getObfuscatedName(), var1.getDeobfuscatedName()));
   }

   default MergeResult<TopLevelClassMapping> addRightTopLevelClassMapping(TopLevelClassMapping var1, MappingSet var2, MergeContext var3) {
      return new MergeResult<>(var2.createTopLevelClassMapping(var1.getObfuscatedName(), var1.getDeobfuscatedName()), var1);
   }

   default MergeResult<InnerClassMapping> mergeInnerClassMappings(InnerClassMapping var1, InnerClassMapping var2, ClassMapping<?, ?> var3, MergeContext var4) {
      return new MergeResult<>(var3.createInnerClassMapping(var1.getObfuscatedName(), var2.getDeobfuscatedName()), var2);
   }

   default MergeResult<InnerClassMapping> mergeDuplicateInnerClassMappings(
      InnerClassMapping var1, InnerClassMapping var2, InnerClassMapping var3, ClassMapping<?, ?> var4, MergeContext var5
   ) {
      return this.addRightInnerClassMapping(var2, var4, var5);
   }

   default MergeResult<InnerClassMapping> addLeftInnerClassMapping(InnerClassMapping var1, ClassMapping<?, ?> var2, MergeContext var3) {
      return new MergeResult<>(var2.createInnerClassMapping(var1.getObfuscatedName(), var1.getDeobfuscatedName()));
   }

   default MergeResult<InnerClassMapping> addRightInnerClassMapping(InnerClassMapping var1, ClassMapping<?, ?> var2, MergeContext var3) {
      return new MergeResult<>(var2.createInnerClassMapping(var1.getObfuscatedName(), var1.getDeobfuscatedName()), var1);
   }

   default FieldMapping mergeFieldMappings(FieldMapping var1, FieldMapping var2, FieldMapping var3, ClassMapping<?, ?> var4, MergeContext var5) {
      return var2 != null
         ? var4.createFieldMapping(var1.getSignature(), var2.getDeobfuscatedName())
         : var4.createFieldMapping(var1.getSignature(), var3.getDeobfuscatedName());
   }

   default FieldMapping mergeDuplicateFieldMappings(
      FieldMapping var1, FieldMapping var2, FieldMapping var3, FieldMapping var4, FieldMapping var5, ClassMapping<?, ?> var6, MergeContext var7
   ) {
      return var2 != null ? this.addRightFieldMapping(var2, var6, var7) : this.addRightFieldMapping(var3, var6, var7);
   }

   default FieldMapping addLeftFieldMapping(FieldMapping var1, ClassMapping<?, ?> var2, MergeContext var3) {
      return var2.createFieldMapping(var1.getObfuscatedName(), var1.getDeobfuscatedName());
   }

   default FieldMapping addRightFieldMapping(FieldMapping var1, ClassMapping<?, ?> var2, MergeContext var3) {
      FieldType var4 = var3.getLeftReversed().deobfuscate(var1.getType().orElse(null));
      return var2.createFieldMapping(new FieldSignature(var1.getObfuscatedName(), var4), var1.getDeobfuscatedName());
   }

   default MergeResult<MethodMapping> mergeMethodMappings(
      MethodMapping var1, MethodMapping var2, MethodMapping var3, ClassMapping<?, ?> var4, MergeContext var5
   ) {
      return var2 != null
         ? new MergeResult<>(var4.createMethodMapping(var1.getSignature(), var2.getDeobfuscatedName()), var2)
         : new MergeResult<>(var4.createMethodMapping(var1.getSignature(), var3.getDeobfuscatedName()), var3);
   }

   default MergeResult<MethodMapping> mergeDuplicateMethodMappings(
      MethodMapping var1, MethodMapping var2, MethodMapping var3, MethodMapping var4, MethodMapping var5, ClassMapping<?, ?> var6, MergeContext var7
   ) {
      return var2 != null ? this.addRightMethodMapping(var2, var6, var7) : this.addRightMethodMapping(var3, var6, var7);
   }

   default MergeResult<MethodMapping> addLeftMethodMapping(MethodMapping var1, ClassMapping<?, ?> var2, MergeContext var3) {
      return new MergeResult<>(var2.createMethodMapping(var1.getSignature(), var1.getDeobfuscatedName()));
   }

   default MergeResult<MethodMapping> addRightMethodMapping(MethodMapping var1, ClassMapping<?, ?> var2, MergeContext var3) {
      MethodDescriptor var4 = var3.getLeftReversed().deobfuscate(var1.getDescriptor());
      return new MergeResult<>(var2.createMethodMapping(new MethodSignature(var1.getObfuscatedName(), var4), var1.getDeobfuscatedName()), var1);
   }

   default MethodParameterMapping mergeParameterMappings(MethodParameterMapping var1, MethodParameterMapping var2, MethodMapping var3, MergeContext var4) {
      return var3.createParameterMapping(var1.getIndex(), var2.getDeobfuscatedName());
   }

   default MethodParameterMapping addLeftParameterMapping(MethodParameterMapping var1, MethodMapping var2, MergeContext var3) {
      return var2.createParameterMapping(var1.getIndex(), var1.getDeobfuscatedName());
   }

   default MethodParameterMapping addRightParameterMapping(MethodParameterMapping var1, MethodMapping var2, MergeContext var3) {
      return var2.createParameterMapping(var1.getIndex(), var1.getDeobfuscatedName());
   }
}
