package com.lunarclient.websocket.marker.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerRequest_descriptor, new String[]{"Marker", "ReceiverUuids"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_marker_v1_BroadcastNewMarkerResponse_descriptor, new String[0]
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
         "\n-lunarclient/websocket/marker/v1/service.proto\u0012\u001flunarclient.websocket.marker.v1\u001a lunarclient/common/v1/uuid.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a,lunarclient/websocket/marker/v1/common.proto\" \u0001\n\u0019BroadcastNewMarkerRequest\u0012?\n\u0006marker\u0018\u0001 \u0001(\u000b2'.lunarclient.websocket.marker.v1.MarkerR\u0006marker\u0012B\n\u000ereceiver_uuids\u0018\u0002 \u0003(\u000b2\u001b.lunarclient.common.v1.UuidR\rreceiverUuids\"\u001c\n\u001aBroadcastNewMarkerResponse2¥\u0001\n\rMarkerService\u0012\u0093\u0001\n\u0012BroadcastNewMarker\u0012:.lunarclient.websocket.marker.v1.BroadcastNewMarkerRequest\u001a;.lunarclient.websocket.marker.v1.BroadcastNewMarkerResponse\"\u0004\u0088µ\u0018\u0001BÕ\u0001\n#com.lunarclient.websocket.marker.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWMª\u0002\u001fLunarclient.Websocket.Marker.V1Ê\u0002\u001fLunarclient\\Websocket\\Marker\\V1â\u0002+Lunarclient\\Websocket\\Marker\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Marker::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            UuidProto.getDescriptor(), com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(), CommonProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      UuidProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
