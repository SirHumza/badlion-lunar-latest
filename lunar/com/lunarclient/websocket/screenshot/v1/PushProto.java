package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class PushProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_RefreshScreenshotsPush_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_RefreshScreenshotsPush_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_RefreshScreenshotsPush_descriptor, new String[0]
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
         "\n.lunarclient/websocket/screenshot/v1/push.proto\u0012#lunarclient.websocket.screenshot.v1\"\u0018\n\u0016RefreshScreenshotsPushBã\u0001\n'com.lunarclient.websocket.screenshot.v1B\tPushProtoP\u0001¢\u0002\u0003LWSª\u0002#Lunarclient.Websocket.Screenshot.V1Ê\u0002#Lunarclient\\Websocket\\Screenshot\\V1â\u0002/Lunarclient\\Websocket\\Screenshot\\V1\\GPBMetadataê\u0002&Lunarclient::Websocket::Screenshot::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
