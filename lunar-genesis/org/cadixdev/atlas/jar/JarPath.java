package org.cadixdev.atlas.jar;

import java.util.Objects;

public class JarPath {
   private final String name;

   public JarPath(String var1) {
      this.name = var1;
   }

   public String getName() {
      return this.name;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (!(var1 instanceof JarPath)) {
         return false;
      }

      JarPath var2 = (JarPath)var1;
      return Objects.equals(this.name, var2.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.name);
   }
}
