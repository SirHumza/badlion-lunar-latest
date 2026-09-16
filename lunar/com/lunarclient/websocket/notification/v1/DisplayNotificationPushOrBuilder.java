package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageOrBuilder;

public interface DisplayNotificationPushOrBuilder extends MessageOrBuilder {
   String getNotificationTitle();

   ByteString getNotificationTitleBytes();

   String getNotificationMessage();

   ByteString getNotificationMessageBytes();
}
