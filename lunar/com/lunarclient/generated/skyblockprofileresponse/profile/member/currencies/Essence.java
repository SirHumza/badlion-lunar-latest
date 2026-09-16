package com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.essence.Crimson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.essence.Diamond;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.essence.Dragon;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.essence.Gold;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.essence.Ice;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.essence.Spider;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.essence.Undead;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.currencies.essence.Wither;
import org.jetbrains.annotations.NotNull;

public record Essence() {
   @NotNull
   private final BetterJson elm;

   public Essence(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Crimson crimson() {
      return new Crimson(this.elm.get("CRIMSON"));
   }

   public Diamond diamond() {
      return new Diamond(this.elm.get("DIAMOND"));
   }

   public Dragon dragon() {
      return new Dragon(this.elm.get("DRAGON"));
   }

   public Gold gold() {
      return new Gold(this.elm.get("GOLD"));
   }

   public Ice ice() {
      return new Ice(this.elm.get("ICE"));
   }

   public Spider spider() {
      return new Spider(this.elm.get("SPIDER"));
   }

   public Undead undead() {
      return new Undead(this.elm.get("UNDEAD"));
   }

   public Wither wither() {
      return new Wither(this.elm.get("WITHER"));
   }
}
