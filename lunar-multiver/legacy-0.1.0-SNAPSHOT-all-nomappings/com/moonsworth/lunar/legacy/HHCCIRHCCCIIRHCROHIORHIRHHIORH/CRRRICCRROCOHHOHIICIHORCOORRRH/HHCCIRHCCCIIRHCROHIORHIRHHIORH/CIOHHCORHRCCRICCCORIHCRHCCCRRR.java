package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiDownloadTerrain;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiDownloadTerrain.class)
public abstract class CIOHHCORHRCCRICCCORIHCRHCCCRRR
   extends GuiScreen
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   @Unique
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   private long lunar$screenCreatedAt;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "initGui", at = @At("HEAD"))
   private void lunar$initGui(CallbackInfo var1) {
      this.lunar$screenCreatedAt = System.currentTimeMillis();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 1)
   @Inject(method = "updateScreen$v1_7", at = @At("HEAD"))
   private void lunar$updateScreen(CallbackInfo var1) {
      List var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.buttonList$v1_8 : this.buttonList$v1_7;
      if (System.currentTimeMillis() - this.lunar$screenCreatedAt >= 3000L && var2.isEmpty()) {
         var2.add(new GuiButton(2, this.width / 2 - 100, this.height / 2 + 20, 200, 20, "Disconnect"));
      }
   }

   public void actionPerformed(GuiButton var1) {
      if (this.mc.getCurrentServerData() != null && this.mc.world != null) {
         this.mc.world.sendQuittingDisconnectingPacket();
         this.mc.loadWorld(null);
      }

      if (var1.id == 2) {
         this.mc.displayGuiScreen(new GuiMultiplayer(new GuiMainMenu()));
      }
   }
}
