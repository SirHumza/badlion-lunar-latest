package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.murder.murdersnapshot;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Armor() {
   @NotNull
   private final BetterJson elm;

   public Armor(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> chest() {
      return this.elm.get("CHEST").asString();
   }

   public Optional<String> foot() {
      return this.elm.get("FOOT").asString();
   }

   public Optional<String> head() {
      return this.elm.get("HEAD").asString();
   }

   public Optional<String> legs() {
      return this.elm.get("LEGS").asString();
   }
}
