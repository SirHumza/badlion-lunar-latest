package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.ColorProto;
import com.lunarclient.apollo.common.v1.UuidProto;

public final class CharacterProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_CharacterAbilityMessage_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_CharacterAbilityMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_CharacterAbilityMessage_descriptor, new String[]{"CharacterType", "AbilitiesAdventure"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterCosmeticMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterCosmeticMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterCosmeticMessage_descriptor, new String[]{"PlayerUuid", "CharacterType", "SuitName"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterAbilityMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterAbilityMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterAbilityMessage_descriptor, new String[]{"Abilities"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_OverrideCharacterMessage_descriptor,
      new String[]{"CharacterType", "PlayerUuid", "Color", "Equipped", "SuitName"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CharacterProto() {
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
         "\n*lunarclient/apollo/evnt/v1/character.proto\u0012\u001alunarclient.apollo.evnt.v1\u001a(lunarclient/apollo/common/v1/color.proto\u001a'lunarclient/apollo/common/v1/uuid.proto\"\u009c\u0001\n\u0017CharacterAbilityMessage\u0012P\n\u000echaracter_type\u0018\u0001 \u0001(\u000e2).lunarclient.apollo.evnt.v1.CharacterTypeR\rcharacterType\u0012/\n\u0013abilities_adventure\u0018\u0002 \u0003(\tR\u0012abilitiesAdventure\"Ö\u0001\n OverrideCharacterCosmeticMessage\u0012C\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u0012P\n\u000echaracter_type\u0018\u0002 \u0001(\u000e2).lunarclient.apollo.evnt.v1.CharacterTypeR\rcharacterType\u0012\u001b\n\tsuit_name\u0018\u0003 \u0001(\tR\bsuitName\"t\n\u001fOverrideCharacterAbilityMessage\u0012Q\n\tabilities\u0018\u0001 \u0003(\u000b23.lunarclient.apollo.evnt.v1.CharacterAbilityMessageR\tabilities\"¥\u0002\n\u0018OverrideCharacterMessage\u0012P\n\u000echaracter_type\u0018\u0001 \u0001(\u000e2).lunarclient.apollo.evnt.v1.CharacterTypeR\rcharacterType\u0012C\n\u000bplayer_uuid\u0018\u0002 \u0001(\u000b2\".lunarclient.apollo.common.v1.UuidR\nplayerUuid\u00129\n\u0005color\u0018\u0003 \u0001(\u000b2#.lunarclient.apollo.common.v1.ColorR\u0005color\u0012\u001a\n\bequipped\u0018\u0004 \u0001(\bR\bequipped\u0012\u001b\n\tsuit_name\u0018\u0005 \u0001(\tR\bsuitName*Ý\u0002\n\rCharacterType\u0012\u001e\n\u001aCHARACTER_TYPE_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014CHARACTER_TYPE_ANGEL\u0010\u0001\u0012\u0017\n\u0013CHARACTER_TYPE_AXEL\u0010\u0002\u0012\u0019\n\u0015CHARACTER_TYPE_BANJAX\u0010\u0003\u0012\u0019\n\u0015CHARACTER_TYPE_DAEDRA\u0010\u0004\u0012\u0019\n\u0015CHARACTER_TYPE_FROSKA\u0010\u0005\u0012\u0019\n\u0015CHARACTER_TYPE_GRANNY\u0010\u0006\u0012\u001d\n\u0019CHARACTER_TYPE_GREAT_MAGE\u0010\u0007\u0012\u0018\n\u0014CHARACTER_TYPE_IGNUS\u0010\b\u0012\u001a\n\u0016CHARACTER_TYPE_TULABOT\u0010\t\u0012\u001c\n\u0018CHARACTER_TYPE_SIR_BLOCK\u0010\n\u0012\u001a\n\u0016CHARACTER_TYPE_HARMONY\u0010\u000bB»\u0001\n\u001ecom.lunarclient.apollo.evnt.v1B\u000eCharacterProtoP\u0001¢\u0002\u0003LAEª\u0002\u001aLunarclient.Apollo.Evnt.V1Ê\u0002\u001aLunarclient\\Apollo\\Evnt\\V1â\u0002&Lunarclient\\Apollo\\Evnt\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Evnt::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ColorProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      ColorProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
