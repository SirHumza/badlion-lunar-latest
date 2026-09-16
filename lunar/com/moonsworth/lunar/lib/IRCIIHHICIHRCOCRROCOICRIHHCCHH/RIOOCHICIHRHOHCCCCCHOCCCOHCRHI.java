package com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

final class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI implements RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private final com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH RRCHHRHHCHICHORRRIHOICRRIIIIHO;
   private final IdentityHashMap<com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>, Object> OHIIIORCCIICCRCCCRICHCRHCHHOOO;

   RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(
      com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
      IdentityHashMap<com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>, Object> var2
   ) {
      this.RRCHHRHHCHICHORRRIHOICRRIIIIHO = var1;
      this.OHIIIORCCIICCRCCCRICHCRHCHHOOO = new IdentityHashMap<>(var2);
   }

   @Override
   public com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH schema() {
      return this.RRCHHRHHCHICHORRRIHOICRRIIIIHO;
   }

   @Override
   public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> var1) {
      return this.OHIIIORCCIICCRCCCRICHCRHCHHOOO.containsKey(Objects.requireNonNull(var1, "flag"));
   }

   @Override
   public <V> @Nullable V value(com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> var1) {
      Object var2 = var1.IRRCRIOHOHIROOCOROHCCORIROCIHI().type().cast(this.OHIIIORCCIICCRCCCRICHCRHCHHOOO.get(Objects.requireNonNull(var1, "flag")));
      return (V)(var2 == null ? var1.ROIOHIIHHHOOOHHIOOIIRIHCOCCIIH() : var2);
   }

   @Override
   public boolean equals(@Nullable Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var2 = (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1;
         return Objects.equals(this.OHIIIORCCIICCRCCCRICHCRHCHHOOO, var2.OHIIIORCCIICCRCCCRICHCRHCHHOOO);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.OHIIIORCCIICCRCCCRICHCRHCHHOOO);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "{values=" + this.OHIIIORCCIICCRCCCRICHCRHCHHOOO + '}';
   }

   static final class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
      private final com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH CHRIHOIHHCIORHROIRHRHRORROIRRI;
      private final SortedMap<Integer, RRCRRCORICCHOHHIRCHIROOHIIOHCO> OHRRRORCHHHOIHCIRCCIHHHCIICOII;
      private final int IICOHIIRHOICRROOHOOCRHIOCHRCCO;
      private final RRCRRCORICCHOHHIRCHIROOHIIOHCO HHICHCHIIRCHRICORHRRIRIICROIRH;

      HHCCIRHCCCIIRHCROHIORHIRHHIORH(
         com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1,
         SortedMap<Integer, RRCRRCORICCHOHHIRCHIROOHIIOHCO> var2,
         int var3,
         RRCRRCORICCHOHHIRCHIROOHIIOHCO var4
      ) {
         this.CHRIHOIHHCIORHROIRHRHRORROIRRI = var1;
         this.OHRRRORCHHHOIHCIRCCIHHHCIICOII = var2;
         this.IICOHIIRHOICRROOHOOCRHIOCHRCCO = var3;
         this.HHICHCHIIRCHRICORHRRIRIICROIRH = var4;
      }

      @Override
      public com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH schema() {
         return this.CHRIHOIHHCIORHROIRHRHRORROIRRI;
      }

      @Override
      public boolean RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?> var1) {
         return this.HHICHCHIIRCHRICORHRRIRIICROIRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1);
      }

      @Override
      public <V> @Nullable V value(com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> var1) {
         return this.HHICHCHIIRCHRICORHRRIRIICROIRH.value(var1);
      }

      @Override
      public Map<Integer, RRCRRCORICCHOHHIRCHIROOHIIOHCO> HOCHHIRCCOHOHCHIRHIOOHOHCHHICH() {
         return Collections.unmodifiableSortedMap(this.OHRRRORCHHHOIHCIRCCIHHHCIICOII.headMap(this.IICOHIIRHOICRROOHOOCRHIOCHRCCO + 1));
      }

      @Override
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH OCICOIOIIROOCCCHCCCIIROIHCHCHC(int var1) {
         return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            this.CHRIHOIHHCIORHROIRHRHRORROIRRI,
            this.OHRRRORCHHHOIHCIRCCIHHHCIICOII,
            var1,
            RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.CHRIHOIHHCIORHROIRHRHRORROIRRI, this.OHRRRORCHHHOIHCIRCCIHHHCIICOII, var1)
         );
      }

      public static RRCRRCORICCHOHHIRCHIROOHIIOHCO RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var0,
         SortedMap<Integer, RRCRRCORICCHOHHIRCHIROOHIIOHCO> var1,
         int var2
      ) {
         SortedMap var3 = var1.headMap(var2 + 1);
         RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = var0.RIROROHROHIHIICHOHOHICHIOHIHHR();

         for (RRCRRCORICCHOHHIRCHIROOHIIOHCO var6 : var3.values()) {
            var4.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var6);
         }

         return var4.CICRRIRCOICCOIOCCCIIOCCRRIIICI();
      }

      @Override
      public boolean equals(@Nullable Object var1) {
         if (this == var1) {
            return true;
         } else if (var1 != null && this.getClass() == var1.getClass()) {
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = (RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1;
            return this.IICOHIIRHOICRROOHOOCRHIOCHRCCO == var2.IICOHIIRHOICRROOHOOCRHIOCHRCCO
               && Objects.equals(this.CHRIHOIHHCIORHROIRHRHRORROIRRI, var2.CHRIHOIHHCIORHROIRHRHRORROIRRI)
               && Objects.equals(this.OHRRRORCHHHOIHCIRCCIHHHCIICOII, var2.OHRRRORCHHHOIHCIRCCIHHHCIICOII)
               && Objects.equals(this.HHICHCHIIRCHRICORHRRIRIICROIRH, var2.HHICHCHIIRCHRICORHRRIRIICROIRH);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(
            this.CHRIHOIHHCIORHROIRHRHRORROIRRI, this.OHRRRORCHHHOIHCIRCCIHHHCIICOII, this.IICOHIIRHOICRROOHOOCRHIOCHRCCO, this.HHICHCHIIRCHRICORHRRIRIICROIRH
         );
      }

      @Override
      public String toString() {
         return this.getClass().getSimpleName()
            + "{schema="
            + this.CHRIHOIHHCIORHROIRHRHRORROIRRI
            + ", sets="
            + this.OHRRRORCHHHOIHCIRCCIHHHCIICOII
            + ", targetVersion="
            + this.IICOHIIRHOICRROOHOOCRHIOCHRCCO
            + ", filtered="
            + this.HHICHCHIIRCHRICORHRRIRIICROIRH
            + '}';
      }
   }

   static final class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
      private final com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH IRCCHCCRIHICOCHORCOCIIHIROCCCR;
      private final Map<Integer, RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> OHIRIOOOHCCRORRCOOOHORIRIHHOOH = new TreeMap<>();

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
         this.IRCCHCCRIHICOCHORCOCIIHIROCCCR = var1;
      }

      @Override
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH IIIIIIOOIHRHRIRCCCHCHCHCRHHIOI() {
         if (this.OHIRIOOOHCCRORRCOOOHORIRIHHOOH.isEmpty()) {
            return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
               this.IRCCHCCRIHICOCHORCOCIIHIROCCCR, Collections.emptySortedMap(), 0, this.IRCCHCCRIHICOCHORCOCIIHIROCCCR.HRHRRRROIRRCHRICIOIIOCRHCICOHC()
            );
         }

         TreeMap var1 = new TreeMap();

         for (Entry var3 : this.OHIRIOOOHCCRORRCOOOHORIRIHHOOH.entrySet()) {
            var1.put((Integer)var3.getKey(), ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.getValue()).CICRRIRCOICCOIOCCCIIOCCRRIIICI());
         }

         return new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH(
            this.IRCCHCCRIHICOCHORCOCIIHIROCCCR,
            var1,
            (Integer)var1.lastKey(),
            RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               this.IRCCHCCRIHICOCHORCOCIIHIROCCCR, var1, (Integer)var1.lastKey()
            )
         );
      }

      @Override
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         int var1, Consumer<RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2
      ) {
         Objects.requireNonNull(var2, "versionBuilder")
            .accept(
               this.OHIRIOOOHCCRORRCOOOHORIRIHHOOH
                  .computeIfAbsent(var1, var1x -> new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IRCCHCCRIHICOCHORCOCIIHIROCCCR))
            );
         return this;
      }
   }

   static final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH RRCORIRICHCRCORCIHCCROHOHCOORI;
      private final IdentityHashMap<com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>, Object> OHRIOHHCRRIOOOCCRHIIRIOCHCRCRH = new IdentityHashMap<>();

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
         this.RRCORIRICHCRCORCIHCCROHOHCOORI = var1;
      }

      @Override
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO CICRRIRCOICCOIOCCCIIOCCRRIIICI() {
         return this.OHRIOHHCRRIOOOCCRHIIRIOCHCRCRH.isEmpty()
            ? this.RRCORIRICHCRCORCIHCCROHOHCOORI.HRHRRRROIRRCHRICIOIIOCRHCICOHC()
            : new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(this.RRCORIRICHCRCORCIHCCROHOHCOORI, this.OHRIOHHCRRIOOOCCRHIIRIOCHCRCRH);
      }

      @Override
      public <V> RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<V> var1, @Nullable V var2
      ) {
         if (!this.RRCORIRICHCRCORCIHCCROHOHCOORI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Objects.requireNonNull(var1, "option"))) {
            throw new IllegalStateException("Option '" + var1.id() + "' was not present in active schema");
         }

         if (var2 == null) {
            this.OHRIOHHCRRIOOOCCRHIIRIOCHCRCRH.remove(var1);
         } else {
            this.OHRIOHHCRRIOOOCCRHIIRIOCHCRCRH.put(var1, var2);
         }

         return this;
      }

      private void putAll(Map<com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>, Object> var1) {
         for (Entry var3 : var1.entrySet()) {
            if (!this.RRCORIRICHCRCORCIHCCROHOHCOORI
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>)var3.getKey())) {
               throw new IllegalStateException(
                  "Option '"
                     + ((com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var3.getKey()).id()
                     + "' was not present in active schema"
               );
            }

            this.OHRIOHHCRRIOOOCCRHIIRIOCHCRCRH
               .put((com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<?>)var3.getKey(), var3.getValue());
         }
      }

      @Override
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
         if (var1 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI) {
            this.putAll(((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var1).OHIIIORCCIICCRCCCRICHCRHCHHOOO);
         } else {
            if (!(var1 instanceof RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)) {
               throw new IllegalArgumentException("existing set " + var1 + " is of an unknown implementation type");
            }

            this.putAll(
               ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HHCCIRHCCCIIRHCROHIORHIRHHIORH)var1).HHICHCHIIRCHRICORHRRIRIICROIRH).OHIIIORCCIICCRCCCRICHCRHCHHOOO
            );
         }

         return this;
      }

      @Override
      public RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
      ) {
         for (com.moonsworth.lunar.lib.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 : this.RRCORIRICHCRCORCIHCCROHOHCOORI
            .OROCOOHROHICOIROICOCOCIRCCRHIH()) {
            Object var4 = var1.value(var3);
            if (var4 != null) {
               this.OHRIOHHCRRIOOOCCRHIIRIOCHCRCRH.put(var3, var4);
            }
         }

         return this;
      }
   }
}
