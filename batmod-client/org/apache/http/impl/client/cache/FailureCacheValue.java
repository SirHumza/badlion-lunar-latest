package org.apache.http.impl.client.cache;

import org.apache.http.annotation.Immutable;

@Immutable
public class FailureCacheValue {
   private final long creationTimeInNanos = System.nanoTime();
   private final String key;
   private final int errorCount;

   public FailureCacheValue(String key, int errorCount) {
      this.key = key;
      this.errorCount = errorCount;
   }

   public long getCreationTimeInNanos() {
      return this.creationTimeInNanos;
   }

   public String getKey() {
      return this.key;
   }

   public int getErrorCount() {
      return this.errorCount;
   }

   @Override
   public String toString() {
      return "[entry creationTimeInNanos=" + this.creationTimeInNanos + "; " + "key=" + this.key + "; errorCount=" + this.errorCount + ']';
   }
}
