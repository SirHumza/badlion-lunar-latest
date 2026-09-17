package com.lunarclient.websocket.apollo.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.websocket.protocol.v1.CommonProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionRequest_descriptor, new String[]{"Module", "Feature"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_apollo_v1_TrackFeatureAdoptionResponse_descriptor, new String[0]
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
         "\n-lunarclient/websocket/apollo/v1/service.proto\u0012\u001flunarclient.websocket.apollo.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\"O\n\u001bTrackFeatureAdoptionRequest\u0012\u0016\n\u0006module\u0018\u0001 \u0001(\tR\u0006module\u0012\u0018\n\u0007feature\u0018\u0002 \u0001(\tR\u0007feature\"\u001e\n\u001cTrackFeatureAdoptionResponse2«\u0001\n\rApolloService\u0012\u0099\u0001\n\u0014TrackFeatureAdoption\u0012<.lunarclient.websocket.apollo.v1.TrackFeatureAdoptionRequest\u001a=.lunarclient.websocket.apollo.v1.TrackFeatureAdoptionResponse\"\u0004\u0088µ\u0018\u0001BÕ\u0001\n#com.lunarclient.websocket.apollo.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWAª\u0002\u001fLunarclient.Websocket.Apollo.V1Ê\u0002\u001fLunarclient\\Websocket\\Apollo\\V1â\u0002+Lunarclient\\Websocket\\Apollo\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Apollo::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
   }
}
