package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.UuidProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_OpenNotificationRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_OpenNotificationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_OpenNotificationRequest_descriptor, new String[]{"NotificationId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_OpenNotificationResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_OpenNotificationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_OpenNotificationResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_OpenAlertRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_OpenAlertRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_OpenAlertRequest_descriptor, new String[]{"AlertId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_OpenAlertResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_OpenAlertResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_OpenAlertResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_LoginResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_LoginResponse_descriptor, new String[]{"Notifications"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_DeleteNotificationRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(6);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_DeleteNotificationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_DeleteNotificationRequest_descriptor, new String[]{"NotificationId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_DeleteNotificationResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(7);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_DeleteNotificationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_DeleteNotificationResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(8);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(9);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_MarkAllNotificationsAsReadResponse_descriptor, new String[0]
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
         "\n3lunarclient/websocket/notification/v1/service.proto\u0012%lunarclient.websocket.notification.v1\u001a lunarclient/common/v1/uuid.proto\u001a2lunarclient/websocket/notification/v1/common.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\"_\n\u0017OpenNotificationRequest\u0012D\n\u000fnotification_id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u000enotificationId\"\u001a\n\u0018OpenNotificationResponse\"-\n\u0010OpenAlertRequest\u0012\u0019\n\balert_id\u0018\u0001 \u0001(\u0005R\u0007alertId\"\u0013\n\u0011OpenAlertResponse\"\u000e\n\fLoginRequest\"j\n\rLoginResponse\u0012Y\n\rnotifications\u0018\u0001 \u0003(\u000b23.lunarclient.websocket.notification.v1.NotificationR\rnotifications\"a\n\u0019DeleteNotificationRequest\u0012D\n\u000fnotification_id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u000enotificationId\"\u001c\n\u001aDeleteNotificationResponse\"#\n!MarkAllNotificationsAsReadRequest\"$\n\"MarkAllNotificationsAsReadResponse2\u008e\u0006\n\u0013NotificationService\u0012x\n\u0005Login\u00123.lunarclient.websocket.notification.v1.LoginRequest\u001a4.lunarclient.websocket.notification.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0099\u0001\n\u0010OpenNotification\u0012>.lunarclient.websocket.notification.v1.OpenNotificationRequest\u001a?.lunarclient.websocket.notification.v1.OpenNotificationResponse\"\u0004\u0088µ\u0018\u0003\u0012·\u0001\n\u001aMarkAllNotificationsAsRead\u0012H.lunarclient.websocket.notification.v1.MarkAllNotificationsAsReadRequest\u001aI.lunarclient.websocket.notification.v1.MarkAllNotificationsAsReadResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0084\u0001\n\tOpenAlert\u00127.lunarclient.websocket.notification.v1.OpenAlertRequest\u001a8.lunarclient.websocket.notification.v1.OpenAlertResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009f\u0001\n\u0012DeleteNotification\u0012@.lunarclient.websocket.notification.v1.DeleteNotificationRequest\u001aA.lunarclient.websocket.notification.v1.DeleteNotificationResponse\"\u0004\u0088µ\u0018\u0003Bó\u0001\n)com.lunarclient.websocket.notification.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWNª\u0002%Lunarclient.Websocket.Notification.V1Ê\u0002%Lunarclient\\Websocket\\Notification\\V1â\u00021Lunarclient\\Websocket\\Notification\\V1\\GPBMetadataê\u0002(Lunarclient::Websocket::Notification::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            UuidProto.getDescriptor(), CommonProto.getDescriptor(), com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      UuidProto.getDescriptor();
      CommonProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
   }
}
