package com.lunarclient.election.mayor;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.election.Election;
import com.lunarclient.election.mayor.minister.Minister;
import com.lunarclient.election.perk.Perk;

public record Mayor() {
   @SerializedName("key")
   private final String key;
   @SerializedName("name")
   private final String name;
   @SerializedName("perks")
   private final Perk[] perks;
   @SerializedName("minister")
   private final Minister minister;
   @SerializedName("election")
   private final Election election;

   public Mayor(String var1, String var2, Perk[] var3, Minister var4, Election var5) {
      this.key = var1;
      this.name = var2;
      this.perks = var3;
      this.minister = var4;
      this.election = var5;
   }
}
