package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public interface IPerformanceSnapshotCollector extends IPerformanceCollector {
   void setup();

   void collect(@NotNull PerformanceCollectionData var1);
}
