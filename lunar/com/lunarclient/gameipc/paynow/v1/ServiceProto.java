package com.lunarclient.gameipc.paynow.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_paynow_v1_CheckPayNowCapabilitiesResponse_descriptor, new String[]{"EmbeddedCheckout"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutRequest_descriptor, new String[]{"CheckoutToken"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_paynow_v1_OpenPayNowJsCheckoutResponse_descriptor, new String[]{"Status", "OpenMinecraftScreen"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServiceProto() {
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
         "\n+lunarclient/gameipc/paynow/v1/service.proto\u0012\u001dlunarclient.gameipc.paynow.v1\" \n\u001eCheckPayNowCapabilitiesRequest\"¦\u0002\n\u001fCheckPayNowCapabilitiesResponse\u0012|\n\u0011embedded_checkout\u0018\u0001 \u0001(\u000e2O.lunarclient.gameipc.paynow.v1.CheckPayNowCapabilitiesResponse.EmbeddedCheckoutR\u0010embeddedCheckout\"\u0084\u0001\n\u0010EmbeddedCheckout\u0012!\n\u001dEMBEDDED_CHECKOUT_UNSPECIFIED\u0010\u0000\u0012&\n\"EMBEDDED_CHECKOUT_OVERWOLF_OVERLAY\u0010\u0001\u0012%\n!EMBEDDED_CHECKOUT_ELECTRON_WINDOW\u0010\u0002\"D\n\u001bOpenPayNowJsCheckoutRequest\u0012%\n\u000echeckout_token\u0018\u0001 \u0001(\tR\rcheckoutToken\"\u0099\u0002\n\u001cOpenPayNowJsCheckoutResponse\u0012Z\n\u0006status\u0018\u0001 \u0001(\u000e2B.lunarclient.gameipc.paynow.v1.OpenPayNowJsCheckoutResponse.StatusR\u0006status\u00122\n\u0015open_minecraft_screen\u0018\u0002 \u0001(\bR\u0013openMinecraftScreen\"i\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u0019\n\u0015STATUS_INTERNAL_ERROR\u0010\u0002\u0012\u001d\n\u0019STATUS_SERVER_NOT_ALLOWED\u0010\u00032¼\u0002\n\rPayNowService\u0012\u008f\u0001\n\u0014OpenPayNowJsCheckout\u0012:.lunarclient.gameipc.paynow.v1.OpenPayNowJsCheckoutRequest\u001a;.lunarclient.gameipc.paynow.v1.OpenPayNowJsCheckoutResponse\u0012\u0098\u0001\n\u0017CheckPayNowCapabilities\u0012=.lunarclient.gameipc.paynow.v1.CheckPayNowCapabilitiesRequest\u001a>.lunarclient.gameipc.paynow.v1.CheckPayNowCapabilitiesResponseBË\u0001\n!com.lunarclient.gameipc.paynow.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LGPª\u0002\u001dLunarclient.Gameipc.Paynow.V1Ê\u0002\u001dLunarclient\\Gameipc\\Paynow\\V1â\u0002)Lunarclient\\Gameipc\\Paynow\\V1\\GPBMetadataê\u0002 Lunarclient::Gameipc::Paynow::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
