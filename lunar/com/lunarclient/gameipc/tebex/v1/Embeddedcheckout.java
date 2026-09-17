package com.lunarclient.gameipc.tebex.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_tebex_v1_CheckTebexCapabilitiesResponse_descriptor, new String[]{"EmbeddedCheckout"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutRequest_descriptor, new String[]{"BasketIdent", "Locale"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_tebex_v1_OpenTebexJsCheckoutResponse_descriptor, new String[]{"Status", "OpenMinecraftScreen"}
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
         "\n*lunarclient/gameipc/tebex/v1/service.proto\u0012\u001clunarclient.gameipc.tebex.v1\"\u001f\n\u001dCheckTebexCapabilitiesRequest\"£\u0002\n\u001eCheckTebexCapabilitiesResponse\u0012z\n\u0011embedded_checkout\u0018\u0001 \u0001(\u000e2M.lunarclient.gameipc.tebex.v1.CheckTebexCapabilitiesResponse.EmbeddedCheckoutR\u0010embeddedCheckout\"\u0084\u0001\n\u0010EmbeddedCheckout\u0012!\n\u001dEMBEDDED_CHECKOUT_UNSPECIFIED\u0010\u0000\u0012&\n\"EMBEDDED_CHECKOUT_OVERWOLF_OVERLAY\u0010\u0001\u0012%\n!EMBEDDED_CHECKOUT_ELECTRON_WINDOW\u0010\u0002\"W\n\u001aOpenTebexJsCheckoutRequest\u0012!\n\fbasket_ident\u0018\u0001 \u0001(\tR\u000bbasketIdent\u0012\u0016\n\u0006locale\u0018\u0002 \u0001(\tR\u0006locale\"\u0096\u0002\n\u001bOpenTebexJsCheckoutResponse\u0012X\n\u0006status\u0018\u0001 \u0001(\u000e2@.lunarclient.gameipc.tebex.v1.OpenTebexJsCheckoutResponse.StatusR\u0006status\u00122\n\u0015open_minecraft_screen\u0018\u0002 \u0001(\bR\u0013openMinecraftScreen\"i\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u0019\n\u0015STATUS_INTERNAL_ERROR\u0010\u0002\u0012\u001d\n\u0019STATUS_SERVER_NOT_ALLOWED\u0010\u00032±\u0002\n\fTebexService\u0012\u008a\u0001\n\u0013OpenTebexJsCheckout\u00128.lunarclient.gameipc.tebex.v1.OpenTebexJsCheckoutRequest\u001a9.lunarclient.gameipc.tebex.v1.OpenTebexJsCheckoutResponse\u0012\u0093\u0001\n\u0016CheckTebexCapabilities\u0012;.lunarclient.gameipc.tebex.v1.CheckTebexCapabilitiesRequest\u001a<.lunarclient.gameipc.tebex.v1.CheckTebexCapabilitiesResponseBÆ\u0001\n com.lunarclient.gameipc.tebex.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LGTª\u0002\u001cLunarclient.Gameipc.Tebex.V1Ê\u0002\u001cLunarclient\\Gameipc\\Tebex\\V1â\u0002(Lunarclient\\Gameipc\\Tebex\\V1\\GPBMetadataê\u0002\u001fLunarclient::Gameipc::Tebex::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
