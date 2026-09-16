package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Spliterator;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
final class HCHHOOOCRCRHHICHICORHOCHCCCHRH<K extends Enum<K>, V> extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> {
   private final transient EnumMap<K, V> COIHICRCORCRCICORCRCROOHOICIIO;

   static <K extends Enum<K>, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(EnumMap<K, V> var0) {
      switch (var0.size()) {
         case 0:
            return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.RIOCOIOOIIRHOROHOCHHOORRCCOIHR();
         case 1:
            Entry var1 = IRIHOIRCHIRRCRIOORCOICORHHORHH.getOnlyElement(var0.entrySet());
            return OOHRIIOOHROIOHCIRIHRHRRICRRHOI.HHRIICOIOORCHCOIICOOIHIRHHICRI((K)var1.getKey(), (V)var1.getValue());
         default:
            return new HCHHOOOCRCRHHICHICORHOCHCCCHRH<>(var0);
      }
   }

   private HCHHOOOCRCRHHICHICORHOCHCCCHRH(EnumMap<K, V> var1) {
      this.COIHICRCORCRCICORCRCROOHOICIIO = var1;
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkArgument(
         !var1.isEmpty()
      );
   }

   @Override
   IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<K> IIRICOHOOCCCRRORCOHIROCRCHIHHO() {
      return HRCROCOHHHICRHIHHOOCIIRRRCCIRR.CIOHHCORHRCCRICCCORIHCRHCCCRRR(this.COIHICRCORCRCICORCRCROOHOICIIO.keySet().iterator());
   }

   @Override
   Spliterator<K> keySpliterator() {
      return this.COIHICRCORCRCICORCRCROOHOICIIO.keySet().spliterator();
   }

   @Override
   public int size() {
      return this.COIHICRCORCRCICORCRCROOHOICIIO.size();
   }

   @Override
   public boolean containsKey(@Nullable Object var1) {
      return this.COIHICRCORCRCICORCRCROOHOICIIO.containsKey(var1);
   }

   @Override
   public V get(Object var1) {
      return this.COIHICRCORCRCICORCRCROOHOICIIO.get(var1);
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (var1 instanceof HCHHOOOCRCRHHICHICORHOCHCCCHRH) {
         var1 = ((HCHHOOOCRCRHHICHICORHOCHCCCHRH)var1).COIHICRCORCRCICORCRCROOHOICIIO;
      }

      return this.COIHICRCORCRCICORCRCROOHOICIIO.equals(var1);
   }

   @Override
   IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<K, V>> HCRRIORCRRIORHRCIOHHCIHORRCHII() {
      return ROCHRRCORRCOOOOOCOICOCROIIHIHH.IIRHCHHOICHRICOOCRORCCIOOIHOIR(this.COIHICRCORCRCICORCRCROOHOICIIO.entrySet().iterator());
   }

   @Override
   Spliterator<Entry<K, V>> entrySpliterator() {
      return IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.map(this.COIHICRCORCRCICORCRCROOHOICIIO.entrySet().spliterator(), ROCHRRCORRCOOOOOCOICOCROIIHIHH::unmodifiableEntry);
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      this.COIHICRCORCRCICORCRCROOHOICIIO.forEach(var1);
   }

   @Override
   boolean isPartialView() {
      return false;
   }

   @Override
   Object writeReplace() {
      return new HCHHOOOCRCRHHICHICORHOCHCCCHRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(this.COIHICRCORCRCICORCRCROOHOICIIO);
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<K extends Enum<K>, V> implements Serializable {
      final EnumMap<K, V> RORORIRIHCOHHROHIOHRHIIIRRORHI;
      private static final long OCRIRICOHCIRHOOOIIIHICHOCOORHH = 0L;

      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(EnumMap<K, V> var1) {
         this.RORORIRIHCOHHROHIOHRHIIIRRORHI = var1;
      }

      Object readResolve() {
         return new HCHHOOOCRCRHHICHICORHOCHCCCHRH(this.RORORIRIHCOHHROHIOHRHIIIRRORHI);
      }
   }
}
