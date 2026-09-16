package com.lunarclient.apollo.paynow.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_paynow_v1_OpenPayNowEmbeddedCheckoutMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_paynow_v1_OpenPayNowEmbeddedCheckoutMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_paynow_v1_OpenPayNowEmbeddedCheckoutMessage_descriptor, new String[]{"CheckoutToken"}
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
         "\n)lunarclient/apollo/paynow/v1/schema.proto\u0012\u001clunarclient.apollo.paynow.v1\"J\n!OpenPayNowEmbeddedCheckoutMessage\u0012%\n\u000echeckout_token\u0018\u0001 \u0001(\tR\rcheckoutTokenBÂ\u0001\n com.lunarclient.apollo.paynow.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAPª\u0002\u001cLunarclient.Apollo.Paynow.V1Ê\u0002\u001cLunarclient\\Apollo\\Paynow\\V1â\u0002(Lunarclient\\Apollo\\Paynow\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Paynow::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
