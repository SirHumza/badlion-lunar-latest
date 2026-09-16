package org.spongepowered.tools.obfuscation.mapping.common;

import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import org.spongepowered.asm.obfuscation.mapping.common.MappingField;
import org.spongepowered.asm.obfuscation.mapping.common.MappingMethod;
import org.spongepowered.include.com.google.common.collect.BiMap;
import org.spongepowered.include.com.google.common.collect.HashBiMap;
import org.spongepowered.tools.obfuscation.mapping.IMappingProvider;

public abstract class MappingProvider implements IMappingProvider {
   protected final Messager messager;
   protected final Filer filer;
   protected final BiMap<String, String> packageMap = HashBiMap.create();
   protected final BiMap<String, String> classMap = HashBiMap.create();
   protected final BiMap<MappingField, MappingField> fieldMap = HashBiMap.create();
   protected final BiMap<MappingMethod, MappingMethod> methodMap = HashBiMap.create();

   public MappingProvider(Messager var1, Filer var2) {
      this.messager = var1;
      this.filer = var2;
   }

   @Override
   public void clear() {
      this.packageMap.clear();
      this.classMap.clear();
      this.fieldMap.clear();
      this.methodMap.clear();
   }

   @Override
   public boolean isEmpty() {
      return this.packageMap.isEmpty() && this.classMap.isEmpty() && this.fieldMap.isEmpty() && this.methodMap.isEmpty();
   }

   @Override
   public MappingMethod getMethodMapping(MappingMethod var1) {
      return this.methodMap.get(var1);
   }

   @Override
   public MappingField getFieldMapping(MappingField var1) {
      return this.fieldMap.get(var1);
   }

   @Override
   public String getClassMapping(String var1) {
      return this.classMap.get(var1);
   }

   @Override
   public String getPackageMapping(String var1) {
      return this.packageMap.get(var1);
   }
}
