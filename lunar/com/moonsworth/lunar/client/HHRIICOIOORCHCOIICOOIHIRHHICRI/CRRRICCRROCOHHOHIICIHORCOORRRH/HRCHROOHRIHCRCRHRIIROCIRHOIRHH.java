package com.moonsworth.lunar.client.HHRIICOIOORCHCOIICOOIHIRHHICRI.CRRRICCRROCOHHOHIICIHORCOORRRH;

import java.util.Objects;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

public interface HRCHROOHRIHCRCRHRIIROCIRHOIRHH {
   HRCHROOHRIHCRCRHRIIROCIRHOIRHH ORCHCCHICIRHCRHOHIRORCOCHOHRIO = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH() {
      @Override
      public <T extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> @Nullable T getFeature() {
         return null;
      }
   };

   <T extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> @Nullable T getFeature();

   default <T extends com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH> T RHCICORHIHIIHRHHIIHICRICOIRCHO() {
      return Objects.requireNonNull(this.getFeature(), "Option has no linked feature");
   }

   default boolean isEnabled() {
      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.IRCIIHHICIHRCOCRROCOICRIHHCCHH var1 = this.getFeature();
      return var1 == null || var1.isEnabled();
   }

   static HRCHROOHRIHCRCRHRIIROCIRHOIRHH IIOIROIHIHHCCRICRCOOCHIICHRCOI(@NotNull IRCIIHHICIHRCOCRROCOICRIHHCCHH var0) {
      return new OOROOCCIRCCRHOIOIORIHCHHOOCCOR(var0);
   }
}
