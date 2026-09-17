package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface UseEmotePushOrBuilder extends MessageOrBuilder {
   boolean hasPlayerUuid();

   Uuid getPlayerUuid();

   UuidOrBuilder getPlayerUuidOrBuilder();

   int getEmoteId();

   int getEmoteMetadata();

   String getEmoteSoundtrackUrl();

   ByteString getEmoteSoundtrackUrlBytes();

   int getEmoteJamId();
}
