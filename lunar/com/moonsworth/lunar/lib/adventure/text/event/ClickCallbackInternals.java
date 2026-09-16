package com.moonsworth.lunar.lib.adventure.text.event;

import com.moonsworth.lunar.lib.adventure.audience.Audience;
import com.moonsworth.lunar.lib.adventure.permission.PermissionChecker;
import com.moonsworth.lunar.lib.adventure.util.Services;
import com.moonsworth.lunar.lib.adventure.util.TriState;
import org.jetbrains.annotations.NotNull;

final class ClickCallbackInternals {
   static final PermissionChecker ALWAYS_FALSE = PermissionChecker.always(TriState.FALSE);
   static final ClickCallback.Provider PROVIDER = Services.service(ClickCallback.Provider.class).orElseGet(ClickCallbackInternals.Fallback::new);

   private ClickCallbackInternals() {
   }

   static final class Fallback implements ClickCallback.Provider {
      @NotNull
      @Override
      public ClickEvent create(@NotNull ClickCallback<Audience> var1, ClickCallback.@NotNull Options var2) {
         return ClickEvent.suggestCommand("Callbacks are not supported on this platform!");
      }
   }
}
