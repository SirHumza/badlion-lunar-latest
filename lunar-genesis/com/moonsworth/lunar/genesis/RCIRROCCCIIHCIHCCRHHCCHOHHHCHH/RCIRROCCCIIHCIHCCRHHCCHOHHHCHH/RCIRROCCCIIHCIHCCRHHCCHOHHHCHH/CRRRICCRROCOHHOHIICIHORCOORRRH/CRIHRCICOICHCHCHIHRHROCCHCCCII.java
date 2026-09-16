package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CompatibleWith;
import com.google.errorprone.annotations.DoNotMock;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@DoNotMock("Use ImmutableMultimap, HashMultimap, or another implementation")
@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public interface CRIHRCICOICHCHCHIHRHROCCHCCCII<K, V> {
   int size();

   boolean isEmpty();

   boolean containsKey(@CompatibleWith("K") @Nullable Object var1);

   boolean containsValue(@CompatibleWith("V") @Nullable Object var1);

   boolean containsEntry(@CompatibleWith("K") @Nullable Object var1, @CompatibleWith("V") @Nullable Object var2);

   @CanIgnoreReturnValue
   boolean put(@Nullable K var1, @Nullable V var2);

   @CanIgnoreReturnValue
   boolean remove(@CompatibleWith("K") @Nullable Object var1, @CompatibleWith("V") @Nullable Object var2);

   @CanIgnoreReturnValue
   boolean putAll(@Nullable K var1, Iterable<? extends V> var2);

   @CanIgnoreReturnValue
   boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(CRIHRCICOICHCHCHIHRHROCCHCCCII<? extends K, ? extends V> var1);

   @CanIgnoreReturnValue
   Collection<V> replaceValues(@Nullable K var1, Iterable<? extends V> var2);

   @CanIgnoreReturnValue
   Collection<V> removeAll(@CompatibleWith("K") @Nullable Object var1);

   void clear();

   Collection<V> get(@Nullable K var1);

   Set<K> keySet();

   CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<K> IOOOCHROIROHCCROIOICROCIIOOIOO();

   Collection<V> values();

   Collection<Entry<K, V>> entries();

   default void forEach(BiConsumer<? super K, ? super V> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.entries().forEach(var1x -> var1.accept(var1x.getKey(), var1x.getValue()));
   }

   Map<K, Collection<V>> asMap();

   @Override
   boolean equals(@Nullable Object var1);

   @Override
   int hashCode();
}
