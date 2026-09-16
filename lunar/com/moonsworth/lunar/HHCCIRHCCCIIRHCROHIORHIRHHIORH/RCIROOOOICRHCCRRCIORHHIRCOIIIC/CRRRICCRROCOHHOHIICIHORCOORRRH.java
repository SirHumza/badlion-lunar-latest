package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;

import lombok.Generated;

public enum CRRRICCRROCOHHOHIICIHORCOORRRH {
   SURVIVAL(0, "survival"),
   CREATIVE(1, "creative"),
   ADVENTURE(2, "adventure"),
   SPECTATOR(3, "spectator");

   public static final CRRRICCRROCOHHOHIICIHORCOORRRH[] VALUES = values();
   private final int id;
   private final String name;

   CRRRICCRROCOHHOHIICIHORCOORRRH(int var3, String var4) {
      this.id = var3;
      this.name = var4;
   }

   public boolean isAdventure() {
      return this == ADVENTURE || this == SPECTATOR;
   }

   public boolean isCreative() {
      return this == CREATIVE;
   }

   public boolean isSurvivalOrAdventure() {
      return this == SURVIVAL || this == ADVENTURE;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH getByID(int var0) {
      for (CRRRICCRROCOHHOHIICIHORCOORRRH var4 : VALUES) {
         if (var4.id == var0) {
            return var4;
         }
      }

      return SURVIVAL;
   }

   public static CRRRICCRROCOHHOHIICIHORCOORRRH getByName(String var0) {
      for (CRRRICCRROCOHHOHIICIHORCOORRRH var4 : VALUES) {
         if (var4.name.equals(var0)) {
            return var4;
         }
      }

      return SURVIVAL;
   }

   @Generated
   public int getId() {
      return this.id;
   }

   @Generated
   public String getName() {
      return this.name;
   }
}
