package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Comparator;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class IHRHHHORORIROOCORCIORRCOCHHHRI<K, V> extends IICCOOCHCHROORHHIIHROHCCRHRCOR<K, V> implements ROIHROCROORRCCOIRRIHHORCROOORO<K, V> {
   protected IHRHHHORORIROOCORCIORRCOCHHHRI() {
   }

   protected abstract ROIHROCROORRCCOIRRIHHORCROOORO<K, V> ICIIOIIORORHICHCRCOCIHOHOCHHCC();

   @Override
   public SortedSet<V> get(@Nullable K var1) {
      return this.ICIIOIIORORHICHCRCOCIHOHOCHHCC().get((K)var1);
   }

   @Override
   public SortedSet<V> removeAll(@Nullable Object var1) {
      return this.ICIIOIIORORHICHCRCOCIHOHOCHHCC().removeAll(var1);
   }

   @Override
   public SortedSet<V> replaceValues(K var1, Iterable<? extends V> var2) {
      return this.ICIIOIIORORHICHCRCOCIHOHOCHHCC().replaceValues((K)var1, var2);
   }

   @Override
   public Comparator<? super V> valueComparator() {
      return this.ICIIOIIORORHICHCRCOCIHOHOCHHCC().valueComparator();
   }
}
