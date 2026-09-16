package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface IHIRRIIORRHORHRORIHOROIRCORCOO<K, V> extends Map<K, V> {
   @CanIgnoreReturnValue
   @Override
   @Nullable V put(@Nullable K var1, @Nullable V var2);

   @CanIgnoreReturnValue
   @Nullable V forcePut(@Nullable K var1, @Nullable V var2);

   @Override
   void putAll(Map<? extends K, ? extends V> var1);

   Set<V> values();

   IHIRRIIORRHORHRORIHOROIRCORCOO<V, K> HOCCROIICHRHHCOCIICIROCCIHRCOR();
}
