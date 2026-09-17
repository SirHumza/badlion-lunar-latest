package com.lunarclient.websocket.cosmetic.v2;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.GiftInfo;
import com.lunarclient.common.v1.GiftInfoOrBuilder;

public interface OwnedCosmeticOrBuilder extends MessageOrBuilder {
   int getCosmeticId();

   boolean hasGrantedAt();

   Timestamp getGrantedAt();

   TimestampOrBuilder getGrantedAtOrBuilder();

   boolean hasExpiresAt();

   Timestamp getExpiresAt();

   TimestampOrBuilder getExpiresAtOrBuilder();

   int getExpirationReasonValue();

   OwnedCosmetic.ExpirationReason getExpirationReason();

   boolean hasGiftInfo();

   GiftInfo getGiftInfo();

   GiftInfoOrBuilder getGiftInfoOrBuilder();
}
