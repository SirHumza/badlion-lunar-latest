package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.Abiphone;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.Dojo;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.KuudraCompletedTiers;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.KuudraPartyFinder;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.Matriarch;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.NpcPath;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record NetherIslandPlayerData() {
   @NotNull
   private final BetterJson elm;

   public NetherIslandPlayerData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Abiphone abiphone() {
      return new Abiphone(this.elm.get("abiphone"));
   }

   public Optional<Double> barbariansReputation() {
      return this.elm.get("barbarians_reputation").asDouble();
   }

   public Optional<Double> barbariansReputationHighest() {
      return this.elm.get("barbarians_reputation_highest").asDouble();
   }

   public Dojo dojo() {
      return new Dojo(this.elm.get("dojo"));
   }

   public KuudraCompletedTiers kuudraCompletedTiers() {
      return new KuudraCompletedTiers(this.elm.get("kuudra_completed_tiers"));
   }

   public KuudraPartyFinder kuudraPartyFinder() {
      return new KuudraPartyFinder(this.elm.get("kuudra_party_finder"));
   }

   public List<String> lastMinibossesKilled() {
      return this.elm.get("last_minibosses_killed").asListOpt(BetterJson::asString);
   }

   public Optional<Double> magesReputation() {
      return this.elm.get("mages_reputation").asDouble();
   }

   public Optional<Double> magesReputationHighest() {
      return this.elm.get("mages_reputation_highest").asDouble();
   }

   public Matriarch matriarch() {
      return new Matriarch(this.elm.get("matriarch"));
   }

   public NpcPath npcPath() {
      return new NpcPath(this.elm.get("npc_path"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.Quests quests() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.Quests(this.elm.get("quests"));
   }

   public Optional<String> selectedFaction() {
      return this.elm.get("selected_faction").asString();
   }
}
