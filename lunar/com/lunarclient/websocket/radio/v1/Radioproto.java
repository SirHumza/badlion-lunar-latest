package com.lunarclient.websocket.radio.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.RadioProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_LoginResponse_descriptor, new String[]{"IsPremium", "RadioPlayingVisibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityRequest_descriptor, new String[]{"Visibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_SetRadioPlayingVisibilityResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeRequest_descriptor, new String[]{"NewRadioInfo", "Initiator", "InitiatorSource"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_radio_v1_BroadcastRadioInfoChangeResponse_descriptor, new String[]{"NewRadioInfo"}
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
         "\n,lunarclient/websocket/radio/v1/service.proto\u0012\u001elunarclient.websocket.radio.v1\u001a!lunarclient/common/v1/radio.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a+lunarclient/websocket/radio/v1/common.proto\"\u000e\n\fLoginRequest\" \u0001\n\rLoginResponse\u0012\u001d\n\nis_premium\u0018\u0001 \u0001(\bR\tisPremium\u0012p\n\u0018radio_playing_visibility\u0018\u0002 \u0001(\u000e26.lunarclient.websocket.radio.v1.RadioPlayingVisibilityR\u0016radioPlayingVisibility\"z\n SetRadioPlayingVisibilityRequest\u0012V\n\nvisibility\u0018\u0001 \u0001(\u000e26.lunarclient.websocket.radio.v1.RadioPlayingVisibilityR\nvisibility\"#\n!SetRadioPlayingVisibilityResponse\"ò\b\n\u001fBroadcastRadioInfoChangeRequest\u0012V\n\u000enew_radio_info\u0018\u0001 \u0001(\u000b20.lunarclient.websocket.radio.v1.InboundRadioInfoR\fnewRadioInfo\u0012q\n\tinitiator\u0018\u0002 \u0001(\u000e2S.lunarclient.websocket.radio.v1.BroadcastRadioInfoChangeRequest.InfoChangeInitiatorR\tinitiator\u0012\u0084\u0001\n\u0010initiator_source\u0018\u0003 \u0001(\u000e2Y.lunarclient.websocket.radio.v1.BroadcastRadioInfoChangeRequest.InfoChangeInitiatorSourceR\u000finitiatorSource\"Þ\u0004\n\u0013InfoChangeInitiator\u0012%\n!INFO_CHANGE_INITIATOR_UNSPECIFIED\u0010\u0000\u0012\u001e\n\u001aINFO_CHANGE_INITIATOR_STOP\u0010\u0001\u0012\u001e\n\u001aINFO_CHANGE_INITIATOR_SKIP\u0010\u0002\u0012$\n INFO_CHANGE_INITIATOR_NEXT_TRACK\u0010\u0003\u0012'\n#INFO_CHANGE_INITIATOR_START_STATION\u0010\u0004\u0012*\n&INFO_CHANGE_INITIATOR_STATION_COMPLETE\u0010\u0005\u0012*\n&INFO_CHANGE_INITIATOR_TRACK_PLAY_PAUSE\u0010\u0006\u0012+\n'INFO_CHANGE_INITIATOR_TRACK_LIKE_TOGGLE\u0010\u0007\u0012-\n)INFO_CHANGE_INITIATOR_STATION_LIKE_TOGGLE\u0010\b\u0012&\n\"INFO_CHANGE_INITIATOR_STATION_LOOP\u0010\t\u0012,\n(INFO_CHANGE_INITIATOR_STATION_AUTO_START\u0010\n\u00123\n/INFO_CHANGE_INITIATOR_STATION_AUTO_START_RANDOM\u0010\u000b\u0012.\n*INFO_CHANGE_INITIATOR_START_STATION_RANDOM\u0010\f\u0012\"\n\u001eINFO_CHANGE_INITIATOR_INACTIVE\u0010\r\"\u009b\u0001\n\u0019InfoChangeInitiatorSource\u0012,\n(INFO_CHANGE_INITIATOR_SOURCE_UNSPECIFIED\u0010\u0000\u0012%\n!INFO_CHANGE_INITIATOR_SOURCE_GAME\u0010\u0001\u0012)\n%INFO_CHANGE_INITIATOR_SOURCE_LAUNCHER\u0010\u0002\"j\n BroadcastRadioInfoChangeResponse\u0012F\n\u000enew_radio_info\u0018\u0001 \u0001(\u000b2 .lunarclient.common.v1.RadioInfoR\fnewRadioInfo2É\u0003\n\fRadioService\u0012j\n\u0005Login\u0012,.lunarclient.websocket.radio.v1.LoginRequest\u001a-.lunarclient.websocket.radio.v1.LoginResponse\"\u0004\u0088µ\u0018\u0002\u0012£\u0001\n\u0018BroadcastRadioInfoChange\u0012?.lunarclient.websocket.radio.v1.BroadcastRadioInfoChangeRequest\u001a@.lunarclient.websocket.radio.v1.BroadcastRadioInfoChangeResponse\"\u0004\u0088µ\u0018\u0002\u0012¦\u0001\n\u0019SetRadioPlayingVisibility\u0012@.lunarclient.websocket.radio.v1.SetRadioPlayingVisibilityRequest\u001aA.lunarclient.websocket.radio.v1.SetRadioPlayingVisibilityResponse\"\u0004\u0088µ\u0018\u0003BÐ\u0001\n\"com.lunarclient.websocket.radio.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWRª\u0002\u001eLunarclient.Websocket.Radio.V1Ê\u0002\u001eLunarclient\\Websocket\\Radio\\V1â\u0002*Lunarclient\\Websocket\\Radio\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Radio::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            RadioProto.getDescriptor(), com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(), CommonProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      RadioProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
