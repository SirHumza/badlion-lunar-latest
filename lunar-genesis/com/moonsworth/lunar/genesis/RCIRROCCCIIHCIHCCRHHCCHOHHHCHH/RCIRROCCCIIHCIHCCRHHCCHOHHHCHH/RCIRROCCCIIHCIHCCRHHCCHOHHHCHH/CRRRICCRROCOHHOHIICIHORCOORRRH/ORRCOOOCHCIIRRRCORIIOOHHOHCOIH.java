package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class ORRCOOOCHCIIRRRCORIIOOHHOHCOIH<K, V> extends IOCIIROIRCOHIRHHHROHCOOHIICIHI<K, V> implements RICHIIOOOHORCHORORHIHIRRHCOOIH<K, V> {
   protected ORRCOOOCHCIIRRRCORIIOOHHOHCOIH() {
   }

   protected abstract RICHIIOOOHORCHORORHIHIRRHCOOIH<K, V> IIRCICHROHCCHHCOHIHIIHRCCRCIOI();

   @Override
   public List<V> get(@Nullable K var1) {
      return this.IIRCICHROHCCHHCOHIHIIHRCCRCIOI().get((K)var1);
   }

   @CanIgnoreReturnValue
   @Override
   public List<V> removeAll(@Nullable Object var1) {
      return this.IIRCICHROHCCHHCOHIHIIHRCCRCIOI().removeAll(var1);
   }

   @CanIgnoreReturnValue
   @Override
   public List<V> replaceValues(K var1, Iterable<? extends V> var2) {
      return this.IIRCICHROHCCHHCOHIHIIHRCCRCIOI().replaceValues((K)var1, var2);
   }
}
