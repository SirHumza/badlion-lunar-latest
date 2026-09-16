package com.lunarclient.apollo.module.hologram;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.hologram.v1.DisplayHologramMessage;
import com.lunarclient.apollo.hologram.v1.RemoveHologramMessage;
import com.lunarclient.apollo.hologram.v1.ResetHologramsMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.stream.Collectors;
import lombok.NonNull;

public final class HologramModuleImpl extends HologramModule {
   @Override
   public void displayHologram(@NonNull Recipients var1, @NonNull Hologram var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("hologram is marked non-null but is null");
      }

      DisplayHologramMessage var3 = DisplayHologramMessage.newBuilder()
         .setId(var2.getId())
         .setLocation(NetworkTypes.toProtobuf(var2.getLocation()))
         .addAllAdventureJsonLines(var2.getLines().stream().map(ApolloComponent::toJson).collect(Collectors.toList()))
         .setShowThroughWalls(var2.isShowThroughWalls())
         .setShowShadow(var2.isShowShadow())
         .setShowBackground(var2.isShowBackground())
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeHologram(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("hologramId is marked non-null but is null");
      }

      RemoveHologramMessage var3 = RemoveHologramMessage.newBuilder().setId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void removeHologram(@NonNull Recipients var1, @NonNull Hologram var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("hologram is marked non-null but is null");
      }

      this.removeHologram(var1, var2.getId());
   }

   @Override
   public void resetHolograms(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetHologramsMessage var2 = ResetHologramsMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
