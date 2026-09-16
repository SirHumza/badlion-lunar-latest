package com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.OCOHORHCROHICRRIHCIHHRRCIHICRI;

import com.google.gson.annotations.SerializedName;
import lombok.Generated;

public class IRCIIHHICIHRCOCRROCOICRIHHCCHH implements RRCRRCORICCHOHHIRCHIROOHIIOHCO<IRCIIHHICIHRCOCRROCOICRIHHCCHH> {
   @SerializedName("count")
   private int count;

   public void increment() {
      this.count++;
   }

   @Override
   public float getValue() {
      return this.count;
   }

   @Override
   public String RHORCRCHOCOHORIOHCCOHCIIHRROOR() {
      return String.valueOf(this.count);
   }

   public IRCIIHHICIHRCOCRROCOICRIHHCCHH RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IRCIIHHICIHRCOCRROCOICRIHHCCHH var1) {
      IRCIIHHICIHRCOCRROCOICRIHHCCHH var2 = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      var2.count = this.count + var1.count;
      return var2;
   }

   @Generated
   public int getCount() {
      return this.count;
   }
}
