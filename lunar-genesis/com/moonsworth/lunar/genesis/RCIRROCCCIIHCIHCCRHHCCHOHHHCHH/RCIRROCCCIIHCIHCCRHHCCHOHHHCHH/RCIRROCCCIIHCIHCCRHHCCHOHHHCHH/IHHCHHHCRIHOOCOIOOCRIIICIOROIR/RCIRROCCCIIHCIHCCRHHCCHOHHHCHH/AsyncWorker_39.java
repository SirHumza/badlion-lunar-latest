package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
final class RRHOOOORORHHOOIHRCCHIIHHIIIIOH<V> extends ORHIOICIOCRRHOOCOHRORIHICHRCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> {
   private @Nullable RCCCROCHCICCROHCOCCRRROCIIHCCH<V> RHHICHICHOCROCHRIHRHIIHIHOHHHC;
   private @Nullable ScheduledFuture<?> timer;

   static <V> RCCCROCHCICCROHCOCCRRROCIIHCCH<V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      RCCCROCHCICCROHCOCCRRROCIIHCCH<V> var0, long var1, TimeUnit var3, ScheduledExecutorService var4
   ) {
      RRHOOOORORHHOOIHRCCHIIHHIIIIOH var5 = new RRHOOOORORHHOOIHRCCHIIHHIIIIOH(var0);
      RRHOOOORORHHOOIHRCCHIIHHIIIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 = new RRHOOOORORHHOOIHRCCHIIHHIIIIOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var5);
      var5.timer = var4.schedule(var6, var1, var3);
      var0.addListener(var6, OHCIIOCHHOHOHCOHHCRRHHCRHOIICC.directExecutor());
      return var5;
   }

   private RRHOOOORORHHOOIHRCCHIIHHIIIIOH(RCCCROCHCICCROHCOCCRRROCIIHCCH<V> var1) {
      this.RHHICHICHOCROCHRIHRHIIHIHOHHHC = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   @Override
   protected String pendingToString() {
      RCCCROCHCICCROHCOCCRRROCIIHCCH var1 = this.RHHICHICHOCROCHRIHRHIIHIHOHHHC;
      ScheduledFuture var2 = this.timer;
      if (var1 != null) {
         String var3 = "inputFuture=[" + var1 + "]";
         if (var2 != null) {
            long var4 = var2.getDelay(TimeUnit.MILLISECONDS);
            if (var4 > 0L) {
               var3 = var3 + ", remaining delay=[" + var4 + " ms]";
            }
         }

         return var3;
      } else {
         return null;
      }
   }

   @Override
   protected void afterDone() {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this.RHHICHICHOCROCHRIHRHIIHIHOHHHC);
      ScheduledFuture var1 = this.timer;
      if (var1 != null) {
         var1.cancel(false);
      }

      this.RHHICHICHOCROCHRIHRHIIHIHOHHHC = null;
      this.timer = null;
   }

   private static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends TimeoutException {
      private IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var1) {
         super(var1);
      }

      @Override
      public synchronized Throwable fillInStackTrace() {
         this.setStackTrace(new StackTraceElement[0]);
         return this;
      }
   }

   private static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> implements Runnable {
      @Nullable RRHOOOORORHHOOIHRCCHIIHHIIIIOH<V> ICIIOICRHIIRRCHIRRRROIRCCHOHHC;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRHOOOORORHHOOIHRCCHIIHHIIIIOH<V> var1) {
         this.ICIIOICRHIIRRCHIRRRROIRCCHOHHC = var1;
      }

      @Override
      public void run() {
         RRHOOOORORHHOOIHRCCHIIHHIIIIOH var1 = this.ICIIOICRHIIRRCHIRRRROIRCCHOHHC;
         if (var1 != null) {
            RCCCROCHCICCROHCOCCRRROCIIHCCH var2 = var1.RHHICHICHOCROCHRIHRHIIHIHOHHHC;
            if (var2 != null) {
               this.ICIIOICRHIIRRCHIRRRROIRCCHOHHC = null;
               if (var2.isDone()) {
                  var1.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2);
               } else {
                  try {
                     ScheduledFuture var3 = var1.timer;
                     var1.timer = null;
                     String var4 = "Timed out";

                     try {
                        if (var3 != null) {
                           long var5 = Math.abs(var3.getDelay(TimeUnit.MILLISECONDS));
                           if (var5 > 10L) {
                              var4 = var4 + " (timeout delayed by " + var5 + " ms after scheduled time)";
                           }
                        }

                        var4 = var4 + ": " + var2;
                     } finally {
                        var1.setException(new RRHOOOORORHHOOIHRCCHIIHHIIIIOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var4));
                     }
                  } finally {
                     var2.cancel(true);
                  }
               }
            }
         }
      }
   }
}
