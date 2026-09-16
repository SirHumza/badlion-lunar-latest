package com.lunarclient.apollo.module.vignette;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.util.Ranges;
import com.lunarclient.apollo.vignette.v1.DisplayVignetteMessage;
import com.lunarclient.apollo.vignette.v1.ResetVignetteMessage;
import lombok.NonNull;

public final class VignetteModuleImpl extends VignetteModule {
   @Override
   public void displayVignette(@NonNull Recipients var1, @NonNull Vignette var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("vignette is marked non-null but is null");
      }

      DisplayVignetteMessage var3 = DisplayVignetteMessage.newBuilder()
         .setResourceLocation(var2.getResourceLocation())
         .setOpacity(Ranges.checkRange(var2.getOpacity(), 0.0F, 1.0F, "Vignette#opacity"))
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetVignette(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetVignetteMessage var2 = ResetVignetteMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
