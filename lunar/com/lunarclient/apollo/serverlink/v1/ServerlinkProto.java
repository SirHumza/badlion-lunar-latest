package com.lunarclient.apollo.serverlink.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.common.v1.IconProto;

public final class ServerlinkProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_serverlink_v1_OverrideServerLinkResourceMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_serverlink_v1_OverrideServerLinkResourceMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_serverlink_v1_OverrideServerLinkResourceMessage_descriptor, new String[]{"Icon"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinkResourceMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinkResourceMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinkResourceMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_serverlink_v1_AddServerLinkMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_serverlink_v1_AddServerLinkMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_serverlink_v1_AddServerLinkMessage_descriptor, new String[]{"ServerLinks"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_serverlink_v1_RemoveServerLinkMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_serverlink_v1_RemoveServerLinkMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_serverlink_v1_RemoveServerLinkMessage_descriptor, new String[]{"ServerLinkIds"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinksMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinksMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_serverlink_v1_ResetServerLinksMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_serverlink_v1_ServerLink_descriptor = getDescriptor().getMessageTypes().get(5);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_serverlink_v1_ServerLink_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_serverlink_v1_ServerLink_descriptor, new String[]{"Id", "DisplayNameAdventureJsonLines", "Url"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private ServerlinkProto() {
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
         "\n1lunarclient/apollo/serverlink/v1/serverlink.proto\u0012 lunarclient.apollo.serverlink.v1\u001a'lunarclient/apollo/common/v1/icon.proto\"k\n!OverrideServerLinkResourceMessage\u0012F\n\u0004icon\u0018\u0001 \u0001(\u000b22.lunarclient.apollo.common.v1.ResourceLocationIconR\u0004icon\" \n\u001eResetServerLinkResourceMessage\"g\n\u0014AddServerLinkMessage\u0012O\n\fserver_links\u0018\u0001 \u0003(\u000b2,.lunarclient.apollo.serverlink.v1.ServerLinkR\u000bserverLinks\"A\n\u0017RemoveServerLinkMessage\u0012&\n\u000fserver_link_ids\u0018\u0001 \u0003(\tR\rserverLinkIds\"\u0019\n\u0017ResetServerLinksMessage\"x\n\nServerLink\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012H\n!display_name_adventure_json_lines\u0018\u0002 \u0001(\tR\u001ddisplayNameAdventureJsonLines\u0012\u0010\n\u0003url\u0018\u0003 \u0001(\tR\u0003urlBÚ\u0001\n$com.lunarclient.apollo.serverlink.v1B\u000fServerlinkProtoP\u0001¢\u0002\u0003LASª\u0002 Lunarclient.Apollo.Serverlink.V1Ê\u0002 Lunarclient\\Apollo\\Serverlink\\V1â\u0002,Lunarclient\\Apollo\\Serverlink\\V1\\GPBMetadataê\u0002#Lunarclient::Apollo::Serverlink::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{IconProto.getDescriptor()});
      IconProto.getDescriptor();
   }
}
