package com.lunarclient.apollo.event.packetenrichment.chat;

import com.lunarclient.apollo.event.Event;
import com.lunarclient.apollo.module.packetenrichment.PlayerInfo;
import com.lunarclient.apollo.player.ApolloPlayer;
import lombok.Generated;

public final class ApolloPlayerChatCloseEvent implements Event {
   private final ApolloPlayer player;
   private final long instantiationTimeMs;
   private final PlayerInfo playerInfo;

   @Generated
   public ApolloPlayerChatCloseEvent(ApolloPlayer var1, long var2, PlayerInfo var4) {
      this.player = var1;
      this.instantiationTimeMs = var2;
      this.playerInfo = var4;
   }

   @Generated
   public ApolloPlayer getPlayer() {
      return this.player;
   }

   @Generated
   public long getInstantiationTimeMs() {
      return this.instantiationTimeMs;
   }

   @Generated
   public PlayerInfo getPlayerInfo() {
      return this.playerInfo;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof ApolloPlayerChatCloseEvent)) {
         return false;
      } else {
         ApolloPlayerChatCloseEvent var2 = (ApolloPlayerChatCloseEvent)var1;
         if (this.getInstantiationTimeMs() != var2.getInstantiationTimeMs()) {
            return false;
         } else {
            ApolloPlayer var3 = this.getPlayer();
            ApolloPlayer var4 = var2.getPlayer();
            if (var3 == null ? var4 == null : var3.equals(var4)) {
               PlayerInfo var5 = this.getPlayerInfo();
               PlayerInfo var6 = var2.getPlayerInfo();
               return var5 == null ? var6 == null : var5.equals(var6);
            } else {
               return false;
            }
         }
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      long var3 = this.getInstantiationTimeMs();
      var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
      ApolloPlayer var5 = this.getPlayer();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      PlayerInfo var6 = this.getPlayerInfo();
      return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ApolloPlayerChatCloseEvent(player="
         + this.getPlayer()
         + ", instantiationTimeMs="
         + this.getInstantiationTimeMs()
         + ", playerInfo="
         + this.getPlayerInfo()
         + ")";
   }
}
