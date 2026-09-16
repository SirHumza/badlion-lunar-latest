package io.sentry;

public final class HttpStatusCodeRange {
   public static final int DEFAULT_MIN = 500;
   public static final int DEFAULT_MAX = 599;
   private final int min;
   private final int max;

   public HttpStatusCodeRange(int var1, int var2) {
      this.min = var1;
      this.max = var2;
   }

   public HttpStatusCodeRange(int var1) {
      this.min = var1;
      this.max = var1;
   }

   public boolean isInRange(int var1) {
      return var1 >= this.min && var1 <= this.max;
   }
}
