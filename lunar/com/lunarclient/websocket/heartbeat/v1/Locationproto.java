package com.lunarclient.websocket.heartbeat.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.LocationProto;
import com.lunarclient.common.v1.ModpackProto;
import com.lunarclient.common.v1.VersionProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_OnlineCounts_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_OnlineCounts_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_OnlineCounts_descriptor, new String[]{"Launcher", "Game"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_RunningInstanceLoader_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_RunningInstanceLoader_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_RunningInstanceLoader_descriptor, new String[]{"Loader", "LoaderVersion", "LoaderVersionRecommended"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_RunningInstance_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_RunningInstance_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_RunningInstance_descriptor,
      new String[]{"LaunchId", "MinecraftVersion", "Module", "Modpack", "Location", "Loader"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_RendererPosition_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_RendererPosition_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_RendererPosition_descriptor,
      new String[]{"PositionX", "PositionY", "Width", "Height", "DisplayId", "PrimaryDisplay", "DisplayWidth", "DisplayHeight", "DisplayType"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_heartbeat_v1_OpenRenderer_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_heartbeat_v1_OpenRenderer_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_heartbeat_v1_OpenRenderer_descriptor,
      new String[]{"Id", "Route", "Title", "Focused", "Visible", "Fullscreened", "Minimized", "Position", "ContentType"}
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
         "\n/lunarclient/websocket/heartbeat/v1/common.proto\u0012\"lunarclient.websocket.heartbeat.v1\u001a#lunarclient/common/v1/modpack.proto\u001a#lunarclient/common/v1/version.proto\u001a$lunarclient/common/v1/location.proto\">\n\fOnlineCounts\u0012\u001a\n\blauncher\u0018\u0001 \u0001(\u0005R\blauncher\u0012\u0012\n\u0004game\u0018\u0002 \u0001(\u0005R\u0004game\"\u0094\u0001\n\u0015RunningInstanceLoader\u0012\u0016\n\u0006loader\u0018\u0001 \u0001(\tR\u0006loader\u0012%\n\u000eloader_version\u0018\u0002 \u0001(\tR\rloaderVersion\u0012<\n\u001aloader_version_recommended\u0018\u0003 \u0001(\bR\u0018loaderVersionRecommended\"ì\u0002\n\u000fRunningInstance\u0012\u001b\n\tlaunch_id\u0018\u0001 \u0001(\tR\blaunchId\u0012T\n\u0011minecraft_version\u0018\u0002 \u0001(\u000b2'.lunarclient.common.v1.MinecraftVersionR\u0010minecraftVersion\u0012\u0016\n\u0006module\u0018\u0003 \u0001(\tR\u0006module\u0012>\n\u0007modpack\u0018\u0004 \u0001(\u000b2$.lunarclient.common.v1.PlayerModpackR\u0007modpack\u0012;\n\blocation\u0018\u0005 \u0001(\u000b2\u001f.lunarclient.common.v1.LocationR\blocation\u0012Q\n\u0006loader\u0018\u0006 \u0001(\u000b29.lunarclient.websocket.heartbeat.v1.RunningInstanceLoaderR\u0006loader\"Ó\u0003\n\u0010RendererPosition\u0012\u001d\n\nposition_x\u0018\u0001 \u0001(\u0005R\tpositionX\u0012\u001d\n\nposition_y\u0018\u0002 \u0001(\u0005R\tpositionY\u0012\u0014\n\u0005width\u0018\u0003 \u0001(\u0005R\u0005width\u0012\u0016\n\u0006height\u0018\u0004 \u0001(\u0005R\u0006height\u0012\u001d\n\ndisplay_id\u0018\u0005 \u0001(\u0005R\tdisplayId\u0012'\n\u000fprimary_display\u0018\u0006 \u0001(\bR\u000eprimaryDisplay\u0012#\n\rdisplay_width\u0018\u0007 \u0001(\u0005R\fdisplayWidth\u0012%\n\u000edisplay_height\u0018\b \u0001(\u0005R\rdisplayHeight\u0012c\n\fdisplay_type\u0018\t \u0001(\u000e2@.lunarclient.websocket.heartbeat.v1.RendererPosition.DisplayTypeR\u000bdisplayType\"Z\n\u000bDisplayType\u0012\u001c\n\u0018DISPLAY_TYPE_UNSPECIFIED\u0010\u0000\u0012\u0017\n\u0013DISPLAY_TYPE_NATIVE\u0010\u0001\u0012\u0014\n\u0010DISPLAY_TYPE_OSR\u0010\u0002\"¦\u0005\n\fOpenRenderer\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0014\n\u0005route\u0018\u0002 \u0001(\tR\u0005route\u0012\u0014\n\u0005title\u0018\u0003 \u0001(\tR\u0005title\u0012\u0018\n\u0007focused\u0018\u0004 \u0001(\bR\u0007focused\u0012\u0018\n\u0007visible\u0018\u0005 \u0001(\bR\u0007visible\u0012\"\n\ffullscreened\u0018\u0006 \u0001(\bR\ffullscreened\u0012\u001c\n\tminimized\u0018\u0007 \u0001(\bR\tminimized\u0012P\n\bposition\u0018\b \u0001(\u000b24.lunarclient.websocket.heartbeat.v1.RendererPositionR\bposition\u0012_\n\fcontent_type\u0018\t \u0001(\u000e2<.lunarclient.websocket.heartbeat.v1.OpenRenderer.ContentTypeR\u000bcontentType\"°\u0002\n\u000bContentType\u0012\u001c\n\u0018CONTENT_TYPE_UNSPECIFIED\u0010\u0000\u0012\u0015\n\u0011CONTENT_TYPE_MAIN\u0010\u0001\u0012 \n\u001cCONTENT_TYPE_MISSION_CONTROL\u0010\u0002\u0012\u0015\n\u0011CONTENT_TYPE_CHAT\u0010\u0003\u0012\u0018\n\u0014CONTENT_TYPE_FRIENDS\u0010\u0004\u0012\u001a\n\u0016CONTENT_TYPE_SATELLITE\u0010\u0005\u0012!\n\u001dCONTENT_TYPE_EMBEDDED_BROWSER\u0010\u0006\u0012\u0018\n\u0014CONTENT_TYPE_UPDATER\u0010\u0007\u0012%\n!CONTENT_TYPE_VISUALISE_RESOLUTION\u0010\b\u0012\u0019\n\u0015CONTENT_TYPE_CHECKOUT\u0010\tBà\u0001\n&com.lunarclient.websocket.heartbeat.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWHª\u0002\"Lunarclient.Websocket.Heartbeat.V1Ê\u0002\"Lunarclient\\Websocket\\Heartbeat\\V1â\u0002.Lunarclient\\Websocket\\Heartbeat\\V1\\GPBMetadataê\u0002%Lunarclient::Websocket::Heartbeat::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ModpackProto.getDescriptor(), VersionProto.getDescriptor(), LocationProto.getDescriptor()}
      );
      ModpackProto.getDescriptor();
      VersionProto.getDescriptor();
      LocationProto.getDescriptor();
   }
}
