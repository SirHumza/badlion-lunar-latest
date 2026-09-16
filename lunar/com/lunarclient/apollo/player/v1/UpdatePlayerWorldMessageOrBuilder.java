package com.lunarclient.apollo.player.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface UpdatePlayerWorldMessageOrBuilder extends MessageOrBuilder {
   String getWorld();

   ByteString getWorldBytes();
}
