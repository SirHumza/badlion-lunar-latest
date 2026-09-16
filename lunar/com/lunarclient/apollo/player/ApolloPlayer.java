package com.lunarclient.apollo.player;

import com.lunarclient.apollo.client.mod.LunarClientMod;
import com.lunarclient.apollo.client.version.LunarClientVersion;
import com.lunarclient.apollo.client.version.MinecraftVersion;
import com.lunarclient.apollo.common.location.ApolloLocation;
import com.lunarclient.apollo.module.paynow.PayNowEmbeddedCheckoutSupport;
import com.lunarclient.apollo.module.tebex.TebexEmbeddedCheckoutSupport;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.recipients.Recipients;
import com.lunarclient.apollo.world.ApolloWorld;
import com.moonsworth.lunar.lib.adventure.audience.ForwardingAudience;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ApiStatus.NonExtendable
public interface ApolloPlayer extends Recipients, ForwardingAudience.Single {
   UUID getUniqueId();

   String getName();

   Optional<ApolloWorld> getWorld();

   Optional<ApolloLocation> getLocation();

   default boolean hasPermission(Options var1, Option<String, ?, ?> var2) {
      String var3 = var1.get(var2);
      return this.hasPermission(var3);
   }

   boolean hasPermission(String var1);

   Object getPlayer();

   @Nullable
   MinecraftVersion getMinecraftVersion();

   @Nullable
   LunarClientVersion getLunarClientVersion();

   @Deprecated
   @Nullable
   List<LunarClientMod> getInstalledMods();

   @Nullable
   TebexEmbeddedCheckoutSupport getTebexEmbeddedCheckoutSupport();

   @Nullable
   PayNowEmbeddedCheckoutSupport getPayNowEmbeddedCheckoutSupport();
}
