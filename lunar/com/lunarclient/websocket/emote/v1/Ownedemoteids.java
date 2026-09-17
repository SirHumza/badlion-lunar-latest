package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_LoginResponse_descriptor,
      new String[]{"OwnedEmoteIds", "EquippedEmoteIds", "LunarPlusFreeEmoteId", "OwnedEmotes", "HasAllEmotesFlag", "EquippedEmotes", "LunarPlusFreeEmoteIds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_UseEmoteRequest_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_UseEmoteRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_UseEmoteRequest_descriptor, new String[]{"EmoteId", "EmoteMetadata", "EmoteSoundtrackUrl", "EmoteJamId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_UseEmoteResponse_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_UseEmoteResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_UseEmoteResponse_descriptor, new String[]{"Status", "EmoteId", "EmoteMetadata"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_StopEmoteRequest_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_StopEmoteRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_StopEmoteRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_StopEmoteResponse_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_StopEmoteResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_StopEmoteResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesRequest_descriptor, new String[]{"EquippedEmoteIds", "EquippedEmotes"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_emote_v1_UpdateEquippedEmotesResponse_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServiceProto() {
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
         "\n,lunarclient/websocket/emote/v1/service.proto\u0012\u001elunarclient.websocket.emote.v1\u001a+lunarclient/websocket/emote/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"\u000e\n\fLoginRequest\"¹\u0003\n\rLoginResponse\u0012*\n\u000fowned_emote_ids\u0018\u0001 \u0003(\u0005B\u0002\u0018\u0001R\rownedEmoteIds\u00120\n\u0012equipped_emote_ids\u0018\u0002 \u0003(\u0005B\u0002\u0018\u0001R\u0010equippedEmoteIds\u0012:\n\u0018lunar_plus_free_emote_id\u0018\u0003 \u0001(\u0005B\u0002\u0018\u0001R\u0014lunarPlusFreeEmoteId\u0012M\n\fowned_emotes\u0018\u0007 \u0003(\u000b2*.lunarclient.websocket.emote.v1.OwnedEmoteR\u000bownedEmotes\u0012-\n\u0013has_all_emotes_flag\u0018\u0005 \u0001(\bR\u0010hasAllEmotesFlag\u0012V\n\u000fequipped_emotes\u0018\b \u0003(\u000b2-.lunarclient.websocket.emote.v1.EquippedEmoteR\u000eequippedEmotes\u00128\n\u0019lunar_plus_free_emote_ids\u0018\t \u0003(\u0005R\u0015lunarPlusFreeEmoteIds\"§\u0001\n\u000fUseEmoteRequest\u0012\u0019\n\bemote_id\u0018\u0001 \u0001(\u0005R\u0007emoteId\u0012%\n\u000eemote_metadata\u0018\u0002 \u0001(\u0005R\remoteMetadata\u00120\n\u0014emote_soundtrack_url\u0018\u0003 \u0001(\tR\u0012emoteSoundtrackUrl\u0012 \n\femote_jam_id\u0018\u0004 \u0001(\u0005R\nemoteJamId\"«\u0002\n\u0010UseEmoteResponse\u0012O\n\u0006status\u0018\u0001 \u0001(\u000e27.lunarclient.websocket.emote.v1.UseEmoteResponse.StatusR\u0006status\u0012\u0019\n\bemote_id\u0018\u0002 \u0001(\u0005R\u0007emoteId\u0012%\n\u000eemote_metadata\u0018\u0003 \u0001(\u0005R\remoteMetadata\"\u0083\u0001\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001a\n\u0016STATUS_EMOTE_NOT_OWNED\u0010\u0002\u0012\u001d\n\u0019STATUS_ILLEGAL_SOUNDTRACK\u0010\u0003\u0012\u0017\n\u0013STATUS_RATE_LIMITED\u0010\u0004\"\u0012\n\u0010StopEmoteRequest\"\u0013\n\u0011StopEmoteResponse\"§\u0001\n\u001bUpdateEquippedEmotesRequest\u00120\n\u0012equipped_emote_ids\u0018\u0001 \u0003(\u0005B\u0002\u0018\u0001R\u0010equippedEmoteIds\u0012V\n\u000fequipped_emotes\u0018\u0002 \u0003(\u000b2-.lunarclient.websocket.emote.v1.EquippedEmoteR\u000eequippedEmotes\"\u001e\n\u001cUpdateEquippedEmotesResponse2\u0081\u0004\n\fEmoteService\u0012j\n\u0005Login\u0012,.lunarclient.websocket.emote.v1.LoginRequest\u001a-.lunarclient.websocket.emote.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012s\n\bUseEmote\u0012/.lunarclient.websocket.emote.v1.UseEmoteRequest\u001a0.lunarclient.websocket.emote.v1.UseEmoteResponse\"\u0004\u0088µ\u0018\u0001\u0012v\n\tStopEmote\u00120.lunarclient.websocket.emote.v1.StopEmoteRequest\u001a1.lunarclient.websocket.emote.v1.StopEmoteResponse\"\u0004\u0088µ\u0018\u0001\u0012\u0097\u0001\n\u0014UpdateEquippedEmotes\u0012;.lunarclient.websocket.emote.v1.UpdateEquippedEmotesRequest\u001a<.lunarclient.websocket.emote.v1.UpdateEquippedEmotesResponse\"\u0004\u0088µ\u0018\u0001BÐ\u0001\n\"com.lunarclient.websocket.emote.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWEª\u0002\u001eLunarclient.Websocket.Emote.V1Ê\u0002\u001eLunarclient\\Websocket\\Emote\\V1â\u0002*Lunarclient\\Websocket\\Emote\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Emote::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor(), com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor()}
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
   }
}
