package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements HHIRHRHHRHIHRHOHCHRHIORRHIIHOR {
   private static final Logger RHHRIHOHIOIORIRICIRIOOICCIHRCR = Logger.getLogger(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class.getName());
   private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH IORIRIIIRCIIHHOOOIRCRIRRRRHCRH = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH();

   protected RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
   }

   protected abstract void runOneIteration();

   protected void startUp() {
   }

   protected void shutDown() {
   }

   protected abstract RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH HCHCHRRCRHIHHRRCOIRIICRHOOIHIO();

   protected ScheduledExecutorService executor() {
      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements ThreadFactory {
         @Override
         public Thread newThread(Runnable var1) {
            return OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.newThread(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.serviceName(), var1);
         }
      }

      final ScheduledExecutorService var1 = Executors.newSingleThreadScheduledExecutor(new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH());
      this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(new HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         @Override
         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1x) {
            var1.shutdown();
         }

         @Override
         public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1x, Throwable var2) {
            var1.shutdown();
         }
      }, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.directExecutor());
      return var1;
   }

   protected String serviceName() {
      return this.getClass().getSimpleName();
   }

   @Override
   public String toString() {
      return this.serviceName() + " [" + this.RIHCCCHRCCROICHCHIIHORRRIHIROH() + "]";
   }

   @Override
   public final boolean isRunning() {
      return this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.isRunning();
   }

   @Override
   public final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH RIHCCCHRCCROICHCHIIHORRRIHIROH() {
      return this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.RIHCCCHRCCROICHCHIIHORRRIHIROH();
   }

   @Override
   public final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1, Executor var2) {
      this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var2);
   }

   @Override
   public final Throwable failureCause() {
      return this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.failureCause();
   }

   @CanIgnoreReturnValue
   @Override
   public final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR IHICOCICHIRICHIHOHCHCOCOCCCROI() {
      this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.IHICOCICHIRICHIHOHCHCOCOCCCROI();
      return this;
   }

   @CanIgnoreReturnValue
   @Override
   public final HHIRHRHHRHIHRHOHCHRHIORRHIIHOR RHCOHHORRIOCRHOCRCRHRHRCRCCROO() {
      this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.RHCOHHORRIOCRHOCRCRHRHRCRCCROO();
      return this;
   }

   @Override
   public final void awaitRunning() {
      this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.awaitRunning();
   }

   @Override
   public final void awaitRunning(Duration var1) {
      HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.super.awaitRunning(var1);
   }

   @Override
   public final void awaitRunning(long var1, TimeUnit var3) {
      this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.awaitRunning(var1, var3);
   }

   @Override
   public final void awaitTerminated() {
      this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.awaitTerminated();
   }

   @Override
   public final void awaitTerminated(Duration var1) {
      HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.super.awaitTerminated(var1);
   }

   @Override
   public final void awaitTerminated(long var1, TimeUnit var3) {
      this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH.awaitTerminated(var1, var3);
   }

   private final class CRRRICCRROCOHHOHIICIHORCOORRRH extends HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
      private volatile @Nullable Future<?> runningTask;
      private volatile @Nullable ScheduledExecutorService executorService;
      private final ReentrantLock IHCHICROOOHOROIRCCRCRCRRCRIRRC = new ReentrantLock();
      private final Runnable RIIRICHOORRHRORHOCIOORORCRICRO = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();

      private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      }

      @Override
      protected final void doStart() {
         this.executorService = OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.executor(),
            new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<String>(
               
            ) {
               public String get() {
                  return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.serviceName() + " " + CRRRICCRROCOHHOHIICIHORCOORRRH.this.RIHCCCHRCCROICHCHIIHORRRIHIROH();
               }
            }
         );
         this.executorService
            .execute(
               new Runnable() {
                  @Override
                  public void run() {
                     CRRRICCRROCOHHOHIICIHORCOORRRH.this.IHCHICROOOHOROIRCCRCRCRRCRIRRC.lock();

                     try {
                        RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.startUp();
                        CRRRICCRROCOHHOHIICIHORCOORRRH.this.runningTask = RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.HCHCHRRCRHIHHRRCOIRIICRHOOIHIO()
                           .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                              RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.IORIRIIIRCIIHHOOOIRCRIRRRRHCRH,
                              CRRRICCRROCOHHOHIICIHORCOORRRH.this.executorService,
                              CRRRICCRROCOHHOHIICIHORCOORRRH.this.RIIRICHOORRHRORHOCIOORORCRICRO
                           );
                        CRRRICCRROCOHHOHIICIHORCOORRRH.this.RHIRCICCRRRRHCRCHCCRCOCCCRHHIH();
                     } catch (Throwable var5) {
                        CRRRICCRROCOHHOHIICIHORCOORRRH.this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var5);
                        if (CRRRICCRROCOHHOHIICIHORCOORRRH.this.runningTask != null) {
                           CRRRICCRROCOHHOHIICIHORCOORRRH.this.runningTask.cancel(false);
                        }
                     } finally {
                        CRRRICCRROCOHHOHIICIHORCOORRRH.this.IHCHICROOOHOROIRCCRCRCRRCRIRRC.unlock();
                     }
                  }
               }
            );
      }

      @Override
      protected final void doStop() {
         this.runningTask.cancel(false);
         this.executorService
            .execute(
               new Runnable() {
                  @Override
                  public void run() {
                     try {
                        CRRRICCRROCOHHOHIICIHORCOORRRH.this.IHCHICROOOHOROIRCCRCRCRRCRIRRC.lock();

                        label42: {
                           try {
                              if (CRRRICCRROCOHHOHIICIHORCOORRRH.this.RIHCCCHRCCROICHCHIIHORRRIHIROH()
                                 == HHIRHRHHRHIHRHOHCHRHIORRHIIHOR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.STOPPING) {
                                 RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.shutDown();
                                 break label42;
                              }
                           } finally {
                              CRRRICCRROCOHHOHIICIHORCOORRRH.this.IHCHICROOOHOROIRCCRCRCRRCRIRRC.unlock();
                           }

                           return;
                        }

                        CRRRICCRROCOHHOHIICIHORCOORRRH.this.IHIHRCCORROHICRHCRCCICOIROCIIO();
                     } catch (Throwable var5) {
                        CRRRICCRROCOHHOHIICIHORCOORRRH.this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var5);
                     }
                  }
               }
            );
      }

      @Override
      public String toString() {
         return RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.toString();
      }

      class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements Runnable {
         @Override
         public void run() {
            CRRRICCRROCOHHOHIICIHORCOORRRH.this.IHCHICROOOHOROIRCCRCRCRRCRIRRC.lock();

            try {
               if (!CRRRICCRROCOHHOHIICIHORCOORRRH.this.runningTask.isCancelled()) {
                  RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.runOneIteration();
                  return;
               }
            } catch (Throwable var8) {
               try {
                  RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.this.shutDown();
               } catch (Exception var7) {
                  RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RHHRIHOHIOIORIRICIRIOOICCIHRCR
                     .log(Level.WARNING, "Error while attempting to shut down the service after failure.", var7);
               }

               CRRRICCRROCOHHOHIICIHORCOORRRH.this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var8);
               CRRRICCRROCOHHOHIICIHORCOORRRH.this.runningTask.cancel(false);
               return;
            } finally {
               CRRRICCRROCOHHOHIICIHORCOORRRH.this.IHCHICROOOHOROIRCCRCRCRRCRIRRC.unlock();
            }
         }
      }
   }

   public abstract static class HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH IRCIIHHICIHRCOCRROCOICRIHHCCHH(Duration var0, Duration var1) {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var0), IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS
         );
      }

      public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         final long var0, final long var2, final TimeUnit var4
      ) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var4
         );
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var2 > 0L, "delay must be > 0, found %s", var2
         );
         return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
            @Override
            public Future<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, ScheduledExecutorService var2x, Runnable var3) {
               return var2x.scheduleWithFixedDelay(var3, var0, var2, var4);
            }
         };
      }

      public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH HHCCIRHCCCIIRHCROHIORHIRHHIORH(Duration var0, Duration var1) {
         return IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var0), IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS
         );
      }

      public static RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         final long var0, final long var2, final TimeUnit var4
      ) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var4
         );
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            var2 > 0L, "period must be > 0, found %s", var2
         );
         return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
            @Override
            public Future<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, ScheduledExecutorService var2x, Runnable var3) {
               return var2x.scheduleAtFixedRate(var3, var0, var2, var4);
            }
         };
      }

      abstract Future<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, ScheduledExecutorService var2, Runnable var3);

      private HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
      }
   }

   public abstract static class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      @Override
      final Future<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var1, ScheduledExecutorService var2, Runnable var3) {
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var1, var2, var3
         );
         var4.reschedule();
         return var4;
      }

      protected abstract RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH OCHIHOCIHHCRHOHHCIIRCHORHORHHO();

      protected static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
         private final long OHRCICOCRHHCROCOIIHIHHHICRRHRR;
         private final TimeUnit RORCHORHRIRICHCICRCHORRCCCRCOC;

         public IRCIIHHICIHRCOCRROCOICRIHHCCHH(long var1, TimeUnit var3) {
            this.OHRCICOCRHHCROCOIIHIHHHICRRHRR = var1;
            this.RORCHORHRIRICHCICRCHORRCCCRCOC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var3
            );
         }
      }

      private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends OIHCOHRCICCCRHRCROOCIOIRRHHHIH<Void> implements Callable<Void> {
         private final Runnable RCHRCOOOHICIOHIOCCROHIOHCOCCII;
         private final ScheduledExecutorService HICIIRIRIOIOCORORIRHRIIRRHICIH;
         private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH HCOIIIRORCOOHOCOOORRHCHCHCOOII;
         private final ReentrantLock ICRRIHOHOIRHOOHIHIOCIIIRHOHCHH = new ReentrantLock();
         @GuardedBy("lock")
         private @Nullable Future<Void> currentFuture;

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HRCHROOHRIHCRCRHRIIROCIRHOIRHH var2, ScheduledExecutorService var3, Runnable var4) {
            this.RCHRCOOOHICIOHIOCCROHIOHCOCCII = var4;
            this.HICIIRIRIOIOCORORIRHRIIRRHICIH = var3;
            this.HCOIIIRORCOOHOCOOORRHCHCHCOOII = var2;
         }

         public Void call() {
            this.RCHRCOOOHICIOHIOCCROHIOHCOCCII.run();
            this.reschedule();
            return null;
         }

         public void reschedule() {
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1;
            try {
               var1 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.this.OCHIHOCIHHCRHOHHCIIRCHORHORHHO();
            } catch (Throwable var8) {
               this.HCOIIIRORCOOHOCOOORRHCHCHCOOII.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var8);
               return;
            }

            Throwable var2 = null;
            this.ICRRIHOHOIRHOOHIHIOCIIIRHOHCHH.lock();

            try {
               if (this.currentFuture == null || !this.currentFuture.isCancelled()) {
                  this.currentFuture = this.HICIIRIRIOIOCORORIRHRIIRRHICIH
                     .schedule(this, var1.OHRCICOCRHHCROCOIIHIHHHICRRHRR, var1.RORCHORHRIRICHCICRCHORRCCCRCOC);
               }
            } catch (Throwable var9) {
               var2 = var9;
            } finally {
               this.ICRRIHOHOIRHOOHIHIOCIIIRHOHCHH.unlock();
            }

            if (var2 != null) {
               this.HCOIIIRORCOOHOCOOORRHCHCHCOOII.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var2);
            }
         }

         @Override
         public boolean cancel(boolean var1) {
            this.ICRRIHOHOIRHOOHIHIOCIIIRHOHCHH.lock();

            try {
               return this.currentFuture.cancel(var1);
            } finally {
               this.ICRRIHOHOIRHOOHIHIOCIIIRHOHCHH.unlock();
            }
         }

         @Override
         public boolean isCancelled() {
            this.ICRRIHOHOIRHOOHIHIOCIIIRHOHCHH.lock();

            try {
               return this.currentFuture.isCancelled();
            } finally {
               this.ICRRIHOHOIRHOOHIHIOCIIIRHOHCHH.unlock();
            }
         }

         @Override
         protected Future<Void> delegate() {
            throw new UnsupportedOperationException("Only cancel and isCancelled is supported by this future");
         }
      }
   }
}
