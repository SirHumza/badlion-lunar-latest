package com.luciad.imageio.webp;

import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.ComponentSampleModel;
import java.awt.image.DataBufferByte;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.RenderedImage;
import java.awt.image.SinglePixelPackedSampleModel;
import java.io.IOException;
import javax.imageio.IIOImage;
import javax.imageio.ImageTypeSpecifier;
import javax.imageio.ImageWriteParam;
import javax.imageio.ImageWriter;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.stream.ImageOutputStream;

class WebPWriter extends ImageWriter {
   WebPWriter(ImageWriterSpi var1) {
      super(var1);
   }

   @Override
   public ImageWriteParam getDefaultWriteParam() {
      return new WebPWriteParam(this.getLocale());
   }

   @Override
   public IIOMetadata convertImageMetadata(IIOMetadata var1, ImageTypeSpecifier var2, ImageWriteParam var3) {
      return null;
   }

   @Override
   public IIOMetadata convertStreamMetadata(IIOMetadata var1, ImageWriteParam var2) {
      return null;
   }

   @Override
   public IIOMetadata getDefaultImageMetadata(ImageTypeSpecifier var1, ImageWriteParam var2) {
      return null;
   }

   @Override
   public IIOMetadata getDefaultStreamMetadata(ImageWriteParam var1) {
      return null;
   }

   @Override
   public void write(IIOMetadata var1, IIOImage var2, ImageWriteParam var3) {
      if (var3 == null) {
         var3 = this.getDefaultWriteParam();
      }

      WebPWriteParam var4 = (WebPWriteParam)var3;
      ImageOutputStream var5 = (ImageOutputStream)this.getOutput();
      RenderedImage var6 = var2.getRenderedImage();
      byte[] var7 = encode(var4.getEncoderOptions(), var6);
      var5.write(var7);
   }

   private static byte[] encode(WebPEncoderOptions var0, RenderedImage var1) {
      if (var0 == null) {
         throw new NullPointerException("Encoder options may not be null");
      }

      if (var1 == null) {
         throw new NullPointerException("Image may not be null");
      }

      ThreadLocal var2 = new ThreadLocal();

      try {
         var2.set(var0);
         boolean var4 = hasTranslucency(var1);
         byte[] var3;
         if (var4) {
            byte[] var5 = getRGBA(var1);
            var3 = WebP.encodeRGBA(var0, var5, var1.getWidth(), var1.getHeight(), var1.getWidth() * 4);
         } else {
            byte[] var9 = getRGB(var1);
            var3 = WebP.encodeRGB(var0, var9, var1.getWidth(), var1.getHeight(), var1.getWidth() * 3);
         }

         return var3;
      } finally {
         var2.remove();
      }
   }

   private static boolean hasTranslucency(RenderedImage var0) {
      return var0.getColorModel().hasAlpha();
   }

   private static int getShift(int var0) {
      int var1 = 0;

      while ((var0 >> var1 & 1) == 0) {
         var1++;
      }

      return var1;
   }

   private static byte[] getRGB(RenderedImage var0) {
      int var1 = var0.getWidth();
      int var2 = var0.getHeight();
      ColorModel var3 = var0.getColorModel();
      if (var3 instanceof ComponentColorModel) {
         ComponentSampleModel var7 = (ComponentSampleModel)var0.getSampleModel();
         int var9 = var7.getTransferType();
         if (var9 == 0) {
            return extractComponentRGBByte(var1, var2, var7, (DataBufferByte)var0.getData().getDataBuffer());
         } else if (var9 == 3) {
            return extractComponentRGBInt(var1, var2, var7, (DataBufferInt)var0.getData().getDataBuffer());
         } else {
            throw new IOException("Incompatible image: " + var0);
         }
      } else if (var3 instanceof DirectColorModel) {
         SinglePixelPackedSampleModel var6 = (SinglePixelPackedSampleModel)var0.getSampleModel();
         int var8 = var6.getTransferType();
         if (var8 == 3) {
            return extractDirectRGBInt(var1, var2, (DirectColorModel)var3, var6, (DataBufferInt)var0.getData().getDataBuffer());
         } else {
            throw new IOException("Incompatible image: " + var0);
         }
      } else {
         BufferedImage var4 = new BufferedImage(var0.getWidth(), var0.getHeight(), 1);
         Graphics2D var5 = var4.createGraphics();
         var5.drawRenderedImage(var0, new AffineTransform());
         var5.dispose();
         return getRGB(var4);
      }
   }

   private static byte[] extractDirectRGBInt(int var0, int var1, DirectColorModel var2, SinglePixelPackedSampleModel var3, DataBufferInt var4) {
      byte[] var5 = new byte[var0 * var1 * 3];
      int var6 = var2.getRedMask();
      int var7 = var2.getGreenMask();
      int var8 = var2.getBlueMask();
      int var9 = getShift(var6);
      int var10 = getShift(var7);
      int var11 = getShift(var8);
      int[] var12 = var4.getBankData()[0];
      int var13 = var3.getScanlineStride();
      int var14 = 0;
      byte var15 = 0;

      for (int var16 = 0; var16 < var1; var16++) {
         int var17 = var14;

         for (int var18 = 0; var18 < var0; var15 += 3) {
            int var19 = var12[var17++];
            var5[var15] = (byte)((var19 & var6) >>> var9);
            var5[var15 + 1] = (byte)((var19 & var7) >>> var10);
            var5[var15 + 2] = (byte)((var19 & var8) >>> var11);
            var18++;
         }

         var14 += var13;
      }

      return var5;
   }

   private static byte[] extractComponentRGBInt(int var0, int var1, ComponentSampleModel var2, DataBufferInt var3) {
      byte[] var4 = new byte[var0 * var1 * 3];
      int[] var5 = var2.getBankIndices();
      int[] var6 = var3.getBankData()[var5[0]];
      int[] var7 = var3.getBankData()[var5[1]];
      int[] var8 = var3.getBankData()[var5[2]];
      int[] var9 = var2.getBandOffsets();
      int var10 = var9[0];
      int var11 = var9[1];
      int var12 = var9[2];
      int var13 = var2.getPixelStride();
      int var14 = var2.getScanlineStride();
      byte var15 = 0;

      for (int var16 = 0; var16 < var1; var16++) {
         int var17 = var10;
         int var18 = var11;
         int var19 = var12;

         for (int var20 = 0; var20 < var0; var15 += 3) {
            var4[var15] = (byte)var6[var17];
            var17 += var13;
            var4[var15 + 1] = (byte)var7[var18];
            var18 += var13;
            var4[var15 + 2] = (byte)var8[var19];
            var19 += var13;
            var20++;
         }

         var10 += var14;
         var11 += var14;
         var12 += var14;
      }

      return var4;
   }

   private static byte[] extractComponentRGBByte(int var0, int var1, ComponentSampleModel var2, DataBufferByte var3) {
      byte[] var4 = new byte[var0 * var1 * 3];
      int[] var5 = var2.getBankIndices();
      byte[] var6 = var3.getBankData()[var5[0]];
      byte[] var7 = var3.getBankData()[var5[1]];
      byte[] var8 = var3.getBankData()[var5[2]];
      int[] var9 = var2.getBandOffsets();
      int var10 = var9[0];
      int var11 = var9[1];
      int var12 = var9[2];
      int var13 = var2.getPixelStride();
      int var14 = var2.getScanlineStride();
      byte var15 = 0;

      for (int var16 = 0; var16 < var1; var16++) {
         int var17 = var10;
         int var18 = var11;
         int var19 = var12;

         for (int var20 = 0; var20 < var0; var15 += 3) {
            var4[var15] = var6[var17];
            var17 += var13;
            var4[var15 + 1] = var7[var18];
            var18 += var13;
            var4[var15 + 2] = var8[var19];
            var19 += var13;
            var20++;
         }

         var10 += var14;
         var11 += var14;
         var12 += var14;
      }

      return var4;
   }

   private static byte[] getRGBA(RenderedImage var0) {
      int var1 = var0.getWidth();
      int var2 = var0.getHeight();
      ColorModel var3 = var0.getColorModel();
      if (var3 instanceof ComponentColorModel) {
         ComponentSampleModel var7 = (ComponentSampleModel)var0.getSampleModel();
         int var9 = var7.getTransferType();
         if (var9 == 0) {
            return extractComponentRGBAByte(var1, var2, var7, (DataBufferByte)var0.getData().getDataBuffer());
         } else if (var9 == 3) {
            return extractComponentRGBAInt(var1, var2, var7, (DataBufferInt)var0.getData().getDataBuffer());
         } else {
            throw new IOException("Incompatible image: " + var0);
         }
      } else if (var3 instanceof DirectColorModel) {
         SinglePixelPackedSampleModel var6 = (SinglePixelPackedSampleModel)var0.getSampleModel();
         int var8 = var6.getTransferType();
         if (var8 == 3) {
            return extractDirectRGBAInt(var1, var2, (DirectColorModel)var3, var6, (DataBufferInt)var0.getData().getDataBuffer());
         } else {
            throw new IOException("Incompatible image: " + var0);
         }
      } else {
         BufferedImage var4 = new BufferedImage(var0.getWidth(), var0.getHeight(), 2);
         Graphics2D var5 = var4.createGraphics();
         var5.drawRenderedImage(var0, new AffineTransform());
         var5.dispose();
         return getRGBA(var4);
      }
   }

   private static byte[] extractDirectRGBAInt(int var0, int var1, DirectColorModel var2, SinglePixelPackedSampleModel var3, DataBufferInt var4) {
      byte[] var5 = new byte[var0 * var1 * 4];
      int var6 = var2.getRedMask();
      int var7 = var2.getGreenMask();
      int var8 = var2.getBlueMask();
      int var9 = var2.getAlphaMask();
      int var10 = getShift(var6);
      int var11 = getShift(var7);
      int var12 = getShift(var8);
      int var13 = getShift(var9);
      int[] var14 = var4.getBankData()[0];
      int var15 = var3.getScanlineStride();
      int var16 = 0;
      byte var17 = 0;

      for (int var18 = 0; var18 < var1; var18++) {
         int var19 = var16;

         for (int var20 = 0; var20 < var0; var17 += 4) {
            int var21 = var14[var19++];
            var5[var17] = (byte)((var21 & var6) >>> var10);
            var5[var17 + 1] = (byte)((var21 & var7) >>> var11);
            var5[var17 + 2] = (byte)((var21 & var8) >>> var12);
            var5[var17 + 3] = (byte)((var21 & var9) >>> var13);
            var20++;
         }

         var16 += var15;
      }

      return var5;
   }

   private static byte[] extractComponentRGBAInt(int var0, int var1, ComponentSampleModel var2, DataBufferInt var3) {
      byte[] var4 = new byte[var0 * var1 * 4];
      int[] var5 = var2.getBankIndices();
      int[] var6 = var3.getBankData()[var5[0]];
      int[] var7 = var3.getBankData()[var5[1]];
      int[] var8 = var3.getBankData()[var5[2]];
      int[] var9 = var3.getBankData()[var5[3]];
      int[] var10 = var2.getBandOffsets();
      int var11 = var10[0];
      int var12 = var10[1];
      int var13 = var10[2];
      int var14 = var10[3];
      int var15 = var2.getPixelStride();
      int var16 = var2.getScanlineStride();
      byte var17 = 0;

      for (int var18 = 0; var18 < var1; var18++) {
         int var19 = var11;
         int var20 = var12;
         int var21 = var13;
         int var22 = var14;

         for (int var23 = 0; var23 < var0; var17 += 4) {
            var4[var17] = (byte)var6[var19];
            var19 += var15;
            var4[var17 + 1] = (byte)var7[var20];
            var20 += var15;
            var4[var17 + 2] = (byte)var8[var21];
            var21 += var15;
            var4[var17 + 3] = (byte)var9[var22];
            var22 += var15;
            var23++;
         }

         var11 += var16;
         var12 += var16;
         var13 += var16;
         var14 += var16;
      }

      return var4;
   }

   private static byte[] extractComponentRGBAByte(int var0, int var1, ComponentSampleModel var2, DataBufferByte var3) {
      byte[] var4 = new byte[var0 * var1 * 4];
      int[] var5 = var2.getBankIndices();
      byte[] var6 = var3.getBankData()[var5[0]];
      byte[] var7 = var3.getBankData()[var5[1]];
      byte[] var8 = var3.getBankData()[var5[2]];
      byte[] var9 = var3.getBankData()[var5[3]];
      int[] var10 = var2.getBandOffsets();
      int var11 = var10[0];
      int var12 = var10[1];
      int var13 = var10[2];
      int var14 = var10[3];
      int var15 = var2.getPixelStride();
      int var16 = var2.getScanlineStride();
      byte var17 = 0;

      for (int var18 = 0; var18 < var1; var18++) {
         int var19 = var11;
         int var20 = var12;
         int var21 = var13;
         int var22 = var14;

         for (int var23 = 0; var23 < var0; var17 += 4) {
            var4[var17] = var6[var19];
            var19 += var15;
            var4[var17 + 1] = var7[var20];
            var20 += var15;
            var4[var17 + 2] = var8[var21];
            var21 += var15;
            var4[var17 + 3] = var9[var22];
            var22 += var15;
            var23++;
         }

         var11 += var16;
         var12 += var16;
         var13 += var16;
         var14 += var16;
      }

      return var4;
   }
}
