package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.IICRCOCCHCORCRHHHOIHROCHIROIHH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCHOIICIHOCIRCIOORIOHRCRHOCRCR;
import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class OHCIIOCHHOHOHCOHHCRRHHCRHOIICC {
   private OHCIIOCHHOHOHCOHHCRRHHCRHOIICC() {
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static ExecutorService getExitingExecutorService(ThreadPoolExecutor var0, Duration var1) {
      return getExitingExecutorService(var0, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static ExecutorService getExitingExecutorService(ThreadPoolExecutor var0, long var1, TimeUnit var3) {
      return new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var3);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static ExecutorService getExitingExecutorService(ThreadPoolExecutor var0) {
      return new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor var0, Duration var1) {
      return getExitingScheduledExecutorService(var0, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor var0, long var1, TimeUnit var3) {
      return new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var3);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static ScheduledExecutorService getExitingScheduledExecutorService(ScheduledThreadPoolExecutor var0) {
      return new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static void addDelayedShutdownHook(ExecutorService var0, Duration var1) {
      addDelayedShutdownHook(var0, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static void addDelayedShutdownHook(ExecutorService var0, long var1, TimeUnit var3) {
      new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var3);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static void useDaemonThreadFactory(ThreadPoolExecutor var0) {
      var0.setThreadFactory(
         new RRORCOIRRIICOOICOIOCORHORCHCOC().RCIRCOIRRRHCRRIIOCRRCIIIOHIHRC(true).RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getThreadFactory()).build()
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static RHOORRIIOCHIRRHOHOOHIROHCRICRO OICHORCICRROIHRIRICOIIORHIOICR() {
      return new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   }

   public static Executor directExecutor() {
      return HICRRICCHCCROOHHCHOCOCCHOIHHOC.INSTANCE;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static Executor newSequentialExecutor(Executor var0) {
      return new IHIIIRHOOCHRCCCCIORIROCOIRRHCC(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static RHOORRIIOCHIRRHOHOOHIROHCRICRO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ExecutorService var0) {
      return var0 instanceof RHOORRIIOCHIRRHOHOOHIROHCRICRO
         ? (RHOORRIIOCHIRRHOHOOHIROHCRICRO)var0
         : (
            var0 instanceof ScheduledExecutorService
               ? new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH((ScheduledExecutorService)var0)
               : new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0)
         );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static CCHHCIRHICHHHHRRIHIORCCORCCIHR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ScheduledExecutorService var0) {
      return var0 instanceof CCHHCIRHICHHHHRRIHIORCCORCCIHR
         ? (CCHHCIRHICHHHHRRIHIORCCORCCIHR)var0
         : new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RHOORRIIOCHIRRHOHOOHIROHCRICRO var0, Collection<? extends Callable<T>> var1, boolean var2, Duration var3) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var3), TimeUnit.NANOSECONDS);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static <T> T RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RHOORRIIOCHIRRHOHOOHIROHCRICRO var0, Collection<? extends Callable<T>> var1, boolean var2, long var3, TimeUnit var5
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var5
      );
      int var6 = var1.size();
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var6 > 0
      );
      ArrayList var7 = RCHOIICIHOCIRCIOORIOHRCRHOCRCR.newArrayListWithCapacity(var6);
      LinkedBlockingQueue var8 = IICRCOCCHCORCRHHHOIHROCHIROIHH.newLinkedBlockingQueue();
      long var9 = var5.toNanos(var3);

      try {
         ExecutionException var11 = null;
         long var12 = var2 ? System.nanoTime() : 0L;
         Iterator var14 = var1.iterator();
         var7.add(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, (Callable<T>)var14.next(), var8));
         var6--;
         int var15 = 1;

         while (true) {
            Future var16 = (Future)var8.poll();
            if (var16 == null) {
               if (var6 > 0) {
                  var6--;
                  var7.add(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, (Callable<T>)var14.next(), var8));
                  var15++;
               } else {
                  if (var15 == 0) {
                     if (var11 == null) {
                        var11 = new ExecutionException(null);
                     }

                     throw var11;
                  }

                  if (var2) {
                     var16 = (Future)var8.poll(var9, TimeUnit.NANOSECONDS);
                     if (var16 == null) {
                        throw new TimeoutException();
                     }

                     long var17 = System.nanoTime();
                     var9 -= var17 - var12;
                     var12 = var17;
                  } else {
                     var16 = (Future)var8.take();
                  }
               }
            }

            if (var16 != null) {
               var15--;

               try {
                  return (T)var16.get();
               } catch (ExecutionException var26) {
                  var11 = var26;
               } catch (RuntimeException var27) {
                  var11 = new ExecutionException(var27);
               }
            }
         }
      } finally {
         for (Future var22 : var7) {
            var22.cancel(true);
         }
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static <T> RCCCROCHCICCROHCOCCRRROCIIHCCH<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      RHOORRIIOCHIRRHOHOOHIROHCRICRO var0, Callable<T> var1, final BlockingQueue<Future<T>> var2
   ) {
      final RCCCROCHCICCROHCOCCRRROCIIHCCH var3 = var0.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
      var3.addListener(new Runnable() {
         @Override
         public void run() {
            var2.add(var3);
         }
      }, directExecutor());
      return var3;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static ThreadFactory platformThreadFactory() {
      if (!isAppEngineWithApiClasses()) {
         return Executors.defaultThreadFactory();
      }

      try {
         return (ThreadFactory)Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory").invoke(null);
      } catch (IllegalAccessException var1) {
         throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", var1);
      } catch (ClassNotFoundException var2) {
         throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", var2);
      } catch (NoSuchMethodException var3) {
         throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", var3);
      } catch (InvocationTargetException var4) {
         throw com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHROHHHCIHHCOHCOORCRIHHIICROR.propagate(
            var4.getCause()
         );
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static boolean isAppEngineWithApiClasses() {
      if (System.getProperty("com.google.appengine.runtime.environment") == null) {
         return false;
      }

      try {
         Class.forName("com.google.appengine.api.utils.SystemProperty");
      } catch (ClassNotFoundException var5) {
         return false;
      }

      try {
         return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment").invoke(null) != null;
      } catch (ClassNotFoundException var1) {
         return false;
      } catch (InvocationTargetException var2) {
         return false;
      } catch (IllegalAccessException var3) {
         return false;
      } catch (NoSuchMethodException var4) {
         return false;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static Thread newThread(String var0, Runnable var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      Thread var2 = platformThreadFactory().newThread(var1);

      try {
         var2.setName(var0);
      } catch (SecurityException var4) {
      }

      return var2;
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static Executor RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      final Executor var0,
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<String> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new Executor() {
         @Override
         public void execute(Runnable var1x) {
            var0.execute(OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var1));
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static ExecutorService RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ExecutorService var0,
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<String> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new IIIIRHIHROIRCROHHROIHIIHRCRRHO(var0) {
         @Override
         protected <T> Callable<T> wrapTask(Callable<T> var1x) {
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var1);
         }

         @Override
         protected Runnable wrapTask(Runnable var1x) {
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var1);
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   static ScheduledExecutorService RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      ScheduledExecutorService var0,
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<String> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return new RRRHHIRORHCHHCOOCIHOICORHHCHHO(var0) {
         @Override
         protected <T> Callable<T> wrapTask(Callable<T> var1x) {
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var1);
         }

         @Override
         protected Runnable wrapTask(Runnable var1x) {
            return OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1x, var1);
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static boolean shutdownAndAwaitTermination(ExecutorService var0, Duration var1) {
      return shutdownAndAwaitTermination(var0, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @CanIgnoreReturnValue
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public static boolean shutdownAndAwaitTermination(ExecutorService var0, long var1, TimeUnit var3) {
      long var4 = var3.toNanos(var1) / 2L;
      var0.shutdown();

      try {
         if (!var0.awaitTermination(var4, TimeUnit.NANOSECONDS)) {
            var0.shutdownNow();
            var0.awaitTermination(var4, TimeUnit.NANOSECONDS);
         }
      } catch (InterruptedException var7) {
         Thread.currentThread().interrupt();
         var0.shutdownNow();
      }

      return var0.isTerminated();
   }

   static Executor RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      final Executor var0,
      final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<?> var1
   ) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var0
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return var0 == directExecutor() ? var0 : new Executor() {
         boolean thrownFromDelegate = true;

         @Override
         public void execute(final Runnable var1x) {
            try {
               var0.execute(new Runnable() {
                  @Override
                  public void run() {
                     thrownFromDelegate = false;
                     var1x.run();
                  }

                  @Override
                  public String toString() {
                     return var1x.toString();
                  }
               });
            } catch (RejectedExecutionException var3) {
               if (this.thrownFromDelegate) {
                  var1.setException(var3);
               }
            }
         }
      };
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final class CRRRICCRROCOHHOHIICIHORCOORRRH
      extends OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.HHCCIRHCCCIIRHCROHIORHIRHHIORH
      implements CCHHCIRHICHHHHRRIHIORCCORCCIHR {
      final ScheduledExecutorService IICCCORRHOHIRROCIRIIHOICRRRCIC;

      CRRRICCRROCOHHOHIICIHORCOORRRH(ScheduledExecutorService var1) {
         super(var1);
         this.IICCCORRHOHIRROCIRIIHOICRRRCIC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runnable var1, long var2, TimeUnit var4) {
         HIHHOCRHHRORRHHRORRRIIHHORIHOC var5 = HIHHOCRHHRORRHHRORRRIIHHORIHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1, null);
         ScheduledFuture var6 = this.IICCCORRHOHIRROCIRIIHOICRRRCIC.schedule(var5, var2, var4);
         return new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5, var6);
      }

      @Override
      public <V> RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Callable<V> var1, long var2, TimeUnit var4) {
         HIHHOCRHHRORRHHRORRRIIHHORIHOC var5 = HIHHOCRHHRORRHHRORRRIIHHORIHOC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
         ScheduledFuture var6 = this.IICCCORRHOHIRROCIRIIHOICRRRCIC.schedule(var5, var2, var4);
         return new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var5, var6);
      }

      @Override
      public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runnable var1, long var2, long var4, TimeUnit var6) {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var1
         );
         ScheduledFuture var8 = this.IICCCORRHOHIRROCIRIIHOICRRRCIC.scheduleAtFixedRate(var7, var2, var4, var6);
         return new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var7, var8);
      }

      @Override
      public RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<?> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Runnable var1, long var2, long var4, TimeUnit var6) {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var7 = new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
            var1
         );
         ScheduledFuture var8 = this.IICCCORRHOHIRROCIRIIHOICRRRCIC.scheduleWithFixedDelay(var7, var2, var4, var6);
         return new OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var7, var8);
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
      private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH
         extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CORCOCICIRIOHROHROIIOOHICCHCRR<Void>
         implements Runnable {
         private final Runnable OICHHHIIIIRHRRRIHIHCIRRRRIHIRO;

         public IRCIIHHICIHRCOCRROCOICRIHHCCHH(Runnable var1) {
            this.OICHHHIIIIRHRRRIHIHCIRRRRIHIRO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            );
         }

         @Override
         public void run() {
            try {
               this.OICHHHIIIIRHRRRIHIHCIRRRRIHIRO.run();
            } catch (Throwable var2) {
               this.setException(var2);
               throw com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHROHHHCIHHCOHCOORCRIHHIICROR.propagate(
                  var2
               );
            }
         }
      }

      private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>
         extends ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V>
         implements RHRRHOHCRCHCCRRHOHHIRCCHOCICHC<V> {
         private final ScheduledFuture<?> RRCHOROHHRCCOOHRIHCCOIICIRHRIO;

         public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCCCROCHCICCROHCOCCRRROCIIHCCH<V> var1, ScheduledFuture<?> var2) {
            super(var1);
            this.RRCHOROHHRCCOOHRIHCCOIICIRHRIO = var2;
         }

         @Override
         public boolean cancel(boolean var1) {
            boolean var2 = super.cancel(var1);
            if (var2) {
               this.RRCHOROHHRCCOOHRIHCCOIICIRHRIO.cancel(var1);
            }

            return var2;
         }

         @Override
         public long getDelay(TimeUnit var1) {
            return this.RRCHOROHHRCCOOHRIHCCOIICIRHRIO.getDelay(var1);
         }

         public int compareTo(Delayed var1) {
            return this.RRCHOROHHRCCOOHRIHCCOIICIRHRIO.compareTo(var1);
         }
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends RRCRRCORICCHOHHIRCHIROOHIIOHCO {
      private final ExecutorService IORHRHRRIOCHRICOCOOHICRHRHIORC;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(ExecutorService var1) {
         this.IORHRHRRIOCHRICOCOOHICRHRHIORC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      public final boolean awaitTermination(long var1, TimeUnit var3) {
         return this.IORHRHRRIOCHRICOCOOHICRHRHIORC.awaitTermination(var1, var3);
      }

      @Override
      public final boolean isShutdown() {
         return this.IORHRHRRIOCHRICOCOOHICRHRHIORC.isShutdown();
      }

      @Override
      public final boolean isTerminated() {
         return this.IORHRHRRIOCHRICOCOOHICRHRHIORC.isTerminated();
      }

      @Override
      public final void shutdown() {
         this.IORHRHRRIOCHRICOCOOHICRHRHIORC.shutdown();
      }

      @Override
      public final List<Runnable> shutdownNow() {
         return this.IORHRHRRIOCHRICOCOOHICRHRHIORC.shutdownNow();
      }

      @Override
      public final void execute(Runnable var1) {
         this.IORHRHRRIOCHRICOCOOHICRHRHIORC.execute(var1);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends RRCRRCORICCHOHHIRCHIROOHIIOHCO {
      private final Object RHHCORRHROOCCRHCROHCRRCHRHIHCR = new Object();
      @GuardedBy("lock")
      private int runningTasks = 0;
      @GuardedBy("lock")
      private boolean shutdown = false;

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      }

      @Override
      public void execute(Runnable var1) {
         this.startTask();

         try {
            var1.run();
         } finally {
            this.endTask();
         }
      }

      @Override
      public boolean isShutdown() {
         synchronized (this.RHHCORRHROOCCRHCROHCRRCHRHIHCR) {
            return this.shutdown;
         }
      }

      @Override
      public void shutdown() {
         synchronized (this.RHHCORRHROOCCRHCROHCRRCHRHIHCR) {
            this.shutdown = true;
            if (this.runningTasks == 0) {
               this.RHHCORRHROOCCRHCROHCRRCHRHIHCR.notifyAll();
            }
         }
      }

      @Override
      public List<Runnable> shutdownNow() {
         this.shutdown();
         return Collections.emptyList();
      }

      @Override
      public boolean isTerminated() {
         synchronized (this.RHHCORRHROOCCRHCROHCRRCHRHIHCR) {
            return this.shutdown && this.runningTasks == 0;
         }
      }

      @Override
      public boolean awaitTermination(long var1, TimeUnit var3) {
         long var4 = var3.toNanos(var1);
         synchronized (this.RHHCORRHROOCCRHCROHCRRCHRHIHCR) {
            while (!this.shutdown || this.runningTasks != 0) {
               if (var4 <= 0L) {
                  return false;
               }

               long var7 = System.nanoTime();
               TimeUnit.NANOSECONDS.timedWait(this.RHHCORRHROOCCRHCROHCRRCHRHIHCR, var4);
               var4 -= System.nanoTime() - var7;
            }

            return true;
         }
      }

      private void startTask() {
         synchronized (this.RHHCORRHROOCCRHCROHCRRCHRHIHCR) {
            if (this.shutdown) {
               throw new RejectedExecutionException("Executor already shutdown");
            }

            this.runningTasks++;
         }
      }

      private void endTask() {
         synchronized (this.RHHCORRHROOCCRHCROHCRRCHRHIHCR) {
            int var2 = --this.runningTasks;
            if (var2 == 0) {
               this.RHHCORRHROOCCRHCROHCRRCHRHIHCR.notifyAll();
            }
         }
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      final ExecutorService RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ThreadPoolExecutor var1, long var2, TimeUnit var4) {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.useDaemonThreadFactory(var1);
         ExecutorService var5 = Executors.unconfigurableExecutorService(var1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((ExecutorService)var1, var2, var4);
         return var5;
      }

      final ExecutorService RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ThreadPoolExecutor var1) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 120L, TimeUnit.SECONDS);
      }

      final ScheduledExecutorService RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ScheduledThreadPoolExecutor var1, long var2, TimeUnit var4) {
         OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.useDaemonThreadFactory(var1);
         ScheduledExecutorService var5 = Executors.unconfigurableScheduledExecutorService(var1);
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((ExecutorService)var1, var2, var4);
         return var5;
      }

      final ScheduledExecutorService RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ScheduledThreadPoolExecutor var1) {
         return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 120L, TimeUnit.SECONDS);
      }

      final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(final ExecutorService var1, final long var2, final TimeUnit var4) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var4
         );
         this.addShutdownHook(OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.newThread("DelayedShutdownHook-for-" + var1, new Runnable() {
            @Override
            public void run() {
               try {
                  var1.shutdown();
                  var1.awaitTermination(var2, var4);
               } catch (InterruptedException var2x) {
               }
            }
         }));
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
      void addShutdownHook(Thread var1) {
         Runtime.getRuntime().addShutdownHook(var1);
      }
   }
}
