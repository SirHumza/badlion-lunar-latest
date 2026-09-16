package com.lunarclient.websocket.jam.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.GiftInfo;
import com.lunarclient.common.v1.GiftInfoOrBuilder;

public interface OwnedJamOrBuilder extends MessageOrBuilder {
   int getJamId();

   boolean hasGrantedAt();

   Timestamp getGrantedAt();

   TimestampOrBuilder getGrantedAtOrBuilder();

   boolean hasExpiresAt();

   Timestamp getExpiresAt();

   TimestampOrBuilder getExpiresAtOrBuilder();

   boolean hasGiftInfo();

   GiftInfo getGiftInfo();

   GiftInfoOrBuilder getGiftInfoOrBuilder();
}
