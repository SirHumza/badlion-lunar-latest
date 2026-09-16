package com.lunarclient.player.petStats;

import com.google.gson.annotations.SerializedName;

public record Pet() {
   @SerializedName("EXERCISE")
   private final PetValue exercise;
   @SerializedName("THIRST")
   private final PetValue thirst;
   @SerializedName("HUNGER")
   private final PetValue hunger;
   @SerializedName("name")
   private final String name;
   @SerializedName("experience")
   private final int experience;

   public Pet(PetValue var1, PetValue var2, PetValue var3, String var4, int var5) {
      this.exercise = var1;
      this.thirst = var2;
      this.hunger = var3;
      this.name = var4;
      this.experience = var5;
   }
}
