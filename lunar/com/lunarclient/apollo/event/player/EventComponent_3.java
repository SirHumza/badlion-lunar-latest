package com.lunarclient.apollo.event.player;

import com.lunarclient.apollo.event.Event;
import com.lunarclient.apollo.player.ApolloPlayer;
import lombok.Generated;

public final class ApolloRegisterPlayerEvent implements Event {
   private final ApolloPlayer player;

   @Generated
   public ApolloRegisterPlayerEvent(ApolloPlayer var1) {
      this.player = var1;
   }

   @Generated
   public ApolloPlayer getPlayer() {
      return this.player;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ApolloRegisterPlayerEvent)) {
         return false;
      }

      ApolloRegisterPlayerEvent var2 = (ApolloRegisterPlayerEvent)var1;
      ApolloPlayer var3 = this.getPlayer();
      ApolloPlayer var4 = var2.getPlayer();
      return var3 == null ? var4 == null : var3.equals(var4);
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      byte var2 = 1;
      ApolloPlayer var3 = this.getPlayer();
      return var2 * 59 + (var3 == null ? 43 : var3.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ApolloRegisterPlayerEvent(player=" + this.getPlayer() + ")";
   }
}
