package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.MessageOrBuilder;
import com.lunarclient.common.v1.Uuid;
import com.lunarclient.common.v1.UuidOrBuilder;

public interface DeleteNotificationRequestOrBuilder extends MessageOrBuilder {
   boolean hasNotificationId();

   Uuid getNotificationId();

   UuidOrBuilder getNotificationIdOrBuilder();
}
