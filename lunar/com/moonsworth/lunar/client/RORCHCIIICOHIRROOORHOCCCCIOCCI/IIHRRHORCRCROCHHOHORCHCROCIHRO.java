package com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI;

import com.google.common.collect.Maps;
import com.moonsworth.lunar.client.util.OOHRIIOOHROIOHCIRIHRHRRICRRHOI;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Supplier;
import lombok.Generated;
import org.jetbrains.annotations.Contract;

public class IIHRRHORCRCROCHHOHORCHCROCIHRO {
   private final Map<String, OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>> IHHIHHCHOORIIORRORHROIHHHRICIH = new HashMap<>();
   private final Int2ObjectMap<Map<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI, int[]>> HORCOOOIIIRORIRHCCHHHHIROOCHRI = new Int2ObjectOpenHashMap();

   public int size() {
      return this.IHHIHHCHOORIIORRORHROIHHHRICIH.size();
   }

   public Set<Entry<String, OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>>> entrySet() {
      return this.IHHIHHCHOORIIORRORHROIHHHRICIH.entrySet();
   }

   public <T> OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> RORHHCRORHICRHHCHCOCICIHHOOOIC(String var1) {
      if (this.IHHIHHCHOORIIORRORHROIHHHRICIH.containsKey(var1)) {
         throw new IllegalArgumentException("Trait type with id " + var1 + " already exists!");
      }

      OHHRIOHROOIHOROCIRHCHORIHRRRRI var2 = new OHHRIOHROOIHOROCIRHCHORIHRRRRI(this.IHHIHHCHOORIIORRORHROIHHHRICIH.size());
      this.IHHIHHCHOORIIORRORHROIHHHRICIH.put(var1, var2);
      return var2;
   }

   public <T> OHHRIOHROOIHOROCIRHCHORIHRRRRI<T> IIHRRHORCRCROCHHOHORCHCROCIHRO(
      String var1, Consumer<IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var2
   ) {
      if (this.IHHIHHCHOORIIORRORHROIHHHRICIH.containsKey(var1)) {
         throw new IllegalArgumentException("Trait type with id " + var1 + " already exists!");
      }

      IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      var2.accept(var3);
      OHHRIOHROOIHOROCIRHCHORIHRRRRI var4 = new OHHRIOHROOIHOROCIRHCHORIHRRRRI(this.IHHIHHCHOORIIORRORHROIHHHRICIH.size());
      this.HORCOOOIIIRORIRHCCHHHHIROOCHRI.put(var4.getId(), var3.CIRHORHRORCHCOHIIORRCCHRIIROOI());
      this.IHHIHHCHOORIIORRORHROIHHHRICIH.put(var1, var4);
      return var4;
   }

   public <T, B extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI<T>> com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T, B> RRCRRCORICCHOHHIRCHIROOHIIOHCO(
      String var1, Supplier<B> var2
   ) {
      if (this.IHHIHHCHOORIIORRORHROIHHHRICIH.containsKey(var1)) {
         throw new IllegalArgumentException("Trait type with id " + var1 + " already exists!");
      }

      com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var3 = new com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.IHHIHHCHOORIIORRORHROIHHHRICIH.size(), var2
      );
      this.IHHIHHCHOORIIORRORHROIHHHRICIH.put(var1, var3);
      return var3;
   }

   public <T, B extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI<T>> com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<T, B> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      String var1, Supplier<B> var2, Consumer<IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH> var3
   ) {
      if (this.IHHIHHCHOORIIORRORHROIHHHRICIH.containsKey(var1)) {
         throw new IllegalArgumentException("Trait type with id " + var1 + " already exists!");
      }

      IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var4 = new IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      var3.accept(var4);
      com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var5 = new com.moonsworth.lunar.client.RORCHCIIICOHIRROOORHOCCCCIOCCI.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         this.IHHIHHCHOORIIORRORHROIHHHRICIH.size(), var2
      );
      this.HORCOOOIIIRORIRHCCHHHHIROOCHRI.put(var5.getId(), var4.CIRHORHRORCHCOHIIORRCCHRIIROOI());
      this.IHHIHHCHOORIIORRORHROIHHHRICIH.put(var1, var5);
      return var5;
   }

   @Generated
   public Int2ObjectMap<Map<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI, int[]>> RCIHRIHHOHCCCCHOHROIOICHRIHCCH() {
      return this.HORCOOOIIIRORIRHCCHHHHIROOCHRI;
   }

   public static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
      private final EnumMap<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI, List<OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>>> RIHRIROOOIHHIIORCOCIICORIICORH = new EnumMap<>(
         RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class
      );

      @Contract("_ -> this")
      public IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>... var1) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CONFLICTS, var1);
         return this;
      }

      @Contract("_ -> this")
      public IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH IRCIIHHICIHRCOCRROCOICRIHHCCHH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>... var1) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.REQUIRES, var1);
         return this;
      }

      @Contract("_ -> this")
      public IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH HHCCIRHCCCIIRHCROHIORHIRHHIORH(OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>... var1) {
         this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.REMOVE, var1);
         return this;
      }

      private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI var1, OHHRIOHROOIHOROCIRHCHORIHRRRRI<?>... var2) {
         this.RIHRIROOOIHHIIORCOCIICORIICORH.computeIfAbsent(var1, var0 -> new ArrayList<>()).addAll(List.of(var2));
      }

      final Map<RIOOCHICIHRHOHCCCCCHOCCCOHCRHI, int[]> CIRHORHRORCHCOHIIORRCCHRIIROOI() {
         EnumMap var1 = new EnumMap<>(RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.class);

         for (Entry var3 : this.RIHRIROOOIHHIIORCOCIICORIICORH.entrySet()) {
            var1.put((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var3.getKey(), ((List)var3.getValue()).stream().mapToInt(OHHRIOHROOIHOROCIRHCHORIHRRRRI::getId).toArray());
         }

         return Maps.immutableEnumMap(var1);
      }
   }
}
