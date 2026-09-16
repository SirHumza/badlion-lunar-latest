package com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.autopet.rule;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Data() {
   @NotNull
   private final BetterJson elm;

   public Data(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> _class() {
      return this.elm.get("class").asString();
   }

   public Optional<String> boss() {
      return this.elm.get("boss").asString();
   }

   public Optional<String> category() {
      return this.elm.get("category").asString();
   }

   public Optional<String> collection() {
      return this.elm.get("collection").asString();
   }

   public Optional<String> entityType() {
      return this.elm.get("entity_type").asString();
   }

   public Optional<String> event() {
      return this.elm.get("event").asString();
   }

   public Optional<String> floor() {
      return this.elm.get("floor").asString();
   }

   public Optional<String> island() {
      return this.elm.get("island").asString();
   }

   public Optional<String> master() {
      return this.elm.get("master").asString();
   }

   public Optional<String> skill() {
      return this.elm.get("skill").asString();
   }

   public Optional<String> slot() {
      return this.elm.get("slot").asString();
   }
}
