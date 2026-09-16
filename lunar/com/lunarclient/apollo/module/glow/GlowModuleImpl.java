package com.lunarclient.apollo.module.glow;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.glow.v1.OverrideGlowEffectMessage;
import com.lunarclient.apollo.glow.v1.ResetGlowEffectMessage;
import com.lunarclient.apollo.glow.v1.ResetGlowEffectsMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import java.awt.Color;
import java.util.UUID;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public final class GlowModuleImpl extends GlowModule {
   @Override
   public void overrideGlow(@NonNull Recipients var1, @NonNull UUID var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("glowingPlayer is marked non-null but is null");
      }

      this.overrideGlow(var1, var2, null);
   }

   @Override
   public void overrideGlow(@NonNull Recipients var1, @NonNull UUID var2, @Nullable Color var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("glowingPlayer is marked non-null but is null");
      }

      OverrideGlowEffectMessage.Builder var4 = OverrideGlowEffectMessage.newBuilder().setPlayerUuid(NetworkTypes.toProtobuf(var2));
      if (var3 != null) {
         var4.setColor(NetworkTypes.toProtobuf(var3));
      }

      OverrideGlowEffectMessage var5 = var4.build();
      ApolloManager.getNetworkManager().sendPacket(var1, var5);
   }

   @Override
   public void resetGlow(@NonNull Recipients var1, @NonNull UUID var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("glowingPlayer is marked non-null but is null");
      }

      ResetGlowEffectMessage var3 = ResetGlowEffectMessage.newBuilder().setPlayerUuid(NetworkTypes.toProtobuf(var2)).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetGlow(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetGlowEffectsMessage var2 = ResetGlowEffectsMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
