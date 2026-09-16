package io.sentry.transport;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public interface ICurrentDateProvider {
   long getCurrentTimeMillis();
}
