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

final class RCCCROCHCICCROHCOCCRRROCIIHCCH<N, E> extends RIOOCHICIHRHOHCCCCCHOCCCOHCRHI<N, E> {
   @LazyInit
   private transient Reference<CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<N>> adjacentNodesReference;

   private RCCCROCHCICCROHCOCCRRROCIIHCCH(Map<E, N> var1) {
      super(var1);
   }

   static <N, E> RCCCROCHCICCROHCOCCRRROCIIHCCH<N, E> OIHIRHROOOCRHHCCRICHRHIIHRIIHO() {
      return new RCCCROCHCICCROHCOCCRRROCIIHCCH<>(new HashMap<>(2, 1.0F));
   }

   static <N, E> RCCCROCHCICCROHCOCCRRROCIIHCCH<N, E> IOIOHIORIROHRRCOOOHCROHORCOIIH(Map<E, N> var0) {
      return new RCCCROCHCICCROHCOCCRRROCIIHCCH<>(OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RCCCROCHCICCROHCOCCRRROCIIHCCH(var0));
   }

   @Override
   public Set<N> adjacentNodes() {
      return Collections.unmodifiableSet(this.OHIROHHCHIRHRROIIOOCHOCOIHRHRI().elementSet());
   }

   private CRIIOOIHIOHHRRRHIOROOCHCHHCCCI<N> OHIROHHCHIRHRROIIOOCHOCOIHRHRI() {
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var1 = getReference(this.adjacentNodesReference);
      if (var1 == null) {
         var1 = OCRCHRHOCCHCHRCORHIHRRRRHCHHCH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.COCROIHHCIIIHRROIIHIRHRHHCCRCI.values());
         this.adjacentNodesReference = new SoftReference<>(var1);
      }

      return var1;
   }

   @Override
   public Set<E> edgesConnecting(final N var1) {
      return new IRCRRHRCIRHIHIHROHCRRHIIHHHHCH<E>(this.COCROIHHCIIIHRROIIHIRHRHHCCRCI, var1) {
         @Override
         public int size() {
            return RCCCROCHCICCROHCOCCRRROCIIHCCH.this.OHIROHHCHIRHRROIIOOCHOCOIHRHRI().count(var1);
         }
      };
   }

   @Override
   public N removeInEdge(E var1, boolean var2) {
      return !var2 ? this.removeOutEdge((E)var1) : null;
   }

   @Override
   public N removeOutEdge(E var1) {
      Object var2 = super.removeOutEdge((E)var1);
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var3 = getReference(this.adjacentNodesReference);
      if (var3 != null) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkState(
            var3.remove(var2)
         );
      }

      return (N)var2;
   }

   @Override
   public void addInEdge(E var1, N var2, boolean var3) {
      if (!var3) {
         this.addOutEdge((E)var1, (N)var2);
      }
   }

   @Override
   public void addOutEdge(E var1, N var2) {
      super.addOutEdge((E)var1, (N)var2);
      CRIIOOIHIOHHRRRHIOROOCHCHHCCCI var3 = getReference(this.adjacentNodesReference);
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
