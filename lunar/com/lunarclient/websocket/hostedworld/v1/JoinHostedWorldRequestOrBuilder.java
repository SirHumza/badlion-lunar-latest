package com.lunarclient.websocket.hostedworld.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;
import java.util.List;

public interface JoinHostedWorldRequestOrBuilder extends MessageOrBuilder {
   boolean hasWorldHostUuid();

   Uuid getWorldHostUuid();

   UuidOrBuilder getWorldHostUuidOrBuilder();

   List<PingResponse> getPingResponsesList();

   PingResponse getPingResponses(int var1);

   int getPingResponsesCount();

   List<? extends PingResponseOrBuilder> getPingResponsesOrBuilderList();

   PingResponseOrBuilder getPingResponsesOrBuilder(int var1);

   int getSourceValue();

   JoinHostedWorldRequest.Source getSource();
}
