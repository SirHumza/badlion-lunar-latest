package org.cadixdev.bombe.analysis;

public enum InheritanceType {
   NONE,
   PACKAGE_PRIVATE,
   PROTECTED,
   PUBLIC;

   public boolean canInherit(InheritanceProvider.ClassInfo var1, InheritanceProvider.ClassInfo var2) {
      return this != NONE && (this != PACKAGE_PRIVATE || var1.getPackage().equals(var2.getPackage()));
   }

   public static InheritanceType fromModifiers(int var0) {
      if ((var0 & 1) != 0) {
         return PUBLIC;
      } else if ((var0 & 4) != 0) {
         return PROTECTED;
      } else {
         return (var0 & 2) == 0 ? PACKAGE_PRIVATE : NONE;
      }
   }
}
