package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public interface IPerformanceContinuousCollector extends IPerformanceCollector {
   void onSpanStarted(@NotNull ISpan var1);

   void onSpanFinished(@NotNull ISpan var1);

   void clear();
}
