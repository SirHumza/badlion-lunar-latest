package org.cadixdev.bombe.analysis;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;

final class LazyInheritanceClassInfo extends InheritanceProvider.ClassInfo.Abstract {
   private final InheritanceProvider.ClassInfo provider;
   private final String name;
   private String superName;
   private List<String> interfaces;
   private Map<FieldSignature, InheritanceType> fields;
   private Map<String, InheritanceType> fieldsByName;
   private Map<MethodSignature, InheritanceType> methods;
   private Set<InheritanceProvider.ClassInfo> parents;

   LazyInheritanceClassInfo(InheritanceProvider.ClassInfo var1) {
      this.provider = var1;
      this.name = var1.getName();
   }

   @Override
   public String getName() {
      return this.name;
   }

   @Override
   public boolean isInterface() {
      return this.provider.isInterface();
   }

   @Override
   public String getSuperName() {
      if (this.superName == null) {
         this.superName = this.provider.getSuperName();
      }

      return this.superName;
   }

   @Override
   public List<String> getInterfaces() {
      if (this.interfaces == null) {
         this.interfaces = this.provider.getInterfaces();
      }

      return this.interfaces;
   }

   @Override
   public Map<FieldSignature, InheritanceType> getFields() {
      if (this.fields == null) {
         this.fields = this.provider.getFields();
      }

      return this.fields;
   }

   @Override
   public Map<String, InheritanceType> getFieldsByName() {
      if (this.fieldsByName == null) {
         this.fieldsByName = this.provider.getFieldsByName();
      }

      return this.fieldsByName;
   }

   @Override
   public Map<MethodSignature, InheritanceType> getMethods() {
      if (this.methods == null) {
         this.methods = this.provider.getMethods();
      }

      return this.methods;
   }

   @Override
   public Set<InheritanceProvider.ClassInfo> provideParents(InheritanceProvider var1) {
      if (this.parents == null) {
         this.parents = this.provider.provideParents(var1);
      }

      return this.parents;
   }

   @Override
   public void provideParents(InheritanceProvider var1, Collection<InheritanceProvider.ClassInfo> var2) {
      var2.addAll(this.provideParents(var1));
   }

   @Override
   public InheritanceProvider.ClassInfo lazy() {
      return this;
   }
}
