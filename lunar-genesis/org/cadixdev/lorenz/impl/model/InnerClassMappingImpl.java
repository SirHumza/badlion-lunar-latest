package org.cadixdev.lorenz.impl.model;

import java.util.Objects;
import org.cadixdev.lorenz.model.ClassMapping;
import org.cadixdev.lorenz.model.InnerClassMapping;

public class InnerClassMappingImpl extends AbstractClassMappingImpl<InnerClassMapping, ClassMapping> implements InnerClassMapping {
   private final ClassMapping parentClass;

   public InnerClassMappingImpl(ClassMapping var1, String var2, String var3) {
      super(var1.getMappings(), var2, var3);
      this.parentClass = var1;
   }

   public ClassMapping getParent() {
      return this.parentClass;
   }

   @Override
   public String getSimpleObfuscatedName() {
      return stripAsciiDigits(this.getObfuscatedName());
   }

   @Override
   public String getSimpleDeobfuscatedName() {
      return stripAsciiDigits(this.getDeobfuscatedName());
   }

   @Override
   public boolean hasDeobfuscatedName() {
      return this.getParent().hasDeobfuscatedName() || super.hasDeobfuscatedName();
   }

   private static String stripAsciiDigits(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         if (!isAsciiDigit(var0.charAt(var1))) {
            return var0.substring(var1);
         }
      }

      return "";
   }

   private static boolean isAsciiDigit(char var0) {
      return '0' <= var0 && var0 <= '9';
   }

   @Override
   public InnerClassMapping setDeobfuscatedName(String var1) {
      int var2 = var1.lastIndexOf(36);
      if (var2 == -1) {
         return (InnerClassMapping)super.setDeobfuscatedName(var1);
      }

      String var3 = var1.substring(var2 + 1);
      return (InnerClassMapping)super.setDeobfuscatedName(var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!super.equals(var1)) {
         return false;
      }

      if (!(var1 instanceof InnerClassMapping)) {
         return false;
      }

      InnerClassMapping var2 = (InnerClassMapping)var1;
      return Objects.equals(this.parentClass, var2.getParent());
   }

   @Override
   public int hashCode() {
      return Objects.hash(super.hashCode(), this.parentClass.getFullObfuscatedName(), this.parentClass.getFullDeobfuscatedName());
   }
}
