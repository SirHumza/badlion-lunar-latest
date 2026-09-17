package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   emulated = true
)
final class RICHHRCCHRIICHROOROCCICOIRRHCR<K, V> extends ICOHIIIRCIORCORHRRROOOOCOOROIC<K, V> {
   private final transient COIRRRCIORROCHIROCHROCHICCICIC<Entry<K, V>> OIOOHRIOCIHRCORCHROCRRIRCOHICO;
   private final Map<K, V> CRRRORHOOCHCHIHRIRRICHOIIOCCIO;
   private final Map<V, K> IIHOOHOCCHCHOHICRIHIIOIHORIOIR;
   @LazyInit
   @RetainedWith
   private transient RICHHRCCHRIICHROOROCCICOIRRHCR<V, K> CHICRRIIHIOCOCRCRHCCCIRCICHIOO;

   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   static <K, V> ICOHIIIRCIORCORHRRROOOOCOOROIC<K, V> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(int var0, Entry<K, V>[] var1) {
      HashMap var2 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newHashMapWithExpectedSize(var0);
      HashMap var3 = ROCHRRCORRCOOOOOCOICOCROIIHIHH.newHashMapWithExpectedSize(var0);

      for (int var4 = 0; var4 < var0; var4++) {
         RHHIOCHRCICCHOHCIHOOHOIHCCHRCO var5 = CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH(var1[var4]);
         var1[var4] = var5;
         Object var6 = var2.putIfAbsent(var5.getKey(), var5.getValue());
         if (var6 != null) {
            throw conflictException("key", var5.getKey() + "=" + var6, var1[var4]);
         }

         Object var7 = var3.putIfAbsent(var5.getValue(), var5.getKey());
         if (var7 != null) {
            throw conflictException("value", var7 + "=" + var5.getValue(), var1[var4]);
         }
      }

      COIRRRCIORROCHIROCHROCHICCICIC var8 = COIRRRCIORROCHIROCHROCHICCICIC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, var0);
      return new RICHHRCCHRIICHROOROCCICOIRRHCR<>(var8, var2, var3);
   }

   private RICHHRCCHRIICHROOROCCICOIRRHCR(COIRRRCIORROCHIROCHROCHICCICIC<Entry<K, V>> var1, Map<K, V> var2, Map<V, K> var3) {
      this.OIOOHRIOCIHRCORCHROCRRIRCOHICO = var1;
      this.CRRRORHOOCHCHIHRIRRICHOIIOCCIO = var2;
      this.IIHOOHOCCHCHOHICRIHIIOIHORIOIR = var3;
   }

   @Override
   public int size() {
      return this.OIOOHRIOCIHRCORCHROCRRIRCOHICO.size();
   }

   @Override
   public ICOHIIIRCIORCORHRRROOOOCOOROIC<V, K> RCCCRORORHCIOHCOORHOHOCHOCHIIC() {
      RICHHRCCHRIICHROOROCCICOIRRHCR var1 = this.CHICRRIIHIOCOCRCRHCCCIRCICHIOO;
      if (var1 == null) {
         this.CHICRRIIHIOCOCRCRHCCCIRCICHIOO = var1 = new RICHHRCCHRIICHROOROCCICOIRRHCR<>(
            new RICHHRCCHRIICHROOROCCICOIRRHCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(), this.IIHOOHOCCHCHOHICRIHIIOIHORIOIR, this.CRRRORHOOCHCHIHRIRRICHOIIOCCIO
         );
         var1.CHICRRIIHIOCOCRCRHCCCIRCICHIOO = (RICHHRCCHRIICHROOROCCICOIRRHCR<V, K>)this;
      }

      return var1;
   }

   @Override
   public V get(@Nullable Object var1) {
      return this.CRRRORHOOCHCHIHRIRRICHOIIOCCIO.get(var1);
   }

   @Override
   CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<K, V>> RRICCHOHRROROIOOHHIHHCCCRHOCCH() {
      return new OCIOROHIHRROROOIRRHRRCCHHRRRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(this, this.OIOOHRIOCIHRCORCHROCRRIRCOHICO);
   }

   @Override
   CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> OIROICOICCHRROOIOOCCCIOCOIIORO() {
      return new RHRCRCIOIOICRHRCCROIICCRRCOOOI<>(this);
   }

   @Override
   boolean isPartialView() {
      return false;
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends COIRRRCIORROCHIROCHROCHICCICIC<Entry<V, K>> {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      public Entry<V, K> get(int var1) {
         Entry var2 = RICHHRCCHRIICHROOROCCICOIRRHCR.this.OIOOHRIOCIHRCORCHROCRRIRCOHICO.get(var1);
         return ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((V)var2.getValue(), (K)var2.getKey());
      }

      @Override
      boolean isPartialView() {
         return false;
      }

      @Override
      public int size() {
         return RICHHRCCHRIICHROOROCCICOIRRHCR.this.OIOOHRIOCIHRCORCHROCRRIRCOHICO.size();
      }
   }
}
