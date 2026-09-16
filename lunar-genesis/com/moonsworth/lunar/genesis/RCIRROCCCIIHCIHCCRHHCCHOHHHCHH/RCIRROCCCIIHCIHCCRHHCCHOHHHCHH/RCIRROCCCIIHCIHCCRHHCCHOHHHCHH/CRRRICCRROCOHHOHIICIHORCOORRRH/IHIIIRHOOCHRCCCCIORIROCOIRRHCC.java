package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public final class IHIIIRHOOCHRCCCCIORIROCOIRRHCC<E> extends ROHHHCHRIHHOOHCHIIIHOOCIIRROIO<E> implements Serializable {
   private final Queue<E> OHIRIIHHHIIRRICOROOCIOCIIHOOOH;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   final int HHORICRCHCRHOCRHICIROHORCHROOR;
   private static final long CCCHRROROCIICCIOHOOOHHROOHROHH = 0L;

   private IHIIIRHOOCHRCCCCIORIROCOIRRHCC(int var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 >= 0, "maxSize (%s) must >= 0", var1
      );
      this.OHIRIIHHHIIRRICOROOCIOCIIHOOOH = new ArrayDeque<>(var1);
      this.HHORICRCHCRHOCRHICIROHORCHROOR = var1;
   }

   public static <E> IHIIIRHOOCHRCCCCIORIROCOIRRHCC<E> CCHCIRORCRCCICIHRCIIIHIIRCRHRC(int var0) {
      return new IHIIIRHOOCHRCCCCIORIROCOIRRHCC<>(var0);
   }

   public int remainingCapacity() {
      return this.HHORICRCHCRHOCRHICIROHORCHROOR - this.size();
   }

   @Override
   protected Queue<E> delegate() {
      return this.OHIRIIHHHIIRRICOROOCIOCIIHOOOH;
   }

   @CanIgnoreReturnValue
   @Override
   public boolean offer(E var1) {
      return this.add((E)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean add(E var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      if (this.HHORICRCHCRHOCRHICIROHORCHROOR == 0) {
         return true;
      }

      if (this.size() == this.HHORICRCHCRHOCRHICIROHORCHROOR) {
         this.OHIRIIHHHIIRRICOROOCIOCIIHOOOH.remove();
      }

      this.OHIRIIHHHIIRRICOROOCIOCIIHOOOH.add((E)var1);
      return true;
   }

   @CanIgnoreReturnValue
   @Override
   public boolean addAll(Collection<? extends E> var1) {
      int var2 = var1.size();
      if (var2 >= this.HHORICRCHCRHOCRHICIROHORCHROOR) {
         this.clear();
         return IRIHOIRCHIRRCRIOORCOICORHHORHH.addAll(this, IRIHOIRCHIRRCRIOORCOICORHHORHH.skip(var1, var2 - this.HHORICRCHCRHOCRHICIROHORCHROOR));
      } else {
         return this.standardAddAll(var1);
      }
   }

   @Override
   public boolean contains(Object var1) {
      return this.delegate()
         .contains(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            )
         );
   }

   @CanIgnoreReturnValue
   @Override
   public boolean remove(Object var1) {
      return this.delegate()
         .remove(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
               var1
            )
         );
   }
}
