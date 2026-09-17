package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;

public interface SetCosmeticOwnershipVisibilityRequestOrBuilder extends MessageOrBuilder {
   int getVisibilityValue();

   CosmeticOwnershipVisibility getVisibility();
}
