package org.cadixdev.bombe.type;

import org.cadixdev.bombe.analysis.InheritanceProvider;

public interface Type {
   static Type of(String var0) {
      return new TypeReader(var0).readType();
   }

   static Type of(Class<?> var0) {
      return var0 == void.class ? VoidType.INSTANCE : FieldType.of(var0);
   }

   default boolean isAssignableFrom(Type var1, InheritanceProvider var2) {
      return this.equals(var1);
   }
}
