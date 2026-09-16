package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class IROCHOHCORHCOCCCOCHORCICRORIIC<K, V> extends HRHIHIRHRCHHRORRRCORHOCIRHRIOR<K, V> implements SortedMap<K, V> {
   protected IROCHOHCORHCOCCCOCHORCICRORIIC() {
   }

   protected abstract SortedMap<K, V> delegate();

   @Override
   public Comparator<? super K> comparator() {
      return this.delegate().comparator();
   }

   @Override
   public K firstKey() {
      return this.delegate().firstKey();
   }

   @Override
   public SortedMap<K, V> headMap(K var1) {
      return this.delegate().headMap((K)var1);
   }

   @Override
   public K lastKey() {
      return this.delegate().lastKey();
   }

   @Override
   public SortedMap<K, V> subMap(K var1, K var2) {
      return this.delegate().subMap((K)var1, (K)var2);
   }

   @Override
   public SortedMap<K, V> tailMap(K var1) {
      return this.delegate().tailMap((K)var1);
   }

   private int unsafeCompare(Object var1, Object var2) {
      Comparator var3 = this.comparator();
      return var3 == null ? ((Comparable)var1).compareTo(var2) : var3.compare(var1, var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   @Override
   protected boolean standardContainsKey(@Nullable Object var1) {
      try {
         IROCHOHCORHCOCCCOCHORCICRORIIC var2 = this;
         Object var3 = var2.tailMap(var1).firstKey();
         return this.unsafeCompare(var3, var1) == 0;
      } catch (ClassCastException | NoSuchElementException | NullPointerException var4) {
         return false;
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected SortedMap<K, V> standardSubMap(K var1, K var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         this.unsafeCompare(var1, var2) <= 0, "fromKey must be <= toKey"
      );
      return this.tailMap((K)var1).headMap((K)var2);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HICRRICCHCCROOHHCHOCOCCHOIHHOC<K, V> {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
         super(IROCHOHCORHCOCCCOCHORCICRORIIC.this);
      }
   }
}
