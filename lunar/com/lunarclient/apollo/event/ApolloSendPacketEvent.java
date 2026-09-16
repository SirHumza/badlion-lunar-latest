package com.lunarclient.apollo.event;

import com.google.protobuf.Any;
import com.lunarclient.apollo.player.ApolloPlayer;
import lombok.Generated;

public final class ApolloSendPacketEvent implements EventCancellable {
   final ApolloPlayer player;
   final Any packet;
   boolean cancelled;

   @Generated
   public ApolloPlayer getPlayer() {
      return this.player;
   }

   @Generated
   public Any getPacket() {
      return this.packet;
   }

   @Generated
   @Override
   public boolean isCancelled() {
      return this.cancelled;
   }

   @Generated
   public ApolloSendPacketEvent(ApolloPlayer var1, Any var2) {
      this.player = var1;
      this.packet = var2;
   }

   @Generated
   @Override
   public void setCancelled(boolean var1) {
      this.cancelled = var1;
   }
}
