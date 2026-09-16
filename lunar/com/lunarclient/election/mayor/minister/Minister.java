package com.lunarclient.election.mayor.minister;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.election.perk.Perk;

public record Minister() {
   @SerializedName("key")
   private final String key;
   @SerializedName("name")
   private final String name;
   @SerializedName("perk")
   private final Perk perk;

   public Minister(String var1, String var2, Perk var3) {
      this.key = var1;
      this.name = var2;
      this.perk = var3;
   }
}
