package org.cadixdev.lorenz.io.srg.tsrg;

import java.io.Writer;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.TextMappingsWriter;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.Mapping;
import org.cadixdev.lorenz.model.MethodMapping;

public class TSrgWriter extends TextMappingsWriter {
   public TSrgWriter(Writer var1) {
      super(var1);
   }

   @Override
   public void write(MappingSet var1) {
      var1.getTopLevelClassMappings()
         .stream()
         .filter(ClassMapping::hasMappings)
         .sorted(this.getConfig().getClassMappingComparator())
         .forEach(this::writeClassMapping);
   }

   protected void writeClassMapping(ClassMapping<?, ?> var1) {
      if (var1.hasDeobfuscatedName()
         || var1.getFieldsByName().values().stream().anyMatch(Mapping::hasDeobfuscatedName)
         || var1.getMethodMappings().stream().anyMatch(MethodMapping::hasMappings)) {
         this.writer.println(String.format("%s %s", var1.getFullObfuscatedName(), var1.getFullDeobfuscatedName()));
      }

      var1.getFieldsByName()
         .values()
         .stream()
         .filter(Mapping::hasDeobfuscatedName)
         .sorted(this.getConfig().getFieldMappingComparator())
         .forEach(this::writeFieldMapping);
      var1.getMethodMappings()
         .stream()
         .filter(Mapping::hasDeobfuscatedName)
         .sorted(this.getConfig().getMethodMappingComparator())
         .forEach(this::writeMethodMapping);
      var1.getInnerClassMappings()
         .stream()
         .filter(ClassMapping::hasMappings)
         .sorted(this.getConfig().getClassMappingComparator())
         .forEach(this::writeClassMapping);
   }

   protected void writeFieldMapping(FieldMapping var1) {
      this.writer.println(String.format("\t%s %s", var1.getObfuscatedName(), var1.getDeobfuscatedName()));
   }

   protected void writeMethodMapping(MethodMapping var1) {
      this.writer.println(String.format("\t%s %s %s", var1.getObfuscatedName(), var1.getObfuscatedDescriptor(), var1.getDeobfuscatedName()));
   }
}
