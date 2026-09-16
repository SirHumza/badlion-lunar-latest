package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.text.ITextComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ICommandSender.class)
public interface RCIRROCCCIIHCIHCCRHHCCHOHHHCHH extends IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Shadow
   void addChatMessage$v1_7(ITextComponent var1);

   @Shadow
   void sendMessage$v1_12(ITextComponent var1);

   default void bridge$addChatMessage(
      com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1
   ) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 5) {
         this.sendMessage$v1_12((ITextComponent)var1);
      } else {
         this.addChatMessage$v1_7((ITextComponent)var1);
      }
   }
}
