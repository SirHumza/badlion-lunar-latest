package com.lunarclient.apollo.event.player;

import com.lunarclient.apollo.client.mod.LunarClientMod;
import com.lunarclient.apollo.client.version.LunarClientVersion;
import com.lunarclient.apollo.client.version.MinecraftVersion;
import com.lunarclient.apollo.event.Event;
import com.lunarclient.apollo.module.paynow.PayNowEmbeddedCheckoutSupport;
import com.lunarclient.apollo.module.tebex.TebexEmbeddedCheckoutSupport;
import com.lunarclient.apollo.player.ApolloPlayer;
import java.util.List;
import lombok.Generated;

public final class ApolloPlayerHandshakeEvent implements Event {
   private final ApolloPlayer player;
   private final MinecraftVersion minecraftVersion;
   private final LunarClientVersion lunarClientVersion;
   @Deprecated
   private final List<LunarClientMod> installedMods;
   private final TebexEmbeddedCheckoutSupport tebexEmbeddedCheckoutSupport;
   private final PayNowEmbeddedCheckoutSupport payNowEmbeddedCheckoutSupport;

   @Generated
   public ApolloPlayerHandshakeEvent(
      ApolloPlayer var1,
      MinecraftVersion var2,
      LunarClientVersion var3,
      List<LunarClientMod> var4,
      TebexEmbeddedCheckoutSupport var5,
      PayNowEmbeddedCheckoutSupport var6
   ) {
      this.player = var1;
      this.minecraftVersion = var2;
      this.lunarClientVersion = var3;
      this.installedMods = var4;
      this.tebexEmbeddedCheckoutSupport = var5;
      this.payNowEmbeddedCheckoutSupport = var6;
   }

   @Generated
   public ApolloPlayer getPlayer() {
      return this.player;
   }

   @Generated
   public MinecraftVersion getMinecraftVersion() {
      return this.minecraftVersion;
   }

   @Generated
   public LunarClientVersion getLunarClientVersion() {
      return this.lunarClientVersion;
   }

   @Deprecated
   @Generated
   public List<LunarClientMod> getInstalledMods() {
      return this.installedMods;
   }

   @Generated
   public TebexEmbeddedCheckoutSupport getTebexEmbeddedCheckoutSupport() {
      return this.tebexEmbeddedCheckoutSupport;
   }

   @Generated
   public PayNowEmbeddedCheckoutSupport getPayNowEmbeddedCheckoutSupport() {
      return this.payNowEmbeddedCheckoutSupport;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (!(var1 instanceof ApolloPlayerHandshakeEvent)) {
         return false;
      }

      ApolloPlayerHandshakeEvent var2 = (ApolloPlayerHandshakeEvent)var1;
      ApolloPlayer var3 = this.getPlayer();
      ApolloPlayer var4 = var2.getPlayer();
      if (var3 == null ? var4 == null : var3.equals(var4)) {
         MinecraftVersion var5 = this.getMinecraftVersion();
         MinecraftVersion var6 = var2.getMinecraftVersion();
         if (var5 == null ? var6 == null : var5.equals(var6)) {
            LunarClientVersion var7 = this.getLunarClientVersion();
            LunarClientVersion var8 = var2.getLunarClientVersion();
            if (var7 == null ? var8 == null : var7.equals(var8)) {
               List var9 = this.getInstalledMods();
               List var10 = var2.getInstalledMods();
               if (var9 == null ? var10 == null : var9.equals(var10)) {
                  TebexEmbeddedCheckoutSupport var11 = this.getTebexEmbeddedCheckoutSupport();
                  TebexEmbeddedCheckoutSupport var12 = var2.getTebexEmbeddedCheckoutSupport();
                  if (var11 == null ? var12 == null : var11.equals(var12)) {
                     PayNowEmbeddedCheckoutSupport var13 = this.getPayNowEmbeddedCheckoutSupport();
                     PayNowEmbeddedCheckoutSupport var14 = var2.getPayNowEmbeddedCheckoutSupport();
                     return var13 == null ? var14 == null : var13.equals(var14);
                  } else {
                     return false;
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
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
      ApolloPlayer var3 = this.getPlayer();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      MinecraftVersion var4 = this.getMinecraftVersion();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      LunarClientVersion var5 = this.getLunarClientVersion();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      List var6 = this.getInstalledMods();
      var2 = var2 * 59 + (var6 == null ? 43 : var6.hashCode());
      TebexEmbeddedCheckoutSupport var7 = this.getTebexEmbeddedCheckoutSupport();
      var2 = var2 * 59 + (var7 == null ? 43 : var7.hashCode());
      PayNowEmbeddedCheckoutSupport var8 = this.getPayNowEmbeddedCheckoutSupport();
      return var2 * 59 + (var8 == null ? 43 : var8.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ApolloPlayerHandshakeEvent(player="
         + this.getPlayer()
         + ", minecraftVersion="
         + this.getMinecraftVersion()
         + ", lunarClientVersion="
         + this.getLunarClientVersion()
         + ", installedMods="
         + this.getInstalledMods()
         + ", tebexEmbeddedCheckoutSupport="
         + this.getTebexEmbeddedCheckoutSupport()
         + ", payNowEmbeddedCheckoutSupport="
         + this.getPayNowEmbeddedCheckoutSupport()
         + ")";
   }
}
