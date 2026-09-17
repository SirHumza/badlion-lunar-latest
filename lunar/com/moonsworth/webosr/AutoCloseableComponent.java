package com.moonsworth.webosr;

public abstract class NativeHandle implements AutoCloseable {
   private long handle;

   protected NativeHandle(long var1) {
      this.handle = var1;
   }

   @Override
   public void close() {
      if (this.handle != 0L) {
         this.destroy();
         this.handle = 0L;
      }
   }

   protected abstract void destroy();
}
