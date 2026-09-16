package com.lunarclient.websocket.notification.v1;

import com.google.protobuf.MessageOrBuilder;
import java.util.List;

public interface LoginResponseOrBuilder extends MessageOrBuilder {
   List<Notification> getNotificationsList();

   Notification getNotifications(int var1);

   int getNotificationsCount();

   List<? extends NotificationOrBuilder> getNotificationsOrBuilderList();

   NotificationOrBuilder getNotificationsOrBuilder(int var1);
}
