package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.util.List;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiDisconnected;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.multiplayer.GuiConnecting;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.util.IChatComponent;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiDisconnected.class)
public abstract class OCOHORHCROHICRRIHCIHHRRCIHICRI
   extends GuiScreen
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.CIOHHCORHRCCRICCCORIHCRHCCCRRR,
   com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.ORHIOICIOCRRHOOCOHRORIHICHRCRR {
   @Final
   @Shadow
   public GuiScreen parentScreen;
   @Shadow
   public int textHeight$v1_8;
   @Shadow
   public IChatComponent message$v1_7;
   @Unique
   private static final int lunar$CANCEL_BUTTON_SIZE = 20;
   @Unique
   private static final int lunar$CANCEL_BUTTON_GAP = 4;
   @Unique
   private GuiButton lunar$reconnectButton;
   @Unique
   private GuiButton lunar$cancelButton;
   @Unique
   private boolean lunar$cancelButtonVisible;
   @Unique
   private boolean lunar$reconnectCancelled;

   @Inject(method = "initGui", at = @At("TAIL"))
   private void lunar$initGui(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION != 0
         || this.message$v1_7 == null
         || !this.message$v1_7.getFormattedText().equals("You have died. Game over, man, it's game over!§r")) {
         int var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
            ? this.height / 2 + this.textHeight$v1_8 / 2 + this.fontRenderer.FONT_HEIGHT
            : this.height / 4 + 120 + 12;
         List var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 ? this.buttonList$v1_8 : this.buttonList$v1_7;
         this.lunar$reconnectButton = new GuiButton(
            1,
            this.width / 2 - 100,
            var2 + 25,
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "reconnect", new Object[0])
         );
         var3.add(this.lunar$reconnectButton);
         this.lunar$cancelButton = new GuiButton(
            2,
            0,
            var2 + 25,
            20,
            20,
            IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
               .CCHHHHCICRCCCIOOIOICOOCRCRHCCR()
               .RCIRROCCCIIHCIHCCRHHCCHOHHHCHH("gui.components", "cancelAutoReconnect", new Object[0])
         );
         this.lunar$cancelButton.visible = this.lunar$cancelButtonVisible;
         var3.add(this.lunar$cancelButton);
         this.lunar$placeButtonRow();
      }
   }

   @Unique
   private void lunar$placeButtonRow() {
      if (this.lunar$cancelButton != null && this.lunar$reconnectButton != null) {
         int var1 = this.lunar$reconnectButton.width;
         if (this.lunar$cancelButtonVisible) {
            var1 += 24;
         }

         this.lunar$reconnectButton.x = (this.width - var1) / 2;
         this.lunar$cancelButton.x = this.lunar$reconnectButton.x + this.lunar$reconnectButton.width + 4;
         this.lunar$cancelButton.y = this.lunar$reconnectButton.y;
      }
   }

   @Inject(method = "actionPerformed", at = @At("HEAD"), cancellable = true)
   private void lunar$actionPerformed(GuiButton var1, CallbackInfo var2) {
      if (var1.id == 0 && this.parentScreen instanceof GuiDisconnected) {
         this.mc.displayGuiScreen(new GuiMultiplayer(new GuiMainMenu()));
         var2.cancel();
      } else if (var1.id == 1) {
         this.bridge$reconnect();
      } else if (var1.id == 2) {
         this.lunar$reconnectCancelled = true;
         this.bridge$setCancelButtonVisible(false);
      }
   }

   @Unique
   private ServerData lunar$getServerData() {
      ServerData var1 = this.mc.getCurrentServerData();
      if (var1 == null) {
         var1 = (ServerData)IICCOOCHCHROORHHIIHROHCCRHRCOR.HHICOIRCIIRIRRICOOCROCCOHRCRRI().bridge$lastServerData();
      }

      return var1;
   }

   public boolean bridge$canReconnect() {
      return this.lunar$reconnectButton != null && this.lunar$getServerData() != null;
   }

   public void bridge$reconnect() {
      ServerData var1 = this.lunar$getServerData();
      if (var1 != null) {
         this.mc.displayGuiScreen(new GuiConnecting(this.parentScreen, this.mc, var1));
      }
   }

   public void bridge$setReconnectButtonText(String var1) {
      if (this.lunar$reconnectButton != null) {
         this.lunar$reconnectButton.displayString = var1;
      }
   }

   public void bridge$setCancelButtonVisible(boolean var1) {
      this.lunar$cancelButtonVisible = var1;
      if (this.lunar$cancelButton != null) {
         this.lunar$cancelButton.visible = var1;
      }

      this.lunar$placeButtonRow();
   }

   public boolean bridge$isReconnectCancelled() {
      return this.lunar$reconnectCancelled;
   }

   @Inject(method = "drawScreen", at = @At("HEAD"), cancellable = true)
   private void lunar$drawScreen(int var1, int var2, float var3, CallbackInfo var4) {
      if (this.fontRenderer == null) {
         var4.cancel();
      }
   }
}
