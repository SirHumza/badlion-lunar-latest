package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
public final class OHIIIOHIRIRCCRRIOIICCHHIORRHOH {
   private final RORCHCIIICOHIRROOORHOCCCCIOCCI ROROIRIIHHHIHHCOHIRORRCRCOIIHC;
   private boolean isRunning;
   private long elapsedNanos;
   private long startTick;

   public static OHIIIOHIRIRCCRRIOIICCHHIORRHOH ROORIRCCRRHRIHOCCOCRHCRCCIOCHO() {
      return new OHIIIOHIRIRCCRRIOIICCHHIORRHOH();
   }

   public static OHIIIOHIRIRCCRRIOIICCHHIORRHOH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var0) {
      return new OHIIIOHIRIRCCRRIOIICCHHIORRHOH(var0);
   }

   public static OHIIIOHIRIRCCRRIOIICCHHIORRHOH HHCOOCIHIHOCCOCCCCHIIIROROOORH() {
      return new OHIIIOHIRIRCCRRIOIICCHHIORRHOH().COCROICROCIHCICOOIRIHIIRIOHHHI();
   }

   public static OHIIIOHIRIRCCRRIOIICCHHIORRHOH IRCIIHHICIHRCOCRROCOICRIHHCCHH(RORCHCIIICOHIRROOORHOCCCCIOCCI var0) {
      return new OHIIIOHIRIRCCRRIOIICCHHIORRHOH(var0).COCROICROCIHCICOOIRIHIIRIOHHHI();
   }

   OHIIIOHIRIRCCRRIOIICCHHIORRHOH() {
      this.ROROIRIIHHHIHHCOHIRORRCRCOIIHC = RORCHCIIICOHIRROOORHOCCCCIOCCI.CRHCOORHOHHCHHHCIHOCHORCOOIIRI();
   }

   OHIIIOHIRIRCCRRIOIICCHHIORRHOH(RORCHCIIICOHIRROOORHOCCCCIOCCI var1) {
      this.ROROIRIIHHHIHHCOHIRORRCRCOIIHC = IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(var1, "ticker");
   }

   public boolean isRunning() {
      return this.isRunning;
   }

   @CanIgnoreReturnValue
   public OHIIIOHIRIRCCRRIOIICCHHIORRHOH COCROICROCIHCICOOIRIHIIRIOHHHI() {
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(!this.isRunning, "This stopwatch is already running.");
      this.isRunning = true;
      this.startTick = this.ROROIRIIHHHIHHCOHIRORRCRCOIIHC.read();
      return this;
   }

   @CanIgnoreReturnValue
   public OHIIIOHIRIRCCRRIOIICCHHIORRHOH ROOCRIHOIRRCROCCOOIHIHHRROHIIH() {
      long var1 = this.ROROIRIIHHHIHHCOHIRORRCRCOIIHC.read();
      IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(this.isRunning, "This stopwatch is already stopped.");
      this.isRunning = false;
      this.elapsedNanos = this.elapsedNanos + (var1 - this.startTick);
      return this;
   }

   @CanIgnoreReturnValue
   public OHIIIOHIRIRCCRRIOIICCHHIORRHOH OOCOICIICCCOHCRCOOOCICOHRCRIRR() {
      this.elapsedNanos = 0L;
      this.isRunning = false;
      return this;
   }

   private long elapsedNanos() {
      return this.isRunning ? this.ROROIRIIHHHIHHCOHIRORRCRCOIIHC.read() - this.startTick + this.elapsedNanos : this.elapsedNanos;
   }

   public long elapsed(TimeUnit var1) {
      return var1.convert(this.elapsedNanos(), TimeUnit.NANOSECONDS);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   public Duration elapsed() {
      return Duration.ofNanos(this.elapsedNanos());
   }

   @Override
   public String toString() {
      long var1 = this.elapsedNanos();
      TimeUnit var3 = chooseUnit(var1);
      double var4 = (double)var1 / TimeUnit.NANOSECONDS.convert(1L, var3);
      return ICICIOCHHHIHOCHCOHORIHRCOHHOCR.formatCompact4Digits(var4) + " " + abbreviate(var3);
   }

   private static TimeUnit chooseUnit(long var0) {
      if (TimeUnit.DAYS.convert(var0, TimeUnit.NANOSECONDS) > 0L) {
         return TimeUnit.DAYS;
      } else if (TimeUnit.HOURS.convert(var0, TimeUnit.NANOSECONDS) > 0L) {
         return TimeUnit.HOURS;
      } else if (TimeUnit.MINUTES.convert(var0, TimeUnit.NANOSECONDS) > 0L) {
         return TimeUnit.MINUTES;
      } else if (TimeUnit.SECONDS.convert(var0, TimeUnit.NANOSECONDS) > 0L) {
         return TimeUnit.SECONDS;
      } else if (TimeUnit.MILLISECONDS.convert(var0, TimeUnit.NANOSECONDS) > 0L) {
         return TimeUnit.MILLISECONDS;
      } else {
         return TimeUnit.MICROSECONDS.convert(var0, TimeUnit.NANOSECONDS) > 0L ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
      }
   }

   private static String abbreviate(TimeUnit var0) {
      switch (var0) {
         case NANOSECONDS:
            return "ns";
         case MICROSECONDS:
            return "μs";
         case MILLISECONDS:
            return "ms";
         case SECONDS:
            return "s";
         case MINUTES:
            return "min";
         case HOURS:
            return "h";
         case DAYS:
            return "d";
         default:
            throw new AssertionError();
      }
   }
}
