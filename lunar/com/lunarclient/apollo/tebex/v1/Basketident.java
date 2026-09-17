package com.lunarclient.apollo.tebex.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_tebex_v1_OpenTebexEmbeddedCheckoutMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_tebex_v1_OpenTebexEmbeddedCheckoutMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_tebex_v1_OpenTebexEmbeddedCheckoutMessage_descriptor, new String[]{"BasketIdent", "Locale"}
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
         "\n(lunarclient/apollo/tebex/v1/schema.proto\u0012\u001blunarclient.apollo.tebex.v1\"]\n OpenTebexEmbeddedCheckoutMessage\u0012!\n\fbasket_ident\u0018\u0001 \u0001(\tR\u000bbasketIdent\u0012\u0016\n\u0006locale\u0018\u0002 \u0001(\tR\u0006localeB½\u0001\n\u001fcom.lunarclient.apollo.tebex.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LATª\u0002\u001bLunarclient.Apollo.Tebex.V1Ê\u0002\u001bLunarclient\\Apollo\\Tebex\\V1â\u0002'Lunarclient\\Apollo\\Tebex\\V1\\GPBMetadataê\u0002\u001eLunarclient::Apollo::Tebex::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
