package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface ROIHROCROORRCCOIRRIHHORCROOORO<K, V> extends RCRCCORIIOICRIIRHCCIIOCICRHIOC<K, V> {
   SortedSet<V> get(@Nullable K var1);

   @CanIgnoreReturnValue
   SortedSet<V> removeAll(@Nullable Object var1);

   @CanIgnoreReturnValue
   SortedSet<V> replaceValues(K var1, Iterable<? extends V> var2);

   @Override
   Map<K, Collection<V>> asMap();

   Comparator<? super V> valueComparator();
}
