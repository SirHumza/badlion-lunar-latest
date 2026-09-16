package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.COIRRRCIORROCHIROCHROCHICCICIC;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@CanIgnoreReturnValue
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
abstract class IIIIRHIHROIRCROHHROIHIIHRCRRHO implements ExecutorService {
   private final ExecutorService RCIRHRRCCHRHHIORICHHRIRRRRHCHI;

   protected IIIIRHIHROIRCROHHROIHIIHRCRRHO(ExecutorService var1) {
      this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
   }

   protected abstract <T> Callable<T> wrapTask(Callable<T> var1);

   protected Runnable wrapTask(Runnable var1) {
      final Callable var2 = this.wrapTask(Executors.callable(var1, null));
      return new Runnable() {
         @Override
         public void run() {
            try {
               var2.call();
            } catch (Exception var2x) {
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CRHROHHHCIHHCOHCOORCRIHHIICROR.throwIfUnchecked(
                  var2x
               );
               throw new RuntimeException(var2x);
            }
         }
      };
   }

   private <T> COIRRRCIORROCHIROCHROCHICCICIC<Callable<T>> OOCCRCRCOHIIORCCORCRCIRRROIOOR(Collection<? extends Callable<T>> var1) {
      COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = COIRRRCIORROCHIROCHROCHICCICIC.HOOCHHHRHCRIRHCIHIRIRCOICCOIOR();

      for (Callable var4 : var1) {
         var2.CCHHRHRHCRHIHIHRIOICROHCHIIIHI(this.wrapTask(var4));
      }

      return var2.IORRHROIIRHIIOOHCOOIRHOIHRHRHI();
   }

   @Override
   public final void execute(Runnable var1) {
      this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.execute(this.wrapTask(var1));
   }

   @Override
   public final <T> Future<T> submit(Callable<T> var1) {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI
         .submit(
            this.wrapTask(
               com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
                  var1
               )
            )
         );
   }

   @Override
   public final Future<?> submit(Runnable var1) {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.submit(this.wrapTask(var1));
   }

   @Override
   public final <T> Future<T> submit(Runnable var1, T var2) {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.submit(this.wrapTask(var1), (T)var2);
   }

   @Override
   public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> var1) {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.invokeAll(this.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var1));
   }

   @Override
   public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> var1, long var2, TimeUnit var4) {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.invokeAll(this.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var1), var2, var4);
   }

   @Override
   public final <T> T invokeAny(Collection<? extends Callable<T>> var1) {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.invokeAny(this.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var1));
   }

   @Override
   public final <T> T invokeAny(Collection<? extends Callable<T>> var1, long var2, TimeUnit var4) {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.invokeAny(this.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var1), var2, var4);
   }

   @Override
   public final void shutdown() {
      this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.shutdown();
   }

   @Override
   public final List<Runnable> shutdownNow() {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.shutdownNow();
   }

   @Override
   public final boolean isShutdown() {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.isShutdown();
   }

   @Override
   public final boolean isTerminated() {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.isTerminated();
   }

   @Override
   public final boolean awaitTermination(long var1, TimeUnit var3) {
      return this.RCIRHRRCCHRHHIORICHHRIRRRRHCHI.awaitTermination(var1, var3);
   }
}
