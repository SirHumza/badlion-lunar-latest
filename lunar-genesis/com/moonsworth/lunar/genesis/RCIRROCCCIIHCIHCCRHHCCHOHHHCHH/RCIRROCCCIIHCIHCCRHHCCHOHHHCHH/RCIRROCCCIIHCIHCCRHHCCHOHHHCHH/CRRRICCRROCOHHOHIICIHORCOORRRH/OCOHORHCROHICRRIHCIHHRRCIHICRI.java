package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
abstract class OCOHORHCROHICRRIHCIHHRRCIHICRI<K, V>
   extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO<K, V>
   implements RCRCCORIIOICRIIRHCCIIOCICRHIOC<K, V> {
   private static final long RHIIOOICHIIIIRRRICCHROOIHCHICC = 7431625294878419160L;

   protected OCOHORHCROHICRRIHCIHHRRCIHICRI(Map<K, Collection<V>> var1) {
      super(var1);
   }

   abstract Set<V> createCollection();

   Set<V> createUnmodifiableEmptyCollection() {
      return Collections.emptySet();
   }

   @Override
   <E> Collection<E> unmodifiableCollectionSubclass(Collection<E> var1) {
      return Collections.unmodifiableSet((Set<? extends E>)var1);
   }

   @Override
   Collection<V> wrapCollection(K var1, Collection<V> var2) {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIHRRHORCRCROCHHOHORCHCROCIHRO(
         var1, (Set<V>)var2
      );
   }

   @Override
   public Set<V> get(@Nullable K var1) {
      return (Set<V>)super.get((K)var1);
   }

   @Override
   public Set<Entry<K, V>> entries() {
      return (Set<Entry<K, V>>)super.entries();
   }

   @CanIgnoreReturnValue
   @Override
   public Set<V> removeAll(@Nullable Object var1) {
      return (Set<V>)super.removeAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public Set<V> replaceValues(@Nullable K var1, Iterable<? extends V> var2) {
      return (Set<V>)super.replaceValues((K)var1, var2);
   }

   @Override
   public Map<K, Collection<V>> asMap() {
      return super.asMap();
   }

   @CanIgnoreReturnValue
   @Override
   public boolean put(@Nullable K var1, @Nullable V var2) {
      return super.put((K)var1, (V)var2);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return super.equals(var1);
   }
}
