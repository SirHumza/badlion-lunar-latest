package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Optional;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraft.client.resources.FileResourcePack;
import net.minecraft.client.resources.FolderResourcePack;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.client.resources.data.PackMetadataSection;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(AbstractResourcePack.class)
public abstract class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   @Shadow
   public abstract InputStream getInputStreamByName(String var1);

   @Shadow
   public abstract String getPackName();

   @Shadow
   public abstract InputStream getInputStream(ResourceLocation var1);

   @Shadow
   public abstract <T extends IMetadataSection> T getPackMetadata(MetadataSerializer var1, String var2);

   @Shadow
   public abstract boolean hasResourceName(String var1);

   public InputStream bridge$getInputStream(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      return this.getInputStream((ResourceLocation)var1);
   }

   @Overwrite
   public BufferedImage getPackImage() {
      int var1 = com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.ICIIOHIRRHRORROIIHCIRCIIOIHCHR();
      InputStream var2 = this.getInputStreamByName("pack.png");
      BufferedImage var3 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1 ? TextureUtil.readBufferedImage$v1_8(var2) : ImageIO.read(var2);
      if (var3 == null) {
         return null;
      }

      if (var3.getWidth() <= var1 && var3.getHeight() <= var1) {
         return var3;
      }

      com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(
         "MemoryFix", "Scaling resource pack icon from " + var3.getWidth() + " to " + var1, new Object[0]
      );
      BufferedImage var4 = new BufferedImage(var1, var1, 2);
      Graphics var5 = var4.getGraphics();
      var5.drawImage(var3, 0, 0, var1, var1, null);
      var5.dispose();
      return var4;
   }

   public String bridge$getPackName() {
      return this.getPackName();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getDescription() {
      PackMetadataSection var1 = this.getPackMetadata(Minecraft.getMinecraft().metadataSerializer, "pack");
      return IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1
         ? (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.packDescription$v1_8
         : (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)var1.packDescription$v1_7;
   }

   public Optional<BufferedImage> bridge$getPackImage() {
      try {
         try {
            return Optional.ofNullable(this.getPackImage());
         } catch (IOException var2) {
            return Optional.empty();
         }
      } catch (Throwable var3) {
         throw var3;
      }
   }

   public boolean bridge$hasPath(String var1) {
      if (this instanceof FileResourcePack var2) {
         ZipFile var7;
         try {
            var7 = var2.getResourcePackZipFile();
         } catch (IOException var6) {
            return false;
         }

         Enumeration var5 = var7.entries();

         while (var5.hasMoreElements()) {
            if (((ZipEntry)var5.nextElement()).getName().startsWith(var1)) {
               return true;
            }
         }
      } else if (this instanceof FolderResourcePack var3) {
         return new File(var3.resourcePackFile, var1).exists();
      }

      return false;
   }
}
