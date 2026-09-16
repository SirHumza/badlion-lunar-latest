package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.client.util.HOIHOROOIOOCOIHCRIRIRIRRICIIHC;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import net.minecraft.client.renderer.texture.TextureUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(TextureUtil.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH {
   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "readImageData", at = @At(value = "INVOKE", target = "javax/imageio/ImageIO.read (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;"))
   private static BufferedImage lunar$redirectImageIoToLunar_v1_7(InputStream var0) {
      return lunar$redirectImageIoToLunar(var0);
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(
      method = "readBufferedImage$v1_8",
      at = @At(value = "INVOKE", target = "javax/imageio/ImageIO.read (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;")
   )
   private static BufferedImage lunar$redirectImageIoToLunar_v1_8(InputStream var0) {
      return lunar$redirectImageIoToLunar(var0);
   }

   @Unique
   private static BufferedImage lunar$redirectImageIoToLunar(InputStream var0) {
      try {
         return HOIHOROOIOOCOIHCRIRIRIRRICIIHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var0, null);
      } catch (Exception var2) {
         com.moonsworth.lunar.client.ROOCOCCCIRHHHIRIOIHHHHRHIICHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
            var2, "Reading Image with LunarImageIO"
         );
         throw var2;
      }
   }
}
