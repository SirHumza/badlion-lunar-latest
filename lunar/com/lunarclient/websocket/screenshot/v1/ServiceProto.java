package com.lunarclient.websocket.screenshot.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotRequest_descriptor, new String[]{"Screenshot"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_RecordScreenshotResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_LoginResponse_descriptor, new String[]{"DefaultUploadPrivacy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyRequest_descriptor, new String[]{"DefaultUploadPrivacy"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_screenshot_v1_SetDefaultUploadPrivacyResponse_descriptor, new String[0]
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
         "\n1lunarclient/websocket/screenshot/v1/service.proto\u0012#lunarclient.websocket.screenshot.v1\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a0lunarclient/websocket/screenshot/v1/common.proto\"q\n\u0017RecordScreenshotRequest\u0012V\n\nscreenshot\u0018\u0001 \u0001(\u000b26.lunarclient.websocket.screenshot.v1.ScreenshotMessageR\nscreenshot\"\u001a\n\u0018RecordScreenshotResponse\"\u000e\n\fLoginRequest\"}\n\rLoginResponse\u0012l\n\u0016default_upload_privacy\u0018\u0001 \u0001(\u000e26.lunarclient.websocket.screenshot.v1.ScreenshotPrivacyR\u0014defaultUploadPrivacy\"\u008e\u0001\n\u001eSetDefaultUploadPrivacyRequest\u0012l\n\u0016default_upload_privacy\u0018\u0001 \u0001(\u000e26.lunarclient.websocket.screenshot.v1.ScreenshotPrivacyR\u0014defaultUploadPrivacy\"!\n\u001fSetDefaultUploadPrivacyResponse2Î\u0003\n\u0011ScreenshotService\u0012t\n\u0005Login\u00121.lunarclient.websocket.screenshot.v1.LoginRequest\u001a2.lunarclient.websocket.screenshot.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0095\u0001\n\u0010RecordScreenshot\u0012<.lunarclient.websocket.screenshot.v1.RecordScreenshotRequest\u001a=.lunarclient.websocket.screenshot.v1.RecordScreenshotResponse\"\u0004\u0088µ\u0018\u0001\u0012ª\u0001\n\u0017SetDefaultUploadPrivacy\u0012C.lunarclient.websocket.screenshot.v1.SetDefaultUploadPrivacyRequest\u001aD.lunarclient.websocket.screenshot.v1.SetDefaultUploadPrivacyResponse\"\u0004\u0088µ\u0018\u0003Bé\u0001\n'com.lunarclient.websocket.screenshot.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWSª\u0002#Lunarclient.Websocket.Screenshot.V1Ê\u0002#Lunarclient\\Websocket\\Screenshot\\V1â\u0002/Lunarclient\\Websocket\\Screenshot\\V1\\GPBMetadataê\u0002&Lunarclient::Websocket::Screenshot::V1b\u0006proto3"
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
