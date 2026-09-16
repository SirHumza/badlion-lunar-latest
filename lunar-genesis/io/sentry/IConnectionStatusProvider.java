package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public interface IConnectionStatusProvider {
   @NotNull
   IConnectionStatusProvider.ConnectionStatus getConnectionStatus();

   @Nullable
   String getConnectionType();

   boolean addConnectionStatusObserver(@NotNull IConnectionStatusProvider.IConnectionStatusObserver var1);

   void removeConnectionStatusObserver(@NotNull IConnectionStatusProvider.IConnectionStatusObserver var1);

   enum ConnectionStatus {
      UNKNOWN,
      CONNECTED,
      DISCONNECTED,
      NO_PERMISSION;
   }

   interface IConnectionStatusObserver {
      void onConnectionStatusChanged(@NotNull IConnectionStatusProvider.ConnectionStatus var1);
   }
}
