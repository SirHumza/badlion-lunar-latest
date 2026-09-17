package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import org.jspecify.annotations.Nullable;

public abstract class CORCOCICIRIOHROHROIIOOHICCHCRR extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<Short> {
   private short value;
   private short RIORRCCICIHIHRIOHIIOOHORIOCOIO;

   protected CORCOCICIRIOHROHROIIOOHICCHCRR(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<Short> var2,
      short var3
   ) {
      super(var1, var2);
      this.value = this.RIORRCCICIHIHRIOHIIOOHORIOCOIO = var3;
   }

   public final short CIRICHCRRCCROHRCCCOHHHIHROIHII() {
      return this.RIORRCCICIHIHRIOHIIOOHORIOCOIO;
   }

   public final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(short var1) {
      this.RIORRCCICIHIHRIOHIIOOHORIOCOIO = var1;
   }

   public final short RIRCCCIICCHHICROCRIOCCHCIRCCCR() {
      return this.value;
   }

   public final void IRCIIHHICIHRCOCRROCOICRIHHCCHH(short var1) {
      this.value = var1;
   }

   @Deprecated
   public final Short IORRCOHHRRIIRRHOIHROHHCCCHORHO() {
      return this.RIORRCCICIHIHRIOHIIOOHORIOCOIO;
   }

   @Deprecated
   public final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Short var1) {
      this.RIORRCCICIHIHRIOHIIOOHORIOCOIO = var1;
   }

   @Deprecated
   public final Short HOCIIHICOHRCRRIORORCCIORCIOHIR() {
      return this.value;
   }

   @Deprecated
   protected final void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Short var1) {
      this.value = var1;
   }
}
