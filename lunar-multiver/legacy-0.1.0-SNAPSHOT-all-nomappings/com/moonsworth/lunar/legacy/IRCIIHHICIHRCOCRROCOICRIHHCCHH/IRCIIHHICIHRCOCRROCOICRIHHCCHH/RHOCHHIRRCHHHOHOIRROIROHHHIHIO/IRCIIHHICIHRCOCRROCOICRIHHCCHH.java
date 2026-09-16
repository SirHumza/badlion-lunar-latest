package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;

import com.moonsworth.lunar.client.util.RIRHOCHIORCCIIOIIRHOCCCRHHCHHH;
import javax.annotation.Nullable;
import net.minecraft.util.text.TextFormatting;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(TextFormatting.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Nullable
   @Overwrite
   public static String getTextWithoutFormattingCodes(String var0) {
      return RIRHOCHIORCCIIOIIRHOCCCRHHCHHH.getTextWithoutFormattingCodes(var0);
   }
}
