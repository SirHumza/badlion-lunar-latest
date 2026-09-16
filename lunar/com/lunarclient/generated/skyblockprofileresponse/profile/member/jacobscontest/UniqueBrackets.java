package com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest;

import com.lunarclient.BetterJson;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record UniqueBrackets() {
   @NotNull
   private final BetterJson elm;

   public UniqueBrackets(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> bronze() {
      return this.elm.get("bronze").asListOpt(BetterJson::asString);
   }

   public List<String> diamond() {
      return this.elm.get("diamond").asListOpt(BetterJson::asString);
   }

   public List<String> gold() {
      return this.elm.get("gold").asListOpt(BetterJson::asString);
   }

   public List<String> platinum() {
      return this.elm.get("platinum").asListOpt(BetterJson::asString);
   }

   public List<String> silver() {
      return this.elm.get("silver").asListOpt(BetterJson::asString);
   }
}
