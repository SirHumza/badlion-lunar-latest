package com.lunarclient.apollo.packetenrichment.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;

public final class PacketProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_packetenrichment_v1_PacketInfo_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_packetenrichment_v1_PacketInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_packetenrichment_v1_PacketInfo_descriptor, new String[]{"InstantiationTime"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PacketProto() {
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
         "\n3lunarclient/apollo/packetenrichment/v1/packet.proto\u0012&lunarclient.apollo.packetenrichment.v1\u001a\u001fgoogle/protobuf/timestamp.proto\"W\n\nPacketInfo\u0012I\n\u0012instantiation_time\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0011instantiationTimeBô\u0001\n*com.lunarclient.apollo.packetenrichment.v1B\u000bPacketProtoP\u0001¢\u0002\u0003LAPª\u0002&Lunarclient.Apollo.Packetenrichment.V1Ê\u0002&Lunarclient\\Apollo\\Packetenrichment\\V1â\u00022Lunarclient\\Apollo\\Packetenrichment\\V1\\GPBMetadataê\u0002)Lunarclient::Apollo::Packetenrichment::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor()});
      TimestampProto.getDescriptor();
   }
}
