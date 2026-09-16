package com.lunarclient.websocket.jam.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_jam_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_jam_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_jam_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_jam_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_jam_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_jam_v1_LoginResponse_descriptor, new String[]{"OwnedJams"}
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
         "\n*lunarclient/websocket/jam/v1/service.proto\u0012\u001clunarclient.websocket.jam.v1\u001a)lunarclient/websocket/jam/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"\u000e\n\fLoginRequest\"V\n\rLoginResponse\u0012E\n\nowned_jams\u0018\u0001 \u0003(\u000b2&.lunarclient.websocket.jam.v1.OwnedJamR\townedJams2t\n\nJamService\u0012f\n\u0005Login\u0012*.lunarclient.websocket.jam.v1.LoginRequest\u001a+.lunarclient.websocket.jam.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003BÆ\u0001\n com.lunarclient.websocket.jam.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWJª\u0002\u001cLunarclient.Websocket.Jam.V1Ê\u0002\u001cLunarclient\\Websocket\\Jam\\V1â\u0002(Lunarclient\\Websocket\\Jam\\V1\\GPBMetadataê\u0002\u001fLunarclient::Websocket::Jam::V1b\u0006proto3"
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
