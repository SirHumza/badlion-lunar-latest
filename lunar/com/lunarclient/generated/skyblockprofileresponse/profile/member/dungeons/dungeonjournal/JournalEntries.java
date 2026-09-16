package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeonjournal;

import com.google.gson.JsonElement;
import com.lunarclient.BetterJson;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record JournalEntries() {
   @NotNull
   private final BetterJson elm;

   public JournalEntries(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<Double> aftermath() {
      return this.elm.get("aftermath").asListOpt(BetterJson::asDouble);
   }

   public List<Double> expeditionVolume1() {
      return this.elm.get("expedition_volume_1").asListOpt(BetterJson::asDouble);
   }

   public List<Double> expeditionVolume2() {
      return this.elm.get("expedition_volume_2").asListOpt(BetterJson::asDouble);
   }

   public List<Double> expeditionVolume3() {
      return this.elm.get("expedition_volume_3").asListOpt(BetterJson::asDouble);
   }

   public List<Double> expeditionVolume4() {
      return this.elm.get("expedition_volume_4").asListOpt(BetterJson::asDouble);
   }

   public List<Double> grimAdversity() {
      return this.elm.get("grim_adversity").asListOpt(BetterJson::asDouble);
   }

   public List<Double> karyllesDiary() {
      return this.elm.get("karylles_diary").asListOpt(BetterJson::asDouble);
   }

   public List<Double> murderer() {
      return this.elm.get("murderer").asListOpt(BetterJson::asDouble);
   }

   public List<JsonElement> necronsMagicScroll() {
      return this.elm.get("necrons_magic_scroll").asListOpt(BetterJson::asJsonElement);
   }

   public List<Double> theApprentice() {
      return this.elm.get("the_apprentice").asListOpt(BetterJson::asDouble);
   }

   public List<Double> theApprentice2() {
      return this.elm.get("the_apprentice_2").asListOpt(BetterJson::asDouble);
   }

   public List<Double> theApprentice3() {
      return this.elm.get("the_apprentice_3").asListOpt(BetterJson::asDouble);
   }

   public List<Double> theEye() {
      return this.elm.get("the_eye").asListOpt(BetterJson::asDouble);
   }

   public List<Double> theFollower() {
      return this.elm.get("the_follower").asListOpt(BetterJson::asDouble);
   }

   public List<Double> theFollower2() {
      return this.elm.get("the_follower_2").asListOpt(BetterJson::asDouble);
   }

   public List<Double> theStudy() {
      return this.elm.get("the_study").asListOpt(BetterJson::asDouble);
   }

   public List<Double> theWalls() {
      return this.elm.get("the_walls").asListOpt(BetterJson::asDouble);
   }

   public List<Double> uncannyRemains() {
      return this.elm.get("uncanny_remains").asListOpt(BetterJson::asDouble);
   }
}
