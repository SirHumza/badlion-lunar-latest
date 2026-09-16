package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import java.util.List;
import java.util.function.Function;
import org.jetbrains.annotations.Nullable;

public abstract class IRRCCOICORICIHCHRHIHIHROIRHOCR<T> extends IOIICIRIICICIIOORHCIIIIRRIHRHI<T> {
   private List<T> options;

   protected IRRCCOICORICIHCHRHIHIHROIRHOCR(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<T> var2,
      T var3,
      List<T> var4,
      @Nullable Function<T, String> var5
   ) {
      super(var1, var2, (T)var3, var4, var5);
      this.options = var4;
   }

   @Override
   public List<T> RCRIOCCCOOIRICRHHCCIRCIOHRRRIO() {
      return this.options;
   }

   public void IOHOOIOHCHICOCHIICHCICCOHRCIII(List<T> var1) {
      this.options = var1;
   }

   public void HCHIHHCRIRHHHIOIIRICCORROCOOHH() {
      List var1 = this.RCRIOCCCOOIRICRHHCCIRCIOHRRRIO();
      if (var1.size() > 1) {
         int var2 = var1.indexOf(this.get());
         this.RHRIIOOOCRHIIOORCOCRCHRCCRRCIH((T)var1.get((var2 + 1) % var1.size()));
      }
   }
}
