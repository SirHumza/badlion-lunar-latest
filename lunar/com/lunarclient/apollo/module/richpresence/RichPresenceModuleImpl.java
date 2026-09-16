package com.lunarclient.apollo.module.richpresence;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.richpresence.v1.OverrideServerRichPresenceMessage;
import com.lunarclient.apollo.richpresence.v1.ResetServerRichPresenceMessage;
import lombok.NonNull;

public final class RichPresenceModuleImpl extends RichPresenceModule {
   @Override
   public void overrideServerRichPresence(@NonNull Recipients var1, @NonNull ServerRichPresence var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("richPresence is marked non-null but is null");
      }

      OverrideServerRichPresenceMessage.Builder var3 = OverrideServerRichPresenceMessage.newBuilder()
         .setTeamCurrentSize(var2.getTeamCurrentSize())
         .setTeamMaxSize(var2.getTeamMaxSize());
      String var4 = var2.getGameName();
      if (var4 != null) {
         var3.setGameName(var4);
      }

      String var5 = var2.getGameVariantName();
      if (var5 != null) {
         var3.setGameVariantName(var5);
      }

      String var6 = var2.getGameState();
      if (var6 != null) {
         var3.setGameState(var6);
      }

      String var7 = var2.getPlayerState();
      if (var7 != null) {
         var3.setPlayerState(var7);
      }

      String var8 = var2.getMapName();
      if (var8 != null) {
         var3.setMapName(var8);
      }

      String var9 = var2.getSubServerName();
      if (var9 != null) {
         var3.setSubServer(var9);
      }

      OverrideServerRichPresenceMessage var10 = var3.build();
      ApolloManager.getNetworkManager().sendPacket(var1, var10);
   }

   @Override
   public void resetServerRichPresence(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetServerRichPresenceMessage var2 = ResetServerRichPresenceMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }
}
