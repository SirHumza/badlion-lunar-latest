package io.sentry.util.thread;

import io.sentry.protocol.SentryThread;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public interface IMainThreadChecker {
   boolean isMainThread(long var1);

   boolean isMainThread(@NotNull Thread var1);

   boolean isMainThread();

   boolean isMainThread(@NotNull SentryThread var1);
}
