package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Timestamp;
import com.google.protobuf.TimestampOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface NotificationOrBuilder extends MessageOrBuilder {
   boolean hasId();

   Uuid getId();

   UuidOrBuilder getIdOrBuilder();

   String getTitle();

   ByteString getTitleBytes();

   int getTypeValue();

   Notification.NotificationType getType();

   boolean hasSentAt();

   Timestamp getSentAt();

   TimestampOrBuilder getSentAtOrBuilder();

   boolean hasReadAt();

   Timestamp getReadAt();

   TimestampOrBuilder getReadAtOrBuilder();

   String getMetadata();

   ByteString getMetadataBytes();
}
