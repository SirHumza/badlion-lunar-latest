package com.lunarclient.apollo.evnt.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class HearttextureProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_OverrideHeartTextureMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_OverrideHeartTextureMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_OverrideHeartTextureMessage_descriptor, new String[]{"LocationX", "Hardcore"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_evnt_v1_ResetHeartTextureMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_evnt_v1_ResetHeartTextureMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_evnt_v1_ResetHeartTextureMessage_descriptor, new String[0]
   );
   private static Descriptors.FileDescriptor descriptor;

   private HearttextureProto() {
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
         "\n-lunarclient/apollo/evnt/v1/hearttexture.proto\u0012\u001alunarclient.apollo.evnt.v1\"X\n\u001bOverrideHeartTextureMessage\u0012\u001d\n\nlocation_x\u0018\u0001 \u0001(\u0005R\tlocationX\u0012\u001a\n\bhardcore\u0018\u0002 \u0001(\bR\bhardcore\"\u001a\n\u0018ResetHeartTextureMessageB¾\u0001\n\u001ecom.lunarclient.apollo.evnt.v1B\u0011HearttextureProtoP\u0001¢\u0002\u0003LAEª\u0002\u001aLunarclient.Apollo.Evnt.V1Ê\u0002\u001aLunarclient\\Apollo\\Evnt\\V1â\u0002&Lunarclient\\Apollo\\Evnt\\V1\\GPBMetadataê\u0002\u001dLunarclient::Apollo::Evnt::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
