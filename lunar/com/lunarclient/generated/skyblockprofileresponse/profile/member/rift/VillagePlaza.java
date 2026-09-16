package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.BarryCenter;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.BarterBank;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.Cowboy;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.Lonely;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.Murder;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.Seraphine;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record VillagePlaza() {
   @NotNull
   private final BetterJson elm;

   public VillagePlaza(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public BarryCenter barryCenter() {
      return new BarryCenter(this.elm.get("barry_center"));
   }

   public BarterBank barterBank() {
      return new BarterBank(this.elm.get("barter_bank"));
   }

   public Cowboy cowboy() {
      return new Cowboy(this.elm.get("cowboy"));
   }

   public Optional<Boolean> gotScammed() {
      return this.elm.get("got_scammed").asBool();
   }

   public Lonely lonely() {
      return new Lonely(this.elm.get("lonely"));
   }

   public Murder murder() {
      return new Murder(this.elm.get("murder"));
   }

   public Seraphine seraphine() {
      return new Seraphine(this.elm.get("seraphine"));
   }
}
