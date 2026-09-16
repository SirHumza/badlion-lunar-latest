package com.lunarclient.apollo.module.serverrule;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.ListOption;
import com.lunarclient.apollo.option.NumberOption;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ModuleDefinition(id = "server_rule", name = "Server Rule")
public final class ServerRuleModule extends ApolloModule {
   public static final SimpleOption<Boolean> COMPETITIVE_GAME = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to enable leaving game warning, otherwise 'false'."))
                  .node("competitive-game"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final ListOption<String> COMPETITIVE_COMMANDS = ((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)Option.list()
                     .comment("A list of commands that will trigger the competitive popup."))
                  .node("competitive-commands"))
               .type(new TypeToken<List<String>>() {}))
            .defaultValue(new ArrayList<>(Arrays.asList("/server", "/servers", "/hub"))))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DISABLE_SHADERS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to disable shaders, otherwise 'false'."))
                  .node("disable-shaders"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DISABLE_CHUNK_RELOADING = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to disable chunk reloading, otherwise 'false'."))
                  .node("disable-chunk-reloading"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> DISABLE_BROADCASTING = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to disable broadcasting, otherwise 'false'."))
                  .node("disable-broadcasting"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> ANTI_PORTAL_TRAPS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to enable anti portal traps, otherwise 'false'."))
                  .node("anti-portal-traps"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(true))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> OVERRIDE_BRIGHTNESS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to override brightness, otherwise 'false'."))
                  .node("override-brightness"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> BRIGHTNESS = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)Option.number()
               .comment("Set the brightness amount."))
            .node("brightness"))
         .type(TypeToken.get(Integer.class)))
      .defaultValue(50)
      .min(1)
      .max(10000)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> OVERRIDE_NAMETAG_RENDER_DISTANCE = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to override nametag render distance, otherwise 'false'."))
                  .node("override-nametag-render-distance"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> NAMETAG_RENDER_DISTANCE = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)Option.number()
               .comment("Set the nametag render distance amount."))
            .node("nametag-render-distance"))
         .type(TypeToken.get(Integer.class)))
      .defaultValue(64)
      .min(1)
      .max(96)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> OVERRIDE_MAX_CHAT_LENGTH = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to override max chat length, otherwise 'false'."))
                  .node("override-max-chat-length"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final NumberOption<Integer> MAX_CHAT_LENGTH = ((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)((NumberOption.NumberOptionBuilder)Option.number()
               .comment("Set the nametag render distance amount."))
            .node("max-chat-length"))
         .type(TypeToken.get(Integer.class)))
      .defaultValue(256)
      .min(1)
      .max(256)
      .notifyClient()
      .build();
   public static final SimpleOption<Boolean> CRYSTAL_OPTIMIZER = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to enable the crystal optimizer, otherwise 'false'."))
                  .node("crystal-optimizer"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();

   ServerRuleModule() {
      this.registerOptions(
         COMPETITIVE_GAME,
         COMPETITIVE_COMMANDS,
         DISABLE_SHADERS,
         DISABLE_CHUNK_RELOADING,
         DISABLE_BROADCASTING,
         ANTI_PORTAL_TRAPS,
         OVERRIDE_BRIGHTNESS,
         BRIGHTNESS,
         OVERRIDE_NAMETAG_RENDER_DISTANCE,
         NAMETAG_RENDER_DISTANCE,
         OVERRIDE_MAX_CHAT_LENGTH,
         MAX_CHAT_LENGTH,
         CRYSTAL_OPTIMIZER
      );
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }
}
