package com.lunarclient.apollo.network;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.event.ApolloReceivePacketEvent;
import com.lunarclient.apollo.event.ApolloSendPacketEvent;
import com.lunarclient.apollo.event.EventBus;
import com.lunarclient.apollo.player.AbstractApolloPlayer;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;
import java.util.UUID;
import lombok.Generated;

public final class ApolloNetworkManager {
   public void sendPacket(ApolloPlayer var1, Any var2) {
      EventBus.EventResult var3 = EventBus.getBus().post(new ApolloSendPacketEvent(var1, var2));
      if (!((ApolloSendPacketEvent)var3.getEvent()).isCancelled()) {
         ((AbstractApolloPlayer)var1).sendPacket(var2.toByteArray());
      }

      for (Throwable var5 : var3.getThrowing()) {
         var5.printStackTrace();
      }
   }

   public void sendPacket(Recipients var1, Message var2) {
      Any var3 = Any.pack(var2);
      byte[] var4 = var3.toByteArray();
      var1.forEach(var2x -> {
         EventBus.EventResult var3x = EventBus.getBus().post(new ApolloSendPacketEvent((ApolloPlayer)var2x, var3));
         if (!((ApolloSendPacketEvent)var3x.getEvent()).isCancelled()) {
            ((AbstractApolloPlayer)var2x).sendPacket(var4);
         }

         for (Throwable var5 : var3x.getThrowing()) {
            var5.printStackTrace();
         }
      });
   }

   public void receivePacket(ApolloPlayer var1, Any var2) {
      EventBus.EventResult var3 = EventBus.getBus().post(new ApolloReceivePacketEvent(var1, var2));

      for (Throwable var5 : var3.getThrowing()) {
         var5.printStackTrace();
      }
   }

   public void receivePacket(UUID var1, byte[] var2) {
      Apollo.getPlayerManager().getPlayer(var1).ifPresent(var1x -> {
         try {
            ApolloManager.getNetworkManager().receivePacket(var1x, Any.parseFrom(var2));
         } catch (Throwable var3) {
            throw new RuntimeException(var3);
         }
      });
   }
}
