package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.AlchemistQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.AranyaQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.ChickenQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.DuelTrainingQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.EdelisQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.KuudaBossDaily;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.MinibossDaily;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.MinibossData;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.MollimQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.PabloQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.PomtairQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.QuestData;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.QuestRewards;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.Rulenor;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.SirihQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.SuusQuest;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Quests() {
   @NotNull
   private final BetterJson elm;

   public Quests(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public AlchemistQuest alchemistQuest() {
      return new AlchemistQuest(this.elm.get("alchemist_quest"));
   }

   public AranyaQuest aranyaQuest() {
      return new AranyaQuest(this.elm.get("aranya_quest"));
   }

   public Optional<String> cavityRarity() {
      return this.elm.get("cavity_rarity").asString();
   }

   public ChickenQuest chickenQuest() {
      return new ChickenQuest(this.elm.get("chicken_quest"));
   }

   public Optional<Double> chickenQuestHandedIn() {
      return this.elm.get("chicken_quest_handed_in").asDouble();
   }

   public DuelTrainingQuest duelTrainingQuest() {
      return new DuelTrainingQuest(this.elm.get("duel_training_quest"));
   }

   public EdelisQuest edelisQuest() {
      return new EdelisQuest(this.elm.get("edelis_quest"));
   }

   public Optional<Boolean> fishedWetNapkin() {
      return this.elm.get("fished_wet_napkin").asBool();
   }

   public Optional<Boolean> foundKuudraBook() {
      return this.elm.get("found_kuudra_book").asBool();
   }

   public Optional<Boolean> foundKuudraBoots() {
      return this.elm.get("found_kuudra_boots").asBool();
   }

   public Optional<Boolean> foundKuudraChestplate() {
      return this.elm.get("found_kuudra_chestplate").asBool();
   }

   public Optional<Boolean> foundKuudraHelmet() {
      return this.elm.get("found_kuudra_helmet").asBool();
   }

   public Optional<Boolean> foundKuudraLeggings() {
      return this.elm.get("found_kuudra_leggings").asBool();
   }

   public KuudaBossDaily kuudaBossDaily() {
      return new KuudaBossDaily(this.elm.get("kuuda_boss_daily"));
   }

   public Optional<Boolean> kuudraLoremaster() {
      return this.elm.get("kuudra_loremaster").asBool();
   }

   public Optional<Double> lastBelieverBlessing() {
      return this.elm.get("last_believer_blessing").asDouble();
   }

   public Optional<Double> lastKuudraRelic() {
      return this.elm.get("last_kuudra_relic").asDouble();
   }

   public Optional<Double> lastReset() {
      return this.elm.get("last_reset").asDouble();
   }

   public Optional<Double> lastVampireBlood() {
      return this.elm.get("last_vampire_blood").asDouble();
   }

   public MinibossDaily minibossDaily() {
      return new MinibossDaily(this.elm.get("miniboss_daily"));
   }

   public MinibossData minibossData() {
      return new MinibossData(this.elm.get("miniboss_data"));
   }

   public MollimQuest mollimQuest() {
      return new MollimQuest(this.elm.get("mollim_quest"));
   }

   public PabloQuest pabloQuest() {
      return new PabloQuest(this.elm.get("pablo_quest"));
   }

   public Optional<Boolean> paidBruuh() {
      return this.elm.get("paid_bruuh").asBool();
   }

   public PomtairQuest pomtairQuest() {
      return new PomtairQuest(this.elm.get("pomtair_quest"));
   }

   public QuestData questData() {
      return new QuestData(this.elm.get("quest_data"));
   }

   public QuestRewards questRewards() {
      return new QuestRewards(this.elm.get("quest_rewards"));
   }

   public Rulenor rulenor() {
      return new Rulenor(this.elm.get("rulenor"));
   }

   public SirihQuest sirihQuest() {
      return new SirihQuest(this.elm.get("sirih_quest"));
   }

   public SuusQuest suusQuest() {
      return new SuusQuest(this.elm.get("suus_quest"));
   }

   public List<String> unlockedCavityNpcs() {
      return this.elm.get("unlocked_cavity_npcs").asListOpt(BetterJson::asString);
   }

   public Optional<Boolean> weirdSailor() {
      return this.elm.get("weird_sailor").asBool();
   }
}
