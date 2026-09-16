package io.sentry;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NoOpTransactionProfiler implements ITransactionProfiler {
   private static final NoOpTransactionProfiler instance = new NoOpTransactionProfiler();

   private NoOpTransactionProfiler() {
   }

   public static NoOpTransactionProfiler getInstance() {
      return instance;
   }

   @Override
   public void start() {
   }

   @Override
   public boolean isRunning() {
      return false;
   }

   @Override
   public void bindTransaction(@NotNull ITransaction var1) {
   }

   @Nullable
   @Override
   public ProfilingTraceData onTransactionFinish(@NotNull ITransaction var1, @Nullable List<PerformanceCollectionData> var2, @NotNull SentryOptions var3) {
      return null;
   }

   @Override
   public void close() {
   }
}
