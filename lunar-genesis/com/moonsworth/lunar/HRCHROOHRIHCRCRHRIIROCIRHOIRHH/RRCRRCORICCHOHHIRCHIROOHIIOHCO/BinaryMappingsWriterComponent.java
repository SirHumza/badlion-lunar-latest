package com.moonsworth.lunar.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.io.BinaryMappingsWriter;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;
import org.cadixdev.lorenz.model.Mapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.cadixdev.lorenz.model.TopLevelClassMapping;

public class HRCHROOHRIHCRCRHRIIROCIRHOIRHH extends BinaryMappingsWriter {
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH(OutputStream var1) {
      super(var1);
   }

   @Override
   public void write(MappingSet var1) {
      this.stream.writeInt(99151942);
      this.stream.writeByte(1);
      this.stream.writeInt(0);
      List var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getTopLevelClassMappings(), this.getConfig().getClassMappingComparator(), ClassMapping::hasMappings);
      this.stream.writeInt(var2.size());

      for (TopLevelClassMapping var4 : var2) {
         this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4);
      }

      this.stream.flush();
   }

   private void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(ClassMapping<?, ?> var1) {
      this.stream.writeUTF(var1.getObfuscatedName());
      this.stream.writeUTF(var1.getDeobfuscatedName());
      List var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getInnerClassMappings(), this.getConfig().getClassMappingComparator(), ClassMapping::hasMappings);
      this.stream.writeInt(var2.size());

      for (InnerClassMapping var4 : var2) {
         this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var4);
      }

      List var7 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var1.getFieldMappings(), this.getConfig().getFieldMappingComparator(), var0 -> var0.hasDeobfuscatedName() && var0.getType().isPresent()
      );
      this.stream.writeInt(var7.size());

      for (FieldMapping var5 : var7) {
         FieldType var6 = var5.getType().orElseThrow();
         this.stream.writeUTF(var5.getObfuscatedName());
         this.stream.writeUTF(var6.toString());
         this.stream.writeUTF(var5.getDeobfuscatedName());
      }

      List var9 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1.getMethodMappings(), this.getConfig().getMethodMappingComparator(), Mapping::hasDeobfuscatedName);
      this.stream.writeInt(var9.size());

      for (MethodMapping var11 : var9) {
         this.stream.writeUTF(var11.getObfuscatedName());
         this.stream.writeUTF(var11.getObfuscatedDescriptor());
         this.stream.writeUTF(var11.getDeobfuscatedName());
      }
   }

   private static <T> List<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Collection<? extends T> var0, Comparator<? super T> var1, Predicate<? super T> var2) {
      ArrayList var3 = new ArrayList(var0.size());

      for (Object var5 : var0) {
         if (var2.test(var5)) {
            var3.add(var5);
         }
      }

      var3.sort(var1);
      return var3;
   }
}
