package com.lunarclient.websocket.badge.v1;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;

public interface OwnedBadgeOrBuilder extends MessageOrBuilder {
   int getBadgeId();

   boolean hasGrantedAt();

   Timestamp getGrantedAt();

   TimestampOrBuilder getGrantedAtOrBuilder();

   boolean hasExpiresAt();

   Timestamp getExpiresAt();

   TimestampOrBuilder getExpiresAtOrBuilder();

   int getExpirationReasonValue();

   OwnedBadge.ExpirationReason getExpirationReason();

   boolean getIsLunarPlus();
}
