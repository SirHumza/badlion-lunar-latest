package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH
abstract class HICHRCOHCCRHOHCICOOCHOIHCCHIRI<C extends Comparable> implements IIOORRCRHCRIORIOCOHHIROOIIHROC<C> {
   @Override
   public boolean contains(C var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((C)var1) != null;
   }

   @Override
   public abstract IIHROHOIOHICCRRHRICHCIHRCROOIO<C> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(C var1);

   @Override
   public boolean isEmpty() {
      return this.asRanges().isEmpty();
   }

   @Override
   public void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIHROHOIOHICCRRHRICHCIHRCROOIO<C> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IIHROHOIOHICCRRHRICHCIHRCROOIO<C> var1) {
      throw new UnsupportedOperationException();
   }

   @Override
   public void clear() {
      this.IRCIIHHICIHRCOCRROCOICRIHHCCHH(IIHROHOIOHICCRRHRICHCIHRCROOIO.OCORIOCROHHRRRICCHCOROROIRICCR());
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IIOORRCRHCRIORIOCOHHIROOIIHROC<C> var1) {
      return this.enclosesAll(var1.asRanges());
   }

   @Override
   public void IRCIIHHICIHRCOCRROCOICRIHHCCHH(IIOORRCRHCRIORIOCOHHIROOIIHROC<C> var1) {
      this.addAll(var1.asRanges());
   }

   @Override
   public void HHCCIRHCCCIIRHCROHIORHIRHHIORH(IIOORRCRHCRIORIOCOHHIROOIIHROC<C> var1) {
      this.removeAll(var1.asRanges());
   }

   @Override
   public boolean HHCCIRHCCCIIRHCROHIORHIRHHIORH(IIHROHOIOHICCRRHRICHCIHRCROOIO<C> var1) {
      return !this.HICHRCOHCCRHOHCICOOCHOIHCCHIRI(var1).isEmpty();
   }

   @Override
   public abstract boolean CRRRICCRROCOHHOHIICIHORCOORRRH(IIHROHOIOHICCRRHRICHCIHRCROOIO<C> var1);

   @Override
   public boolean equals(@Nullable Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof IIOORRCRHCRIORIOCOHHIROOIIHROC) {
         IIOORRCRHCRIORIOCOHHIROOIIHROC var2 = (IIOORRCRHCRIORIOCOHHIROOIIHROC)var1;
         return this.asRanges().equals(var2.asRanges());
      } else {
         return false;
      }
   }

   @Override
   public final int hashCode() {
      return this.asRanges().hashCode();
   }

   @Override
   public final String toString() {
      return this.asRanges().toString();
   }
}
