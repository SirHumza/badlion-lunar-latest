package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Spliterator;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class OHHRIOHROOIHOROCIRHCHORIHRRRRI<R, C, V> implements RCCICOCCCHROHOCCHIHORIHHCOHOHH<R, C, V> {
   @LazyInit
   private transient @Nullable Set<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellSet;
   @LazyInit
   private transient @Nullable Collection<V> values;

   @Override
   public boolean containsRow(@Nullable Object var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeContainsKey(this.rowMap(), var1);
   }

   @Override
   public boolean containsColumn(@Nullable Object var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeContainsKey(this.columnMap(), var1);
   }

   @Override
   public Set<R> rowKeySet() {
      return this.rowMap().keySet();
   }

   @Override
   public Set<C> columnKeySet() {
      return this.columnMap().keySet();
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      for (Map var3 : this.rowMap().values()) {
         if (var3.containsValue(var1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean contains(@Nullable Object var1, @Nullable Object var2) {
      Map var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.rowMap(), var1);
      return var3 != null && ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeContainsKey(var3, var2);
   }

   @Override
   public V get(@Nullable Object var1, @Nullable Object var2) {
      Map var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.rowMap(), var1);
      return var3 == null ? null : ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(var3, var2);
   }

   @Override
   public boolean isEmpty() {
      return this.size() == 0;
   }

   @Override
   public void clear() {
      HRCROCOHHHICRHIHHOOCIIRRRCCIRR.clear(this.cellSet().iterator());
   }

   @CanIgnoreReturnValue
   @Override
   public V remove(@Nullable Object var1, @Nullable Object var2) {
      Map var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(this.rowMap(), var1);
      return var3 == null ? null : ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeRemove(var3, var2);
   }

   @CanIgnoreReturnValue
   @Override
   public V put(R var1, C var2, V var3) {
      return this.row((R)var1).put((C)var2, (V)var3);
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCCICOCCCHROHOCCHIHORIHHCOHOHH<? extends R, ? extends C, ? extends V> var1) {
      for (RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : var1.cellSet()) {
         this.put((R)var3.getRowKey(), (C)var3.getColumnKey(), (V)var3.getValue());
      }
   }

   @Override
   public Set<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellSet() {
      Set var1 = this.cellSet;
      return var1 == null ? (this.cellSet = this.createCellSet()) : var1;
   }

   Set<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> createCellSet() {
      return new OHHRIOHROOIHOROCIRHCHORIHRRRRI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
   }

   abstract Iterator<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellIterator();

   abstract Spliterator<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> cellSpliterator();

   @Override
   public Collection<V> values() {
      Collection var1 = this.values;
      return var1 == null ? (this.values = this.createValues()) : var1;
   }

   Collection<V> createValues() {
      return new OHHRIOHROOIHOROCIRHCHORIHRRRRI.IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   }

   Iterator<V> valuesIterator() {
      return new HOIRRRIRHICOHCCORHIHCOHIIIHCCO<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>, V>(this.cellSet().iterator()) {
         V RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V> var1) {
            return (V)var1.getValue();
         }
      };
   }

   Spliterator<V> valuesSpliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(this.cellSpliterator(), RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH::getValue);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return CIHHIHOORIIHCOORRRICHHCCRRRCHO.IRCIIHHICIHRCOCRROCOICRIHHCCHH(this, var1);
   }

   @Override
   public int hashCode() {
      return this.cellSet().hashCode();
   }

   @Override
   public String toString() {
      return this.rowMap().toString();
   }

   class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends AbstractCollection<V> {
      @Override
      public Iterator<V> iterator() {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.valuesIterator();
      }

      @Override
      public Spliterator<V> spliterator() {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.valuesSpliterator();
      }

      @Override
      public boolean contains(Object var1) {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.containsValue(var1);
      }

      @Override
      public void clear() {
         OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.clear();
      }

      @Override
      public int size() {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.size();
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends AbstractSet<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> {
      @Override
      public boolean contains(Object var1) {
         if (!(var1 instanceof RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)) {
            return false;
         }

         RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         Map var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.rowMap(), var2.getRowKey());
         return var3 != null
            && RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeContains(var3.entrySet(), ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry(var2.getColumnKey(), var2.getValue()));
      }

      @Override
      public boolean remove(@Nullable Object var1) {
         if (!(var1 instanceof RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)) {
            return false;
         }

         RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = (RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1;
         Map var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.safeGet(OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.rowMap(), var2.getRowKey());
         return var3 != null
            && RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.safeRemove(var3.entrySet(), ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry(var2.getColumnKey(), var2.getValue()));
      }

      @Override
      public void clear() {
         OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.clear();
      }

      @Override
      public Iterator<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> iterator() {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.cellIterator();
      }

      @Override
      public Spliterator<RCCICOCCCHROHOCCHIHORIHHCOHOHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<R, C, V>> spliterator() {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.cellSpliterator();
      }

      @Override
      public int size() {
         return OHHRIOHROOIHOROCIRHCHORIHRRRRI.this.size();
      }
   }
}
