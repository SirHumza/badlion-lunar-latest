package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.common.v1.SocialProto;

public final class ServiceProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_socials_v1_LoginRequest_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_socials_v1_LoginRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_socials_v1_LoginRequest_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_socials_v1_LoginResponse_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_socials_v1_LoginResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_socials_v1_LoginResponse_descriptor, new String[]{"LinkedSocials", "SocialsVisibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_socials_v1_SetSocialsVisibilityRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_socials_v1_SetSocialsVisibilityRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_socials_v1_SetSocialsVisibilityRequest_descriptor, new String[]{"Visibility"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_socials_v1_SetSocialsVisibilityResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_socials_v1_SetSocialsVisibilityResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_socials_v1_SetSocialsVisibilityResponse_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_socials_v1_UnlinkSocialRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_socials_v1_UnlinkSocialRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_socials_v1_UnlinkSocialRequest_descriptor, new String[]{"Platform"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_socials_v1_UnlinkSocialResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_socials_v1_UnlinkSocialResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_socials_v1_UnlinkSocialResponse_descriptor, new String[]{"Status", "Platform"}
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
         "\n.lunarclient/websocket/socials/v1/service.proto\u0012 lunarclient.websocket.socials.v1\u001a\"lunarclient/common/v1/social.proto\u001a.lunarclient/websocket/protocol/v1/common.proto\u001a-lunarclient/websocket/socials/v1/common.proto\"\u000e\n\fLoginRequest\"Ê\u0001\n\rLoginResponse\u0012U\n\u000elinked_socials\u0018\u0001 \u0003(\u000b2..lunarclient.websocket.socials.v1.LinkedSocialR\rlinkedSocials\u0012b\n\u0012socials_visibility\u0018\u0002 \u0001(\u000e23.lunarclient.websocket.socials.v1.SocialsVisibilityR\u0011socialsVisibility\"r\n\u001bSetSocialsVisibilityRequest\u0012S\n\nvisibility\u0018\u0001 \u0001(\u000e23.lunarclient.websocket.socials.v1.SocialsVisibilityR\nvisibility\"\u001e\n\u001cSetSocialsVisibilityResponse\"\\\n\u0013UnlinkSocialRequest\u0012E\n\bplatform\u0018\u0001 \u0001(\u000e2).lunarclient.common.v1.UserSocialPlatformR\bplatform\"\u0083\u0002\n\u0014UnlinkSocialResponse\u0012U\n\u0006status\u0018\u0001 \u0001(\u000e2=.lunarclient.websocket.socials.v1.UnlinkSocialResponse.StatusR\u0006status\u0012E\n\bplatform\u0018\u0002 \u0001(\u000e2).lunarclient.common.v1.UserSocialPlatformR\bplatform\"M\n\u0006Status\u0012\u0016\n\u0012STATUS_UNSPECIFIED\u0010\u0000\u0012\r\n\tSTATUS_OK\u0010\u0001\u0012\u001c\n\u0018STATUS_TARGET_NOT_LINKED\u0010\u00022¤\u0003\n\u000eSocialsService\u0012n\n\u0005Login\u0012..lunarclient.websocket.socials.v1.LoginRequest\u001a/.lunarclient.websocket.socials.v1.LoginResponse\"\u0004\u0088µ\u0018\u0003\u0012\u0083\u0001\n\fUnlinkSocial\u00125.lunarclient.websocket.socials.v1.UnlinkSocialRequest\u001a6.lunarclient.websocket.socials.v1.UnlinkSocialResponse\"\u0004\u0088µ\u0018\u0003\u0012\u009b\u0001\n\u0014SetSocialsVisibility\u0012=.lunarclient.websocket.socials.v1.SetSocialsVisibilityRequest\u001a>.lunarclient.websocket.socials.v1.SetSocialsVisibilityResponse\"\u0004\u0088µ\u0018\u0003BÚ\u0001\n$com.lunarclient.websocket.socials.v1B\fServiceProtoP\u0001\u0088\u0001\u0001¢\u0002\u0003LWSª\u0002 Lunarclient.Websocket.Socials.V1Ê\u0002 Lunarclient\\Websocket\\Socials\\V1â\u0002,Lunarclient\\Websocket\\Socials\\V1\\GPBMetadataê\u0002#Lunarclient::Websocket::Socials::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0,
         new Descriptors.FileDescriptor[]{
            SocialProto.getDescriptor(), com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor(), CommonProto.getDescriptor()
         }
      );
      ExtensionRegistry var1 = ExtensionRegistry.newInstance();
      var1.add(com.lunarclient.websocket.protocol.v1.CommonProto.allowedSender);
      Descriptors.FileDescriptor.internalUpdateFileDescriptor(descriptor, var1);
      SocialProto.getDescriptor();
      com.lunarclient.websocket.protocol.v1.CommonProto.getDescriptor();
      CommonProto.getDescriptor();
   }
}
