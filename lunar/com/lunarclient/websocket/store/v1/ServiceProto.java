package com.lunarclient.websocket.store.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_store_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_store_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_store_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_store_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_store_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_store_v1_LoginResponse_descriptor, new String[]{"IncomingGiftPrivacy", "Coins"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyRequest_descriptor, new String[]{"IncomingGiftPrivacy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_store_v1_SetIncomingGiftPrivacyResponse_descriptor, new String[0]
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
         "\n,lunarclient/websocket/store/v1/service.proto\u0012\u001elunarclient.websocket.store.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a+lunarclient/websocket/store/v1/common.proto\"\u000e\n\fLoginRequest\"\u008e\u0001\n\rLoginResponse\u0012g\n\u0015incoming_gift_privacy\u0018\u0001 \u0001(\u000e23.lunarclient.websocket.store.v1.IncomingGiftPrivacyR\u0013incomingGiftPrivacy\u0012\u0014\n\u0005coins\u0018\u0002 \u0001(\u0003R\u0005coins\"\u0088\u0001\n\u001dSetIncomingGiftPrivacyRequest\u0012g\n\u0015incoming_gift_privacy\u0018\u0001 \u0001(\u000e23.lunarclient.websocket.store.v1.IncomingGiftPrivacyR\u0013incomingGiftPrivacy\" \n\u001eSetIncomingGiftPrivacyResponse2\u009a\u0002\n\fStoreService\u0012j\n\u0005Login\u0012,.lunarclient.websocket.store.v1.LoginRequest\u001a-.lunarclient.websocket.store.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009d\u0001\n\u0016SetIncomingGiftPrivacy\u0012=.lunarclient.websocket.store.v1.SetIncomingGiftPrivacyRequest\u001a>.lunarclient.websocket.store.v1.SetIncomingGiftPrivacyResponse\"\u0004\u0088µ\u0018\u0003BÐ\u0001\n\"com.lunarclient.websocket.store.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWSª\u0002\u001eLunarclient.Websocket.Store.V1Ê\u0002\u001eLunarclient\\Websocket\\Store\\V1â\u0002*Lunarclient\\Websocket\\Store\\V1\\GPBMetadataê\u0002!Lunarclient::Websocket::Store::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
