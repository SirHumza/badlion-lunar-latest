package com.lunarclient.election.perk;

import com.google.gson.annotations.SerializedName;

public record Perk() {
   @SerializedName("name")
   private final String name;
   @SerializedName("description")
   private final String description;
   @SerializedName("minister")
   private final boolean minister;

   public Perk(String var1, String var2, boolean var3) {
      this.name = var1;
      this.description = var2;
      this.minister = var3;
   }
}
