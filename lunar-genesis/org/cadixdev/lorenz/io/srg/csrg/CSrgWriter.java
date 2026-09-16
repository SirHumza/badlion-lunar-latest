package org.cadixdev.lorenz.io.srg.csrg;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.TextMappingsWriter;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.Mapping;
import org.cadixdev.lorenz.model.MethodMapping;

public class CSrgWriter extends TextMappingsWriter {
   private final List<String> classes = new ArrayList<>();
   private final List<String> fields = new ArrayList<>();
   private final List<String> methods = new ArrayList<>();

   public CSrgWriter(Writer var1) {
      super(var1);
   }

   @Override
   public void write(MappingSet var1) {
      var1.getTopLevelClassMappings()
         .stream()
         .filter(ClassMapping::hasMappings)
         .sorted(this.getConfig().getClassMappingComparator())
         .forEach(this::writeClassMapping);
      this.classes.forEach(this.writer::println);
      this.fields.forEach(this.writer::println);
      this.methods.forEach(this.writer::println);
      this.classes.clear();
      this.fields.clear();
      this.methods.clear();
   }

   protected void writeClassMapping(ClassMapping<?, ?> var1) {
      if (var1.hasDeobfuscatedName()) {
         this.classes.add(String.format("%s %s", var1.getFullObfuscatedName(), var1.getFullDeobfuscatedName()));
      }

      var1.getInnerClassMappings()
         .stream()
         .filter(ClassMapping::hasMappings)
         .sorted(this.getConfig().getClassMappingComparator())
         .forEach(this::writeClassMapping);
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
   }

   protected void writeFieldMapping(FieldMapping var1) {
      this.fields.add(String.format("%s %s %s", var1.getParent().getFullObfuscatedName(), var1.getObfuscatedName(), var1.getDeobfuscatedName()));
   }

   protected void writeMethodMapping(MethodMapping var1) {
      this.methods
         .add(
            String.format(
               "%s %s %s %s", var1.getParent().getFullObfuscatedName(), var1.getObfuscatedName(), var1.getObfuscatedDescriptor(), var1.getDeobfuscatedName()
            )
         );
   }
}
