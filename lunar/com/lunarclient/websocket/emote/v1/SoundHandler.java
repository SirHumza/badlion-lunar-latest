package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface UseEmoteRequestOrBuilder extends MessageOrBuilder {
   int getEmoteId();

   int getEmoteMetadata();

   String getEmoteSoundtrackUrl();

   ByteString getEmoteSoundtrackUrlBytes();

   int getEmoteJamId();
}
