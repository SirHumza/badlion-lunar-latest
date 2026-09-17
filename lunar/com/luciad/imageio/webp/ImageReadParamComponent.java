package com.luciad.imageio.webp;

import javax.imageio.ImageReadParam;

public final class WebPReadParam extends ImageReadParam {
   private WebPDecoderOptions fOptions = new WebPDecoderOptions();

   public void setScaledHeight(int var1) {
      this.fOptions.setScaledHeight(var1);
   }

   public void setUseScaling(boolean var1) {
      this.fOptions.setUseScaling(var1);
   }

   public void setUseThreads(boolean var1) {
      this.fOptions.setUseThreads(var1);
   }

   public int getCropHeight() {
      return this.fOptions.getCropHeight();
   }

   public int getScaledWidth() {
      return this.fOptions.getScaledWidth();
   }

   public boolean isUseCropping() {
      return this.fOptions.isUseCropping();
   }

   public void setCropWidth(int var1) {
      this.fOptions.setCropWidth(var1);
   }

   public boolean isBypassFiltering() {
      return this.fOptions.isBypassFiltering();
   }

   public int getCropLeft() {
      return this.fOptions.getCropLeft();
   }

   public int getCropWidth() {
      return this.fOptions.getCropWidth();
   }

   public int getScaledHeight() {
      return this.fOptions.getScaledHeight();
   }

   public void setBypassFiltering(boolean var1) {
      this.fOptions.setBypassFiltering(var1);
   }

   public void setUseCropping(boolean var1) {
      this.fOptions.setUseCropping(var1);
   }

   public void setCropHeight(int var1) {
      this.fOptions.setCropHeight(var1);
   }

   public void setFancyUpsampling(boolean var1) {
      this.fOptions.setFancyUpsampling(var1);
   }

   public boolean isUseThreads() {
      return this.fOptions.isUseThreads();
   }

   public boolean isFancyUpsampling() {
      return this.fOptions.isFancyUpsampling();
   }

   public boolean isUseScaling() {
      return this.fOptions.isUseScaling();
   }

   public void setCropLeft(int var1) {
      this.fOptions.setCropLeft(var1);
   }

   public int getCropTop() {
      return this.fOptions.getCropTop();
   }

   public void setScaledWidth(int var1) {
      this.fOptions.setScaledWidth(var1);
   }

   public void setCropTop(int var1) {
      this.fOptions.setCropTop(var1);
   }

   public WebPDecoderOptions getDecoderOptions() {
      return this.fOptions;
   }
}
