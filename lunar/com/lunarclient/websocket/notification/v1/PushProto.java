package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_DisplayNotificationPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_DisplayNotificationPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_DisplayNotificationPush_descriptor, new String[]{"NotificationTitle", "NotificationMessage"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_DisplayChatMessagePush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_DisplayChatMessagePush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_DisplayChatMessagePush_descriptor, new String[]{"ChatMessage"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_NewNotificationPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_NewNotificationPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_NewNotificationPush_descriptor, new String[]{"Notification"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_RemoveNotificationPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_RemoveNotificationPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_RemoveNotificationPush_descriptor, new String[]{"Id"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private PushProto() {
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
         "\n0lunarclient/websocket/notification/v1/push.proto\u0012%lunarclient.websocket.notification.v1\u001a lunarclient/common/v1/uuid.proto\u001a2lunarclient/websocket/notification/v1/common.proto\"{\n\u0017DisplayNotificationPush\u0012-\n\u0012notification_title\u0018\u0001 \u0001(\tR\u0011notificationTitle\u00121\n\u0014notification_message\u0018\u0002 \u0001(\tR\u0013notificationMessage\";\n\u0016DisplayChatMessagePush\u0012!\n\fchat_message\u0018\u0001 \u0001(\tR\u000bchatMessage\"n\n\u0013NewNotificationPush\u0012W\n\fnotification\u0018\u0001 \u0001(\u000b23.lunarclient.websocket.notification.v1.NotificationR\fnotification\"E\n\u0016RemoveNotificationPush\u0012+\n\u0002id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0002idBí\u0001\n)com.lunarclient.websocket.notification.v1B\tPushProtoP\u0001¢\u0002\u0003LWNª\u0002%Lunarclient.Websocket.Notification.V1Ê\u0002%Lunarclient\\Websocket\\Notification\\V1â\u00021Lunarclient\\Websocket\\Notification\\V1\\GPBMetadataê\u0002(Lunarclient::Websocket::Notification::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{UuidProto.getDescriptor(), CommonProto.getDescriptor()}
      );
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
