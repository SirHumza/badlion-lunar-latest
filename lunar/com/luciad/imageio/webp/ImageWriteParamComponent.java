package com.luciad.imageio.webp;

import java.util.Locale;
import javax.imageio.ImageWriteParam;

public class WebPWriteParam extends ImageWriteParam {
   public static final int LOSSY_COMPRESSION = 0;
   public static final int LOSSLESS_COMPRESSION = 1;
   private final boolean fDefaultLossless;
   private WebPEncoderOptions fOptions = new WebPEncoderOptions();

   public WebPWriteParam(Locale var1) {
      super(var1);
      this.fDefaultLossless = this.fOptions.isLossless();
      this.canWriteCompressed = true;
      this.compressionTypes = new String[]{"Lossy", "Lossless"};
      this.compressionType = this.compressionTypes[this.fDefaultLossless ? 1 : 0];
      this.compressionQuality = this.fOptions.getCompressionQuality() / 100.0F;
      this.compressionMode = 2;
   }

   @Override
   public float getCompressionQuality() {
      return super.getCompressionQuality();
   }

   @Override
   public void setCompressionQuality(float var1) {
      super.setCompressionQuality(var1);
      this.fOptions.setCompressionQuality(var1 * 100.0F);
   }

   @Override
   public void setCompressionType(String var1) {
      super.setCompressionType(var1);

      for (int var2 = 0; var2 < this.compressionTypes.length; var2++) {
         if (this.compressionTypes[var2].equals(var1)) {
            this.fOptions.setLossless(var2 == 1);
            break;
         }
      }
   }

   @Override
   public void unsetCompression() {
      super.unsetCompression();
      this.fOptions.setLossless(this.fDefaultLossless);
   }

   public void setSnsStrength(int var1) {
      this.fOptions.setSnsStrength(var1);
   }

   public void setAlphaQuality(int var1) {
      this.fOptions.setAlphaQuality(var1);
   }

   public int getSegments() {
      return this.fOptions.getSegments();
   }

   public int getPreprocessing() {
      return this.fOptions.getPreprocessing();
   }

   public int getFilterStrength() {
      return this.fOptions.getFilterStrength();
   }

   public void setEmulateJpegSize(boolean var1) {
      this.fOptions.setEmulateJpegSize(var1);
   }

   public int getPartitions() {
      return this.fOptions.getPartitions();
   }

   public void setTargetPSNR(float var1) {
      this.fOptions.setTargetPSNR(var1);
   }

   public int getEntropyAnalysisPassCount() {
      return this.fOptions.getEntropyAnalysisPassCount();
   }

   public int getPartitionLimit() {
      return this.fOptions.getPartitionLimit();
   }

   public int getFilterType() {
      return this.fOptions.getFilterType();
   }

   public int getFilterSharpness() {
      return this.fOptions.getFilterSharpness();
   }

   public int getAlphaQuality() {
      return this.fOptions.getAlphaQuality();
   }

   public boolean isShowCompressed() {
      return this.fOptions.isShowCompressed();
   }

   public boolean isReduceMemoryUsage() {
      return this.fOptions.isReduceMemoryUsage();
   }

   public void setThreadLevel(int var1) {
      this.fOptions.setThreadLevel(var1);
   }

   public boolean isAutoAdjustFilterStrength() {
      return this.fOptions.isAutoAdjustFilterStrength();
   }

   public void setReduceMemoryUsage(boolean var1) {
      this.fOptions.setReduceMemoryUsage(var1);
   }

   public void setFilterStrength(int var1) {
      this.fOptions.setFilterStrength(var1);
   }

   public int getTargetSize() {
      return this.fOptions.getTargetSize();
   }

   public void setEntropyAnalysisPassCount(int var1) {
      this.fOptions.setEntropyAnalysisPassCount(var1);
   }

   public void setFilterSharpness(int var1) {
      this.fOptions.setFilterSharpness(var1);
   }

   public int getAlphaFiltering() {
      return this.fOptions.getAlphaFiltering();
   }

   public int getSnsStrength() {
      return this.fOptions.getSnsStrength();
   }

   public void setPartitionLimit(int var1) {
      this.fOptions.setPartitionLimit(var1);
   }

   public void setMethod(int var1) {
      this.fOptions.setMethod(var1);
   }

   public void setAlphaFiltering(int var1) {
      this.fOptions.setAlphaFiltering(var1);
   }

   public int getMethod() {
      return this.fOptions.getMethod();
   }

   public void setFilterType(int var1) {
      this.fOptions.setFilterType(var1);
   }

   public void setPartitions(int var1) {
      this.fOptions.setPartitions(var1);
   }

   public void setAutoAdjustFilterStrength(boolean var1) {
      this.fOptions.setAutoAdjustFilterStrength(var1);
   }

   public boolean isEmulateJpegSize() {
      return this.fOptions.isEmulateJpegSize();
   }

   public int getAlphaCompression() {
      return this.fOptions.getAlphaCompression();
   }

   public void setShowCompressed(boolean var1) {
      this.fOptions.setShowCompressed(var1);
   }

   public void setSegments(int var1) {
      this.fOptions.setSegments(var1);
   }

   public float getTargetPSNR() {
      return this.fOptions.getTargetPSNR();
   }

   public int getThreadLevel() {
      return this.fOptions.getThreadLevel();
   }

   public void setTargetSize(int var1) {
      this.fOptions.setTargetSize(var1);
   }

   public void setAlphaCompression(int var1) {
      this.fOptions.setAlphaCompression(var1);
   }

   public void setPreprocessing(int var1) {
      this.fOptions.setPreprocessing(var1);
   }

   WebPEncoderOptions getEncoderOptions() {
      return this.fOptions;
   }
}
