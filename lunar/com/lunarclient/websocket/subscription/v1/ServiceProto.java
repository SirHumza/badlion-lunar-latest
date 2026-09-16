package com.lunarclient.websocket.subscription.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;
import com.lunarclient.websocket.cosmetic.v1.PushProto;
import com.lunarclient.websocket.protocol.v1.CommonProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_subscription_v1_SubscribeRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_subscription_v1_SubscribeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_subscription_v1_SubscribeRequest_descriptor, new String[]{"TargetUuids"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Request_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Request_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Request_descriptor, new String[]{"TargetUuids"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_subscription_v1_SubscribeResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_subscription_v1_SubscribeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_subscription_v1_SubscribeResponse_descriptor, new String[]{"CosmeticPushes", "RadioPushes"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Response_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Response_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_subscription_v1_SubscribeV2Response_descriptor, new String[]{"CosmeticPushes", "RadioPushes"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_subscription_v1_UnsubscribeRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_subscription_v1_UnsubscribeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_subscription_v1_UnsubscribeRequest_descriptor, new String[]{"TargetUuids"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_subscription_v1_UnsubscribeResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_subscription_v1_UnsubscribeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_subscription_v1_UnsubscribeResponse_descriptor, new String[0]
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
         "\n3lunarclient/websocket/subscription/v1/service.proto\u0012%lunarclient.websocket.subscription.v1\u001a lunarclient/common/v1/uuid.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a,lunarclient/websocket/cosmetic/v1/push.proto\u001a,lunarclient/websocket/cosmetic/v2/push.proto\u001a)lunarclient/websocket/radio/v1/push.proto\"R\n\u0010SubscribeRequest\u0012>\n\ftarget_uuids\u0018\u0001 \u0003(\u000b2\u001b.lunarclient.common.v1.UuidR\u000btargetUuids\"T\n\u0012SubscribeV2Request\u0012>\n\ftarget_uuids\u0018\u0001 \u0003(\u000b2\u001b.lunarclient.common.v1.UuidR\u000btargetUuids\"È\u0001\n\u0011SubscribeResponse\u0012_\n\u000fcosmetic_pushes\u0018\u0001 \u0003(\u000b26.lunarclient.websocket.cosmetic.v1.PlayerCosmeticsPushR\u000ecosmeticPushes\u0012R\n\fradio_pushes\u0018\u0002 \u0003(\u000b2/.lunarclient.websocket.radio.v1.PlayerRadioPushR\u000bradioPushes\"Ì\u0001\n\u0013SubscribeV2Response\u0012a\n\u000fcosmetic_pushes\u0018\u0001 \u0003(\u000b28.lunarclient.websocket.cosmetic.v2.PlayerCosmeticsPushV2R\u000ecosmeticPushes\u0012R\n\fradio_pushes\u0018\u0002 \u0003(\u000b2/.lunarclient.websocket.radio.v1.PlayerRadioPushR\u000bradioPushes\"T\n\u0012UnsubscribeRequest\u0012>\n\ftarget_uuids\u0018\u0001 \u0003(\u000b2\u001b.lunarclient.common.v1.UuidR\u000btargetUuids\"\u0015\n\u0013UnsubscribeResponse2¶\u0003\n\u0013SubscriptionService\u0012\u0084\u0001\n\tSubscribe\u00127.lunarclient.websocket.subscription.v1.SubscribeRequest\u001a8.lunarclient.websocket.subscription.v1.SubscribeResponse\"\u0004\u0088µ\u0018\u0001\u0012\u008a\u0001\n\u000bSubscribeV2\u00129.lunarclient.websocket.subscription.v1.SubscribeV2Request\u001a:.lunarclient.websocket.subscription.v1.SubscribeV2Response\"\u0004\u0088µ\u0018\u0001\u0012\u008a\u0001\n\u000bUnsubscribe\u00129.lunarclient.websocket.subscription.v1.UnsubscribeRequest\u001a:.lunarclient.websocket.subscription.v1.UnsubscribeResponse\"\u0004\u0088µ\u0018\u0001Bó\u0001\n)com.lunarclient.websocket.subscription.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWSª\u0002%Lunarclient.Websocket.Subscription.V1Ê\u0002%Lunarclient\\Websocket\\Subscription\\V1â\u00021Lunarclient\\Websocket\\Subscription\\V1\\GPBMetadataê\u0002(Lunarclient::Websocket::Subscription::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            UuidProto.getDescriptor(),
            CommonProto.getDescriptor(),
            PushProto.getDescriptor(),
            com.lunarclient.websocket.cosmetic.v2.PushProto.getDescriptor(),
            com.lunarclient.websocket.radio.v1.PushProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
      PushProto.getDescriptor();
      com.lunarclient.websocket.cosmetic.v2.PushProto.getDescriptor();
      com.lunarclient.websocket.radio.v1.PushProto.getDescriptor();
   }
}
