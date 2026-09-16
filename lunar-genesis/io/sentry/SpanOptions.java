package io.sentry;

import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
public class SpanOptions {
   private boolean trimStart = false;
   private boolean trimEnd = false;
   private boolean isIdle = false;

   public boolean isTrimStart() {
      return this.trimStart;
   }

   public boolean isTrimEnd() {
      return this.trimEnd;
   }

   public boolean isIdle() {
      return this.isIdle;
   }

   public void setTrimStart(boolean var1) {
      this.trimStart = var1;
   }

   public void setTrimEnd(boolean var1) {
      this.trimEnd = var1;
   }

   public void setIdle(boolean var1) {
      this.isIdle = var1;
   }
}
