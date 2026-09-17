package com.lunarclient.websocket.logupload.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.websocket.protocol.v1.CommonProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_descriptor, new String[]{"Files", "SentryCrashId", "SolutionId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_File_descriptor = internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_File_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_logupload_v1_StartLogUploadRequest_File_descriptor, new String[]{"Name"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_descriptor, new String[]{"Files", "UploadId", "Status"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_File_descriptor = internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_File_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_logupload_v1_StartLogUploadResponse_File_descriptor, new String[]{"Name", "UploadUrl"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_logupload_v1_CompleteLogUploadRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_logupload_v1_CompleteLogUploadRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_logupload_v1_CompleteLogUploadRequest_descriptor, new String[]{"UploadId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_logupload_v1_CompleteLogUploadResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_logupload_v1_CompleteLogUploadResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_logupload_v1_CompleteLogUploadResponse_descriptor, new String[0]
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
         "\n0lunarclient/websocket/logupload/v1/service.proto\u0012\"lunarclient.websocket.logupload.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\"Ò\u0001\n\u0015StartLogUploadRequest\u0012T\n\u0005files\u0018\u0001 \u0003(\u000b2>.lunarclient.websocket.logupload.v1.StartLogUploadRequest.FileR\u0005files\u0012&\n\u000fsentry_crash_id\u0018\u0002 \u0001(\tR\rsentryCrashId\u0012\u001f\n\u000bsolution_id\u0018\u0003 \u0001(\tR\nsolutionId\u001a\u001a\n\u0004File\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\"ð\u0002\n\u0016StartLogUploadResponse\u0012U\n\u0005files\u0018\u0001 \u0003(\u000b2?.lunarclient.websocket.logupload.v1.StartLogUploadResponse.FileR\u0005files\u0012\u001b\n\tupload_id\u0018\u0002 \u0001(\tR\buploadId\u0012Y\n\u0006status\u0018\u0003 \u0001(\u000e2A.lunarclient.websocket.logupload.v1.StartLogUploadResponse.StatusR\u0006status\u001a9\n\u0004File\u0012\u0012\n\u0004name\u0018\u0001 \u0001(\tR\u0004name\u0012\u001d\n\nupload_url\u0018\u0002 \u0001(\tR\tuploadUrl\"L\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u0016\n\u0012STATUS_NOT_ALLOWED\u0010\u0002\"7\n\u0018CompleteLogUploadRequest\u0012\u001b\n\tupload_id\u0018\u0001 \u0001(\tR\buploadId\"\u001b\n\u0019CompleteLogUploadResponse2»\u0002\n\u0010LogUploadService\u0012\u008d\u0001\n\u000eStartLogUpload\u00129.lunarclient.websocket.logupload.v1.StartLogUploadRequest\u001a:.lunarclient.websocket.logupload.v1.StartLogUploadResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0096\u0001\n\u0011CompleteLogUpload\u0012<.lunarclient.websocket.logupload.v1.CompleteLogUploadRequest\u001a=.lunarclient.websocket.logupload.v1.CompleteLogUploadResponse\"\u0004\u0088µ\u0018\u0003Bä\u0001\n&com.lunarclient.websocket.logupload.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWLª\u0002\"Lunarclient.Websocket.Logupload.V1Ê\u0002\"Lunarclient\\Websocket\\Logupload\\V1â\u0002.Lunarclient\\Websocket\\Logupload\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Logupload::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
   }
}
