package com.lunarclient.apollo.inventory.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.button.v1.ButtonUpdate;
import com.lunarclient.apollo.button.v1.ButtonUpdateOrBuilder;

public interface UpdateInventoryButtonMessageOrBuilder extends MessageOrBuilder {
   String getId();

   ByteString getIdBytes();

   boolean hasUpdate();

   ButtonUpdate getUpdate();

   ButtonUpdateOrBuilder getUpdateOrBuilder();
}
