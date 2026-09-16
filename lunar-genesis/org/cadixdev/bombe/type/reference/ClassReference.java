package org.cadixdev.bombe.type.reference;

import java.util.Objects;
import java.util.StringJoiner;
import org.cadixdev.bombe.type.FieldType;
import org.cadixdev.bombe.type.MethodDescriptor;
import org.cadixdev.bombe.type.ObjectType;
import org.cadixdev.bombe.type.signature.FieldSignature;
import org.cadixdev.bombe.type.signature.MethodSignature;

public abstract class ClassReference extends QualifiedReference {
   protected static final char INNER_CLASS_SEPARATOR_CHAR = '$';
   protected final ObjectType classType;

   public ClassReference(QualifiedReference.Type var1, ObjectType var2) {
      super(var1);
      this.classType = var2;
   }

   public ObjectType getClassType() {
      return this.classType;
   }

   public InnerClassReference getInnerClass(String var1) {
      return new InnerClassReference(this, new ObjectType(this.getClassType().getClassName() + '$' + var1));
   }

   public FieldReference getField(FieldSignature var1) {
      return new FieldReference(this, var1);
   }

   public FieldReference getField(String var1, FieldType var2) {
      return this.getField(new FieldSignature(var1, var2));
   }

   public FieldReference getField(String var1, String var2) {
      return this.getField(var1, FieldType.of(var2));
   }

   public FieldReference getField(String var1) {
      return this.getField(new FieldSignature(var1));
   }

   public MethodReference getMethod(MethodSignature var1) {
      return new MethodReference(this, var1);
   }

   public MethodReference getMethod(String var1, MethodDescriptor var2) {
      return this.getMethod(new MethodSignature(var1, var2));
   }

   public MethodReference getMethod(String var1, String var2) {
      return this.getMethod(var1, MethodDescriptor.of(var2));
   }

   @Override
   public String toJvmsIdentifier() {
      return this.classType.getClassName();
   }

   @Override
   protected StringJoiner buildToString() {
      return super.buildToString().add(";classType=" + this.classType.getClassName());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof ClassReference)) {
         return false;
      }

      ClassReference var2 = (ClassReference)var1;
      return Objects.equals(this.classType, var2.classType);
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.classType);
   }
}
