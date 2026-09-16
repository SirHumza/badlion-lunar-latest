package com.moonsworth.lunar.v1_8.optifine.wrapper;

import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CORCOCICIRIOHROHROIIOOHICCHCRR;
import com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.OOROOCCIRCCRHOIOIORIHCHHOOCCOR.CIOHHCORHRCCRICCCORIHCRHCCCRRR.RHOCHHIRRCHHHOHOIRROIROHHHIHIO;
import java.util.Optional;
import lombok.Generated;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.optifine.Config;
import net.optifine.CustomColors;

public class RRCRRCORICCHOHHIRCHIROOHIIOHCO
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HHCCIRHCCCIIRHCROHIORHIRHHIORH {
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH config;
   private final CORCOCICIRIOHROHROIIOOHICCHCRR shaders;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH customItems;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI customColors;
   private final com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RRCRRCORICCHOHHIRCHIROOHIIOHCO connectedTextures;
   private boolean reloading;

   public RRCRRCORICCHOHHIRCHIROOHIIOHCO() {
      try {
         Class.forName("net.optifine.Config");
      } catch (ClassNotFoundException var2) {
         Class.forName("Config");
      }

      this.config = new RCIRROCCCIIHCIHCCRHHCCHOHHHCHH();
      this.shaders = new RIOOCHICIHRHOHCCCCCHOCCCOHCRHI();
      this.customItems = new CRRRICCRROCOHHOHIICIHORCOORRRH();
      this.customColors = new HHCCIRHCCCIIRHCROHIORHIRHHIORH();
      this.connectedTextures = new IRCIIHHICIHRCOCRROCOICRIHHCCHH();
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.HRCHROOHRIHCRCRHRIIROCIRHOIRHH> getCustomItems() {
      return Config.isCustomItems() ? Optional.of(this.customItems) : Optional.empty();
   }

   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RRCRRCORICCHOHHIRCHIROOHIIOHCO getConnectedTextures() {
      return this.connectedTextures;
   }

   public int getBossTextColor(int var1) {
      return !this.config.hasCustomColors() ? var1 : CustomColors.getBossTextColor(var1);
   }

   public Optional<com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.RIOOCHICIHRHOHCCCCCHOCCCOHCRHI> getCustomColors() {
      return Config.isCustomColors() ? Optional.of(this.customColors) : Optional.empty();
   }

   public void waitOnAllChunksRendering(com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RRCRRCORICCHOHHIRCHIROOHIIOHCO.RRCRRCORICCHOHHIRCHIROOHIIOHCO var1) {
      ((Minecraft)var1).entityRenderer.loadVisibleChunks = true;
   }

   public void callSpriteUpdate(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
   }

   public void updateMultiTextureSprite(RHOCHHIRRCHHHOHOIRROIROHHHIHIO var1) {
      if (Config.isMultiTexture()) {
         TextureAtlasSprite var2 = (TextureAtlasSprite)var1;
         if (var2.spriteSingle != null) {
            var2.bindSpriteTexture();
            TextureUtil.uploadTextureMipmap(
               var2.spriteSingle.getFrameTextureData(0),
               var2.spriteSingle.getIconWidth(),
               var2.spriteSingle.getIconHeight(),
               var2.spriteSingle.getOriginX(),
               var2.spriteSingle.getOriginY(),
               false,
               true
            );
         }
      }
   }

   @Generated
   public com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH getConfig() {
      return this.config;
   }

   @Generated
   public CORCOCICIRIOHROHROIIOOHICCHCRR getShaders() {
      return this.shaders;
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
