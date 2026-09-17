package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface SendFriendRequestRequestOrBuilder extends MessageOrBuilder {
   String getTargetUsername();

   ByteString getTargetUsernameBytes();
}
