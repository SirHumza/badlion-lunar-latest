package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.time.Duration;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@DoNotMock("Use FakeTimeLimiter")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public interface RHRIIOOOCRHIIOORCOCRCHRCCRRCIH {
   <T> T newProxy(T var1, Class<T> var2, long var3, TimeUnit var5);

   default <T> T newProxy(T var1, Class<T> var2, Duration var3) {
      return this.newProxy((T)var1, var2, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var3), TimeUnit.NANOSECONDS);
   }

   @CanIgnoreReturnValue
   <T> T callWithTimeout(Callable<T> var1, long var2, TimeUnit var4);

   @CanIgnoreReturnValue
   default <T> T callWithTimeout(Callable<T> var1, Duration var2) {
      return this.callWithTimeout(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   @CanIgnoreReturnValue
   <T> T callUninterruptiblyWithTimeout(Callable<T> var1, long var2, TimeUnit var4);

   @CanIgnoreReturnValue
   default <T> T callUninterruptiblyWithTimeout(Callable<T> var1, Duration var2) {
      return this.callUninterruptiblyWithTimeout(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   void runWithTimeout(Runnable var1, long var2, TimeUnit var4);

   default void runWithTimeout(Runnable var1, Duration var2) {
      this.runWithTimeout(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }

   void runUninterruptiblyWithTimeout(Runnable var1, long var2, TimeUnit var4);

   default void runUninterruptiblyWithTimeout(Runnable var1, Duration var2) {
      this.runUninterruptiblyWithTimeout(var1, IOHHOIIOCRHCHHCRORICCOHOHROOIH.toNanosSaturated(var2), TimeUnit.NANOSECONDS);
   }
}
