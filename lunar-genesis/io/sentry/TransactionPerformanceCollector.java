package io.sentry;

import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface TransactionPerformanceCollector {
   void start(@NotNull ITransaction var1);

   void onSpanStarted(@NotNull ISpan var1);

   void onSpanFinished(@NotNull ISpan var1);

   @Nullable
   List<PerformanceCollectionData> stop(@NotNull ITransaction var1);

   @ApiStatus.Internal
   void close();
}
