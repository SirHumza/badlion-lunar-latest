package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
final class HOIHOROOIOOCOIHCRIRIRIRRICIIHC<K, V> extends ORCOCORROHIROCCIORORRRRCHIOOCH<K, V> implements RHRIIOOOCRHIIOORCOCRCHRCCRRCIH<K, V> {
   HOIHOROOIOOCOIHCRIRIRIRRICIIHC(
      RCRCCORIIOICRIIRHCCIIOCICRHIOC<K, V> var1,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<? super K> var2
   ) {
      super(var1, var2);
   }

   @Override
   public RCRCCORIIOICRIIRHCCIIOCICRHIOC<K, V> OHROHOCIICIHIROOIRCIIHCORICOCO() {
      return (RCRCCORIIOICRIIRHCCIIOCICRHIOC<K, V>)this.CORHHIROCHRORCOIHRCCCCOHHIRRHI;
   }

   @Override
   public Set<V> get(K var1) {
      return (Set<V>)super.get((K)var1);
   }

   @Override
   public Set<V> removeAll(Object var1) {
      return (Set<V>)super.removeAll(var1);
   }

   @Override
   public Set<V> replaceValues(K var1, Iterable<? extends V> var2) {
      return (Set<V>)super.replaceValues((K)var1, var2);
   }

   @Override
   public Set<Entry<K, V>> entries() {
      return (Set<Entry<K, V>>)super.entries();
   }

   Set<Entry<K, V>> createEntries() {
      return new HOIHOROOIOOCOIHCRIRIRIRRICIIHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ORCOCORROHIROCCIORORRRRCHIOOCH<K, V>.HHCCIRHCCCIIRHCROHIORHIRHHIORH implements Set<Entry<K, V>> {
      @Override
      public int hashCode() {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.hashCodeImpl(this);
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         return ICRHCCCCOIICOCHHCRCOOIHICROIHI.equalsImpl(this, var1);
      }
   }
}
