package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.GiftProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_RecommendedJam_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_RecommendedJam_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_RecommendedJam_descriptor, new String[]{"JamId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_OwnedEmote_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_OwnedEmote_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_OwnedEmote_descriptor, new String[]{"EmoteId", "GrantedAt", "ExpiresAt", "RecommendedJams", "GiftInfo"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_EquippedEmote_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_EquippedEmote_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_EquippedEmote_descriptor, new String[]{"EmoteId", "SlotNumber", "AttachedJamId"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
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
         "\n+lunarclient/websocket/emote/v1/common.proto\u0012\u001elunarclient.websocket.emote.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a lunarclient/common/v1/gift.proto\"'\n\u000eRecommendedJam\u0012\u0015\n\u0006jam_id\u0018\u0001 \u0001(\u0005R\u0005jamId\"¶\u0002\n\nOwnedEmote\u0012\u0019\n\bemote_id\u0018\u0001 \u0001(\u0005R\u0007emoteId\u00129\n\ngranted_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\tgrantedAt\u00129\n\nexpires_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\texpiresAt\u0012Y\n\u0010recommended_jams\u0018\u0004 \u0003(\u000b2..lunarclient.websocket.emote.v1.RecommendedJamR\u000frecommendedJams\u0012<\n\tgift_info\u0018\u0005 \u0001(\u000b2\u001f.lunarclient.common.v1.GiftInfoR\bgiftInfo\"s\n\rEquippedEmote\u0012\u0019\n\bemote_id\u0018\u0001 \u0001(\u0005R\u0007emoteId\u0012\u001f\n\u000bslot_number\u0018\u0002 \u0001(\u0005R\nslotNumber\u0012&\n\u000fattached_jam_id\u0018\u0003 \u0001(\u0005R\rattachedJamIdBÌ\u0001\n\"com.lunarclient.websocket.emote.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWEª\u0002\u001eLunarclient.Websocket.Emote.V1Ê\u0002\u001eLunarclient\\Websocket\\Emote\\V1â\u0002*Lunarclient\\Websocket\\Emote\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Emote::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), GiftProto.getDescriptor()}
      );
      TimestampProto.getDescriptor();
      GiftProto.getDescriptor();
   }
}
