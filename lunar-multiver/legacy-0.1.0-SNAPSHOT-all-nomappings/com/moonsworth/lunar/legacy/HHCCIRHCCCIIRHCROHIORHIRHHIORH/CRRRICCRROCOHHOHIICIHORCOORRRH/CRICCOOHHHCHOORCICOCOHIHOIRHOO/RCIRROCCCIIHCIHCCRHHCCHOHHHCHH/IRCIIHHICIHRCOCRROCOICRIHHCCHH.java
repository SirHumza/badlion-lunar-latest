package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH;

import java.util.Set;
import net.minecraft.client.resources.data.AnimationFrame;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AnimationMetadataSection.class)
public abstract class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Final
   @Shadow
   public int frameHeight;
   @Final
   @Shadow
   public int frameWidth;
   @Final
   @Shadow
   public int frameTime;

   @Shadow
   public abstract int getFrameCount();

   @Shadow
   public abstract AnimationFrame getAnimationFrame(int var1);

   @Shadow
   public abstract int getFrameTimeSingle(int var1);

   @Shadow
   public abstract Set<Integer> getFrameIndexSet();

   @Shadow
   public abstract boolean frameHasTime(int var1);

   @Shadow
   public abstract int getFrameIndex(int var1);

   @Shadow
   public abstract boolean isInterpolate$v1_8();

   public int bridge$getFrameHeight() {
      return this.frameHeight;
   }

   public int bridge$getFrameWidth() {
      return this.frameWidth;
   }

   public int bridge$getFrameCount() {
      return this.getFrameCount();
   }

   public int bridge$getFrameTime() {
      return this.frameTime;
   }

   public int bridge$getFrameTimeSingle(int var1) {
      return this.getFrameTimeSingle(var1);
   }

   public boolean bridge$hasTime(int var1) {
      return this.frameHasTime(var1);
   }

   public int bridge$getFrameIndex(int var1) {
      return this.getFrameIndex(var1);
   }
}
