package com.moonsworth.lunar.lib.adventure.pointer;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.key.Key;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class PointerImpl<T> implements Pointer<T> {
   private final Class<T> type;
   private final Key key;

   PointerImpl(Class<T> var1, Key var2) {
      this.type = var1;
      this.key = var2;
   }

   @NotNull
   @Override
   public Class<T> type() {
      return this.type;
   }

   @NotNull
   @Override
   public Key key() {
      return this.key;
   }

   @Override
   public String toString() {
      return Internals.toString(this);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         PointerImpl var2 = (PointerImpl)var1;
         return this.type.equals(var2.type) && this.key.equals(var2.key);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.type.hashCode();
      return 31 * var1 + this.key.hashCode();
   }
}
