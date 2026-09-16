package com.moonsworth.lunar.client.util;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import lombok.Generated;

public final class ORCOCORROHIROCCIORORRRRCHIOOCH {
   private static final ScheduledExecutorService IHCHROCCCRCRRROCIHOIHOOHOHOOHR = OIRIHRCCIRICOCHICOIHIOCRCIHIOR();
   private static final ThreadPoolExecutor RHHIIHIIOICIHHRHHHIOCIRRIOOROC = COIRORORROHHHCHOCRICHHORHRCOOR();
   private static final Executor OCRICRCHIHIROHIIOIRIIROCIHHICI = var0 -> {};
   private static final Executor IRCOOHOIHRCIHHCHCIOHOCIRRRIICO = Runnable::run;
   private static final Queue<ORCOCORROHIROCCIORORRRRCHIOOCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>> OHOCCOCOIIIIIOHOCHCCRCCCICIORH = new ConcurrentLinkedDeque<>();

   private static ScheduledExecutorService OIRIHRCCIRICOCHICOIHIOCRCIHIOR() {
      ThreadFactory var0 = new ThreadFactoryBuilder().setNameFormat("lunar-background-scheduler-task-%d").build();
      return new ScheduledThreadPoolExecutor(4, var0);
   }

   private static ThreadPoolExecutor COIRORORROHHHCHOCRICHHORHRCOOR() {
      ThreadFactory var0 = new ThreadFactoryBuilder().setNameFormat("lunar-background-task-%d").build();
      return new ThreadPoolExecutor(4, HICOHIOOCIOROCHIRCCCRCIIHCROOI(4), 5L, TimeUnit.MINUTES, new LinkedBlockingQueue<>(), var0);
   }

   private static int HICOHIOOCIOROCHIRCCCRCIIHCROOI(int var0) {
      int var1 = Runtime.getRuntime().availableProcessors();
      return Math.max(var0, var1 / 2);
   }

   public static void tick() {
      Iterator var0 = OHOCCOCOIIIIIOHOCHCCRCCCICIORH.iterator();

      while (var0.hasNext()) {
         ORCOCORROHIROCCIORORRRRCHIOOCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = (ORCOCORROHIROCCIORORRRRCHIOOCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0.next();
         if (var1.IHCOIHOCOHOOHOIRHIOIIHHCIIRHCH.isCancelled()) {
            var0.remove();
         } else {
            Object var2 = null;
            Throwable var3 = null;
            if (var1.counter <= 0) {
               try {
                  var2 = var1.CIOCCIIHICOOCRCRROIHIOOCRORCCO.get();
               } catch (Throwable var5) {
                  var3 = var5;
               }

               var1.counter = var1.HCICHICHHIHRCICCROORCCOOOORHRI;
            }

            if (var1.counter <= 0) {
               if (var3 != null) {
                  var1.IHCOIHOCOHOOHOIRHIOIIHHCIIRHCH.completeExceptionally(var3);
               } else {
                  var1.IHCOIHOCOHOOHOIRHIOIIHHCIIRHCH.complete(var2);
               }

               var0.remove();
            } else {
               var1.counter--;
            }
         }
      }
   }

   public static void shutdown() {
      IHCHROCCCRCRRROCIHOIHOOHOHOOHR.shutdown();
      if (!IHCHROCCCRCRRROCIHOIHOOHOHOOHR.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Took longer than 100ms to shut down background scheduler!"
         );
      }

      RHHIIHIIOICIHHRHHHIOCIRRIOOROC.shutdown();
      if (!RHHIIHIIOICIHHRHHHIOCIRRIOOROC.awaitTermination(100L, TimeUnit.MILLISECONDS)) {
         com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            "Took longer than 100ms to shut down background executor!"
         );
      }
   }

   public static void IOHHOIIOCRHCHHCRORICCOHOHROOIH(Runnable var0) {
      RHHIIHIIOICIHHRHHHIOCIRRIOOROC.execute(var0);
   }

   public static ScheduledExecutorService RHHHOORICOOIRHCRIOIRRIHHIIOIRI() {
      return IHCHROCCCRCRRROCIHOIHOOHOHOOHR;
   }

   public static ThreadPoolExecutor RHOHHCCOOIHIIRCORRRIORCRIIOHHI() {
      return RHHIIHIIOICIHHRHHHIOCIRRIOOROC;
   }

   public static void IIHRHCCOOHOOOOCHRRCOROOIOHCOOO(Runnable var0) {
      IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$submit(var0);
   }

   public static Executor ICOHCOIOCHHIRIHCCCRICHCCIOIORR() {
      return ORCOCORROHIROCCIORORRRRCHIOOCH::IIHRHCCOOHOOOOCHRRCOROOIOHCOOO;
   }

   public static Executor RCIHOCCIROCOIOOCCOHICRIIRIIROI(int var0) {
      return var1 -> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var0);
   }

   public static Executor IRCHRIHRIRCRCHOIRIOHIOCHCOIHOC() {
      return OCRICRCHIHIROHIIOIRIIROCIHHICI;
   }

   public static Executor directExecutor() {
      return IRCOOHOIHRCIHHCHCIOHOCIRRRIICO;
   }

   public static Future<Void> RHCHRCOCCOIIIHCHRHIRCORHRHRICR(Runnable var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 0);
   }

   public static <T> Future<T> RHRIIOOOCRHIIOORCOCRCHRCCRRCIH(Supplier<T> var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, 0);
   }

   public static Future<Void> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runnable var0, int var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, 0);
   }

   public static <T> Future<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Supplier<T> var0, int var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, 0);
   }

   public static Future<Void> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Runnable var0, int var1, int var2) {
      ORCOCORROHIROCCIORORRRRCHIOOCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new ORCOCORROHIROCCIORORRRRCHIOOCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(() -> {
         var0.run();
         return null;
      }, var1, var2);
      OHOCCOCOIIIIIOHOCHCCRCCCICIORH.add(var3);
      return var3.IHCOIHOCOHOOHOIRHIOIIHHCIIRHCH;
   }

   public static void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Future<?> var0) {
      OHOCCOCOIIIIIOHOCHCCRCCCICIORH.removeIf(var1 -> var1.IHCOIHOCOHOOHOIRHIOIIHHCIIRHCH == var0);
      var0.cancel(true);
   }

   public static <T> Future<T> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Supplier<T> var0, int var1, int var2) {
      ORCOCORROHIROCCIORORRRRCHIOOCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new ORCOCORROHIROCCIORORRRRCHIOOCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1, var2);
      OHOCCOCOIIIIIOHOCHCCRCCCICIORH.add(var3);
      return var3.IHCOIHOCOHOOHOIRHIOIIHHCIIRHCH;
   }

   public static boolean RCCCROCHCICCROHCOCCRRROCIIHCCH(Runnable var0) {
      if (!com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().ICCIRICOHOCCCICROHCRCIOHOIRIIC()
         )
       {
         ICOHCOIOCHHIRIHCCCRICHCCIOIORR().execute(var0);
         return false;
      } else {
         return true;
      }
   }

   public static void OOOOCCOOOHCHCIIHOIHCRIIOOROHRC(Runnable var0) {
      if (!com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHCHRCCRRHORIOCIOHHCRHCHICRIHH().ICCIRICOHOCCCICROHCRCIOHOIRIIC()
         )
       {
         ICOHCOIOCHHIRIHCCCRICHCCIOIORR().execute(var0);
      } else {
         var0.run();
      }
   }

   @Generated
   private ORCOCORROHIROCCIORORRRRCHIOOCH() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T> {
      private final CompletableFuture<T> IHCOIHOCOHOOHOIRHIOIIHHCIIRHCH = new CompletableFuture<>();
      private final Supplier<T> CIOCCIIHICOOCRCRROIHIOOCRORCCO;
      private final int HCICHICHHIHRCICCROORCCOOOORHRI;
      private int counter;

      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Supplier<T> var1, int var2, int var3) {
         this.CIOCCIIHICOOCRCRROIHIOOCRORCCO = var1;
         this.HCICHICHHIHRCICCROORCCOOOORHRI = var3;
         this.counter = var2;
      }
   }
}
