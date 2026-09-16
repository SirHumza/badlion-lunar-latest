package com.moonsworth.lunar.legacy.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import com.moonsworth.lunar.client.CRICCOOHHHCHOORCICOCOHIHOIRHOO.RRCRRCORICCHOHHIRCHIROOHIIOHCO.IIOCHOIICCIORCOROIROHICCHIOHIC.RRCRRCORICCHOHHIRCHIROOHIIOHCO;
import com.moonsworth.lunar.client.util.IICCOOCHCHROORHHIIHROHCCRHRCOR;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Locale;
import javax.imageio.ImageIO;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.data.AnimationMetadataSection;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.util.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import org.lwjgl.opengl.GL11;

public class CRRRICCRROCOHHOHIICIHORCOORRRH
   extends com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH {
   private final TextureMap OHCHICRHCHIHCHOORRCHHHHOCCHRIC;

   protected boolean OROCRHCRIIOROIRROOCCOOICIHOROH(String var1) {
      com.moonsworth.lunar.client.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var2 = IICCOOCHCHROORHHIIHROHCCRHRCOR.ICORCRCHRIICOHOOIHHIHOIHIIRCOR();
      if (var2 != null && var2.HHCCIRORCRCHOIOHRRIRRRIORRCRRR().HOORIHHORRRRHCIRCIHCCCRRCCICIR() != null) {
         TextureAtlasSprite var3 = this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.getAtlasSprite(var1);
         if (var3 != null && var3 != this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.missingImage) {
            com.moonsworth.lunar.client.HICRRICCHCCROOHHCHOCOCCHOIHHOC.IIHRRHORCRCROCHHOHORCHCROCIHRO.HHCCIRHCCCIIRHCROHIORHIRHHIORH var4 = var2.HHCCIRORCRCHOIOHRRIRRRIORRCRRR()
               .HOORIHHORRRRHCIRCIHCCCRRCCICIR()
               .CCRHOCCCRCICIRORCOOHHIHCRHIIOR();
            boolean var5 = var4.RRIIOCROCRROCCOOHRRRCHHCRRHCRI(var1);
            boolean var6 = false;
            Iterator var7 = this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH((RHOCHHIRRCHHHOHOIRROIROHHHIHIO)var3, var1).iterator();

            while (true) {
               String var8;
               TextureAtlasSprite var9;
               RHOCHHIRRCHHHOHOIRROIROHHHIHIO var10;
               com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH var11;
               while (true) {
                  if (!var7.hasNext()) {
                     return var6;
                  }

                  var8 = (String)var7.next();
                  var9 = this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.getAtlasSprite(var8);
                  if (var9 != null && var9 != this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.missingImage) {
                     var10 = (RHOCHHIRRCHHHOHOIRROIROHHHIHIO)var9;
                     var11 = var10.bridge$getSourceImage();
                     if (var5) {
                        break;
                     }

                     if (var11 != null) {
                        var10.bridge$setSourceImage(null);
                        break;
                     }
                  }
               }

               BufferedImage var12;
               if (var11 == null) {
                  try {
                     IResourceManager var13 = Minecraft.getMinecraft().getResourceManager();
                     IResource var14 = var13.getResource(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9));
                     BufferedImage var15 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 1
                        ? ImageIO.read(var14.getInputStream())
                        : TextureUtil.readBufferedImage$v1_8(var14.getInputStream());
                     var12 = new BufferedImage(var15.getWidth(), var15.getHeight(), 2);
                     Graphics2D var16 = var12.createGraphics();
                     var16.setComposite(AlphaComposite.Src);
                     var16.drawImage(var15, 0, 0, null);
                     var16.dispose();
                  } catch (Throwable var18) {
                     if (!var8.equals(RRCRRCORICCHOHHIRCHIROOHIIOHCO.OCOHIHRCRHHOCOCRHIICCHOHICHIRH.toString())) {
                        com.moonsworth.lunar.client.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                           var18, "[TextureUpdater] Error while reading %s", new Object[]{var8}
                        );
                     }

                     var12 = new BufferedImage(var9.width, var9.height, 2);
                  }

                  int var19 = var12.getWidth();
                  int var20 = var12.getHeight();
                  int[] var21 = var12.getRGB(0, 0, var19, var20, null, 0, var19);
                  var10.bridge$setSourceImage(
                     new com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(
                        var21, var19, var20
                     )
                  );
               } else {
                  var12 = new BufferedImage(var11.OOIRCOCROHROCRHRICCHIHORHROHII(), var11.ORCOCCCOOOOCROCIHIRIICOIHCIRHR(), 2);
                  var12.setRGB(0, 0, var12.getWidth(), var12.getHeight(), var11.HCIRRCIOOCIRICIOOHIRRHRRCCIICC(), 0, var12.getWidth());
               }

               if (var5) {
                  HHCCIRHCCCIIRHCROHIORHIRHHIORH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var12, var1, var8);
               }

               try {
                  this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var9, var12);
                  if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
                     GlStateManager.bindTexture(this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.getGlTextureId());
                  } else {
                     GL11.glBindTexture(3553, this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.getGlTextureId());
                  }

                  TextureUtil.uploadTextureMipmap(
                     var9.getFrameTextureData(0), var9.getIconWidth(), var9.getIconHeight(), var9.getOriginX(), var9.getOriginY(), false, false
                  );
                  com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.IRCIIHHICIHRCOCRROCOICRIHHCCHH.HRICIORORHCRHCCCIIIHRRHCICOHOR()
                     .ifPresent(var1x -> var1x.updateMultiTextureSprite(var10));
                  var6 = true;
               } catch (IOException var17) {
                  throw new RuntimeException(var17);
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TextureAtlasSprite var1, BufferedImage var2) {
      AnimationMetadataSection var3 = var1.animationMetadata;
      var1.resetSprite();
      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION >= 1) {
         var1.interpolatedFrameData$v1_8 = null;
      }

      if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION > 1) {
         var1.loadSpriteFrames$v1_12(
            new CRRRICCRROCOHHOHIICIHORCOORRRH.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1), var2, var3),
            1 + this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.mipmapLevels
         );
      } else {
         BufferedImage[] var4 = new BufferedImage[1 + this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.mipmapLevels];
         var4[0] = var2;
         if (IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION == 1) {
            var1.loadSprite$v1_8(var4, var3);
         } else {
            var1.loadSprite$v1_7(var4, var3, Minecraft.getMinecraft().gameSettings.anisotropicFiltering$v1_7 > 1.0F);
         }
      }

      var1.generateMipmaps(this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.mipmapLevels);
   }

   private ResourceLocation RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TextureAtlasSprite var1) {
      return this.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(var1, 0);
   }

   private ResourceLocation RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(TextureAtlasSprite var1, int var2) {
      ResourceLocation var3 = new ResourceLocation(var1.getIconName());
      String var4 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 ? var3.getResourceDomain$v1_7() : var3.getNamespace$v1_12();
      String var5 = IICCOOCHCHROORHHIIHROHCCRHRCOR.MC_VERSION < 5 ? var3.getResourcePath$v1_7() : var3.getPath$v1_12();
      String var6 = var5.toLowerCase(Locale.ROOT);
      if (var6.startsWith("mcpatcher/") || var6.startsWith("optifine/")) {
         return new ResourceLocation(var3 + ".png");
      } else {
         return var2 == 0
            ? new ResourceLocation(var4, String.format("%s/%s%s", this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.basePath, var5, ".png"))
            : new ResourceLocation(var4, String.format("%s/mipmaps/%s.%d%s", this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC.basePath, var5, var2, ".png"));
      }
   }

   @Generated
   public CRRRICCRROCOHHOHIICIHORCOORRRH(TextureMap var1) {
      this.OHCHICRHCHIHCHOORRCHHHHOCCHRIC = var1;
   }

   private static class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH implements IResource {
      private final ResourceLocation HRICHIOHCOCCORHIIIRRRRRHIRROCI;
      private final BufferedImage IIHRRORIRIIORRCIHHIRIHHROIOHOR;
      private final AnimationMetadataSection OIIRHCICRHIIRIHRCROCCOOCHRHROH;

      public InputStream getInputStream() {
         ByteArrayOutputStream var1 = new ByteArrayOutputStream();

         try {
            ImageIO.write(this.IIHRRORIRIIORRCIHHIRIHHROIOHOR, "PNG", var1);
         } catch (IOException var3) {
            throw new RuntimeException(var3);
         }

         return new ByteArrayInputStream(var1.toByteArray());
      }

      public boolean hasMetadata() {
         return true;
      }

      public IMetadataSection getMetadata$v1_7(String var1) {
         return "animation".equals(var1) ? this.OIIRHCICRHIIRIHRCROCCOOCHRHROH : null;
      }

      public ResourceLocation getResourceLocation$v1_8() {
         return this.HRICHIOHCOCCORHIIIRRRRRHIRROCI;
      }

      @Nullable
      public <T extends IMetadataSection> T getMetadata$v1_8(String var1) {
         return (T)("animation".equals(var1) ? this.OIIRHCICRHIIRIHRCROCCOOCHRHROH : null);
      }

      public String getResourcePackName$v1_8() {
         return "";
      }

      @Generated
      public RCIRROCCCIIHCIHCCRHHCCHOHHHCHH(ResourceLocation var1, BufferedImage var2, AnimationMetadataSection var3) {
         this.HRICHIOHCOCCORHIIIRRRRRHIRROCI = var1;
         this.IIHRRORIRIIORRCIHHIRIHHROIOHOR = var2;
         this.OIIRHCICRHIIRIHRCROCCOOCHRHROH = var3;
      }
   }
}
