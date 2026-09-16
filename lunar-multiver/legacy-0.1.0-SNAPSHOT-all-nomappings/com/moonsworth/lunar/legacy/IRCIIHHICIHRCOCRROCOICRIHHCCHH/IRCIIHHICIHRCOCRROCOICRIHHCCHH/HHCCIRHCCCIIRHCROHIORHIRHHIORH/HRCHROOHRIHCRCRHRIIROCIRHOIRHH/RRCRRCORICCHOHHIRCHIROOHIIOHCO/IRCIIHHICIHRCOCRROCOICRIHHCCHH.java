package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.HRCHROOHRIHCRCRHRIIROCIRHOIRHH.RRCRRCORICCHOHHIRCHIROOHIIOHCO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.HOIHOROOIOOCOIHCRIRIRIRRICIIHC;
import com.moonsworth.lunar.client.util.OIICIRRCOOCIHRHOIOIOOROCRHCHIC;
import java.awt.image.BufferedImage;
import java.io.InputStream;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(SimpleTexture.class)
public class IRCIIHHICIHRCOCRROCOICRIHHCCHH {
   @Final
   @Shadow
   public ResourceLocation textureLocation;

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(max = 0)
   @Redirect(method = "loadTexture", at = @At(value = "INVOKE", target = "Ljavax/imageio/ImageIO;read(Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;"))
   public BufferedImage lunar$sliceCloakTexture_v1_7(InputStream var1) {
      try {
         BufferedImage var2 = HOIHOROOIOOCOIHCRIRIRIRRICIIHC.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, null);
         return com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOHCCHOIOHOHHOROHOIIHOOHORRHRO(
               (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.textureLocation
            )
            ? com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, 8)
            : var2;
      } catch (Throwable var3) {
         throw var3;
      }
   }

   @com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 1)
   @Redirect(
      method = "loadTexture",
      at = @At(
         value = "INVOKE",
         target = "net/minecraft/client/renderer/texture/TextureUtil.readBufferedImage (Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;"
      )
   )
   private BufferedImage lunar$sliceCloakTexture_v1_8(InputStream var1) {
      try {
         BufferedImage var2 = OIICIRRCOOCIHRHOIOIOOROCRHCHIC.HRCHROOHRIHCRCRHRIIROCIRHOIRHH(var1);
         return com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HOHCCHOIOHOHHOROHOIIHOOHORRHRO(
               (RCIROOOOICRHCCRRCIORHHIRCOIIIC)this.textureLocation
            )
            ? com.moonsworth.lunar.client.util.IHHCHHHCRIHOOCOIOOCRIIICIOROIR.IRCIIHHICIHRCOCRROCOICRIHHCCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(var2, 8)
            : var2;
      } catch (Throwable var3) {
         throw var3;
      }
   }
}
