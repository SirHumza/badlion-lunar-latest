package com.lunarclient.apollo.module.tntcountdown;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloEntity;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.tntcountdown.v1.SetTntCountdownMessage;
import com.lunarclient.apollo.util.Ranges;
import lombok.NonNull;

public final class TntCountdownModuleImpl extends TntCountdownModule {
   @Override
   public void setTntCountdown(@NonNull ApolloEntity var1, int var2) {
      if (var1 == null) {
         throw new NullPointerException("entity is marked non-null but is null");
      }

      this.setTntCountdown(Recipients.ofEveryone(), var1, var2);
   }

   @Override
   public void setTntCountdown(@NonNull Recipients var1, @NonNull ApolloEntity var2, int var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("entity is marked non-null but is null");
      }

      SetTntCountdownMessage var4 = SetTntCountdownMessage.newBuilder()
         .setEntityId(NetworkTypes.toProtobuf(var2))
         .setDurationTicks(Ranges.checkPositive(var3, "TntCountdown#ticks"))
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }
}
