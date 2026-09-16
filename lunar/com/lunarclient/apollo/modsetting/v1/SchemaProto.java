package com.lunarclient.apollo.modsetting.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_modsetting_v1_InstalledModsRequest_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_modsetting_v1_InstalledModsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_modsetting_v1_InstalledModsRequest_descriptor, new String[]{"RequestId"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_modsetting_v1_InstalledModsResponse_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_modsetting_v1_InstalledModsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_modsetting_v1_InstalledModsResponse_descriptor, new String[]{"RequestId", "Page", "TotalPages", "ModGroups"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_modsetting_v1_ModGroup_descriptor = getDescriptor().getMessageTypes().get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_modsetting_v1_ModGroup_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_modsetting_v1_ModGroup_descriptor, new String[]{"Type", "Mods"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_modsetting_v1_Mod_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_modsetting_v1_Mod_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_modsetting_v1_Mod_descriptor, new String[]{"Id", "Version"}
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
         "\n-lunarclient/apollo/modsetting/v1/schema.proto\u0012 lunarclient.apollo.modsetting.v1\"5\n\u0014InstalledModsRequest\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\"¶\u0001\n\u0015InstalledModsResponse\u0012\u001d\n\nrequest_id\u0018\u0001 \u0001(\fR\trequestId\u0012\u0012\n\u0004page\u0018\u0002 \u0001(\u0005R\u0004page\u0012\u001f\n\u000btotal_pages\u0018\u0003 \u0001(\u0005R\ntotalPages\u0012I\n\nmod_groups\u0018\u0004 \u0003(\u000b2*.lunarclient.apollo.modsetting.v1.ModGroupR\tmodGroups\"\u008f\u0002\n\bModGroup\u0012C\n\u0004type\u0018\u0001 \u0001(\u000e2/.lunarclient.apollo.modsetting.v1.ModGroup.TypeR\u0004type\u00129\n\u0004mods\u0018\u0002 \u0003(\u000b2%.lunarclient.apollo.modsetting.v1.ModR\u0004mods\"\u0082\u0001\n\u0004Type\u0012\u0014\n\u0010TYPE_UNSPECIFIED\u0010\u0000\u0012\u0018\n\u0014TYPE_FABRIC_INTERNAL\u0010\u0001\u0012\u0018\n\u0014TYPE_FABRIC_EXTERNAL\u0010\u0002\u0012\u0017\n\u0013TYPE_FORGE_INTERNAL\u0010\u0003\u0012\u0017\n\u0013TYPE_FORGE_EXTERNAL\u0010\u0004\"/\n\u0003Mod\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012\u0018\n\u0007version\u0018\u0002 \u0001(\tR\u0007versionBÖ\u0001\n$com.lunarclient.apollo.modsetting.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAMª\u0002 Lunarclient.Apollo.Modsetting.V1Ê\u0002 Lunarclient\\Apollo\\Modsetting\\V1â\u0002,Lunarclient\\Apollo\\Modsetting\\V1\\GPBMetadataê\u0002#Lunarclient::Apollo::Modsetting::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
