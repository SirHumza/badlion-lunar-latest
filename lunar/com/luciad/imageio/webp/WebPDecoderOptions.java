package com.luciad.imageio.webp;

public final class WebPDecoderOptions {
   long fPointer = createDecoderOptions();

   public WebPDecoderOptions() {
      if (this.fPointer == 0L) {
         throw new OutOfMemoryError();
      }
   }

   @Override
   protected void finalize() {
      super.finalize();
      deleteDecoderOptions(this.fPointer);
      this.fPointer = 0L;
   }

   public int getCropHeight() {
      return getCropHeight(this.fPointer);
   }

   public void setCropHeight(int var1) {
      setCropHeight(this.fPointer, var1);
   }

   public int getCropLeft() {
      return getCropLeft(this.fPointer);
   }

   public void setCropLeft(int var1) {
      setCropLeft(this.fPointer, var1);
   }

   public int getCropTop() {
      return getCropTop(this.fPointer);
   }

   public void setCropTop(int var1) {
      setCropTop(this.fPointer, var1);
   }

   public int getCropWidth() {
      return getCropWidth(this.fPointer);
   }

   public void setCropWidth(int var1) {
      setCropWidth(this.fPointer, var1);
   }

   public boolean isFancyUpsampling() {
      return !isNoFancyUpsampling(this.fPointer);
   }

   public void setFancyUpsampling(boolean var1) {
      setNoFancyUpsampling(this.fPointer, !var1);
   }

   public int getScaledHeight() {
      return getScaledHeight(this.fPointer);
   }

   public void setScaledHeight(int var1) {
      setScaledHeight(this.fPointer, var1);
   }

   public int getScaledWidth() {
      return getScaledWidth(this.fPointer);
   }

   public void setScaledWidth(int var1) {
      setScaledWidth(this.fPointer, var1);
   }

   public boolean isUseCropping() {
      return isUseCropping(this.fPointer);
   }

   public void setUseCropping(boolean var1) {
      setUseCropping(this.fPointer, var1);
   }

   public boolean isUseScaling() {
      return isUseScaling(this.fPointer);
   }

   public void setUseScaling(boolean var1) {
      setUseScaling(this.fPointer, var1);
   }

   public boolean isUseThreads() {
      return isUseThreads(this.fPointer);
   }

   public void setUseThreads(boolean var1) {
      setUseThreads(this.fPointer, var1);
   }

   public boolean isBypassFiltering() {
      return isBypassFiltering(this.fPointer);
   }

   public void setBypassFiltering(boolean var1) {
      setBypassFiltering(this.fPointer, var1);
   }

   private static native long createDecoderOptions();

   private static native void deleteDecoderOptions(long var0);

   private static native int getCropHeight(long var0);

   private static native void setCropHeight(long var0, int var2);

   private static native int getCropLeft(long var0);

   private static native void setCropLeft(long var0, int var2);

   private static native int getCropTop(long var0);

   private static native void setCropTop(long var0, int var2);

   private static native int getCropWidth(long var0);

   private static native void setCropWidth(long var0, int var2);

   private static native boolean isForceRotation(long var0);

   private static native void setForceRotation(long var0, boolean var2);

   private static native boolean isNoEnhancement(long var0);

   private static native void setNoEnhancement(long var0, boolean var2);

   private static native boolean isNoFancyUpsampling(long var0);

   private static native void setNoFancyUpsampling(long var0, boolean var2);

   private static native int getScaledHeight(long var0);

   private static native void setScaledHeight(long var0, int var2);

   private static native int getScaledWidth(long var0);

   private static native void setScaledWidth(long var0, int var2);

   private static native boolean isUseCropping(long var0);

   private static native void setUseCropping(long var0, boolean var2);

   private static native boolean isUseScaling(long var0);

   private static native void setUseScaling(long var0, boolean var2);

   private static native boolean isUseThreads(long var0);

   private static native void setUseThreads(long var0, boolean var2);

   private static native boolean isBypassFiltering(long var0);

   private static native void setBypassFiltering(long var0, boolean var2);

   static {
      WebP.loadNativeLibrary();
   }
}
