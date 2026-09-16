package com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeontypes.catacombs;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.dungeons.dungeontypes.catacombs.bestruns.RunInfo;
import org.jetbrains.annotations.NotNull;

public record BestRuns() {
   @NotNull
   private final BetterJson elm;

   public BestRuns(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public SafeList<RunInfo> _0() {
      return this.elm.get("0").asList(RunInfo::new);
   }

   public SafeList<RunInfo> _1() {
      return this.elm.get("1").asList(RunInfo::new);
   }

   public SafeList<RunInfo> _2() {
      return this.elm.get("2").asList(RunInfo::new);
   }

   public SafeList<RunInfo> _3() {
      return this.elm.get("3").asList(RunInfo::new);
   }

   public SafeList<RunInfo> _4() {
      return this.elm.get("4").asList(RunInfo::new);
   }

   public SafeList<RunInfo> _5() {
      return this.elm.get("5").asList(RunInfo::new);
   }

   public SafeList<RunInfo> _6() {
      return this.elm.get("6").asList(RunInfo::new);
   }

   public SafeList<RunInfo> _7() {
      return this.elm.get("7").asList(RunInfo::new);
   }
}
