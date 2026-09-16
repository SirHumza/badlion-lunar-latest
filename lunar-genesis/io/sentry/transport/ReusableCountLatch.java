package io.sentry.transport;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import org.jetbrains.annotations.NotNull;

public final class ReusableCountLatch {
   @NotNull
   private final ReusableCountLatch.Sync sync;

   public ReusableCountLatch(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("negative initial count '" + var1 + "' is not allowed");
      }

      this.sync = new ReusableCountLatch.Sync(var1);
   }

   public ReusableCountLatch() {
      this(0);
   }

   public int getCount() {
      return this.sync.getCount();
   }

   public void decrement() {
      this.sync.decrement();
   }

   public void increment() {
      this.sync.increment();
   }

   public void waitTillZero() {
      this.sync.acquireSharedInterruptibly(1);
   }

   public boolean waitTillZero(long var1, @NotNull TimeUnit var3) {
      return this.sync.tryAcquireSharedNanos(1, var3.toNanos(var1));
   }

   private static final class Sync extends AbstractQueuedSynchronizer {
      private static final long serialVersionUID = 5970133580157457018L;

      Sync(int var1) {
         this.setState(var1);
      }

      private int getCount() {
         return this.getState();
      }

      private void increment() {
         int var1;
         int var2;
         do {
            var1 = this.getState();
            var2 = var1 + 1;
         } while (!this.compareAndSetState(var1, var2));
      }

      private void decrement() {
         this.releaseShared(1);
      }

      @Override
      public int tryAcquireShared(int var1) {
         return this.getState() == 0 ? 1 : -1;
      }

      @Override
      public boolean tryReleaseShared(int var1) {
         int var2;
         int var3;
         do {
            var2 = this.getState();
            if (var2 == 0) {
               return false;
            }

            var3 = var2 - 1;
         } while (!this.compareAndSetState(var2, var3));

         return var3 == 0;
      }
   }
}
