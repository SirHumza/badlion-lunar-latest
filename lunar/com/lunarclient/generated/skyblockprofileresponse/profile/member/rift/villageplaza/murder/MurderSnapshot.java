package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.murder;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.murder.murdersnapshot.Armor;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.murder.murdersnapshot.Pet;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record MurderSnapshot() {
   @NotNull
   private final BetterJson elm;

   public MurderSnapshot(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Armor armor() {
      return new Armor(this.elm.get("armor"));
   }

   public Optional<String> held() {
      return this.elm.get("held").asString();
   }

   public Pet pet() {
      return new Pet(this.elm.get("pet"));
   }
}
