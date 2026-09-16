package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.HRHRORCIRICHCCCCCHICOOICIRHRIO;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@CanIgnoreReturnValue
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class OIHCOHRCICCCRHRCROOCIOIRRHHHIH<V> extends HRHRORCIRICHCCCCCHICOOICIRHRIO implements Future<V> {
   protected OIHCOHRCICCCRHRCROOCIOIRRHHHIH() {
   }

   protected abstract Future<? extends V> delegate();

   @Override
   public boolean cancel(boolean var1) {
      return this.delegate().cancel(var1);
   }

   @Override
   public boolean isCancelled() {
      return this.delegate().isCancelled();
   }

   @Override
   public boolean isDone() {
      return this.delegate().isDone();
   }

   @Override
   public V get() {
      return (V)this.delegate().get();
   }

   @Override
   public V get(long var1, TimeUnit var3) {
      return (V)this.delegate().get(var1, var3);
   }

   public abstract static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> extends OIHCOHRCICCCRHRCROOCIOIRRHHHIH<V> {
      private final Future<V> RRCICRRHOOCCHRCIHHROCRRHIHCHCI;

      protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Future<V> var1) {
         this.RRCICRRHOOCCHRCIHHROCRRHIHCHCI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
      }

      @Override
      protected final Future<V> delegate() {
         return this.RRCICRRHOOCCHRCIHHROCRRHIHCHCI;
      }
   }
}
