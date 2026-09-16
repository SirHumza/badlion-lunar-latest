package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.UuidProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_notification_v1_Notification_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_notification_v1_Notification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_notification_v1_Notification_descriptor, new String[]{"Id", "Title", "Type", "SentAt", "ReadAt", "Metadata"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private CommonProto() {
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
         "\n2lunarclient/websocket/notification/v1/common.proto\u0012%lunarclient.websocket.notification.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a lunarclient/common/v1/uuid.proto\"Ò\u0004\n\fNotification\u0012+\n\u0002id\u0018\u0001 \u0001(\u000b2\u001b.lunarclient.common.v1.UuidR\u0002id\u0012\u0014\n\u0005title\u0018\u0002 \u0001(\tR\u0005title\u0012X\n\u0004type\u0018\u0003 \u0001(\u000e2D.lunarclient.websocket.notification.v1.Notification.NotificationTypeR\u0004type\u00123\n\u0007sent_at\u0018\u0004 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0006sentAt\u00123\n\u0007read_at\u0018\u0005 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0006readAt\u0012\u001a\n\bmetadata\u0018\u0006 \u0001(\tR\bmetadata\"\u009e\u0002\n\u0010NotificationType\u0012!\n\u001dNOTIFICATION_TYPE_UNSPECIFIED\u0010\u0000\u0012\"\n\u001eNOTIFICATION_TYPE_ANNOUNCEMENT\u0010\u0001\u0012$\n NOTIFICATION_TYPE_FRIEND_REQUEST\u0010\u0002\u0012\u001e\n\u001aNOTIFICATION_TYPE_PURCHASE\u0010\u0003\u0012\u001a\n\u0016NOTIFICATION_TYPE_GIFT\u0010\u0004\u0012\u001d\n\u0019NOTIFICATION_TYPE_GENERAL\u0010\u0005\u0012!\n\u001dNOTIFICATION_TYPE_NOW_FRIENDS\u0010\u0006\u0012\u001f\n\u001bNOTIFICATION_TYPE_PROMOTION\u0010\u0007Bï\u0001\n)com.lunarclient.websocket.notification.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWNª\u0002%Lunarclient.Websocket.Notification.V1Ê\u0002%Lunarclient\\Websocket\\Notification\\V1â\u00021Lunarclient\\Websocket\\Notification\\V1\\GPBMetadataê\u0002(Lunarclient::Websocket::Notification::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), UuidProto.getDescriptor()}
      );
      TimestampProto.getDescriptor();
      UuidProto.getDescriptor();
   }
}
