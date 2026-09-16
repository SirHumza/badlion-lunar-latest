package com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.pet.Extra;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Pet() {
   @NotNull
   private final BetterJson elm;

   public Pet(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> active() {
      return this.elm.get("active").asBool();
   }

   public Optional<Double> candyUsed() {
      return this.elm.get("candyUsed").asDouble();
   }

   public Optional<Double> exp() {
      return this.elm.get("exp").asDouble();
   }

   public Extra extra() {
      return new Extra(this.elm.get("extra"));
   }

   public Optional<String> heldItem() {
      return this.elm.get("heldItem").asString();
   }

   public Optional<String> heldItemUuid() {
      return this.elm.get("heldItemUuid").asString();
   }

   public Optional<Boolean> petSoulbound() {
      return this.elm.get("petSoulbound").asBool();
   }

   public Optional<String> skin() {
      return this.elm.get("skin").asString();
   }

   public Optional<String> tier() {
      return this.elm.get("tier").asString();
   }

   public Optional<String> type() {
      return this.elm.get("type").asString();
   }

   public Optional<String> uniqueId() {
      return this.elm.get("uniqueId").asString();
   }

   public Optional<String> uuid() {
      return this.elm.get("uuid").asString();
   }
}
