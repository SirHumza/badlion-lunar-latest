package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class CosmeticsProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_OverrideCosmeticResourcesMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_OverrideCosmeticResourcesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_OverrideCosmeticResourcesMessage_descriptor,
      new String[]{"PlayerUuid", "CharacterType", "ModelPath", "AnimationPath", "TexturePath"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_UpdateCosmeticsMessage_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_UpdateCosmeticsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_UpdateCosmeticsMessage_descriptor, new String[]{"ModelLocations", "AnimationLocations"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterSuitResourcesMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterSuitResourcesMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterSuitResourcesMessage_descriptor, new String[]{"CharacterType", "SuitNames"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CosmeticsProto() {
   }

   public static void registerAllExtensions(ExtensionRegistryLite var0) {
   }

   public static void registerAllExtensions(ExtensionRegistry var0) {
      registerAllExtensions((ExtensionRegistryLite)var0);
   }

   public static Descriptors.FileDescriptor getDescriptor() {
      return descriptor;
   }

   static {
      String[] var0 = new String[]{
         "\n*lunarclient/apollo/evnt/v1/cosmetics.proto\u0012\u001alunarclient.apollo.evnt.v1\u001a'lunarclient/apollo/common/v1/uuid.proto\u001a*lunarclient/apollo/evnt/v1/character.proto\"¢\u0002\n OverrideCosmeticResourcesMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012P\n\u000echaracter_type\u0018\u0002 \u0001(\u000e2).lunarclient.apollo.evnt.v1.CharacterTypeR\rcharacterType\u0012\u001d\n\nmodel_path\u0018\u0003 \u0001(\tR\tmodelPath\u0012%\n\u000eanimation_path\u0018\u0004 \u0001(\tR\ranimationPath\u0012!\n\ftexture_path\u0018\u0005 \u0001(\tR\u000btexturePath\"r\n\u0016UpdateCosmeticsMessage\u0012'\n\u000fmodel_locations\u0018\u0001 \u0003(\tR\u000emodelLocations\u0012/\n\u0013animation_locations\u0018\u0002 \u0003(\tR\u0012animationLocations\"\u0098\u0001\n%OverrideCharacterSuitResourcesMessage\u0012P\n\u000echaracter_type\u0018\u0001 \u0001(\u000e2).lunarclient.apollo.evnt.v1.CharacterTypeR\rcharacterType\u0012\u001d\n\nsuit_names\u0018\u0002 \u0003(\tR\tsuitNamesB»\u0001\n\u001ecom.lunarclient.apollo.evnt.v1B\u000eCosmeticsProtoP\u0001¢\u0002\u0003LAEª\u0002\u001aLunarclient.Apollo.Evnt.V1Ê\u0002\u001aLunarclient\\Apollo\\Evnt\\V1â\u0002&Lunarclient\\Apollo\\Evnt\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Evnt::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor(), CharacterProto.getDescriptor()}
      );
      UuidProto.getDescriptor();
      CharacterProto.getDescriptor();
   }
}
