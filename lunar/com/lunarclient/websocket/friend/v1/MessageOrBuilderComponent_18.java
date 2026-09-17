package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;

public interface AcceptFriendRequestResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   AcceptFriendRequestResponse.Status getStatus();

   boolean hasOfflineFriend();

   OfflineFriend getOfflineFriend();

   OfflineFriendOrBuilder getOfflineFriendOrBuilder();
}
