package com.lunarclient.websocket.friend.v1;

import com.google.protobuf.MessageOrBuilder;

public interface SetGroupChatInvitePrivacyRequestOrBuilder extends MessageOrBuilder {
   int getPrivacyValue();

   GroupChatInvitePrivacy getPrivacy();
}
