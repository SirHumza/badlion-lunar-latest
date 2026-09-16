package com.lunarclient.election.candidate;

import com.google.gson.annotations.SerializedName;
import com.lunarclient.election.perk.Perk;
import org.jetbrains.annotations.Nullable;

public record Candidate() {
   @SerializedName("key")
   @Nullable
   private final String key;
   @SerializedName("name")
   private final String name;
   @SerializedName("perks")
   private final Perk[] perks;
   @SerializedName("votes")
   private final int votes;

   public Candidate(@Nullable String var1, String var2, Perk[] var3, int var4) {
      this.key = var1;
      this.name = var2;
      this.perks = var3;
      this.votes = var4;
   }
}
