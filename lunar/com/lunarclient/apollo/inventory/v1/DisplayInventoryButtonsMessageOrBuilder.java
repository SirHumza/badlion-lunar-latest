package com.lunarclient.apollo.inventory.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface DisplayInventoryButtonsMessageOrBuilder extends MessageOrBuilder {
   List<InventoryButton> getInventoryButtonsList();

   InventoryButton getInventoryButtons(int var1);

   int getInventoryButtonsCount();

   List<? extends InventoryButtonOrBuilder> getInventoryButtonsOrBuilderList();

   InventoryButtonOrBuilder getInventoryButtonsOrBuilder(int var1);
}
