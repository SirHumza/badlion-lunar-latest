package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
final class IIIRHHOCRRRCOHCHCRIHRCOOIRRHCH<K, V> extends OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> {
   private final transient Map<K, V> IRHIHOCIRIOIROCOCOCIHICHCIOCHC;
   private final transient COIRRRCIORROCHIROCHROCHICCICIC<Entry<K, V>> IRCIOOIRIRIROIHRHHOHORCCOIROCI;

   static <K, V> OOHRIIOOHROIOHCIRIHRHRRICRRHOI<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(int var0, Entry<K, V>[] var1) {
      HashMap var2 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newHashMapWithExpectedSize(var0);

      for (int var3 = 0; var3 < var0; var3++) {
         var1[var3] = CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var1[var3]);
         Object var4 = var2.putIfAbsent(var1[var3].getKey(), var1[var3].getValue());
         if (var4 != null) {
            throw conflictException("key", var1[var3], var1[var3].getKey() + "=" + var4);
         }
      }

      return new IIIRHHOCRRRCOHCHCRIHRCOOIRRHCH<>(var2, COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var0));
   }

   IIIRHHOCRRRCOHCHCRIHRCOOIRRHCH(Map<K, V> var1, COIRRRCIORROCHIROCHROCHICCICIC<Entry<K, V>> var2) {
      this.IRHIHOCIRIOIROCOCOCIHICHCIOCHC = var1;
      this.IRCIOOIRIRIROIHRHHOHORCCOIROCI = var2;
   }

   @Override
   public int size() {
      return this.IRCIOOIRIRIROIHRHHOHORCCOIROCI.size();
   }

   @Override
   public V get(@Nullable Object var1) {
      return this.IRHIHOCIRIOIROCOCOCIHICHCIOCHC.get(var1);
   }

   @Override
   CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<K, V>> RRICCHOHRROROIOOHHIHHCCCRHOCCH() {
      return new OCIOROHIHRROROOIRRHRRCCHHRRRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(this, this.IRCIOOIRIRIROIHRHHOHORCCOIROCI);
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );
      this.IRCIOOIRIRIROIHRHHOHORCCOIROCI.forEach(var1x -> var1.accept(var1x.getKey(), var1x.getValue()));
   }

   @Override
   CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> OIROICOICCHRROOIOOCCCIOCOIIORO() {
      return new RHRCRCIOIOICRHRCCROIICCRRCOOOI<>(this);
   }

   @Override
   OIICIRRCOOCIHRHOIOIOOROCRHCHIC<V> ROIOIICCRHHHCHIHHIRIRRHHRHCROC() {
      return new HORHCHIIOCRROHOHRCORCCICCRCCHO<>(this);
   }

   @Override
   boolean isPartialView() {
      return false;
   }
}
