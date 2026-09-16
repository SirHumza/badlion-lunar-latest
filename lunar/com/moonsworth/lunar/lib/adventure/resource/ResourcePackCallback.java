package com.moonsworth.lunar.lib.adventure.resource;

import com.moonsworth.lunar.lib.adventure.audience.Audience;
import java.util.UUID;
import java.util.function.BiConsumer;
import org.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface ResourcePackCallback {
   @NotNull
   static ResourcePackCallback noOp() {
      return ResourcePackCallbacks.NO_OP;
   }

   @NotNull
   static ResourcePackCallback onTerminal(@NotNull BiConsumer<UUID, Audience> var0, @NotNull BiConsumer<UUID, Audience> var1) {
      return (var2, var3, var4) -> {
         if (var3 == ResourcePackStatus.SUCCESSFULLY_LOADED) {
            var0.accept(var2, var4);
         } else if (!var3.intermediate()) {
            var1.accept(var2, var4);
         }
      };
   }

   void packEventReceived(@NotNull UUID var1, @NotNull ResourcePackStatus var2, @NotNull Audience var3);
}
