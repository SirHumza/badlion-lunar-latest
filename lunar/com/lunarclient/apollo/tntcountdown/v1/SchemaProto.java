package com.lunarclient.apollo.tntcountdown.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.EntityidProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_tntcountdown_v1_SetTntCountdownMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_tntcountdown_v1_SetTntCountdownMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_tntcountdown_v1_SetTntCountdownMessage_descriptor, new String[]{"EntityId", "DurationTicks"}
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
         "\n/lunarclient/apollo/tntcountdown/v1/schema.proto\u0012\"lunarclient.apollo.tntcountdown.v1\u001a+lunarclient/apollo/common/v1/entityid.proto\"\u0084\u0001\n\u0016SetTntCountdownMessage\u0012C\n\tentity_id\u0018\u0001 \u0001(\u000b2&.lunarclient.apollo.common.v1.EntityIdR\bentityId\u0012%\n\u000eduration_ticks\u0018\u0002 \u0001(\u0005R\rdurationTicksBà\u0001\n&com.lunarclient.apollo.tntcountdown.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LATª\u0002\"Lunarclient.Apollo.Tntcountdown.V1Ê\u0002\"Lunarclient\\Apollo\\Tntcountdown\\V1â\u0002.Lunarclient\\Apollo\\Tntcountdown\\V1\\GPBMetadataê\u0002%Lunarclient::Apollo::Tntcountdown::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{EntityidProto.getDescriptor()});
      EntityidProto.getDescriptor();
   }
}
