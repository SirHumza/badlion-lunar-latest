package com.lunarclient.apollo.notification.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.DurationProto;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.IconProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_notification_v1_DisplayNotificationMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_notification_v1_DisplayNotificationMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_notification_v1_DisplayNotificationMessage_descriptor,
      new String[]{"Title", "Description", "ResourceLocation", "DisplayTime", "TitleAdventureJsonLines", "DescriptionAdventureJsonLines", "Icon"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_notification_v1_ResetNotificationsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_notification_v1_ResetNotificationsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_notification_v1_ResetNotificationsMessage_descriptor, new String[0]
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
         "\n/lunarclient/apollo/notification/v1/schema.proto\u0012\"lunarclient.apollo.notification.v1\u001a\u001egoogle/protobuf/duration.proto\u001a'lunarclient/apollo/common/v1/icon.proto\"\u0089\u0003\n\u001aDisplayNotificationMessage\u0012\u0018\n\u0005title\u0018\u0001 \u0001(\tB\u0002\u0018\u0001R\u0005title\u0012$\n\u000bdescription\u0018\u0002 \u0001(\tB\u0002\u0018\u0001R\u000bdescription\u0012/\n\u0011resource_location\u0018\u0003 \u0001(\tB\u0002\u0018\u0001R\u0010resourceLocation\u0012<\n\fdisplay_time\u0018\u0004 \u0001(\u000b2\u0019.google.protobuf.DurationR\u000bdisplayTime\u0012;\n\u001atitle_adventure_json_lines\u0018\u0005 \u0001(\tR\u0017titleAdventureJsonLines\u0012G\n description_adventure_json_lines\u0018\u0006 \u0001(\tR\u001ddescriptionAdventureJsonLines\u00126\n\u0004icon\u0018\u0007 \u0001(\u000b2\".lunarclient.apollo.common.v1.IconR\u0004icon\"\u001b\n\u0019ResetNotificationsMessageBà\u0001\n&com.lunarclient.apollo.notification.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LANª\u0002\"Lunarclient.Apollo.Notification.V1Ê\u0002\"Lunarclient\\Apollo\\Notification\\V1â\u0002.Lunarclient\\Apollo\\Notification\\V1\\GPBMetadataê\u0002%Lunarclient::Apollo::Notification::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{DurationProto.getDescriptor(), IconProto.getDescriptor()}
      );
      DurationProto.getDescriptor();
      IconProto.getDescriptor();
   }
}
