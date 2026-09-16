package org.cadixdev.bombe.type;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public final class MethodDescriptor {
   private final List<FieldType> paramTypes;
   private final Type returnType;

   public static MethodDescriptor of(String var0) {
      return new MethodDescriptorReader(var0).readDescriptor();
   }

   public static MethodDescriptor of(Method var0) {
      return new MethodDescriptor(Arrays.stream(var0.getParameterTypes()).map(FieldType::of).collect(Collectors.toList()), Type.of(var0.getReturnType()));
   }

   public MethodDescriptor(List<FieldType> var1, Type var2) {
      this.paramTypes = var1;
      this.returnType = var2;
   }

   public List<FieldType> getParamTypes() {
      return Collections.unmodifiableList(this.paramTypes);
   }

   public Type getReturnType() {
      return this.returnType;
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("(");
      this.paramTypes.forEach(var1x -> var1.append(var1x.toString()));
      var1.append(")");
      var1.append(this.returnType.toString());
      return var1.toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof MethodDescriptor)) {
         return false;
      }

      MethodDescriptor var2 = (MethodDescriptor)var1;
      return Objects.equals(this.paramTypes, var2.paramTypes) && Objects.equals(this.returnType, var2.returnType);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.paramTypes, this.returnType);
   }
}
