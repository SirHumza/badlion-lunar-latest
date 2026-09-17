package com.lunarclient.garden.commission;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.garden.commission.requirement.Requirement;

public record Commission() {
   @SerializedName("requirement")
   private final Requirement[] requirement;
   @SerializedName("status")
   private final String status;
   @SerializedName("position")
   private final int position;

   public Commission(Requirement[] var1, String var2, int var3) {
      this.requirement = var1;
      this.status = var2;
      this.position = var3;
   }
}
