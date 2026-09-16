package com.lunarclient.apollo.module.chat;

import com.google.protobuf.Message;
import com.lunarclient.apollo.Apollo;
import com.lunarclient.apollo.ApolloManager;
import com.lunarclient.apollo.button.v1.ButtonUpdate;
import com.lunarclient.apollo.chat.v1.DisplayChatButtonsMessage;
import com.lunarclient.apollo.chat.v1.DisplayLiveChatMessageMessage;
import com.lunarclient.apollo.chat.v1.RemoveChatButtonMessage;
import com.lunarclient.apollo.chat.v1.RemoveLiveChatMessageMessage;
import com.lunarclient.apollo.chat.v1.ResetChatButtonsMessage;
import com.lunarclient.apollo.chat.v1.UpdateChatButtonMessage;
import com.lunarclient.apollo.common.ApolloComponent;
import com.lunarclient.apollo.common.button.ApolloButtonTooltip;
import com.lunarclient.apollo.common.button.content.ApolloButtonContent;
import com.lunarclient.apollo.event.packetenrichment.chat.ApolloPlayerChatCloseEvent;
import com.lunarclient.apollo.event.packetenrichment.chat.ApolloPlayerChatOpenEvent;
import com.lunarclient.apollo.event.player.ApolloRegisterPlayerEvent;
import com.lunarclient.apollo.event.player.ApolloUnregisterPlayerEvent;
import com.lunarclient.apollo.module.button.ButtonModuleSupport;
import com.lunarclient.apollo.module.button.ButtonSurface;
import com.lunarclient.apollo.module.packetenrichment.PacketEnrichmentModule;
import com.lunarclient.apollo.network.ButtonNetworkTypes;
import com.lunarclient.apollo.option.Options;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.option.config.Serializer;
import com.lunarclient.apollo.player.ApolloPlayer;
import com.lunarclient.apollo.recipients.Recipients;
import com.moonsworth.lunar.lib.adventure.text.Component;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import lombok.NonNull;
import org.jetbrains.annotations.Nullable;

public final class ChatModuleImpl extends ChatModule implements ButtonSurface<ChatButton, com.lunarclient.apollo.chat.v1.ChatButton>, Serializer {
   private final ButtonModuleSupport<ChatButton, com.lunarclient.apollo.chat.v1.ChatButton> support = new ButtonModuleSupport<>(
      this, this, ChatModule.BROADCAST_LIVE_BUTTONS
   );

   public ChatModuleImpl() {
      this.serializer(ChatButton.class, new ChatButtonSerializer());
      this.handle(ApolloRegisterPlayerEvent.class, this::onPlayerRegister);
      this.handle(ApolloPlayerChatOpenEvent.class, var1 -> this.support.handleOpen(var1.getPlayer()));
      this.handle(ApolloPlayerChatCloseEvent.class, var1 -> this.support.handleClose(var1.getPlayer().getUniqueId()));
      this.handle(ApolloUnregisterPlayerEvent.class, var1 -> this.support.handleUnregister(var1.getPlayer().getUniqueId()));
   }

   @Override
   protected void onEnable() {
      this.support.startBroadcast();
   }

   @Override
   public void displayLiveChatMessage(@NonNull Recipients var1, @NonNull Component var2, int var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("text is marked non-null but is null");
      }

      DisplayLiveChatMessageMessage var4 = DisplayLiveChatMessageMessage.newBuilder()
         .setAdventureJsonLines(ApolloComponent.toJson(var2))
         .setMessageId(var3)
         .build();
      ApolloManager.getNetworkManager().sendPacket(var1, var4);
   }

   @Override
   public void removeLiveChatMessage(@NonNull Recipients var1, int var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      RemoveLiveChatMessageMessage var3 = RemoveLiveChatMessageMessage.newBuilder().setMessageId(var2).build();
      ApolloManager.getNetworkManager().sendPacket(var1, var3);
   }

   @Override
   public void displayChatButtons(@NonNull Recipients var1, @NonNull Collection<ChatButton> var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttons is marked non-null but is null");
      }

      if (var2.size() > 25) {
         throw new IllegalArgumentException("ChatButton batches support at most 25 buttons");
      }

      this.support.displayButtons(var1, var2);
   }

   @Override
   public void displayChatButton(@NonNull Recipients var1, @NonNull ChatButton var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("button is marked non-null but is null");
      }

      this.support.displayButtons(var1, Collections.singleton(var2));
   }

   @Override
   public void removeChatButton(@NonNull Recipients var1, @NonNull String var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttonId is marked non-null but is null");
      }

      this.support.removeButton(var1, var2);
   }

   @Override
   public void removeChatButton(@NonNull Recipients var1, @NonNull ChatButton var2) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("button is marked non-null but is null");
      }

      this.support.removeButton(var1, var2.getId());
   }

   @Override
   public void resetChatButtons(@NonNull Recipients var1) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      this.support.resetButtons(var1);
   }

   @Override
   public void updateChatButton(@NonNull Recipients var1, @NonNull String var2, @NonNull ApolloButtonContent var3, @Nullable ApolloButtonTooltip var4) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttonId is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("content is marked non-null but is null");
      }

      this.support.pushUpdate(var1, var2, var3, true, var4);
   }

   @Override
   public void updateChatButtonContent(@NonNull Recipients var1, @NonNull String var2, @NonNull ApolloButtonContent var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttonId is marked non-null but is null");
      }

      if (var3 == null) {
         throw new NullPointerException("content is marked non-null but is null");
      }

      this.support.pushUpdate(var1, var2, var3, false, null);
   }

   @Override
   public void updateChatButtonTooltip(@NonNull Recipients var1, @NonNull String var2, @Nullable ApolloButtonTooltip var3) {
      if (var1 == null) {
         throw new NullPointerException("recipients is marked non-null but is null");
      }

      if (var2 == null) {
         throw new NullPointerException("buttonId is marked non-null but is null");
      }

      this.support.pushUpdate(var1, var2, null, true, var3);
   }

   private void onPlayerRegister(ApolloRegisterPlayerEvent var1) {
      if (this.isEnabled() && this.getOptions().<Boolean, SimpleOption<Boolean>>get(ChatModule.SEND_DEFAULT_BUTTONS)) {
         ApolloPlayer var2 = var1.getPlayer();
         List var3 = this.getOptions().get(var2, ChatModule.DEFAULT_BUTTONS);
         if (var3 != null && !var3.isEmpty()) {
            try {
               this.support.displayButtons(var2, var3);
            } catch (IllegalArgumentException var5) {
               Apollo.getPlatform().getPlatformLogger().warning("Skipping the default chat buttons: " + var5.getMessage());
            }
         }
      }
   }

   public void validate(ChatButton var1) {
      ButtonModuleSupport.validateCommon(var1, 320.0F, 20.0F);
   }

   public com.lunarclient.apollo.chat.v1.ChatButton toDisplayElement(ChatButton var1, @Nullable ApolloPlayer var2) {
      return com.lunarclient.apollo.chat.v1.ChatButton.newBuilder().setButton(ButtonNetworkTypes.toProtobuf(var1, var2)).build();
   }

   @Override
   public Message createDisplay(List<com.lunarclient.apollo.chat.v1.ChatButton> var1) {
      return DisplayChatButtonsMessage.newBuilder().addAllChatButtons(var1).build();
   }

   @Override
   public Message createUpdate(String var1, ButtonUpdate var2) {
      return UpdateChatButtonMessage.newBuilder().setId(var1).setUpdate(var2).build();
   }

   @Override
   public Message createRemove(String var1) {
      return RemoveChatButtonMessage.newBuilder().setId(var1).build();
   }

   @Override
   public Message createReset() {
      return ResetChatButtonsMessage.getDefaultInstance();
   }

   @Override
   public boolean isOpenTrackingActive() {
      PacketEnrichmentModule var1 = Apollo.getModuleManager().getModule(PacketEnrichmentModule.class);
      if (var1 != null && var1.isEnabled()) {
         Options var2 = var1.getOptions();
         return var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_CHAT_OPEN_PACKET)
            && var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_CHAT_CLOSE_PACKET)
            && var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_CHAT_OPEN_EVENT)
            && var2.<Boolean, SimpleOption<Boolean>>get(PacketEnrichmentModule.PLAYER_CHAT_CLOSE_EVENT);
      } else {
         return false;
      }
   }
}
