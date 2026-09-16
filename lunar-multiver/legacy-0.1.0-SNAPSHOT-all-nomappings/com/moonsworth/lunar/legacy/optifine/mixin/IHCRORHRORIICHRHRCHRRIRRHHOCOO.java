package com.moonsworth.lunar.legacy.optifine.mixin;

import net.minecraft.client.renderer.ThreadDownloadImageData;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ThreadDownloadImageData.class)
public abstract class IHCRORHRORIICHRHRCHRRIRRHHOCOO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.IHIRRIIORRHORHRORIHOROIRCORCOO {
   @Shadow
   public Boolean imageFound;

   public void bridge$setImageFound(boolean var1) {
      this.imageFound = var1;
   }
}
