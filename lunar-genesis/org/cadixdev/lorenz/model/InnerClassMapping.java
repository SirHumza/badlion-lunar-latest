package org.cadixdev.lorenz.model;

import org.cadixdev.lorenz.merge.MappingSetMerger;

public interface InnerClassMapping extends ClassMapping<InnerClassMapping, ClassMapping>, MemberMapping<InnerClassMapping, ClassMapping> {
   InnerClassMapping setDeobfuscatedName(String var1);

   @Override
   String getSimpleObfuscatedName();

   @Override
   String getSimpleDeobfuscatedName();

   @Override
   default String getFullObfuscatedName() {
      return String.format("%s$%s", this.getParent().getFullObfuscatedName(), this.getObfuscatedName());
   }

   @Override
   default String getFullDeobfuscatedName() {
      return String.format("%s$%s", this.getParent().getFullDeobfuscatedName(), this.getDeobfuscatedName());
   }

   @Override
   default String getObfuscatedPackage() {
      return this.getParent().getObfuscatedPackage();
   }

   @Override
   default String getDeobfuscatedPackage() {
      return this.getParent().getDeobfuscatedPackage();
   }

   default InnerClassMapping reverse(ClassMapping var1) {
      InnerClassMapping var2 = var1.createInnerClassMapping(this.getDeobfuscatedName(), this.getObfuscatedName());
      this.getFieldMappings().forEach(var1x -> var1x.reverse(var2));
      this.getMethodMappings().forEach(var1x -> var1x.reverse(var2));
      this.getInnerClassMappings().forEach(var1x -> var1x.reverse(var2));
      return var2;
   }

   default InnerClassMapping merge(InnerClassMapping var1, ClassMapping var2) {
      return MappingSetMerger.create(this.getMappings(), var1.getMappings()).mergeInnerClass(this, var1, var2);
   }

   default InnerClassMapping copy(ClassMapping var1) {
      InnerClassMapping var2 = var1.createInnerClassMapping(this.getObfuscatedName(), this.getDeobfuscatedName());
      this.getFieldMappings().forEach(var1x -> var1x.copy(var2));
      this.getMethodMappings().forEach(var1x -> var1x.copy(var2));
      this.getInnerClassMappings().forEach(var1x -> var1x.copy(var2));
      return var2;
   }
}
