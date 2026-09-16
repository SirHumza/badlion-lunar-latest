package com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.google.common.base.Strings;
import com.moonsworth.lunar.ichor.util.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.text.TextComponent;
import com.moonsworth.lunar.lib.adventure.text.TranslatableComponent;
import com.moonsworth.lunar.lib.adventure.text.format.Style;
import com.moonsworth.lunar.lib.adventure.text.format.TextColor;
import com.moonsworth.lunar.lib.adventure.text.format.TextDecoration;
import com.moonsworth.lunar.lib.adventure.text.serializer.legacy.LegacyComponentSerializer;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.apache.commons.lang3.mutable.MutableInt;

@CORCOCICIRIOHROHROIIOOHICCHCRR
public class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   private static final Pattern STRIP_COLOR_PATTERN = Pattern.compile("(?i)§[0-9A-FK-OR]");

   public static String stripColor(String var0) {
      return STRIP_COLOR_PATTERN.matcher(var0).replaceAll("");
   }

   public static String getTextContentForRendering(Component var0) {
      StringBuilder var1 = new StringBuilder();
      if (var0.decoration(TextDecoration.OBFUSCATED) == TextDecoration.State.TRUE) {
         var1.append("§k");
      }

      if (var0.decoration(TextDecoration.BOLD) == TextDecoration.State.TRUE) {
         var1.append("§l");
      }

      if (var0.decoration(TextDecoration.STRIKETHROUGH) == TextDecoration.State.TRUE) {
         var1.append("§m");
      }

      if (var0.decoration(TextDecoration.UNDERLINED) == TextDecoration.State.TRUE) {
         var1.append("§n");
      }

      if (var0.decoration(TextDecoration.ITALIC) == TextDecoration.State.TRUE) {
         var1.append("§o");
      }

      return var1.isEmpty() ? asLegacyString(var0) : var1.append(asLegacyString(var0)).append("§r").toString();
   }

   public static String getTextContent(@Nullable Component var0) {
      StringBuilder var1 = new StringBuilder();
      if (var0 instanceof TextComponent var2) {
         var1.append(var2.content());
      } else if (var0 instanceof TranslatableComponent) {
         return STRIP_COLOR_PATTERN.matcher(
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOCRHOROHIHRCRHCRIIIHCHRRHOIIC()
                  .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(asBridge(var0))
            )
            .replaceAll("");
      }

      if (var0 != null) {
         for (Component var3 : var0.children()) {
            var1.append(getTextContent(var3));
         }
      }

      return var1.toString();
   }

   public static Component asAdventure(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0
   ) {
      return var0 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH var1 ? var1.moonBridge$asAdventureComponent() : new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0);
   }

   public static Component asAdventureCached(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0
   ) {
      return var0 instanceof CRRRICCRROCOHHOHIICIHORCOORRRH var1
         ? new HHCCIRHCCCIIRHCROHIORHIRHHIORH(var1.moonBridge$asAdventureComponent())
         : new HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var0);
   }

   public static Style asAdventureStyle(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH var0
   ) {
      return ((RIOOCHICIHRHOHCCCCCHOCCCOHCRHI)var0).moonBridge$asAdventureStyle();
   }

   public static Optional<TextComponent> asAdventureText(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var0
   ) {
      Component var1 = ((CRRRICCRROCOHHOHIICIHORCOORRRH)var0).moonBridge$asAdventureComponent();
      return var1 instanceof TextComponent ? Optional.of((TextComponent)var1) : Optional.empty();
   }

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH asBridge(
      Component var0
   ) {
      return var0 == null ? null : ((RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var0).moonBridge$asBridgeComponent();
   }

   public static com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH asBridgeStyle(
      Style var0
   ) {
      return ((IRCIIHHICIHRCOCRROCOICRIHHCCHH)var0).moonBridge$asBridgeStyle();
   }

   public static String asLegacyString(Component var0) {
      return LegacyComponentSerializer.legacySection().serialize(var0);
   }

   public static TextComponent asAdventure(String var0) {
      if (var0 == null) {
         return Component.empty();
      }

      if (var0.contains("§")) {
         StringBuilder var1 = new StringBuilder();
         var1.append(var0.charAt(0));

         for (int var2 = 1; var2 < var0.length(); var2++) {
            if (var0.charAt(var2 - 1) == 167) {
               var1.append(Character.toLowerCase(var0.charAt(var2)));
            } else {
               var1.append(var0.charAt(var2));
            }
         }

         return LegacyComponentSerializer.legacySection().deserialize(var1.toString());
      } else {
         return Component.text(var0);
      }
   }

   @Nullable
   public static Boolean asBoolean(TextDecoration.State var0) {
      if (var0 == TextDecoration.State.TRUE) {
         return true;
      } else {
         return var0 == TextDecoration.State.FALSE ? false : null;
      }
   }

   public static boolean doesComponentContain(Component var0, String... var1) {
      String var2 = stripColor(getTextContent(var0));

      for (String var6 : var1) {
         if (var6 != null && !var6.isEmpty() && var2.contains(var6)) {
            return true;
         }
      }

      return false;
   }

   public static boolean doesComponentContainWord(Component var0, String... var1) {
      String var2 = stripColor(getTextContent(var0));

      for (String var6 : var1) {
         if (!Strings.isNullOrEmpty(var6)) {
            Pattern var7 = Pattern.compile("(^|\\W)" + Pattern.quote(var6) + "(\\W|$)");
            if (var7.matcher(var2).find()) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean doesComponentEqual(Component var0, String var1) {
      return var1 == null ? false : getTextContent(var0).equals(var1);
   }

   @Nullable
   public static TextComponent getFirstTextComponent(Component var0) {
      if (var0 instanceof TextComponent var1 && !var1.content().isEmpty()) {
         return var1;
      } else {
         for (Component var2 : var0.children()) {
            TextComponent var3 = getFirstTextComponent(var2);
            if (var3 != null) {
               return var3;
            }
         }

         return null;
      }
   }

   @Nullable
   public static Component getFirstColoredComponent(Component var0) {
      if (var0.style().color() != null) {
         return var0;
      }

      for (Component var2 : var0.children()) {
         Component var3 = getFirstColoredComponent(var2);
         if (var3 != null) {
            return var3;
         }
      }

      return null;
   }

   @Nullable
   public static TextComponent getLastTextComponent(Component var0) {
      if (var0 instanceof TextComponent var1 && !var1.content().isEmpty()) {
         return var1;
      } else {
         List var4 = var0.children();

         for (int var2 = var4.size() - 1; var2 >= 0; var2--) {
            TextComponent var3 = getLastTextComponent((Component)var4.get(var2));
            if (var3 != null) {
               return var3;
            }
         }

         return null;
      }
   }

   @Nullable
   public static TextComponent forTextComponents(Component var0, Predicate<TextComponent> var1) {
      if (var0 instanceof TextComponent var2 && !var2.content().isEmpty() && var1.test(var2)) {
         return var2;
      } else {
         for (Component var3 : var0.children()) {
            TextComponent var4 = forTextComponents(var3, var1);
            if (var4 != null) {
               return var4;
            }
         }

         return null;
      }
   }

   @Nullable
   private static TextComponent getTextComponentPiece(Component var0, MutableInt var1) {
      if (var0 instanceof TextComponent var2 && !var2.content().isEmpty()) {
         if (var1.getValue() <= 0) {
            return var2;
         }

         var1.decrement();
      }

      for (Component var3 : var0.children()) {
         TextComponent var4 = getTextComponentPiece(var3, var1);
         if (var4 != null) {
            return var4;
         }
      }

      return null;
   }

   @Nullable
   public static TextComponent getTextComponentPiece(Component var0, int var1) {
      return getTextComponentPiece(var0, new MutableInt(var1));
   }

   public static boolean containsColoredText(Component var0, TextColor var1, String var2) {
      if (var0 instanceof TextComponent var3
         && !var3.content().isEmpty()
         && var0.color() != null
         && var0.color().value() == var1.value()
         && var3.content().contains(var2)) {
         return true;
      } else {
         for (Component var4 : var0.children()) {
            if (containsColoredText(var4, var1, var2)) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean containsColoredText(Component var0, TextColor var1, String... var2) {
      if (var0 instanceof TextComponent var3 && !var3.content().isEmpty() && var0.color() != null && var0.color().value() == var1.value()) {
         String var4 = var3.content();

         for (String var8 : var2) {
            if (var4.contains(var8)) {
               return true;
            }
         }
      }

      for (Component var10 : var0.children()) {
         if (containsColoredText(var10, var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public static TextComponent findFirst(Component var0, String var1) {
      if (var0 instanceof TextComponent var2 && var2.content().equals(var1)) {
         return var2;
      } else {
         for (Component var3 : var0.children()) {
            TextComponent var4 = findFirst(var3, var1);
            if (var4 != null) {
               return var4;
            }
         }

         return null;
      }
   }

   public static boolean startsWith(Component var0, String var1) {
      TextComponent var2 = getFirstTextComponent(var0);
      return var2 != null && var2.content().startsWith(var1);
   }

   public static boolean startsWith(Component var0, String var1, TextColor var2) {
      TextComponent var3 = getFirstTextComponent(var0);
      return var3 != null && var3.color() != null && var3.color().value() == var2.value() && var3.content().startsWith(var1);
   }

   public static boolean startsWith(Component var0, TextColor var1) {
      TextComponent var2 = getFirstTextComponent(var0);
      return var2 != null && var2.color() != null && var2.color().value() == var1.value();
   }

   public static boolean endsWith(Component var0, String var1) {
      TextComponent var2 = getFirstTextComponent(var0);
      return var2 != null && var2.content().endsWith(var1);
   }

   public static boolean endsWith(Component var0, String var1, TextColor var2) {
      TextComponent var3 = getLastTextComponent(var0);
      return var3 != null && var3.color() != null && var3.color().value() == var2.value() && var3.content().endsWith(var1);
   }

   public static boolean endsWith(Component var0, TextColor var1) {
      TextComponent var2 = getFirstTextComponent(var0);
      return var2 != null && var2.color() != null && var2.color().value() == var1.value();
   }

   public static float getTextWidth(
      Component var0,
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1
   ) {
      return var1.bridge$getStringWidth(var0);
   }
}
