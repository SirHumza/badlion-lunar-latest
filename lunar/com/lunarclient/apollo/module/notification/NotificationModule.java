package com.lunarclient.apollo.module.notification;

import com.lunarclient.apollo.ApolloPlatform;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.Arrays;
import java.util.Collection;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "notification", name = "Notification")
@ApiStatus.NonExtendable
public abstract class NotificationModule extends ApolloModule {
   @Override
   public Collection<ApolloPlatform.Kind> getSupportedPlatforms() {
      return Arrays.asList(ApolloPlatform.Kind.SERVER, ApolloPlatform.Kind.PROXY);
   }

   public abstract void displayNotification(Recipients var1, Notification var2);

   public abstract void resetNotifications(Recipients var1);
}
