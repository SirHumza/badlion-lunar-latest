package com.luciad.imageio.webp;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.SampleModel;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Iterator;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.stream.ImageInputStream;

class WebPReader extends ImageReader {
   private byte[] fData;
   private int fWidth;
   private int fHeight;

   WebPReader(ImageReaderSpi var1) {
      super(var1);
   }

   @Override
   public void setInput(Object var1, boolean var2, boolean var3) {
      super.setInput(var1, var2, var3);
      this.fData = null;
      this.fWidth = -1;
      this.fHeight = -1;
   }

   @Override
   public int getNumImages(boolean var1) {
      return 1;
   }

   private void readHeader() {
      if (this.fWidth == -1 || this.fHeight == -1) {
         this.readData();
         int[] var1 = WebP.getInfo(this.fData, 0, this.fData.length);
         this.fWidth = var1[0];
         this.fHeight = var1[1];
      }
   }

   private void readData() {
      if (this.fData == null) {
         ImageInputStream var1 = (ImageInputStream)this.getInput();
         long var2 = var1.length();
         if (var2 > 2147483647L) {
            throw new IOException("Cannot read image of size " + var2);
         }

         if (var1.getStreamPosition() != 0L) {
            if (this.isSeekForwardOnly()) {
               throw new IOException();
            }

            var1.seek(0L);
         }

         byte[] var4;
         if (var2 > 0L) {
            var4 = new byte[(int)var2];
            var1.readFully(var4);
         } else {
            ByteArrayOutputStream var5 = new ByteArrayOutputStream();
            byte[] var6 = new byte[4096];

            int var7;
            while ((var7 = var1.read(var6)) != -1) {
               var5.write(var6, 0, var7);
            }

            var5.close();
            var4 = var5.toByteArray();
         }

         this.fData = var4;
      }
   }

   private void checkIndex(int var1) {
      if (var1 != 0) {
         throw new IndexOutOfBoundsException("Invalid image index: " + var1);
      }
   }

   @Override
   public int getWidth(int var1) {
      this.checkIndex(var1);
      this.readHeader();
      return this.fWidth;
   }

   @Override
   public int getHeight(int var1) {
      this.checkIndex(var1);
      this.readHeader();
      return this.fHeight;
   }

   @Override
   public IIOMetadata getStreamMetadata() {
      return null;
   }

   @Override
   public IIOMetadata getImageMetadata(int var1) {
      return null;
   }

   @Override
   public Iterator<ImageTypeSpecifier> getImageTypes(int var1) {
      return Collections.singletonList(ImageTypeSpecifier.createFromBufferedImageType(2)).iterator();
   }

   @Override
   public ImageReadParam getDefaultReadParam() {
      return new WebPReadParam();
   }

   @Override
   public BufferedImage read(int var1, ImageReadParam var2) {
      this.checkIndex(var1);
      this.readData();
      this.readHeader();
      WebPReadParam var3 = var2 != null ? (WebPReadParam)var2 : new WebPReadParam();
      int[] var4 = new int[4];
      int[] var5 = WebP.decode(var3.getDecoderOptions(), this.fData, 0, this.fData.length, var4);
      int var6 = var4[1];
      int var7 = var4[2];
      boolean var8 = var4[3] != 0;
      DirectColorModel var9;
      if (var8) {
         var9 = new DirectColorModel(32, 16711680, 65280, 255, -16777216);
      } else {
         var9 = new DirectColorModel(24, 16711680, 65280, 255, 0);
      }

      SampleModel var10 = var9.createCompatibleSampleModel(var6, var7);
      DataBufferInt var11 = new DataBufferInt(var5, var6 * var7);
      WritableRaster var12 = WritableRaster.createWritableRaster(var10, var11, null);
      return new BufferedImage(var9, var12, false, new Hashtable());
   }
}
