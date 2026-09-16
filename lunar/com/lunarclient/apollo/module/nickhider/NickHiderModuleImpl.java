package com.lunarclient.apollo.module.nickhider;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.nickhider.v1.OverrideNickHiderMessage;
import com.lunarclient.apollo.nickhider.v1.ResetNickHiderMessage;
import com.lunarclient.apollo.recipients.Recipients;
import lombok.NonNull;

public final class NickHiderModuleImpl extends NickHiderModule {
   @Override
   public void overrideNick(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("nick is marked non-null but is null");
      }

      OverrideNickHiderMessage var3 = OverrideNickHiderMessage.newBuilder().setNick(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetNick(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetNickHiderMessage var2 = ResetNickHiderMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
