package com.lunarclient.websocket.analytics.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface RecordPinnedServerInteractionRequestOrBuilder extends MessageOrBuilder {
   String getServerIp();

   ByteString getServerIpBytes();

   int getInteractionTypeValue();

   RecordPinnedServerInteractionRequest.InteractionType getInteractionType();
}
