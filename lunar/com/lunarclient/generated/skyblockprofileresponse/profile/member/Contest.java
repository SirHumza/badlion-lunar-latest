package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeMap;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest.Contest;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest.MedalsInv;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest.Perks;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest.PersonalBests;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.jacobscontest.UniqueBrackets;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;

public record JacobsContest() {
   @NotNull
   private final BetterJson elm;

   public JacobsContest(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public SafeMap<Contest> contests() {
      return this.elm.get("contests").asMap(Contest::new);
   }

   public MedalsInv medalsInv() {
      return new MedalsInv(this.elm.get("medals_inv"));
   }

   public Optional<Boolean> migration() {
      return this.elm.get("migration").asBool();
   }

   public Perks perks() {
      return new Perks(this.elm.get("perks"));
   }

   public PersonalBests personalBests() {
      return new PersonalBests(this.elm.get("personal_bests"));
   }

   public Optional<Boolean> talked() {
      return this.elm.get("talked").asBool();
   }

   public UniqueBrackets uniqueBrackets() {
      return new UniqueBrackets(this.elm.get("unique_brackets"));
   }
}
