package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
class ORCOCORROHIROCCIORORRRRCHIOOCH<K, V> extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<K, V> implements OCCCRRHIIOCOIHRIIHOIRRCIORHHHI<K, V> {
   final CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> CORHHIROCHRORCOIHRCCCCOHHIRRHI;
   final com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> RHROORIOHOIHRHHHCOOOICHRRHHCOH;

   ORCOCORROHIROCCIORORRRRCHIOOCH(
      CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> var1,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> var2
   ) {
      this.CORHHIROCHRORCOIHRCCCCOHHIRRHI = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.RHROORIOHOIHRHHHCOOOICHRRHHCOH = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var2
      );
   }

   @Override
   public CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> OCOOIRORRIICCHRRCCRICIOCHOHCRR() {
      return this.CORHHIROCHRORCOIHRCCCCOHHIRRHI;
   }

   @Override
   public com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super Entry<K, V>> OCIOIRIOICIIICCRCIHOHOOHORICHH() {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO(this.RHROORIOHOIHRHHHCOOOICHRRHHCOH);
   }

   @Override
   public int size() {
      int var1 = 0;

      for (Collection var3 : this.asMap().values()) {
         var1 += var3.size();
      }

      return var1;
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      if (this.CORHHIROCHRORCOIHRCCCCOHHIRRHI.containsKey(var1)) {
         Object var2 = var1;
         return this.RHROORIOHOIHRHHHCOOOICHRRHHCOH.apply((K)var2);
      } else {
         return false;
      }
   }

   @Override
   public Collection<V> removeAll(Object var1) {
      return this.containsKey(var1) ? this.CORHHIROCHRORCOIHRCCCCOHHIRRHI.removeAll(var1) : this.unmodifiableEmptyCollection();
   }

   Collection<V> unmodifiableEmptyCollection() {
      return this.CORHHIROCHRORCOIHRCCCCOHHIRRHI instanceof RCRCCORIIOICRIIRHCCIIOCICRHIOC
         ? CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI()
         : COIRRRCIORROCHIROCHROCHICCICIC.HHOIROIHOHHRHIRRRHRIRHOOIRCIOH();
   }

   @Override
   public void clear() {
      this.keySet().clear();
   }

   @Override
   Set<K> createKeySet() {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CORHHIROCHRORCOIHRCCCCOHHIRRHI.keySet(), this.RHROORIOHOIHRHHHCOOOICHRRHHCOH);
   }

   @Override
   public Collection<V> get(K var1) {
      if (this.RHROORIOHOIHRHHHCOOOICHRRHHCOH.apply((K)var1)) {
         return this.CORHHIROCHRORCOIHRCCCCOHHIRRHI.get((K)var1);
      } else {
         return this.CORHHIROCHRORCOIHRCCCCOHHIRRHI instanceof RCRCCORIIOICRIIRHCCIIOCICRHIOC
            ? new ORCOCORROHIROCCIORORRRRCHIOOCH.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(var1)
            : new ORCOCORROHIROCCIORORRRRCHIOOCH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var1);
      }
   }

   @Override
   Iterator<Entry<K, V>> entryIterator() {
      throw new AssertionError("should never be called");
   }

   @Override
   Collection<Entry<K, V>> createEntries() {
      return new ORCOCORROHIROCCIORORRRRCHIOOCH.HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   }

   @Override
   Collection<V> createValues() {
      return new RRORCOIRRIICOOICOIOCORHORCHCOC<>(this);
   }

   @Override
   Map<K, Collection<V>> createAsMap() {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CORHHIROCHRORCOIHRCCCCOHHIRRHI.asMap(), this.RHROORIOHOIHRHHHCOOOICHRRHHCOH);
   }

   @Override
   CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> OHOHIROHHCIRICHIHRORHOHRIIHHRO() {
      return CCRIHCIIOOIOHIRCCHIICCRHIROORC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.CORHHIROCHRORCOIHRCCCCOHHIRRHI.IOOOCHROIROHCCROIOICROCIIOOIOO(), this.RHROORIOHOIHRHHHCOOOICHRRHHCOH
      );
   }

   class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends OOCHRIIIRIHRRCRIORHCROIIHCRRIC<Entry<K, V>> {
      @Override
      protected Collection<Entry<K, V>> delegate() {
         return RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            ORCOCORROHIROCCIORORRRRCHIOOCH.this.CORHHIROCHRORCOIHRCCCCOHHIRRHI.entries(), ORCOCORROHIROCCIORORRRRCHIOOCH.this.OCIOIRIOICIIICCRCIHOHOOHORICHH()
         );
      }

      @Override
      public boolean remove(@Nullable Object var1) {
         if (var1 instanceof Entry) {
            Entry var2 = (Entry)var1;
            if (ORCOCORROHIROCCIORORRRRCHIOOCH.this.CORHHIROCHRORCOIHRCCCCOHHIRRHI.containsKey(var2.getKey())
               && ORCOCORROHIROCCIORORRRRCHIOOCH.this.RHROORIOHOIHRHHHCOOOICHRRHHCOH.apply((K)var2.getKey())) {
               return ORCOCORROHIROCCIORORRRRCHIOOCH.this.CORHHIROCHRORCOIHRCCCCOHHIRRHI.remove(var2.getKey(), var2.getValue());
            }
         }

         return false;
      }
   }

   static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> extends HOHCCHOIOHOHHOROHOIIHOOHORRHRO<V> {
      final K ORCHIIOHIIICICORIRCHRROOIOIOOR;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(K var1) {
         this.ORCHIIOHIIICICORIRCHRROOIOIOOR = (K)var1;
      }

      @Override
      public boolean add(V var1) {
         throw new IllegalArgumentException("Key does not satisfy predicate: " + this.ORCHIIOHIIICICORIRCHRROOIOIOOR);
      }

      @Override
      public boolean addAll(Collection<? extends V> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         throw new IllegalArgumentException("Key does not satisfy predicate: " + this.ORCHIIOHIIICICORIRCHRROOIOIOOR);
      }

      @Override
      protected Set<V> delegate() {
         return Collections.emptySet();
      }
   }

   static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> extends COOCCHICCCIIICRHIOCOCIOOORCOCC<V> {
      final K ROICRROCCOORHRIICHOCCRIOIRCHIO;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(K var1) {
         this.ROICRROCCOORHRIICHOCCRIOIRCHIO = (K)var1;
      }

      @Override
      public boolean add(V var1) {
         this.add(0, (V)var1);
         return true;
      }

      @Override
      public void add(int var1, V var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
            var1, 0
         );
         throw new IllegalArgumentException("Key does not satisfy predicate: " + this.ROICRROCCOORHRIICHOCCRIOIRCHIO);
      }

      @Override
      public boolean addAll(Collection<? extends V> var1) {
         this.addAll(0, var1);
         return true;
      }

      @CanIgnoreReturnValue
      @Override
      public boolean addAll(int var1, Collection<? extends V> var2) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var2
         );
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
            var1, 0
         );
         throw new IllegalArgumentException("Key does not satisfy predicate: " + this.ROICRROCCOORHRIICHOCCRIOIRCHIO);
      }

      @Override
      protected List<V> delegate() {
         return Collections.emptyList();
      }
   }
}
