package com.lunarclient.generated.skyblockprofileresponse.profile.member.forge.forgeprocesses.forgeprocess;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.forge.forgeprocesses.forgeprocess.forgeprocessinfo.OldItem;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record ForgeProcessInfo() {
   @NotNull
   private final BetterJson elm;

   public ForgeProcessInfo(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<String> id() {
      return this.elm.get("id").asString();
   }

   public Optional<Boolean> notified() {
      return this.elm.get("notified").asBool();
   }

   public OldItem oldItem() {
      return new OldItem(this.elm.get("oldItem"));
   }

   public Optional<Double> processTimeModifier() {
      return this.elm.get("processTimeModifier").asDouble();
   }

   public Optional<Double> slot() {
      return this.elm.get("slot").asDouble();
   }

   public Optional<Double> startTime() {
      return this.elm.get("startTime").asDouble();
   }

   public Optional<String> type() {
      return this.elm.get("type").asString();
   }
}
