package com.moonsworth.lunar.v1_7.optifine.mixin;

import net.minecraft.client.renderer.texture.AbstractTexture;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import shadersmod.client.MultiTexID;
import shadersmod.client.ShadersTex;

@Mixin(AbstractTexture.class)
public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OCOHORHCROHICRRIHCIHHRRCIHICRI {
   @Shadow
   public MultiTexID multiTex;

   public void bridge$setMultiTextureBase(int var1) {
      if (this.multiTex != null && this.multiTex.base != var1) {
         if (this.multiTex.base == 0) {
            MultiTexID var2 = (MultiTexID)ShadersTex.multiTexMap.get(var1);
            if (var2 == this.multiTex) {
               var2.base = var1;
            }
         } else {
            this.multiTex = null;
         }
      }
   }
}
