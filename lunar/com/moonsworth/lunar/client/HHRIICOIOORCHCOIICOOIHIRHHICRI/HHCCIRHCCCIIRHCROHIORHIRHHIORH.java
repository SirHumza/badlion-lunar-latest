package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import org.jspecify.annotations.Nullable;

public abstract class HHCCIRHCCCIIRHCROHIORHIRHHIORH extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<Double> {
   private double value;
   private double CRIRCOOHOHRCHHIRHORROHIRCORROR;

   protected HHCCIRHCCCIIRHCROHIORHIRHHIORH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<Double> var2,
      double var3
   ) {
      super(var1, var2);
      this.value = this.CRIRCOOHOHRCHHIRHORROHIRCORROR = var3;
   }

   public final double HIOCIRRHOHCRORHHHHOICIHHRHIOHH() {
      return this.CRIRCOOHOHRCHHIRHORROHIRCORROR;
   }

   public final void OCCCRRHIIOCOIHRIIHOIRRCIORHHHI(double var1) {
      this.CRIRCOOHOHRCHHIRHORROHIRCORROR = var1;
   }

   public final double RRRRIIIRRHICCCOOOORHROHRHOOCRC() {
      return this.value;
   }

   public final void RRORCOIRRIICOOICOIOCORHORCHCOC(double var1) {
      this.value = var1;
   }

   @Deprecated
   public final Double COICIRIRIHIIIOIHOIRCOCRHCOHICH() {
      return this.CRIRCOOHOHRCHHIRHORROHIRCORROR;
   }

   @Deprecated
   public final void OOROOCCIRCCRHOIOIORIHCHHOOCCOR(Double var1) {
      this.CRIRCOOHOHRCHHIRHORROHIRCORROR = var1;
   }

   @Deprecated
   public final Double ICOIRCCIIHORHRIHHORRCIOIIIRCRC() {
      return this.value;
   }

   @Deprecated
   protected final void CORCOCICIRIOHROHROIIOOHICCHCRR(Double var1) {
      this.value = var1;
   }
}
