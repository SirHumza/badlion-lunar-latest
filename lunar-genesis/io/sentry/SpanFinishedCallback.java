package io.sentry;

import org.jetbrains.annotations.NotNull;

interface SpanFinishedCallback {
   void execute(@NotNull Span var1);
}
