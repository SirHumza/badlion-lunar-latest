package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.Hina;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.HuntingToolkit;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.Songs;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.Starlyn;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.foraging.TreeGifts;
import java.util.List;
import org.jetbrains.annotations.NotNull;

public record Foraging() {
   @NotNull
   private final BetterJson elm;

   public Foraging(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public List<String> fishFamily() {
      return this.elm.get("fish_family").asListOpt(BetterJson::asString);
   }

   public Hina hina() {
      return new Hina(this.elm.get("hina"));
   }

   public HuntingToolkit huntingToolkit() {
      return new HuntingToolkit(this.elm.get("hunting_toolkit"));
   }

   public Songs songs() {
      return new Songs(this.elm.get("songs"));
   }

   public Starlyn starlyn() {
      return new Starlyn(this.elm.get("starlyn"));
   }

   public TreeGifts treeGifts() {
      return new TreeGifts(this.elm.get("tree_gifts"));
   }
}
