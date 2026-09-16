package com.lunarclient.adventure.viewer;

import com.moonsworth.lunar.lib.adventure.internal.Internals;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Objects;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public class ComponentCarry {
   private final int id;
   private final Component delegate;

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 instanceof ComponentCarry var2) {
         return !super.equals(var1) ? false : this.id == var2.id && Objects.equals(this.delegate, var2.delegate);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.id;
   }

   @Override
   public String toString() {
      return this.id + ") " + Internals.toString(this.delegate);
   }

   @Generated
   public int getId() {
      return this.id;
   }

   @Generated
   public Component getDelegate() {
      return this.delegate;
   }

   @Generated
   public ComponentCarry(int var1, Component var2) {
      this.id = var1;
      this.delegate = var2;
   }
}
