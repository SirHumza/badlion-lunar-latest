package com.lunarclient.items.item.catacombs_requirements;

import com.google.gson.annotations.SerializedName;

public record CatacombsRequirement() {
   @SerializedName("type")
   private final String type;
   @SerializedName("dungeon_type")
   private final String dungeonType;
   @SerializedName("level")
   private final int level;

   public CatacombsRequirement(String var1, String var2, int var3) {
      this.type = var1;
      this.dungeonType = var2;
      this.level = var3;
   }
}
