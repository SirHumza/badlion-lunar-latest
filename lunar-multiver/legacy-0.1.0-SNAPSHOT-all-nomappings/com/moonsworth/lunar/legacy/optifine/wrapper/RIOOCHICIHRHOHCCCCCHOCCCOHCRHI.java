package com.moonsworth.lunar.legacy.optifine.wrapper;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import java.util.Optional;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.optifine.Config;
import net.optifine.CustomColors;

@com.moonsworth.lunar.ichor.RCIRROCCCIIHCIHCCRHHCCHOHHHCHH.IRCIIHHICIHRCOCRROCOICRIHHCCHH(min = 5)
public class RIOOCHICIHRHOHCCCCCHOCCCOHCRHI
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH HORCCCCRIHCCHIHROCOCCRHIICIIHC;
   private final CORCOCICIRIOHROHROIIOOHICCHCRR OCCHORCOHCCRRCCOCIROIRHIOORHOO;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH HRIHORCOCORIRIRROIOCRHORCHOHCR;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI IOIIHROOIHHHHOCHHRIOICOIOOROIH;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RRCRRCORICCHOHHIRCHIROOHIIOHCO IORROHHIIOOHRRORROOHHCRROROIIR;
   private boolean reloading;

   public RIOOCHICIHRHOHCCCCCHOCCCOHCRHI() {
      try {
         Class.forName("net.optifine.Config");
      } catch (ClassNotFoundException var2) {
         Class.forName("Config");
      }

      this.HORCCCCRIHCCHIHROCOCCRHIICIIHC = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
      this.OCCHORCOHCCRRCCOCIROIRHIOORHOO = new HRCHROOHRIHCRCRHRIIROCIRHOIRHH();
      this.HRIHORCOCORIRIRROIOCRHORCHOHCR = new RRCRRCORICCHOHHIRCHIROOHIIOHCO();
      this.IOIIHROOIHHHHOCHHRIOICOIOOROIH = new CRRRICCRROCOHHOHIICIHORCOORRRH();
      this.IORROHHIIOOHRRORROOHHCRROROIIR = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH> getCustomItems() {
      return Config.isCustomItems() ? Optional.of(this.HRIHORCOCORIRIRROIOCRHORCHOHCR) : Optional.empty();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RRCRRCORICCHOHHIRCHIROOHIIOHCO getConnectedTextures() {
      return this.IORROHHIIOOHRRORROOHHCRROROIIR;
   }

   public int getBossTextColor(int var1) {
      return !this.HORCCCCRIHCCHIHROCOCCRHIICIIHC.hasCustomColors() ? var1 : CustomColors.getBossTextColor(var1);
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> getCustomColors() {
      return Config.isCustomColors() ? Optional.of(this.IOIIHROOIHHHHOCHHRIOICOIOOROIH) : Optional.empty();
   }

   public void waitOnAllChunksRendering(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      ((Minecraft)var1).entityRenderer.loadVisibleChunks$v1_8 = true;
   }

   public void callSpriteUpdate(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
   }

   public void updateMultiTextureSprite(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
      if (Config.isMultiTexture()) {
         TextureAtlasSprite var2 = (TextureAtlasSprite)var1;
         if (var2.spriteSingle$v1_8 != null) {
            var2.bindSpriteTexture$v1_8();
            TextureUtil.uploadTextureMipmap(
               var2.spriteSingle$v1_8.getFrameTextureData(0),
               var2.spriteSingle$v1_8.getIconWidth(),
               var2.spriteSingle$v1_8.getIconHeight(),
               var2.spriteSingle$v1_8.getOriginX(),
               var2.spriteSingle$v1_8.getOriginY(),
               false,
               true
            );
         }
      }
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH getConfig() {
      return this.HORCCCCRIHCCHIHROCOCCRHIICIIHC;
   }

   @Generated
   public CORCOCICIRIOHROHROIIOOHICCHCRR getShaders() {
      return this.OCCHORCOHCCRRCCOCIROIRHIOORHOO;
   }

   @Generated
   public boolean isReloading() {
      return this.reloading;
   }

   @Generated
   public void setReloading(boolean var1) {
      this.reloading = var1;
   }
}
