package com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.pet;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Extra() {
   @NotNull
   private final BetterJson elm;

   public Extra(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> blazeKills() {
      return this.elm.get("blaze_kills").asDouble();
   }

   public Optional<Double> favoriteAncientGdrag() {
      return this.elm.get("favorite_ancient_gdrag").asDouble();
   }

   public Optional<Double> favoriteBabySpino() {
      return this.elm.get("favorite_baby_spino").asDouble();
   }

   public Optional<Double> favoriteBiome() {
      return this.elm.get("favorite_biome").asDouble();
   }

   public Optional<Double> favoriteBurning() {
      return this.elm.get("favorite_burning").asDouble();
   }

   public Optional<Double> favoriteCannedCrab() {
      return this.elm.get("favorite_canned_crab").asDouble();
   }

   public Optional<Double> favoriteCat() {
      return this.elm.get("favorite_cat").asDouble();
   }

   public Optional<Double> favoriteCrow() {
      return this.elm.get("favorite_crow").asDouble();
   }

   public Optional<Double> favoriteCrowFlower() {
      return this.elm.get("favorite_crow_flower").asDouble();
   }

   public Optional<Double> favoriteCrystal() {
      return this.elm.get("favorite_crystal").asDouble();
   }

   public Optional<Double> favoriteCuteJelly() {
      return this.elm.get("favorite_cute_jelly").asDouble();
   }

   public Optional<Double> favoriteEndercat() {
      return this.elm.get("favorite_endercat").asDouble();
   }

   public Optional<Double> favoriteGardenBunny() {
      return this.elm.get("favorite_garden_bunny").asDouble();
   }

   public Optional<Double> favoriteMammoth() {
      return this.elm.get("favorite_mammoth").asDouble();
   }

   public Optional<Double> favoriteMonsterSheep() {
      return this.elm.get("favorite_monster_sheep").asDouble();
   }

   public Optional<Double> favoritePlushieDragon() {
      return this.elm.get("favorite_plushie_dragon").asDouble();
   }

   public Optional<Double> favoritePlushieGdragon() {
      return this.elm.get("favorite_plushie_gdragon").asDouble();
   }

   public Optional<Double> favoriteSafari() {
      return this.elm.get("favorite_safari").asDouble();
   }

   public Optional<Double> favoriteShulk() {
      return this.elm.get("favorite_shulk").asDouble();
   }

   public Optional<Double> favoriteSpiritOrca() {
      return this.elm.get("favorite_spirit_orca").asDouble();
   }

   public Optional<Double> favoriteWorm() {
      return this.elm.get("favorite_worm").asDouble();
   }

   public Optional<Double> mfItems() {
      return this.elm.get("mf_items").asDouble();
   }

   public Optional<Double> skinKills() {
      return this.elm.get("skin_kills").asDouble();
   }
}
