package io.sentry;

import org.jetbrains.annotations.NotNull;

public interface Integration {
   void register(@NotNull IHub var1, @NotNull SentryOptions var2);
}
