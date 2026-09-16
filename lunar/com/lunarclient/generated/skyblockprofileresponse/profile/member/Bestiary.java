package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.bestiary.Milestone;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.bestiary.Miscellaneous;
import java.util.Map;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Bestiary() {
   @NotNull
   private final BetterJson elm;

   public Bestiary(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Map<String, Double> deaths() {
      return this.elm.get("deaths").asMapOpt(BetterJson::asDouble);
   }

   public Map<String, Double> kills() {
      return this.elm.get("kills").asMapOpt(BetterJson::asDouble);
   }

   public Optional<Boolean> migratedStats() {
      return this.elm.get("migrated_stats").asBool();
   }

   public Optional<Boolean> migration() {
      return this.elm.get("migration").asBool();
   }

   public Milestone milestone() {
      return new Milestone(this.elm.get("milestone"));
   }

   public Miscellaneous miscellaneous() {
      return new Miscellaneous(this.elm.get("miscellaneous"));
   }
}
