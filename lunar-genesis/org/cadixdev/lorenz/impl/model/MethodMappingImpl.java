package org.cadixdev.lorenz.impl.model;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.concurrent.ConcurrentHashMap;
import org.cadixdev.bombe.type.signature.MethodSignature;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.MethodMapping;
import org.cadixdev.lorenz.model.MethodParameterMapping;

public class MethodMappingImpl extends AbstractMemberMappingImpl<MethodMapping, ClassMapping> implements MethodMapping {
   private final MethodSignature signature;
   private final Map<Integer, MethodParameterMapping> parameters = new ConcurrentHashMap<>();

   public MethodMappingImpl(ClassMapping var1, MethodSignature var2, String var3) {
      super(var1, var2.getName(), var3);
      this.signature = var2;
   }

   @Override
   public MethodSignature getSignature() {
      return this.signature;
   }

   @Override
   public Collection<MethodParameterMapping> getParameterMappings() {
      return Collections.unmodifiableCollection(this.parameters.values());
   }

   @Override
   public MethodParameterMapping createParameterMapping(int var1, String var2) {
      return this.parameters
         .compute(
            var1,
            (var2x, var3) -> var3 != null
               ? var3.setDeobfuscatedName(var2)
               : this.getMappings().getModelFactory().createMethodParameterMapping(this, var2x, var2)
         );
   }

   @Override
   public Optional<MethodParameterMapping> getParameterMapping(int var1) {
      return Optional.ofNullable(this.parameters.get(var1));
   }

   @Override
   public boolean hasParameterMapping(int var1) {
      return this.parameters.containsKey(var1);
   }

   @Override
   protected StringJoiner buildToString() {
      return super.buildToString()
         .add("obfuscatedSignature=" + this.getObfuscatedDescriptor())
         .add("deobfuscatedSignature=" + this.getDeobfuscatedDescriptor());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (super.equals(var1) && var1 instanceof MethodMapping) {
         MethodMapping var2 = (MethodMapping)var1;
         return Objects.equals(this.signature, var2.getSignature());
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.signature);
   }
}
