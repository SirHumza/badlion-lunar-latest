package org.cadixdev.lorenz.model;

import java.util.Objects;
import java.util.StringJoiner;

public class ExtensionKey<T> {
   private final Class<T> type;
   private final String id;

   public ExtensionKey(Class<T> var1, String var2) {
      this.type = var1;
      this.id = var2;
   }

   public T cast(Object var1) {
      return this.type.cast(var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (super.equals(var1) && var1 instanceof ExtensionKey) {
         ExtensionKey var2 = (ExtensionKey)var1;
         return Objects.equals(this.type, var2.type) && Objects.equals(this.id, var2.id);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return new StringJoiner(", ", this.getClass().getSimpleName() + "{", "}").add("type=" + this.type).add("id=" + this.id).toString();
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.type, this.id);
   }
}
