package org.cadixdev.lorenz.impl.model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.StringJoiner;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import org.cadixdev.bombe.analysis.InheritanceProvider;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.MappingSet;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.FieldMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;
import org.cadixdev.lorenz.model.MethodMapping;

public abstract class AbstractClassMappingImpl<M extends ClassMapping, P> extends AbstractMappingImpl<M, P> implements ClassMapping<M, P> {
   private final Map<FieldSignature, FieldMapping> fields = new ConcurrentHashMap<>();
   private final Map<String, FieldMapping> fieldsByName = new ConcurrentHashMap<>();
   private final Map<MethodSignature, MethodMapping> methods = new ConcurrentHashMap<>();
   private final Map<String, InnerClassMapping> innerClasses = new ConcurrentHashMap<>();
   private boolean complete;

   protected AbstractClassMappingImpl(MappingSet var1, String var2, String var3) {
      super(var1, var2, var3);
   }

   @Override
   public Collection<FieldMapping> getFieldMappings() {
      return Collections.unmodifiableCollection(this.fields.values());
   }

   @Override
   public Map<String, FieldMapping> getFieldsByName() {
      return Collections.unmodifiableMap(this.fieldsByName);
   }

   @Override
   public Optional<FieldMapping> getFieldMapping(FieldSignature var1) {
      return Optional.ofNullable(this.fields.get(var1));
   }

   @Override
   public Optional<FieldMapping> getFieldMapping(String var1) {
      return Optional.ofNullable(this.fieldsByName.get(var1));
   }

   @Override
   public Optional<FieldMapping> computeFieldMapping(FieldSignature var1) {
      return !var1.getType().isPresent() ? this.getFieldMapping(var1.getName()) : Optional.ofNullable(this.fields.computeIfAbsent(var1, var1x -> {
         FieldMapping var2 = this.fields.get(new FieldSignature(var1x.getName()));
         return var2 != null ? this.getMappings().getModelFactory().createFieldMapping(var2.getParent(), var1x, var2.getDeobfuscatedName()) : null;
      }));
   }

   @Override
   public FieldMapping createFieldMapping(FieldSignature var1, String var2) {
      return this.fields.compute(var1, (var2x, var3) -> {
         if (var3 != null) {
            return var3.setDeobfuscatedName(var2);
         }

         FieldMapping var4 = this.getMappings().getModelFactory().createFieldMapping(this, var2x, var2);
         this.fieldsByName.put(var2x.getName(), var4);
         return var4;
      });
   }

   @Override
   public boolean hasFieldMapping(FieldSignature var1) {
      return this.getFieldMapping(var1).isPresent();
   }

   @Override
   public boolean hasFieldMapping(String var1) {
      return this.fieldsByName.containsKey(var1);
   }

   @Override
   public void removeFieldMapping(FieldSignature var1) {
      FieldMapping var2 = this.fields.remove(var1);
      if (var2 != null) {
         this.fieldsByName.values().remove(var2);
      }
   }

   @Override
   public void removeFieldMapping(FieldMapping var1) {
      this.fields.values().remove(var1);
      this.fieldsByName.values().remove(var1);
   }

   @Override
   public void removeFieldMapping(String var1) {
      this.fields.keySet().removeIf(var1x -> var1x.getName().equals(var1));
      this.fieldsByName.remove(var1);
   }

   @Override
   public Collection<MethodMapping> getMethodMappings() {
      return Collections.unmodifiableCollection(this.methods.values());
   }

   @Override
   public Optional<MethodMapping> getMethodMapping(MethodSignature var1) {
      return Optional.ofNullable(this.methods.get(var1));
   }

   @Override
   public MethodMapping createMethodMapping(MethodSignature var1, String var2) {
      return this.methods
         .compute(
            var1, (var3, var4) -> var4 != null ? var4.setDeobfuscatedName(var2) : this.getMappings().getModelFactory().createMethodMapping(this, var1, var2)
         );
   }

   @Override
   public boolean hasMethodMapping(MethodSignature var1) {
      return this.methods.containsKey(var1);
   }

   @Override
   public void removeMethodMapping(MethodSignature var1) {
      this.methods.remove(var1);
   }

   @Override
   public void removeMethodMapping(MethodMapping var1) {
      this.methods.values().remove(var1);
   }

   @Override
   public Collection<InnerClassMapping> getInnerClassMappings() {
      return Collections.unmodifiableCollection(this.innerClasses.values());
   }

   @Override
   public Optional<InnerClassMapping> getInnerClassMapping(String var1) {
      return Optional.ofNullable(this.innerClasses.get(var1));
   }

   @Override
   public InnerClassMapping createInnerClassMapping(String var1, String var2) {
      return this.innerClasses
         .compute(
            var1,
            (var3, var4) -> var4 != null ? var4.setDeobfuscatedName(var2) : this.getMappings().getModelFactory().createInnerClassMapping(this, var1, var2)
         );
   }

   @Override
   public boolean hasInnerClassMapping(String var1) {
      return this.innerClasses.containsKey(var1);
   }

   @Override
   public void removeInnerClassMapping(String var1) {
      this.innerClasses.remove(var1);
   }

   @Override
   public void removeInnerClassMapping(ClassMapping<?, ?> var1) {
      this.innerClasses.values().remove(var1);
   }

   @Override
   protected StringJoiner buildToString() {
      return super.buildToString()
         .add("fields=" + this.getFieldMappings())
         .add("methods=" + this.getMethodMappings())
         .add("innerClasses=" + this.getInnerClassMappings());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!super.equals(var1)) {
         return false;
      }

      if (!(var1 instanceof ClassMapping)) {
         return false;
      }

      ClassMapping var2 = (ClassMapping)var1;
      return Objects.equals(this.getFieldMappings(), var2.getFieldMappings())
         && Objects.equals(this.getMethodMappings(), var2.getMethodMappings())
         && Objects.equals(this.getInnerClassMappings(), var2.getInnerClassMappings());
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.fields, this.methods, this.innerClasses);
   }

   @Override
   public boolean isComplete() {
      return this.complete;
   }

   @Override
   public void complete(InheritanceProvider var1, InheritanceProvider.ClassInfo var2) {
      if (!this.complete) {
         HashMap var3 = new HashMap();

         for (Entry var5 : var2.getMethods().entrySet()) {
            Set var6 = var3.computeIfAbsent(((MethodSignature)var5.getKey()).getName(), var0 -> new HashSet());
            var6.add((MethodSignature)var5.getKey());
         }

         for (InheritanceProvider.ClassInfo var15 : var2.provideParents(var1)) {
            ClassMapping var16 = this.getMappings().getOrCreateClassMapping(var15.getName());
            var16.complete(var1, var15);

            for (FieldMapping var8 : var16.getFieldMappings()) {
               if (!this.computeFieldMapping(var8.getSignature()).isPresent() && var15.canInherit(var2, var8.getSignature())) {
                  this.fields.putIfAbsent(var8.getSignature(), var8);
               }
            }

            for (MethodMapping var18 : var16.getMethodMappings()) {
               if (var15.canInherit(var2, var18.getSignature())) {
                  this.methods.putIfAbsent(var18.getSignature(), var18);
               }

               if (var3.containsKey(var18.getObfuscatedName())) {
                  for (MethodSignature var10 : (Set)var3.get(var18.getObfuscatedName())) {
                     MethodDescriptor var11 = var10.getDescriptor();
                     MethodSignature var12 = var18.getSignature();
                     MethodDescriptor var13 = var12.getDescriptor();
                     if (Objects.equals(var11.getParamTypes(), var13.getParamTypes()) && var13.getReturnType().isAssignableFrom(var11.getReturnType(), var1)) {
                        this.methods.putIfAbsent(var10, var18);
                     }
                  }
               }
            }
         }

         this.complete = true;
      }
   }
}
