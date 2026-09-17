package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class IICCOOCHCHROORHHIIHROHCCRHRCOR<K, V> extends IOCIIROIRCOHIRHHHROHCOOHIICIHI<K, V> implements RCRCCORIIOICRIIRHCCIIOCICRHIOC<K, V> {
   protected abstract RCRCCORIIOICRIIRHCCIIOCICRHIOC<K, V> CHOHRIIOROOOOIRIORHRCCHRIOCHRC();

   @Override
   public Set<Entry<K, V>> entries() {
      return this.CHOHRIIOROOOOIRIORHRCCHRIOCHRC().entries();
   }

   @Override
   public Set<V> get(@Nullable K var1) {
      return this.CHOHRIIOROOOOIRIORHRCCHRIOCHRC().get((K)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public Set<V> removeAll(@Nullable Object var1) {
      return this.CHOHRIIOROOOOIRIORHRCCHRIOCHRC().removeAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public Set<V> replaceValues(K var1, Iterable<? extends V> var2) {
      return this.CHOHRIIOROOOOIRIORHRCCHRIOCHRC().replaceValues((K)var1, var2);
   }
}
