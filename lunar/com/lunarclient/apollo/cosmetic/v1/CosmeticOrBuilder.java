package com.lunarclient.apollo.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;

public interface CosmeticOrBuilder extends MessageOrBuilder {
   int getId();

   boolean hasHatOptions();

   HatOptions getHatOptions();

   HatOptionsOrBuilder getHatOptionsOrBuilder();

   boolean hasCloakOptions();

   CloakOptions getCloakOptions();

   CloakOptionsOrBuilder getCloakOptionsOrBuilder();

   boolean hasPetOptions();

   PetOptions getPetOptions();

   PetOptionsOrBuilder getPetOptionsOrBuilder();

   boolean hasBodyOptions();

   BodyOptions getBodyOptions();

   BodyOptionsOrBuilder getBodyOptionsOrBuilder();

   Cosmetic.OptionsCase getOptionsCase();
}
