package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Collection;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH
public abstract class HOHCCHOIOHOHHOROHOIIHOOHORRHRO<E> extends OOCHRIIIRIHRRCRIORHCROIIHCRRIC<E> implements Set<E> {
   protected HOHCCHOIOHOHHOROHOIIHOOHORRHRO() {
   }

   protected abstract Set<E> delegate();

   @Override
   public boolean equals(@Nullable Object var1) {
      return var1 == this || this.delegate().equals(var1);
   }

   @Override
   public int hashCode() {
      return this.delegate().hashCode();
   }

   @Override
   protected boolean standardRemoveAll(Collection<?> var1) {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.removeAllImpl(
         this,
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         )
      );
   }

   protected boolean standardEquals(@Nullable Object var1) {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.equalsImpl(this, var1);
   }

   protected int standardHashCode() {
      return ICRHCCCCOIICOCHHCRCOOIHICROIHI.hashCodeImpl(this);
   }
}
