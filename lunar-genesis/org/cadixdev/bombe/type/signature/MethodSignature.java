package org.cadixdev.bombe.type.signature;

import java.lang.reflect.Method;
import java.util.Objects;
import java.util.StringJoiner;
import org.cadixdev.bombe.type.MethodDescriptor;

public class MethodSignature extends MemberSignature {
   private final MethodDescriptor descriptor;

   public static MethodSignature of(String var0, String var1) {
      return new MethodSignature(var0, MethodDescriptor.of(var1));
   }

   public static MethodSignature of(String var0) {
      return new MethodSignatureReader(var0).readSignature();
   }

   public static MethodSignature of(Method var0) {
      return new MethodSignature(var0.getName(), MethodDescriptor.of(var0));
   }

   public MethodSignature(String var1, MethodDescriptor var2) {
      super(var1);
      this.descriptor = var2;
   }

   public MethodDescriptor getDescriptor() {
      return this.descriptor;
   }

   @Override
   public String toJvmsIdentifier() {
      return this.name + this.descriptor.toString();
   }

   @Override
   protected StringJoiner buildToString() {
      return super.buildToString().add("descriptor=" + this.descriptor);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof MethodSignature)) {
         return false;
      }

      MethodSignature var2 = (MethodSignature)var1;
      return Objects.equals(this.name, var2.name) && Objects.equals(this.descriptor, var2.descriptor);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name, this.descriptor);
   }
}
