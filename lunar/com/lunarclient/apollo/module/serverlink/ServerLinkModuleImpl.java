package com.lunarclient.apollo.module.serverlink;

import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.common.icon.ResourceLocationIcon;
import com.lunarclient.apollo.network.NetworkTypes;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.serverlink.v1.AddServerLinkMessage;
import com.lunarclient.apollo.serverlink.v1.OverrideServerLinkResourceMessage;
import com.lunarclient.apollo.serverlink.v1.RemoveServerLinkMessage;
import com.lunarclient.apollo.serverlink.v1.ResetServerLinkResourceMessage;
import com.lunarclient.apollo.serverlink.v1.ResetServerLinksMessage;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import lombok.NonNull;

public final class ServerLinkModuleImpl extends ServerLinkModule {
   @Override
   public void overrideServerLinkResource(@NonNull Recipients var1, @NonNull ResourceLocationIcon var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("icon is marked non-null but is null");
      }

      OverrideServerLinkResourceMessage var3 = OverrideServerLinkResourceMessage.newBuilder().setIcon(NetworkTypes.toProtobuf(var2)).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetServerLinkResource(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetServerLinkResourceMessage var2 = ResetServerLinkResourceMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   @Override
   public void addServerLink(@NonNull Recipients var1, @NonNull ServerLink var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("serverLink is marked non-null but is null");
      }

      this.addServerLink(var1, Collections.singletonList(var2));
   }

   @Override
   public void addServerLink(@NonNull Recipients var1, @NonNull List<ServerLink> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("serverLinks is marked non-null but is null");
      }

      List var3 = var2.stream().map(this::toProtobuf).collect(Collectors.toList());
      AddServerLinkMessage var4 = AddServerLinkMessage.newBuilder().addAllServerLinks(var3).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }

   @Override
   public void removeServerLink(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("serverLinkId is marked non-null but is null");
      }

      this.removeServerLink(var1, Collections.singletonList(var2));
   }

   @Override
   public void removeServerLink(@NonNull Recipients var1, @NonNull ServerLink var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("serverLink is marked non-null but is null");
      }

      this.removeServerLink(var1, Collections.singletonList(var2.getId()));
   }

   @Override
   public void removeServerLink(@NonNull Recipients var1, @NonNull List<String> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("serverLinkIds is marked non-null but is null");
      }

      RemoveServerLinkMessage var3 = RemoveServerLinkMessage.newBuilder().addAllServerLinkIds(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void resetServerLinks(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      ResetServerLinksMessage var2 = ResetServerLinksMessage.getDefaultInstance();
      ApolloManager.getNetworkManager().sendPacket(var1, var2);
   }

   private com.lunarclient.apollo.serverlink.v1.ServerLink toProtobuf(ServerLink var1) {
      return com.lunarclient.apollo.serverlink.v1.ServerLink.newBuilder()
         .setId(var1.getId())
         .setDisplayNameAdventureJsonLines(ApolloComponent.toJson(var1.getDisplayName()))
         .setUrl(var1.getUrl())
         .build();
   }
}
