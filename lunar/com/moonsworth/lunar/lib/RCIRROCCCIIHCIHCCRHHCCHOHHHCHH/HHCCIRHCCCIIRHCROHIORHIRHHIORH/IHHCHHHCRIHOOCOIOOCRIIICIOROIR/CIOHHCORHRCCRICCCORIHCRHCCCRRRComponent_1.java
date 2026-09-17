package com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR;

import java.util.Collection;
import java.util.Map;

public class OCOHORHCROHICRRIHCIHHRRCIHICRI extends CIOHHCORHRCCRICCCORIHCRHCCCRRR {
   private static final long CIOIICCOOOHHRICRRRCRHICIRCOOOI = 1L;

   protected OCOHORHCROHICRRIHCIHHRRCIHICRI(Class<?> var1) {
      this(var1, IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OIRRROOOHCOOCIOIRICHIHCHRCHHIR(), null, null);
   }

   protected OCOHORHCROHICRRIHCIHHRRCIHICRI(
      Class<?> var1,
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var4
   ) {
      this(var1, var2, var3, var4, null, null, false);
   }

   protected OCOHORHCROHICRRIHCIHHRRCIHICRI(CIOHHCORHRCCRICCCORIHCRHCCCRRR var1) {
      super(var1);
   }

   protected OCOHORHCROHICRRIHCIHHRRCIHICRI(
      Class<?> var1,
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var4,
      Object var5,
      Object var6,
      boolean var7
   ) {
      super(var1, var2, var3, var4, (var2 == null ? IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OIRRROOOHCOOCIOIRICHIHCHRCHHIR() : var2).hashCode(), var5, var6, var7);
   }

   protected OCOHORHCROHICRRIHCIHHRRCIHICRI(
      Class<?> var1,
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var4,
      int var5,
      Object var6,
      Object var7,
      boolean var8
   ) {
      super(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static OCOHORHCROHICRRIHCIHHRRCIHICRI CIIRCHOCCHCHOOHIIICOCIIRCCCCOH(Class<?> var0) {
      return new OCOHORHCROHICRRIHCIHHRRCIHICRI(var0, null, null, null, null, null, false);
   }

   @Deprecated
   public static OCOHORHCROHICRRIHCIHHRRCIHICRI CCIHIROCOROHOHCHIOCOCRHCCIORCC(Class<?> var0) {
      if (Map.class.isAssignableFrom(var0)) {
         throw new IllegalArgumentException("Cannot construct SimpleType for a Map (class: " + var0.getName() + ")");
      }

      if (Collection.class.isAssignableFrom(var0)) {
         throw new IllegalArgumentException("Cannot construct SimpleType for a Collection (class: " + var0.getName() + ")");
      }

      if (var0.isArray()) {
         throw new IllegalArgumentException("Cannot construct SimpleType for an array (class: " + var0.getName() + ")");
      }

      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1 = IHHCHHHCRIHOOCOIOOCRIIICIOROIR.OIRRROOOHCOOCIOIRICHIHCHRCHHIR();
      return new OCOHORHCROHICRRIHCIHHRRCIHICRI(var0, var1, RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.getSuperclass(), var1), null, null, null, false);
   }

   @Deprecated
   @Override
   protected com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI IICCOOCHCHROORHHIIHROHCCRHRCOR(
      Class<?> var1
   ) {
      if (this.IIIHIIRCHORHOCIHHOCIHCHCROORHI == var1) {
         return this;
      }

      if (!this.IIIHIIRCHORHOCIHHOCIHCHCROORHI.isAssignableFrom(var1)) {
         return new OCOHORHCROHICRRIHCIHHRRCIHICRI(
            var1,
            this.RHHCHCRORCRROHIRICROROHRCHIRHR,
            this,
            this.RRCHOROROCRRCHCOIIRCCIOCCHCCCH,
            this.RHRHIOHRIRCOHIHOIOHIHHHCIORHRH,
            this.CHRRICCIOOIIHICIHHHHOCROIORHOI,
            this.RRRHICCICCHHIHHRCCCHHORCHHORIH
         );
      }

      Class var2 = var1.getSuperclass();
      if (var2 == this.IIIHIIRCHORHOCIHHOCIHCHCROORHI) {
         return new OCOHORHCROHICRRIHCIHHRRCIHICRI(
            var1,
            this.RHHCHCRORCRROHIRICROROHRCHIRHR,
            this,
            this.RRCHOROROCRRCHCOIIRCCIOCCHCCCH,
            this.RHRHIOHRIRCOHIHOIOHIHHHCIORHRH,
            this.CHRRICCIOOIIHICIHHHHOCROIORHOI,
            this.RRRHICCICCHHIHHRCCCHHORCHHORIH
         );
      }

      if (var2 != null && this.IIIHIIRCHORHOCIHHOCIHCHCROORHI.isAssignableFrom(var2)) {
         com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var9 = this.IICCOOCHCHROORHHIIHROHCCRHRCOR(
            var2
         );
         return new OCOHORHCROHICRRIHCIHHRRCIHICRI(
            var1,
            this.RHHCHCRORCRROHIRICROROHRCHIRHR,
            var9,
            null,
            this.RHRHIOHRIRCOHIHOIOHIHHHCIORHRH,
            this.CHRRICCIOOIIHICIHHHHOCROIORHOI,
            this.RRRHICCICCHHIHHRCCCHHORCHHORIH
         );
      }

      Class[] var3 = var1.getInterfaces();

      for (Class var7 : var3) {
         if (var7 == this.IIIHIIRCHORHOCIHHOCIHCHCROORHI) {
            return new OCOHORHCROHICRRIHCIHHRRCIHICRI(
               var1,
               this.RHHCHCRORCRROHIRICROROHRCHIRHR,
               null,
               new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[]{this},
               this.RHRHIOHRIRCOHIHOIOHIHHHCIORHRH,
               this.CHRRICCIOOIIHICIHHHHOCROIORHOI,
               this.RRRHICCICCHHIHHRCCCHHORCHHORIH
            );
         }

         if (this.IIIHIIRCHORHOCIHHOCIHCHCROORHI.isAssignableFrom(var7)) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var8 = this.IICCOOCHCHROORHHIIHROHCCRHRCOR(
               var7
            );
            return new OCOHORHCROHICRRIHCIHHRRCIHICRI(
               var1,
               this.RHHCHCRORCRROHIRICROROHRCHIRHR,
               null,
               new com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[]{var8},
               this.RHRHIOHRIRCOHIHOIOHIHHHCIORHRH,
               this.CHRRICCIOOIIHICIHHHHOCROIORHOI,
               this.RRRHICCICCHHIHHRCCCHHORCHHORIH
            );
         }
      }

      throw new IllegalArgumentException(
         "Internal error: Cannot resolve sub-type for Class " + var1.getName() + " to " + this.IIIHIIRCHORHOCIHHOCIHCHCROORHI.getName()
      );
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI OOROOCCIRCCRHOIOIORIHCHHOOCCOR(
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var1
   ) {
      throw new IllegalArgumentException("Simple types have no content types; cannot call withContentType()");
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI OOICHHIHHIHROCCRRRIIIIRIRICCIH(Object var1) {
      return this.CHRRICCIOOIIHICIHHHHOCROIORHOI == var1
         ? this
         : new OCOHORHCROHICRRIHCIHHRRCIHICRI(
            this.IIIHIIRCHORHOCIHHOCIHCHCROORHI,
            this.RHHCHCRORCRROHIRICROROHRCHIRHR,
            this.IIROCICIOIROHIOOIHHCRCHCHICHCH,
            this.RRCHOROROCRRCHCOIIRCCIOCCHCCCH,
            this.RHRHIOHRIRCOHIHOIOHIHHHCIORHRH,
            var1,
            this.RRRHICCICCHHIHHRCCCHHORCHHORIH
         );
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI HCIHORIHHCOOORRIOHIHIICCRHHOHC(
      Object var1
   ) {
      throw new IllegalArgumentException("Simple types have no content types; cannot call withContenTypeHandler()");
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI CCHICICOOHRCORIRRRHRIRHCCIIHOR(Object var1) {
      return var1 == this.RHRHIOHRIRCOHIHOIOHIHHHCIORHRH
         ? this
         : new OCOHORHCROHICRRIHCIHHRRCIHICRI(
            this.IIIHIIRCHORHOCIHHOCIHCHCROORHI,
            this.RHHCHCRORCRROHIRICROROHRCHIRHR,
            this.IIROCICIOIROHIOOIHHCRCHCHICHCH,
            this.RRCHOROROCRRCHCOIIRCCIOCCHCCCH,
            var1,
            this.CHRRICCIOOIIHICIHHHHOCROIORHOI,
            this.RRRHICCICCHHIHHRCCCHHORCHHORIH
         );
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI HIHROCOCCHRHHRROHCRCCHOIRCHIHI(Object var1) {
      throw new IllegalArgumentException("Simple types have no content types; cannot call withContenValueHandler()");
   }

   public OCOHORHCROHICRRIHCIHHRRCIHICRI RIRIRIIRHHRIRCOHHCRCOIHROOCRHH() {
      return this.RRRHICCICCHHIHHRCCCHHORCHHORIH
         ? this
         : new OCOHORHCROHICRRIHCIHHRRCIHICRI(
            this.IIIHIIRCHORHOCIHHOCIHCHCROORHI,
            this.RHHCHCRORCRROHIRICROROHRCHIRHR,
            this.IIROCICIOIROHIOOIHHCRCHCHICHCH,
            this.RRCHOROROCRRCHCOIIRCCIOCCHCCCH,
            this.RHRHIOHRIRCOHIHOIOHIHHHCIORHRH,
            this.CHRRICCIOOIIHICIHHHHOCROIORHOI,
            true
         );
   }

   @Override
   public com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<?> var1,
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var2,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var3,
      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI[] var4
   ) {
      return null;
   }

   @Override
   protected String HIHHIROICOOHOIHRIRICCIIRRRIIRR() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.IIIHIIRCHORHOCIHHOCIHCHCROORHI.getName());
      int var2 = this.RHHCHCRORCRROHIRICROROHRCHIRHR.size();
      if (var2 > 0 && this.HRICRCHIIHIIICIHCICRHOOCRCCHIO(var2)) {
         var1.append('<');

         for (int var3 = 0; var3 < var2; var3++) {
            com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var4 = this.CHHIOCOORROCRHIIORHHHIIRIOORCO(
               var3
            );
            if (var3 > 0) {
               var1.append(',');
            }

            var1.append(var4.HCCHHHRCIRCOOIHHOOCOIHROOCOORI());
         }

         var1.append('>');
      }

      return var1.toString();
   }

   @Override
   public boolean HCHCCRRRHHICOIRRIOOOOHHHOIIORR() {
      return false;
   }

   @Override
   public boolean HOOHORRHROCRORCHCOCCRRICIIRIOH() {
      return false;
   }

   @Override
   public StringBuilder RIOOCHICIHRHOHCCCCCHOCCCOHCRHI(StringBuilder var1) {
      return RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IIIHIIRCHORHOCIHHOCIHCHCROORHI, var1, true);
   }

   @Override
   public StringBuilder RRCRRCORICCHOHHIRCHIROOHIIOHCO(StringBuilder var1) {
      RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.IIIHIIRCHORHOCIHHOCIHCHCROORHI, var1, false);
      int var2 = this.RHHCHCRORCRROHIRICROROHRCHIRHR.size();
      if (var2 > 0) {
         var1.append('<');

         for (int var3 = 0; var3 < var2; var3++) {
            var1 = this.CHHIOCOORROCRHIIORHHHIIRIOORCO(var3).RRCRRCORICCHOHHIRCHIROOHIIOHCO(var1);
         }

         var1.append('>');
      }

      var1.append(';');
      return var1;
   }

   private static com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      Class<?> var0, IHHCHHHCRIHOOCOIOOCRIIICIOROIR var1
   ) {
      if (var0 == null) {
         return null;
      }

      if (var0 == Object.class) {
         return IIRHCHHOICHRICOOCRORCCIOOIHOIR.HIHOHHRCIOIIOHRRHRRRRCOHORHHOI();
      }

      com.moonsworth.lunar.lib.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.OCOHORHCROHICRRIHCIHHRRCIHICRI var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
         var0.getSuperclass(), var1
      );
      return new OCOHORHCROHICRRIHCIHHRRCIHICRI(var0, var1, var2, null, null, null, false);
   }

   @Override
   public String toString() {
      StringBuilder var1 = new StringBuilder(40);
      var1.append("[simple type, class ").append(this.HIHHIROICOOHOIHRIRICCIIRRRIIRR()).append(']');
      return var1.toString();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      if (var1.getClass() != this.getClass()) {
         return false;
      }

      OCOHORHCROHICRRIHCIHHRRCIHICRI var2 = (OCOHORHCROHICRRIHCIHHRRCIHICRI)var1;
      if (var2.IIIHIIRCHORHOCIHHOCIHCHCROORHI != this.IIIHIIRCHORHOCIHHOCIHCHCROORHI) {
         return false;
      }

      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var3 = this.RHHCHCRORCRROHIRICROROHRCHIRHR;
      IHHCHHHCRIHOOCOIOOCRIIICIOROIR var4 = var2.RHHCHCRORCRROHIRICROROHRCHIRHR;
      return var3.equals(var4);
   }
}
