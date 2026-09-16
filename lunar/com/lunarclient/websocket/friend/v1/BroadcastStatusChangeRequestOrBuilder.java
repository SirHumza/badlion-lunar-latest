package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;

public interface BroadcastStatusChangeRequestOrBuilder extends MessageOrBuilder {
   int getNewStatusValue();

   OnlineFriendStatus getNewStatus();
}
