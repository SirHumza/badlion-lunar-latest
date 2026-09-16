package com.lunarclient.apollo.player;

import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.client.version.LunarClientVersion;
import com.lunarclient.apollo.client.version.MinecraftVersion;
import com.lunarclient.apollo.event.EventBus;
import com.lunarclient.apollo.event.player.ApolloPlayerHandshakeEvent;
import com.lunarclient.apollo.event.player.ApolloRegisterPlayerEvent;
import com.lunarclient.apollo.event.player.ApolloUnregisterPlayerEvent;
import com.lunarclient.apollo.module.modsetting.ModSettingModule;
import com.lunarclient.apollo.module.modsettings.ModSettingModuleImpl;
import com.lunarclient.apollo.module.paynow.PayNowEmbeddedCheckoutSupport;
import com.lunarclient.apollo.module.tebex.TebexEmbeddedCheckoutSupport;
import com.lunarclient.apollo.network.NetworkOptions;
import com.lunarclient.apollo.player.v1.PlayerHandshakeMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

public final class ApolloPlayerManagerImpl implements ApolloPlayerManager {
   private final Map<UUID, ApolloPlayer> players = new HashMap<>();

   @Override
   public Optional<ApolloPlayer> getPlayer(@NonNull UUID var1) {
      if (var1 == null) {
         throw new NullPointerException("playerIdentifier is marked non-null but is null");
      } else {
         return Optional.ofNullable(this.players.get(var1));
      }
   }

   @Override
   public Collection<ApolloPlayer> getPlayers() {
      return Collections.unmodifiableCollection(this.players.values());
   }

   public void addPlayer(@NonNull ApolloPlayer var1) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      if (this.players.putIfAbsent(var1.getUniqueId(), var1) == null) {
         NetworkOptions.sendOptions(Apollo.getModuleManager().getModules(), true, var1);
         EventBus.EventResult var2 = EventBus.getBus().post(new ApolloRegisterPlayerEvent(var1));

         for (Throwable var4 : var2.getThrowing()) {
            var4.printStackTrace();
         }
      }
   }

   public void removePlayer(@NonNull UUID var1) {
      if (var1 == null) {
         throw new NullPointerException("player is marked non-null but is null");
      }

      ApolloPlayer var2 = this.players.remove(var1);
      if (var2 != null) {
         EventBus.EventResult var3 = EventBus.getBus().post(new ApolloUnregisterPlayerEvent(var2));

         for (Throwable var5 : var3.getThrowing()) {
            var5.printStackTrace();
         }
      }
   }

   public void handlePlayerHandshake(@NotNull ApolloPlayer var1, @NotNull PlayerHandshakeMessage var2) {
      MinecraftVersion var3;
      try {
         var3 = MinecraftVersion.valueOf(var2.getMinecraftVersion().getEnum().toUpperCase());
      } catch (IllegalArgumentException var16) {
         var3 = MinecraftVersion.UNKNOWN;
      }

      LunarClientVersion var4 = LunarClientVersion.builder()
         .gitBranch(var2.getLunarClientVersion().getGitBranch())
         .gitCommit(var2.getLunarClientVersion().getGitCommit())
         .semVer(var2.getLunarClientVersion().getSemver())
         .build();
      int var5 = var2.getEmbeddedCheckoutSupportValue();

      TebexEmbeddedCheckoutSupport var6;
      try {
         var6 = TebexEmbeddedCheckoutSupport.values()[var5 - 1];
      } catch (ArrayIndexOutOfBoundsException var15) {
         var6 = TebexEmbeddedCheckoutSupport.UNSUPPORTED;
      }

      PayNowEmbeddedCheckoutSupport var7;
      try {
         var7 = PayNowEmbeddedCheckoutSupport.values()[var5 - 1];
      } catch (ArrayIndexOutOfBoundsException var14) {
         var7 = PayNowEmbeddedCheckoutSupport.UNSUPPORTED;
      }

      AbstractApolloPlayer var8 = (AbstractApolloPlayer)var1;
      var8.setMinecraftVersion(var3);
      var8.setLunarClientVersion(var4);
      var8.setTebexEmbeddedCheckoutSupport(var6);
      var8.setPayNowEmbeddedCheckoutSupport(var7);
      Map var9 = var2.getModStatusMap();
      if (!var9.isEmpty()) {
         ModSettingModuleImpl var10 = (ModSettingModuleImpl)Apollo.getModuleManager().getModule(ModSettingModule.class);
         if (var10.isEnabled()) {
            var10.updateOptions(var8, var9, false);
         }
      }

      ApolloPlayerHandshakeEvent var17 = new ApolloPlayerHandshakeEvent(var1, var3, var4, new ArrayList<>(), var6, var7);
      EventBus.EventResult var11 = EventBus.getBus().post(var17);

      for (Throwable var13 : var11.getThrowing()) {
         var13.printStackTrace();
      }
   }
}
