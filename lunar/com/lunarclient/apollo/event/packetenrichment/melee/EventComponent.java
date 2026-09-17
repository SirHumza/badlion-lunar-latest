package com.lunarclient.apollo.event.packetenrichment.melee;

import com.lunarclient.apollo.event.Event;
import com.lunarclient.apollo.module.packetenrichment.PlayerInfo;
import com.lunarclient.apollo.player.ApolloPlayer;
import lombok.Generated;

public final class ApolloPlayerAttackEvent implements Event {
   private final ApolloPlayer player;
   private final long instantiationTimeMs;
   private final PlayerInfo targetInfo;
   private final PlayerInfo attackerInfo;
   private final double distance;

   @Generated
   public ApolloPlayerAttackEvent(ApolloPlayer var1, long var2, PlayerInfo var4, PlayerInfo var5, double var6) {
      this.player = var1;
      this.instantiationTimeMs = var2;
      this.targetInfo = var4;
      this.attackerInfo = var5;
      this.distance = var6;
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
   public PlayerInfo getTargetInfo() {
      return this.targetInfo;
   }

   @Generated
   public PlayerInfo getAttackerInfo() {
      return this.attackerInfo;
   }

   @Generated
   public double getDistance() {
      return this.distance;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ApolloPlayerAttackEvent)) {
         return false;
      }

      ApolloPlayerAttackEvent var2 = (ApolloPlayerAttackEvent)var1;
      if (this.getInstantiationTimeMs() != var2.getInstantiationTimeMs()) {
         return false;
      }

      if (Double.compare(this.getDistance(), var2.getDistance()) != 0) {
         return false;
      }

      ApolloPlayer var3 = this.getPlayer();
      ApolloPlayer var4 = var2.getPlayer();
      if (var3 == null ? var4 == null : var3.equals(var4)) {
         PlayerInfo var5 = this.getTargetInfo();
         PlayerInfo var6 = var2.getTargetInfo();
         if (var5 == null ? var6 == null : var5.equals(var6)) {
            PlayerInfo var7 = this.getAttackerInfo();
            PlayerInfo var8 = var2.getAttackerInfo();
            return var7 == null ? var8 == null : var7.equals(var8);
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      long var3 = this.getInstantiationTimeMs();
      var2 = var2 * 59 + (int)(var3 >>> 32 ^ var3);
      long var5 = Double.doubleToLongBits(this.getDistance());
      var2 = var2 * 59 + (int)(var5 >>> 32 ^ var5);
      ApolloPlayer var7 = this.getPlayer();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      PlayerInfo var8 = this.getTargetInfo();
      var2 = var2 * 59 + (var8 == null ? 43 : var8.hashCode());
      PlayerInfo var9 = this.getAttackerInfo();
      return var2 * 59 + (var9 == null ? 43 : var9.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ApolloPlayerAttackEvent(player="
         + this.getPlayer()
         + ", instantiationTimeMs="
         + this.getInstantiationTimeMs()
         + ", targetInfo="
         + this.getTargetInfo()
         + ", attackerInfo="
         + this.getAttackerInfo()
         + ", distance="
         + this.getDistance()
         + ")";
   }
}
