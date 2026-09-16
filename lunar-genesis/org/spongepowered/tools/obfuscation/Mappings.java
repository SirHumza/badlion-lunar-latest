package org.spongepowered.tools.obfuscation;

import java.util.HashMap;
import java.util.Map;
import org.spongepowered.asm.obfuscation.mapping.IMapping;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.tools.obfuscation.mapping.IMappingConsumer;

class Mappings implements IMappingConsumer {
   private final Map<ObfuscationType, IMappingConsumer.MappingSet<MappingField>> fieldMappings = new HashMap<>();
   private final Map<ObfuscationType, IMappingConsumer.MappingSet<MappingMethod>> methodMappings = new HashMap<>();
   private Mappings.UniqueMappings unique;

   public Mappings() {
      this.init();
   }

   private void init() {
      for (ObfuscationType var2 : ObfuscationType.types()) {
         this.fieldMappings.put(var2, new IMappingConsumer.MappingSet<>());
         this.methodMappings.put(var2, new IMappingConsumer.MappingSet<>());
      }
   }

   public IMappingConsumer asUnique() {
      if (this.unique == null) {
         this.unique = new Mappings.UniqueMappings(this);
      }

      return this.unique;
   }

   @Override
   public IMappingConsumer.MappingSet<MappingField> getFieldMappings(ObfuscationType var1) {
      IMappingConsumer.MappingSet var2 = this.fieldMappings.get(var1);
      return var2 != null ? var2 : new IMappingConsumer.MappingSet<>();
   }

   @Override
   public IMappingConsumer.MappingSet<MappingMethod> getMethodMappings(ObfuscationType var1) {
      IMappingConsumer.MappingSet var2 = this.methodMappings.get(var1);
      return var2 != null ? var2 : new IMappingConsumer.MappingSet<>();
   }

   @Override
   public void clear() {
      this.fieldMappings.clear();
      this.methodMappings.clear();
      if (this.unique != null) {
         this.unique.clearMaps();
      }

      this.init();
   }

   @Override
   public void addFieldMapping(ObfuscationType var1, MappingField var2, MappingField var3) {
      IMappingConsumer.MappingSet var4 = this.fieldMappings.get(var1);
      if (var4 == null) {
         var4 = new IMappingConsumer.MappingSet();
         this.fieldMappings.put(var1, var4);
      }

      var4.add(new IMappingConsumer.MappingSet.Pair<>(var2, var3));
   }

   @Override
   public void addMethodMapping(ObfuscationType var1, MappingMethod var2, MappingMethod var3) {
      IMappingConsumer.MappingSet var4 = this.methodMappings.get(var1);
      if (var4 == null) {
         var4 = new IMappingConsumer.MappingSet();
         this.methodMappings.put(var1, var4);
      }

      var4.add(new IMappingConsumer.MappingSet.Pair<>(var2, var3));
   }

   public static class MappingConflictException extends RuntimeException {
      private final IMapping<?> oldMapping;
      private final IMapping<?> newMapping;

      public MappingConflictException(IMapping<?> var1, IMapping<?> var2) {
         this.oldMapping = var1;
         this.newMapping = var2;
      }

      public IMapping<?> getOld() {
         return this.oldMapping;
      }

      public IMapping<?> getNew() {
         return this.newMapping;
      }
   }

   static class UniqueMappings implements IMappingConsumer {
      private final IMappingConsumer mappings;
      private final Map<ObfuscationType, Map<MappingField, MappingField>> fields = new HashMap<>();
      private final Map<ObfuscationType, Map<MappingMethod, MappingMethod>> methods = new HashMap<>();

      public UniqueMappings(IMappingConsumer var1) {
         this.mappings = var1;
      }

      @Override
      public void clear() {
         this.clearMaps();
         this.mappings.clear();
      }

      protected void clearMaps() {
         this.fields.clear();
         this.methods.clear();
      }

      @Override
      public void addFieldMapping(ObfuscationType var1, MappingField var2, MappingField var3) {
         if (!this.checkForExistingMapping(var1, var2, var3, this.fields)) {
            this.mappings.addFieldMapping(var1, var2, var3);
         }
      }

      @Override
      public void addMethodMapping(ObfuscationType var1, MappingMethod var2, MappingMethod var3) {
         if (!this.checkForExistingMapping(var1, var2, var3, this.methods)) {
            this.mappings.addMethodMapping(var1, var2, var3);
         }
      }

      private <TMapping extends IMapping<TMapping>> boolean checkForExistingMapping(
         ObfuscationType var1, TMapping var2, TMapping var3, Map<ObfuscationType, Map<TMapping, TMapping>> var4
      ) {
         Map var5 = (Map)var4.get(var1);
         if (var5 == null) {
            var5 = new HashMap();
            var4.put(var1, var5);
         }

         IMapping var6 = (IMapping)var5.get(var2);
         if (var6 != null) {
            if (var6.equals(var3)) {
               return true;
            } else {
               throw new Mappings.MappingConflictException(var6, var3);
            }
         } else {
            var5.put(var2, var3);
            return false;
         }
      }

      @Override
      public IMappingConsumer.MappingSet<MappingField> getFieldMappings(ObfuscationType var1) {
         return this.mappings.getFieldMappings(var1);
      }

      @Override
      public IMappingConsumer.MappingSet<MappingMethod> getMethodMappings(ObfuscationType var1) {
         return this.mappings.getMethodMappings(var1);
      }
   }
}
