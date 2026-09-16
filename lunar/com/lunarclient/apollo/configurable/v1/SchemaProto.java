package com.lunarclient.apollo.configurable.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.StructProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_descriptor = getDescriptor()
      .getMessageTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_descriptor,
      new String[]{"LunarClientMod", "ApolloModule", "Enable", "Properties", "Target"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_PropertiesEntry_descriptor = internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_descriptor.getNestedTypes()
      .get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_PropertiesEntry_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_configurable_v1_ConfigurableSettings_PropertiesEntry_descriptor, new String[]{"Key", "Value"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_configurable_v1_OverrideConfigurableSettingsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_configurable_v1_OverrideConfigurableSettingsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_configurable_v1_OverrideConfigurableSettingsMessage_descriptor, new String[]{"ConfigurableSettings"}
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
         "\n/lunarclient/apollo/configurable/v1/schema.proto\u0012\"lunarclient.apollo.configurable.v1\u001a\u001cgoogle/protobuf/struct.proto\"Ì\u0002\n\u0014ConfigurableSettings\u0012*\n\u0010lunar_client_mod\u0018\u0001 \u0001(\tH\u0000R\u000elunarClientMod\u0012%\n\rapollo_module\u0018\u0002 \u0001(\tH\u0000R\fapolloModule\u0012\u0016\n\u0006enable\u0018\u0003 \u0001(\bR\u0006enable\u0012h\n\nproperties\u0018\u0004 \u0003(\u000b2H.lunarclient.apollo.configurable.v1.ConfigurableSettings.PropertiesEntryR\nproperties\u001aU\n\u000fPropertiesEntry\u0012\u0010\n\u0003key\u0018\u0001 \u0001(\tR\u0003key\u0012,\n\u0005value\u0018\u0002 \u0001(\u000b2\u0016.google.protobuf.ValueR\u0005value:\u00028\u0001B\b\n\u0006target\"\u0094\u0001\n#OverrideConfigurableSettingsMessage\u0012m\n\u0015configurable_settings\u0018\u0001 \u0003(\u000b28.lunarclient.apollo.configurable.v1.ConfigurableSettingsR\u0014configurableSettingsBà\u0001\n&com.lunarclient.apollo.configurable.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LACª\u0002\"Lunarclient.Apollo.Configurable.V1Ê\u0002\"Lunarclient\\Apollo\\Configurable\\V1â\u0002.Lunarclient\\Apollo\\Configurable\\V1\\GPBMetadataê\u0002%Lunarclient::Apollo::Configurable::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{StructProto.getDescriptor()});
      StructProto.getDescriptor();
   }
}
