package org.cadixdev.lorenz.asm;

import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.Mapping;
import org.objectweb.asm.commons.Remapper;

public class LorenzRemapper extends Remapper {
   private final MappingSet mappings;
   private final InheritanceProvider inheritanceProvider;

   public LorenzRemapper(MappingSet var1, InheritanceProvider var2) {
      this.mappings = var1;
      this.inheritanceProvider = var2;
   }

   @Override
   public String map(String var1) {
      return this.mappings.computeClassMapping(var1).map(Mapping::getFullDeobfuscatedName).orElse(var1);
   }

   @Override
   public String mapInnerClassName(String var1, String var2, String var3) {
      return this.mappings.computeClassMapping(var1).map(Mapping::getDeobfuscatedName).orElse(var3);
   }

   private ClassMapping<?, ?> getCompletedClassMapping(String var1) {
      ClassMapping var2 = this.mappings.getOrCreateClassMapping(var1);
      var2.complete(this.inheritanceProvider);
      return var2;
   }

   @Override
   public String mapFieldName(String var1, String var2, String var3) {
      return this.getCompletedClassMapping(var1).computeFieldMapping(FieldSignature.of(var2, var3)).map(Mapping::getDeobfuscatedName).orElse(var2);
   }

   @Override
   public String mapMethodName(String var1, String var2, String var3) {
      return this.getCompletedClassMapping(var1).getMethodMapping(MethodSignature.of(var2, var3)).map(Mapping::getDeobfuscatedName).orElse(var2);
   }
}
