package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import org.jspecify.annotations.Nullable;

public abstract class HRCHROOHRIHCRCRHRIIROCIRHOIRHH<T> extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<T> {
   private T value;
   private T defaultValue;

   protected HRCHROOHRIHCRCRHRIIROCIRHOIRHH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<T> var2,
      @Nullable T var3
   ) {
      super(var1, var2);
      this.value = this.defaultValue = (T)var3;
   }

   @Override
   public T getDefaultValue() {
      return this.defaultValue;
   }

   @Override
   public final void IOHHOIIOCRHCHHCRORICCOHOHROOIH(T var1) {
      this.defaultValue = (T)var1;
   }

   @Override
   public final T HRHHHHIICCCIROOOHIIIHIHIHHHOHC() {
      return this.value;
   }

   @Override
   protected final void RRORCOIRRIICOOICOIOCORHORCHCOC(T var1) {
      this.value = (T)var1;
   }
}
