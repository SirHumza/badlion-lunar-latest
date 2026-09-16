package com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.util.HashMap;
import java.util.Map;
import lombok.Generated;
import org.jetbrains.annotations.Nullable;

public enum IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   RENDER_COSMETICS("render-cosmetics"),
   RENDER_COSMETICS_ALL("render-cosmetics:all"),
   RENDER_COSMETICS_EQUIPPED("render-cosmetics:equipped"),
   RENDER_EMOTES("render-emotes"),
   RENDER_EMOTES_ALL("render-emotes:all"),
   RENDER_SPRAYS("render-sprays"),
   RENDER_SPRAYS_ALL("render-sprays:all");

   private final String key;
   private static final Map<String, IRCIIHHICIHRCOCRROCOICRIHHCCHH> SCOPES_BY_KEY = new HashMap<>();

   @Nullable
   public static IRCIIHHICIHRCOCRROCOICRIHHCCHH get(String var0) {
      return SCOPES_BY_KEY.get(var0);
   }

   @Generated
   IRCIIHHICIHRCOCRROCOICRIHHCCHH(String var3) {
      this.key = var3;
   }

   static {
      for (IRCIIHHICIHRCOCRROCOICRIHHCCHH var3 : values()) {
         SCOPES_BY_KEY.put(var3.key, var3);
      }
   }
}
