package com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.ORRCOOOCHCIIRRRCORIIOOHHOHCOIH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.Generated;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   MINOS_HUNTER("Minos Hunter", false),
   SIAMESE_LYNXES("Siamese Lynxes", false),
   GAIA_CONSTRUCT("Gaia Construct", false),
   MINOTAUR("Minotaur", false),
   NYMPH("Stranded Nymph", false),
   HARPY("Harpy", false),
   CRETAN_BULL("Cretan Bull", false),
   MINOS_CHAMPION("Minos Champion", false),
   SPHINX("Sphinx", false),
   MINOS_INQUISITOR("Minos Inquisitor", true),
   MANTICORE("Manticore", true),
   KING_MINOS("King Minos", true);

   private final String name;
   private final boolean enabledByDefault;

   public static Set<String> names() {
      return Arrays.stream(values()).map(IRCIIHHICIHRCOCRROCOICRIHHCCHH::getName).collect(Collectors.toSet());
   }

   public static Set<String> noLynxes() {
      return Arrays.stream(values()).filter(var0 -> var0 != SIAMESE_LYNXES).map(IRCIIHHICIHRCOCRROCOICRIHHCCHH::getName).collect(Collectors.toSet());
   }

   public static Set<String> getEnabledByDefault() {
      return Arrays.stream(values()).filter(var0 -> var0.enabledByDefault).map(IRCIIHHICIHRCOCRROCOICRIHHCCHH::getName).collect(Collectors.toSet());
   }

   @Generated
   public String getName() {
      return this.name;
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3, boolean var4) {
      this.name = var3;
      this.enabledByDefault = var4;
   }
}
