package com.lunarclient.apollo.version;

import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.ApolloPlatform;
import com.lunarclient.apollo.api.request.DownloadFileRequest;
import com.lunarclient.apollo.api.request.VersionRequest;
import com.lunarclient.apollo.api.response.VersionResponse;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import io.leangen.geantyref.TypeToken;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.logging.Logger;
import lombok.Generated;

public final class ApolloVersionManager {
   public static final SimpleOption<Boolean> SEND_UPDATE_MESSAGE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Set to 'true' to send opped players available update message, otherwise 'false'."))
               .node("send-updater-message"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(true))
      .build();
   private VersionResponse updateAssets;
   private final AtomicBoolean updated = new AtomicBoolean(false);

   public ApolloVersionManager() {
      ApolloManager.registerOptions(SEND_UPDATE_MESSAGE);
   }

   public void checkForUpdates() {
      ApolloPlatform var1 = Apollo.getPlatform();
      if (var1.getOptions().<Boolean, SimpleOption<Boolean>>get(SEND_UPDATE_MESSAGE)) {
         ApolloManager.getHttpManager().request(VersionRequest.builder().build()).onSuccess(var2 -> {
            String var3 = var2.getVersion();
            ApolloVersion var4 = new ApolloVersion(var1.getApolloVersion());
            ApolloVersion var5 = new ApolloVersion(var3);
            if (var4.isUpdateAvailable(var5)) {
               this.updateAssets = var2;
               Logger var6 = var1.getPlatformLogger();
               var6.warning(String.format("A new version of Apollo is available! Latest release: %s", var3));
               if (var1.getPlatform() != ApolloPlatform.Platform.MINESTOM) {
                  var6.warning("Please update by running \"/apollo update\" or by downloading the latest build from https://lunarclient.dev/apollo/downloads");
               }
            }
         }).onFailure(Throwable::printStackTrace);
      }
   }

   public void forceUpdate(ApolloPlatform.Platform var1, Consumer<Component> var2) {
      if (this.updated.get()) {
         var2.accept(Component.text("Apollo is already updated, please restart your server!", NamedTextColor.RED));
      } else if (this.updateAssets == null) {
         var2.accept(Component.text("This server is already running the latest version of Apollo.", NamedTextColor.RED));
      } else {
         String var3 = this.getPlatformUrl(var1);
         if (var3 == null) {
            var2.accept(Component.text("Unable to find assets to update from.", NamedTextColor.RED));
         } else {
            URL var4 = Apollo.getPlatform().getPlugin().getClass().getProtectionDomain().getCodeSource().getLocation();

            File var5;
            try {
               var5 = new File(var4.toURI());
            } catch (URISyntaxException var10) {
               var10.printStackTrace();
               return;
            }

            String[] var6 = var3.split("/");
            String var7 = var6[var6.length - 1];
            Path var8 = Paths.get(var5.getParent() + File.separator + var7);
            DownloadFileRequest var9 = DownloadFileRequest.builder().url(var3).target(var8).build();
            ApolloManager.getHttpManager().download(var9).onSuccess(var3x -> {
               var2.accept(Component.text("Successfully updated Apollo, please restart your server!", NamedTextColor.RED));
               var5.deleteOnExit();
               this.updated.set(true);
            }).onFailure(var1x -> {
               var2.accept(Component.text("Failed to update Apollo, please check your console for more information!", NamedTextColor.RED));
               var1x.printStackTrace();
            });
         }
      }
   }

   private String getPlatformUrl(ApolloPlatform.Platform var1) {
      VersionResponse.Assets var2 = this.updateAssets.getAssets();
      switch (var1) {
         case BUKKIT:
            return var2.getBukkit();
         case BUNGEE:
            return var2.getBungee();
         case VELOCITY:
            return var2.getVelocity();
         case FOLIA:
            return var2.getFolia();
         default:
            return null;
      }
   }

   @Generated
   public VersionResponse getUpdateAssets() {
      return this.updateAssets;
   }
}
