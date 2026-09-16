package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class NoOpConnectionStatusProvider implements IConnectionStatusProvider {
   @NotNull
   @Override
   public IConnectionStatusProvider.ConnectionStatus getConnectionStatus() {
      return IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
   }

   @Nullable
   @Override
   public String getConnectionType() {
      return null;
   }

   @Override
   public boolean addConnectionStatusObserver(@NotNull IConnectionStatusProvider.IConnectionStatusObserver var1) {
      return false;
   }

   @Override
   public void removeConnectionStatusObserver(@NotNull IConnectionStatusProvider.IConnectionStatusObserver var1) {
   }
}
