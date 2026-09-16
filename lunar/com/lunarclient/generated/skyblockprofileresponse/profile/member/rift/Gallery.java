package com.lunarclient.generated.skyblockprofileresponse.profile.member.rift;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.rift.gallery.SecuredTrophie;
import java.util.List;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record Gallery() {
   @NotNull
   private final BetterJson elm;

   public Gallery(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Optional<Double> eliseStep() {
      return this.elm.get("elise_step").asDouble();
   }

   public SafeList<SecuredTrophie> securedTrophies() {
      return this.elm.get("secured_trophies").asList(SecuredTrophie::new);
   }

   public List<String> sentTrophyDialogues() {
      return this.elm.get("sent_trophy_dialogues").asListOpt(BetterJson::asString);
   }
}
