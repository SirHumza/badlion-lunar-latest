package com.lunarclient.apollo.client.version;

public enum MinecraftVersion {
   V1_7,
   V1_8,
   V1_9,
   V1_10,
   V1_11,
   V1_12,
   V1_16_1,
   V1_16_5,
   V1_17_0,
   V1_17_1,
   V1_18_1,
   V1_18_2,
   V1_19_pre,
   V1_19_0,
   V1_19_2,
   V1_19_3,
   V1_19_4,
   V1_20_0,
   V1_20_1,
   V1_20_2,
   V1_20_3,
   V1_20_4,
   UNKNOWN;

   public boolean isAfter(MinecraftVersion var1) {
      return var1.ordinal() < this.ordinal();
   }

   public boolean isAfterInclusive(MinecraftVersion var1) {
      return var1.ordinal() <= this.ordinal();
   }

   public boolean isBefore(MinecraftVersion var1) {
      return var1.ordinal() > this.ordinal();
   }

   public boolean isBeforeInclusive(MinecraftVersion var1) {
      return var1.ordinal() >= this.ordinal();
   }
}
