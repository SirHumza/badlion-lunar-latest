package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;

public interface SetLastSeenVisibilityRequestOrBuilder extends MessageOrBuilder {
   int getVisibilityValue();

   LastSeenVisibility getVisibility();
}
