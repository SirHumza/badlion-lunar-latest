package com.moonsworth.lunar.lib.adventure.permission;

import com.moonsworth.lunar.lib.adventure.util.TriState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class PermissionCheckers {
   static final PermissionChecker NOT_SET = new PermissionCheckers.Always(TriState.NOT_SET);
   static final PermissionChecker FALSE = new PermissionCheckers.Always(TriState.FALSE);
   static final PermissionChecker TRUE = new PermissionCheckers.Always(TriState.TRUE);

   private PermissionCheckers() {
   }

   private static final class Always implements PermissionChecker {
      private final TriState value;

      private Always(TriState var1) {
         this.value = var1;
      }

      @NotNull
      @Override
      public TriState value(@NotNull String var1) {
         return this.value;
      }

      @Override
      public String toString() {
         return PermissionChecker.class.getSimpleName() + ".always(" + this.value + ")";
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            PermissionCheckers.Always var2 = (PermissionCheckers.Always)var1;
            return this.value == var2.value;
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return this.value.hashCode();
      }
   }
}
