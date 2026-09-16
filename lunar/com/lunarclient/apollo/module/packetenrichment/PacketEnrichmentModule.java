package com.lunarclient.apollo.module.packetenrichment;

import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import io.leangen.geantyref.TypeToken;
import org.jetbrains.annotations.ApiStatus;

@ModuleDefinition(id = "packet_enrichment", name = "PacketEnrichment")
@ApiStatus.NonExtendable
public abstract class PacketEnrichmentModule extends ApolloModule {
   public static final SimpleOption<Boolean> PLAYER_ATTACK_PACKET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to have the client send an additional player attack packet to the server, otherwise 'false'."))
                  .node("player-attack", "send-packet"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PLAYER_ATTACK_EVENT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment(
                     "If 'true', Apollo fires the player attack event on the main thread. Disable this and handle the packet yourself if you require asynchronous or off-thread processing."
                  ))
               .node("player-attack", "fire-apollo-event"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(false))
      .build();
   public static final SimpleOption<Boolean> PLAYER_CHAT_OPEN_PACKET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to have the client send an additional player chat open packet to the server, otherwise 'false'."))
                  .node("player-chat-open", "send-packet"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PLAYER_CHAT_OPEN_EVENT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment(
                     "If 'true', Apollo fires the player chat open event on the main thread. Disable this and handle the packet yourself if you require asynchronous or off-thread processing."
                  ))
               .node("player-chat-open", "fire-apollo-event"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(false))
      .build();
   public static final SimpleOption<Boolean> PLAYER_CHAT_CLOSE_PACKET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to have the client send an additional player chat close packet to the server, otherwise 'false'."))
                  .node("player-chat-close", "send-packet"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PLAYER_CHAT_CLOSE_EVENT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment(
                     "If 'true', Apollo fires the player chat close event on the main thread. Disable this and handle the packet yourself if you require asynchronous or off-thread processing."
                  ))
               .node("player-chat-close", "fire-apollo-event"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(false))
      .build();
   public static final SimpleOption<Boolean> PLAYER_INVENTORY_OPEN_PACKET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to have the client send an additional player inventory open packet to the server, otherwise 'false'."))
                  .node("player-inventory-open", "send-packet"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PLAYER_INVENTORY_OPEN_EVENT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment(
                     "If 'true', Apollo fires the player inventory open event on the main thread. Disable this and handle the packet yourself if you require asynchronous or off-thread processing."
                  ))
               .node("player-inventory-open", "fire-apollo-event"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(false))
      .build();
   public static final SimpleOption<Boolean> PLAYER_INVENTORY_CLOSE_PACKET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to have the client send an additional player inventory close packet to the server, otherwise 'false'."))
                  .node("player-inventory-close", "send-packet"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PLAYER_INVENTORY_CLOSE_EVENT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment(
                     "If 'true', Apollo fires the player inventory close event on the main thread. Disable this and handle the packet yourself if you require asynchronous or off-thread processing."
                  ))
               .node("player-inventory-close", "fire-apollo-event"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(false))
      .build();
   public static final SimpleOption<Boolean> PLAYER_USE_ITEM_PACKET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to have the client send an additional player use item packet to the server, otherwise 'false'."))
                  .node("player-use-item", "send-packet"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PLAYER_USE_ITEM_EVENT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment(
                     "If 'true', Apollo fires the player use item event on the main thread. Disable this and handle the packet yourself if you require asynchronous or off-thread processing."
                  ))
               .node("player-use-item", "fire-apollo-event"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(false))
      .build();
   public static final SimpleOption<Boolean> PLAYER_USE_ITEM_BUCKET_PACKET = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                     .comment("Set to 'true' to have the client send an additional player use item bucket packet to the server, otherwise 'false'."))
                  .node("player-use-item-bucket", "send-packet"))
               .type(TypeToken.get(Boolean.class)))
            .defaultValue(false))
         .notifyClient())
      .build();
   public static final SimpleOption<Boolean> PLAYER_USE_ITEM_BUCKET_EVENT = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment(
                     "If 'true', Apollo fires the player use item bucket event on the main thread. Disable this and handle the packet yourself if you require asynchronous or off-thread processing."
                  ))
               .node("player-use-item-bucket", "fire-apollo-event"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(false))
      .build();

   protected PacketEnrichmentModule() {
      this.registerOptions(
         ApolloModule.ENABLE_OPTION_OFF,
         PLAYER_ATTACK_PACKET,
         PLAYER_ATTACK_EVENT,
         PLAYER_CHAT_OPEN_PACKET,
         PLAYER_CHAT_OPEN_EVENT,
         PLAYER_CHAT_CLOSE_PACKET,
         PLAYER_CHAT_CLOSE_EVENT,
         PLAYER_INVENTORY_OPEN_PACKET,
         PLAYER_INVENTORY_OPEN_EVENT,
         PLAYER_INVENTORY_CLOSE_PACKET,
         PLAYER_INVENTORY_CLOSE_EVENT,
         PLAYER_USE_ITEM_PACKET,
         PLAYER_USE_ITEM_EVENT,
         PLAYER_USE_ITEM_BUCKET_PACKET,
         PLAYER_USE_ITEM_BUCKET_EVENT
      );
   }
}
