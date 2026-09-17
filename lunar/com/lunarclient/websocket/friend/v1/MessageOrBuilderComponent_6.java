package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;

public interface FriendStatusPushOrBuilder extends MessageOrBuilder {
   boolean hasOnlineFriend();

   OnlineFriend getOnlineFriend();

   OnlineFriendOrBuilder getOnlineFriendOrBuilder();

   boolean hasOfflineFriend();

   OfflineFriend getOfflineFriend();

   OfflineFriendOrBuilder getOfflineFriendOrBuilder();

   FriendStatusPush.FriendCase getFriendCase();
}
