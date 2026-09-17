package com.lunarclient.apollo.transfer.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_transfer_v1_PingData_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_transfer_v1_PingData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_transfer_v1_PingData_descriptor, new String[]{"ServerIp", "Status", "Ping"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_transfer_v1_PingRequest_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_transfer_v1_PingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_transfer_v1_PingRequest_descriptor, new String[]{"RequestId", "ServerIps"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_transfer_v1_PingResponse_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_transfer_v1_PingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_transfer_v1_PingResponse_descriptor, new String[]{"RequestId", "PingData"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_transfer_v1_TransferRequest_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_transfer_v1_TransferRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_transfer_v1_TransferRequest_descriptor, new String[]{"RequestId", "ServerIp"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_transfer_v1_TransferResponse_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_transfer_v1_TransferResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_transfer_v1_TransferResponse_descriptor, new String[]{"RequestId", "Status"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private SchemaProto() {
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
         "\n+lunarclient/apollo/transfer/v1/schema.proto\u0012\u001elunarclient.apollo.transfer.v1\"Ð\u0001\n\bPingData\u0012\u001b\n\tserver_ip\u0018\u0001 \u0001(\tR\bserverIp\u0012G\n\u0006status\u0018\u0002 \u0001(\u000e2/.lunarclient.apollo.transfer.v1.PingData.StatusR\u0006status\u0012\u0012\n\u0004ping\u0018\u0003 \u0001(\u0005R\u0004ping\"J\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u0014\n\u0010STATUS_TIMED_OUT\u0010\u0002\"K\n\u000bPingRequest\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\u0012\u001d\n\nserver_ips\u0018\u0002 \u0003(\tR\tserverIps\"t\n\fPingResponse\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\u0012E\n\tping_data\u0018\u0002 \u0003(\u000b2(.lunarclient.apollo.transfer.v1.PingDataR\bpingData\"M\n\u000fTransferRequest\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\u0012\u001b\n\tserver_ip\u0018\u0002 \u0001(\tR\bserverIp\"Î\u0001\n\u0010TransferResponse\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\u0012O\n\u0006status\u0018\u0002 \u0001(\u000e27.lunarclient.apollo.transfer.v1.TransferResponse.StatusR\u0006status\"J\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\u0013\n\u000fSTATUS_ACCEPTED\u0010\u0001\u0012\u0013\n\u000fSTATUS_REJECTED\u0010\u0002BÌ\u0001\n\"com.lunarclient.apollo.transfer.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LATª\u0002\u001eLunarclient.Apollo.Transfer.V1Ê\u0002\u001eLunarclient\\Apollo\\Transfer\\V1â\u0002*Lunarclient\\Apollo\\Transfer\\V1\\GPBMetadataê\u0002!Lunarclient::Apollo::Transfer::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
