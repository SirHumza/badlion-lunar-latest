package com.moonsworth.lunar.legacy.optifine.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.ThreadDownloadImageData;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.util.ResourceLocation;
import net.optifine.player.CapeUtils;
import org.apache.commons.io.FilenameUtils;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(CapeUtils.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @Overwrite
   public static void downloadCape(AbstractClientPlayer var0) {
      if (com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.SHOW_OPTIFINE_CAPES
         .isEnabled()) {
         String var1 = var0.getNameClear();
         if (var1 != null && !var1.isEmpty() && !var1.contains("\u0000")) {
            String var2 = com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HCIHORIHHCOOORRIOHIHIICCRHHOHC()
               + "/capes/"
               + var1
               + ".png";
            String var3 = FilenameUtils.getBaseName(var2);
            ResourceLocation var4 = new ResourceLocation("capeof/" + var3);
            TextureManager var5 = Minecraft.getMinecraft().getTextureManager();
            if (var5.getTexture(var4) instanceof ThreadDownloadImageData var7 && var7.imageFound != null) {
               if (var7.imageFound) {
                  var0.setLocationOfCape(var4);
               }

               return;
            }

            com.moonsworth.lunar.legacy.optifine.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var9 = new com.moonsworth.lunar.legacy.optifine.wrapper.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
               var0, var4
            );
            ThreadDownloadImageData var8 = new ThreadDownloadImageData(null, var2, null, var9);
            var5.loadTexture(var4, var8);
         }
      }
   }
}
