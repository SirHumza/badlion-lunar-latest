package com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Cactus;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.CocoaBeans;
import org.jetbrains.annotations.NotNull;

public record InUse() {
   @NotNull
   private final BetterJson elm;

   public InUse(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Cactus cactus() {
      return new Cactus(this.elm.get("CACTUS"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Carrot carrot() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Carrot(this.elm.get("CARROT"));
   }

   public CocoaBeans cocoaBeans() {
      return new CocoaBeans(this.elm.get("COCOA_BEANS"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Melon melon() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Melon(this.elm.get("MELON"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Mushroom mushroom() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Mushroom(this.elm.get("MUSHROOM"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.NetherStalk netherStalk() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.NetherStalk(
         this.elm.get("NETHER_STALK")
      );
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Potato potato() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Potato(this.elm.get("POTATO"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Pumpkin pumpkin() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Pumpkin(this.elm.get("PUMPKIN"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.SugarCane sugarCane() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.SugarCane(this.elm.get("SUGAR_CANE"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Sunflower sunflower() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Sunflower(this.elm.get("SUNFLOWER"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Wheat wheat() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.Wheat(this.elm.get("WHEAT"));
   }

   public com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.WildRose wildRose() {
      return new com.lunarclient.generated.skyblockprofileresponse.profile.member.gardenplayerdata.farmingtoolkit.inuse.WildRose(this.elm.get("WILD_ROSE"));
   }
}
