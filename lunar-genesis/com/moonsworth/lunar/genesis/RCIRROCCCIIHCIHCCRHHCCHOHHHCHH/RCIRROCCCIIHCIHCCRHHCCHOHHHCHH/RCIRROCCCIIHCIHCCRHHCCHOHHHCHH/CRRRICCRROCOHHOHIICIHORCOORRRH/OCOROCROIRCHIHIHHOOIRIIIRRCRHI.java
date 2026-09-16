package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class OCOROCROIRCHIHIHHOOIRIIIRRCRHI<K, V> extends HRHRORCIRICHCCCCCHICOOICIRHRIO implements Entry<K, V> {
   protected OCOROCROIRCHIHIHHOOIRIIIRRCRHI() {
   }

   protected abstract Entry<K, V> delegate();

   @Override
   public K getKey() {
      return this.delegate().getKey();
   }

   @Override
   public V getValue() {
      return this.delegate().getValue();
   }

   @Override
   public V setValue(V var1) {
      return this.delegate().setValue((V)var1);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return this.delegate().equals(var1);
   }

   @Override
   public int hashCode() {
      return this.delegate().hashCode();
   }

   protected boolean standardEquals(@Nullable Object var1) {
      if (!(var1 instanceof Entry)) {
         return false;
      }

      Entry var2 = (Entry)var1;
      return com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            this.getKey(), var2.getKey()
         )
         && com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI.equal(
            this.getValue(), var2.getValue()
         );
   }

   protected int standardHashCode() {
      Object var1 = this.getKey();
      Object var2 = this.getValue();
      return (var1 == null ? 0 : var1.hashCode()) ^ (var2 == null ? 0 : var2.hashCode());
   }

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   protected String standardToString() {
      return this.getKey() + "=" + this.getValue();
   }
}
