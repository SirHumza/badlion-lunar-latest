package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class JavaMemoryCollector implements IPerformanceSnapshotCollector {
   @NotNull
   private final Runtime runtime = Runtime.getRuntime();

   @Override
   public void setup() {
   }

   @Override
   public void collect(@NotNull PerformanceCollectionData var1) {
      long var2 = System.currentTimeMillis();
      long var4 = this.runtime.totalMemory() - this.runtime.freeMemory();
      MemoryCollectionData var6 = new MemoryCollectionData(var2, var4);
      var1.addMemoryData(var6);
   }
}
