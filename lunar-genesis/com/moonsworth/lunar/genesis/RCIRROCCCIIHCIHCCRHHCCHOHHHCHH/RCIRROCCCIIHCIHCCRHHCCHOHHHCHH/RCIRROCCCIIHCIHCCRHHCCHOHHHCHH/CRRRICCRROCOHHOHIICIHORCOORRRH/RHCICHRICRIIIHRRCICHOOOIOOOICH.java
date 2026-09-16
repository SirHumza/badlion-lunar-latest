package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
class RHCICHRICRIIIHRRCICHOOOIOOOICH<R, C, V> extends HIORIIIIOCCCRCHCOROROCCOIOOIIR<R, C, V> implements RRCROCCRIOIROHCCRCCIORICOCIOHC<R, C, V> {
   private static final long CHCIIHRCRORRRRIRCOOCHHOHIHCHRI = 0L;

   RHCICHRICRIIIHRRCICHOOOIOOOICH(
      SortedMap<R, Map<C, V>> var1,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCHRIROHHHCORIOCROOCHRCIOROOCI<? extends Map<C, V>> var2
   ) {
      super(var1, var2);
   }

   private SortedMap<R, Map<C, V>> sortedBackingMap() {
      return (SortedMap<R, Map<C, V>>)this.CORCIIICICCIRRRCCIHOOIORHOORHH;
   }

   @Override
   public SortedSet<R> rowKeySet() {
      return (SortedSet<R>)this.rowMap().keySet();
   }

   @Override
   public SortedMap<R, Map<C, V>> rowMap() {
      return (SortedMap<R, Map<C, V>>)super.rowMap();
   }

   SortedMap<R, Map<C, V>> createRowMap() {
      return new RHCICHRICRIIIHRRCICHOOOIOOOICH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   private class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
      extends HIORIIIIOCCCRCHCOROROCCOIOOIIR<R, C, V>.HRCHROOHRIHCRCRHRIIROCIRHOIRHH
      implements SortedMap<R, Map<C, V>> {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      public SortedSet<R> keySet() {
         return (SortedSet<R>)super.keySet();
      }

      SortedSet<R> createKeySet() {
         return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC<>(this);
      }

      @Override
      public Comparator<? super R> comparator() {
         return RHCICHRICRIIIHRRCICHOOOIOOOICH.this.sortedBackingMap().comparator();
      }

      @Override
      public R firstKey() {
         return RHCICHRICRIIIHRRCICHOOOIOOOICH.this.sortedBackingMap().firstKey();
      }

      @Override
      public R lastKey() {
         return RHCICHRICRIIIHRRCICHOOOIOOOICH.this.sortedBackingMap().lastKey();
      }

      @Override
      public SortedMap<R, Map<C, V>> headMap(R var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return new RHCICHRICRIIIHRRCICHOOOIOOOICH<>(
               RHCICHRICRIIIHRRCICHOOOIOOOICH.this.sortedBackingMap().headMap((R)var1), RHCICHRICRIIIHRRCICHOOOIOOOICH.this.OIOHIIRCCRHCICHHOCCHRHHOHHRORH
            )
            .rowMap();
      }

      @Override
      public SortedMap<R, Map<C, V>> subMap(R var1, R var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
         return new RHCICHRICRIIIHRRCICHOOOIOOOICH<>(
               RHCICHRICRIIIHRRCICHOOOIOOOICH.this.sortedBackingMap().subMap((R)var1, (R)var2),
               RHCICHRICRIIIHRRCICHOOOIOOOICH.this.OIOHIIRCCRHCICHHOCCHRHHOHHRORH
            )
            .rowMap();
      }

      @Override
      public SortedMap<R, Map<C, V>> tailMap(R var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         return new RHCICHRICRIIIHRRCICHOOOIOOOICH<>(
               RHCICHRICRIIIHRRCICHOOOIOOOICH.this.sortedBackingMap().tailMap((R)var1), RHCICHRICRIIIHRRCICHOOOIOOOICH.this.OIOHIIRCCRHCICHHOCCHRHHOHHRORH
            )
            .rowMap();
      }
   }
}
