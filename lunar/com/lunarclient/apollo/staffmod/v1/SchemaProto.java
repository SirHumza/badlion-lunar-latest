package com.lunarclient.apollo.staffmod.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_staffmod_v1_EnableStaffModsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_staffmod_v1_EnableStaffModsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_staffmod_v1_EnableStaffModsMessage_descriptor, new String[]{"StaffMods", "EnabledByDefault"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_staffmod_v1_DisableStaffModsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_staffmod_v1_DisableStaffModsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_staffmod_v1_DisableStaffModsMessage_descriptor, new String[]{"StaffMods"}
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
         "\n+lunarclient/apollo/staffmod/v1/schema.proto\u0012\u001elunarclient.apollo.staffmod.v1\"\u008f\u0001\n\u0016EnableStaffModsMessage\u0012G\n\nstaff_mods\u0018\u0001 \u0003(\u000e2(.lunarclient.apollo.staffmod.v1.StaffModR\tstaffMods\u0012,\n\u0012enabled_by_default\u0018\u0002 \u0001(\bR\u0010enabledByDefault\"b\n\u0017DisableStaffModsMessage\u0012G\n\nstaff_mods\u0018\u0001 \u0003(\u000e2(.lunarclient.apollo.staffmod.v1.StaffModR\tstaffMods*9\n\bStaffMod\u0012\u0019\n\u0015STAFF_MOD_UNSPECIFIED\u0010\u0000\u0012\u0012\n\u000eSTAFF_MOD_XRAY\u0010\u0001BÌ\u0001\n\"com.lunarclient.apollo.staffmod.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LASª\u0002\u001eLunarclient.Apollo.Staffmod.V1Ê\u0002\u001eLunarclient\\Apollo\\Staffmod\\V1â\u0002*Lunarclient\\Apollo\\Staffmod\\V1\\GPBMetadataê\u0002!Lunarclient::Apollo::Staffmod::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[0]);
   }
}
