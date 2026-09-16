package com.lunarclient.apollo;

import com.lunarclient.apollo.option.config.Serializers;
import com.lunarclient.apollo.util.ConfigTarget;
import java.nio.file.Path;
import java.util.Collection;
import java.util.EnumMap;
import org.spongepowered.configurate.CommentedConfigurationNode;
import org.spongepowered.configurate.loader.HeaderMode;
import org.spongepowered.configurate.yaml.NodeStyle;
import org.spongepowered.configurate.yaml.YamlConfigurationLoader;
import org.spongepowered.configurate.yaml.YamlConfigurationLoader.Builder;

public final class ApolloConfig {
   private static final EnumMap<ConfigTarget, ApolloConfig> CONFIGS = new EnumMap<>(ConfigTarget.class);
   private final YamlConfigurationLoader loader;
   private CommentedConfigurationNode node;

   public static ApolloConfig compute(Path var0, ConfigTarget var1) {
      return CONFIGS.computeIfAbsent(var1, var1x -> new ApolloConfig(var0, var1x));
   }

   public static ApolloConfig get(ConfigTarget var0) {
      return CONFIGS.get(var0);
   }

   public static Collection<ApolloConfig> configs() {
      return CONFIGS.values();
   }

   ApolloConfig(Path var1, ConfigTarget var2) {
      this.loader = ((Builder)((Builder)((Builder)YamlConfigurationLoader.builder().nodeStyle(NodeStyle.BLOCK).path(var1.resolve(var2.getFileName())))
               .headerMode(HeaderMode.PRESET))
            .defaultOptions(var1x -> var1x.serializers(var0x -> var0x.registerAll(Serializers.serializers())).header(var2.getHeaderComment())))
         .build();
   }

   public CommentedConfigurationNode node() {
      return this.node != null ? this.node : (this.node = (CommentedConfigurationNode)this.loader.load());
   }

   public void save() {
      this.loader.save(this.node);
   }

   public void reset() {
      this.node = null;
   }
}
