package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.MessageOrBuilder;

public interface UseEmoteResponseOrBuilder extends MessageOrBuilder {
   int getStatusValue();

   UseEmoteResponse.Status getStatus();

   int getEmoteId();

   int getEmoteMetadata();
}
