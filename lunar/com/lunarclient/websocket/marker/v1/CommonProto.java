package com.lunarclient.websocket.marker.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.PositionProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_marker_v1_Marker_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_marker_v1_Marker_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_marker_v1_Marker_descriptor, new String[]{"Position", "Description", "Source"}
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
         "\n,lunarclient/websocket/marker/v1/common.proto\u0012\u001flunarclient.websocket.marker.v1\u001a$lunarclient/common/v1/position.proto\"\u007f\n\u0006Marker\u0012;\n\bposition\u0018\u0001 \u0001(\u000b2\u001f.lunarclient.common.v1.Vector3fR\bposition\u0012 \n\u000bdescription\u0018\u0002 \u0003(\tR\u000bdescription\u0012\u0016\n\u0006source\u0018\u0003 \u0001(\tR\u0006sourceBÑ\u0001\n#com.lunarclient.websocket.marker.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWMª\u0002\u001fLunarclient.Websocket.Marker.V1Ê\u0002\u001fLunarclient\\Websocket\\Marker\\V1â\u0002+Lunarclient\\Websocket\\Marker\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Marker::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{PositionProto.getDescriptor()});
      PositionProto.getDescriptor();
   }
}
