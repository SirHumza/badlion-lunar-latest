package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IOHHOIIOCRHCHHCRORICCOHOHROOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

public record CRRRICCRROCOHHOHIICIHORCOORRRH() {
   @SerializedName("value")
   @Nullable
   private final String COHOROHRHIOROORIIOCIHOOHCIIIHR;
   public static final CRRRICCRROCOHHOHIICIHORCOORRRH CIIICRRCCOHIOHOCORCCCOHCIRICCC = new CRRRICCRROCOHHOHIICIHORCOORRRH(null);

   public CRRRICCRROCOHHOHIICIHORCOORRRH(@Nullable String var1) {
      this.COHOROHRHIOROORIIOCIHOOHCIIIHR = var1;
   }

   public String IHCICHIIIHORHRIICHOHOHHOCHRORO(String var1) {
      return this.isEmpty() ? var1 : this.COHOROHRHIOROORIIOCIHOOHCIIIHR;
   }

   public boolean isEmpty() {
      return this == CIIICRRCCOHIOHOCORCCCOHCIRICCC || this.value() == null;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH OORIOHCICHIHCIRRIIOHCCHCIHCOIH() {
      return CIIICRRCCOHIOHOCORCCCOHCIRICCC;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH OOIHOHCIIRORIOHIRRRORHHHIIIHCH(@Nullable String var0) {
      return new CRRRICCRROCOHHOHIICIHORCOORRRH(var0);
   }

   @SerializedName("value")
   @Nullable
   public String value() {
      return this.COHOROHRHIOROORIIOCIHOOHCIIIHR;
   }
}
