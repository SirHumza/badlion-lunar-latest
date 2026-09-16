package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import java.util.Map.Entry;
import java.util.function.BiFunction;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
public abstract class CCHORHIOORICCIRIHRIIHIICORIORO<K, V> extends IROCHOHCORHCOCCCOCHORCICRORIIC<K, V> implements NavigableMap<K, V> {
   protected CCHORHIOORICCIRIHRIIHIICORIORO() {
   }

   protected abstract NavigableMap<K, V> delegate();

   @Override
   public Entry<K, V> lowerEntry(K var1) {
      return this.delegate().lowerEntry((K)var1);
   }

   protected Entry<K, V> standardLowerEntry(K var1) {
      return this.headMap((K)var1, false).lastEntry();
   }

   @Override
   public K lowerKey(K var1) {
      return this.delegate().lowerKey((K)var1);
   }

   protected K standardLowerKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.lowerEntry((K)var1));
   }

   @Override
   public Entry<K, V> floorEntry(K var1) {
      return this.delegate().floorEntry((K)var1);
   }

   protected Entry<K, V> standardFloorEntry(K var1) {
      return this.headMap((K)var1, true).lastEntry();
   }

   @Override
   public K floorKey(K var1) {
      return this.delegate().floorKey((K)var1);
   }

   protected K standardFloorKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.floorEntry((K)var1));
   }

   @Override
   public Entry<K, V> ceilingEntry(K var1) {
      return this.delegate().ceilingEntry((K)var1);
   }

   protected Entry<K, V> standardCeilingEntry(K var1) {
      return this.tailMap((K)var1, true).firstEntry();
   }

   @Override
   public K ceilingKey(K var1) {
      return this.delegate().ceilingKey((K)var1);
   }

   protected K standardCeilingKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.ceilingEntry((K)var1));
   }

   @Override
   public Entry<K, V> higherEntry(K var1) {
      return this.delegate().higherEntry((K)var1);
   }

   protected Entry<K, V> standardHigherEntry(K var1) {
      return this.tailMap((K)var1, false).firstEntry();
   }

   @Override
   public K higherKey(K var1) {
      return this.delegate().higherKey((K)var1);
   }

   protected K standardHigherKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.higherEntry((K)var1));
   }

   @Override
   public Entry<K, V> firstEntry() {
      return this.delegate().firstEntry();
   }

   protected Entry<K, V> standardFirstEntry() {
      return IRIHOIRCHIRRCRIOORCOICORHHORHH.getFirst(this.entrySet(), null);
   }

   protected K standardFirstKey() {
      Entry var1 = this.firstEntry();
      if (var1 == null) {
         throw new NoSuchElementException();
      } else {
         return (K)var1.getKey();
      }
   }

   @Override
   public Entry<K, V> lastEntry() {
      return this.delegate().lastEntry();
   }

   protected Entry<K, V> standardLastEntry() {
      return IRIHOIRCHIRRCRIOORCOICORHHORHH.getFirst(this.descendingMap().entrySet(), null);
   }

   protected K standardLastKey() {
      Entry var1 = this.lastEntry();
      if (var1 == null) {
         throw new NoSuchElementException();
      } else {
         return (K)var1.getKey();
      }
   }

   @Override
   public Entry<K, V> pollFirstEntry() {
      return this.delegate().pollFirstEntry();
   }

   protected Entry<K, V> standardPollFirstEntry() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.entrySet().iterator());
   }

   @Override
   public Entry<K, V> pollLastEntry() {
      return this.delegate().pollLastEntry();
   }

   protected Entry<K, V> standardPollLastEntry() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.descendingMap().entrySet().iterator());
   }

   @Override
   public NavigableMap<K, V> descendingMap() {
      return this.delegate().descendingMap();
   }

   @Override
   public NavigableSet<K> navigableKeySet() {
      return this.delegate().navigableKeySet();
   }

   @Override
   public NavigableSet<K> descendingKeySet() {
      return this.delegate().descendingKeySet();
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected NavigableSet<K> standardDescendingKeySet() {
      return this.descendingMap().navigableKeySet();
   }

   @Override
   protected SortedMap<K, V> standardSubMap(K var1, K var2) {
      return this.subMap((K)var1, true, (K)var2, false);
   }

   @Override
   public NavigableMap<K, V> subMap(K var1, boolean var2, K var3, boolean var4) {
      return this.delegate().subMap((K)var1, var2, (K)var3, var4);
   }

   @Override
   public NavigableMap<K, V> headMap(K var1, boolean var2) {
      return this.delegate().headMap((K)var1, var2);
   }

   @Override
   public NavigableMap<K, V> tailMap(K var1, boolean var2) {
      return this.delegate().tailMap((K)var1, var2);
   }

   protected SortedMap<K, V> standardHeadMap(K var1) {
      return this.headMap((K)var1, false);
   }

   protected SortedMap<K, V> standardTailMap(K var1) {
      return this.tailMap((K)var1, true);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<K, V> {
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         super(CCHORHIOORICCIRIHRIIHIICORIORO.this);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V> {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      NavigableMap<K, V> forward() {
         return CCHORHIOORICCIRIHRIIHIICORIORO.this;
      }

      @Override
      public void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1) {
         this.forward().replaceAll(var1);
      }

      @Override
      protected Iterator<Entry<K, V>> entryIterator() {
         return new Iterator<Entry<K, V>>() {
            private Entry<K, V> toRemove = null;
            private Entry<K, V> nextOrNull = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.forward().lastEntry();

            @Override
            public boolean hasNext() {
               return this.nextOrNull != null;
            }

            public Entry<K, V> next() {
               if (!this.hasNext()) {
                  throw new NoSuchElementException();
               }

               try {
                  return this.nextOrNull;
               } finally {
                  this.toRemove = this.nextOrNull;
                  this.nextOrNull = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.forward().lowerEntry(this.nextOrNull.getKey());
               }
            }

            @Override
            public void remove() {
               ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.toRemove != null);
               RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.forward().remove(this.toRemove.getKey());
               this.toRemove = null;
            }
         };
      }
   }
}
