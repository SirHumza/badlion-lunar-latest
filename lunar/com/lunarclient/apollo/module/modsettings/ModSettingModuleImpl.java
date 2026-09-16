package com.lunarclient.apollo.module.modsettings;

import com.google.protobuf.Any;
import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Value;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.async.Future;
import com.lunarclient.apollo.client.mod.LunarClientMod;
import com.lunarclient.apollo.client.mod.LunarClientModType;
import com.lunarclient.apollo.configurable.v1.ConfigurableSettings;
import com.lunarclient.apollo.configurable.v1.OverrideConfigurableSettingsMessage;
import com.lunarclient.apollo.event.ApolloReceivePacketEvent;
import com.lunarclient.apollo.event.EventBus;
import com.lunarclient.apollo.event.modsetting.ApolloUpdateModOptionEvent;
import com.lunarclient.apollo.modsetting.v1.Mod;
import com.lunarclient.apollo.module.modsetting.InstalledModsRequest;
import com.lunarclient.apollo.module.modsetting.InstalledModsResponse;
import com.lunarclient.apollo.module.modsetting.ModSettingModule;
import com.lunarclient.apollo.network.NetworkOptions;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.StatusOptionsImpl;
import com.lunarclient.apollo.player.AbstractApolloPlayer;
import com.lunarclient.apollo.player.ApolloPlayer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

public final class ModSettingModuleImpl extends ModSettingModule {
   private static final LunarClientModType[] MOD_TYPES = LunarClientModType.values();

   public ModSettingModuleImpl() {
      this.registerOptions(ApolloManager.getModsManager().getContainer().getModSettingsOptions());
      this.handle(ApolloReceivePacketEvent.class, this::onReceivePacket);
   }

   @Override
   public <T, C extends Option<T, ?, ?>> T getStatus(@NotNull ApolloPlayer var1, @NonNull C var2) {
      if (var2 == null) {
         throw new NullPointerException("option is marked non-null but is null");
      } else {
         return ApolloManager.getModsManager().getPlayerOptions().get(var1, (C)var2);
      }
   }

   @Override
   public Future<InstalledModsResponse> requestInstalledMods(@NotNull ApolloPlayer var1) {
      InstalledModsRequest var2 = InstalledModsRequest.builder().build();
      com.lunarclient.apollo.modsetting.v1.InstalledModsRequest var3 = com.lunarclient.apollo.modsetting.v1.InstalledModsRequest.newBuilder()
         .setRequestId(ByteString.copyFromUtf8(var2.getRequestId().toString()))
         .build();
      return ((AbstractApolloPlayer)var1).sendRoundTripPacket(var2, var3);
   }

   private void onReceivePacket(ApolloReceivePacketEvent var1) {
      ApolloPlayer var2 = var1.getPlayer();
      Any var3 = var1.getPacket();
      if (var3.is(OverrideConfigurableSettingsMessage.class) || var3.is(ConfigurableSettings.class)) {
         this.handleConfiguration(var2, var3);
      }

      var1.unpack(com.lunarclient.apollo.modsetting.v1.InstalledModsResponse.class)
         .ifPresent(
            var1x -> {
               List var2x = var1x.getModGroupsList()
                  .stream()
                  .flatMap(var1xx -> var1xx.getModsList().stream().map(var2xx -> this.fromProtobuf(MOD_TYPES[var1xx.getTypeValue() - 1], var2xx)))
                  .collect(Collectors.toList());
               InstalledModsResponse var3x = InstalledModsResponse.builder()
                  .packetId(UUID.fromString(var1x.getRequestId().toStringUtf8()))
                  .page(var1x.getPage())
                  .totalPages(var1x.getTotalPages())
                  .elements(var2x)
                  .build();
               ApolloManager.getRoundtripManager().handleResponse(var3x);
            }
         );
   }

   private LunarClientMod fromProtobuf(LunarClientModType var1, Mod var2) {
      return LunarClientMod.builder().id(var2.getId()).displayName(var2.getId()).version(var2.getVersion()).type(var1).build();
   }

   private void handleConfiguration(ApolloPlayer var1, Any var2) {
      List var3;
      try {
         if (var2.is(OverrideConfigurableSettingsMessage.class)) {
            OverrideConfigurableSettingsMessage var4 = var2.unpack(OverrideConfigurableSettingsMessage.class);
            var3 = var4.getConfigurableSettingsList();
         } else {
            var3 = Collections.singletonList(var2.unpack(ConfigurableSettings.class));
         }
      } catch (InvalidProtocolBufferException var6) {
         throw new RuntimeException(var6);
      }

      for (ConfigurableSettings var5 : var3) {
         if (var5.hasApolloModule() && var5.getApolloModule().equals(this.getId())) {
            this.updateOptions(var1, var5.getPropertiesMap(), true);
         }
      }
   }

   public void updateOptions(ApolloPlayer var1, Map<String, Value> var2, boolean var3) {
      StatusOptionsImpl var4 = ApolloManager.getModsManager().getPlayerOptions();

      for (Entry var6 : var2.entrySet()) {
         Option var7 = var4.getRegistry().get(var6.getKey());
         if (var7 != null) {
            Object var8 = NetworkOptions.unwrapValue((Value)var6.getValue(), var7.getTypeToken().getType());
            var4.set(var1, var7, var8);
            if (var3) {
               EventBus.EventResult var9 = EventBus.getBus().post(new ApolloUpdateModOptionEvent(var1, var7, var8));

               for (Throwable var11 : var9.getThrowing()) {
                  var11.printStackTrace();
               }
            }
         }
      }
   }
}
