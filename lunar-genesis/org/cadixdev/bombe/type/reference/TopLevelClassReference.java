package org.cadixdev.bombe.type.reference;

import org.cadixdev.bombe.type.ObjectType;

public class TopLevelClassReference extends ClassReference {
   public TopLevelClassReference(ObjectType var1) {
      super(QualifiedReference.Type.TOP_LEVEL_CLASS, var1);
      if (var1.getClassName().indexOf(36) >= 0) {
         throw new IllegalArgumentException("Cannot create top-level class reference from inner class identifier");
      }
   }

   public TopLevelClassReference(String var1) {
      this(new ObjectType(var1));
   }
}
