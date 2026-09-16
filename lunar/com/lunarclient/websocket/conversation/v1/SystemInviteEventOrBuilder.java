package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.UuidAndUsername;
import com.lunarclient.common.v1.UuidAndUsernameOrBuilder;
import java.util.List;

public interface SystemInviteEventOrBuilder extends MessageOrBuilder {
   List<UuidAndUsername> getInviteesList();

   UuidAndUsername getInvitees(int var1);

   int getInviteesCount();

   List<? extends UuidAndUsernameOrBuilder> getInviteesOrBuilderList();

   UuidAndUsernameOrBuilder getInviteesOrBuilder(int var1);
}
