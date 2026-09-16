package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class HRHIHIRHRCHHRORRRCORHOCIRHRIOR<K, V> extends HRHRORCIRICHCCCCCHICOOICIRHRIO implements Map<K, V> {
   protected HRHIHIRHRCHHRORRRCORHOCIRHRIOR() {
   }

   protected abstract Map<K, V> delegate();

   @Override
   public int size() {
      return this.delegate().size();
   }

   @Override
   public boolean isEmpty() {
      return this.delegate().isEmpty();
   }

   @CanIgnoreReturnValue
   @Override
   public V remove(Object var1) {
      return this.delegate().remove(var1);
   }

   @Override
   public void clear() {
      this.delegate().clear();
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.delegate().containsKey(var1);
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return this.delegate().containsValue(var1);
   }

   @Override
   public V get(@Nullable Object var1) {
      return this.delegate().get(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public V put(K var1, V var2) {
      return this.delegate().put((K)var1, (V)var2);
   }

   @Override
   public void putAll(Map<? extends K, ? extends V> var1) {
      this.delegate().putAll(var1);
   }

   @Override
   public Set<K> keySet() {
      return this.delegate().keySet();
   }

   @Override
   public Collection<V> values() {
      return this.delegate().values();
   }

   @Override
   public Set<Entry<K, V>> entrySet() {
      return this.delegate().entrySet();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return var1 == this || this.delegate().equals(var1);
   }

   @Override
   public int hashCode() {
      return this.delegate().hashCode();
   }

   protected void standardPutAll(Map<? extends K, ? extends V> var1) {
      ROCHRRCORRCOOOOOCOICOCROIIHIHH.putAllImpl(this, var1);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected V standardRemove(@Nullable Object var1) {
      Iterator var2 = this.entrySet().iterator();

      while (var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         if (com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            var3.getKey(), var1
         )) {
            Object var4 = var3.getValue();
            var2.remove();
            return (V)var4;
         }
      }

      return null;
   }

   protected void standardClear() {
      HRCROCOHHHICRHIHHOOCIIRRRCCIRR.clear(this.entrySet().iterator());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected boolean standardContainsKey(@Nullable Object var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.containsKeyImpl(this, var1);
   }

   protected boolean standardContainsValue(@Nullable Object var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.containsValueImpl(this, var1);
   }

   protected boolean standardIsEmpty() {
      return !this.entrySet().iterator().hasNext();
   }

   protected boolean standardEquals(@Nullable Object var1) {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.equalsImpl(this, var1);
   }

   protected int standardHashCode() {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.hashCodeImpl(this.entrySet());
   }

   protected String standardToString() {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.toStringImpl(this);
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH<K, V> {
      public HHCCIRHCCCIIRHCROHIORHIRHHIORH() {
         super(HRHIHIRHRCHHRORRRCORHOCIRHRIOR.this);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR<K, V> {
      public IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
         super(HRHIHIRHRCHHRORRRCORHOCIRHRIOR.this);
      }
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ROCHRRCORRCOOOOOCOICOCROIIHIHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH<K, V> {
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      Map<K, V> map() {
         return HRHIHIRHRCHHRORRRCORHOCIRHRIOR.this;
      }
   }
}
