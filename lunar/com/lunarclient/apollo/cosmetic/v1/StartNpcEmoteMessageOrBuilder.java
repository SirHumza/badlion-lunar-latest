package com.lunarclient.apollo.cosmetic.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.apollo.common.v1.Uuid;
import com.lunarclient.apollo.common.v1.UuidOrBuilder;

public interface StartNpcEmoteMessageOrBuilder extends MessageOrBuilder {
   boolean hasNpcUuid();

   Uuid getNpcUuid();

   UuidOrBuilder getNpcUuidOrBuilder();

   boolean hasEmote();

   Emote getEmote();

   EmoteOrBuilder getEmoteOrBuilder();
}
