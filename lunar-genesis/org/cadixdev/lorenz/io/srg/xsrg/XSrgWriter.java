package org.cadixdev.lorenz.io.srg.xsrg;

import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.TextMappingsWriter;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.Mapping;
import org.cadixdev.lorenz.model.MethodMapping;

public class XSrgWriter extends TextMappingsWriter {
   private final List<String> classes = new ArrayList<>();
   private final List<String> fields = new ArrayList<>();
   private final List<String> methods = new ArrayList<>();

   public XSrgWriter(Writer var1) {
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
         this.classes.add(String.format("CL: %s %s", var1.getFullObfuscatedName(), var1.getFullDeobfuscatedName()));
      }

      var1.getInnerClassMappings()
         .stream()
         .filter(ClassMapping::hasMappings)
         .sorted(this.getConfig().getClassMappingComparator())
         .forEach(this::writeClassMapping);
      var1.getFieldMappings()
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
      Optional var2 = var1.getType();
      var2.ifPresent(
         var2x -> this.fields
            .add(String.format("FD: %s %s %s %s", var1.getFullObfuscatedName(), var2x, var1.getFullDeobfuscatedName(), var1.getMappings().deobfuscate(var2x)))
      );
   }

   protected void writeMethodMapping(MethodMapping var1) {
      this.methods
         .add(
            String.format(
               "MD: %s %s %s %s",
               var1.getFullObfuscatedName(),
               var1.getObfuscatedDescriptor(),
               var1.getFullDeobfuscatedName(),
               var1.getDeobfuscatedDescriptor()
            )
         );
   }
}
