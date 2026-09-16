package io.sentry;

import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class PerformanceCollectionData {
   @Nullable
   private MemoryCollectionData memoryData = null;
   @Nullable
   private CpuCollectionData cpuData = null;

   public void addMemoryData(@Nullable MemoryCollectionData var1) {
      if (var1 != null) {
         this.memoryData = var1;
      }
   }

   public void addCpuData(@Nullable CpuCollectionData var1) {
      if (var1 != null) {
         this.cpuData = var1;
      }
   }

   @Nullable
   public CpuCollectionData getCpuData() {
      return this.cpuData;
   }

   @Nullable
   public MemoryCollectionData getMemoryData() {
      return this.memoryData;
   }
}
