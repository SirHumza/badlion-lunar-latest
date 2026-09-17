package com.lunarclient.apollo.nickhider.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_nickhider_v1_OverrideNickHiderMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_nickhider_v1_OverrideNickHiderMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_nickhider_v1_OverrideNickHiderMessage_descriptor, new String[]{"Nick"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_nickhider_v1_ResetNickHiderMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_nickhider_v1_ResetNickHiderMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_nickhider_v1_ResetNickHiderMessage_descriptor, new String[0]
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
         "\n,lunarclient/apollo/nickhider/v1/schema.proto\u0012\u001flunarclient.apollo.nickhider.v1\".\n\u0018OverrideNickHiderMessage\u0012\u0012\n\u0004nick\u0018\u0001 \u0001(\tR\u0004nick\"\u0017\n\u0015ResetNickHiderMessageBÑ\u0001\n#com.lunarclient.apollo.nickhider.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LANª\u0002\u001fLunarclient.Apollo.Nickhider.V1Ê\u0002\u001fLunarclient\\Apollo\\Nickhider\\V1â\u0002+Lunarclient\\Apollo\\Nickhider\\V1\\GPBMetadataê\u0002\"Lunarclient::Apollo::Nickhider::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
