package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.time.Duration;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class RICRIHOOHROHICCHHIIHRHCORHIOHR {
   private final RICRIHOOHROHICCHHIIHRHCORHIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HIIOICCHCORHIHOIRIROCIRRCIOOHI;
   private volatile @Nullable Object mutexDoNotUseDirectly;

   public static RICRIHOOHROHICCHHIIHRHCORHIOHR RCOCOHHCOOICCICCRCCORORROHRCCC(double var0) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, RICRIHOOHROHICCHHIIHRHCORHIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCRCIHCOIIRCRCHIOROCRCICOHORR());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static RICRIHOOHROHICCHHIIHRHCORHIOHR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var0, RICRIHOOHROHICCHHIIHRHCORHIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2) {
      HOIHOROOIOOCOIHCRIRIRIRRICIIHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new HOIHOROOIOOCOIHCRIRIRIRRICIIHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var2, 1.0);
      var3.IORRORCRRHRRORHIRHRROHCRRIHRII(var0);
      return var3;
   }

   public static RICRIHOOHROHICCHHIIHRHCORHIOHR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var0, Duration var2) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   public static RICRIHOOHROHICCHHIIHRHCORHIOHR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(double var0, long var2, TimeUnit var4) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2 >= 0L, "warmupPeriod must not be negative: %s", var2
      );
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0, var2, var4, 3.0, RICRIHOOHROHICCHHIIHRHCORHIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCRCIHCOIIRCRCHIOROCRCICOHORR()
      );
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static RICRIHOOHROHICCHHIIHRHCORHIOHR RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      double var0, long var2, TimeUnit var4, double var5, RICRIHOOHROHICCHHIIHRHCORHIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var7
   ) {
      HOIHOROOIOOCOIHCRIRIRIRRICIIHC.IRCIIHHICIHRCOCRROCOICRIHHCCHH var8 = new HOIHOROOIOOCOIHCRIRIRIRRICIIHC.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         var7, var2, var4, var5
      );
      var8.IORRORCRRHRRORHIRHRROHCRRIHRII(var0);
      return var8;
   }

   private Object mutex() {
      Object var1 = this.mutexDoNotUseDirectly;
      if (var1 == null) {
         synchronized (this) {
            var1 = this.mutexDoNotUseDirectly;
            if (var1 == null) {
               this.mutexDoNotUseDirectly = var1 = new Object();
            }
         }
      }

      return var1;
   }

   RICRIHOOHROHICCHHIIHRHCORHIOHR(RICRIHOOHROHICCHHIIHRHCORHIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1) {
      this.HIIOICCHCORHIHOIRIROCIRRCIOOHI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   public final void IORRORCRRHRRORHIRHRROHCRRIHRII(double var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 > 0.0 && !Double.isNaN(var1), "rate must be positive"
      );
      synchronized (this.mutex()) {
         this.doSetRate(var1, this.HIIOICCHCORHIHOIRIROCIRRCIOOHI.readMicros());
      }
   }

   abstract void doSetRate(double var1, long var3);

   public final double ROHIIHRRCORIIHHIRIIIOHHOHIHIRI() {
      synchronized (this.mutex()) {
         return this.doGetRate();
      }
   }

   abstract double doGetRate();

   @CanIgnoreReturnValue
   public double acquire() {
      return this.acquire(1);
   }

   @CanIgnoreReturnValue
   public double acquire(int var1) {
      long var2 = this.OHCIHICCRCICIOCOOORIICOOROHOHC(var1);
      this.HIIOICCHCORHIHOIRIROCIRRCIOOHI.sleepMicrosUninterruptibly(var2);
      return 1.0 * var2 / TimeUnit.SECONDS.toMicros(1L);
   }

   final long OHCIHICCRCICIOCOOORIICOOROHOHC(int var1) {
      checkPermits(var1);
      synchronized (this.mutex()) {
         return this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, this.HIIOICCHCORHIHOIRIROCIRRCIOOHI.readMicros());
      }
   }

   public boolean tryAcquire(Duration var1) {
      return this.tryAcquire(1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var1), TimeUnit.NANOSECONDS);
   }

   public boolean tryAcquire(long var1, TimeUnit var3) {
      return this.tryAcquire(1, var1, var3);
   }

   public boolean tryAcquire(int var1) {
      return this.tryAcquire(var1, 0L, TimeUnit.MICROSECONDS);
   }

   public boolean tryAcquire() {
      return this.tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
   }

   public boolean tryAcquire(int var1, Duration var2) {
      return this.tryAcquire(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   public boolean tryAcquire(int var1, long var2, TimeUnit var4) {
      long var5 = Math.max(var4.toMicros(var2), 0L);
      checkPermits(var1);
      long var7;
      synchronized (this.mutex()) {
         long var10 = this.HIIOICCHCORHIHOIRIROCIRRCIOOHI.readMicros();
         if (!this.canAcquire(var10, var5)) {
            return false;
         }

         var7 = this.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(var1, var10);
      }

      this.HIIOICCHCORHIHOIRIROCIRRCIOOHI.sleepMicrosUninterruptibly(var7);
      return true;
   }

   private boolean canAcquire(long var1, long var3) {
      return this.queryEarliestAvailable(var1) - var3 <= var1;
   }

   final long RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(int var1, long var2) {
      long var4 = this.reserveEarliestAvailable(var1, var2);
      return Math.max(var4 - var2, 0L);
   }

   abstract long queryEarliestAvailable(long var1);

   abstract long reserveEarliestAvailable(int var1, long var2);

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", this.ROHIIHRRCORIIHHIRIIIOHHOHIHIRI());
   }

   private static void checkPermits(int var0) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var0 > 0, "Requested permits (%s) must be positive", var0
      );
   }

   abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      protected abstract long readMicros();

      protected abstract void sleepMicrosUninterruptibly(long var1);

      public static RICRIHOOHROHICCHHIIHRHCORHIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCRCIHCOIIRCRCHIOROCRCICOHORR() {
         return new RICRIHOOHROHICCHHIIHRHCORHIOHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
            final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH HOCIHORCHORHCCHRIOHRIIOHRHIRIH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHIIIOHIRIRCCRRIOIICCHHIORRHOH.HHCOOCIHIHOCCOCCCCHIIIROROOORH();

            @Override
            protected long readMicros() {
               return this.HOCIHORCHORHCCHRIOHRIIOHRHIRIH.elapsed(TimeUnit.MICROSECONDS);
            }

            @Override
            protected void sleepMicrosUninterruptibly(long var1) {
               if (var1 > 0L) {
                  IIHHICHCCCOHCHROIRIHICCHHOROCR.sleepUninterruptibly(var1, TimeUnit.MICROSECONDS);
               }
            }
         };
      }
   }
}
