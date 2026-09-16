package com.moonsworth.lunar.legacy.HHCCIRHCCCIIRHCROHIORHIRHHIORH.CRRRICCRROCOHHOHIICIHORCOORRRH.CRICCOOHHHCHOORCICOCOHIHOIRHOO;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCRRHRCIRHIHIHROHCRRHIIHHHHCH.RCIROOOOICRHCCRRCIORHHIRCOIIIC;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Optional;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.annotation.Nullable;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.FileResourcePack;
import net.minecraft.client.resources.FolderResourcePack;
import net.minecraft.client.resources.IResourcePack;
import net.minecraft.client.resources.LegacyV2Adapter;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.MetadataSerializer;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
@Mixin(LegacyV2Adapter.class)
public abstract class CRRRICCRROCOHHOHIICIHORCOORRRH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.CORCOCICIRIOHROHROIIOOHICCHCRR.OOROOCCIRCCRHOIOIORIHCHHOOCCOR {
   @Final
   @Shadow
   public IResourcePack pack;

   @Shadow
   public abstract InputStream getInputStream(ResourceLocation var1);

   @Shadow
   public abstract String getPackName();

   @Shadow
   public abstract BufferedImage getPackImage();

   @Shadow
   @Nullable
   public abstract <T extends IMetadataSection> T getPackMetadata(MetadataSerializer var1, String var2);

   public InputStream bridge$getInputStream(RCIROOOOICRHCCRRCIORHHIRCOIIIC var1) {
      return this.getInputStream((ResourceLocation)var1);
   }

   public String bridge$getPackName() {
      return this.getPackName();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH bridge$getDescription() {
      return (com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRRCCOICORICIHCHRHIHIHROIRHOCR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH)this.getPackMetadata(
            Minecraft.getMinecraft().metadataSerializer, "pack"
         )
         .packDescription$v1_8;
   }

   public Optional<BufferedImage> bridge$getPackImage() {
      try {
         return Optional.ofNullable(this.getPackImage());
      } catch (IOException var2) {
         return Optional.empty();
      }
   }

   public boolean bridge$hasPath(String var1) {
      if (this.pack instanceof FileResourcePack var2) {
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
      } else if (this.pack instanceof FolderResourcePack var3) {
         return new File(var3.resourcePackFile, var1).exists();
      }

      return false;
   }
}
