package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;

public interface SystemMessageOrBuilder extends MessageOrBuilder {
   boolean hasActor();

   ConversationSender getActor();

   ConversationSenderOrBuilder getActorOrBuilder();

   boolean hasPinned();

   SystemPinnedMessageEvent getPinned();

   SystemPinnedMessageEventOrBuilder getPinnedOrBuilder();

   boolean hasInvite();

   SystemInviteEvent getInvite();

   SystemInviteEventOrBuilder getInviteOrBuilder();

   boolean hasLeave();

   SystemLeaveEvent getLeave();

   SystemLeaveEventOrBuilder getLeaveOrBuilder();

   boolean hasNameChange();

   SystemNameChangeEvent getNameChange();

   SystemNameChangeEventOrBuilder getNameChangeOrBuilder();

   boolean hasIconChange();

   SystemIconChangeEvent getIconChange();

   SystemIconChangeEventOrBuilder getIconChangeOrBuilder();

   SystemMessage.EventCase getEventCase();
}
