package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Spliterator;
import java.util.function.Consumer;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
final class CIIHHCHIRCRRIHOIOCCCROHOIOCCII<E extends Enum<E>> extends CICOIHIRIIHHCIOICHRHICRIRCIOHC<E> {
   private final transient EnumSet<E> ROCIIOCHIRHIHHRHCROCIROIRICICI;
   @LazyInit
   private transient int hashCode;

   static CICOIHIRIIHHCIOICHRHICRIRCIOHC RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EnumSet var0) {
      switch (var0.size()) {
         case 0:
            return CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI();
         case 1:
            return CICOIHIRIIHHCIOICHRHICRIRCIOHC.RROIIRROOOOHIORHRICHOCHIHCRRCH(IRIHOIRCHIRRCRIOORCOICORHHORHH.getOnlyElement(var0));
         default:
            return new CIIHHCHIRCRRIHOIOCCCROHOIOCCII(var0);
      }
   }

   private CIIHHCHIRCRRIHOIOCCCROHOIOCCII(EnumSet<E> var1) {
      this.ROCIIOCHIRHIHHRHCROCIROIRICICI = var1;
   }

   @Override
   boolean isPartialView() {
      return false;
   }

   @Override
   public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<E> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.ROCIIOCHIRHIHHRHCROCIROIRICICI.iterator());
   }

   @Override
   public Spliterator<E> spliterator() {
      return this.ROCIIOCHIRHIHHRHCROCIROIRICICI.spliterator();
   }

   @Override
   public void forEach(Consumer<? super E> var1) {
      this.ROCIIOCHIRHIHHRHCROCIROIRICICI.forEach(var1);
   }

   @Override
   public int size() {
      return this.ROCIIOCHIRHIHHRHCROCIROIRICICI.size();
   }

   @Override
   public boolean contains(Object var1) {
      return this.ROCIIOCHIRHIHHRHCROCIROIRICICI.contains(var1);
   }

   @Override
   public boolean containsAll(Collection<?> var1) {
      if (var1 instanceof CIIHHCHIRCRRIHOIOCCCROHOIOCCII) {
         var1 = ((CIIHHCHIRCRRIHOIOCCCROHOIOCCII)var1).ROCIIOCHIRHIHHRHCROCIROIRICICI;
      }

      return this.ROCIIOCHIRHIHHRHCROCIROIRICICI.containsAll(var1);
   }

   @Override
   public boolean isEmpty() {
      return this.ROCIIOCHIRHIHHRHCROCIROIRICICI.isEmpty();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (var1 instanceof CIIHHCHIRCRRIHOIOCCCROHOIOCCII) {
         var1 = ((CIIHHCHIRCRRIHOIOCCCROHOIOCCII)var1).ROCIIOCHIRHIHHRHCROCIROIRICICI;
      }

      return this.ROCIIOCHIRHIHHRHCROCIROIRICICI.equals(var1);
   }

   @Override
   boolean isHashCodeFast() {
      return true;
   }

   @Override
   public int hashCode() {
      int var1 = this.hashCode;
      return var1 == 0 ? (this.hashCode = this.ROCIIOCHIRHIHHRHCROCIROIRICICI.hashCode()) : var1;
   }

   @Override
   public String toString() {
      return this.ROCIIOCHIRHIHHRHCROCIROIRICICI.toString();
   }

   @Override
   Object writeReplace() {
      return new CIIHHCHIRCRRIHOIOCCCROHOIOCCII.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(this.ROCIIOCHIRHIHHRHCROCIROIRICICI);
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<E extends Enum<E>> implements Serializable {
      final EnumSet<E> HCCORHCHHOIRRIHCIOHOHCRCRIRHOI;
      private static final long OHRRIIRRROHHIHICROCRCIHIICORHR = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EnumSet<E> var1) {
         this.HCCORHCHHOIRRIHCIOHOHCRCRIRHOI = var1;
      }

      Object readResolve() {
         return new CIIHHCHIRCRRIHOIOCCCROHOIOCCII(this.HCCORHCHHOIRRIHCIOHOHCRCRIRHOI.clone());
      }
   }
}
