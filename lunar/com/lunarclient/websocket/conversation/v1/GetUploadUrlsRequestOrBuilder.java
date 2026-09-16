package com.lunarclient.websocket.conversation.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface GetUploadUrlsRequestOrBuilder extends MessageOrBuilder {
   boolean hasConversationReference();

   ConversationReference getConversationReference();

   ConversationReferenceOrBuilder getConversationReferenceOrBuilder();

   int getUsageValue();

   UploadUsage getUsage();

   List<UploadRequestItem> getItemsList();

   UploadRequestItem getItems(int var1);

   int getItemsCount();

   List<? extends UploadRequestItemOrBuilder> getItemsOrBuilderList();

   UploadRequestItemOrBuilder getItemsOrBuilder(int var1);
}
