package com.moonsworth.lunar.v1_8.optifine.wrapper;

import net.minecraft.client.Minecraft;
import net.optifine.Config;

public class RCIRROCCCIIHCIHCCRHHCCHOHHHCHH
   implements com.moonsworth.lunar.HHCCIRHCCCIIRHCROHIORHIRHHIORH.RICRIRRCOHRCOCRRHHCRHRROOIOHHR.CRRRICCRROCOHHOHIICIHORCOORRRH {
   public boolean hasDynamicFov() {
      return Config.isDynamicFov();
   }

   public boolean hasSmoothBiomes() {
      return Config.isSmoothBiomes();
   }

   public boolean hasCustomColors() {
      return Config.isCustomColors();
   }

   public boolean hasCustomSky() {
      return Config.isCustomSky();
   }

   public boolean hasCustomFonts() {
      return Config.isCustomFonts();
   }

   public boolean hasCustomItems() {
      return Config.isCustomItems();
   }

   public boolean hasShowCapes() {
      return Config.isShowCapes();
   }

   public boolean hasConnectedTextures() {
      return Config.isConnectedTextures();
   }

   public boolean hasNaturalTextures() {
      return Config.isNaturalTextures();
   }

   public boolean hasConnectedTexturesFancy() {
      return Config.isConnectedTexturesFancy();
   }

   public boolean hasFastRender() {
      return Config.isFastRender();
   }

   public boolean hasTranslucentBlocksFancy() {
      return Config.isTranslucentBlocksFancy();
   }

   public boolean hasShaders() {
      return Config.isShaders();
   }

   public boolean hasAntiAliasing() {
      return Config.isAntialiasing();
   }

   public int getAntialiasingLevel() {
      return Config.antialiasingLevel;
   }

   public boolean isZooming() {
      return Config.zoomMode;
   }

   public void setZooming(boolean var1) {
      Config.zoomMode = var1;
   }

   public void setFastRender(boolean var1) {
      Config.gameSettings.ofFastRender = var1;
   }

   public void setAntialiasingLevel(int var1) {
      Config.antialiasingLevel = var1;
   }

   public void setRenderRegions(boolean var1) {
      Config.gameSettings.ofRenderRegions = var1;
   }

   public boolean getRenderRegions() {
      return Config.gameSettings.ofRenderRegions;
   }

   public boolean isWeatherEnabled() {
      return Config.isWeatherEnabled();
   }

   public void updateFramebufferSize() {
      Config.updateFramebufferSize();
   }

   public void updateLevelRenderer() {
      Minecraft.getMinecraft().renderGlobal.loadRenderers();
   }

   public boolean isFogOff() {
      return Config.isFogOff();
   }
}
