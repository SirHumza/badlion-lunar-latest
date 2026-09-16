package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface FriendRequestAcceptedPushOrBuilder extends MessageOrBuilder {
   @Deprecated
   boolean hasNewFriendUuid();

   @Deprecated
   Uuid getNewFriendUuid();

   @Deprecated
   UuidOrBuilder getNewFriendUuidOrBuilder();

   boolean hasNewFriend();

   UuidAndUsername getNewFriend();

   UuidAndUsernameOrBuilder getNewFriendOrBuilder();
}
