package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record QuestRewards() {
   @NotNull
   private final BetterJson elm;

   public QuestRewards(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> bezos() {
      return this.elm.get("BEZOS").asDouble();
   }

   public Optional<Double> blazeAshes() {
      return this.elm.get("BLAZE_ASHES").asDouble();
   }

   public Optional<Double> burningEye() {
      return this.elm.get("BURNING_EYE").asDouble();
   }

   public Optional<Double> compactOoze() {
      return this.elm.get("COMPACT_OOZE").asDouble();
   }

   public Optional<Double> corruptedFragment() {
      return this.elm.get("CORRUPTED_FRAGMENT").asDouble();
   }

   public Optional<String> crimsonIsleBlobfishA() {
      return this.elm.get("crimson_isle_blobfish_a").asString();
   }

   public Optional<String> crimsonIsleBlobfishB() {
      return this.elm.get("crimson_isle_blobfish_b").asString();
   }

   public Optional<String> crimsonIsleBlobfishC() {
      return this.elm.get("crimson_isle_blobfish_c").asString();
   }

   public Optional<String> crimsonIsleBlobfishD() {
      return this.elm.get("crimson_isle_blobfish_d").asString();
   }

   public Optional<String> crimsonIsleBlobfishS() {
      return this.elm.get("crimson_isle_blobfish_s").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfArcherAnyD() {
      return this.elm.get("crimson_isle_dojo_test_of_archer_any_d").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfArcherAratingS() {
      return this.elm.get("crimson_isle_dojo_test_of_archer_arating_s").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfArcherBratingA() {
      return this.elm.get("crimson_isle_dojo_test_of_archer_brating_a").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfArcherCratingB() {
      return this.elm.get("crimson_isle_dojo_test_of_archer_crating_b").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfArcherDratingC() {
      return this.elm.get("crimson_isle_dojo_test_of_archer_drating_c").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfFireballAnyD() {
      return this.elm.get("crimson_isle_dojo_test_of_fireball_any_d").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfFireballAratingS() {
      return this.elm.get("crimson_isle_dojo_test_of_fireball_arating_s").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfFireballBratingA() {
      return this.elm.get("crimson_isle_dojo_test_of_fireball_brating_a").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfFireballCratingB() {
      return this.elm.get("crimson_isle_dojo_test_of_fireball_crating_b").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfFireballDratingC() {
      return this.elm.get("crimson_isle_dojo_test_of_fireball_drating_c").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfLockHeadAnyD() {
      return this.elm.get("crimson_isle_dojo_test_of_lock_head_any_d").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfLockHeadAratingS() {
      return this.elm.get("crimson_isle_dojo_test_of_lock_head_arating_s").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfLockHeadBratingA() {
      return this.elm.get("crimson_isle_dojo_test_of_lock_head_brating_a").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfLockHeadCratingB() {
      return this.elm.get("crimson_isle_dojo_test_of_lock_head_crating_b").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfLockHeadDratingC() {
      return this.elm.get("crimson_isle_dojo_test_of_lock_head_drating_c").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfMobKbAnyD() {
      return this.elm.get("crimson_isle_dojo_test_of_mob_kb_any_d").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfMobKbAratingS() {
      return this.elm.get("crimson_isle_dojo_test_of_mob_kb_arating_s").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfMobKbBratingA() {
      return this.elm.get("crimson_isle_dojo_test_of_mob_kb_brating_a").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfMobKbCratingB() {
      return this.elm.get("crimson_isle_dojo_test_of_mob_kb_crating_b").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfMobKbDratingC() {
      return this.elm.get("crimson_isle_dojo_test_of_mob_kb_drating_c").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSnakeAnyD() {
      return this.elm.get("crimson_isle_dojo_test_of_snake_any_d").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSnakeAratingS() {
      return this.elm.get("crimson_isle_dojo_test_of_snake_arating_s").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSnakeBratingA() {
      return this.elm.get("crimson_isle_dojo_test_of_snake_brating_a").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSnakeCratingB() {
      return this.elm.get("crimson_isle_dojo_test_of_snake_crating_b").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSnakeDratingC() {
      return this.elm.get("crimson_isle_dojo_test_of_snake_drating_c").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSwordSwapAnyD() {
      return this.elm.get("crimson_isle_dojo_test_of_sword_swap_any_d").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSwordSwapAratingS() {
      return this.elm.get("crimson_isle_dojo_test_of_sword_swap_arating_s").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSwordSwapBratingA() {
      return this.elm.get("crimson_isle_dojo_test_of_sword_swap_brating_a").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSwordSwapCratingB() {
      return this.elm.get("crimson_isle_dojo_test_of_sword_swap_crating_b").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfSwordSwapDratingC() {
      return this.elm.get("crimson_isle_dojo_test_of_sword_swap_drating_c").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfWallJumpAnyD() {
      return this.elm.get("crimson_isle_dojo_test_of_wall_jump_any_d").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfWallJumpAratingS() {
      return this.elm.get("crimson_isle_dojo_test_of_wall_jump_arating_s").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfWallJumpBratingA() {
      return this.elm.get("crimson_isle_dojo_test_of_wall_jump_brating_a").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfWallJumpCratingB() {
      return this.elm.get("crimson_isle_dojo_test_of_wall_jump_crating_b").asString();
   }

   public Optional<String> crimsonIsleDojoTestOfWallJumpDratingC() {
      return this.elm.get("crimson_isle_dojo_test_of_wall_jump_drating_c").asString();
   }

   public Optional<String> crimsonIsleFetch100SulphurA() {
      return this.elm.get("crimson_isle_fetch_100_sulphur_a").asString();
   }

   public Optional<String> crimsonIsleFetch10CorruptedFragmentA() {
      return this.elm.get("crimson_isle_fetch_10_corrupted_fragment_a").asString();
   }

   public Optional<String> crimsonIsleFetch12GazingPearlA() {
      return this.elm.get("crimson_isle_fetch_12_gazing_pearl_a").asString();
   }

   public Optional<String> crimsonIsleFetch20TentacleMeatA() {
      return this.elm.get("crimson_isle_fetch_20_tentacle_meat_a").asString();
   }

   public Optional<String> crimsonIsleFetch40BurningEyeA() {
      return this.elm.get("crimson_isle_fetch_40_burning_eye_a").asString();
   }

   public Optional<String> crimsonIsleFetch40DigestedMushroomsA() {
      return this.elm.get("crimson_isle_fetch_40_digested_mushrooms_a").asString();
   }

   public Optional<String> crimsonIsleFetch40KadaLeadA() {
      return this.elm.get("crimson_isle_fetch_40_kada_lead_a").asString();
   }

   public Optional<String> crimsonIsleFetch40MagmagA() {
      return this.elm.get("crimson_isle_fetch_40_magmag_a").asString();
   }

   public Optional<String> crimsonIsleFetch40SpectreDustA() {
      return this.elm.get("crimson_isle_fetch_40_spectre_dust_a").asString();
   }

   public Optional<String> crimsonIsleFetch40WitherSoulA() {
      return this.elm.get("crimson_isle_fetch_40_wither_soul_a").asString();
   }

   public Optional<String> crimsonIsleFetch8MutatedBlazeAshesA() {
      return this.elm.get("crimson_isle_fetch_8_mutated_blaze_ashes_a").asString();
   }

   public Optional<String> crimsonIsleFetchBurningEyeB() {
      return this.elm.get("crimson_isle_fetch_burning_eye_b").asString();
   }

   public Optional<String> crimsonIsleFetchBurningEyeC() {
      return this.elm.get("crimson_isle_fetch_burning_eye_c").asString();
   }

   public Optional<String> crimsonIsleFetchBurningEyeD() {
      return this.elm.get("crimson_isle_fetch_burning_eye_d").asString();
   }

   public Optional<String> crimsonIsleFetchBurningEyeS() {
      return this.elm.get("crimson_isle_fetch_burning_eye_s").asString();
   }

   public Optional<String> crimsonIsleFetchCorruptedFragmentB() {
      return this.elm.get("crimson_isle_fetch_corrupted_fragment_b").asString();
   }

   public Optional<String> crimsonIsleFetchCorruptedFragmentS() {
      return this.elm.get("crimson_isle_fetch_corrupted_fragment_s").asString();
   }

   public Optional<String> crimsonIsleFetchDigestedMushroomsB() {
      return this.elm.get("crimson_isle_fetch_digested_mushrooms_b").asString();
   }

   public Optional<String> crimsonIsleFetchDigestedMushroomsC() {
      return this.elm.get("crimson_isle_fetch_digested_mushrooms_c").asString();
   }

   public Optional<String> crimsonIsleFetchDigestedMushroomsD() {
      return this.elm.get("crimson_isle_fetch_digested_mushrooms_d").asString();
   }

   public Optional<String> crimsonIsleFetchDigestedMushroomsS() {
      return this.elm.get("crimson_isle_fetch_digested_mushrooms_s").asString();
   }

   public Optional<String> crimsonIsleFetchFactionItemA() {
      return this.elm.get("crimson_isle_fetch_faction_item_a").asString();
   }

   public Optional<String> crimsonIsleFetchFactionItemB() {
      return this.elm.get("crimson_isle_fetch_faction_item_b").asString();
   }

   public Optional<String> crimsonIsleFetchFactionItemD() {
      return this.elm.get("crimson_isle_fetch_faction_item_d").asString();
   }

   public Optional<String> crimsonIsleFetchFactionItemS() {
      return this.elm.get("crimson_isle_fetch_faction_item_s").asString();
   }

   public Optional<String> crimsonIsleFetchFactionItem_C() {
      return this.elm.get("crimson_isle_fetch_faction_item_C").asString();
   }

   public Optional<String> crimsonIsleFetchGazingPearlB() {
      return this.elm.get("crimson_isle_fetch_gazing_pearl_b").asString();
   }

   public Optional<String> crimsonIsleFetchGazingPearlC() {
      return this.elm.get("crimson_isle_fetch_gazing_pearl_c").asString();
   }

   public Optional<String> crimsonIsleFetchGazingPearlS() {
      return this.elm.get("crimson_isle_fetch_gazing_pearl_s").asString();
   }

   public Optional<String> crimsonIsleFetchKadaLeadB() {
      return this.elm.get("crimson_isle_fetch_kada_lead_b").asString();
   }

   public Optional<String> crimsonIsleFetchKadaLeadC() {
      return this.elm.get("crimson_isle_fetch_kada_lead_c").asString();
   }

   public Optional<String> crimsonIsleFetchKadaLeadD() {
      return this.elm.get("crimson_isle_fetch_kada_lead_d").asString();
   }

   public Optional<String> crimsonIsleFetchKadaLeadS() {
      return this.elm.get("crimson_isle_fetch_kada_lead_s").asString();
   }

   public Optional<String> crimsonIsleFetchMagmagB() {
      return this.elm.get("crimson_isle_fetch_magmag_b").asString();
   }

   public Optional<String> crimsonIsleFetchMagmagC() {
      return this.elm.get("crimson_isle_fetch_magmag_c").asString();
   }

   public Optional<String> crimsonIsleFetchMagmagD() {
      return this.elm.get("crimson_isle_fetch_magmag_d").asString();
   }

   public Optional<String> crimsonIsleFetchMagmagS() {
      return this.elm.get("crimson_isle_fetch_magmag_s").asString();
   }

   public Optional<String> crimsonIsleFetchMutatedBlazeAshesB() {
      return this.elm.get("crimson_isle_fetch_mutated_blaze_ashes_b").asString();
   }

   public Optional<String> crimsonIsleFetchMutatedBlazeAshesC() {
      return this.elm.get("crimson_isle_fetch_mutated_blaze_ashes_c").asString();
   }

   public Optional<String> crimsonIsleFetchMutatedBlazeAshesS() {
      return this.elm.get("crimson_isle_fetch_mutated_blaze_ashes_s").asString();
   }

   public Optional<String> crimsonIsleFetchSpectreDustB() {
      return this.elm.get("crimson_isle_fetch_spectre_dust_b").asString();
   }

   public Optional<String> crimsonIsleFetchSpectreDustC() {
      return this.elm.get("crimson_isle_fetch_spectre_dust_c").asString();
   }

   public Optional<String> crimsonIsleFetchSpectreDustD() {
      return this.elm.get("crimson_isle_fetch_spectre_dust_d").asString();
   }

   public Optional<String> crimsonIsleFetchSpectreDustS() {
      return this.elm.get("crimson_isle_fetch_spectre_dust_s").asString();
   }

   public Optional<String> crimsonIsleFetchSulphurB() {
      return this.elm.get("crimson_isle_fetch_sulphur_b").asString();
   }

   public Optional<String> crimsonIsleFetchSulphurC() {
      return this.elm.get("crimson_isle_fetch_sulphur_c").asString();
   }

   public Optional<String> crimsonIsleFetchSulphurD() {
      return this.elm.get("crimson_isle_fetch_sulphur_d").asString();
   }

   public Optional<String> crimsonIsleFetchTentacleMeatB() {
      return this.elm.get("crimson_isle_fetch_tentacle_meat_b").asString();
   }

   public Optional<String> crimsonIsleFetchTentacleMeatC() {
      return this.elm.get("crimson_isle_fetch_tentacle_meat_c").asString();
   }

   public Optional<String> crimsonIsleFetchTentacleMeatS() {
      return this.elm.get("crimson_isle_fetch_tentacle_meat_s").asString();
   }

   public Optional<String> crimsonIsleFetchWitherSoulB() {
      return this.elm.get("crimson_isle_fetch_wither_soul_b").asString();
   }

   public Optional<String> crimsonIsleFetchWitherSoulC() {
      return this.elm.get("crimson_isle_fetch_wither_soul_c").asString();
   }

   public Optional<String> crimsonIsleFetchWitherSoulD() {
      return this.elm.get("crimson_isle_fetch_wither_soul_d").asString();
   }

   public Optional<String> crimsonIsleFetchWitherSoulS() {
      return this.elm.get("crimson_isle_fetch_wither_soul_s").asString();
   }

   public Optional<String> crimsonIsleFetch_SulphurS() {
      return this.elm.get("crimson_isle_fetch__sulphur_s").asString();
   }

   public Optional<String> crimsonIsleFightKuudraBurningTierS() {
      return this.elm.get("crimson_isle_fight_kuudra_burning_tier_s").asString();
   }

   public Optional<String> crimsonIsleFightKuudraHotTierA() {
      return this.elm.get("crimson_isle_fight_kuudra_hot_tier_a").asString();
   }

   public Optional<String> crimsonIsleFightKuudraHotTierB() {
      return this.elm.get("crimson_isle_fight_kuudra_hot_tier_b").asString();
   }

   public Optional<String> crimsonIsleFightKuudraNoneTierC() {
      return this.elm.get("crimson_isle_fight_kuudra_none_tier_c").asString();
   }

   public Optional<String> crimsonIsleFlyfishA() {
      return this.elm.get("crimson_isle_flyfish_a").asString();
   }

   public Optional<String> crimsonIsleFlyfishB() {
      return this.elm.get("crimson_isle_flyfish_b").asString();
   }

   public Optional<String> crimsonIsleFlyfishC() {
      return this.elm.get("crimson_isle_flyfish_c").asString();
   }

   public Optional<String> crimsonIsleFlyfishD() {
      return this.elm.get("crimson_isle_flyfish_d").asString();
   }

   public Optional<String> crimsonIsleFlyfishS() {
      return this.elm.get("crimson_isle_flyfish_s").asString();
   }

   public Optional<String> crimsonIsleGoldfishA() {
      return this.elm.get("crimson_isle_goldfish_a").asString();
   }

   public Optional<String> crimsonIsleGoldfishB() {
      return this.elm.get("crimson_isle_goldfish_b").asString();
   }

   public Optional<String> crimsonIsleGoldfishC() {
      return this.elm.get("crimson_isle_goldfish_c").asString();
   }

   public Optional<String> crimsonIsleGoldfishS() {
      return this.elm.get("crimson_isle_goldfish_s").asString();
   }

   public Optional<String> crimsonIsleGusherA() {
      return this.elm.get("crimson_isle_gusher_a").asString();
   }

   public Optional<String> crimsonIsleGusherB() {
      return this.elm.get("crimson_isle_gusher_b").asString();
   }

   public Optional<String> crimsonIsleGusherC() {
      return this.elm.get("crimson_isle_gusher_c").asString();
   }

   public Optional<String> crimsonIsleGusherD() {
      return this.elm.get("crimson_isle_gusher_d").asString();
   }

   public Optional<String> crimsonIsleGusherS() {
      return this.elm.get("crimson_isle_gusher_s").asString();
   }

   public Optional<String> crimsonIsleKillAshfangA() {
      return this.elm.get("crimson_isle_kill_ashfang_a").asString();
   }

   public Optional<String> crimsonIsleKillAshfangB() {
      return this.elm.get("crimson_isle_kill_ashfang_b").asString();
   }

   public Optional<String> crimsonIsleKillAshfangC() {
      return this.elm.get("crimson_isle_kill_ashfang_c").asString();
   }

   public Optional<String> crimsonIsleKillAshfangS() {
      return this.elm.get("crimson_isle_kill_ashfang_s").asString();
   }

   public Optional<String> crimsonIsleKillBarbarianDukeXA() {
      return this.elm.get("crimson_isle_kill_barbarian_duke_x_a").asString();
   }

   public Optional<String> crimsonIsleKillBarbarianDukeXB() {
      return this.elm.get("crimson_isle_kill_barbarian_duke_x_b").asString();
   }

   public Optional<String> crimsonIsleKillBarbarianDukeXC() {
      return this.elm.get("crimson_isle_kill_barbarian_duke_x_c").asString();
   }

   public Optional<String> crimsonIsleKillBarbarianDukeXS() {
      return this.elm.get("crimson_isle_kill_barbarian_duke_x_s").asString();
   }

   public Optional<String> crimsonIsleKillBladesoulA() {
      return this.elm.get("crimson_isle_kill_bladesoul_a").asString();
   }

   public Optional<String> crimsonIsleKillBladesoulB() {
      return this.elm.get("crimson_isle_kill_bladesoul_b").asString();
   }

   public Optional<String> crimsonIsleKillBladesoulC() {
      return this.elm.get("crimson_isle_kill_bladesoul_c").asString();
   }

   public Optional<String> crimsonIsleKillBladesoulS() {
      return this.elm.get("crimson_isle_kill_bladesoul_s").asString();
   }

   public Optional<String> crimsonIsleKillMageOutlawA() {
      return this.elm.get("crimson_isle_kill_mage_outlaw_a").asString();
   }

   public Optional<String> crimsonIsleKillMageOutlawB() {
      return this.elm.get("crimson_isle_kill_mage_outlaw_b").asString();
   }

   public Optional<String> crimsonIsleKillMageOutlawC() {
      return this.elm.get("crimson_isle_kill_mage_outlaw_c").asString();
   }

   public Optional<String> crimsonIsleKillMageOutlawS() {
      return this.elm.get("crimson_isle_kill_mage_outlaw_s").asString();
   }

   public Optional<String> crimsonIsleKillMagmaBossA() {
      return this.elm.get("crimson_isle_kill_magma_boss_a").asString();
   }

   public Optional<String> crimsonIsleKillMagmaBossB() {
      return this.elm.get("crimson_isle_kill_magma_boss_b").asString();
   }

   public Optional<String> crimsonIsleKillMagmaBossC() {
      return this.elm.get("crimson_isle_kill_magma_boss_c").asString();
   }

   public Optional<String> crimsonIsleKillMagmaBossS() {
      return this.elm.get("crimson_isle_kill_magma_boss_s").asString();
   }

   public Optional<String> crimsonIsleLavahorseA() {
      return this.elm.get("crimson_isle_lavahorse_a").asString();
   }

   public Optional<String> crimsonIsleLavahorseB() {
      return this.elm.get("crimson_isle_lavahorse_b").asString();
   }

   public Optional<String> crimsonIsleLavahorseC() {
      return this.elm.get("crimson_isle_lavahorse_c").asString();
   }

   public Optional<String> crimsonIsleLavahorseD() {
      return this.elm.get("crimson_isle_lavahorse_d").asString();
   }

   public Optional<String> crimsonIsleLavahorseS() {
      return this.elm.get("crimson_isle_lavahorse_s").asString();
   }

   public Optional<String> crimsonIsleManarayA() {
      return this.elm.get("crimson_isle_manaray_a").asString();
   }

   public Optional<String> crimsonIsleManarayB() {
      return this.elm.get("crimson_isle_manaray_b").asString();
   }

   public Optional<String> crimsonIsleManarayS() {
      return this.elm.get("crimson_isle_manaray_s").asString();
   }

   public Optional<String> crimsonIsleMoldfinA() {
      return this.elm.get("crimson_isle_moldfin_a").asString();
   }

   public Optional<String> crimsonIsleMoldfinB() {
      return this.elm.get("crimson_isle_moldfin_b").asString();
   }

   public Optional<String> crimsonIsleMoldfinD() {
      return this.elm.get("crimson_isle_moldfin_d").asString();
   }

   public Optional<String> crimsonIsleMoldfinS() {
      return this.elm.get("crimson_isle_moldfin_s").asString();
   }

   public Optional<String> crimsonIsleMoldfin_C() {
      return this.elm.get("crimson_isle_moldfin_C").asString();
   }

   public Optional<String> crimsonIsleRescueA() {
      return this.elm.get("crimson_isle_rescue_a").asString();
   }

   public Optional<String> crimsonIsleRescueB() {
      return this.elm.get("crimson_isle_rescue_b").asString();
   }

   public Optional<String> crimsonIsleRescueC() {
      return this.elm.get("crimson_isle_rescue_c").asString();
   }

   public Optional<String> crimsonIsleRescueD() {
      return this.elm.get("crimson_isle_rescue_d").asString();
   }

   public Optional<String> crimsonIsleRescueS() {
      return this.elm.get("crimson_isle_rescue_s").asString();
   }

   public Optional<String> crimsonIsleSkeletonfishA() {
      return this.elm.get("crimson_isle_skeletonfish_a").asString();
   }

   public Optional<String> crimsonIsleSkeletonfishB() {
      return this.elm.get("crimson_isle_skeletonfish_b").asString();
   }

   public Optional<String> crimsonIsleSkeletonfishC() {
      return this.elm.get("crimson_isle_skeletonfish_c").asString();
   }

   public Optional<String> crimsonIsleSkeletonfishD() {
      return this.elm.get("crimson_isle_skeletonfish_d").asString();
   }

   public Optional<String> crimsonIsleSkeletonfishS() {
      return this.elm.get("crimson_isle_skeletonfish_s").asString();
   }

   public Optional<String> crimsonIsleSlugfishA() {
      return this.elm.get("crimson_isle_slugfish_a").asString();
   }

   public Optional<String> crimsonIsleSlugfishB() {
      return this.elm.get("crimson_isle_slugfish_b").asString();
   }

   public Optional<String> crimsonIsleSlugfishC() {
      return this.elm.get("crimson_isle_slugfish_c").asString();
   }

   public Optional<String> crimsonIsleSlugfishD() {
      return this.elm.get("crimson_isle_slugfish_d").asString();
   }

   public Optional<String> crimsonIsleSlugfishS() {
      return this.elm.get("crimson_isle_slugfish_s").asString();
   }

   public Optional<String> crimsonIsleSoulfishA() {
      return this.elm.get("crimson_isle_soulfish_a").asString();
   }

   public Optional<String> crimsonIsleSoulfishB() {
      return this.elm.get("crimson_isle_soulfish_b").asString();
   }

   public Optional<String> crimsonIsleSoulfishC() {
      return this.elm.get("crimson_isle_soulfish_c").asString();
   }

   public Optional<String> crimsonIsleSoulfishD() {
      return this.elm.get("crimson_isle_soulfish_d").asString();
   }

   public Optional<String> crimsonIsleSoulfishS() {
      return this.elm.get("crimson_isle_soulfish_s").asString();
   }

   public Optional<String> crimsonIsleSteamingHotFlounderA() {
      return this.elm.get("crimson_isle_steaming_hot_flounder_a").asString();
   }

   public Optional<String> crimsonIsleSteamingHotFlounderB() {
      return this.elm.get("crimson_isle_steaming_hot_flounder_b").asString();
   }

   public Optional<String> crimsonIsleSteamingHotFlounderC() {
      return this.elm.get("crimson_isle_steaming_hot_flounder_c").asString();
   }

   public Optional<String> crimsonIsleSteamingHotFlounderD() {
      return this.elm.get("crimson_isle_steaming_hot_flounder_d").asString();
   }

   public Optional<String> crimsonIsleSteamingHotFlounderS() {
      return this.elm.get("crimson_isle_steaming_hot_flounder_s").asString();
   }

   public Optional<String> crimsonIsleSulphurskitterA() {
      return this.elm.get("crimson_isle_sulphurskitter_a").asString();
   }

   public Optional<String> crimsonIsleSulphurskitterB() {
      return this.elm.get("crimson_isle_sulphurskitter_b").asString();
   }

   public Optional<String> crimsonIsleSulphurskitterC() {
      return this.elm.get("crimson_isle_sulphurskitter_c").asString();
   }

   public Optional<String> crimsonIsleSulphurskitterS() {
      return this.elm.get("crimson_isle_sulphurskitter_s").asString();
   }

   public Optional<String> crimsonIsleVolcanicstonefishA() {
      return this.elm.get("crimson_isle_volcanicstonefish_a").asString();
   }

   public Optional<String> crimsonIsleVolcanicstonefishB() {
      return this.elm.get("crimson_isle_volcanicstonefish_b").asString();
   }

   public Optional<String> crimsonIsleVolcanicstonefishC() {
      return this.elm.get("crimson_isle_volcanicstonefish_c").asString();
   }

   public Optional<String> crimsonIsleVolcanicstonefishD() {
      return this.elm.get("crimson_isle_volcanicstonefish_d").asString();
   }

   public Optional<String> crimsonIsleVolcanicstonefishS() {
      return this.elm.get("crimson_isle_volcanicstonefish_s").asString();
   }

   public Optional<Double> cupOfBlood() {
      return this.elm.get("CUP_OF_BLOOD").asDouble();
   }

   public Optional<Double> digestedMushrooms() {
      return this.elm.get("DIGESTED_MUSHROOMS").asDouble();
   }

   public Optional<Double> flamingHeart() {
      return this.elm.get("FLAMING_HEART").asDouble();
   }

   public Optional<Double> gazingPearl() {
      return this.elm.get("GAZING_PEARL").asDouble();
   }

   public Optional<Double> hallowedSkull() {
      return this.elm.get("HALLOWED_SKULL").asDouble();
   }

   public Optional<Double> hornOfTaurus() {
      return this.elm.get("HORN_OF_TAURUS").asDouble();
   }

   public Optional<Double> kadaLead() {
      return this.elm.get("KADA_LEAD").asDouble();
   }

   public Optional<Double> leatherCloth() {
      return this.elm.get("LEATHER_CLOTH").asDouble();
   }

   public Optional<Double> luminoFiber() {
      return this.elm.get("LUMINO_FIBER").asDouble();
   }

   public Optional<Double> lumpOfMagma() {
      return this.elm.get("LUMP_OF_MAGMA").asDouble();
   }

   public Optional<Double> magmag() {
      return this.elm.get("MAGMAG").asDouble();
   }

   public Optional<Double> moogmaPelt() {
      return this.elm.get("MOOGMA_PELT").asDouble();
   }

   public Optional<Double> mutatedBlazeAshes() {
      return this.elm.get("MUTATED_BLAZE_ASHES").asDouble();
   }

   public Optional<Double> orbOfEnergy() {
      return this.elm.get("ORB_OF_ENERGY").asDouble();
   }

   public Optional<Double> pyroclasticScale() {
      return this.elm.get("PYROCLASTIC_SCALE").asDouble();
   }

   public Optional<Double> spectreDust() {
      return this.elm.get("SPECTRE_DUST").asDouble();
   }

   public Optional<Double> spellPowder() {
      return this.elm.get("SPELL_POWDER").asDouble();
   }

   public Optional<Double> tentacleMeat() {
      return this.elm.get("TENTACLE_MEAT").asDouble();
   }

   public Optional<Double> witherSoul() {
      return this.elm.get("WITHER_SOUL").asDouble();
   }
}
