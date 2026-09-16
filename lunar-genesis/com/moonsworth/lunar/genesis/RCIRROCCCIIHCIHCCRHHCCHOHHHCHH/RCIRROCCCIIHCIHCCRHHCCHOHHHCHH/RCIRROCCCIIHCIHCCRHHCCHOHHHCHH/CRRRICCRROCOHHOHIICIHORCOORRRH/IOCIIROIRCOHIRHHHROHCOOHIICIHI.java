package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class IOCIIROIRCOHIRHHHROHCOOHIICIHI<K, V> extends HRHRORCIRICHCCCCCHICOOICIRHRIO implements CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> {
   protected IOCIIROIRCOHIRHHHROHCOOHIICIHI() {
   }

   protected abstract CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> COOHIROHHCIORRHRRHHCRRHROCCCIO();

   @Override
   public Map<K, Collection<V>> asMap() {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().asMap();
   }

   @Override
   public void clear() {
      this.COOHIROHHCIORRHRRHHCRRHROCCCIO().clear();
   }

   @Override
   public boolean containsEntry(@Nullable Object var1, @Nullable Object var2) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().containsEntry(var1, var2);
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().containsKey(var1);
   }

   @Override
   public boolean containsValue(@Nullable Object var1) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().containsValue(var1);
   }

   @Override
   public Collection<Entry<K, V>> entries() {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().entries();
   }

   @Override
   public Collection<V> get(@Nullable K var1) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().get((K)var1);
   }

   @Override
   public boolean isEmpty() {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().isEmpty();
   }

   @Override
   public CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> IOOOCHROIROHCCROIOICROCIIOOIOO() {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().IOOOCHROIROHCCROIOICROCIIOOIOO();
   }

   @Override
   public Set<K> keySet() {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().keySet();
   }

   @CanIgnoreReturnValue
   @Override
   public boolean put(K var1, V var2) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().put((K)var1, (V)var2);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean putAll(K var1, Iterable<? extends V> var2) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().putAll((K)var1, var2);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var1) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public boolean remove(@Nullable Object var1, @Nullable Object var2) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().remove(var1, var2);
   }

   @CanIgnoreReturnValue
   @Override
   public Collection<V> removeAll(@Nullable Object var1) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().removeAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public Collection<V> replaceValues(K var1, Iterable<? extends V> var2) {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().replaceValues((K)var1, var2);
   }

   @Override
   public int size() {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().size();
   }

   @Override
   public Collection<V> values() {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().values();
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      return var1 == this || this.COOHIROHHCIORRHRRHHCRRHROCCCIO().equals(var1);
   }

   @Override
   public int hashCode() {
      return this.COOHIROHHCIORRHRRHHCRRHROCCCIO().hashCode();
   }
}
