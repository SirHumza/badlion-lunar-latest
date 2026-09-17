package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.abiphone;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.abiphone.contactdata.Specific;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ContactData() {
   @NotNull
   private final BetterJson elm;

   public ContactData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> completedQuest() {
      return this.elm.get("completed_quest").asBool();
   }

   public Optional<Boolean> dndEnabled() {
      return this.elm.get("dnd_enabled").asBool();
   }

   public Optional<Double> incomingCallsCount() {
      return this.elm.get("incoming_calls_count").asDouble();
   }

   public Optional<Boolean> itemsGiven() {
      return this.elm.get("items_given").asBool();
   }

   public Optional<Double> lastCall() {
      return this.elm.get("last_call").asDouble();
   }

   public Optional<Double> lastCallIncoming() {
      return this.elm.get("last_call_incoming").asDouble();
   }

   public Specific specific() {
      return new Specific(this.elm.get("specific"));
   }

   public Optional<Boolean> talkedTo() {
      return this.elm.get("talked_to").asBool();
   }
}
