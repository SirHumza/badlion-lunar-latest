package com.moonsworth.lunar.legacy.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.client.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import com.moonsworth.lunar.lib.adventure.nbt.api.BinaryTagHolder;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent;
import com.moonsworth.lunar.lib.adventure.text.event.ClickEvent.Action;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.ShowEntity;
import com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.ShowItem;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.serializer.gson.GsonComponentSerializer;
import com.moonsworth.lunar.lib.adventure.util.Codec;
import java.io.IOException;
import java.util.Objects;
import javax.annotation.Nullable;
import lombok.NonNull;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.nbt.NBTException;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.event.ClickEvent;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   public static final GsonComponentSerializer IROIRRCHCORRCCCIIRHIOOIHRICHCH = GsonComponentSerializer.builder()
      .legacyHoverEventSerializer(IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCIRIRROHRCOOHCIOCHHIIOOCHCRO)
      .build();
   public static final Codec<NBTTagCompound, String, IOException, IOException> CCRRCRRORORCICIRORCCHROOCIHOII = new Codec<NBTTagCompound, String, IOException, IOException>() {
      @NonNull
      public NBTTagCompound ROOCHOCCIHCIIIRHHCROCIHHCICOIH(@NonNull String var1) {
         if (var1 == null) {
            throw new NullPointerException("encoded is marked non-null but is null");
         }

         try {
            return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? JsonToNBT.getTagFromJson$v1_8(var1) : (NBTTagCompound)JsonToNBT.func_150315_a$v1_7(var1);
         } catch (NBTException | ClassCastException var3) {
            throw new IOException(var3);
         }
      }

      @NonNull
      public String IRCIIHHICIHRCOCRROCOICRIHHCCHH(@NonNull NBTTagCompound var1) {
         if (var1 == null) {
            throw new NullPointerException("decoded is marked non-null but is null");
         } else {
            return var1.toString();
         }
      }
   };

   public static TextFormatting OOROOCCIRCCRHOIOIORIHCHHOOCCOR(TextColor var0) {
      return var0 == null ? null : IRCIIHHICIHRCOCRROCOICRIHHCCHH(NamedTextColor.nearestTo(var0));
   }

   public static TextFormatting IRCIIHHICIHRCOCRROCOICRIHHCCHH(NamedTextColor var0) {
      if (var0 == NamedTextColor.BLACK) {
         return TextFormatting.BLACK;
      } else if (var0 == NamedTextColor.DARK_BLUE) {
         return TextFormatting.DARK_BLUE;
      } else if (var0 == NamedTextColor.DARK_GREEN) {
         return TextFormatting.DARK_GREEN;
      } else if (var0 == NamedTextColor.DARK_AQUA) {
         return TextFormatting.DARK_AQUA;
      } else if (var0 == NamedTextColor.DARK_RED) {
         return TextFormatting.DARK_RED;
      } else if (var0 == NamedTextColor.DARK_PURPLE) {
         return TextFormatting.DARK_PURPLE;
      } else if (var0 == NamedTextColor.GOLD) {
         return TextFormatting.GOLD;
      } else if (var0 == NamedTextColor.GRAY) {
         return TextFormatting.GRAY;
      } else if (var0 == NamedTextColor.DARK_GRAY) {
         return TextFormatting.DARK_GRAY;
      } else if (var0 == NamedTextColor.BLUE) {
         return TextFormatting.BLUE;
      } else if (var0 == NamedTextColor.GREEN) {
         return TextFormatting.GREEN;
      } else if (var0 == NamedTextColor.AQUA) {
         return TextFormatting.AQUA;
      } else if (var0 == NamedTextColor.RED) {
         return TextFormatting.RED;
      } else if (var0 == NamedTextColor.LIGHT_PURPLE) {
         return TextFormatting.LIGHT_PURPLE;
      } else if (var0 == NamedTextColor.YELLOW) {
         return TextFormatting.YELLOW;
      } else if (var0 == NamedTextColor.WHITE) {
         return TextFormatting.WHITE;
      } else {
         throw new IllegalArgumentException();
      }
   }

   @Nullable
   public static NamedTextColor RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable TextFormatting var0) {
      if (var0 == null) {
         return null;
      } else if (var0 == TextFormatting.BLACK) {
         return NamedTextColor.BLACK;
      } else if (var0 == TextFormatting.DARK_BLUE) {
         return NamedTextColor.DARK_BLUE;
      } else if (var0 == TextFormatting.DARK_GREEN) {
         return NamedTextColor.DARK_GREEN;
      } else if (var0 == TextFormatting.DARK_AQUA) {
         return NamedTextColor.DARK_AQUA;
      } else if (var0 == TextFormatting.DARK_RED) {
         return NamedTextColor.DARK_RED;
      } else if (var0 == TextFormatting.DARK_PURPLE) {
         return NamedTextColor.DARK_PURPLE;
      } else if (var0 == TextFormatting.GOLD) {
         return NamedTextColor.GOLD;
      } else if (var0 == TextFormatting.GRAY) {
         return NamedTextColor.GRAY;
      } else if (var0 == TextFormatting.DARK_GRAY) {
         return NamedTextColor.DARK_GRAY;
      } else if (var0 == TextFormatting.BLUE) {
         return NamedTextColor.BLUE;
      } else if (var0 == TextFormatting.GREEN) {
         return NamedTextColor.GREEN;
      } else if (var0 == TextFormatting.AQUA) {
         return NamedTextColor.AQUA;
      } else if (var0 == TextFormatting.RED) {
         return NamedTextColor.RED;
      } else if (var0 == TextFormatting.LIGHT_PURPLE) {
         return NamedTextColor.LIGHT_PURPLE;
      } else {
         return var0 == TextFormatting.YELLOW ? NamedTextColor.YELLOW : NamedTextColor.WHITE;
      }
   }

   public static ClickEvent RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(com.moonsworth.lunar.lib.adventure.text.event.ClickEvent var0) {
      if (var0 == null) {
         return null;
      }

      if (var0.action() == Action.OPEN_URL && RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.CHCCHOIHRRRCCRRCCHIRIRCORRHIHR(var0.value())) {
         return null;
      }

      net.minecraft.util.text.event.ClickEvent.Action var1 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.action());
      return var1 != null ? new ClickEvent(var1, var0.value()) : null;
   }

   public static net.minecraft.util.text.event.ClickEvent.Action RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(Action var0) {
      if (Objects.requireNonNull(var0) == Action.OPEN_URL) {
         return net.minecraft.util.text.event.ClickEvent.Action.OPEN_URL;
      } else if (var0 == Action.OPEN_FILE) {
         return net.minecraft.util.text.event.ClickEvent.Action.OPEN_FILE;
      } else if (var0 == Action.RUN_COMMAND) {
         return net.minecraft.util.text.event.ClickEvent.Action.RUN_COMMAND;
      } else if (var0 == Action.SUGGEST_COMMAND) {
         return net.minecraft.util.text.event.ClickEvent.Action.SUGGEST_COMMAND;
      } else if (var0 == Action.CHANGE_PAGE && IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return net.minecraft.util.text.event.ClickEvent.Action.CHANGE_PAGE$v1_8;
      } else if (var0 == Action.COPY_TO_CLIPBOARD) {
         return null;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static Action RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(net.minecraft.util.text.event.ClickEvent.Action var0) {
      if (Objects.requireNonNull(var0) == net.minecraft.util.text.event.ClickEvent.Action.OPEN_URL) {
         return Action.OPEN_URL;
      } else if (var0 == net.minecraft.util.text.event.ClickEvent.Action.OPEN_FILE) {
         return Action.OPEN_FILE;
      } else if (var0 == net.minecraft.util.text.event.ClickEvent.Action.RUN_COMMAND) {
         return Action.RUN_COMMAND;
      } else if (var0 == net.minecraft.util.text.event.ClickEvent.Action.SUGGEST_COMMAND) {
         return Action.SUGGEST_COMMAND;
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION <= 1 && var0 == net.minecraft.util.text.event.ClickEvent.Action.TWITCH_USER_INFO$v1_7) {
         return null;
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && var0 == net.minecraft.util.text.event.ClickEvent.Action.CHANGE_PAGE$v1_8) {
         return Action.CHANGE_PAGE;
      } else {
         throw new IllegalArgumentException(var0.name());
      }
   }

   public static HoverEvent<?> RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(net.minecraft.util.text.event.HoverEvent var0) {
      net.minecraft.util.text.event.HoverEvent.Action var1 = var0.action;

      try {
         if (Objects.requireNonNull(var1) == net.minecraft.util.text.event.HoverEvent.Action.SHOW_ITEM) {
            TextComponent var4;
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               var4 = Component.text(var0.value$v1_8.getUnformattedText());
            } else {
               var4 = Component.text(var0.value$v1_7.getUnformattedText());
            }

            return HoverEvent.showItem(IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCIRIRROHRCOOHCIOCHHIIOOCHCRO.deserializeShowItem(var4));
         } else {
            Component var2;
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.value$v1_8);
            } else {
               var2 = RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0.value$v1_7);
            }

            if (var1 == net.minecraft.util.text.event.HoverEvent.Action.SHOW_TEXT) {
               return HoverEvent.showText(var2);
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 && var1 == net.minecraft.util.text.event.HoverEvent.Action.SHOW_ACHIEVEMENT$v1_7) {
               return HoverEvent.showText(var2);
            } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && var1 == net.minecraft.util.text.event.HoverEvent.Action.SHOW_ENTITY$v1_8) {
               return HoverEvent.showEntity(
                  IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCIRIRROHRCOOHCIOCHHIIOOCHCRO.deserializeShowEntity(var2, IROIRRCHCORRCCCIIRHIOOIHRICHCH::deserialize)
               );
            } else {
               throw new IllegalArgumentException();
            }
         }
      } catch (IOException var3) {
         throw new IllegalArgumentException("Failed to convert", var3);
      }
   }

   public static net.minecraft.util.text.event.HoverEvent.Action RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
      com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.Action<?> var0
   ) {
      if (var0 == com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.Action.SHOW_TEXT) {
         return net.minecraft.util.text.event.HoverEvent.Action.SHOW_TEXT;
      } else if (var0 == com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.Action.SHOW_ITEM) {
         return net.minecraft.util.text.event.HoverEvent.Action.SHOW_ITEM;
      } else if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && var0 == com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.Action.SHOW_ENTITY) {
         return net.minecraft.util.text.event.HoverEvent.Action.SHOW_ENTITY$v1_8;
      } else {
         throw new IllegalArgumentException(var0.toString());
      }
   }

   public static net.minecraft.util.text.event.HoverEvent RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable HoverEvent<?> var0) {
      if (var0 == null) {
         return null;
      }

      com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.Action var1 = var0.action();

      try {
         if (var1 == com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.Action.SHOW_TEXT) {
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               return new net.minecraft.util.text.event.HoverEvent(
                  net.minecraft.util.text.event.HoverEvent.Action.SHOW_TEXT, RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO((Component)var0.value())
               );
            }

            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               return new net.minecraft.util.text.event.HoverEvent(
                  net.minecraft.util.text.event.HoverEvent.Action.SHOW_TEXT, RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO((Component)var0.value())
               );
            }

            return new net.minecraft.util.text.event.HoverEvent(
               net.minecraft.util.text.event.HoverEvent.Action.SHOW_TEXT, IHCRORHRORIICHRHRCHRRIRRHHOCOO((Component)var0.value())
            );
         }

         if (var1 == com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.Action.SHOW_ITEM) {
            ShowItem var5 = (ShowItem)var0.value();
            Component var6 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCIRIRROHRCOOHCIOCHHIIOOCHCRO.serializeShowItem(var5);
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               return new net.minecraft.util.text.event.HoverEvent(
                  net.minecraft.util.text.event.HoverEvent.Action.SHOW_ITEM, RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var6)
               );
            }

            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
               return new net.minecraft.util.text.event.HoverEvent(
                  net.minecraft.util.text.event.HoverEvent.Action.SHOW_ITEM, RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var6)
               );
            }

            return new net.minecraft.util.text.event.HoverEvent(net.minecraft.util.text.event.HoverEvent.Action.SHOW_ITEM, IHCRORHRORIICHRHRCHRRIRRHHOCOO(var6));
         }

         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && var1 == com.moonsworth.lunar.lib.adventure.text.event.HoverEvent.Action.SHOW_ENTITY) {
            ShowEntity var2 = (ShowEntity)var0.value();
            Component var3 = IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCIRIRROHRCOOHCIOCHHIIOOCHCRO.serializeShowEntity(var2, IROIRRCHCORRCCCIIRHIOOIHRICHCH::serialize);
            if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
               return new net.minecraft.util.text.event.HoverEvent(
                  net.minecraft.util.text.event.HoverEvent.Action.SHOW_ENTITY$v1_8, RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var3)
               );
            }

            return new net.minecraft.util.text.event.HoverEvent(
               net.minecraft.util.text.event.HoverEvent.Action.SHOW_ENTITY$v1_8, RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(var3)
            );
         }
      } catch (IOException var4) {
         throw new IllegalArgumentException("Failed to convert", var4);
      }

      throw new IllegalArgumentException(var0.toString());
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public static ITextComponent RRIRHHRRRHRRCRCRHCCOHOHHRCCOOO(Component var0) {
      return var0 == null ? (ITextComponent)(new TextComponentString("")) : (ITextComponent)RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(var0);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public static IChatComponent IHCRORHRORIICHRHRCHRRIRRHHOCOO(Component var0) {
      return var0 == null ? (IChatComponent)(new TextComponentString("")) : (IChatComponent)RRCRRCORICCHOHHIRCHIROOHIIOHCO.asBridge(var0);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public static Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ITextComponent var0) {
      return (Component)(var0 == null ? Component.empty() : ((CRRRICCRROCOHHOHIICIHORCOORRRH)var0).moonBridge$asAdventureComponent());
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public static Component RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(IChatComponent var0) {
      return (Component)(var0 == null ? Component.empty() : ((CRRRICCRROCOHHOHIICIHORCOORRRH)var0).moonBridge$asAdventureComponent());
   }

   @Nullable
   public static NBTTagCompound RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable BinaryTagHolder var0) {
      if (var0 == null) {
         return null;
      }

      try {
         return (NBTTagCompound)var0.get(CCRRCRRORORCICIRORCCHROOCIHOII);
      } catch (IOException var2) {
         return null;
      }
   }

   @Nullable
   public static BinaryTagHolder RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(@Nullable NBTTagCompound var0) {
      if (var0 == null) {
         return null;
      }

      try {
         return BinaryTagHolder.encode(var0, CCRRCRRORORCICIRORCCHROOCIHOII);
      } catch (IOException var2) {
         return null;
      }
   }
}
