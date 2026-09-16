package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface RCRCCORIIOICRIIRHCCIIOCICRHIOC<K, V> extends CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> {
   Set<V> get(@Nullable K var1);

   @CanIgnoreReturnValue
   Set<V> removeAll(@Nullable Object var1);

   @CanIgnoreReturnValue
   Set<V> replaceValues(K var1, Iterable<? extends V> var2);

   Set<Entry<K, V>> entries();

   @Override
   Map<K, Collection<V>> asMap();

   @Override
   boolean equals(@Nullable Object var1);
}
