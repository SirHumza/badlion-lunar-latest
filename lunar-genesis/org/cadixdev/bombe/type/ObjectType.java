package org.cadixdev.bombe.type;

import java.util.Objects;
import java.util.Optional;
import org.cadixdev.bombe.analysis.InheritanceProvider;

public class ObjectType implements FieldType {
   private final String className;
   private final String descriptor;

   public ObjectType(String var1) {
      this.className = var1.replace('.', '/');
      this.descriptor = "L" + this.className + ";";
   }

   public String getClassName() {
      return this.className;
   }

   @Override
   public boolean isAssignableFrom(Type var1, InheritanceProvider var2) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof ObjectType)) {
         return false;
      } else {
         ObjectType var3 = (ObjectType)var1;
         if (!this.equals(var3) && !this.className.equals("java/lang/Object")) {
            Optional var4 = var2.provide(var3.getClassName());
            return var4.isPresent() && ((InheritanceProvider.ClassInfo)var4.get()).hasParent(this.className, var2);
         } else {
            return true;
         }
      }
   }

   @Override
   public String toString() {
      return this.descriptor;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof ObjectType)) {
         return false;
      }

      ObjectType var2 = (ObjectType)var1;
      return Objects.equals(this.className, var2.className);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.className);
   }
}
