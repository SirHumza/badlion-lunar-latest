package com.lunarclient.apollo.module;

import com.lunarclient.apollo.ApolloConfig;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.event.EventBus;
import com.lunarclient.apollo.option.ConfigOptions;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.option.OptionsImpl;
import com.lunarclient.apollo.util.ConfigTarget;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lombok.Generated;
import lombok.NonNull;
import org.spongepowered.configurate.CommentedConfigurationNode;

public final class ApolloModuleManagerImpl implements ApolloModuleManager {
   private final Map<Class<? extends ApolloModule>, ApolloModule> modules = new LinkedHashMap<>();

   @Override
   public boolean isEnabled(@NonNull Class<? extends ApolloModule> var1) {
      if (var1 == null) {
         throw new NullPointerException("moduleClass is marked non-null but is null");
      } else {
         return this.modules.containsKey(var1);
      }
   }

   @Override
   public <T extends ApolloModule> T getModule(@NonNull Class<T> var1) {
      if (var1 == null) {
         throw new NullPointerException("moduleClass is marked non-null but is null");
      } else {
         return (T)this.modules.get(var1);
      }
   }

   @Override
   public Collection<ApolloModule> getModules() {
      return Collections.unmodifiableCollection(this.modules.values());
   }

   public void enableModules() {
      for (ApolloModule var2 : this.modules.values()) {
         List var3 = var2.getOptionKeys();
         var2.setOptions(new OptionsImpl(var2, var3));
         this.loadConfiguration(var2, var3);
         if (!var2.isEnabled() && var2.getOptions().get(ApolloModule.ENABLE_OPTION_ON) != Boolean.FALSE) {
            EventBus.getBus().register(var2);
            var2.enable();
         }
      }
   }

   public void reloadModules() {
      for (ApolloModule var2 : this.modules.values()) {
         List var3 = var2.getOptionKeys();
         this.loadConfiguration(var2, var3);
         Boolean var4;
         if ((var4 = var2.getOptions().get(ApolloModule.ENABLE_OPTION_ON)) != var2.isEnabled()) {
            if (var4 == Boolean.TRUE) {
               EventBus.getBus().register(var2);
               var2.enable();
            } else {
               EventBus.getBus().unregister(var2);
               var2.disable();
            }
         }
      }

      this.saveConfiguration();
   }

   public void disableModules() {
      for (ApolloModule var2 : this.modules.values()) {
         if (var2.isEnabled()) {
            EventBus.getBus().unregister(var2);
            var2.disable();
         }
      }
   }

   public <T extends ApolloModule> ApolloModuleManagerImpl addModule(@NonNull Class<T> var1) {
      if (var1 == null) {
         throw new NullPointerException("moduleClass is marked non-null but is null");
      }

      this.modules.computeIfAbsent(var1, var1x -> {
         try {
            Constructor var2 = var1.getDeclaredConstructor();
            var2.setAccessible(true);
            return (ApolloModule)var2.newInstance();
         } catch (Throwable var3) {
            throw new RuntimeException(var3);
         }
      });
      return this;
   }

   public <T extends ApolloModule> ApolloModuleManagerImpl addModule(Class<T> var1, @NonNull T var2) {
      if (var2 == null) {
         throw new NullPointerException("module is marked non-null but is null");
      }

      this.modules.putIfAbsent(var1, var2);
      return this;
   }

   public void saveConfiguration() {
      for (ApolloModule var2 : this.modules.values()) {
         ConfigTarget var3 = var2.getConfigTarget();
         ApolloConfig var4 = ApolloConfig.get(var3);
         CommentedConfigurationNode var5 = var4.node();
         CommentedConfigurationNode var6 = (CommentedConfigurationNode)var5.node(var3.getModulesNode());
         CommentedConfigurationNode var7 = (CommentedConfigurationNode)var6.node(new Object[]{var2.getId().toLowerCase(Locale.ROOT)});
         Options var8 = var2.getOptions();
         ConfigOptions.saveOptions(var8, var7, var2.getOptionKeys());
      }
   }

   private void loadConfiguration(ApolloModule var1, List<Option<?, ?, ?>> var2) {
      ConfigTarget var3 = var1.getConfigTarget();
      ApolloConfig var4 = ApolloConfig.compute(ApolloManager.getConfigPath(), var3);
      CommentedConfigurationNode var5 = var4.node();
      CommentedConfigurationNode var6 = (CommentedConfigurationNode)var5.node(var3.getModulesNode());
      CommentedConfigurationNode var7 = (CommentedConfigurationNode)var6.node(new Object[]{var1.getId().toLowerCase(Locale.ROOT)});
      if (!var7.virtual()) {
         Options var8 = var1.getOptions();
         ConfigOptions.loadOptions(var8, var7, var2);
      }
   }
}
