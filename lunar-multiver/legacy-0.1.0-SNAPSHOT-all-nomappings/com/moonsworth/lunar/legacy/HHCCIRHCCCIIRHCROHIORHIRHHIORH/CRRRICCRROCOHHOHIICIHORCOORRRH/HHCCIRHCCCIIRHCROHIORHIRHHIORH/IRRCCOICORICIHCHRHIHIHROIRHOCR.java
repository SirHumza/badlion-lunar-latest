package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.HHCCIRHCCCIIRHCROHIORHIRHHIORH;

import com.moonsworth.lunar.lib.adventure.text.Component;
import com.moonsworth.lunar.lib.adventure.title.Title;
import com.moonsworth.lunar.lib.adventure.title.Title.Times;
import com.moonsworth.lunar.lib.adventure.util.Ticks;
import java.util.Objects;
import javax.annotation.Nullable;
import net.minecraft.client.gui.GuiIngame;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
@Mixin(GuiIngame.class)
public abstract class IRRCCOICORICIHCHRHIHIHROIRHOCR
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IRCIIHHICIHRCOCRROCOICRIHHCCHH.OHHRIOHROOIHOROCIRHCHORIHRRRRI {
   @Unique
   public int bridge$titlesTimer;
   @Unique
   public int bridge$titleDisplayTime;
   @Unique
   public int bridge$titleFadeIn;
   @Unique
   public int bridge$titleFadeOut;
   @Unique
   public String bridge$displayedTitle;
   @Unique
   public String bridge$displayedSubTitle;
   @Unique
   private float bridge$scale;
   @Unique
   private float bridge$interpolationScale;
   @Unique
   private float bridge$interpolationRate;

   public void bridge$displayTitle(@Nullable Component var1, @Nullable Component var2, Times var3, float var4, float var5, float var6) {
      if (var1 != null || var2 != null) {
         if (var1 != null) {
            this.bridge$displayedTitle = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(
               var1
            );
         }

         if (var2 != null) {
            this.bridge$displayedSubTitle = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.asLegacyString(
               var2
            );
         }

         this.bridge$titleFadeIn = (int)(var3.fadeIn().toMillis() / 50L);
         this.bridge$titleDisplayTime = (int)(var3.stay().toMillis() / 50L);
         this.bridge$titleFadeOut = (int)(var3.fadeOut().toMillis() / 50L);
         this.bridge$titlesTimer = this.bridge$titleFadeIn + this.bridge$titleDisplayTime + this.bridge$titleFadeOut;
         this.bridge$scale = var4;
         this.bridge$interpolationScale = var5;
         this.bridge$interpolationRate = var6;
      }
   }

   public void bridge$clearTitle() {
      this.bridge$titleFadeIn = 10;
      this.bridge$titleDisplayTime = 70;
      this.bridge$titleFadeOut = 20;
      this.bridge$titlesTimer = 0;
      this.bridge$displayedTitle = null;
      this.bridge$displayedSubTitle = null;
      this.bridge$scale = 1.0F;
      this.bridge$interpolationRate = 0.0F;
      this.bridge$interpolationScale = 0.0F;
   }

   public float bridge$getTitleScale() {
      return this.bridge$scale;
   }

   public Title bridge$getTitle() {
      if (this.bridge$displayedTitle == null && this.bridge$displayedSubTitle == null) {
         return null;
      }

      String var1 = Objects.requireNonNullElse(this.bridge$displayedTitle, "");
      String var2 = Objects.requireNonNullElse(this.bridge$displayedSubTitle, "");
      return Title.title(
         Component.text(var1),
         Component.text(var2),
         Times.times(Ticks.duration(this.bridge$titleFadeIn), Ticks.duration(this.bridge$titleDisplayTime), Ticks.duration(this.bridge$titleFadeOut))
      );
   }

   public int bridge$titlesTimer() {
      return this.bridge$titlesTimer;
   }

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

   @Inject(method = "updateTick", at = @At("HEAD"))
   private void lunar$decrementTitlesTimer$v1_7(CallbackInfo var1) {
      this.bridge$interpolateTitle();
      if (this.bridge$titlesTimer > 0) {
         this.bridge$titlesTimer--;
         if (this.bridge$titlesTimer <= 0) {
            this.bridge$displayedTitle = "";
            this.bridge$displayedSubTitle = "";
            this.bridge$scale = 1.0F;
            this.bridge$interpolationRate = 0.0F;
            this.bridge$interpolationScale = 0.0F;
         }
      }
   }
}
