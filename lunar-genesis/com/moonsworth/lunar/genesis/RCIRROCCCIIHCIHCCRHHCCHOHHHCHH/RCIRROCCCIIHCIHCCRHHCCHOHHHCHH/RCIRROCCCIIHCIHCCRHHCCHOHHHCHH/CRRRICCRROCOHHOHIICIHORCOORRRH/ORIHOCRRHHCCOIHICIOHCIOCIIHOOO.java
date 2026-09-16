package com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.checkerframework.checker.nullness.qual.Nullable;

@com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
   serializable = true,
   emulated = true
)
class ORIHOCRRHHCCOIHICIOHCIOCIIHOOO<K, V> extends ICOHIIIRCIORCORHRRROOOOCOOROIC<K, V> {
   static final ORIHOCRRHHCCOIHICIOHCIOCIIHOOO<Object, Object> ICRIICIROIOOHRCORIOCCRHIOHOHIH = new ORIHOCRRHHCCOIHICIOHCIOCIIHOOO<>(
      null, null, (Entry<Object, Object>[])OOHRIIOOHROIOHCIRIHRHRRICRRHOI.COOIRRCORCOCCIIICCHCIIIHIHCOCI, 0, 0
   );
   static final double CCHHORHCCCIICCIOOIIHHHRRRHCIIH = 1.2;
   private final transient RHHIOCHRCICCHOHCIHOOHOIHCCHRCO<K, V>[] RIHIICHIOICRROHOHOOHHCIHHCICOH;
   private final transient RHHIOCHRCICCHOHCIHOOHOIHCCHRCO<K, V>[] RHHRCRIROHOHICIOOOCRIROIIRHHCO;
   @com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH
   final transient Entry<K, V>[] CROOCCRRCOROICHCRHHRRRCROICHHI;
   private final transient int IRHCROIHHRIRORHHCRHCHHCRHIHCIC;
   private final transient int OICHOIHCICIOCROHHRICIIIIIROHHH;
   @LazyInit
   @RetainedWith
   private transient ICOHIIIRCIORCORHRRROOOOCOOROIC<V, K> RCHHOOOHOCHHRHOHCHIRIRRIROCCRR;

   static <K, V> ICOHIIIRCIORCORHRRROOOOCOOROIC<K, V> IRCIIHHICIHRCOCRROCOICRIHHCCHH(Entry<K, V>... var0) {
      return HHCCIRHCCCIIRHCROHIORHIRHHIORH(var0.length, var0);
   }

   static <K, V> ICOHIIIRCIORCORHRRROOOOCOOROIC<K, V> HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var0, Entry<K, V>[] var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkPositionIndex(
         var0, var1.length
      );
      int var2 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.closedTableSize(var0, 1.2);
      int var3 = var2 - 1;
      RHHIOCHRCICCHOHCIHOOHOIHCCHRCO[] var4 = RHHIOCHRCICCHOHCIHOOHOIHCCHRCO.IOCCCCOCCCIIOCROHCRIOCCCCHIRHC(var2);
      RHHIOCHRCICCHOHCIHOOHOIHCCHRCO[] var5 = RHHIOCHRCICCHOHCIHOOHOIHCCHRCO.IOCCCCOCCCIIOCROHCRIOCCCCHIRHC(var2);
      Entry[] var6;
      if (var0 == var1.length) {
         var6 = var1;
      } else {
         var6 = RHHIOCHRCICCHOHCIHOOHOIHCCHRCO.IOCCCCOCCCIIOCROHCRIOCCCCHIRHC(var0);
      }

      int var7 = 0;

      for (int var8 = 0; var8 < var0; var8++) {
         Entry var9 = var1[var8];
         Object var10 = var9.getKey();
         Object var11 = var9.getValue();
         ICICIOCHHHIHOCHCOHORIHRCOHHOCR.checkEntryNotNull(var10, var11);
         int var12 = var10.hashCode();
         int var13 = var11.hashCode();
         int var14 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smear(var12) & var3;
         int var15 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smear(var13) & var3;
         RHHIOCHRCICCHOHCIHOOHOIHCCHRCO var16 = var4[var14];
         int var17 = CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var10, var9, var16);
         RHHIOCHRCICCHOHCIHOOHOIHCCHRCO var18 = var5[var15];
         int var19 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var11, var9, var18);
         if (var17 > 8 || var19 > 8) {
            return RICHHRCCHRIICHROOROCCICOIRRHCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, var1);
         }

         RHHIOCHRCICCHOHCIHOOHOIHCCHRCO var20 = var18 == null && var16 == null
            ? CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, var10, var11)
            : new RHHIOCHRCICCHOHCIHOOHOIHCCHRCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH<>(var10, var11, var16, var18);
         var4[var14] = var20;
         var5[var15] = var20;
         var6[var8] = var20;
         var7 += var12 ^ var13;
      }

      return new ORIHOCRRHHCCOIHICIOHCIOCIIHOOO<>(var4, var5, var6, var3, var7);
   }

   private ORIHOCRRHHCCOIHICIOHCIOCIIHOOO(
      RHHIOCHRCICCHOHCIHOOHOIHCCHRCO<K, V>[] var1, RHHIOCHRCICCHOHCIHOOHOIHCCHRCO<K, V>[] var2, Entry<K, V>[] var3, int var4, int var5
   ) {
      this.RIHIICHIOICRROHOHOOHHCIHHCICOH = var1;
      this.RHHRCRIROHOHICIOOOCRIROIIRHHCO = var2;
      this.CROOCCRRCOROICHCRHHRRRCROICHHI = var3;
      this.IRHCROIHHRIRORHHCRHCHHCRHIHCIC = var4;
      this.OICHOIHCICIOCROHHRICIIIIIROHHH = var5;
   }

   @CanIgnoreReturnValue
   private static int RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Object var0, Entry<?, ?> var1, @Nullable RHHIOCHRCICCHOHCIHOOHOIHCCHRCO<?, ?> var2) {
      int var3 = 0;

      while (var2 != null) {
         checkNoConflict(!var0.equals(var2.getValue()), "value", var1, var2);
         var3++;
         var2 = var2.IHIROOROCRIRCICRRHRRRIIRIHRIRR();
      }

      return var3;
   }

   @Override
   public @Nullable V get(@Nullable Object var1) {
      return this.RIHIICHIOICRROHOHOOHHCIHHCICOH == null
         ? null
         : CIIRCHOCCHCHOOHIIICOCIIRCCCCOH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, this.RIHIICHIOICRROHOHOOHHCIHHCICOH, this.IRHCROIHHRIRORHHCRHCHHCRHIHCIC);
   }

   @Override
   CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<K, V>> RRICCHOHRROROIOOHHIHHCCCRHOCCH() {
      return this.isEmpty()
         ? CICOIHIRIIHHCIOICHRHICRIRCIOHC.CRROCHIORCOCORIRRHOICICCIIORHI()
         : new OCIOROHIHRROROOIRRHRRCCHHRRRHI.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(this, this.CROOCCRRCOROICHCRHHRRRCROICHHI);
   }

   @Override
   CICOIHIRIIHHCIOICHRHICRIRCIOHC<K> OIROICOICCHRROOIOOCCCIOCOIIORO() {
      return new RHRCRCIOIOICRHRCCROIICCRRCOOOI<>(this);
   }

   @Override
   public void forEach(BiConsumer<? super K, ? super V> var1) {
      com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
         var1
      );

      for (Entry var5 : this.CROOCCRRCOROICHCRHHRRRCROICHHI) {
         var1.accept(var5.getKey(), var5.getValue());
      }
   }

   @Override
   boolean isHashCodeFast() {
      return true;
   }

   @Override
   public int hashCode() {
      return this.OICHOIHCICIOCROHHRICIIIIIROHHH;
   }

   @Override
   boolean isPartialView() {
      return false;
   }

   @Override
   public int size() {
      return this.CROOCCRRCOROICHCRHHRRRCROICHHI.length;
   }

   @Override
   public ICOHIIIRCIORCORHRRROOOOCOOROIC<V, K> RCCCRORORHCIOHCOORHOHOCHOCHIIC() {
      if (this.isEmpty()) {
         return ICOHIIIRCIORCORHRRROOOOCOOROIC.ORIIIHOIIROCHCIHCCCHRHOORCICHH();
      }

      ICOHIIIRCIORCORHRRROOOOCOOROIC var1 = this.RCHHOOOHOCHHRHOHCHIRIRRIROCCRR;
      return var1 == null ? (this.RCHHOOOHOCHHRHOHCHIRIRRIROCCRR = new ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH()) : var1;
   }

   private static class IRCIIHHICIHRCOCRROCOICRIHHCCHH<K, V> implements Serializable {
      private final ICOHIIIRCIORCORHRRROOOOCOOROIC<K, V> IORRHOCROHHCHHIHCOIIIRIRRHOCIC;
      private static final long CORHRORROCICHRCROHIRHHICOHRIOR = 1L;

      IRCIIHHICIHRCOCRROCOICRIHHCCHH(ICOHIIIRCIORCORHRRROOOOCOOROIC<K, V> var1) {
         this.IORRHOCROHHCHHIHCOIIIRIRRHOCIC = var1;
      }

      Object readResolve() {
         return this.IORRHOCROHHCHHIHCOIIIRIRRHOCIC.RCCCRORORHCIOHCOORHOHOCHOCHIIC();
      }
   }

   private final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends ICOHIIIRCIORCORHRRROOOOCOOROIC<V, K> {
      private RCIRROCCCIIHCIHCCRHHCCHOHHHCHH() {
      }

      @Override
      public int size() {
         return this.RCCCRORORHCIOHCOORHOHOCHOCHIIC().size();
      }

      @Override
      public ICOHIIIRCIORCORHRRROOOOCOOROIC<K, V> RCCCRORORHCIOHCOORHOHOCHOCHIIC() {
         return ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.this;
      }

      @Override
      public void forEach(BiConsumer<? super V, ? super K> var1) {
         com.moonsworth.lunar.genesis.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.checkNotNull(
            var1
         );
         ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.this.forEach((var1x, var2) -> var1.accept(var2, var1x));
      }

      @Override
      public K get(@Nullable Object var1) {
         if (var1 != null && ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.this.RHHRCRIROHOHICIOOOCRIROIIRHHCO != null) {
            int var2 = IRRCHICCRHCHRRCHIOHIIRIORIRHRI.smear(var1.hashCode()) & ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.this.IRHCROIHHRIRORHHCRHCHHCRHIHCIC;

            for (RHHIOCHRCICCHOHCIHOOHOIHCCHRCO var3 = ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.this.RHHRCRIROHOHICIOOOCRIROIIRHHCO[var2];
               var3 != null;
               var3 = var3.IHIROOROCRIRCICRRHRRRIIRIHRIRR()
            ) {
               if (var1.equals(var3.getValue())) {
                  return (K)var3.getKey();
               }
            }

            return null;
         } else {
            return null;
         }
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC<V> OIROICOICCHRROOIOOCCCIOCOIIORO() {
         return new RHRCRCIOIOICRHRCCROIICCRRCOOOI<>(this);
      }

      @Override
      CICOIHIRIIHHCIOICHRHICRIRCIOHC<Entry<V, K>> RRICCHOHRROROIOOHHIHHCCCRHOCCH() {
         return new ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      }

      @Override
      boolean isPartialView() {
         return false;
      }

      @Override
      Object writeReplace() {
         return new ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH<>(ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.this);
      }

      final class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends OCIOROHIHRROROOIRRHRRCCHHRRRHI<V, K> {
         @Override
         OOHRIIOOHROIOHCIRIHRHRRICRRHOI<V, K> RRRICORCCRIOORIIRIHOICHIHCHROC() {
            return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this;
         }

         @Override
         boolean isHashCodeFast() {
            return true;
         }

         @Override
         public int hashCode() {
            return ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.this.OICHOIHCICIOCROHHRICIIIIIROHHH;
         }

         @Override
         public IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<V, K>> IOHOCICRRIRHHCCCRICOCOHOIIOCRH() {
            return (IRRCHIRICCIHCCIHOHRCHRHRHCRCOH<Entry<V, K>>)this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().IOHOCICRRIRHHCCCRICOCOHOIIOCRH();
         }

         @Override
         public void forEach(Consumer<? super Entry<V, K>> var1) {
            this.OHOOIHCOHHORHICHIOROIRIHCOOCRR().forEach(var1);
         }

         @Override
         COIRRRCIORROCHIROCHROCHICCICIC<Entry<V, K>> RHRRCOIHRICOCRRIHRRRCHRHOCICCC() {
            return new ICCIIIRHHOOIHCCHIRRCRHICHIHRIH<Entry<V, K>>() {
               public Entry<V, K> get(int var1) {
                  Entry var2 = ORIHOCRRHHCCOIHICIOHCIOCIIHOOO.this.CROOCCRRCOROICHCRHHRRRCROICHHI[var1];
                  return ROCHRRCORRCOOOOOCOICOCROIIHIHH.immutableEntry((V)var2.getValue(), (K)var2.getKey());
               }

               @Override
               OIICIRRCOOCIHRHOIOIOOROCRHCHIC<Entry<V, K>> RRRCRHCROCCIHOOCCRORHIIIHHCOHO() {
                  return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.this;
               }
            };
         }
      }
   }
}
