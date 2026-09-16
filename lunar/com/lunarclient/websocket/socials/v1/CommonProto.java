package com.lunarclient.websocket.socials.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.TimestampProto;
import com.lunarclient.common.v1.SocialProto;

public final class CommonProto {
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_socials_v1_LinkedSocialCommunity_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_socials_v1_LinkedSocialCommunity_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_socials_v1_LinkedSocialCommunity_descriptor, new String[]{"IsMember", "JoinedAt", "LeftAt", "HasFlair"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_websocket_socials_v1_LinkedSocial_descriptor = getDescriptor().getMessageTypes().get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_websocket_socials_v1_LinkedSocial_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_websocket_socials_v1_LinkedSocial_descriptor, new String[]{"Social", "LinkedAt", "Community"}
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
         "\n-lunarclient/websocket/socials/v1/common.proto\u0012 lunarclient.websocket.socials.v1\u001a\u001fgoogle/protobuf/timestamp.proto\u001a\"lunarclient/common/v1/social.proto\"¿\u0001\n\u0015LinkedSocialCommunity\u0012\u001b\n\tis_member\u0018\u0001 \u0001(\bR\bisMember\u00127\n\tjoined_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\bjoinedAt\u00123\n\u0007left_at\u0018\u0003 \u0001(\u000b2\u001a.google.protobuf.TimestampR\u0006leftAt\u0012\u001b\n\thas_flair\u0018\u0004 \u0001(\bR\bhasFlair\"Ù\u0001\n\fLinkedSocial\u00129\n\u0006social\u0018\u0001 \u0001(\u000b2!.lunarclient.common.v1.UserSocialR\u0006social\u00127\n\tlinked_at\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.TimestampR\blinkedAt\u0012U\n\tcommunity\u0018\u0003 \u0001(\u000b27.lunarclient.websocket.socials.v1.LinkedSocialCommunityR\tcommunity*\u0096\u0001\n\u0011SocialsVisibility\u0012\"\n\u001eSOCIALS_VISIBILITY_UNSPECIFIED\u0010\u0000\u0012\u001e\n\u001aSOCIALS_VISIBILITY_FRIENDS\u0010\u0001\u0012\u001c\n\u0018SOCIALS_VISIBILITY_NOONE\u0010\u0002\u0012\u001f\n\u001bSOCIALS_VISIBILITY_EVERYONE\u0010\u0003BÖ\u0001\n$com.lunarclient.websocket.socials.v1B\u000bCommonProtoP\u0001¢\u0002\u0003LWSª\u0002 Lunarclient.Websocket.Socials.V1Ê\u0002 Lunarclient\\Websocket\\Socials\\V1â\u0002,Lunarclient\\Websocket\\Socials\\V1\\GPBMetadataê\u0002#Lunarclient::Websocket::Socials::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{TimestampProto.getDescriptor(), SocialProto.getDescriptor()}
      );
      TimestampProto.getDescriptor();
      SocialProto.getDescriptor();
   }
}
