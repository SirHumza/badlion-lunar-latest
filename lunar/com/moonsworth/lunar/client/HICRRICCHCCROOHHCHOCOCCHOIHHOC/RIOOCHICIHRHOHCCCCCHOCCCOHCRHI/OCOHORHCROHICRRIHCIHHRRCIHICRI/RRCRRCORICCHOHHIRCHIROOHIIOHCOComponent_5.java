package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.google.gson.annotations.SerializedName;

public class HHCCIRHCCCIIRHCROHIORHIRHHIORH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO<HHCCIRHCCCIIRHCROHIORHIRHHIORH> {
   @SerializedName("value")
   private float value;

   public void OHRRIORRCRIRORHRIOOCORIIRRRRRO(float var1) {
      this.value += var1;
   }

   @Override
   public float getValue() {
      return this.value;
   }

   @Override
   public String RHORCRCHOCOHORIOHCCOHCIIHRROOR() {
      return String.valueOf(this.value);
   }

   public HHCCIRHCCCIIRHCROHIORHIRHHIORH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(HHCCIRHCCCIIRHCROHIORHIRHHIORH var1) {
      HHCCIRHCCCIIRHCROHIORHIRHHIORH var2 = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      var2.value = this.value + var1.value;
      return var2;
   }
}
