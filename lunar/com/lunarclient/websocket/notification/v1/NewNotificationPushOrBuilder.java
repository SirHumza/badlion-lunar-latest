package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.MessageOrBuilder;

public interface NewNotificationPushOrBuilder extends MessageOrBuilder {
   boolean hasNotification();

   Notification getNotification();

   NotificationOrBuilder getNotificationOrBuilder();
}
