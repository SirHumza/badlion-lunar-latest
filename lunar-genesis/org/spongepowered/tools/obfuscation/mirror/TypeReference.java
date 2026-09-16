package org.spongepowered.tools.obfuscation.mirror;

import java.io.Serializable;
import org.spongepowered.tools.obfuscation.interfaces.ITypeHandleProvider;

public class TypeReference implements Serializable, Comparable<TypeReference> {
   private final String name;
   private transient TypeHandle handle;

   public TypeReference(TypeHandle var1) {
      this.name = var1.getName();
      this.handle = var1;
   }

   public TypeReference(String var1) {
      this.name = var1;
   }

   public String getName() {
      return this.name;
   }

   public String getClassName() {
      return this.name.replace('/', '.');
   }

   public TypeHandle getHandle(ITypeHandleProvider var1) {
      if (this.handle == null) {
         try {
            this.handle = var1.getTypeHandle(this.name);
         } catch (Exception var3) {
            var3.printStackTrace();
         }
      }

      return this.handle;
   }

   @Override
   public String toString() {
      return String.format("TypeReference[%s]", this.name);
   }

   public int compareTo(TypeReference var1) {
      return var1 == null ? -1 : this.name.compareTo(var1.name);
   }

   @Override
   public boolean equals(Object var1) {
      return var1 instanceof TypeReference && this.compareTo((TypeReference)var1) == 0;
   }

   @Override
   public int hashCode() {
      return this.name.hashCode();
   }
}
