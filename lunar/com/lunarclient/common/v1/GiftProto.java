package com.lunarclient.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class GiftProto {
   static final Descriptors.Descriptor internal_static_lunarclient_common_v1_GiftInfo_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_common_v1_GiftInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_common_v1_GiftInfo_descriptor, new String[]{"GiftedBy", "Message", "IsAnonymous"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private GiftProto() {
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
         "\n lunarclient/common/v1/gift.proto\u0012\u0015lunarclient.common.v1\u001a lunarclient/common/v1/uuid.proto\"°\u0001\n\bGiftInfo\u0012H\n\tgifted_by\u0018\u0001 \u0001(\u000b2&.lunarclient.common.v1.UuidAndUsernameH\u0000R\bgiftedBy\u0088\u0001\u0001\u0012\u001d\n\u0007message\u0018\u0002 \u0001(\tH\u0001R\u0007message\u0088\u0001\u0001\u0012!\n\fis_anonymous\u0018\u0003 \u0001(\bR\u000bisAnonymousB\f\n\n_gifted_byB\n\n\b_messageB\u009c\u0001\n\u0019com.lunarclient.common.v1B\tGiftProtoP\u0001¢\u0002\u0003LCXª\u0002\u0015Lunarclient.Common.V1Ê\u0002\u0015Lunarclient\\Common\\V1â\u0002!Lunarclient\\Common\\V1\\GPBMetadataê\u0002\u0017Lunarclient::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor()});
      UuidProto.getDescriptor();
   }
}
