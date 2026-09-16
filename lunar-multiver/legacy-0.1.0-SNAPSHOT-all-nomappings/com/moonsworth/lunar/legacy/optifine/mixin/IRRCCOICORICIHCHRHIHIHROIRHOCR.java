package com.moonsworth.lunar.legacy.optifine.mixin;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.GlStateManager;
import net.optifine.Config;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
@Mixin(ModelRenderer.class)
public class IRRCCOICORICIHCHRHIHIHROIRHOCR
   implements com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   @Unique
   private List<ModelRenderer> lunar$attachedRenderers;

   @Override
   public void lunar$attach(ModelRenderer var1) {
      if (this.lunar$attachedRenderers == null) {
         this.lunar$attachedRenderers = new ArrayList<>();
      }

      this.lunar$attachedRenderers.add(var1);
   }

   @Inject(method = "render", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/GlStateManager;callList(I)V", shift = Shift.AFTER))
   private void lunar$render(float var1, CallbackInfo var2) {
      if (this.lunar$attachedRenderers != null && !this.lunar$attachedRenderers.isEmpty()) {
         List var3 = this.lunar$attachedRenderers;
         int var4 = 0;

         for (int var5 = var3.size(); var4 < var5; var4++) {
            ModelRenderer var6 = (ModelRenderer)var3.get(var4);
            if (!var6.isHidden && var6.showModel) {
               if (!var6.compiled) {
                  var6.compileDisplayList(var1);
               }

               int var7 = 0;
               if (var6.textureLocation$v1_8 != null && !var6.renderGlobal$v1_8.renderOverlayDamaged$v1_8) {
                  if (var6.renderGlobal$v1_8.renderOverlayEyes$v1_8) {
                     return;
                  }

                  var7 = GlStateManager.getBoundTexture();
                  Config.getTextureManager().bindTexture(var6.textureLocation$v1_8);
               }

               if (var6.modelUpdater$v1_8 != null) {
                  var6.modelUpdater$v1_8.update();
               }

               GlStateManager.callList(var6.displayList);
               if (var7 != 0) {
                  GlStateManager.bindTexture(var7);
               }
            }
         }
      }
   }
}
