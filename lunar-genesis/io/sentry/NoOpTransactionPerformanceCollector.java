package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NoOpTransactionPerformanceCollector implements TransactionPerformanceCollector {
   private static final NoOpTransactionPerformanceCollector instance = new NoOpTransactionPerformanceCollector();

   public static NoOpTransactionPerformanceCollector getInstance() {
      return instance;
   }

   private NoOpTransactionPerformanceCollector() {
   }

   @Override
   public void start(@NotNull ITransaction var1) {
   }

   @Override
   public void onSpanStarted(@NotNull ISpan var1) {
   }

   @Override
   public void onSpanFinished(@NotNull ISpan var1) {
   }

   @Nullable
   @Override
   public List<PerformanceCollectionData> stop(@NotNull ITransaction var1) {
      return null;
   }

   @Override
   public void close() {
   }
}
