package com.lunarclient.apollo.option;

import java.util.Collection;
import org.spongepowered.configurate.CommentedConfigurationNode;

public final class ConfigOptions {
   public static void loadOptions(Options var0, CommentedConfigurationNode var1, Collection<Option<?, ?, ?>> var2) {
      for (Option var4 : var2) {
         CommentedConfigurationNode var5 = (CommentedConfigurationNode)var1.node(var4.getPath());
         if (!var5.virtual()) {
            try {
               Object var6 = var5.get(var4.getTypeToken());
               var0.set(var4, var6);
            } catch (Throwable var7) {
               var7.printStackTrace();
            }
         }
      }
   }

   public static void saveOptions(Options var0, CommentedConfigurationNode var1, Collection<Option<?, ?, ?>> var2) {
      for (Option var4 : var2) {
         CommentedConfigurationNode var5 = (CommentedConfigurationNode)var1.node(var4.getPath());

         try {
            var5.comment(var4.getComment());
            var5.set(var4.getTypeToken(), var0.get(var4));
         } catch (Throwable var7) {
            var7.printStackTrace();
         }
      }
   }

   private ConfigOptions() {
   }
}
