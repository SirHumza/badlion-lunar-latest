package org.cadixdev.bombe.type.reference;

import org.cadixdev.bombe.type.ObjectType;

public class InnerClassReference extends ClassReference {
   private final ClassReference parentClass;

   private static ClassReference deriveParentClass(ObjectType var0) {
      if (var0.getClassName().indexOf(36) < 0) {
         throw new IllegalArgumentException("Cannot derive parent class from non-inner class identifier");
      }

      ObjectType var1 = new ObjectType(var0.getClassName().substring(0, var0.getClassName().lastIndexOf(36)));
      return var1.getClassName().indexOf(36) >= 0 ? new InnerClassReference(var1) : new TopLevelClassReference(var1);
   }

   InnerClassReference(ClassReference var1, ObjectType var2) {
      super(QualifiedReference.Type.INNER_CLASS, var2);
      assert var2.getClassName().substring(0, var2.getClassName().lastIndexOf(36)).equals(var1.classType.getClassName());
      this.parentClass = var1;
   }

   public InnerClassReference(ObjectType var1) {
      this(deriveParentClass(var1), var1);
   }

   public ClassReference getParentClass() {
      return this.parentClass;
   }
}
