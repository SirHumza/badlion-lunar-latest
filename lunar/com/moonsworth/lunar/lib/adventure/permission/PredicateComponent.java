package com.moonsworth.lunar.lib.adventure.permission;

import com.moonsworth.lunar.lib.adventure.key.Key;
import com.moonsworth.lunar.lib.adventure.pointer.Pointer;
import com.moonsworth.lunar.lib.adventure.util.TriState;
import java.util.Objects;
import java.util.function.Predicate;
import org.jetbrains.annotations.NotNull;

public interface PermissionChecker extends Predicate<String> {
   Pointer<PermissionChecker> POINTER = Pointer.pointer(PermissionChecker.class, Key.key("adventure", "permission"));

   @NotNull
   static PermissionChecker always(@NotNull TriState var0) {
      Objects.requireNonNull(var0);
      if (var0 == TriState.TRUE) {
         return PermissionCheckers.TRUE;
      } else {
         return var0 == TriState.FALSE ? PermissionCheckers.FALSE : PermissionCheckers.NOT_SET;
      }
   }

   @NotNull
   TriState value(@NotNull String var1);

   default boolean test(@NotNull String var1) {
      return this.value(var1) == TriState.TRUE;
   }
}
