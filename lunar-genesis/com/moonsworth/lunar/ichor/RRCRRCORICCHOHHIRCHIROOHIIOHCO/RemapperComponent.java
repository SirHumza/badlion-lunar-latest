package com.moonsworth.lunar.ichor.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import lombok.Generated;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.ObjectType;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.Mapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.objectweb.asm.Handle;
import org.objectweb.asm.commons.Remapper;

public class OOROOCCIRCCRHOIOIORIHCHHOOCCOR extends Remapper {
   protected final MappingSet CHHHCHHCOOCRIHHHHHCHOOIORROROO;
   protected final InheritanceProvider ROCHOICOOIIROHCIIICOIHRCCCHHRO;

   public OOROOCCIRCCRHOIOIORIHCHHOOCCOR(MappingSet var1, InheritanceProvider var2) {
      super(589824);
      this.CHHHCHHCOOCRIHHHHHCHOOIORROROO = var1;
      this.ROCHOICOOIIROHCIIICOIHRCCCHHRO = var2;
   }

   @Override
   public String map(String var1) {
      return this.CHHHCHHCOOCRIHHHHHCHOOIORROROO.computeClassMapping(var1).map(Mapping::getFullDeobfuscatedName).orElse(var1);
   }

   @Override
   public String mapInnerClassName(String var1, String var2, String var3) {
      return this.CHHHCHHCOOCRIHHHHHCHOOIORROROO.computeClassMapping(var1).map(Mapping::getDeobfuscatedName).orElse(var3);
   }

   protected ClassMapping<?, ?> getCompletedClassMapping(String var1) {
      ClassMapping var2 = this.CHHHCHHCOOCRIHHHHHCHOOIORROROO.getOrCreateClassMapping(var1);
      var2.complete(this.ROCHOICOOIIROHCIIICOIHRCCCHHRO);
      return var2;
   }

   @Override
   public String mapFieldName(String var1, String var2, String var3) {
      return this.getCompletedClassMapping(var1).computeFieldMapping(FieldSignature.of(var2, var3)).map(Mapping::getDeobfuscatedName).orElse(var2);
   }

   @Override
   public String mapMethodName(String var1, String var2, String var3) {
      try {
         return var1.toCharArray()[0] == '['
            ? var2
            : this.getCompletedClassMapping(var1).getMethodMapping(MethodSignature.of(var2, var3)).map(Mapping::getDeobfuscatedName).orElse(var2);
      } catch (Exception var5) {
         throw new IllegalStateException("Failed to map method " + var1 + "." + var2 + var3, var5);
      }
   }

   @Override
   public String mapInvokeDynamicMethodName(String var1, String var2, Handle var3, Object... var4) {
      if ("invoke".equals(var1) && !var2.contains("(")) {
         return var1;
      }

      try {
         MethodDescriptor var5 = MethodDescriptor.of(var2);
         if (var5.getReturnType() instanceof ObjectType var6) {
            ClassMapping var11 = this.getCompletedClassMapping(var6.getClassName());

            for (MethodMapping var9 : var11.getMethodMappings()) {
               if (var9.getObfuscatedName().equals(var1)) {
                  return var9.getDeobfuscatedName();
               }
            }
         }
      } catch (Exception var10) {
         var10.printStackTrace();
      }

      return var1;
   }

   @Override
   public String mapRecordComponentName(String var1, String var2, String var3) {
      return this.mapFieldName(var1, var2, var3);
   }

   @Generated
   public MappingSet getMappings() {
      return this.CHHHCHHCOOCRIHHHHHCHOOIORROROO;
   }

   @Generated
   public InheritanceProvider HOIIOIHICHOCHRCICHOIOOCCCOOCRH() {
      return this.ROCHOICOOIIROHCIIICOIHRCCCHHRO;
   }
}
