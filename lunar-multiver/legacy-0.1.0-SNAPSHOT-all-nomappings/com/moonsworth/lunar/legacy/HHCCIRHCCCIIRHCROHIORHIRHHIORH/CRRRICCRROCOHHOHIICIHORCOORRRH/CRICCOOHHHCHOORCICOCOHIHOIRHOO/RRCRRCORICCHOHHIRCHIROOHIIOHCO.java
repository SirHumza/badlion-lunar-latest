package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSectionSerializer_v1_7;
import net.minecraft.client.resources.data.IMetadataSectionSerializer_v1_8;
import net.minecraft.client.resources.data.MetadataSerializer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MetadataSerializer.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO {
   @Shadow
   public abstract <T extends IMetadataSection> void registerMetadataSectionType$v1_8(IMetadataSectionSerializer_v1_8<T> var1, Class<T> var2);

   @Shadow
   public abstract void registerMetadataSectionType$v1_7(IMetadataSectionSerializer_v1_7 var1, Class var2);

   @Inject(method = "<init>", at = @At("RETURN"))
   public void lunar$init(CallbackInfo var1) {
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         this.registerMetadataSectionType$v1_8(
            com.moonsworth.lunar.legacy.wrapper.util.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.OHOOOHOCRHHRHHCHRHRRHHHOCIOHOR,
            com.moonsworth.lunar.legacy.wrapper.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class
         );
      } else {
         this.registerMetadataSectionType$v1_7(
            com.moonsworth.lunar.legacy.wrapper.util.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI.HCICHOCRHICIHIRIOOCRROHHRIRIRI,
            com.moonsworth.lunar.legacy.wrapper.util.RRCRRCORICCHOHHIRCHIROOHIIOHCO.class
         );
      }
   }
}
