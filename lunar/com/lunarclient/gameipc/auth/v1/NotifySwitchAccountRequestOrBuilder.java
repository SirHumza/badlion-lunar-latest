package com.lunarclient.gameipc.auth.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface NotifySwitchAccountRequestOrBuilder extends MessageOrBuilder {
   boolean hasUuid();

   Uuid getUuid();

   UuidOrBuilder getUuidOrBuilder();
}
