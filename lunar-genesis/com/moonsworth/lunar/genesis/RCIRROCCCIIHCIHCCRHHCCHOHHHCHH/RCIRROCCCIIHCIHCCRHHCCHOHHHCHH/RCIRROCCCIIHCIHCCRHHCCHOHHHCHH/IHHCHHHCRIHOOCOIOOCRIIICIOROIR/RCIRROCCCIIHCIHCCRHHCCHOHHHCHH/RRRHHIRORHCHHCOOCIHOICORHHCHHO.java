package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@CanIgnoreReturnValue
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
abstract class RRRHHIRORHCHHCOOCIHOICORHHCHHO extends IIIIRHIHROIRCROHHROIHIIHRCRRHO implements ScheduledExecutorService {
   final ScheduledExecutorService HRHHHHCRCOIOHCCIRIHIIROHOHCORO;

   protected RRRHHIRORHCHHCOOCIHOICORHHCHHO(ScheduledExecutorService var1) {
      super(var1);
      this.HRHHHHCRCOIOHCCIRIHIIROHOHCORO = var1;
   }

   @Override
   public final ScheduledFuture<?> schedule(Runnable var1, long var2, TimeUnit var4) {
      return this.HRHHHHCRCOIOHCCIRIHIIROHOHCORO.schedule(this.wrapTask(var1), var2, var4);
   }

   @Override
   public final <V> ScheduledFuture<V> schedule(Callable<V> var1, long var2, TimeUnit var4) {
      return this.HRHHHHCRCOIOHCCIRIHIIROHOHCORO.schedule(this.wrapTask(var1), var2, var4);
   }

   @Override
   public final ScheduledFuture<?> scheduleAtFixedRate(Runnable var1, long var2, long var4, TimeUnit var6) {
      return this.HRHHHHCRCOIOHCCIRIHIIROHOHCORO.scheduleAtFixedRate(this.wrapTask(var1), var2, var4, var6);
   }

   @Override
   public final ScheduledFuture<?> scheduleWithFixedDelay(Runnable var1, long var2, long var4, TimeUnit var6) {
      return this.HRHHHHCRCOIOHCCIRIHIIROHOHCORO.scheduleWithFixedDelay(this.wrapTask(var1), var2, var4, var6);
   }
}
