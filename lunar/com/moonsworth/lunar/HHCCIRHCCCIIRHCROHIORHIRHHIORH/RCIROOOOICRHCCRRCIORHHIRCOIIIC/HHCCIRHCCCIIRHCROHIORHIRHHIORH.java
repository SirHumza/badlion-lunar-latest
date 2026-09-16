package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;

import java.util.Arrays;
import java.util.Comparator;
import javax.annotation.Nullable;

public enum HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   PEACEFUL(0, "peaceful"),
   EASY(1, "easy"),
   NORMAL(2, "normal"),
   HARD(3, "hard");

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH[] BY_ID = Arrays.stream(values())
      .sorted(Comparator.comparingInt(HHCCIRHCCCIIRHCROHIORHIRHHIORH::getId))
      .toArray(HHCCIRHCCCIIRHCROHIORHIRHHIORH[]::new);
   public int id;
   public String key;

   HHCCIRHCCCIIRHCROHIORHIRHHIORH(int var3, String var4) {
      this.id = var3;
      this.key = var4;
   }

   public int getId() {
      return this.id;
   }

   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH byId(int var0) {
      return BY_ID[var0 % BY_ID.length];
   }

   @Nullable
   public static HHCCIRHCCCIIRHCROHIORHIRHHIORH byName(String var0) {
      for (HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 : values()) {
         if (var4.key.equals(var0)) {
            return var4;
         }
      }

      return null;
   }

   public String getKey() {
      return this.key;
   }
}
