package com.lunarclient.apollo.inventory.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.button.v1.Button;
import com.lunarclient.apollo.button.v1.ButtonOrBuilder;

public interface InventoryButtonOrBuilder extends MessageOrBuilder {
   boolean hasButton();

   Button getButton();

   ButtonOrBuilder getButtonOrBuilder();

   int getInventoryTypeValue();

   InventoryType getInventoryType();

   int getBoxValue();

   InventoryButtonBox getBox();
}
