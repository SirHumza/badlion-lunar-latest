package io.sentry.hints;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public enum EventDropReason {
   MULTITHREADED_DEDUPLICATION;
}
