package com.lunarclient.apollo.module.coloredfire;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.coloredfire.v1.OverrideColoredFireMessage;
import com.lunarclient.apollo.coloredfire.v1.ResetColoredFireMessage;
import com.lunarclient.apollo.coloredfire.v1.ResetColoredFiresMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import java.awt.Color;
import java.util.UUID;
import lombok.NonNull;

public final class ColoredFireModuleImpl extends ColoredFireModule {
   @Override
   public void overrideColoredFire(@NonNull Recipients var1, @NonNull UUID var2, @NonNull Color var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("burningPlayer is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("color is marked non-null but is null");
      }

      OverrideColoredFireMessage var4 = OverrideColoredFireMessage.newBuilder()
         .setPlayerUuid(NetworkTypes.toProtobuf(var2))
         .setColor(NetworkTypes.toProtobuf(var3))
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }

   @Override
   public void resetColoredFire(@NonNull Recipients var1, @NonNull UUID var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("burningPlayer is marked non-null but is null");
      }

      ResetColoredFireMessage var3 = ResetColoredFireMessage.newBuilder().setPlayerUuid(NetworkTypes.toProtobuf(var2)).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetColoredFires(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetColoredFiresMessage var2 = ResetColoredFiresMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
