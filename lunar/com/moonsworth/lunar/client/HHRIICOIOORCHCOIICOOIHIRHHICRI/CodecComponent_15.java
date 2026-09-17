package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import org.jspecify.annotations.Nullable;

public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<Boolean> {
   private boolean value;
   private boolean CRIORHRHCCOCIRORORRHHRCHOORCCC;

   protected RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<Boolean> var2,
      boolean var3
   ) {
      super(var1, var2);
      this.value = this.CRIORHRHCCOCIRORORRHHRCHOORCCC = var3;
   }

   public final boolean RHROOHORROCIIIHHHOIIICHHOIHCIO() {
      return this.CRIORHRHCCOCIRORORRHHRCHOORCCC;
   }

   public final void RHRHIHHRHRHRIIRCCOCIHHHOHCIOCH(boolean var1) {
      this.CRIORHRHCCOCIRORORRHHRCHOORCCC = var1;
   }

   public final boolean CICRIIIRCRCHOIROOIRHIIRHOCHCRR() {
      return this.value;
   }

   public final void HORCCIOICHOIHHCOCHIHIHOROHRROO(boolean var1) {
      this.value = var1;
   }

   @Deprecated
   public final Boolean OCOIIHOCHCOCIRRCIHRHCRHHCROORH() {
      return this.CRIORHRHCCOCIRORORRHHRCHOORCCC;
   }

   @Deprecated
   public final void RRRHHIRORHCHHCOOCIHOICORHHCHHO(Boolean var1) {
      this.CRIORHRHCCOCIRORORRHHRCHOORCCC = var1;
   }

   @Deprecated
   public final Boolean HOROHIOCHROIHROIHHIHROHOHCCORR() {
      return this.value;
   }

   @Deprecated
   protected final void ORIOHRCIHRCOOHICCCRIIIHCRHHIHI(Boolean var1) {
      this.value = var1;
   }
}
