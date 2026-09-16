package org.cadixdev.lorenz.model;

import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.merge.MappingSetMerger;

public interface TopLevelClassMapping extends ClassMapping<TopLevelClassMapping, MappingSet> {
   @Override
   default String getSimpleObfuscatedName() {
      String var1 = this.getObfuscatedName();
      int var2 = var1.lastIndexOf(47);
      return var2 >= 0 ? var1.substring(var2 + 1) : var1;
   }

   @Override
   default String getSimpleDeobfuscatedName() {
      String var1 = this.getDeobfuscatedName();
      int var2 = var1.lastIndexOf(47);
      return var2 >= 0 ? var1.substring(var2 + 1) : var1;
   }

   @Override
   default String getFullObfuscatedName() {
      return this.getObfuscatedName();
   }

   @Override
   default String getFullDeobfuscatedName() {
      return this.getDeobfuscatedName();
   }

   @Override
   default String getObfuscatedPackage() {
      String var1 = this.getObfuscatedName();
      int var2 = var1.lastIndexOf(47);
      return var2 >= 0 ? var1.substring(0, var2) : "";
   }

   @Override
   default String getDeobfuscatedPackage() {
      String var1 = this.getDeobfuscatedName();
      int var2 = var1.lastIndexOf(47);
      return var2 >= 0 ? var1.substring(0, var2) : "";
   }

   default TopLevelClassMapping reverse(MappingSet var1) {
      TopLevelClassMapping var2 = var1.createTopLevelClassMapping(this.getDeobfuscatedName(), this.getObfuscatedName());
      this.getFieldMappings().forEach(var1x -> var1x.reverse(var2));
      this.getMethodMappings().forEach(var1x -> var1x.reverse(var2));
      this.getInnerClassMappings().forEach(var1x -> var1x.reverse(var2));
      return var2;
   }

   default TopLevelClassMapping merge(TopLevelClassMapping var1, MappingSet var2) {
      return MappingSetMerger.create(this.getMappings(), var1.getMappings()).mergeTopLevelClass(this, var1, var2);
   }

   default TopLevelClassMapping copy(MappingSet var1) {
      TopLevelClassMapping var2 = var1.createTopLevelClassMapping(this.getObfuscatedName(), this.getDeobfuscatedName());
      this.getFieldMappings().forEach(var1x -> var1x.copy(var2));
      this.getMethodMappings().forEach(var1x -> var1x.copy(var2));
      this.getInnerClassMappings().forEach(var1x -> var1x.copy(var2));
      return var2;
   }
}
