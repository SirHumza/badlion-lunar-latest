package com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record PersonalBests() {
   @NotNull
   private final BetterJson elm;

   public PersonalBests(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> cactus() {
      return this.elm.get("CACTUS").asDouble();
   }

   public Optional<Double> carrotItem() {
      return this.elm.get("CARROT_ITEM").asDouble();
   }

   public Optional<Double> doublePlant() {
      return this.elm.get("DOUBLE_PLANT").asDouble();
   }

   public Optional<Double> inkSack3() {
      return this.elm.get("INK_SACK:3").asDouble();
   }

   public Optional<Double> melon() {
      return this.elm.get("MELON").asDouble();
   }

   public Optional<Double> moonflower() {
      return this.elm.get("MOONFLOWER").asDouble();
   }

   public Optional<Double> mushroomCollection() {
      return this.elm.get("MUSHROOM_COLLECTION").asDouble();
   }

   public Optional<Double> netherStalk() {
      return this.elm.get("NETHER_STALK").asDouble();
   }

   public Optional<Double> potatoItem() {
      return this.elm.get("POTATO_ITEM").asDouble();
   }

   public Optional<Double> pumpkin() {
      return this.elm.get("PUMPKIN").asDouble();
   }

   public Optional<Double> sugarCane() {
      return this.elm.get("SUGAR_CANE").asDouble();
   }

   public Optional<Double> wheat() {
      return this.elm.get("WHEAT").asDouble();
   }

   public Optional<Double> wildRose() {
      return this.elm.get("WILD_ROSE").asDouble();
   }
}
