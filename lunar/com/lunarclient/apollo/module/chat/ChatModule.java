package com.lunarclient.apollo.module.chat;

import com.lunarclient.apollo.common.button.ApolloButtonShape;
import com.lunarclient.apollo.common.button.ApolloButtonSize;
import com.lunarclient.apollo.common.button.ApolloButtonTooltip;
import com.lunarclient.apollo.common.button.action.ApolloButtonAction;
import com.lunarclient.apollo.common.button.content.ApolloButtonContent;
import com.lunarclient.apollo.common.icon.ItemStackIcon;
import com.lunarclient.apollo.common.location.HudPosition;
import com.lunarclient.apollo.module.ApolloModule;
import com.lunarclient.apollo.module.ModuleDefinition;
import com.lunarclient.apollo.option.ListOption;
import com.lunarclient.apollo.option.Option;
import com.lunarclient.apollo.option.SimpleOption;
import com.lunarclient.apollo.recipients.Recipients;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import io.leangen.geantyref.TypeToken;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ModuleDefinition(id = "chat", name = "Chat")
@ApiStatus.NonExtendable
public abstract class ChatModule extends ApolloModule {
   public static final SimpleOption<Boolean> BROADCAST_LIVE_BUTTONS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment(
                     "Set to 'true' to automatically re-send resolved live chat button content, otherwise 'false'.",
                     "When enabled, updates are always sent, even to players whose chat is closed; also enable",
                     "the packet enrichment module and its player chat open/close packets and events to only",
                     "send updates to players who currently have their chat open."
                  ))
               .node("buttons", "live-broadcast"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(false))
      .build();
   public static final SimpleOption<Boolean> SEND_DEFAULT_BUTTONS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment("Set to 'true' to display the default buttons to players when they join, otherwise 'false'."))
               .node("buttons", "send-defaults"))
            .type(TypeToken.get(Boolean.class)))
         .defaultValue(false))
      .build();
   public static final ListOption<ChatButton> DEFAULT_BUTTONS = ((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)Option.list()
                  .comment(
                     "Sets the default buttons to display to players when they join, while send-defaults is enabled.",
                     "Text is read as legacy strings ('&'-color codes) and icons as icon definitions; live values",
                     "are only available through the API."
                  ))
               .node("buttons", "defaults"))
            .type(new TypeToken<List<ChatButton>>() {}))
         .defaultValue(createDefaultButtons()))
      .build();

   protected ChatModule() {
      this.registerOptions(BROADCAST_LIVE_BUTTONS, SEND_DEFAULT_BUTTONS, DEFAULT_BUTTONS);
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }

   public abstract void displayLiveChatMessage(Recipients var1, Component var2, int var3);

   public abstract void removeLiveChatMessage(Recipients var1, int var2);

   public abstract void displayChatButtons(Recipients var1, Collection<ChatButton> var2);

   public abstract void displayChatButton(Recipients var1, ChatButton var2);

   public abstract void removeChatButton(Recipients var1, String var2);

   public abstract void removeChatButton(Recipients var1, ChatButton var2);

   public abstract void resetChatButtons(Recipients var1);

   public abstract void updateChatButton(Recipients var1, String var2, ApolloButtonContent var3, @Nullable ApolloButtonTooltip var4);

   public abstract void updateChatButtonContent(Recipients var1, String var2, ApolloButtonContent var3);

   public abstract void updateChatButtonTooltip(Recipients var1, String var2, @Nullable ApolloButtonTooltip var3);

   private static List<ChatButton> createDefaultButtons() {
      ChatButton var0 = ChatButton.builder()
         .id("team-chat")
         .position(HudPosition.of(0.0F, 2.0F))
         .size(ApolloButtonSize.of(70.0F, 16.0F))
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .content(
            ApolloButtonContent.builder()
               .append(ItemStackIcon.builder().itemName("SHIELD").build())
               .append(Component.text("Team Chat", NamedTextColor.GREEN))
               .build()
         )
         .tooltip(ApolloButtonTooltip.of(Component.text("Click to switch!", NamedTextColor.YELLOW)))
         .onClick(ApolloButtonAction.runCommand("/channel team"))
         .build();
      ChatButton var1 = ChatButton.builder()
         .id("public-chat")
         .position(HudPosition.of(76.0F, 2.0F))
         .size(ApolloButtonSize.of(78.0F, 16.0F))
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .content(ApolloButtonContent.builder().append(ItemStackIcon.builder().itemName("OAK_SIGN").build()).append(Component.text("Public Chat")).build())
         .tooltip(ApolloButtonTooltip.of(Component.text("Click to switch!", NamedTextColor.YELLOW)))
         .onClick(ApolloButtonAction.runCommand("/channel public"))
         .build();
      ChatButton var2 = ChatButton.builder()
         .id("party-chat")
         .position(HudPosition.of(160.0F, 2.0F))
         .size(ApolloButtonSize.of(76.0F, 16.0F))
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .content(
            ApolloButtonContent.builder()
               .append(ItemStackIcon.builder().itemName("FIREWORK_ROCKET").build())
               .append(Component.text("Party Chat", NamedTextColor.LIGHT_PURPLE))
               .build()
         )
         .tooltip(ApolloButtonTooltip.of(Component.text("Click to switch!", NamedTextColor.YELLOW)))
         .onClick(ApolloButtonAction.runCommand("/channel party"))
         .build();
      return new ArrayList<>(Arrays.asList(var0, var1, var2));
   }
}
