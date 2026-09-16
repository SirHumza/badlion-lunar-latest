package com.moonsworth.lunar.lib.adventure.bossbar;

import java.util.Collections;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public interface BossBarImplementation {
   @ApiStatus.Internal
   @NotNull
   static <I extends BossBarImplementation> I get(@NotNull BossBar var0, @NotNull Class<I> var1) {
      return BossBarImpl.ImplementationAccessor.get(var0, var1);
   }

   @ApiStatus.Internal
   @NotNull
   default Iterable<? extends BossBarViewer> viewers() {
      return Collections.emptyList();
   }

   @ApiStatus.Internal
   interface Provider {
      @ApiStatus.Internal
      @NotNull
      BossBarImplementation create(@NotNull BossBar var1);
   }
}
