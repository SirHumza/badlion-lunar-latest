package com.lunarclient.apollo.cooldown.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface RemoveCooldownMessageOrBuilder extends MessageOrBuilder {
   String getName();

   ByteString getNameBytes();
}
