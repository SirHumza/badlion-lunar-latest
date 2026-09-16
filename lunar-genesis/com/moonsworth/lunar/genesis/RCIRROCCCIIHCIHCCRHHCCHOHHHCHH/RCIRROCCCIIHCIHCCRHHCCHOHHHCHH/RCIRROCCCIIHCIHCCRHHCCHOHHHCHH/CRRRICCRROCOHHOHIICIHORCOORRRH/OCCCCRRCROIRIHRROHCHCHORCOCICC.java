package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.concurrent.LazyInit;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
final class OCCCCRRCROIRIHRROHCHCHORCOCICC<E> extends CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> {
   final transient E COOHOHIIIOOCCRCOOCOROORROHORIO;
   @LazyInit
   private transient int cachedHashCode;

   OCCCCRRCROIRIHRROHCHCHORCOCICC(E var1) {
      this.COOHOHIIIOOCCRCOOCOROORROHORIO = com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         (E)var1
      );
   }

   OCCCCRRCROIRIHRROHCHCHORCOCICC(E var1, int var2) {
      this.COOHOHIIIOOCCRCOOCOROORROHORIO = (E)var1;
      this.cachedHashCode = var2;
   }

   @Override
   public int size() {
      return 1;
   }

   @Override
   public boolean contains(Object var1) {
      return this.COOHOHIIIOOCCRCOOCOROORROHORIO.equals(var1);
   }

   @Override
   public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.IOROHHOIORHORCOHRHCCHCRHOCHCCI(this.COOHOHIIIOOCCRCOOCOROORROHORIO);
   }

   @Override
   COIRRRCIORROCHIROCHROCHICCICIC<E> RHRRCOIHRICOCRRIHRRRCHRHOCICCC() {
      return COIRRRCIORROCHIROCHROCHICCICIC.HOIIRIHOHCRIHOOHRCRCRCRRHIHRCO(this.COOHOHIIIOOCCRCOOCOROORROHORIO);
   }

   @Override
   boolean isPartialView() {
      return false;
   }

   @Override
   int copyIntoArray(Object[] var1, int var2) {
      var1[var2] = this.COOHOHIIIOOCCRCOOCOROORROHORIO;
      return var2 + 1;
   }

   @Override
   public final int hashCode() {
      int var1 = this.cachedHashCode;
      if (var1 == 0) {
         this.cachedHashCode = var1 = this.COOHOHIIIOOCCRCOOCOROORROHORIO.hashCode();
      }

      return var1;
   }

   @Override
   boolean isHashCodeFast() {
      return this.cachedHashCode != 0;
   }

   @Override
   public String toString() {
      return '[' + this.COOHOHIIIOOCCRCOOCOROORROHORIO.toString() + ']';
   }
}
