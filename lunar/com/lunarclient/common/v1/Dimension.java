package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PositionProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_GlobalPos_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_GlobalPos_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_GlobalPos_descriptor, new String[]{"Dimension", "X", "Y", "Z"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_Vector3i_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_Vector3i_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_Vector3i_descriptor, new String[]{"X", "Y", "Z"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_Vector2i_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_Vector2i_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_Vector2i_descriptor, new String[]{"X", "Z"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_Vector3f_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_Vector3f_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_Vector3f_descriptor, new String[]{"X", "Y", "Z"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PositionProto() {
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
         "\n$lunarclient/common/v1/position.proto\u0012\u0015lunarclient.common.v1\"S\n\tGlobalPos\u0012\u001c\n\tdimension\u0018\u0001 \u0001(\tR\tdimension\u0012\f\n\u0001x\u0018\u0002 \u0001(\u0005R\u0001x\u0012\f\n\u0001y\u0018\u0003 \u0001(\u0005R\u0001y\u0012\f\n\u0001z\u0018\u0004 \u0001(\u0005R\u0001z\"4\n\bVector3i\u0012\f\n\u0001x\u0018\u0001 \u0001(\u0005R\u0001x\u0012\f\n\u0001y\u0018\u0002 \u0001(\u0005R\u0001y\u0012\f\n\u0001z\u0018\u0003 \u0001(\u0005R\u0001z\"&\n\bVector2i\u0012\f\n\u0001x\u0018\u0001 \u0001(\u0005R\u0001x\u0012\f\n\u0001z\u0018\u0003 \u0001(\u0005R\u0001z\"4\n\bVector3f\u0012\f\n\u0001x\u0018\u0001 \u0001(\u0002R\u0001x\u0012\f\n\u0001y\u0018\u0002 \u0001(\u0002R\u0001y\u0012\f\n\u0001z\u0018\u0003 \u0001(\u0002R\u0001z*\u009e\u0001\n\tDirection\u0012\u0019\n\u0015DIRECTION_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eDIRECTION_DOWN\u0010\u0001\u0012\u0010\n\fDIRECTION_UP\u0010\u0002\u0012\u0013\n\u000fDIRECTION_NORTH\u0010\u0003\u0012\u0013\n\u000fDIRECTION_SOUTH\u0010\u0004\u0012\u0012\n\u000eDIRECTION_WEST\u0010\u0005\u0012\u0012\n\u000eDIRECTION_EAST\u0010\u0006B \u0001\n\u0019com.lunarclient.common.v1B\rPositionProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
