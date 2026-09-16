package com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.Cactu;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.Carrot;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.CocoaBean;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.InUse;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.Melon;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.Mushroom;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.NetherStalk;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.Potato;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.Pumpkin;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.SugarCane;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.Sunflower;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.Wheat;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.WildRose;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record FarmingToolkit() {
   @NotNull
   private final BetterJson elm;

   public FarmingToolkit(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public SafeList<Cactu> cactus() {
      return this.elm.get("CACTUS").asList(Cactu::new);
   }

   public SafeList<Carrot> carrot() {
      return this.elm.get("CARROT").asList(Carrot::new);
   }

   public SafeList<CocoaBean> cocoaBeans() {
      return this.elm.get("COCOA_BEANS").asList(CocoaBean::new);
   }

   public InUse inUse() {
      return new InUse(this.elm.get("IN_USE"));
   }

   public Optional<Boolean> isUnlocked() {
      return this.elm.get("IS_UNLOCKED").asBool();
   }

   public SafeList<Melon> melon() {
      return this.elm.get("MELON").asList(Melon::new);
   }

   public SafeList<Mushroom> mushroom() {
      return this.elm.get("MUSHROOM").asList(Mushroom::new);
   }

   public SafeList<NetherStalk> netherStalk() {
      return this.elm.get("NETHER_STALK").asList(NetherStalk::new);
   }

   public SafeList<Potato> potato() {
      return this.elm.get("POTATO").asList(Potato::new);
   }

   public SafeList<Pumpkin> pumpkin() {
      return this.elm.get("PUMPKIN").asList(Pumpkin::new);
   }

   public SafeList<SugarCane> sugarCane() {
      return this.elm.get("SUGAR_CANE").asList(SugarCane::new);
   }

   public SafeList<Sunflower> sunflower() {
      return this.elm.get("SUNFLOWER").asList(Sunflower::new);
   }

   public SafeList<Wheat> wheat() {
      return this.elm.get("WHEAT").asList(Wheat::new);
   }

   public SafeList<WildRose> wildRose() {
      return this.elm.get("WILD_ROSE").asList(WildRose::new);
   }
}
