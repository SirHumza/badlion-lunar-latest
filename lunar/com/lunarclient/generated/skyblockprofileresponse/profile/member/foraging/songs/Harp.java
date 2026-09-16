package com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.songs;

import com.lunarclient.BetterJson;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Harp() {
   @NotNull
   private final BetterJson elm;

   public Harp(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> claimedTalisman() {
      return this.elm.get("claimed_talisman").asBool();
   }

   public Optional<String> selectedSong() {
      return this.elm.get("selected_song").asString();
   }

   public Optional<Double> selectedSongEpoch() {
      return this.elm.get("selected_song_epoch").asDouble();
   }

   public Optional<Double> songAmazingGraceBestCompletion() {
      return this.elm.get("song_amazing_grace_best_completion").asDouble();
   }

   public Optional<Double> songAmazingGraceCompletions() {
      return this.elm.get("song_amazing_grace_completions").asDouble();
   }

   public Optional<Double> songAmazingGracePerfectCompletions() {
      return this.elm.get("song_amazing_grace_perfect_completions").asDouble();
   }

   public Optional<Double> songBrahmsBestCompletion() {
      return this.elm.get("song_brahms_best_completion").asDouble();
   }

   public Optional<Double> songBrahmsCompletions() {
      return this.elm.get("song_brahms_completions").asDouble();
   }

   public Optional<Double> songBrahmsPerfectCompletions() {
      return this.elm.get("song_brahms_perfect_completions").asDouble();
   }

   public Optional<Double> songFireAndFlamesBestCompletion() {
      return this.elm.get("song_fire_and_flames_best_completion").asDouble();
   }

   public Optional<Double> songFireAndFlamesCompletions() {
      return this.elm.get("song_fire_and_flames_completions").asDouble();
   }

   public Optional<Double> songFireAndFlamesPerfectCompletions() {
      return this.elm.get("song_fire_and_flames_perfect_completions").asDouble();
   }

   public Optional<Double> songFrereJacquesBestCompletion() {
      return this.elm.get("song_frere_jacques_best_completion").asDouble();
   }

   public Optional<Double> songFrereJacquesCompletions() {
      return this.elm.get("song_frere_jacques_completions").asDouble();
   }

   public Optional<Double> songFrereJacquesPerfectCompletions() {
      return this.elm.get("song_frere_jacques_perfect_completions").asDouble();
   }

   public Optional<Double> songGreensleevesBestCompletion() {
      return this.elm.get("song_greensleeves_best_completion").asDouble();
   }

   public Optional<Double> songGreensleevesCompletions() {
      return this.elm.get("song_greensleeves_completions").asDouble();
   }

   public Optional<Double> songGreensleevesPerfectCompletions() {
      return this.elm.get("song_greensleeves_perfect_completions").asDouble();
   }

   public Optional<Double> songHappyBirthdayBestCompletion() {
      return this.elm.get("song_happy_birthday_best_completion").asDouble();
   }

   public Optional<Double> songHappyBirthdayCompletions() {
      return this.elm.get("song_happy_birthday_completions").asDouble();
   }

   public Optional<Double> songHappyBirthdayPerfectCompletions() {
      return this.elm.get("song_happy_birthday_perfect_completions").asDouble();
   }

   public Optional<Double> songHymnJoyBestCompletion() {
      return this.elm.get("song_hymn_joy_best_completion").asDouble();
   }

   public Optional<Double> songHymnJoyCompletions() {
      return this.elm.get("song_hymn_joy_completions").asDouble();
   }

   public Optional<Double> songHymnJoyPerfectCompletions() {
      return this.elm.get("song_hymn_joy_perfect_completions").asDouble();
   }

   public Optional<Double> songJeopardyBestCompletion() {
      return this.elm.get("song_jeopardy_best_completion").asDouble();
   }

   public Optional<Double> songJeopardyCompletions() {
      return this.elm.get("song_jeopardy_completions").asDouble();
   }

   public Optional<Double> songJeopardyPerfectCompletions() {
      return this.elm.get("song_jeopardy_perfect_completions").asDouble();
   }

   public Optional<Double> songJoyWorldBestCompletion() {
      return this.elm.get("song_joy_world_best_completion").asDouble();
   }

   public Optional<Double> songJoyWorldCompletions() {
      return this.elm.get("song_joy_world_completions").asDouble();
   }

   public Optional<Double> songJoyWorldPerfectCompletions() {
      return this.elm.get("song_joy_world_perfect_completions").asDouble();
   }

   public Optional<Double> songMinuetBestCompletion() {
      return this.elm.get("song_minuet_best_completion").asDouble();
   }

   public Optional<Double> songMinuetCompletions() {
      return this.elm.get("song_minuet_completions").asDouble();
   }

   public Optional<Double> songMinuetPerfectCompletions() {
      return this.elm.get("song_minuet_perfect_completions").asDouble();
   }

   public Optional<Double> songPachelbelBestCompletion() {
      return this.elm.get("song_pachelbel_best_completion").asDouble();
   }

   public Optional<Double> songPachelbelCompletions() {
      return this.elm.get("song_pachelbel_completions").asDouble();
   }

   public Optional<Double> songPachelbelPerfectCompletions() {
      return this.elm.get("song_pachelbel_perfect_completions").asDouble();
   }

   public Optional<Double> songPureImaginationBestCompletion() {
      return this.elm.get("song_pure_imagination_best_completion").asDouble();
   }

   public Optional<Double> songPureImaginationCompletions() {
      return this.elm.get("song_pure_imagination_completions").asDouble();
   }

   public Optional<Double> songPureImaginationPerfectCompletions() {
      return this.elm.get("song_pure_imagination_perfect_completions").asDouble();
   }

   public Optional<Double> songVieEnRoseBestCompletion() {
      return this.elm.get("song_vie_en_rose_best_completion").asDouble();
   }

   public Optional<Double> songVieEnRoseCompletions() {
      return this.elm.get("song_vie_en_rose_completions").asDouble();
   }

   public Optional<Double> songVieEnRosePerfectCompletions() {
      return this.elm.get("song_vie_en_rose_perfect_completions").asDouble();
   }
}
