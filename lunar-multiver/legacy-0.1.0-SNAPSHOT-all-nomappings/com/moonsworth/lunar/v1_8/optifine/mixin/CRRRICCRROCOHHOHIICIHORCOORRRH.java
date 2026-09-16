package com.moonsworth.lunar.v1_8.optifine.mixin;

import com.moonsworth.lunar.v1_8.optifine.wrapper.HRCHROOHRIHCRCRHRIIROCIRHOIRHH;
import net.minecraft.client.renderer.tileentity.TileEntitySignRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntitySign;
import net.optifine.Config;
import net.optifine.shaders.Shaders;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(TileEntitySignRenderer.class)
public class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Shadow
   public static double textRenderDistanceSq;

   @Overwrite
   public static boolean isRenderText(TileEntitySign var0) {
      if (Shaders.isShadowPass) {
         return false;
      }

      if (!Config.zoomMode && var0.lineBeingEdited < 0 && HRCHROOHRIHCRCRHRIIROCIRHOIRHH.currentlyEditedSign != var0) {
         Entity var1 = Config.getMinecraft().getRenderViewEntity();
         double var2 = var0.getDistanceSq(var1.posX, var1.posY, var1.posZ);
         if (var2 > textRenderDistanceSq) {
            return false;
         }
      }

      return true;
   }
}
