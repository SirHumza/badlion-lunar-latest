package com.lunarclient.gameipc.browser.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_browser_v1_OpenUrlRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_browser_v1_OpenUrlRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_browser_v1_OpenUrlRequest_descriptor, new String[]{"Url", "Initiator", "OpenType"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_gameipc_browser_v1_OpenUrlResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_gameipc_browser_v1_OpenUrlResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_gameipc_browser_v1_OpenUrlResponse_descriptor, new String[0]
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
         "\n,lunarclient/gameipc/browser/v1/service.proto\u0012\u001elunarclient.gameipc.browser.v1\"Ú\u0004\n\u000eOpenUrlRequest\u0012\u0010\n\u0003url\u0018\u0001 \u0001(\tR\u0003url\u0012V\n\tinitiator\u0018\u0002 \u0001(\u000e28.lunarclient.gameipc.browser.v1.OpenUrlRequest.InitiatorR\tinitiator\u0012T\n\topen_type\u0018\u0003 \u0001(\u000e27.lunarclient.gameipc.browser.v1.OpenUrlRequest.OpenTypeR\bopenType\"¤\u0002\n\tInitiator\u0012\u0019\n\u0015INITIATOR_UNSPECIFIED\u0010\u0000\u0012\u0017\n\u0013INITIATOR_COSMETICS\u0010\u0001\u0012\u0013\n\u000fINITIATOR_ALERT\u0010\u0002\u0012\u0012\n\u000eINITIATOR_AUTH\u0010\u0003\u0012\u0012\n\u000eINITIATOR_BLOG\u0010\u0004\u0012\u0019\n\u0015INITIATOR_SOCIAL_LINK\u0010\u0005\u0012\u0019\n\u0015INITIATOR_HOME_BUTTON\u0010\u0006\u0012\u001a\n\u0016INITIATOR_LINK_CONFIRM\u0010\u0007\u0012\u001f\n\u001bINITIATOR_SCREENSHOT_UPLOAD\u0010\b\u0012\u0016\n\u0012INITIATOR_HOME_CTA\u0010\t\u0012\u001b\n\u0017INITIATOR_STORE_PREVIEW\u0010\n\"a\n\bOpenType\u0012\u0019\n\u0015OPEN_TYPE_UNSPECIFIED\u0010\u0000\u0012\u001c\n\u0018OPEN_TYPE_FORCE_EMBEDDED\u0010\u0001\u0012\u001c\n\u0018OPEN_TYPE_FORCE_EXTERNAL\u0010\u0002\"\u0011\n\u000fOpenUrlResponse2|\n\u000eBrowserService\u0012j\n\u0007OpenUrl\u0012..lunarclient.gameipc.browser.v1.OpenUrlRequest\u001a/.lunarclient.gameipc.browser.v1.OpenUrlResponseBÐ\u0001\n\"com.lunarclient.gameipc.browser.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LGBª\u0002\u001eLunarclient.Gameipc.Browser.V1Ê\u0002\u001eLunarclient\\Gameipc\\Browser\\V1â\u0002*Lunarclient\\Gameipc\\Browser\\V1\\GPBMetadataê\u0002!Lunarclient::Gameipc::Browser::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
