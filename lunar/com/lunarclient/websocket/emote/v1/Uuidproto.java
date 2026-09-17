package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_UseEmotePush_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_UseEmotePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_UseEmotePush_descriptor,
      new String[]{"PlayerUuid", "EmoteId", "EmoteMetadata", "EmoteSoundtrackUrl", "EmoteJamId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_StopEmotePush_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_StopEmotePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_StopEmotePush_descriptor, new String[]{"PlayerUuid"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_RefreshEmotesPush_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_RefreshEmotesPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_RefreshEmotesPush_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private PushProto() {
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
         "\n)lunarclient/websocket/emote/v1/push.proto\u0012\u001elunarclient.websocket.emote.v1\u001a lunarclient/common/v1/uuid.proto\"â\u0001\n\fUseEmotePush\u0012<\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nplayerUuid\u0012\u0019\n\bemote_id\u0018\u0002 \u0001(\u0005R\u0007emoteId\u0012%\n\u000eemote_metadata\u0018\u0003 \u0001(\u0005R\remoteMetadata\u00120\n\u0014emote_soundtrack_url\u0018\u0004 \u0001(\tR\u0012emoteSoundtrackUrl\u0012 \n\femote_jam_id\u0018\u0005 \u0001(\u0005R\nemoteJamId\"M\n\rStopEmotePush\u0012<\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nplayerUuid\"\u0013\n\u0011RefreshEmotesPushBÊ\u0001\n\"com.lunarclient.websocket.emote.v1B\tPushProtoP\u0001¢\u0002\u0003LWEª\u0002\u001eLunarclient.Websocket.Emote.V1Ê\u0002\u001eLunarclient\\Websocket\\Emote\\V1â\u0002*Lunarclient\\Websocket\\Emote\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Emote::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
