package org.cadixdev.lorenz;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.cadixdev.bombe.type.ArrayType;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.ObjectType;
import org.cadixdev.bombe.type.Type;
import org.cadixdev.lorenz.impl.MappingSetImpl;
import org.cadixdev.lorenz.merge.MappingSetMerger;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.TopLevelClassMapping;
import org.cadixdev.lorenz.model.jar.CascadingFieldTypeProvider;
import org.cadixdev.lorenz.model.jar.FieldTypeProvider;
import org.cadixdev.lorenz.util.BinaryTool;
import org.cadixdev.lorenz.util.Reversible;

public interface MappingSet extends Reversible<MappingSet, MappingSet> {
   static MappingSet create() {
      return new MappingSetImpl();
   }

   static MappingSet create(MappingSetModelFactory var0) {
      return new MappingSetImpl(var0);
   }

   MappingSetModelFactory getModelFactory();

   Collection<TopLevelClassMapping> getTopLevelClassMappings();

   TopLevelClassMapping createTopLevelClassMapping(String var1, String var2);

   Optional<TopLevelClassMapping> getTopLevelClassMapping(String var1);

   default TopLevelClassMapping getOrCreateTopLevelClassMapping(String var1) {
      return this.getTopLevelClassMapping(var1).orElseGet(() -> this.createTopLevelClassMapping(var1, var1));
   }

   boolean hasTopLevelClassMapping(String var1);

   default Optional<? extends ClassMapping<?, ?>> getClassMapping(String var1) {
      int var2 = var1.lastIndexOf(36);
      if (var2 == -1) {
         return this.getTopLevelClassMapping(var1);
      }

      String var3 = var1.substring(0, var2);
      String var4 = var1.substring(var2 + 1);
      return this.getClassMapping(var3).flatMap(var1x -> var1x.getInnerClassMapping(var4));
   }

   default void removeClassMapping(String var1) {
      this.getClassMapping(var1).ifPresent(this::removeClassMapping);
   }

   void removeClassMapping(ClassMapping<?, ?> var1);

   default Optional<? extends ClassMapping<?, ?>> computeClassMapping(String var1) {
      int var2 = var1.lastIndexOf(36);
      if (var2 == -1) {
         return this.getTopLevelClassMapping(var1);
      }

      String var3 = var1.substring(0, var2);
      String var4 = var1.substring(var2 + 1);
      return this.getClassMapping(var3).map(var1x -> var1x.getOrCreateInnerClassMapping(var4));
   }

   default ClassMapping<?, ?> getOrCreateClassMapping(String var1) {
      int var2 = var1.lastIndexOf(36);
      if (var2 == -1) {
         return this.getOrCreateTopLevelClassMapping(var1);
      }

      String var3 = var1.substring(0, var2);
      String var4 = var1.substring(var2 + 1);
      ClassMapping var5 = this.getOrCreateClassMapping(var3);
      return var5.getOrCreateInnerClassMapping(var4);
   }

   CascadingFieldTypeProvider getFieldTypeProvider();

   default MappingSet addFieldTypeProvider(FieldTypeProvider var1) {
      this.getFieldTypeProvider().add(var1);
      return this;
   }

   default MappingSet removeFieldTypeProvider(FieldTypeProvider var1) {
      this.getFieldTypeProvider().remove(var1);
      return this;
   }

   default Type deobfuscate(Type var1) {
      return var1 instanceof FieldType ? this.deobfuscate((FieldType)var1) : var1;
   }

   default FieldType deobfuscate(FieldType var1) {
      if (var1 instanceof ArrayType) {
         ArrayType var8 = (ArrayType)var1;
         FieldType var9 = this.deobfuscate(var8.getComponent());
         return var9 == var8.getComponent() ? var8 : new ArrayType(var8.getDimCount(), var9);
      }

      if (var1 instanceof ObjectType) {
         ObjectType var2 = (ObjectType)var1;
         String[] var3 = BinaryTool.from(var2.getClassName());
         ClassMapping var4 = this.getClassMapping(var3[0]).orElse(null);
         if (var4 == null) {
            return var1;
         }

         for (int var5 = 1; var5 < var3.length; var5++) {
            ClassMapping var6 = var4.getInnerClassMapping(var3[var5]).orElse(null);
            if (var6 == null) {
               String[] var7 = new String[var3.length - var5 + 1];
               var7[0] = var4.getFullDeobfuscatedName();
               System.arraycopy(var3, var5, var7, 1, var3.length - var5);
               return new ObjectType(BinaryTool.to(var7));
            }

            var4 = var6;
         }

         return new ObjectType(var4.getFullDeobfuscatedName());
      } else {
         return var1;
      }
   }

   default MethodDescriptor deobfuscate(MethodDescriptor var1) {
      return new MethodDescriptor(var1.getParamTypes().stream().map(this::deobfuscate).collect(Collectors.toList()), this.deobfuscate(var1.getReturnType()));
   }

   default MappingSet reverse() {
      return this.reverse(create());
   }

   default MappingSet reverse(MappingSet var1) {
      this.getTopLevelClassMappings().forEach(var1x -> var1x.reverse(var1));
      return var1;
   }

   default MappingSet merge(MappingSet var1) {
      return this.merge(var1, create());
   }

   default MappingSet merge(MappingSet var1, MappingSet var2) {
      return MappingSetMerger.create(this, var1).merge(var2);
   }

   default MappingSet copy() {
      MappingSet var1 = create();
      this.getTopLevelClassMappings().forEach(var1x -> var1x.copy(var1));
      return var1;
   }
}
