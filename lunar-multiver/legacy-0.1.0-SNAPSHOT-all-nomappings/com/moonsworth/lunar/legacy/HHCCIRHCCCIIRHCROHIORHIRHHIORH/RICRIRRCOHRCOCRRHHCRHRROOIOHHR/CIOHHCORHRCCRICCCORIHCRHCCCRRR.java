package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.ORHIOICIOCRRHOOCOHRORIHICHRCRR;
import net.minecraft.util.text.TextFormatting;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TextFormatting.class)
public class CIOHHCORHRCCRICCCORIHCRHCCCRRR implements ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   @Final
   @Shadow
   public char formattingCode;

   public char bridge$formattingCode() {
      return this.formattingCode;
   }
}
