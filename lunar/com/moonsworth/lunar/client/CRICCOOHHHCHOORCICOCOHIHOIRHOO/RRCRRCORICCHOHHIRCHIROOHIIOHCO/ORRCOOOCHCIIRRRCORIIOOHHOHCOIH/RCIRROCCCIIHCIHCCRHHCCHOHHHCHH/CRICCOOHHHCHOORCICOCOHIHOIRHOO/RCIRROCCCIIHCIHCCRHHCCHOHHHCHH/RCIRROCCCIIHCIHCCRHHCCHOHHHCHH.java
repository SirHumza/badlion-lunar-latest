package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.format.NamedTextColor;
import java.util.regex.Pattern;
import lombok.Generated;

public enum RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   FOREST_WHISPER(
      "Forest Whispers",
      NamedTextColor.DARK_GREEN,
      IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 33 ? IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO().IICOROHICIHHROCIRORRHOIRHIHOOI() : null
   ),
   DESERT_WHISPER(
      "Desert Whispers",
      NamedTextColor.GOLD,
      IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 33 ? IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIHHIHOORIIHCOORRRICHHCCRRRCHO().CRCORICIHRRHHCIIIOCCIIOIIIOCOO() : null
   );

   private final String id;
   private final NamedTextColor color;
   private final Pattern pattern;
   private final HRCHROOHRIHCRCRHRIIROCIRHOIRHH icon;

   RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(String var3, NamedTextColor var4, HRCHROOHRIHCRCRHRIIROCIRHOIRHH var5) {
      this.id = var3;
      this.color = var4;
      this.pattern = Pattern.compile("^" + var3 + ": (.+)$");
      this.icon = var5;
   }

   @Generated
   public String getId() {
      return this.id;
   }

   @Generated
   public NamedTextColor getColor() {
      return this.color;
   }

   @Generated
   public Pattern getPattern() {
      return this.pattern;
   }

   @Generated
   public HRCHROOHRIHCRCRHRIIROCIRHOIRHH getIcon() {
      return this.icon;
   }
}
