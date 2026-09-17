package com.lunarclient.websocket.emote.v1;

import com.google.protobuf.MessageOrBuilder;

public interface EquippedEmoteOrBuilder extends MessageOrBuilder {
   int getEmoteId();

   int getSlotNumber();

   int getAttachedJamId();
}
