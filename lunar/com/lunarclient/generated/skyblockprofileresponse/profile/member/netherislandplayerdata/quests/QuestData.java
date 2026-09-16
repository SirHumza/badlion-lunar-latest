package com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.netherislandplayerdata.quests.questdata.QuestInfo;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record QuestData() {
   @NotNull
   private final BetterJson elm;

   public QuestData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public QuestInfo boss() {
      return new QuestInfo(this.elm.get("boss"));
   }

   public QuestInfo dojo() {
      return new QuestInfo(this.elm.get("dojo"));
   }

   public QuestInfo fetch() {
      return new QuestInfo(this.elm.get("fetch"));
   }

   public QuestInfo fishing() {
      return new QuestInfo(this.elm.get("fishing"));
   }

   public List<String> questList() {
      return this.elm.get("quest_list").asListOpt(BetterJson::asString);
   }

   public QuestInfo rescue() {
      return new QuestInfo(this.elm.get("rescue"));
   }

   public QuestInfo wantedMiniBoss() {
      return new QuestInfo(this.elm.get("wanted_mini_boss"));
   }
}
