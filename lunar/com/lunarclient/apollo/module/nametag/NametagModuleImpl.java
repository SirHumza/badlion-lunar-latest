package com.lunarclient.apollo.module.nametag;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.nametag.v1.OverrideNametagMessage;
import com.lunarclient.apollo.nametag.v1.ResetNametagMessage;
import com.lunarclient.apollo.nametag.v1.ResetNametagsMessage;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.UUID;
import lombok.NonNull;

public final class NametagModuleImpl extends NametagModule {
   @Override
   public void overrideNametag(@NonNull Recipients var1, @NonNull UUID var2, @NonNull Nametag var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("playerUuid is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("nametag is marked non-null but is null");
      }

      OverrideNametagMessage.Builder var4 = OverrideNametagMessage.newBuilder().setPlayerUuid(NetworkTypes.toProtobuf(var2));

      for (Component var6 : var3.getLines()) {
         var4.addAdventureJsonLines(ApolloComponent.toJson(var6));
      }

      NametagVisibilityOverride var7 = var3.getVisibilityOverride();
      if (var7 != null && var7 != NametagVisibilityOverride.NONE) {
         var4.setVisibilityOverride(this.toProtobuf(var7));
      }

      ApolloManager.getNetworkManager().sendPacket(var1, var4.build());
   }

   @Override
   public void resetNametag(@NonNull Recipients var1, @NonNull UUID var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("playerUuid is marked non-null but is null");
      }

      ResetNametagMessage var3 = ResetNametagMessage.newBuilder().setPlayerUuid(NetworkTypes.toProtobuf(var2)).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetNametags(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetNametagsMessage var2 = ResetNametagsMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   private com.lunarclient.apollo.nametag.v1.NametagVisibilityOverride toProtobuf(NametagVisibilityOverride var1) {
      return com.lunarclient.apollo.nametag.v1.NametagVisibilityOverride.forNumber(var1.ordinal() + 1);
   }
}
