package com.luciad.imageio.webp;

import java.io.IOException;
import java.nio.ByteOrder;

public final class WebP {
   private static boolean NATIVE_LIBRARY_LOADED = false;
   public static final WebPImageReaderSpi IMAGE_READER = new WebPImageReaderSpi();
   public static final WebPImageWriterSpi IMAGE_WRITER = new WebPImageWriterSpi();

   static synchronized void loadNativeLibrary() {
      if (!NATIVE_LIBRARY_LOADED) {
         NativeLibraryUtils.loadLibrary();
         NATIVE_LIBRARY_LOADED = true;
      }
   }

   private WebP() {
   }

   public static int[] decode(WebPDecoderOptions var0, byte[] var1, int var2, int var3, int[] var4) {
      if (var0 == null) {
         throw new NullPointerException("Decoder options may not be null");
      }

      if (var1 == null) {
         throw new NullPointerException("Input data may not be null");
      }

      if (var2 + var3 > var1.length) {
         throw new IllegalArgumentException("Offset/length exceeds array size");
      }

      int[] var5 = decode(var0.fPointer, var1, var2, var3, var4, ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN));
      VP8StatusCode var6 = VP8StatusCode.getStatusCode(var4[0]);
      switch (var6) {
         case VP8_STATUS_OK:
            return var5;
         case VP8_STATUS_OUT_OF_MEMORY:
            throw new OutOfMemoryError();
         default:
            throw new IOException("Decode returned code " + var6);
      }
   }

   private static native int[] decode(long var0, byte[] var2, int var3, int var4, int[] var5, boolean var6);

   public static int[] getInfo(byte[] var0, int var1, int var2) {
      int[] var3 = new int[2];
      int var4 = getInfo(var0, var1, var2, var3);
      if (var4 == 0) {
         throw new IOException("Invalid WebP data");
      } else {
         return var3;
      }
   }

   private static native int getInfo(byte[] var0, int var1, int var2, int[] var3);

   public static byte[] encodeRGBA(WebPEncoderOptions var0, byte[] var1, int var2, int var3, int var4) {
      return encodeRGBA(var0.fPointer, var1, var2, var3, var4);
   }

   private static native byte[] encodeRGBA(long var0, byte[] var2, int var3, int var4, int var5);

   public static byte[] encodeRGB(WebPEncoderOptions var0, byte[] var1, int var2, int var3, int var4) {
      return encodeRGB(var0.fPointer, var1, var2, var3, var4);
   }

   private static native byte[] encodeRGB(long var0, byte[] var2, int var3, int var4, int var5);

   static {
      loadNativeLibrary();
   }
}
