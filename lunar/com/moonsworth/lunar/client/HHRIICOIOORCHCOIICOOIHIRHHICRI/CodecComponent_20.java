package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import org.jspecify.annotations.Nullable;

public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<Byte> {
   private byte value;
   private byte CHHICHCCCIHOCHHCRHCRIRICORHHIH;

   protected IRCIIHHICIHRCOCRROCOICRIHHCCHH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<Byte> var2,
      byte var3
   ) {
      super(var1, var2);
      this.value = this.CHHICHCCCIHOCHHCRHCRIRICORHHIH = var3;
   }

   public final byte HRHHIOCOCRHHCHHROHRIIOOCICIICO() {
      return this.CHHICHCCCIHOCHHCRHCRIRICORHHIH;
   }

   public final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(byte var1) {
      this.CHHICHCCCIHOCHHCRHCRIRICORHHIH = var1;
   }

   public final byte CHCRRRHHRCCRHCCCCRROHHRICICROO() {
      return this.value;
   }

   public final void IRCIIHHICIHRCOCRROCOICRIHHCCHH(byte var1) {
      this.value = var1;
   }

   @Deprecated
   public final Byte OIOIRRIOHOIRCHRCRCIRCOOOCOCHOR() {
      return this.CHHICHCCCIHOCHHCRHCRIRICORHHIH;
   }

   @Deprecated
   public final void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Byte var1) {
      this.CHHICHCCCIHOCHHCRHCRIRICORHHIH = var1;
   }

   @Deprecated
   public final Byte CIHIRCIHRHIRHCOOHRICRIRIHIRHCH() {
      return this.value;
   }

   @Deprecated
   protected final void IRCIIHHICIHRCOCRROCOICRIHHCCHH(Byte var1) {
      this.value = var1;
   }
}
