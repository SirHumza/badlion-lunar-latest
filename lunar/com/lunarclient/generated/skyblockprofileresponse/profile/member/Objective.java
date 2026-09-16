package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Objective() {
   @NotNull
   private final BetterJson elm;

   public Objective(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> _0() {
      return this.elm.get("0").asBool();
   }

   public Optional<Boolean> _1() {
      return this.elm.get("1").asBool();
   }

   public Optional<Boolean> _2() {
      return this.elm.get("2").asBool();
   }

   public Optional<Double> abiphoneDealer() {
      return this.elm.get("abiphone_dealer").asDouble();
   }

   public Optional<Double> amountGiven() {
      return this.elm.get("amount_given").asDouble();
   }

   public Optional<Double> an() {
      return this.elm.get("An").asDouble();
   }

   public Optional<Double> an2() {
      return this.elm.get("an").asDouble();
   }

   public Optional<Double> arba() {
      return this.elm.get("arba").asDouble();
   }

   public Optional<Double> arbadak() {
      return this.elm.get("arbadak").asDouble();
   }

   public Optional<Double> azax() {
      return this.elm.get("azax").asDouble();
   }

   public Optional<Double> barbarianAlchemist() {
      return this.elm.get("barbarian_alchemist").asDouble();
   }

   public Optional<Double> barbarianBlacksmith() {
      return this.elm.get("barbarian_blacksmith").asDouble();
   }

   public Optional<Double> barbarianEmissary() {
      return this.elm.get("barbarian_emissary").asDouble();
   }

   public Optional<Double> barbariansTalkedTo() {
      return this.elm.get("barbarians_talked_to").asDouble();
   }

   public Optional<Double> bartenderEzekiel() {
      return this.elm.get("bartender_ezekiel").asDouble();
   }

   public Optional<Double> bartenderGrog() {
      return this.elm.get("bartender_grog").asDouble();
   }

   public Optional<Boolean> blazeRod() {
      return this.elm.get("BLAZE_ROD").asBool();
   }

   public Optional<Double> bruuh() {
      return this.elm.get("bruuh").asDouble();
   }

   public Optional<Boolean> cactus() {
      return this.elm.get("CACTUS").asBool();
   }

   public Optional<Boolean> carrotItem() {
      return this.elm.get("CARROT_ITEM").asBool();
   }

   public Optional<Double> chihai() {
      return this.elm.get("chihai").asDouble();
   }

   public Optional<Double> chihaiChild0() {
      return this.elm.get("chihai_child_0").asDouble();
   }

   public Optional<Double> chihaiChild1() {
      return this.elm.get("chihai_child_1").asDouble();
   }

   public Optional<Double> chihaiChild2() {
      return this.elm.get("chihai_child_2").asDouble();
   }

   public Optional<Double> citrine() {
      return this.elm.get("Citrine").asDouble();
   }

   public Optional<Double> colore() {
      return this.elm.get("colore").asDouble();
   }

   public Optional<Double> colore2() {
      return this.elm.get("Colore").asDouble();
   }

   public Optional<Double> completedAt() {
      return this.elm.get("completed_at").asDouble();
   }

   public Optional<Double> completions() {
      return this.elm.get("completions").asDouble();
   }

   public Optional<Double> crafter0() {
      return this.elm.get("crafter0").asDouble();
   }

   public Optional<Double> crafter1() {
      return this.elm.get("crafter1").asDouble();
   }

   public Optional<Boolean> diamond() {
      return this.elm.get("DIAMOND").asBool();
   }

   public Optional<Double> edelis() {
      return this.elm.get("edelis").asDouble();
   }

   public Optional<Double> eludore() {
      return this.elm.get("eludore").asDouble();
   }

   public Optional<Boolean> emerald() {
      return this.elm.get("EMERALD").asBool();
   }

   public Optional<Double> enchantedCoal() {
      return this.elm.get("ENCHANTED_COAL").asDouble();
   }

   public Optional<Double> enchantedDiamond() {
      return this.elm.get("ENCHANTED_DIAMOND").asDouble();
   }

   public Optional<Double> enchantedEmerald() {
      return this.elm.get("ENCHANTED_EMERALD").asDouble();
   }

   public Optional<Double> enchantedGold() {
      return this.elm.get("ENCHANTED_GOLD").asDouble();
   }

   public Optional<Double> enchantedIron() {
      return this.elm.get("ENCHANTED_IRON").asDouble();
   }

   public Optional<Double> enchantedLapisLazuli() {
      return this.elm.get("ENCHANTED_LAPIS_LAZULI").asDouble();
   }

   public Optional<Double> enchantedOakLog() {
      return this.elm.get("ENCHANTED_OAK_LOG").asDouble();
   }

   public Optional<Double> enchantedRedstone() {
      return this.elm.get("ENCHANTED_REDSTONE").asDouble();
   }

   public Optional<Double> enchantedSand() {
      return this.elm.get("ENCHANTED_SAND").asDouble();
   }

   public Optional<Boolean> enderStone() {
      return this.elm.get("ENDER_STONE").asBool();
   }

   public Optional<String> faction() {
      return this.elm.get("faction").asString();
   }

   public Optional<Double> flyfishFished() {
      return this.elm.get("flyfish_fished").asDouble();
   }

   public Optional<Double> forast() {
      return this.elm.get("forast").asDouble();
   }

   public Optional<Boolean> glowstoneDust() {
      return this.elm.get("GLOWSTONE_DUST").asBool();
   }

   public Optional<Boolean> goldIngot() {
      return this.elm.get("GOLD_INGOT").asBool();
   }

   public Optional<Double> igrupan() {
      return this.elm.get("igrupan").asDouble();
   }

   public Optional<Boolean> increaseFishingChance() {
      return this.elm.get("increaseFishingChance").asBool();
   }

   public Optional<Boolean> inkSack3() {
      return this.elm.get("INK_SACK:3").asBool();
   }

   public Optional<Boolean> inkSack4() {
      return this.elm.get("INK_SACK:4").asBool();
   }

   public Optional<Boolean> ironIngot() {
      return this.elm.get("IRON_INGOT").asBool();
   }

   public Optional<Double> jine() {
      return this.elm.get("jine").asDouble();
   }

   public Optional<Double> kaus() {
      return this.elm.get("kaus").asDouble();
   }

   public Optional<Double> kheharad() {
      return this.elm.get("Kheharad").asDouble();
   }

   public Optional<Double> kherarad() {
      return this.elm.get("kherarad").asDouble();
   }

   public Optional<Double> lampShop() {
      return this.elm.get("lamp_shop").asDouble();
   }

   public Optional<Boolean> leather() {
      return this.elm.get("LEATHER").asBool();
   }

   public Optional<Double> leo() {
      return this.elm.get("Leo").asDouble();
   }

   public Optional<Double> mageAlchamist() {
      return this.elm.get("mage_alchamist").asDouble();
   }

   public Optional<Double> mageAlchemist() {
      return this.elm.get("mage_alchemist").asDouble();
   }

   public Optional<Double> mageBlacksmith() {
      return this.elm.get("mage_blacksmith").asDouble();
   }

   public Optional<Double> mageEmissary() {
      return this.elm.get("mage_emissary").asDouble();
   }

   public Optional<Double> magesTalkedTo() {
      return this.elm.get("mages_talked_to").asDouble();
   }

   public Optional<Boolean> magmaCream() {
      return this.elm.get("MAGMA_CREAM").asBool();
   }

   public Optional<Double> marmalade() {
      return this.elm.get("Marmalade").asDouble();
   }

   public Optional<Double> mazakala() {
      return this.elm.get("mazakala").asDouble();
   }

   public Optional<Boolean> melon() {
      return this.elm.get("MELON").asBool();
   }

   public Optional<Double> mollim() {
      return this.elm.get("mollim").asDouble();
   }

   public Optional<Boolean> mutton() {
      return this.elm.get("MUTTON").asBool();
   }

   public Optional<Boolean> netherStalk() {
      return this.elm.get("NETHER_STALK").asBool();
   }

   public Optional<Boolean> obsidian() {
      return this.elm.get("OBSIDIAN").asBool();
   }

   public Optional<Double> offea() {
      return this.elm.get("Offea").asDouble();
   }

   public Optional<Double> offea2() {
      return this.elm.get("offea").asDouble();
   }

   public Optional<Double> pablo() {
      return this.elm.get("pablo").asDouble();
   }

   public Optional<Double> pax() {
      return this.elm.get("Pax").asDouble();
   }

   public Optional<Double> plenk() {
      return this.elm.get("plenk").asDouble();
   }

   public Optional<Double> plume() {
      return this.elm.get("Plume").asDouble();
   }

   public Optional<Double> pomtair() {
      return this.elm.get("pomtair").asDouble();
   }

   public Optional<Double> porc() {
      return this.elm.get("porc").asDouble();
   }

   public Optional<Boolean> pork() {
      return this.elm.get("PORK").asBool();
   }

   public Optional<Boolean> potatoItem() {
      return this.elm.get("POTATO_ITEM").asBool();
   }

   public Optional<Double> progress() {
      return this.elm.get("progress").asDouble();
   }

   public Optional<Boolean> pumpkin() {
      return this.elm.get("PUMPKIN").asBool();
   }

   public Optional<Boolean> quartz() {
      return this.elm.get("QUARTZ").asBool();
   }

   public Optional<Boolean> rabbit() {
      return this.elm.get("RABBIT").asBool();
   }

   public Optional<Boolean> rawChicken() {
      return this.elm.get("RAW_CHICKEN").asBool();
   }

   public Optional<Boolean> redstone() {
      return this.elm.get("REDSTONE").asBool();
   }

   public Optional<Double> rhanora() {
      return this.elm.get("Rhanora").asDouble();
   }

   public Optional<Double> rhanora2() {
      return this.elm.get("rhanora").asDouble();
   }

   public Optional<Double> rhanoraCat0() {
      return this.elm.get("rhanora_cat_0").asDouble();
   }

   public Optional<Double> rhanoraCat1() {
      return this.elm.get("rhanora_cat_1").asDouble();
   }

   public Optional<Double> rhanoraCat2() {
      return this.elm.get("rhanora_cat_2").asDouble();
   }

   public Optional<Double> rhanoraCat3() {
      return this.elm.get("rhanora_cat_3").asDouble();
   }

   public Optional<Double> rhanoraCat4() {
      return this.elm.get("rhanora_cat_4").asDouble();
   }

   public Optional<Double> rollim() {
      return this.elm.get("rollim").asDouble();
   }

   public Optional<Double> rulenor() {
      return this.elm.get("rulenor").asDouble();
   }

   public Optional<Double> scholarAllium() {
      return this.elm.get("ScholarAllium").asDouble();
   }

   public Optional<Double> scholarAlluin() {
      return this.elm.get("scholar_alluin").asDouble();
   }

   public Optional<Double> seffea() {
      return this.elm.get("Seffea").asDouble();
   }

   public Optional<Double> seffea2() {
      return this.elm.get("seffea").asDouble();
   }

   public Optional<Double> sirihPig() {
      return this.elm.get("sirih_pig").asDouble();
   }

   public Optional<Double> skeletonFishFished() {
      return this.elm.get("skeleton_fish_fished").asDouble();
   }

   public Optional<Double> sneakyBarbarian0() {
      return this.elm.get("sneaky_barbarian_0").asDouble();
   }

   public Optional<Double> sneakyBarbarian1() {
      return this.elm.get("sneaky_barbarian_1").asDouble();
   }

   public Optional<Boolean> spiderEye() {
      return this.elm.get("SPIDER_EYE").asBool();
   }

   public Optional<Boolean> started() {
      return this.elm.get("started").asBool();
   }

   public Optional<String> status() {
      return this.elm.get("status").asString();
   }

   public Optional<Boolean> string() {
      return this.elm.get("STRING").asBool();
   }

   public Optional<Double> strux() {
      return this.elm.get("strux").asDouble();
   }

   public Optional<Boolean> sugarCane() {
      return this.elm.get("SUGAR_CANE").asBool();
   }

   public Optional<Double> sulphurcare0() {
      return this.elm.get("sulphurcare_0").asDouble();
   }

   public Optional<Double> sulphurcare1() {
      return this.elm.get("sulphurcare_1").asDouble();
   }

   public Optional<Double> suus() {
      return this.elm.get("suus").asDouble();
   }

   public Optional<Double> suusChild() {
      return this.elm.get("suus_child").asDouble();
   }

   public Optional<Double> truu() {
      return this.elm.get("truu").asDouble();
   }

   public Optional<Double> ulyn() {
      return this.elm.get("Ulyn").asDouble();
   }

   public Optional<Double> ulyn2() {
      return this.elm.get("ulyn").asDouble();
   }

   public Optional<Double> uvia() {
      return this.elm.get("uvia").asDouble();
   }

   public Optional<Double> vampire() {
      return this.elm.get("vampire").asDouble();
   }

   public Optional<Double> velyna() {
      return this.elm.get("velyna").asDouble();
   }

   public Optional<Double> yoink() {
      return this.elm.get("yoink").asDouble();
   }
}
