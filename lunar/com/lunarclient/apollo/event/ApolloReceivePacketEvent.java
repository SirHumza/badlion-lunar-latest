package com.lunarclient.apollo.event;

import com.google.protobuf.Any;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.lunarclient.apollo.player.ApolloPlayer;
import java.util.Optional;
import lombok.Generated;

public final class ApolloReceivePacketEvent implements Event {
   private final ApolloPlayer player;
   private final Any packet;

   public <T extends Message> Optional<T> unpack(Class<T> var1) {
      if (!this.packet.is(var1)) {
         return Optional.empty();
      }

      Optional var2;
      try {
         var2 = Optional.ofNullable(this.packet.unpack(var1));
      } catch (InvalidProtocolBufferException var4) {
         var2 = Optional.empty();
      }

      return var2;
   }

   @Generated
   public ApolloReceivePacketEvent(ApolloPlayer var1, Any var2) {
      this.player = var1;
      this.packet = var2;
   }

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
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ApolloReceivePacketEvent)) {
         return false;
      } else {
         ApolloReceivePacketEvent var2 = (ApolloReceivePacketEvent)var1;
         ApolloPlayer var3 = this.getPlayer();
         ApolloPlayer var4 = var2.getPlayer();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            Any var5 = this.getPacket();
            Any var6 = var2.getPacket();
            return var5 == null ? var6 == null : var5.equals(var6);
         } else {
            return false;
         }
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      ApolloPlayer var3 = this.getPlayer();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      Any var4 = this.getPacket();
      return var2 * 59 + (var4 == null ? 43 : var4.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ApolloReceivePacketEvent(player=" + this.getPlayer() + ", packet=" + this.getPacket() + ")";
   }
}
