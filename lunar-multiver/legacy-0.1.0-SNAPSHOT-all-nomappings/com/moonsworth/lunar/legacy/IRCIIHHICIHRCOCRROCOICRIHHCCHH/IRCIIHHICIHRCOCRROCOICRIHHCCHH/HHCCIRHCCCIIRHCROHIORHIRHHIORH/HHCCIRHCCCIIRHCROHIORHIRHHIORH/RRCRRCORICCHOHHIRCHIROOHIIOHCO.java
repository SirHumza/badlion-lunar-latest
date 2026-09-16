package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import java.util.List;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiConfirmOpenLink;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(GuiConfirmOpenLink.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO extends GuiScreen {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Inject(method = "initGui", at = @At("RETURN"))
   private void lunar$centerButtons(CallbackInfo var1) {
      List var2 = this.buttonList$v1_7;
      int var3 = this.width / 2 - 50;
      int var4 = this.height / 6 + 96;
      ((GuiButton)var2.get(0)).x = var3 - 105;
      ((GuiButton)var2.get(0)).y = var4;
      ((GuiButton)var2.get(1)).x = var3;
      ((GuiButton)var2.get(1)).y = var4;
      ((GuiButton)var2.get(2)).x = var3 + 105;
      ((GuiButton)var2.get(2)).y = var4;
   }
}
