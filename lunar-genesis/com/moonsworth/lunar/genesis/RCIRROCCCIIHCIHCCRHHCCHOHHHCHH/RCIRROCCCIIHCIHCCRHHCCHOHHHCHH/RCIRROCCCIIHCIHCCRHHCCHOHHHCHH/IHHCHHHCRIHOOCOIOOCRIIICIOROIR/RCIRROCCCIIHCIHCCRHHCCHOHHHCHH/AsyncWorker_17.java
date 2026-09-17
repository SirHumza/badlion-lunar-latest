package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.google.j2objc.annotations.Weak;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BooleanSupplier;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class COIHORRCHRRCHOCIRHHRRIOIHRIHCC {
   private final boolean RROIHCRCCOCIIROCCIOICOHIRRHROO;
   private final ReentrantLock OOIROOHCCHROCIOOICIRRROHIOOOOO;
   @GuardedBy("lock")
   private COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHRRCIOIRROCIRICRICIROIRRIIIRC = null;

   public COIHORRCHRRCHOCIRHHRRIOIHRIHCC() {
      this(false);
   }

   public COIHORRCHRRCHOCIRHHRRIOIHRIHCC(boolean var1) {
      this.RROIHCRCCOCIIROCCIOICOHIRRHROO = var1;
      this.OOIROOHCCHROCIOOICIRRROHIOOOOO = new ReentrantLock(var1);
   }

   public COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RICRIRRCOHRCOCRRHHCRHRROOIOHHR(final BooleanSupplier var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1, "isSatisfied"
      );
      return new COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this) {
         @Override
         public boolean isSatisfied() {
            return var1.getAsBoolean();
         }
      };
   }

   public void enter() {
      this.OOIROOHCCHROCIOOICIRRROHIOOOOO.lock();
   }

   public boolean enter(Duration var1) {
      return this.enter(IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS);
   }

   public boolean enter(long var1, TimeUnit var3) {
      long var4 = toSafeNanos(var1, var3);
      ReentrantLock var6 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;
      if (!this.RROIHCRCCOCIIROCCIOICOHIRRHROO && var6.tryLock()) {
         return true;
      }

      boolean var7 = Thread.interrupted();

      try {
         long var8 = System.nanoTime();
         long var10 = var4;

         while (true) {
            try {
               return var6.tryLock(var10, TimeUnit.NANOSECONDS);
            } catch (InterruptedException var16) {
               var7 = true;
               var10 = remainingNanos(var8, var4);
            }
         }
      } finally {
         if (var7) {
            Thread.currentThread().interrupt();
         }
      }
   }

   public void enterInterruptibly() {
      this.OOIROOHCCHROCIOOICIRRROHIOOOOO.lockInterruptibly();
   }

   public boolean enterInterruptibly(Duration var1) {
      return this.enterInterruptibly(IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS);
   }

   public boolean enterInterruptibly(long var1, TimeUnit var3) {
      return this.OOIROOHCCHROCIOOICIRRROHIOOOOO.tryLock(var1, var3);
   }

   public boolean tryEnter() {
      return this.OOIROOHCCHROCIOOICIRRROHIOOOOO.tryLock();
   }

   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      ReentrantLock var2 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;
      boolean var3 = var2.isHeldByCurrentThread();
      var2.lockInterruptibly();
      boolean var4 = false;

      try {
         if (!var1.isSatisfied()) {
            this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var3);
         }

         var4 = true;
      } finally {
         if (!var4) {
            this.leave();
         }
      }
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Duration var2) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, long var2, TimeUnit var4) {
      long var5 = toSafeNanos(var2, var4);
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      ReentrantLock var7;
      boolean var8;
      long var9;
      label185: {
         var7 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;
         var8 = var7.isHeldByCurrentThread();
         var9 = 0L;
         if (!this.RROIHCRCCOCIIROCCIOICOHIRRHROO) {
            if (Thread.interrupted()) {
               throw new InterruptedException();
            }

            if (var7.tryLock()) {
               break label185;
            }
         }

         var9 = initNanoTime(var5);
         if (!var7.tryLock(var2, var4)) {
            return false;
         }
      }

      boolean var11 = false;
      boolean var12 = true;

      try {
         var11 = var1.isSatisfied() || this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var9 == 0L ? var5 : remainingNanos(var9, var5), var8);
         var12 = false;
         return var11;
      } finally {
         if (!var11) {
            try {
               if (var12 && !var8) {
                  this.signalNextWaiter();
               }
            } finally {
               var7.unlock();
            }
         }
      }
   }

   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      ReentrantLock var2 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;
      boolean var3 = var2.isHeldByCurrentThread();
      var2.lock();
      boolean var4 = false;

      try {
         if (!var1.isSatisfied()) {
            this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, var3);
         }

         var4 = true;
      } finally {
         if (!var4) {
            this.leave();
         }
      }
   }

   public boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Duration var2) {
      return this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   public boolean IRCIIHHICIHRCOCRROCOICRIHHCCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, long var2, TimeUnit var4) {
      long var5 = toSafeNanos(var2, var4);
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      ReentrantLock var7 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;
      long var8 = 0L;
      boolean var10 = var7.isHeldByCurrentThread();
      boolean var11 = Thread.interrupted();

      try {
         if (this.RROIHCRCCOCIIROCCIOICOHIRRHROO || !var7.tryLock()) {
            var8 = initNanoTime(var5);
            long var12 = var5;

            while (true) {
               try {
                  if (!var7.tryLock(var12, TimeUnit.NANOSECONDS)) {
                     return false;
                  }
                  break;
               } catch (InterruptedException var27) {
                  var11 = true;
                  var12 = remainingNanos(var8, var5);
               }
            }
         }

         boolean var29 = false;

         try {
            while (true) {
               try {
                  if (var1.isSatisfied()) {
                     var29 = true;
                  } else {
                     long var13;
                     if (var8 == 0L) {
                        var8 = initNanoTime(var5);
                        var13 = var5;
                     } else {
                        var13 = remainingNanos(var8, var5);
                     }

                     var29 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var13, var10);
                  }

                  return var29;
               } catch (InterruptedException var25) {
                  var11 = true;
                  var10 = false;
               }
            }
         } finally {
            if (!var29) {
               var7.unlock();
            }
         }
      } finally {
         if (var11) {
            Thread.currentThread().interrupt();
         }
      }
   }

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      ReentrantLock var2 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;
      var2.lock();
      boolean var3 = false;

      try {
         return var3 = var1.isSatisfied();
      } finally {
         if (!var3) {
            var2.unlock();
         }
      }
   }

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Duration var2) {
      return this.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, long var2, TimeUnit var4) {
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      if (!this.enter(var2, var4)) {
         return false;
      }

      boolean var5 = false;

      try {
         return var5 = var1.isSatisfied();
      } finally {
         if (!var5) {
            this.OOIROOHCCHROCIOOICIRRROHIOOOOO.unlock();
         }
      }
   }

   public boolean CRRRICCRROCOHHOHIICIHORCOORRRH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      ReentrantLock var2 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;
      var2.lockInterruptibly();
      boolean var3 = false;

      try {
         return var3 = var1.isSatisfied();
      } finally {
         if (!var3) {
            var2.unlock();
         }
      }
   }

   public boolean CRRRICCRROCOHHOHIICIHORCOORRRH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Duration var2) {
      return this.CRRRICCRROCOHHOHIICIHORCOORRRH(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   public boolean CRRRICCRROCOHHOHIICIHORCOORRRH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, long var2, TimeUnit var4) {
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      ReentrantLock var5 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;
      if (!var5.tryLock(var2, var4)) {
         return false;
      }

      boolean var6 = false;

      try {
         return var6 = var1.isSatisfied();
      } finally {
         if (!var6) {
            var5.unlock();
         }
      }
   }

   public boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      ReentrantLock var2 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;
      if (!var2.tryLock()) {
         return false;
      }

      boolean var3 = false;

      try {
         return var3 = var1.isSatisfied();
      } finally {
         if (!var3) {
            var2.unlock();
         }
      }
   }

   public void RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (!(var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO == this & this.OOIROOHCCHROCIOOICIRRROHIOOOOO.isHeldByCurrentThread())) {
         throw new IllegalMonitorStateException();
      }

      if (!var1.isSatisfied()) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, true);
      }
   }

   public boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Duration var2) {
      return this.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   public boolean RRCRRCORICCHOHHIRCHIROOHIIOHCO(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, long var2, TimeUnit var4) {
      long var5 = toSafeNanos(var2, var4);
      if (!(var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO == this & this.OOIROOHCCHROCIOOICIRRROHIOOOOO.isHeldByCurrentThread())) {
         throw new IllegalMonitorStateException();
      } else if (var1.isSatisfied()) {
         return true;
      } else if (Thread.interrupted()) {
         throw new InterruptedException();
      } else {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var5, true);
      }
   }

   public void HRCHROOHRIHCRCRHRIIROCIRHOIRHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (!(var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO == this & this.OOIROOHCCHROCIOOICIRRROHIOOOOO.isHeldByCurrentThread())) {
         throw new IllegalMonitorStateException();
      }

      if (!var1.isSatisfied()) {
         this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var1, true);
      }
   }

   public boolean RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Duration var2) {
      return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   public boolean RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, long var2, TimeUnit var4) {
      long var5 = toSafeNanos(var2, var4);
      if (!(var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO == this & this.OOIROOHCCHROCIOOICIRRROHIOOOOO.isHeldByCurrentThread())) {
         throw new IllegalMonitorStateException();
      }

      if (var1.isSatisfied()) {
         return true;
      }

      boolean var7 = true;
      long var8 = initNanoTime(var5);
      boolean var10 = Thread.interrupted();

      try {
         long var11 = var5;

         while (true) {
            try {
               return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var11, var7);
            } catch (InterruptedException var18) {
               var10 = true;
               if (var1.isSatisfied()) {
                  return true;
               }

               var7 = false;
               var11 = remainingNanos(var8, var5);
            }
         }
      } finally {
         if (var10) {
            Thread.currentThread().interrupt();
         }
      }
   }

   public void leave() {
      ReentrantLock var1 = this.OOIROOHCCHROCIOOICIRRROHIOOOOO;

      try {
         if (var1.getHoldCount() == 1) {
            this.signalNextWaiter();
         }
      } finally {
         var1.unlock();
      }
   }

   public boolean isFair() {
      return this.RROIHCRCCOCIIROCCIOICOHIRRHROO;
   }

   public boolean isOccupied() {
      return this.OOIROOHCCHROCIOOICIRRROHIOOOOO.isLocked();
   }

   public boolean isOccupiedByCurrentThread() {
      return this.OOIROOHCCHROCIOOICIRRROHIOOOOO.isHeldByCurrentThread();
   }

   public int getOccupiedDepth() {
      return this.OOIROOHCCHROCIOOICIRRROHIOOOOO.getHoldCount();
   }

   public int getQueueLength() {
      return this.OOIROOHCCHROCIOOICIRRROHIOOOOO.getQueueLength();
   }

   public boolean hasQueuedThreads() {
      return this.OOIROOHCCHROCIOOICIRRROHIOOOOO.hasQueuedThreads();
   }

   public boolean hasQueuedThread(Thread var1) {
      return this.OOIROOHCCHROCIOOICIRRROHIOOOOO.hasQueuedThread(var1);
   }

   public boolean OOROOCCIRCCRHOIOIORIHCHHOOCCOR(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      return this.CORCOCICIRIOHROHROIIOOHICCHCRR(var1) > 0;
   }

   public int CORCOCICIRIOHROHROIIOOHICCHCRR(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      if (var1.RIIRIHCHICHCRIIICRICIOHOHCIRRO != this) {
         throw new IllegalMonitorStateException();
      }

      this.OOIROOHCCHROCIOOICIRRROHIOOOOO.lock();

      try {
         return var1.waiterCount;
      } finally {
         this.OOIROOHCCHROCIOOICIRRROHIOOOOO.unlock();
      }
   }

   private static long toSafeNanos(long var0, TimeUnit var2) {
      long var3 = var2.toNanos(var0);
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.OCOHORHCROHICRRIHCIHHRRCIHICRI.OCOHORHCROHICRRIHCIHHRRCIHICRI.constrainToRange(
         var3, 0L, 6917529027641081853L
      );
   }

   private static long initNanoTime(long var0) {
      if (var0 <= 0L) {
         return 0L;
      }

      long var2 = System.nanoTime();
      return var2 == 0L ? 1L : var2;
   }

   private static long remainingNanos(long var0, long var2) {
      return var2 <= 0L ? 0L : var2 - (System.nanoTime() - var0);
   }

   @GuardedBy("lock")
   private void signalNextWaiter() {
      for (COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.HHRRCIOIRROCIRICRICIROIRRIIIRC;
         var1 != null;
         var1 = var1.HORROCCRIRCHICHCOIHRHICOIRHCIR
      ) {
         if (this.CRICCOOHHHCHOORCICOCOHIHOIRHOO(var1)) {
            var1.OCIHCOIIIRRRRICRIIIRCIICHHCHOO.signal();
            break;
         }
      }
   }

   @GuardedBy("lock")
   private boolean CRICCOOHHHCHOORCICOCOHIHOIRHOO(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      try {
         return var1.isSatisfied();
      } catch (Throwable var3) {
         this.signalAllWaiters();
         throw var3;
      }
   }

   @GuardedBy("lock")
   private void signalAllWaiters() {
      for (COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = this.HHRRCIOIRROCIRICRICIROIRRIIIRC;
         var1 != null;
         var1 = var1.HORROCCRIRCHICHCOIHRHICOIRHCIR
      ) {
         var1.OCIHCOIIIRRRRICRIIIRCIICHHCHOO.signalAll();
      }
   }

   @GuardedBy("lock")
   private void HICHRCOHCCRHOHCICOOCHOIHCCHIRI(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      int var2 = var1.waiterCount++;
      if (var2 == 0) {
         var1.HORROCCRIRCHICHCOIHRHICOIRHCIR = this.HHRRCIOIRROCIRICRICIROIRRIIIRC;
         this.HHRRCIOIRROCIRICRICIROIRRIIIRC = var1;
      }
   }

   @GuardedBy("lock")
   private void IIHRRHORCRCROCHHOHORCHCROCIHRO(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      int var2 = --var1.waiterCount;
      if (var2 == 0) {
         COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = this.HHRRCIOIRROCIRICRICIROIRRIIIRC;
         COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = null;

         while (var3 != var1) {
            var4 = var3;
            var3 = var3.HORROCCRIRCHICHCOIHRHICOIRHCIR;
         }

         if (var4 == null) {
            this.HHRRCIOIRROCIRICRICIROIRRIIIRC = var3.HORROCCRIRCHICHCOIHRHICOIRHCIR;
         } else {
            var4.HORROCCRIRCHICHCOIHRHICOIRHCIR = var3.HORROCCRIRCHICHCOIHRHICOIRHCIR;
         }

         var3.HORROCCRIRCHICHCOIHRHICOIRHCIR = null;
      }
   }

   @GuardedBy("lock")
   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, boolean var2) {
      if (var2) {
         this.signalNextWaiter();
      }

      this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1);

      try {
         do {
            var1.OCIHCOIIIRRRRICRIIIRCIICHHCHOO.await();
         } while (!var1.isSatisfied());
      } finally {
         this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1);
      }
   }

   @GuardedBy("lock")
   private void IRCIIHHICIHRCOCRROCOICRIHHCCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, boolean var2) {
      if (var2) {
         this.signalNextWaiter();
      }

      this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1);

      try {
         do {
            var1.OCIHCOIIIRRRRICRIIIRCIICHHCHOO.awaitUninterruptibly();
         } while (!var1.isSatisfied());
      } finally {
         this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1);
      }
   }

   @GuardedBy("lock")
   private boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, long var2, boolean var4) {
      boolean var5 = true;

      try {
         while (var2 > 0L) {
            if (var5) {
               if (var4) {
                  this.signalNextWaiter();
               }

               this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1);
               var5 = false;
            }

            var2 = var1.OCIHCOIIIRRRRICRIIIRCIICHHCHOO.awaitNanos(var2);
            if (var1.isSatisfied()) {
               return true;
            }
         }

         return false;
      } finally {
         if (!var5) {
            this.IIHRRHORCRCROCHHOHORCHCROCIHRO(var1);
         }
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   public abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      @Weak
      final COIHORRCHRRCHOCIRHHRRIOIHRIHCC RIIRIHCHICHCRIIICRICIOHOHCIRRO;
      final Condition OCIHCOIIIRRRRICRIIIRCIICHHCHOO;
      @GuardedBy("monitor.lock")
      int waiterCount = 0;
      @GuardedBy("monitor.lock")
      COIHORRCHRRCHOCIRHHRRIOIHRIHCC.@Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HORROCCRIRCHICHCOIHRHICOIRHCIR;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(COIHORRCHRRCHOCIRHHRRIOIHRIHCC var1) {
         this.RIIRIHCHICHCRIIICRICIOHOHCIRRO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1, "monitor"
         );
         this.OCIHCOIIIRRRRICRIIIRCIICHHCHOO = var1.OOIROOHCCHROCIOOICIRRROHIOOOOO.newCondition();
      }

      public abstract boolean isSatisfied();
   }
}
