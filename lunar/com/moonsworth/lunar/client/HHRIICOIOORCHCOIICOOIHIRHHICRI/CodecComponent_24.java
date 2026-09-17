package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI;

import com.lunarclient.dfu.serialization.Codec;
import com.moonsworth.lunar.client.util.HIHCCHCCOCOHRICOICHRCOIHIIRIHO;
import org.jspecify.annotations.Nullable;

public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH extends OOROOCCIRCCRHOIOIORIHCHHOOCCOR<Float> {
   private float value;
   private float HRCOICRORRRRRCCCIOHRICCCHRCORO;

   protected CRRRICCRROCOHHOHIICIHORCOORRRH(
      @HIHCCHCCOCOHRICOICHRCOIHIIRIHO(CHHOHHOIRCCRRCRIHCCOHHRCIHRHII = HIHCCHCCOCOHRICOICHRCOIHIIRIHO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SETTING) String var1,
      @Nullable Codec<Float> var2,
      float var3
   ) {
      super(var1, var2);
      this.value = this.HRCOICRORRRRRCCCIOHRICCCHRCORO = var3;
   }

   public final float RHIRIICIHCIRIROOROICCROIOROOOH() {
      return this.HRCOICRORRRRRCCCIOHRICCCHRCORO;
   }

   public final void HHIOCIRHCHIRHHRIRCHOIRORHCRCRI(float var1) {
      this.HRCOICRORRRRRCCCIOHRICCCHRCORO = var1;
   }

   public final float IOHRCHRCCIIICCCIRHHRRCCHCRIRRH() {
      return this.value;
   }

   public final void RCHHHORIRORROOHRRHHIIIOIROHHCC(float var1) {
      this.value = var1;
   }

   @Deprecated
   public final Float OOHCCCIHHRCORCHRIOIIRIHHOHOOIC() {
      return this.HRCOICRORRRRRCCCIOHRICCCHRCORO;
   }

   @Deprecated
   public final void IHHCHHHCRIHOOCOIOOCRIIICIOROIR(Float var1) {
      this.HRCOICRORRRRRCCCIOHRICCCHRCORO = var1;
   }

   @Deprecated
   public final Float RCOCIHIICCCROCHCHORHOCOCCIOHHI() {
      return this.value;
   }

   @Deprecated
   protected final void IIRHCHHOICHRICOOCRORCCIOOIHOIR(Float var1) {
      this.value = var1;
   }
}
