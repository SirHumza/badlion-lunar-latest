package com.lunarclient.apollo.player;

import com.google.protobuf.Any;
import com.google.protobuf.Message;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.async.Future;
import com.lunarclient.apollo.async.future.UncertainFuture;
import com.lunarclient.apollo.client.mod.LunarClientMod;
import com.lunarclient.apollo.client.version.LunarClientVersion;
import com.lunarclient.apollo.client.version.MinecraftVersion;
import com.lunarclient.apollo.common.location.ApolloLocation;
import com.lunarclient.apollo.module.paynow.PayNowEmbeddedCheckoutSupport;
import com.lunarclient.apollo.module.tebex.TebexEmbeddedCheckoutSupport;
import com.lunarclient.apollo.roundtrip.ApolloRequest;
import com.lunarclient.apollo.roundtrip.ApolloResponse;
import com.lunarclient.apollo.world.ApolloWorld;
import java.util.List;
import java.util.Optional;
import lombok.Generated;

public abstract class AbstractApolloPlayer implements ApolloPlayer {
   private MinecraftVersion minecraftVersion;
   private LunarClientVersion lunarClientVersion;
   @Deprecated
   private List<LunarClientMod> installedMods;
   private TebexEmbeddedCheckoutSupport tebexEmbeddedCheckoutSupport;
   private PayNowEmbeddedCheckoutSupport payNowEmbeddedCheckoutSupport;

   @Override
   public Optional<ApolloWorld> getWorld() {
      return Optional.empty();
   }

   @Override
   public Optional<ApolloLocation> getLocation() {
      return Optional.empty();
   }

   public <T extends ApolloResponse> Future<T> sendRoundTripPacket(ApolloRequest<T> var1, Message var2) {
      this.sendPacket(var2);
      UncertainFuture var3 = new UncertainFuture();
      ApolloManager.getRoundtripManager().registerListener(var1, var3);
      return var3;
   }

   public void sendPacket(Message var1) {
      ApolloManager.getNetworkManager().sendPacket(this, Any.pack(var1));
   }

   public abstract void sendPacket(byte[] var1);

   @Generated
   @Override
   public MinecraftVersion getMinecraftVersion() {
      return this.minecraftVersion;
   }

   @Generated
   @Override
   public LunarClientVersion getLunarClientVersion() {
      return this.lunarClientVersion;
   }

   @Deprecated
   @Generated
   @Override
   public List<LunarClientMod> getInstalledMods() {
      return this.installedMods;
   }

   @Generated
   @Override
   public TebexEmbeddedCheckoutSupport getTebexEmbeddedCheckoutSupport() {
      return this.tebexEmbeddedCheckoutSupport;
   }

   @Generated
   @Override
   public PayNowEmbeddedCheckoutSupport getPayNowEmbeddedCheckoutSupport() {
      return this.payNowEmbeddedCheckoutSupport;
   }

   @Generated
   public void setMinecraftVersion(MinecraftVersion var1) {
      this.minecraftVersion = var1;
   }

   @Generated
   public void setLunarClientVersion(LunarClientVersion var1) {
      this.lunarClientVersion = var1;
   }

   @Deprecated
   @Generated
   public void setInstalledMods(List<LunarClientMod> var1) {
      this.installedMods = var1;
   }

   @Generated
   public void setTebexEmbeddedCheckoutSupport(TebexEmbeddedCheckoutSupport var1) {
      this.tebexEmbeddedCheckoutSupport = var1;
   }

   @Generated
   public void setPayNowEmbeddedCheckoutSupport(PayNowEmbeddedCheckoutSupport var1) {
      this.payNowEmbeddedCheckoutSupport = var1;
   }
}
