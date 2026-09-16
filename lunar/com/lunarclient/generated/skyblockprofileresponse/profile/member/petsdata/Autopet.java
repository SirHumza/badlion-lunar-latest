package com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.autopet.Rule;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Autopet() {
   @NotNull
   private final BetterJson elm;

   public Autopet(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> migrated() {
      return this.elm.get("migrated").asBool();
   }

   public Optional<Boolean> migrated2() {
      return this.elm.get("migrated_2").asBool();
   }

   public SafeList<Rule> rules() {
      return this.elm.get("rules").asList(Rule::new);
   }

   public Optional<Double> rulesLimit() {
      return this.elm.get("rules_limit").asDouble();
   }
}
