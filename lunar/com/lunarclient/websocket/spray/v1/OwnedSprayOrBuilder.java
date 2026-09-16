package com.lunarclient.websocket.spray.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.GiftInfo;
import com.lunarclient.common.v1.GiftInfoOrBuilder;

public interface OwnedSprayOrBuilder extends MessageOrBuilder {
   int getSprayId();

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
