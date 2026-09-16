package com.luciad.imageio.webp;

public class WebPEncoderOptions {
   long fPointer = createConfig();

   public WebPEncoderOptions() {
      if (this.fPointer == 0L) {
         throw new OutOfMemoryError();
      }
   }

   @Override
   protected void finalize() {
      super.finalize();
      deleteConfig(this.fPointer);
      this.fPointer = 0L;
   }

   private static native long createConfig();

   private static native void deleteConfig(long var0);

   long getPointer() {
      return this.fPointer;
   }

   public float getCompressionQuality() {
      return getQuality(this.fPointer);
   }

   public void setCompressionQuality(float var1) {
      setQuality(this.fPointer, var1);
   }

   public boolean isLossless() {
      return getLossless(this.fPointer) != 0;
   }

   public void setLossless(boolean var1) {
      setLossless(this.fPointer, var1 ? 1 : 0);
   }

   public int getTargetSize() {
      return getTargetSize(this.fPointer);
   }

   public void setTargetSize(int var1) {
      setTargetSize(this.fPointer, var1);
   }

   public float getTargetPSNR() {
      return getTargetPSNR(this.fPointer);
   }

   public void setTargetPSNR(float var1) {
      setTargetPSNR(this.fPointer, var1);
   }

   public int getMethod() {
      return getMethod(this.fPointer);
   }

   public void setMethod(int var1) {
      setMethod(this.fPointer, var1);
   }

   public int getSegments() {
      return getSegments(this.fPointer);
   }

   public void setSegments(int var1) {
      setSegments(this.fPointer, var1);
   }

   public int getSnsStrength() {
      return getSnsStrength(this.fPointer);
   }

   public void setSnsStrength(int var1) {
      setSnsStrength(this.fPointer, var1);
   }

   public int getFilterStrength() {
      return getFilterStrength(this.fPointer);
   }

   public void setFilterStrength(int var1) {
      setFilterStrength(this.fPointer, var1);
   }

   public int getFilterSharpness() {
      return getFilterSharpness(this.fPointer);
   }

   public void setFilterSharpness(int var1) {
      setFilterSharpness(this.fPointer, var1);
   }

   public int getFilterType() {
      return getFilterType(this.fPointer);
   }

   public void setFilterType(int var1) {
      setFilterType(this.fPointer, var1);
   }

   public boolean isAutoAdjustFilterStrength() {
      return getAutofilter(this.fPointer) != 0;
   }

   public void setAutoAdjustFilterStrength(boolean var1) {
      setAutofilter(this.fPointer, var1 ? 1 : 0);
   }

   public int getEntropyAnalysisPassCount() {
      return getPass(this.fPointer);
   }

   public void setEntropyAnalysisPassCount(int var1) {
      setPass(this.fPointer, var1);
   }

   public boolean isShowCompressed() {
      return getShowCompressed(this.fPointer) != 0;
   }

   public void setShowCompressed(boolean var1) {
      setShowCompressed(this.fPointer, var1 ? 1 : 0);
   }

   public int getPreprocessing() {
      return getPreprocessing(this.fPointer);
   }

   public void setPreprocessing(int var1) {
      setPreprocessing(this.fPointer, var1);
   }

   public int getPartitions() {
      return getPartitions(this.fPointer);
   }

   public void setPartitions(int var1) {
      setPartitions(this.fPointer, var1);
   }

   public int getPartitionLimit() {
      return getPartitionLimit(this.fPointer);
   }

   public void setPartitionLimit(int var1) {
      setPartitionLimit(this.fPointer, var1);
   }

   public int getAlphaCompression() {
      return getAlphaCompression(this.fPointer);
   }

   public void setAlphaCompression(int var1) {
      setAlphaCompression(this.fPointer, var1);
   }

   public int getAlphaFiltering() {
      return getAlphaFiltering(this.fPointer);
   }

   public void setAlphaFiltering(int var1) {
      setAlphaFiltering(this.fPointer, var1);
   }

   public int getAlphaQuality() {
      return getAlphaQuality(this.fPointer);
   }

   public void setAlphaQuality(int var1) {
      setAlphaQuality(this.fPointer, var1);
   }

   public boolean isEmulateJpegSize() {
      return getEmulateJpegSize(this.fPointer) != 0;
   }

   public void setEmulateJpegSize(boolean var1) {
      setEmulateJpegSize(this.fPointer, var1 ? 1 : 0);
   }

   public int getThreadLevel() {
      return getThreadLevel(this.fPointer);
   }

   public void setThreadLevel(int var1) {
      setThreadLevel(this.fPointer, var1);
   }

   public boolean isReduceMemoryUsage() {
      return getLowMemory(this.fPointer) != 0;
   }

   public void setReduceMemoryUsage(boolean var1) {
      setLowMemory(this.fPointer, var1 ? 1 : 0);
   }

   private static native float getQuality(long var0);

   private static native void setQuality(long var0, float var2);

   private static native int getTargetSize(long var0);

   private static native void setTargetSize(long var0, int var2);

   private static native float getTargetPSNR(long var0);

   private static native void setTargetPSNR(long var0, float var2);

   private static native int getMethod(long var0);

   private static native void setMethod(long var0, int var2);

   private static native int getSegments(long var0);

   private static native void setSegments(long var0, int var2);

   private static native int getSnsStrength(long var0);

   private static native void setSnsStrength(long var0, int var2);

   private static native int getFilterStrength(long var0);

   private static native void setFilterStrength(long var0, int var2);

   private static native int getFilterSharpness(long var0);

   private static native void setFilterSharpness(long var0, int var2);

   private static native int getFilterType(long var0);

   private static native void setFilterType(long var0, int var2);

   private static native int getAutofilter(long var0);

   private static native void setAutofilter(long var0, int var2);

   private static native int getPass(long var0);

   private static native void setPass(long var0, int var2);

   private static native int getShowCompressed(long var0);

   private static native void setShowCompressed(long var0, int var2);

   private static native int getPreprocessing(long var0);

   private static native void setPreprocessing(long var0, int var2);

   private static native int getPartitions(long var0);

   private static native void setPartitions(long var0, int var2);

   private static native int getPartitionLimit(long var0);

   private static native void setPartitionLimit(long var0, int var2);

   private static native int getAlphaCompression(long var0);

   private static native void setAlphaCompression(long var0, int var2);

   private static native int getAlphaFiltering(long var0);

   private static native void setAlphaFiltering(long var0, int var2);

   private static native int getAlphaQuality(long var0);

   private static native void setAlphaQuality(long var0, int var2);

   private static native int getLossless(long var0);

   private static native void setLossless(long var0, int var2);

   private static native int getEmulateJpegSize(long var0);

   private static native void setEmulateJpegSize(long var0, int var2);

   private static native int getThreadLevel(long var0);

   private static native void setThreadLevel(long var0, int var2);

   private static native int getLowMemory(long var0);

   private static native void setLowMemory(long var0, int var2);

   static {
      WebP.loadNativeLibrary();
   }
}
