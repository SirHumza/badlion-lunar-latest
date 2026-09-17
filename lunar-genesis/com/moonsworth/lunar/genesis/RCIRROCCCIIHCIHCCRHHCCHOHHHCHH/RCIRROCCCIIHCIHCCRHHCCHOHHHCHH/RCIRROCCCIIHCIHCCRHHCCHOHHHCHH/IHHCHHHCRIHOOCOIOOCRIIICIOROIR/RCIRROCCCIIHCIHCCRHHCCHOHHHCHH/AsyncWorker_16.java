package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

@CanIgnoreReturnValue
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public final class RRORCOIRRIICOOICOIOCORHORCHCOC {
   private String nameFormat = null;
   private Boolean daemon = null;
   private Integer priority = null;
   private UncaughtExceptionHandler uncaughtExceptionHandler = null;
   private ThreadFactory backingThreadFactory = null;

   public RRORCOIRRIICOOICOIOCORHORCHCOC ROHIICRIRROCRHRHOOHORCIRHOIOII(String var1) {
      String var2 = format(var1, 0);
      this.nameFormat = var1;
      return this;
   }

   public RRORCOIRRIICOOICOIOCORHORCHCOC RCIRCOIRRRHCRRIIOCRRCIIIOHIHRC(boolean var1) {
      this.daemon = var1;
      return this;
   }

   public RRORCOIRRIICOOICOIOCORHORCHCOC HIIIHRROOCHRRRHORCIHOCORRRCOCR(int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 1, "Thread priority (%s) must be >= %s", var1, 1
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 <= 10, "Thread priority (%s) must be <= %s", var1, 10
      );
      this.priority = var1;
      return this;
   }

   public RRORCOIRRIICOOICOIOCORHORCHCOC RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(UncaughtExceptionHandler var1) {
      this.uncaughtExceptionHandler = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return this;
   }

   public RRORCOIRRIICOOICOIOCORHORCHCOC RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ThreadFactory var1) {
      this.backingThreadFactory = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      return this;
   }

   @CheckReturnValue
   public ThreadFactory build() {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this);
   }

   private static ThreadFactory RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRORCOIRRIICOOICOIOCORHORCHCOC var0) {
      final String var1 = var0.nameFormat;
      final Boolean var2 = var0.daemon;
      final Integer var3 = var0.priority;
      final UncaughtExceptionHandler var4 = var0.uncaughtExceptionHandler;
      final ThreadFactory var5 = var0.backingThreadFactory != null ? var0.backingThreadFactory : Executors.defaultThreadFactory();
      final AtomicLong var6 = var1 != null ? new AtomicLong(0L) : null;
      return new ThreadFactory() {
         @Override
         public Thread newThread(Runnable var1x) {
            Thread var2x = var5.newThread(var1x);
            if (var1 != null) {
               var2x.setName(RRORCOIRRIICOOICOIOCORHORCHCOC.format(var1, var6.getAndIncrement()));
            }

            if (var2 != null) {
               var2x.setDaemon(var2);
            }

            if (var3 != null) {
               var2x.setPriority(var3);
            }

            if (var4 != null) {
               var2x.setUncaughtExceptionHandler(var4);
            }

            return var2x;
         }
      };
   }

   private static String format(String var0, Object... var1) {
      return String.format(Locale.ROOT, var0, var1);
   }
}
