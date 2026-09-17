package com.lunarclient.apollo.common.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;

public final class IconProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_ItemStackIcon_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_ItemStackIcon_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_ItemStackIcon_descriptor,
      new String[]{"ItemId", "ItemName", "CustomModelData", "Profile", "CustomModelDataObject", "Potion", "Item"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationIcon_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationIcon_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_SimpleResourceLocationIcon_descriptor, new String[]{"ResourceLocation", "Size"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_AdvancedResourceLocationIcon_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_AdvancedResourceLocationIcon_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_AdvancedResourceLocationIcon_descriptor,
      new String[]{"ResourceLocation", "Width", "Height", "MinU", "MaxU", "MinV", "MaxV"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_ResourceLocationIcon_descriptor = getDescriptor().getMessageTypes().get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_ResourceLocationIcon_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_ResourceLocationIcon_descriptor, new String[]{"ResourceLocation"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_common_v1_Icon_descriptor = getDescriptor().getMessageTypes().get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_common_v1_Icon_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_common_v1_Icon_descriptor,
      new String[]{"ItemStack", "SimpleResourceLocation", "AdvancedResourceLocation", "ResourceLocation", "Contents"}
   );
   private static Descriptors.FileDescriptor descriptor;

   private IconProto() {
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
         "\n'lunarclient/apollo/common/v1/icon.proto\u0012\u001clunarclient.apollo.common.v1\u001a'lunarclient/apollo/common/v1/item.proto\u001a*lunarclient/apollo/common/v1/profile.proto\"Â\u0002\n\rItemStackIcon\u0012\u0019\n\u0007item_id\u0018\u0001 \u0001(\u0005H\u0000R\u0006itemId\u0012\u001d\n\titem_name\u0018\u0002 \u0001(\tH\u0000R\bitemName\u0012.\n\u0011custom_model_data\u0018\u0003 \u0001(\u0005B\u0002\u0018\u0001R\u000fcustomModelData\u0012?\n\u0007profile\u0018\u0004 \u0001(\u000b2%.lunarclient.apollo.common.v1.ProfileR\u0007profile\u0012f\n\u0018custom_model_data_object\u0018\u0005 \u0001(\u000b2-.lunarclient.apollo.common.v1.CustomModelDataR\u0015customModelDataObject\u0012\u0016\n\u0006potion\u0018\u0006 \u0001(\tR\u0006potionB\u0006\n\u0004item\"]\n\u001aSimpleResourceLocationIcon\u0012+\n\u0011resource_location\u0018\u0001 \u0001(\tR\u0010resourceLocation\u0012\u0012\n\u0004size\u0018\u0002 \u0001(\u0005R\u0004size\"Í\u0001\n\u001cAdvancedResourceLocationIcon\u0012+\n\u0011resource_location\u0018\u0001 \u0001(\tR\u0010resourceLocation\u0012\u0014\n\u0005width\u0018\u0002 \u0001(\u0002R\u0005width\u0012\u0016\n\u0006height\u0018\u0003 \u0001(\u0002R\u0006height\u0012\u0013\n\u0005min_u\u0018\u0004 \u0001(\u0002R\u0004minU\u0012\u0013\n\u0005max_u\u0018\u0005 \u0001(\u0002R\u0004maxU\u0012\u0013\n\u0005min_v\u0018\u0006 \u0001(\u0002R\u0004minV\u0012\u0013\n\u0005max_v\u0018\u0007 \u0001(\u0002R\u0004maxV\"C\n\u0014ResourceLocationIcon\u0012+\n\u0011resource_location\u0018\u0001 \u0001(\tR\u0010resourceLocation\"µ\u0003\n\u0004Icon\u0012L\n\nitem_stack\u0018\u0001 \u0001(\u000b2+.lunarclient.apollo.common.v1.ItemStackIconH\u0000R\titemStack\u0012t\n\u0018simple_resource_location\u0018\u0002 \u0001(\u000b28.lunarclient.apollo.common.v1.SimpleResourceLocationIconH\u0000R\u0016simpleResourceLocation\u0012z\n\u001aadvanced_resource_location\u0018\u0003 \u0001(\u000b2:.lunarclient.apollo.common.v1.AdvancedResourceLocationIconH\u0000R\u0018advancedResourceLocation\u0012a\n\u0011resource_location\u0018\u0004 \u0001(\u000b22.lunarclient.apollo.common.v1.ResourceLocationIconH\u0000R\u0010resourceLocationB\n\n\bcontentsBÀ\u0001\n com.lunarclient.apollo.common.v1B\tIconProtoP\u0001¢\u0002\u0003LACª\u0002\u001cLunarclient.Apollo.Common.V1Ê\u0002\u001cLunarclient\\Apollo\\Common\\V1â\u0002(Lunarclient\\Apollo\\Common\\V1\\GPBMetadataê\u0002\u001fLunarclient::Apollo::Common::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
         var0, new Descriptors.FileDescriptor[]{ItemProto.getDescriptor(), ProfileProto.getDescriptor()}
      );
      ItemProto.getDescriptor();
      ProfileProto.getDescriptor();
   }
}
