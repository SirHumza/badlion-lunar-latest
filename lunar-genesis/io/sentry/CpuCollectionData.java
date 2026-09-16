package io.sentry;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class CpuCollectionData {
   final long timestampMillis;
   final double cpuUsagePercentage;

   public CpuCollectionData(long var1, double var3) {
      this.timestampMillis = var1;
      this.cpuUsagePercentage = var3;
   }

   public long getTimestampMillis() {
      return this.timestampMillis;
   }

   public double getCpuUsagePercentage() {
      return this.cpuUsagePercentage;
   }
}
