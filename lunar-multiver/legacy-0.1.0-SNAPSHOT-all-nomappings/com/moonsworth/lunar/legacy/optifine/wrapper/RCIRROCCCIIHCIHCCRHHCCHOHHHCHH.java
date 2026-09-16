package com.moonsworth.lunar.legacy.optifine.wrapper;

import java.awt.image.BufferedImage;
import java.lang.ref.WeakReference;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.IImageBuffer;
import net.minecraft.client.renderer.ImageBufferDownload;
import net.minecraft.util.ResourceLocation;
import net.optifine.player.CapeUtils;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IImageBuffer {
   public ImageBufferDownload RIIRRORHHCIIRRICIHCIIOHRCCCRHC;
   public final WeakReference<AbstractClientPlayer> HHCICIIHCCIRRICHIRICIIRCIRHIHC;
   public final ResourceLocation ORHIOORORRCOICOHHHIIICCHCHCIOH;

   public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(AbstractClientPlayer var1, ResourceLocation var2) {
      this.HHCICIIHCCIRRICHIRICIIRCIRHIHC = new WeakReference<>(var1);
      this.ORHIOORORRCOICOHHHIIICCHCHCIOH = var2;
      this.RIIRRORHHCIIRRICIHCIIOHRCCCRHC = new ImageBufferDownload();
   }

   public BufferedImage parseUserSkin(BufferedImage var1) {
      return CapeUtils.parseCape(var1);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   public void func_152634_a$v1_7() {
      this.RCORHOORIRIIOOOOOOHIHOHCHHHRHO();
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   public void skinAvailable$v1_8() {
      this.RCORHOORIRIIOOOOOOHIHOHCHHHRHO();
   }

   public void RCORHOORIRIIOOOOOOHIHOHCHHHRHO() {
      AbstractClientPlayer var1 = this.HHCICIIHCCIRRICHIRICIIRCIRHIHC.get();
      if (var1 != null) {
         var1.setLocationOfCape(this.ORHIOORORRCOICOHHHIIICCHCHCIOH);
      }
   }
}
