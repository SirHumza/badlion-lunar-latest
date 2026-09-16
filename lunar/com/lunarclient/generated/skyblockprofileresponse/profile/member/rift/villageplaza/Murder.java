package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.villageplaza.murder.MurderSnapshot;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Murder() {
   @NotNull
   private final BetterJson elm;

   public Murder(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public MurderSnapshot murderSnapshot() {
      return new MurderSnapshot(this.elm.get("murder_snapshot"));
   }

   public List<String> roomClues() {
      return this.elm.get("room_clues").asListOpt(BetterJson::asString);
   }

   public Optional<Double> stepIndex() {
      return this.elm.get("step_index").asDouble();
   }

   public Optional<Double> stepIndexPt2() {
      return this.elm.get("step_index_pt2").asDouble();
   }

   public Optional<Double> stepIndexPt3() {
      return this.elm.get("step_index_pt3").asDouble();
   }
}
