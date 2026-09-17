package com.lunarclient.apollo.inventory.v1;

import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.lunarclient.apollo.button.v1.ButtonProto;

public final class SchemaProto {
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_inventory_v1_InventoryButton_descriptor = getDescriptor().getMessageTypes().get(0);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_inventory_v1_InventoryButton_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_inventory_v1_InventoryButton_descriptor, new String[]{"Button", "InventoryType", "Box"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_inventory_v1_DisplayInventoryButtonsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(1);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_inventory_v1_DisplayInventoryButtonsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_inventory_v1_DisplayInventoryButtonsMessage_descriptor, new String[]{"InventoryButtons"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_inventory_v1_RemoveInventoryButtonMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(2);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_inventory_v1_RemoveInventoryButtonMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_inventory_v1_RemoveInventoryButtonMessage_descriptor, new String[]{"Id"}
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_inventory_v1_ResetInventoryButtonsMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(3);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_inventory_v1_ResetInventoryButtonsMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_inventory_v1_ResetInventoryButtonsMessage_descriptor, new String[0]
   );
   static final Descriptors.Descriptor internal_static_lunarclient_apollo_inventory_v1_UpdateInventoryButtonMessage_descriptor = getDescriptor()
      .getMessageTypes()
      .get(4);
   static final GeneratedMessageV3.FieldAccessorTable internal_static_lunarclient_apollo_inventory_v1_UpdateInventoryButtonMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(
      internal_static_lunarclient_apollo_inventory_v1_UpdateInventoryButtonMessage_descriptor, new String[]{"Id", "Update"}
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
         "\n,lunarclient/apollo/inventory/v1/schema.proto\u0012\u001flunarclient.apollo.inventory.v1\u001a)lunarclient/apollo/button/v1/button.proto\"í\u0001\n\u000fInventoryButton\u0012<\n\u0006button\u0018\u0001 \u0001(\u000b2$.lunarclient.apollo.button.v1.ButtonR\u0006button\u0012U\n\u000einventory_type\u0018\u0002 \u0001(\u000e2..lunarclient.apollo.inventory.v1.InventoryTypeR\rinventoryType\u0012E\n\u0003box\u0018\u0003 \u0001(\u000e23.lunarclient.apollo.inventory.v1.InventoryButtonBoxR\u0003box\"\u007f\n\u001eDisplayInventoryButtonsMessage\u0012]\n\u0011inventory_buttons\u0018\u0001 \u0003(\u000b20.lunarclient.apollo.inventory.v1.InventoryButtonR\u0010inventoryButtons\".\n\u001cRemoveInventoryButtonMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\"\u001e\n\u001cResetInventoryButtonsMessage\"r\n\u001cUpdateInventoryButtonMessage\u0012\u000e\n\u0002id\u0018\u0001 \u0001(\tR\u0002id\u0012B\n\u0006update\u0018\u0002 \u0001(\u000b2*.lunarclient.apollo.button.v1.ButtonUpdateR\u0006update*y\n\u0012InventoryButtonBox\u0012$\n INVENTORY_BUTTON_BOX_UNSPECIFIED\u0010\u0000\u0012\u001d\n\u0019INVENTORY_BUTTON_BOX_LEFT\u0010\u0001\u0012\u001e\n\u001aINVENTORY_BUTTON_BOX_RIGHT\u0010\u0002*J\n\rInventoryType\u0012\u001e\n\u001aINVENTORY_TYPE_UNSPECIFIED\u0010\u0000\u0012\u0019\n\u0015INVENTORY_TYPE_PLAYER\u0010\u0001BÑ\u0001\n#com.lunarclient.apollo.inventory.v1B\u000bSchemaProtoP\u0001¢\u0002\u0003LAIª\u0002\u001fLunarclient.Apollo.Inventory.V1Ê\u0002\u001fLunarclient\\Apollo\\Inventory\\V1â\u0002+Lunarclient\\Apollo\\Inventory\\V1\\GPBMetadataê\u0002\"Lunarclient::Apollo::Inventory::V1b\u0006proto3"
      };
      descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(var0, new Descriptors.FileDescriptor[]{ButtonProto.getDescriptor()});
      ButtonProto.getDescriptor();
   }
}
