package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_PlayerRadioPush_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_PlayerRadioPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_PlayerRadioPush_descriptor, new String[]{"PlayerUuid", "RadioPlaying"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_RefreshRadioPush_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_RefreshRadioPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_RefreshRadioPush_descriptor, new String[0]
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
         "\n)lunarclient/websocket/radio/v1/push.proto\u0012\u001elunarclient.websocket.radio.v1\u001a lunarclient/common/v1/uuid.proto\"t\n\u000fPlayerRadioPush\u0012<\n\u000bplayer_uuid\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\nplayerUuid\u0012#\n\rradio_playing\u0018\u0002 \u0001(\bR\fradioPlaying\"\u0012\n\u0010RefreshRadioPushBÊ\u0001\n\"com.lunarclient.websocket.radio.v1B\tPushProtoP\u0001¢\u0002\u0003LWRª\u0002\u001eLunarclient.Websocket.Radio.V1Ê\u0002\u001eLunarclient\\Websocket\\Radio\\V1â\u0002*Lunarclient\\Websocket\\Radio\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Radio::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
