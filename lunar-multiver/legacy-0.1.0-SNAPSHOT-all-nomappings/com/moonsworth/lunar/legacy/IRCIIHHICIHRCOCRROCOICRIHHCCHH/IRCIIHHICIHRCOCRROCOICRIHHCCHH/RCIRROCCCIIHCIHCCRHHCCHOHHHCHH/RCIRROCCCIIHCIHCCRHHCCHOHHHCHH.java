package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import com.moonsworth.lunar.lib.adventure.key.Key;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(Key.class)
public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Overwrite
   static Key key(String var0, String var1) {
      return (Key)(new ResourceLocation(var0, var1));
   }
}
