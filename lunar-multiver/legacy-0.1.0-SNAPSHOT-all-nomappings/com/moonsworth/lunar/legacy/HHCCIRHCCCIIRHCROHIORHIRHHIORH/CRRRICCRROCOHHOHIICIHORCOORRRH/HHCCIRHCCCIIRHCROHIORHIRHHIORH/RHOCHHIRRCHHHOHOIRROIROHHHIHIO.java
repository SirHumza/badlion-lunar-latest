package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.title.Title;
import com.moonsworth.lunar.lib.adventure.title.Title.Times;
import com.moonsworth.lunar.lib.adventure.util.Ticks;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiNewChat;
import net.minecraft.client.gui.GuiPlayerTabOverlay;
import net.minecraft.client.network.NetHandlerPlayClient;
import net.minecraft.scoreboard.ScoreObjective;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiIngame.class)
public abstract class RHOCHHIRRCHHHOHOIRROIROHHHIHIO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   @Final
   @Shadow
   public Minecraft mc;
   @Shadow
   public String overlayMessage;
   @Shadow
   public int overlayMessageTime;
   @Shadow
   public boolean animateOverlayMessageColor;
   @Shadow
   public int titlesTimer$v1_8;
   @Shadow
   public String displayedTitle$v1_8;
   @Shadow
   public String displayedSubTitle$v1_8;
   @Shadow
   public int titleFadeIn$v1_8;
   @Shadow
   public int titleDisplayTime$v1_8;
   @Shadow
   public int titleFadeOut$v1_8;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Unique
   private float bridge$scale;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Unique
   private float bridge$interpolationScale;
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Unique
   private float bridge$interpolationRate;

   @Shadow
   public abstract GuiNewChat getChatGUI();

   @Shadow
   public abstract int getUpdateCounter();

   @Shadow
   public abstract void renderGameOverlay$v1_8(float var1);

   @Shadow
   public abstract void renderGameOverlay$v1_7(float var1, boolean var2, int var3, int var4);

   @Shadow
   public abstract void displayTitle$v1_8(String var1, String var2, int var3, int var4, int var5);

   @Shadow
   public abstract GuiPlayerTabOverlay getTabList$v1_8();

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO bridge$getChatGUI() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IHIRRIIORRHORHRORIHOROIRCORCOO)this.getChatGUI();
   }

   public void bridge$renderGameOverlay(float var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.renderGameOverlay$v1_8(var1);
      } else {
         this.renderGameOverlay$v1_7(var1, true, 0, 0);
      }
   }

   public boolean bridge$showCrosshair() {
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1 && this.mc.playerController.isSpectator$v1_8() || this.mc.pointedEntity == null;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public void bridge$displayTitle(@Nullable Component var1, @Nullable Component var2, Times var3, float var4, float var5, float var6) {
      if (var1 != null || var2 != null) {
         if (var1 != null) {
            this.displayedTitle$v1_8 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(
               var1
            );
         }

         if (var2 != null) {
            this.displayedSubTitle$v1_8 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(
               var2
            );
         }

         this.titleFadeIn$v1_8 = (int)(var3.fadeIn().toMillis() / 50L);
         this.titleDisplayTime$v1_8 = (int)(var3.stay().toMillis() / 50L);
         this.titleFadeOut$v1_8 = (int)(var3.fadeOut().toMillis() / 50L);
         this.titlesTimer$v1_8 = this.titleFadeIn$v1_8 + this.titleDisplayTime$v1_8 + this.titleFadeOut$v1_8;
         this.bridge$scale = var4;
         this.bridge$interpolationScale = var5;
         this.bridge$interpolationRate = var6;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public void bridge$clearTitle() {
      this.titleFadeIn$v1_8 = 10;
      this.titleDisplayTime$v1_8 = 70;
      this.titleFadeOut$v1_8 = 20;
      this.titlesTimer$v1_8 = 0;
      this.displayedTitle$v1_8 = null;
      this.displayedSubTitle$v1_8 = null;
      this.bridge$scale = 1.0F;
      this.bridge$interpolationRate = 0.0F;
      this.bridge$interpolationScale = 0.0F;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public Title bridge$getTitle() {
      if (this.displayedTitle$v1_8 == null && this.displayedSubTitle$v1_8 == null) {
         return null;
      }

      String var1 = Objects.requireNonNullElse(this.displayedTitle$v1_8, "");
      String var2 = Objects.requireNonNullElse(this.displayedSubTitle$v1_8, "");
      return Title.title(
         Component.text(var1),
         Component.text(var2),
         Times.times(Ticks.duration(this.titleFadeIn$v1_8), Ticks.duration(this.titleDisplayTime$v1_8), Ticks.duration(this.titleFadeOut$v1_8))
      );
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public int bridge$titlesTimer() {
      return this.titlesTimer$v1_8;
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public void bridge$interpolateTitle() {
      if (this.bridge$interpolationScale != 0.0F && this.bridge$interpolationRate != 0.0F) {
         if (!(this.bridge$scale > 1.0F) && !(this.bridge$scale < 0.0F)) {
            if (this.bridge$interpolationScale > this.bridge$scale) {
               this.bridge$scale = Math.min(this.bridge$interpolationScale, this.bridge$scale + this.bridge$interpolationRate);
            } else {
               this.bridge$scale = Math.max(this.bridge$interpolationScale, this.bridge$scale - this.bridge$interpolationRate);
            }
         }
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public float bridge$getTitleScale() {
      return this.bridge$scale;
   }

   public Component bridge$getOverlayMessage() {
      return this.overlayMessage == null ? null : Component.text(this.overlayMessage);
   }

   public int bridge$getOverlayMessageTime() {
      return this.overlayMessageTime;
   }

   public boolean bridge$isAnimateOverlayMessageColor() {
      return this.animateOverlayMessageColor;
   }

   public int bridge$getTicks() {
      return this.getUpdateCounter();
   }

   public List<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH> bridge$getPlayerInfoList() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         EntityPlayerSP var3 = this.mc.player$v1_8;
         if (var3 == null) {
            return List.of();
         }

         NetHandlerPlayClient var4 = this.mc.player$v1_8.connection$v1_8;
         return var4 == null ? List.of() : GuiPlayerTabOverlay.ENTRY_ORDERING.sortedCopy(var4.getPlayerInfoMap$v1_8());
      } else {
         EntityClientPlayerMP var1 = this.mc.thePlayer$v1_7;
         if (var1 == null) {
            return List.of();
         }

         NetHandlerPlayClient var2 = this.mc.thePlayer$v1_7.sendQueue;
         return var2 == null ? List.of() : var2.playerInfoList$v1_7;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(method = "updateTick", at = @At("HEAD"))
   private void lunar$interpolateTitle(CallbackInfo var1) {
      this.bridge$interpolateTitle();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Inject(
      method = "updateTick",
      at = @At(value = "FIELD", target = "Lnet/minecraft/client/gui/GuiIngame;displayedSubTitle$v1_8:Ljava/lang/String;", opcode = 181, shift = Shift.AFTER)
   )
   private void lunar$resetScale(CallbackInfo var1) {
      this.bridge$scale = 1.0F;
      this.bridge$interpolationRate = 0.0F;
      this.bridge$interpolationScale = 0.0F;
   }

   public boolean bridge$isTabVisible() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return this.getTabList$v1_8().isBeingRendered;
      }

      com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCIIROIOORRIOIIIRHIRRCCIIRRROH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var1 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR()
         .HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
         .COCHICOCRHIHCRHHOORIRHIROROIOC();
      if (var1.isEnabled() && var1.isActive()) {
         return true;
      }

      ScoreObjective var2 = this.mc.world.getScoreboard().getObjectiveInDisplaySlot(0);
      return this.mc.gameSettings.keyBindPlayerList$v1_7.getIsKeyPressed()
         && (!this.mc.isIntegratedServerRunning() || this.mc.thePlayer$v1_7.sendQueue.playerInfoList$v1_7.size() > 1 || var2 != null);
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI bridge$getTabList() {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHRIICOIOORCHCOIICOOIHIRHHICRI)this.getTabList$v1_8();
      } else {
         throw new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IIHRRHORCRCROCHHOHORCHCROCIHRO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CRRRICCRROCOHHOHIICIHORCOORRRH();
      }
   }
}
