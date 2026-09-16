package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   WOOD(NamedTextColor.WHITE),
   FREE(NamedTextColor.WHITE),
   PAID(NamedTextColor.GOLD),
   GOLD(NamedTextColor.YELLOW),
   DIAMOND(NamedTextColor.AQUA),
   EMERALD(NamedTextColor.DARK_GREEN),
   OBSIDIAN(NamedTextColor.DARK_PURPLE),
   BEDROCK(NamedTextColor.DARK_GRAY);

   private static final Pattern CHEST_PATTERN = Pattern.compile("^(?<tier>[A-Za-z]+)( Chest)?( Chest)?$");
   private final NamedTextColor color;

   @Nullable
   public static RCIRROCCCIIHCIHCCRHHCCHOHHHCHH fromString(String var0) {
      Matcher var1 = CHEST_PATTERN.matcher(var0);
      if (!var1.matches()) {
         return null;
      }

      String var2 = var1.group("tier");

      for (RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var6 : values()) {
         if (var6.name().equalsIgnoreCase(var2)) {
            return var6;
         }
      }

      return null;
   }

   @Generated
   public NamedTextColor getColor() {
      return this.color;
   }

   @Generated
   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(NamedTextColor var3) {
      this.color = var3;
   }
}
