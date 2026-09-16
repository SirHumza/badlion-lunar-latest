package org.apache.commons.compress.compressors.deflate;

public class DeflateParameters {
   private boolean zlibHeader = true;
   private int compressionLevel = -1;

   public boolean withZlibHeader() {
      return this.zlibHeader;
   }

   public void setWithZlibHeader(boolean var1) {
      this.zlibHeader = var1;
   }

   public int getCompressionLevel() {
      return this.compressionLevel;
   }

   public void setCompressionLevel(int var1) {
      if (var1 >= -1 && var1 <= 9) {
         this.compressionLevel = var1;
      } else {
         throw new IllegalArgumentException("Invalid Deflate compression level: " + var1);
      }
   }
}
