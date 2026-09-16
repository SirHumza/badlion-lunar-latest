package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
abstract class CRICCOOHHHCHOORCICOCOHIHOIRHOO<K, V> extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR<K, V> implements NavigableMap<K, V> {
   @Override
   public abstract @Nullable V get(@Nullable Object var1);

   @Override
   public @Nullable Entry<K, V> firstEntry() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getNext(this.entryIterator(), null);
   }

   @Override
   public @Nullable Entry<K, V> lastEntry() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.getNext(this.descendingEntryIterator(), null);
   }

   @Override
   public @Nullable Entry<K, V> pollFirstEntry() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.entryIterator());
   }

   @Override
   public @Nullable Entry<K, V> pollLastEntry() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.pollNext(this.descendingEntryIterator());
   }

   @Override
   public K firstKey() {
      Entry var1 = this.firstEntry();
      if (var1 == null) {
         throw new NoSuchElementException();
      } else {
         return (K)var1.getKey();
      }
   }

   @Override
   public K lastKey() {
      Entry var1 = this.lastEntry();
      if (var1 == null) {
         throw new NoSuchElementException();
      } else {
         return (K)var1.getKey();
      }
   }

   @Override
   public @Nullable Entry<K, V> lowerEntry(K var1) {
      return this.headMap((K)var1, false).lastEntry();
   }

   @Override
   public @Nullable Entry<K, V> floorEntry(K var1) {
      return this.headMap((K)var1, true).lastEntry();
   }

   @Override
   public @Nullable Entry<K, V> ceilingEntry(K var1) {
      return this.tailMap((K)var1, true).firstEntry();
   }

   @Override
   public @Nullable Entry<K, V> higherEntry(K var1) {
      return this.tailMap((K)var1, false).firstEntry();
   }

   @Override
   public K lowerKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.lowerEntry((K)var1));
   }

   @Override
   public K floorKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.floorEntry((K)var1));
   }

   @Override
   public K ceilingKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.ceilingEntry((K)var1));
   }

   @Override
   public K higherKey(K var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyOrNull(this.higherEntry((K)var1));
   }

   abstract Iterator<Entry<K, V>> descendingEntryIterator();

   @Override
   public SortedMap<K, V> subMap(K var1, K var2) {
      return this.subMap((K)var1, true, (K)var2, false);
   }

   @Override
   public SortedMap<K, V> headMap(K var1) {
      return this.headMap((K)var1, false);
   }

   @Override
   public SortedMap<K, V> tailMap(K var1) {
      return this.tailMap((K)var1, true);
   }

   @Override
   public NavigableSet<K> navigableKeySet() {
      return new ROCHRRCORRCOOOOOCOICOCROIIHIHH.IRRCCOICORICIHCHRHIHIHROIRHOCR<>(this);
   }

   @Override
   public Set<K> keySet() {
      return this.navigableKeySet();
   }

   @Override
   public NavigableSet<K> descendingKeySet() {
      return this.descendingMap().navigableKeySet();
   }

   @Override
   public NavigableMap<K, V> descendingMap() {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V> {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      NavigableMap<K, V> forward() {
         return CRICCOOHHHCHOORCICOCOHIHOIRHOO.this;
      }

      @Override
      Iterator<Entry<K, V>> entryIterator() {
         return CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.descendingEntryIterator();
      }
   }
}
