package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface CreateConversationRequestOrBuilder extends MessageOrBuilder {
   int getTypeValue();

   ConversationType getType();

   List<Uuid> getParticipantUuidsList();

   Uuid getParticipantUuids(int var1);

   int getParticipantUuidsCount();

   List<? extends UuidOrBuilder> getParticipantUuidsOrBuilderList();

   UuidOrBuilder getParticipantUuidsOrBuilder(int var1);
}
