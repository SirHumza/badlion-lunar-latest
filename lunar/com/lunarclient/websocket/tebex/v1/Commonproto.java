package com.lunarclient.websocket.tebex.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.websocket.protocol.v1.CommonProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedRequest_descriptor, new String[]{"BasketIdent", "Backend", "Locale"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutOpenedResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutClosedRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutClosedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutClosedRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutClosedResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutClosedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_tebex_v1_TebexJsCheckoutClosedResponse_descriptor, new String[0]
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
         "\n,lunarclient/websocket/tebex/v1/service.proto\u0012\u001elunarclient.websocket.tebex.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\"\u0098\u0002\n\u001cTebexJsCheckoutOpenedRequest\u0012!\n\fbasket_ident\u0018\u0001 \u0001(\tR\u000bbasketIdent\u0012^\n\u0007backend\u0018\u0002 \u0001(\u000e2D.lunarclient.websocket.tebex.v1.TebexJsCheckoutOpenedRequest.BackendR\u0007backend\u0012\u0016\n\u0006locale\u0018\u0003 \u0001(\tR\u0006locale\"]\n\u0007Backend\u0012\u0017\n\u0013BACKEND_UNSPECIFIED\u0010\u0000\u0012\u001c\n\u0018BACKEND_OVERWOLF_OVERLAY\u0010\u0001\u0012\u001b\n\u0017BACKEND_ELECTRON_WINDOW\u0010\u0002\"\u001f\n\u001dTebexJsCheckoutOpenedResponse\"\u001e\n\u001cTebexJsCheckoutClosedRequest\"\u001f\n\u001dTebexJsCheckoutClosedResponse2È\u0002\n\fTebexService\u0012\u009a\u0001\n\u0015TebexJsCheckoutOpened\u0012<.lunarclient.websocket.tebex.v1.TebexJsCheckoutOpenedRequest\u001a=.lunarclient.websocket.tebex.v1.TebexJsCheckoutOpenedResponse\"\u0004\u0088µ\u0018\u0002\u0012\u009a\u0001\n\u0015TebexJsCheckoutClosed\u0012<.lunarclient.websocket.tebex.v1.TebexJsCheckoutClosedRequest\u001a=.lunarclient.websocket.tebex.v1.TebexJsCheckoutClosedResponse\"\u0004\u0088µ\u0018\u0002BÐ\u0001\n\"com.lunarclient.websocket.tebex.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWTª\u0002\u001eLunarclient.Websocket.Tebex.V1Ê\u0002\u001eLunarclient\\Websocket\\Tebex\\V1â\u0002*Lunarclient\\Websocket\\Tebex\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Tebex::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
   }
}
