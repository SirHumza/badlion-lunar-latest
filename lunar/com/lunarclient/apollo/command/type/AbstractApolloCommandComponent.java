package com.lunarclient.apollo.command.type;

import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.command.AbstractApolloCommand;
import com.lunarclient.apollo.module.ApolloModuleManagerImpl;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.util.function.BiConsumer;
import java.util.logging.Level;
import lombok.NonNull;

public class ApolloCommand<T> extends AbstractApolloCommand<T> {
   protected ApolloCommand(BiConsumer<T, Component> var1) {
      super(var1);
   }

   protected void getCurrentVersion(@NonNull T var1) {
      if (var1 == null) {
         throw new NullPointerException("sender is marked non-null but is null");
      }

      this.textConsumer
         .accept(
            (T)var1,
            ((TextComponent)Component.text("Apollo is running version ", NamedTextColor.GREEN)
                  .append(Component.text(Apollo.getPlatform().getApolloVersion(), NamedTextColor.WHITE)))
               .append(Component.text(".", NamedTextColor.GREEN))
         );
   }

   protected void reloadConfiguration(@NonNull T var1) {
      if (var1 == null) {
         throw new NullPointerException("sender is marked non-null but is null");
      }

      try {
         ApolloManager.loadConfiguration();
         ((ApolloModuleManagerImpl)Apollo.getModuleManager()).reloadModules();
         ApolloManager.saveConfiguration();
      } catch (Throwable var3) {
         Apollo.getPlatform().getPlatformLogger().log(Level.SEVERE, "Unable to save Apollo configuration!", var3);
         this.textConsumer.accept((T)var1, Component.text("An error occurred attempting to save the configuration!", NamedTextColor.RED));
         return;
      }

      this.textConsumer.accept((T)var1, Component.text("Reloaded the Apollo configuration!", NamedTextColor.GREEN));
   }
}
