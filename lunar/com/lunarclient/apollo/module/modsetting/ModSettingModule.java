package com.lunarclient.apollo.module.modsetting;

import com.lunarclient.apollo.ApolloPlatform;
import com.lunarclient.apollo.async.Future;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.util.ConfigTarget;
import java.util.Arrays;
import java.util.Collection;
import lombok.NonNull;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ModuleDefinition(id = "mod_setting", name = "Mod Setting", configTarget = ConfigTarget.MOD_SETTINGS)
@ApiStatus.NonExtendable
public abstract class ModSettingModule extends ApolloModule {
   @Override
   public Collection<ApolloPlatform.Kind> getSupportedPlatforms() {
      return Arrays.asList(ApolloPlatform.Kind.SERVER, ApolloPlatform.Kind.PROXY);
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }

   public abstract <T, C extends Option<T, ?, ?>> T getStatus(@NotNull ApolloPlayer var1, @NonNull C var2);

   public abstract Future<InstalledModsResponse> requestInstalledMods(ApolloPlayer var1);
}
