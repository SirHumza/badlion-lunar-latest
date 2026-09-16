package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface AcceptFriendRequestRequestOrBuilder extends MessageOrBuilder {
   boolean hasSenderUuid();

   Uuid getSenderUuid();

   UuidOrBuilder getSenderUuidOrBuilder();
}
