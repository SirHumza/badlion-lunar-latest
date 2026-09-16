package com.moonsworth.webosr.wrappers;

import com.moonsworth.webosr.NativeHandle;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class NativeFuture extends NativeHandle implements Future<String> {
   private NativeFuture(long var1) {
      super(var1);
   }

   public native boolean isUndefined();

   public String get(long var1, TimeUnit var3) {
      return this.get0(var3.toNanos(var1));
   }

   public String get() {
      return this.get0(0L);
   }

   @Override
   public native boolean isDone();

   @Override
   public boolean isCancelled() {
      throw new UnsupportedOperationException();
   }

   @Override
   public boolean cancel(boolean var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   protected native void destroy();

   private native String get0(long var1);
}
