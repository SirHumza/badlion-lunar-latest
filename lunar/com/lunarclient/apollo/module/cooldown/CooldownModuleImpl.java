package com.lunarclient.apollo.module.cooldown;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.cooldown.v1.DisplayCooldownMessage;
import com.lunarclient.apollo.cooldown.v1.RemoveCooldownMessage;
import com.lunarclient.apollo.cooldown.v1.ResetCooldownsMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import java.awt.Color;
import lombok.NonNull;

public final class CooldownModuleImpl extends CooldownModule {
   @Override
   public void displayCooldown(@NonNull Recipients var1, @NonNull Cooldown var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("cooldown is marked non-null but is null");
      }

      DisplayCooldownMessage.Builder var3 = DisplayCooldownMessage.newBuilder()
         .setName(var2.getName())
         .setDuration(NetworkTypes.toProtobuf(var2.getDuration()))
         .setIcon(NetworkTypes.toProtobuf(var2.getIcon()));
      CooldownStyle var4 = var2.getStyle();
      if (var4 != null) {
         var3.setStyle(this.toProtobuf(var4));
      }

      DisplayCooldownMessage var5 = var3.build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   @Override
   public void removeCooldown(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("cooldownName is marked non-null but is null");
      }

      RemoveCooldownMessage var3 = RemoveCooldownMessage.newBuilder().setName(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeCooldown(@NonNull Recipients var1, @NonNull Cooldown var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("cooldown is marked non-null but is null");
      }

      this.removeCooldown(var1, var2.getName());
   }

   @Override
   public void resetCooldowns(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetCooldownsMessage var2 = ResetCooldownsMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   private com.lunarclient.apollo.cooldown.v1.CooldownStyle toProtobuf(CooldownStyle var1) {
      com.lunarclient.apollo.cooldown.v1.CooldownStyle.Builder var2 = com.lunarclient.apollo.cooldown.v1.CooldownStyle.newBuilder();
      Color var3 = var1.getCircleStartColor();
      if (var3 != null) {
         var2.setCircleStartColor(NetworkTypes.toProtobuf(var3));
      }

      Color var4 = var1.getCircleEndColor();
      if (var4 != null) {
         var2.setCircleEndColor(NetworkTypes.toProtobuf(var4));
      }

      Color var5 = var1.getCircleEdgeColor();
      if (var5 != null) {
         var2.setCircleEdgeColor(NetworkTypes.toProtobuf(var5));
      }

      Color var6 = var1.getTextColor();
      if (var6 != null) {
         var2.setTextColor(NetworkTypes.toProtobuf(var6));
      }

      return var2.build();
   }
}
