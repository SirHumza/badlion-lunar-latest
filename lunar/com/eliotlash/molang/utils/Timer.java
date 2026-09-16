package com.eliotlash.molang.utils;

public class Timer {
   public boolean enabled;
   public long time;
   public long duration;

   public Timer(long var1) {
      this.duration = var1;
   }

   public long getRemaining() {
      return this.time - System.currentTimeMillis();
   }

   public void mark() {
      this.mark(this.duration);
   }

   public void mark(long var1) {
      this.enabled = true;
      this.time = System.currentTimeMillis() + var1;
   }

   public void reset() {
      this.enabled = false;
   }

   public boolean checkReset() {
      boolean var1 = this.check();
      if (var1) {
         this.reset();
      }

      return var1;
   }

   public boolean check() {
      return this.enabled && this.isTime();
   }

   public boolean isTime() {
      return System.currentTimeMillis() >= this.time;
   }

   public boolean checkRepeat() {
      if (!this.enabled) {
         this.mark();
      }

      return this.checkReset();
   }
}
