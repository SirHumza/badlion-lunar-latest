package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
@ReflectionSupport(ReflectionSupport.Level.FULL)
abstract class IIHRHCCOOHOOOOCHRRCOROOIOHCOOO<T> extends AtomicReference<Runnable> implements Runnable {
   private static final Runnable HIRIICCIIRIIROIOCHOOCOOCRIOIHC = new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   private static final Runnable RHCCIRIRROIHRCIIHORIIHOORRCIHI = new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   private static final Runnable CCCIHHOHHCIIHIRCICRIRHIHIRHIOI = new IIHRHCCOOHOOOOCHRRCOROOIOHCOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   private static final int RRHRCCRCIRCIIRHIIORHROOROHCIHI = 1000;

   @Override
   public final void run() {
      Thread var1 = Thread.currentThread();
      if (this.compareAndSet(null, var1)) {
         boolean var2 = !this.isDone();
         Object var3 = null;
         Throwable var4 = null;

         try {
            if (var2) {
               var3 = this.runInterruptibly();
            }
         } catch (Throwable var14) {
            var4 = var14;
         } finally {
            if (!this.compareAndSet(var1, HIRIICCIIRIIROIOCHOOCOOCRIOIHC)) {
               boolean var9 = false;
               int var10 = 0;

               for (Runnable var11 = this.get(); var11 == RHCCIRIRROIHRCIIHORIIHOORRCIHI || var11 == CCCIHHOHHCIIHIRCICRIRHIHIRHIOI; var11 = this.get()) {
                  if (++var10 > 1000) {
                     if (var11 == CCCIHHOHHCIIHIRCICRIRHIHIRHIOI || this.compareAndSet(RHCCIRIRROIHRCIIHORIIHOORRCIHI, CCCIHHOHHCIIHIRCICRIRHIHIRHIOI)) {
                        var9 = Thread.interrupted() || var9;
                        LockSupport.park(this);
                     }
                  } else {
                     Thread.yield();
                  }
               }

               if (var9) {
                  var1.interrupt();
               }
            }

            if (var2) {
               this.afterRanInterruptibly((T)var3, var4);
            }
         }
      }
   }

   abstract boolean isDone();

   abstract T runInterruptibly();

   abstract void afterRanInterruptibly(@Nullable T var1, @Nullable Throwable var2);

   final void RIHOROIOCOOCCRHCIHHRHICHOCHIHC() {
      Runnable var1 = this.get();
      if (var1 instanceof Thread && this.compareAndSet(var1, RHCCIRIRROIHRCIIHORIIHOORRCIHI)) {
         try {
            ((Thread)var1).interrupt();
         } finally {
            Runnable var4 = this.getAndSet(HIRIICCIIRIIROIOCHOOCOOCRIOIHC);
            if (var4 == CCCIHHOHHCIIHIRCICRIRHIHIRHIOI) {
               LockSupport.unpark((Thread)var1);
            }
         }
      }
   }

   @Override
   public final String toString() {
      Runnable var1 = this.get();
      String var2;
      if (var1 == HIRIICCIIRIIROIOCHOOCOOCRIOIHC) {
         var2 = "running=[DONE]";
      } else if (var1 == RHCCIRIRROIHRCIIHORIIHOORRCIHI) {
         var2 = "running=[INTERRUPTED]";
      } else if (var1 instanceof Thread) {
         var2 = "running=[RUNNING ON " + ((Thread)var1).getName() + "]";
      } else {
         var2 = "running=[NOT STARTED YET]";
      }

      return var2 + ", " + this.toPendingString();
   }

   abstract String toPendingString();

   static {
      Class<LockSupport> var0 = LockSupport.class;
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Runnable {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      public void run() {
      }
   }
}
