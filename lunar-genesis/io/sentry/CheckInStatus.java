package io.sentry;

import java.util.Locale;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Experimental
public enum CheckInStatus {
   IN_PROGRESS,
   OK,
   ERROR;

   @NotNull
   public String apiName() {
      return this.name().toLowerCase(Locale.ROOT);
   }
}
