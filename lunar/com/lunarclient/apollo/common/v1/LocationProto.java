package com.lunarclient.apollo.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class LocationProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_BlockLocation_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_BlockLocation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_BlockLocation_descriptor, new String[]{"World", "X", "Y", "Z"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_PlayerLocation_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_PlayerLocation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_PlayerLocation_descriptor, new String[]{"Location", "Yaw", "Pitch"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_Location_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_Location_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_Location_descriptor, new String[]{"World", "X", "Y", "Z"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private LocationProto() {
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
         "\n+lunarclient/apollo/common/v1/location.proto\u0012\u001clunarclient.apollo.common.v1\"O\n\rBlockLocation\u0012\u0014\n\u0005world\u0018\u0001 \u0001(\tR\u0005world\u0012\f\n\u0001x\u0018\u0002 \u0001(\u0011R\u0001x\u0012\f\n\u0001y\u0018\u0003 \u0001(\u0011R\u0001y\u0012\f\n\u0001z\u0018\u0004 \u0001(\u0011R\u0001z\"|\n\u000ePlayerLocation\u0012B\n\blocation\u0018\u0001 \u0001(\u000b2&.lunarclient.apollo.common.v1.LocationR\blocation\u0012\u0010\n\u0003yaw\u0018\u0002 \u0001(\u0002R\u0003yaw\u0012\u0014\n\u0005pitch\u0018\u0003 \u0001(\u0002R\u0005pitch\"J\n\bLocation\u0012\u0014\n\u0005world\u0018\u0001 \u0001(\tR\u0005world\u0012\f\n\u0001x\u0018\u0002 \u0001(\u0001R\u0001x\u0012\f\n\u0001y\u0018\u0003 \u0001(\u0001R\u0001y\u0012\f\n\u0001z\u0018\u0004 \u0001(\u0001R\u0001zBÄ\u0001\n com.lunarclient.apollo.common.v1B\rLocationProtoP\u0001¢\u0002\u0003LACª\u0002\u001cLunarclient.Apollo.Common.V1Ê\u0002\u001cLunarclient\\Apollo\\Common\\V1â\u0002(Lunarclient\\Apollo\\Common\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
