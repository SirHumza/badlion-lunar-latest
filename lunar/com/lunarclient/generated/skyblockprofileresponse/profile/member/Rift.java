package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.Access;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.BlackLagoon;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.Castle;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.DeadCats;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.Dreadfarm;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.Enigma;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.Gallery;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.SlayerQuest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.VillagePlaza;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.WestVillage;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.WitherCage;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.WizardTower;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.WyldWoods;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record Rift() {
   @NotNull
   private final BetterJson elm;

   public Rift(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Access access() {
      return new Access(this.elm.get("access"));
   }

   public BlackLagoon blackLagoon() {
      return new BlackLagoon(this.elm.get("black_lagoon"));
   }

   public Castle castle() {
      return new Castle(this.elm.get("castle"));
   }

   public DeadCats deadCats() {
      return new DeadCats(this.elm.get("dead_cats"));
   }

   public Dreadfarm dreadfarm() {
      return new Dreadfarm(this.elm.get("dreadfarm"));
   }

   public Enigma enigma() {
      return new Enigma(this.elm.get("enigma"));
   }

   public Gallery gallery() {
      return new Gallery(this.elm.get("gallery"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.Inventory inventory() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.Inventory(this.elm.get("inventory"));
   }

   public List<String> lifetimePurchasedBoundaries() {
      return this.elm.get("lifetime_purchased_boundaries").asListOpt(BetterJson::asString);
   }

   public SlayerQuest slayerQuest() {
      return new SlayerQuest(this.elm.get("slayer_quest"));
   }

   public VillagePlaza villagePlaza() {
      return new VillagePlaza(this.elm.get("village_plaza"));
   }

   public WestVillage westVillage() {
      return new WestVillage(this.elm.get("west_village"));
   }

   public WitherCage witherCage() {
      return new WitherCage(this.elm.get("wither_cage"));
   }

   public WizardTower wizardTower() {
      return new WizardTower(this.elm.get("wizard_tower"));
   }

   public WyldWoods wyldWoods() {
      return new WyldWoods(this.elm.get("wyld_woods"));
   }
}
