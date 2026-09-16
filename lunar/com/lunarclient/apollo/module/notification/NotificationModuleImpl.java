package com.lunarclient.apollo.module.notification;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.notification.v1.DisplayNotificationMessage;
import com.lunarclient.apollo.notification.v1.ResetNotificationsMessage;
import com.lunarclient.apollo.recipients.Recipients;
import com.moonsworth.lunar.lib.adventure.text.Component;
import lombok.NonNull;

public final class NotificationModuleImpl extends NotificationModule {
   @Override
   public void displayNotification(@NonNull Recipients var1, @NonNull Notification var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("notification is marked non-null but is null");
      }

      DisplayNotificationMessage.Builder var3 = DisplayNotificationMessage.newBuilder().setDisplayTime(NetworkTypes.toProtobuf(var2.getDisplayTime()));
      String var4 = var2.getTitle();
      if (var4 != null) {
         var3.setTitle(var4);
      }

      String var5 = var2.getDescription();
      if (var5 != null) {
         var3.setDescription(var5);
      }

      Component var6 = var2.getTitleComponent();
      if (var6 != null) {
         var3.setTitleAdventureJsonLines(ApolloComponent.toJson(var6));
      }

      Component var7 = var2.getDescriptionComponent();
      if (var7 != null) {
         var3.setDescriptionAdventureJsonLines(ApolloComponent.toJson(var7));
      }

      String var8 = var2.getResourceLocation();
      if (var8 != null) {
         var3.setResourceLocation(var8);
      }

      DisplayNotificationMessage var9 = var3.build();
      ApolloManager.getNetworkManager().sendPacket(var1, var9);
   }

   @Override
   public void resetNotifications(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetNotificationsMessage var2 = ResetNotificationsMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
