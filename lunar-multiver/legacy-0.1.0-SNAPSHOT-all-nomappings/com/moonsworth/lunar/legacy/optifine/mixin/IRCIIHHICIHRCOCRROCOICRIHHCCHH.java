package com.moonsworth.lunar.legacy.optifine.mixin;

import net.minecraft.client.renderer.texture.AbstractTexture;
import net.optifine.shaders.MultiTexID;
import net.optifine.shaders.ShadersTex;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(AbstractTexture.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.OCOHORHCROHICRRIHCIHHRRCIHICRI {
   @Shadow
   public MultiTexID multiTex$v1_8;

   public void bridge$setMultiTextureBase(int var1) {
      int var2 = var1 == -1 ? 0 : var1;
      if (this.multiTex$v1_8 != null && this.multiTex$v1_8.base != var2) {
         if (this.multiTex$v1_8.base == 0) {
            MultiTexID var3 = (MultiTexID)ShadersTex.multiTexMap.get(var1);
            if (var3 == this.multiTex$v1_8) {
               var3.base = var1;
            }
         } else {
            this.multiTex$v1_8 = null;
         }
      }
   }
}
