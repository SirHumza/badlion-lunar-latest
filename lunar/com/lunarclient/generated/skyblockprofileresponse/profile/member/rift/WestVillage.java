package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage.CrazyKloon;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage.Glyphs;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage.KatHouse;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.westvillage.Mirrorverse;
import org.jetbrains.annotations.NotNull;

public record WestVillage() {
   @NotNull
   private final BetterJson elm;

   public WestVillage(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public CrazyKloon crazyKloon() {
      return new CrazyKloon(this.elm.get("crazy_kloon"));
   }

   public Glyphs glyphs() {
      return new Glyphs(this.elm.get("glyphs"));
   }

   public KatHouse katHouse() {
      return new KatHouse(this.elm.get("kat_house"));
   }

   public Mirrorverse mirrorverse() {
      return new Mirrorverse(this.elm.get("mirrorverse"));
   }
}
