package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.ROHHHCHRIHHOOHCHIIIHOOCIIRROIO;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

@CanIgnoreReturnValue
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class IHCRORHRORIICHRHRCHRRIRRHHOCOO<E> extends ROHHHCHRIHHOOHCHIIIHOOCIIRROIO<E> implements BlockingQueue<E> {
   protected IHCRORHRORIICHRHRCHRRIRRHHOCOO() {
   }

   protected abstract BlockingQueue<E> delegate();

   @Override
   public int drainTo(Collection<? super E> var1, int var2) {
      return this.delegate().drainTo(var1, var2);
   }

   @Override
   public int drainTo(Collection<? super E> var1) {
      return this.delegate().drainTo(var1);
   }

   @Override
   public boolean offer(E var1, long var2, TimeUnit var4) {
      return this.delegate().offer((E)var1, var2, var4);
   }

   @Override
   public E poll(long var1, TimeUnit var3) {
      return this.delegate().poll(var1, var3);
   }

   @Override
   public void put(E var1) {
      this.delegate().put((E)var1);
   }

   @Override
   public int remainingCapacity() {
      return this.delegate().remainingCapacity();
   }

   @Override
   public E take() {
      return this.delegate().take();
   }
}
