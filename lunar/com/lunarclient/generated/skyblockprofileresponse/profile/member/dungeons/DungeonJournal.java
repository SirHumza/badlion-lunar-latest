package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeonjournal.JournalEntries;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record DungeonJournal() {
   @NotNull
   private final BetterJson elm;

   public DungeonJournal(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Boolean> hasReadTheEye() {
      return this.elm.get("has_read_the_eye").asBool();
   }

   public Optional<Boolean> hasReadTheWatcher() {
      return this.elm.get("has_read_the_watcher").asBool();
   }

   public JournalEntries journalEntries() {
      return new JournalEntries(this.elm.get("journal_entries"));
   }

   public List<String> unlockedJournals() {
      return this.elm.get("unlocked_journals").asListOpt(BetterJson::asString);
   }
}
