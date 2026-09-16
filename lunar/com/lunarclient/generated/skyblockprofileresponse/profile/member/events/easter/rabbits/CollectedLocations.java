package com.lunarclient.generated.skyblockprofileresponse.profile.member.events.easter.rabbits;

import com.lunarclient.BetterJson;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record CollectedLocations() {
   @NotNull
   private final BetterJson elm;

   public CollectedLocations(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> combat1() {
      return this.elm.get("combat_1").asListOpt(BetterJson::asString);
   }

   public List<String> combat3() {
      return this.elm.get("combat_3").asListOpt(BetterJson::asString);
   }

   public List<String> crimsonIsle() {
      return this.elm.get("crimson_isle").asListOpt(BetterJson::asString);
   }

   public List<String> crystalHollows() {
      return this.elm.get("crystal_hollows").asListOpt(BetterJson::asString);
   }

   public List<String> dungeonHub() {
      return this.elm.get("dungeon_hub").asListOpt(BetterJson::asString);
   }

   public List<String> farming1() {
      return this.elm.get("farming_1").asListOpt(BetterJson::asString);
   }

   public List<String> fishing1() {
      return this.elm.get("fishing_1").asListOpt(BetterJson::asString);
   }

   public List<String> foraging1() {
      return this.elm.get("foraging_1").asListOpt(BetterJson::asString);
   }

   public List<String> foraging2() {
      return this.elm.get("foraging_2").asListOpt(BetterJson::asString);
   }

   public List<String> hub() {
      return this.elm.get("hub").asListOpt(BetterJson::asString);
   }

   public List<String> lotusAtoll() {
      return this.elm.get("lotus_atoll").asListOpt(BetterJson::asString);
   }

   public List<String> mining1() {
      return this.elm.get("mining_1").asListOpt(BetterJson::asString);
   }

   public List<String> mining2() {
      return this.elm.get("mining_2").asListOpt(BetterJson::asString);
   }

   public List<String> mining3() {
      return this.elm.get("mining_3").asListOpt(BetterJson::asString);
   }
}
