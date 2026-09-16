package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class IIRHCHHOICHRICOOCRORCCIOOIHOIR<K, V>
   extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OCOHORHCROHICRRIHCIHHRRCIHICRI<K, V>
   implements ROIHROCROORRCCOIRRIHHORCROOORO<K, V> {
   private static final long IHICHOOOOHHHOHHOOHOHRIOIORIOIH = 430848587173315748L;

   protected IIRHCHHOICHRICOOCRORCCIOOIHOIR(Map<K, Collection<V>> var1) {
      super(var1);
   }

   abstract SortedSet<V> createCollection();

   SortedSet<V> createUnmodifiableEmptyCollection() {
      return this.unmodifiableCollectionSubclass(this.createCollection());
   }

   <E> SortedSet<E> unmodifiableCollectionSubclass(Collection<E> var1) {
      return var1 instanceof NavigableSet
         ? ICRHCCCCOIICOCHHCRCOOIHICROIHI.unmodifiableNavigableSet((NavigableSet<E>)var1)
         : Collections.unmodifiableSortedSet((SortedSet<E>)var1);
   }

   @Override
   Collection<V> wrapCollection(K var1, Collection<V> var2) {
      return var2 instanceof NavigableSet
         ? new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(
            var1, (NavigableSet<V>)var2, null
         )
         : new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHORHCROHICRRIHCIHHRRCIHICRI(
            var1, (SortedSet<V>)var2, null
         );
   }

   @Override
   public SortedSet<V> get(@Nullable K var1) {
      return (SortedSet<V>)super.get((K)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public SortedSet<V> removeAll(@Nullable Object var1) {
      return (SortedSet<V>)super.removeAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public SortedSet<V> replaceValues(@Nullable K var1, Iterable<? extends V> var2) {
      return (SortedSet<V>)super.replaceValues((K)var1, var2);
   }

   @Override
   public Map<K, Collection<V>> asMap() {
      return super.asMap();
   }

   @Override
   public Collection<V> values() {
      return super.values();
   }
}
