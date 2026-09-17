package com.lunarclient.apollo.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SoundProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationSound_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationSound_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationSound_descriptor, new String[]{"ResourceLocation"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_Sound_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_Sound_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_Sound_descriptor, new String[]{"SimpleResourceLocation", "Contents"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private SoundProto() {
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
         "\n(lunarclient/apollo/common/v1/sound.proto\u0012\u001clunarclient.apollo.common.v1\"J\n\u001bSimpleResourceLocationSound\u0012+\n\u0011resource_location\u0018\u0001 \u0001(\tR\u0010resourceLocation\"\u008a\u0001\n\u0005Sound\u0012u\n\u0018simple_resource_location\u0018\u0001 \u0001(\u000b29.lunarclient.apollo.common.v1.SimpleResourceLocationSoundH\u0000R\u0016simpleResourceLocationB\n\n\bcontentsBÁ\u0001\n com.lunarclient.apollo.common.v1B\nSoundProtoP\u0001¢\u0002\u0003LACª\u0002\u001cLunarclient.Apollo.Common.V1Ê\u0002\u001cLunarclient\\Apollo\\Common\\V1â\u0002(Lunarclient\\Apollo\\Common\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
