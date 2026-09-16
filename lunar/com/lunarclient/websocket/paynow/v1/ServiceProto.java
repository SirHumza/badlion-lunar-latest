package com.lunarclient.websocket.paynow.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.websocket.protocol.v1.CommonProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedRequest_descriptor, new String[]{"CheckoutToken", "Backend"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutOpenedResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutClosedRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutClosedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutClosedRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutClosedResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutClosedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_paynow_v1_PayNowCheckoutClosedResponse_descriptor, new String[0]
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
         "\n-lunarclient/websocket/paynow/v1/service.proto\u0012\u001flunarclient.websocket.paynow.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\"\u0083\u0002\n\u001bPayNowCheckoutOpenedRequest\u0012%\n\u000echeckout_token\u0018\u0001 \u0001(\tR\rcheckoutToken\u0012^\n\u0007backend\u0018\u0002 \u0001(\u000e2D.lunarclient.websocket.paynow.v1.PayNowCheckoutOpenedRequest.BackendR\u0007backend\"]\n\u0007Backend\u0012\u0017\n\u0013BACKEND_UNSPECIFIED\u0010\u0000\u0012\u001c\n\u0018BACKEND_OVERWOLF_OVERLAY\u0010\u0001\u0012\u001b\n\u0017BACKEND_ELECTRON_WINDOW\u0010\u0002\"\u001e\n\u001cPayNowCheckoutOpenedResponse\"\u001d\n\u001bPayNowCheckoutClosedRequest\"\u001e\n\u001cPayNowCheckoutClosedResponse2Ç\u0002\n\rPayNowService\u0012\u0099\u0001\n\u0014PayNowCheckoutOpened\u0012<.lunarclient.websocket.paynow.v1.PayNowCheckoutOpenedRequest\u001a=.lunarclient.websocket.paynow.v1.PayNowCheckoutOpenedResponse\"\u0004\u0088µ\u0018\u0002\u0012\u0099\u0001\n\u0014PayNowCheckoutClosed\u0012<.lunarclient.websocket.paynow.v1.PayNowCheckoutClosedRequest\u001a=.lunarclient.websocket.paynow.v1.PayNowCheckoutClosedResponse\"\u0004\u0088µ\u0018\u0002BÕ\u0001\n#com.lunarclient.websocket.paynow.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWPª\u0002\u001fLunarclient.Websocket.Paynow.V1Ê\u0002\u001fLunarclient\\Websocket\\Paynow\\V1â\u0002+Lunarclient\\Websocket\\Paynow\\V1\\GPBMetadataê\u0002\"Lunarclient::Websocket::Paynow::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{CommonProto.getDescriptor()});
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      CommonProto.getDescriptor();
   }
}
