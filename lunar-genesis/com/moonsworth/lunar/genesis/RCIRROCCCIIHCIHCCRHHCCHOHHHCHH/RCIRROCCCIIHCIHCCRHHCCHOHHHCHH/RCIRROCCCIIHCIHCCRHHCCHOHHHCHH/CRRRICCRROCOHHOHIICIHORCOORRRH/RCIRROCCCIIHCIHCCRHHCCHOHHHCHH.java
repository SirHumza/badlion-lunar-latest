package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiFunction;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> extends HRHIHIRHRCHHRORRRCORHOCIRHRIOR<K, V> implements IHIRRIIORRHORHRORIHOROIRCORCOO<K, V>, Serializable {
   private transient @Nullable Map<K, V> delegate;
   @RetainedWith
   transient @Nullable RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V, K> IIHRRROHCHCICHHOIOROHOHIORIROC;
   private transient @Nullable Set<K> keySet;
   private transient @Nullable Set<V> valueSet;
   private transient @Nullable Set<Entry<K, V>> entrySet;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
   private static final long OIIHIICHIIRCCOCOOHIIOIRIHIOIHC = 0L;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<K, V> var1, Map<V, K> var2) {
      this.setDelegates(var1, var2);
   }

   private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Map<K, V> var1,
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V, K> var2
   ) {
      this.delegate = var1;
      this.IIHRRROHCHCICHHOIOROHOHIORIROC = var2;
   }

   @Override
   protected Map<K, V> delegate() {
      return this.delegate;
   }

   @CanIgnoreReturnValue
   K checkKey(@Nullable K var1) {
      return (K)var1;
   }

   @CanIgnoreReturnValue
   V checkValue(@Nullable V var1) {
      return (V)var1;
   }

   void setDelegates(Map<K, V> var1, Map<V, K> var2) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
         this.delegate == null
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
         this.IIHRRROHCHCICHHOIOROHOHIORIROC == null
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1.isEmpty()
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var2.isEmpty()
      );
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         var1 != var2
      );
      this.delegate = var1;
      this.IIHRRROHCHCICHHOIOROHOHIORIROC = this.OOCCRCRCOHIIORCCORCRCIRRROIOOR(var2);
   }

   com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V, K> OOCCRCRCOHIIORCCORCRCIRRROIOOR(
      Map<V, K> var1
   ) {
      return new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH<>(
         var1, this
      );
   }

   void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V, K> var1
   ) {
      this.IIHRRROHCHCICHHOIOROHOHIORIROC = var1;
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return this.IIHRRROHCHCICHHOIOROHOHIORIROC.containsKey(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public V put(@Nullable K var1, @Nullable V var2) {
      return this.putInBothMaps((K)var1, (V)var2, false);
   }

   @CanIgnoreReturnValue
   @Override
   public V forcePut(@Nullable K var1, @Nullable V var2) {
      return this.putInBothMaps((K)var1, (V)var2, true);
   }

   private V putInBothMaps(@Nullable K var1, @Nullable V var2, boolean var3) {
      this.checkKey((K)var1);
      this.checkValue((V)var2);
      boolean var4 = this.containsKey(var1);
      if (var4
         && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var2, this.get(var1)
         )) {
         return (V)var2;
      }

      if (var3) {
         this.HOCCROIICHRHHCOCIICIROCCIHRCOR().remove(var2);
      } else {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            !this.containsValue(var2), "value already present: %s", var2
         );
      }

      Object var5 = this.delegate.put((K)var1, (V)var2);
      this.updateInverseMap((K)var1, var4, (V)var5, (V)var2);
      return (V)var5;
   }

   private void updateInverseMap(K var1, boolean var2, V var3, V var4) {
      if (var2) {
         this.removeFromInverseMap((V)var3);
      }

      this.IIHRRROHCHCICHHOIOROHOHIORIROC.delegate.put((V)var4, (K)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public V remove(@Nullable Object var1) {
      return this.containsKey(var1) ? this.removeFromBothMaps(var1) : null;
   }

   @CanIgnoreReturnValue
   private V removeFromBothMaps(Object var1) {
      Object var2 = this.delegate.remove(var1);
      this.removeFromInverseMap((V)var2);
      return (V)var2;
   }

   private void removeFromInverseMap(V var1) {
      this.IIHRRROHCHCICHHOIOROHOHIORIROC.delegate.remove(var1);
   }

   @Override
   public void putAll(Map<? extends K, ? extends V> var1) {
      for (Entry var3 : var1.entrySet()) {
         this.put((K)var3.getKey(), (V)var3.getValue());
      }
   }

   @Override
   public void replaceAll(BiFunction<? super K, ? super V, ? extends V> var1) {
      this.delegate.replaceAll(var1);
      this.IIHRRROHCHCICHHOIOROHOHIORIROC.delegate.clear();
      Entry var2 = null;
      Iterator var3 = this.delegate.entrySet().iterator();

      while (var3.hasNext()) {
         Entry var4 = (Entry)var3.next();
         Object var5 = var4.getKey();
         Object var6 = var4.getValue();
         Object var7 = this.IIHRRROHCHCICHHOIOROHOHIORIROC.delegate.putIfAbsent((V)var6, (K)var5);
         if (var7 != null) {
            var2 = var4;
            var3.remove();
         }
      }

      if (var2 != null) {
         throw new IllegalArgumentException("value already present: " + var2.getValue());
      }
   }

   @Override
   public void clear() {
      this.delegate.clear();
      this.IIHRRROHCHCICHHOIOROHOHIORIROC.delegate.clear();
   }

   @Override
   public IHIRRIIORRHORHRORIHOROIRCORCOO<V, K> HOCCROIICHRHHCOCIICIROCCIHRCOR() {
      return this.IIHRRROHCHCICHHOIOROHOHIORIROC;
   }

   @Override
   public Set<K> keySet() {
      Set var1 = this.keySet;
      return var1 == null
         ? (
            this.keySet = new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH(
               
            )
         )
         : var1;
   }

   @Override
   public Set<V> values() {
      Set var1 = this.valueSet;
      return var1 == null
         ? (
            this.valueSet = new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO(
               
            )
         )
         : var1;
   }

   @Override
   public Set<Entry<K, V>> entrySet() {
      Set var1 = this.entrySet;
      return var1 == null
         ? (
            this.entrySet = new com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
               
            )
         )
         : var1;
   }

   Iterator<Entry<K, V>> entrySetIterator() {
      final Iterator var1 = this.delegate.entrySet().iterator();
      return new Iterator<Entry<K, V>>() {
         @Nullable Entry<K, V> entry;

         @Override
         public boolean hasNext() {
            return var1.hasNext();
         }

         public Entry<K, V> next() {
            this.entry = (Entry<K, V>)var1.next();
            return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.entry);
         }

         @Override
         public void remove() {
            ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkRemove(this.entry != null);
            Object var1x = this.entry.getValue();
            var1.remove();
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.removeFromInverseMap(var1x);
            this.entry = null;
         }
      };
   }

   private class CRRRICCRROCOHHOHIICIHORCOORRRH extends HOHCCHOIOHOHHOROHOIIHOOHORRHRO<K> {
      private CRRRICCRROCOHHOHIICIHORCOORRRH() {
      }

      @Override
      protected Set<K> delegate() {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.delegate.keySet();
      }

      @Override
      public void clear() {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.clear();
      }

      @Override
      public boolean remove(Object var1) {
         if (!this.contains(var1)) {
            return false;
         }

         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.removeFromBothMaps(var1);
         return true;
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         return this.standardRemoveAll(var1);
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         return this.standardRetainAll(var1);
      }

      @Override
      public Iterator<K> iterator() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.keyIterator(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.entrySet().iterator());
      }
   }

   static class HHCCIRHCCCIIRHCROHIORHIRHHIORH<K, V>
      extends com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K, V> {
      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
      private static final long ORHOCIRCOHOHCRRORIHHROHOCIHOIC = 0L;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         Map<K, V> var1,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V, K> var2
      ) {
         super(var1, var2);
      }

      @Override
      K checkKey(K var1) {
         return this.IIHRRROHCHCICHHOIOROHOHIORIROC.checkValue((K)var1);
      }

      @Override
      V checkValue(V var1) {
         return this.IIHRRROHCHCICHHOIOROHOHIORIROC.checkKey((V)var1);
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
      private void writeObject(ObjectOutputStream var1) {
         var1.defaultWriteObject();
         var1.writeObject(this.HOCCROIICHRHHCOCIICIROCCIHRCOR());
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
      private void readObject(ObjectInputStream var1) {
         var1.defaultReadObject();
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V, K>)var1.readObject()
         );
      }

      @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
      Object readResolve() {
         return this.HOCCROIICHRHHCOCIICIROCCIHRCOR().HOCCROIICHRHHCOCIICIROCCIHRCOR();
      }
   }

   private class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends HOHCCHOIOHOHHOROHOIIHOOHORRHRO<Entry<K, V>> {
      final Set<Entry<K, V>> OOORIRIRROOHORIRIROICIIHCCIRRR = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.delegate.entrySet();

      private IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
      }

      @Override
      protected Set<Entry<K, V>> delegate() {
         return this.OOORIRIRROOHORIRIROICIIHCCIRRR;
      }

      @Override
      public void clear() {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.clear();
      }

      @Override
      public boolean remove(Object var1) {
         if (!this.OOORIRIRROOHORIRIROICIIHCCIRRR.contains(var1)) {
            return false;
         }

         Entry var2 = (Entry)var1;
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IIHRRROHCHCICHHOIOROHOHIORIROC.delegate.remove(var2.getValue());
         this.OOORIRIRROOHORIRIROICIIHCCIRRR.remove(var2);
         return true;
      }

      @Override
      public Iterator<Entry<K, V>> iterator() {
         return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.entrySetIterator();
      }

      @Override
      public Object[] toArray() {
         return this.standardToArray();
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         return (T[])this.standardToArray((T[])var1);
      }

      @Override
      public boolean contains(Object var1) {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.containsEntryImpl(this.delegate(), var1);
      }

      @Override
      public boolean containsAll(Collection<?> var1) {
         return this.standardContainsAll(var1);
      }

      @Override
      public boolean removeAll(Collection<?> var1) {
         return this.standardRemoveAll(var1);
      }

      @Override
      public boolean retainAll(Collection<?> var1) {
         return this.standardRetainAll(var1);
      }
   }

   class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends OCOROCROIRCHIHIHHOOIRIIIRRCRHI<K, V> {
      private final Entry<K, V> RIIICRRIHHIRRHOORHOOIOIHOOCHCR;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Entry<K, V> var2) {
         this.RIIICRRIHHIRRHOORHOOIOIHOOCHCR = var2;
      }

      @Override
      protected Entry<K, V> delegate() {
         return this.RIIICRRIHHIRRHOORHOOIOIHOOCHCR;
      }

      @Override
      public V setValue(V var1) {
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.checkValue((V)var1);
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.entrySet().contains(this), "entry no longer in map"
         );
         if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var1, this.getValue()
         )) {
            return (V)var1;
         }

         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
            !RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.containsValue(var1), "value already present: %s", var1
         );
         Object var2 = this.RIIICRRIHHIRRHOORHOOIOIHOOCHCR.setValue((V)var1);
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
               var1, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.get(this.getKey())
            ),
            "entry no longer in map"
         );
         RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.updateInverseMap((K)this.getKey(), true, (V)var2, (V)var1);
         return (V)var2;
      }
   }

   private class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends HOHCCHOIOHOHHOROHOIIHOOHORRHRO<V> {
      final Set<V> RCCCOOHCHIRHOOOOIRCIRCHRIIRIOC = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.IIHRRROHCHCICHHOIOROHOHIORIROC.keySet();

      private RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      }

      @Override
      protected Set<V> delegate() {
         return this.RCCCOOHCHIRHOOOOIRCIRCHRIIRIOC;
      }

      @Override
      public Iterator<V> iterator() {
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.valueIterator(RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this.entrySet().iterator());
      }

      @Override
      public Object[] toArray() {
         return this.standardToArray();
      }

      @Override
      public <T> T[] toArray(T[] var1) {
         return (T[])this.standardToArray((T[])var1);
      }

      @Override
      public String toString() {
         return this.standardToString();
      }
   }
}
