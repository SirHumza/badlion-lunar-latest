package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRIIOOIHIOHHRRRHIOROOCHCHHCCCI;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OCRCHRHOCCHCHRCORHIHRRRRHCHHCH;
import com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

final class CRICCOOHHHCHOORCICOCOHIHOIRHOO<N, E> extends IRCIIHHICIHRCOCRROCOICRIHHCCHH<N, E> {
   @LazyInit
   private transient Reference<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<N>> predecessorsReference;
   @LazyInit
   private transient Reference<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<N>> successorsReference;

   private CRICCOOHHHCHOORCICOCOHIHOIRHOO(Map<E, N> var1, Map<E, N> var2, int var3) {
      super(var1, var2, var3);
   }

   static <N, E> CRICCOOHHHCHOORCICOCOHIHOIRHOO<N, E> OIHIHRHHIOHRRORHRHHROCIHIHOHOR() {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO<>(new HashMap<>(2, 1.0F), new HashMap<>(2, 1.0F), 0);
   }

   static <N, E> CRICCOOHHHCHOORCICOCOHIHOIRHOO<N, E> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Map<E, N> var0, Map<E, N> var1, int var2) {
      return new CRICCOOHHHCHOORCICOCOHIHOIRHOO<>(
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCCCROCHCICCROHCOCCRRROCIIHCCH(var0), OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCCCROCHCICCROHCOCCRRROCIIHCCH(var1), var2
      );
   }

   @Override
   public Set<N> predecessors() {
      return Collections.unmodifiableSet(this.HROIHCHHCCCRHOICCICCIIOOIRIHHI().elementSet());
   }

   private CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<N> HROIHCHHCCCRHOICCICCIIOOIRIHHI() {
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var1 = getReference(this.predecessorsReference);
      if (var1 == null) {
         var1 = OCRCHRHOCCHCHRCORHIHRRRRHCHHCH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.COHCCICHIOHOHCIICCCOHOHOCOIORI.values());
         this.predecessorsReference = new SoftReference<>(var1);
      }

      return var1;
   }

   @Override
   public Set<N> successors() {
      return Collections.unmodifiableSet(this.ORIOIRRRHIHCORRCRCIIRHIIIHOCIH().elementSet());
   }

   private CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<N> ORIOIRRRHIHCORRCRCIIRHIIIHOCIH() {
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var1 = getReference(this.successorsReference);
      if (var1 == null) {
         var1 = OCRCHRHOCCHCHRCORHIHRRRRHCHHCH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.CCCRIHCHRHCOHROOICCRIOHIOIHCCH.values());
         this.successorsReference = new SoftReference<>(var1);
      }

      return var1;
   }

   @Override
   public Set<E> edgesConnecting(final N var1) {
      return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<E>(this.CCCRIHCHRHCOHROOICCRIOHIOIHCCH, var1) {
         @Override
         public int size() {
            return CRICCOOHHHCHOORCICOCOHIHOIRHOO.this.ORIOIRRRHIHCORRCRCIIRHIIIHOCIH().count(var1);
         }
      };
   }

   @Override
   public N removeInEdge(E var1, boolean var2) {
      Object var3 = super.removeInEdge((E)var1, var2);
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var4 = getReference(this.predecessorsReference);
      if (var4 != null) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            var4.remove(var3)
         );
      }

      return (N)var3;
   }

   @Override
   public N removeOutEdge(E var1) {
      Object var2 = super.removeOutEdge((E)var1);
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var3 = getReference(this.successorsReference);
      if (var3 != null) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            var3.remove(var2)
         );
      }

      return (N)var2;
   }

   @Override
   public void addInEdge(E var1, N var2, boolean var3) {
      super.addInEdge((E)var1, (N)var2, var3);
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var4 = getReference(this.predecessorsReference);
      if (var4 != null) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            var4.add(var2)
         );
      }
   }

   @Override
   public void addOutEdge(E var1, N var2) {
      super.addOutEdge((E)var1, (N)var2);
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var3 = getReference(this.successorsReference);
      if (var3 != null) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            var3.add(var2)
         );
      }
   }

   private static <T> @Nullable T getReference(@Nullable Reference<T> var0) {
      return (T)(var0 == null ? null : var0.get());
   }
}
