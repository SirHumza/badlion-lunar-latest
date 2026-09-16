package io.sentry;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public final class MemoryCollectionData {
   final long timestampMillis;
   final long usedHeapMemory;
   final long usedNativeMemory;

   public MemoryCollectionData(long var1, long var3, long var5) {
      this.timestampMillis = var1;
      this.usedHeapMemory = var3;
      this.usedNativeMemory = var5;
   }

   public MemoryCollectionData(long var1, long var3) {
      this(var1, var3, -1L);
   }

   public long getTimestampMillis() {
      return this.timestampMillis;
   }

   public long getUsedHeapMemory() {
      return this.usedHeapMemory;
   }

   public long getUsedNativeMemory() {
      return this.usedNativeMemory;
   }
}
