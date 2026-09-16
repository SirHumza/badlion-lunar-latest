package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.IIHRRHORCRCROCHHOHORCHCROCIHRO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.HICHRCOHCCRHOHCICOOCHOIHCCHIRI.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI;
import net.minecraft.client.shader.ShaderUniform;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(ShaderUniform.class)
public abstract class RRCRRCORICCHOHHIRCHIROOHIIOHCO implements RIOOCHICIHRHOHCCCCCHOCCCOHCRHI {
   @Shadow
   public abstract void set(float var1);

   @Shadow
   public abstract void set(float var1, float var2);

   @Shadow
   public abstract void set(float var1, float var2, float var3);

   @Shadow
   public abstract void set(float[] var1);

   public void bridge$set(float var1) {
      this.set(var1);
   }

   public void bridge$set(float var1, float var2) {
      this.set(var1, var2);
   }

   public void bridge$set(float var1, float var2, float var3) {
      this.set(var1, var2, var3);
   }

   public void bridge$set(Float[] var1) {
      float[] var2 = new float[var1.length];

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2[var3] = var1[var3];
      }

      this.set(var2);
   }
}
