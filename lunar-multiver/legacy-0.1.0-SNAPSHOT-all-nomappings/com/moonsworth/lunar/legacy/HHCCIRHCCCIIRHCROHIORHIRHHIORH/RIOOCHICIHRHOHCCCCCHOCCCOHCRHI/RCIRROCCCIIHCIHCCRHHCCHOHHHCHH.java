package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HHCCIRHCCCIIRHCROHIORHIRHHIORH;
import net.minecraft.crash.CrashReport;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(CrashReport.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   @Final
   @Shadow
   public String description;
   @Final
   @Shadow
   public Throwable cause;

   public String bridge$getTitle() {
      return this.description;
   }

   public Throwable bridge$getCause() {
      return this.cause;
   }
}
