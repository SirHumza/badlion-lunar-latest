package com.lunarclient.generated.skyblockprofileresponse.profile.member;

import com.lunarclient.BetterJson;
import com.lunarclient.SafeList;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.Autopet;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.Pet;
import com.lunarclient.generated.skyblockprofileresponse.profile.member.petsdata.PetCare;
import org.jetbrains.annotations.NotNull;

public record PetsData() {
   @NotNull
   private final BetterJson elm;

   public PetsData(@NotNull BetterJson var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("elm cannot be null");
      }

      this.elm = var1;
   }

   public Autopet autopet() {
      return new Autopet(this.elm.get("autopet"));
   }

   public PetCare petCare() {
      return new PetCare(this.elm.get("pet_care"));
   }

   public SafeList<Pet> pets() {
      return this.elm.get("pets").asList(Pet::new);
   }
}
