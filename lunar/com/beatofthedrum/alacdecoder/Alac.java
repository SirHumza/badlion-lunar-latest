package com.beatofthedrum.alacdecoder;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class Alac implements AutoCloseable {
   private static final Logger logger = System.getLogger(Alac.class.getName());
   private final AlacContext context = new AlacContext();

   public Alac(InputStream var1) {
      if (!(var1 instanceof FileInputStream) && !var1.markSupported()) {
         throw new IOException("is must be mark supported or FileInputStream");
      }

      if (var1.markSupported()) {
         int var2 = var1.available();
         var1.mark(var2);
      }

      this.context.setInputStream(var1);
      QTMovieT var8 = new QTMovieT(this.context.inputStream);
      DemuxResT var3 = new DemuxResT();
      int var4 = var8.read(var3);
      logger.log(Level.DEBUG, "headerRead: " + var4);
      if (var4 == 0) {
         String var9;
         if (var3.formatRead == 0) {
            var9 = "Failed to load the QuickTime movie headers.";
         } else {
            var9 = "Error while loading the QuickTime movie headers. File type: " + QTMovieT.splitFourCC(var3.format);
         }

         try {
            if (var1.markSupported()) {
               var1.reset();
               logger.log(Level.DEBUG, "reset: " + var1.available());
            } else if (var1 instanceof FileInputStream) {
               ((FileInputStream)var1).getChannel().position(0L);
               logger.log(Level.DEBUG, "seek: 0");
            }
         } catch (IOException var7) {
            logger.log(Level.DEBUG, var7.getMessage());
         }

         throw new IllegalArgumentException(var9);
      } else {
         if (var4 == 3) {
            if (var1.markSupported()) {
               var1.reset();
               logger.log(Level.DEBUG, "reset: " + var1.available());
            } else if (var1 instanceof FileInputStream) {
               ((FileInputStream)var1).getChannel().position(0L);
               logger.log(Level.DEBUG, "seek: 0");
            }

            var8.qtStream.currentPos = 0;
            var8.qtStream.skip(var8.savedMDatPos);
         }

         AlacFile var5 = AlacFile.create(var3.sampleSize, var3.numChannels);
         var5.setAlacInfo(var3.codecData);
         this.context.demuxRes = var3;
         this.context.file = var5;
      }
   }

   @Override
   public void close() {
      this.context.close();
   }

   public int decode(int[] var1, byte[] var2) {
      int var3 = this.context.unpackSamples(var1);
      if (var3 > 0) {
         formatSamples(var2, this.getFrameSize(), var1, var3);
      }

      return var3;
   }

   public int getSampleRate() {
      return this.context.getSampleRate();
   }

   public int getChannels() {
      return this.context.getNumChannels();
   }

   public int getSampleSizeInBits() {
      return this.context.getBitsPerSample();
   }

   public int getFrameSize() {
      return this.context.getBytesPerSample();
   }

   public int getFrameRate() {
      return this.context.getSampleRate();
   }

   public int getNumSamples() {
      return this.context.getNumSamples();
   }

   private static void formatSamples(byte[] var0, int var1, int[] var2, int var3) {
      int var4 = 0;
      int var5 = 0;
      switch (var1) {
         case 1:
            while (var3 > 0) {
               var0[var4] = (byte)(0xFF & var2[var4] + 128);
               var4++;
               var3--;
            }
            break;
         case 2:
            while (var3 > 0) {
               int var6 = var2[var5];
               var0[var4] = (byte)var6;
               var0[++var4] = (byte)(var6 >>> 8);
               var4++;
               var5++;
               var3 -= 2;
            }
            break;
         case 3:
            while (var3 > 0) {
               var0[var4] = (byte)var2[var5];
               var4++;
               var5++;
               var3--;
            }
      }
   }

   public static int decodeFrame(int[] var0, byte[] var1, int[] var2, int var3) {
      AlacFile var4 = new AlacFile();
      var4.numChannels = 2;
      var4.bytesPerSample = var0[3] / 8 * 2;
      var4.setInfo_maxSamplesPerFrame = var0[1];
      var4.setInfo_7A = var0[2];
      var4.setInfo_sampleSize = var0[3];
      var4.setInfo_riceHistoryMult = var0[4];
      var4.setInfo_riceInitialHistory = var0[5];
      var4.setInfo_riceKModifier = var0[6];
      var4.setInfo_7f = var0[7];
      var4.setInfo_80 = var0[8];
      var4.setInfo_82 = var0[9];
      var4.setInfo_86 = var0[10];
      var4.setInfo_8a_rate = var0[11];
      return var4.decodeFrame(var1, var2, var3);
   }
}
