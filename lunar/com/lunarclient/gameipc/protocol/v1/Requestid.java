package com.lunarclient.gameipc.protocol.v1;

import com.google.protobuf.AnyProto;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_protocol_v1_LauncherboundIPCMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_protocol_v1_LauncherboundIPCMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_protocol_v1_LauncherboundIPCMessage_descriptor,
      new String[]{"RequestId", "Service", "Method", "Input", "FullMethod", "InputName", "InputFullName"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_protocol_v1_GameboundIPCMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_protocol_v1_GameboundIPCMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_protocol_v1_GameboundIPCMessage_descriptor, new String[]{"RpcResponse", "PushNotification", "Contents"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_protocol_v1_IPCRpcResponse_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_protocol_v1_IPCRpcResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_protocol_v1_IPCRpcResponse_descriptor, new String[]{"RequestId", "Output"}
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
         "\n,lunarclient/gameipc/protocol/v1/common.proto\u0012\u001flunarclient.gameipc.protocol.v1\u001a\u0019google/protobuf/any.proto\"è\u0001\n\u0017LauncherboundIPCMessage\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\u0012\u0018\n\u0007service\u0018\u0002 \u0001(\tR\u0007service\u0012\u0016\n\u0006method\u0018\u0003 \u0001(\tR\u0006method\u0012\u0014\n\u0005input\u0018\u0004 \u0001(\fR\u0005input\u0012\u001f\n\u000bfull_method\u0018\u0006 \u0001(\tR\nfullMethod\u0012\u001d\n\ninput_name\u0018\u0007 \u0001(\tR\tinputName\u0012&\n\u000finput_full_name\u0018\b \u0001(\tR\rinputFullName\"¼\u0001\n\u0013GameboundIPCMessage\u0012T\n\frpc_response\u0018\u0001 \u0001(\u000b2/.lunarclient.gameipc.protocol.v1.IPCRpcResponseH\u0000R\u000brpcResponse\u0012C\n\u0011push_notification\u0018\u0002 \u0001(\u000b2\u0014.google.protobuf.AnyH\u0000R\u0010pushNotificationB\n\n\bcontents\"G\n\u000eIPCRpcResponse\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\u0012\u0016\n\u0006output\u0018\u0002 \u0001(\fR\u0006outputBÑ\u0001\n#com.lunarclient.gameipc.protocol.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LGPª\u0002\u001fLunarclient.Gameipc.Protocol.V1Ê\u0002\u001fLunarclient\\Gameipc\\Protocol\\V1â\u0002+Lunarclient\\Gameipc\\Protocol\\V1\\GPBMetadataê\u0002\"Lunarclient::Gameipc::Protocol::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()});
      AnyProto.getDescriptor();
   }
}
