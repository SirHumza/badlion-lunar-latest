package com.lunarclient.apollo.module.inventory;

import com.lunarclient.apollo.common.button.ApolloButtonShape;
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
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.Nullable;

@ModuleDefinition(id = "inventory", name = "Inventory")
@ApiStatus.NonExtendable
public abstract class InventoryModule extends ApolloModule {
   public static final SimpleOption<Boolean> BROADCAST_LIVE_BUTTONS = ((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)((SimpleOption.SimpleOptionBuilder)Option.builder()
                  .comment(
                     "Set to 'true' to automatically re-send resolved live inventory button content, otherwise 'false'.",
                     "When enabled, updates are always sent, even to players whose inventory is closed; also enable",
                     "the packet enrichment module and its player inventory open/close packets and events to only",
                     "send updates to players who currently have their inventory open."
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
   public static final ListOption<InventoryButton> DEFAULT_BUTTONS = ((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)((ListOption.ListOptionBuilder)Option.list()
                  .comment(
                     "Sets the default buttons to display to players when they join, while send-defaults is enabled.",
                     "Text is read as legacy strings ('&'-color codes) and icons as icon definitions; live values",
                     "are only available through the API."
                  ))
               .node("buttons", "defaults"))
            .type(new TypeToken<List<InventoryButton>>() {}))
         .defaultValue(createDefaultButtons()))
      .build();

   protected InventoryModule() {
      this.registerOptions(ApolloModule.ENABLE_OPTION_OFF, BROADCAST_LIVE_BUTTONS, SEND_DEFAULT_BUTTONS, DEFAULT_BUTTONS);
   }

   @Override
   public boolean isClientNotify() {
      return true;
   }

   public abstract void displayInventoryButtons(Recipients var1, Collection<InventoryButton> var2);

   public abstract void displayInventoryButton(Recipients var1, InventoryButton var2);

   public abstract void removeInventoryButton(Recipients var1, String var2);

   public abstract void removeInventoryButton(Recipients var1, InventoryButton var2);

   public abstract void resetInventoryButtons(Recipients var1);

   public abstract void updateInventoryButton(Recipients var1, String var2, ApolloButtonContent var3, @Nullable ApolloButtonTooltip var4);

   public abstract void updateInventoryButtonContent(Recipients var1, String var2, ApolloButtonContent var3);

   public abstract void updateInventoryButtonTooltip(Recipients var1, String var2, @Nullable ApolloButtonTooltip var3);

   private static List<InventoryButton> createDefaultButtons() {
      InventoryButton var0 = InventoryButton.builder()
         .id("shop")
         .inventoryType(InventoryType.PLAYER)
         .box(InventoryButtonBox.LEFT)
         .position(HudPosition.of(4.0F, 4.0F))
         .size(InventoryButton.SIZE_MEDIUM)
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .content(ApolloButtonContent.builder().append(ItemStackIcon.builder().itemName("EMERALD").build()).build())
         .tooltip(
            ApolloButtonTooltip.of(
               Component.text("Shop", NamedTextColor.GREEN),
               Component.text("Browse categories and buy items", NamedTextColor.GRAY),
               Component.text("Click to open", NamedTextColor.YELLOW)
            )
         )
         .onClick(ApolloButtonAction.runCommand("/shop"))
         .build();
      InventoryButton var1 = InventoryButton.builder()
         .id("spawn")
         .inventoryType(InventoryType.PLAYER)
         .box(InventoryButtonBox.LEFT)
         .position(HudPosition.of(48.0F, 4.0F))
         .size(InventoryButton.SIZE_MEDIUM)
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .content(ApolloButtonContent.builder().append(ItemStackIcon.builder().itemName("RED_BED").build()).build())
         .tooltip(
            ApolloButtonTooltip.of(
               Component.text("Spawn", NamedTextColor.AQUA),
               Component.text("Teleport back to spawn", NamedTextColor.GRAY),
               Component.text("Click to teleport", NamedTextColor.YELLOW)
            )
         )
         .onClick(ApolloButtonAction.runCommand("/spawn"))
         .build();
      InventoryButton var2 = InventoryButton.builder()
         .id("warps")
         .inventoryType(InventoryType.PLAYER)
         .box(InventoryButtonBox.LEFT)
         .position(HudPosition.of(4.0F, 48.0F))
         .size(InventoryButton.SIZE_MEDIUM)
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .content(ApolloButtonContent.builder().append(ItemStackIcon.builder().itemName("COMPASS").build()).build())
         .tooltip(
            ApolloButtonTooltip.of(
               Component.text("Warps", NamedTextColor.AQUA),
               Component.text("Browse public warps", NamedTextColor.GRAY),
               Component.text("Click to teleport", NamedTextColor.YELLOW)
            )
         )
         .onClick(ApolloButtonAction.runCommand("/warps"))
         .build();
      InventoryButton var3 = InventoryButton.builder()
         .id("enderchest")
         .inventoryType(InventoryType.PLAYER)
         .box(InventoryButtonBox.LEFT)
         .position(HudPosition.of(48.0F, 48.0F))
         .size(InventoryButton.SIZE_MEDIUM)
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .content(ApolloButtonContent.builder().append(ItemStackIcon.builder().itemName("ENDER_CHEST").build()).build())
         .tooltip(
            ApolloButtonTooltip.of(
               Component.text("Ender Chest", NamedTextColor.LIGHT_PURPLE),
               Component.text("Open your personal storage", NamedTextColor.GRAY),
               Component.text("Click to open", NamedTextColor.YELLOW)
            )
         )
         .onClick(ApolloButtonAction.runCommand("/enderchest"))
         .build();
      InventoryButton var4 = InventoryButton.builder()
         .id("profile")
         .inventoryType(InventoryType.PLAYER)
         .box(InventoryButtonBox.RIGHT)
         .position(HudPosition.of(4.0F, 4.0F))
         .size(InventoryButton.SIZE_MEDIUM)
         .shape(ApolloButtonShape.CIRCLE)
         .content(ApolloButtonContent.builder().append(ItemStackIcon.builder().itemName("PLAYER_HEAD").build()).build())
         .tooltip(ApolloButtonTooltip.of(Component.text("Your Profile", NamedTextColor.GOLD), Component.text("View your stats", NamedTextColor.GRAY)))
         .onClick(ApolloButtonAction.runCommand("/profile"))
         .build();
      InventoryButton var5 = InventoryButton.builder()
         .id("settings")
         .inventoryType(InventoryType.PLAYER)
         .box(InventoryButtonBox.RIGHT)
         .position(HudPosition.of(48.0F, 4.0F))
         .size(InventoryButton.SIZE_MEDIUM)
         .shape(ApolloButtonShape.CIRCLE)
         .backgroundColor(new Color(222, 160, 60, 85))
         .borderColor(new Color(255, 218, 150, 140))
         .content(ApolloButtonContent.builder().append(ItemStackIcon.builder().itemName("COMPARATOR").build()).build())
         .tooltip(ApolloButtonTooltip.of(Component.text("Settings", NamedTextColor.WHITE), Component.text("Server preferences", NamedTextColor.GRAY)))
         .onClick(ApolloButtonAction.runCommand("/settings"))
         .build();
      InventoryButton var6 = InventoryButton.builder()
         .id("vote")
         .inventoryType(InventoryType.PLAYER)
         .box(InventoryButtonBox.RIGHT)
         .position(HudPosition.of(6.0F, 52.0F))
         .size(InventoryButton.SIZE_WIDE)
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .backgroundColor(new Color(34, 204, 68, 64))
         .borderColor(new Color(190, 255, 205, 110))
         .hoveredBackgroundColor(new Color(34, 204, 68, 130))
         .hoveredBorderColor(new Color(190, 255, 205, 210))
         .content(ApolloButtonContent.builder().append(Component.text("Vote")).build())
         .tooltip(ApolloButtonTooltip.of(Component.text("Vote", NamedTextColor.GREEN), Component.text("Vote daily for rewards", NamedTextColor.GRAY)))
         .onClick(ApolloButtonAction.openUrl("https://example.com/vote"))
         .build();
      InventoryButton var7 = InventoryButton.builder()
         .id("discord")
         .inventoryType(InventoryType.PLAYER)
         .box(InventoryButtonBox.RIGHT)
         .position(HudPosition.of(6.0F, 84.0F))
         .size(InventoryButton.SIZE_WIDE)
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .backgroundColor(new Color(88, 101, 242, 90))
         .borderColor(new Color(150, 160, 250, 140))
         .content(ApolloButtonContent.builder().append(Component.text("Discord")).build())
         .tooltip(ApolloButtonTooltip.of(Component.text("Discord", NamedTextColor.BLUE), Component.text("Join our community", NamedTextColor.GRAY)))
         .onClick(ApolloButtonAction.openUrl("https://lunarclient.dev/discord"))
         .build();
      InventoryButton var8 = InventoryButton.builder()
         .id("lobby")
         .inventoryType(InventoryType.PLAYER)
         .box(InventoryButtonBox.RIGHT)
         .position(HudPosition.of(6.0F, 136.0F))
         .size(InventoryButton.SIZE_WIDE)
         .shape(ApolloButtonShape.ROUNDED_SQUARE)
         .backgroundColor(new Color(224, 64, 64, 128))
         .borderColor(new Color(255, 200, 200, 140))
         .content(ApolloButtonContent.builder().append(Component.text("Back to Lobby")).build())
         .tooltip(ApolloButtonTooltip.of(Component.text("Back to Lobby", NamedTextColor.RED), Component.text("Return to the main lobby", NamedTextColor.GRAY)))
         .onClick(ApolloButtonAction.runCommand("/lobby"))
         .build();
      return new ArrayList<>(Arrays.asList(var0, var1, var2, var3, var4, var5, var6, var7, var8));
   }
}
