package com.moonsworth.lunar.client.IOHHOIIOCRHCHHCRORICCOHOHROOIH.CRRRICCRROCOHHOHIICIHORCOORRRH;

import com.google.gson.annotations.SerializedName;

public record IRCIIHHICIHRCOCRROCOICRIHHCCHH() {
   @SerializedName("x")
   private final float CORIHRHRHORIHOOCOCORRCROIIRIOO;
   @SerializedName("y")
   private final float HCCROHICIRICOIICHRCIORHCORCICO;
   @SerializedName("width")
   private final float RCCHOOICHHROCCHHRIOOCIRRRIOIHH;
   @SerializedName("height")
   private final float OCHOOHRCRIOCIHRCHIHOIOHOOHCICR;

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH(float var1, float var2, float var3, float var4) {
      this.CORIHRHRHORIHOOCOCORRCROIIRIOO = var1;
      this.HCCROHICIRICOIICHRCIORHCORCICO = var2;
      this.RCCHOOICHHROCCHHRIOOCIRRRIOIHH = var3;
      this.OCHOOHRCRIOCIHRCHIHOIOHOOHCICR = var4;
   }

   @SerializedName("x")
   public float x() {
      return this.CORIHRHRHORIHOOCOCORRCROIIRIOO;
   }

   @SerializedName("y")
   public float y() {
      return this.HCCROHICIRICOIICHRCIORHCORCICO;
   }

   @SerializedName("width")
   public float IHHOOHCOCCCHRRRCOHIHIOOIHRIHRH() {
      return this.RCCHOOICHHROCCHHRIOOCIRRRIOIHH;
   }

   @SerializedName("height")
   public float CCOOCCIOHCRRIOCHOCICRROICHHCHI() {
      return this.OCHOOHRCRIOCIHRCHIHOIOHOOHCICR;
   }
}
