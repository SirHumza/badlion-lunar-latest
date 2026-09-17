package com.beatofthedrum.alacdecoder;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.nio.channels.FileChannel;

public class AlacContext {
   private static final Logger logger = System.getLogger(AlacContext.class.getName());
   DemuxResT demuxRes;
   AlacFile file;
   AlacContext.AlacInputStream inputStream;
   private int currentSampleBlock = 0;
   private int offset;
   private final byte[] readBuffer = new byte[81920];

   public static AlacContext openFileInput(File var0) {
      DemuxResT var2 = new DemuxResT();
      AlacContext var3 = new AlacContext();
      FileInputStream var5 = new FileInputStream(var0);
      var3.setInputStream(var5);
      QTMovieT var6 = new QTMovieT(var3.inputStream);
      int var1 = var6.read(var2);
      if (var1 == 0) {
         String var7;
         if (var2.formatRead == 0) {
            var7 = "Failed to load the QuickTime movie headers.";
         } else {
            var7 = "Error while loading the QuickTime movie headers. File type: " + QTMovieT.splitFourCC(var2.format);
         }

         throw new IOException(var7);
      } else {
         if (var1 == 3) {
            var3.inputStream.close();
            var5 = new FileInputStream(var0);
            var3.setInputStream(var5);
            var6.qtStream.stream = var3.inputStream;
            var6.qtStream.currentPos = 0;
            var6.qtStream.skip(var6.savedMDatPos);
         }

         AlacFile var4 = AlacFile.create(var2.sampleSize, var2.numChannels);
         var4.setAlacInfo(var2.codecData);
         var3.demuxRes = var2;
         var3.file = var4;
         return var3;
      }
   }

   public void setInputStream(InputStream var1) {
      this.inputStream = new AlacContext.AlacInputStream(var1);
   }

   public void setPosition(long var1) {
      DemuxResT var3 = this.demuxRes;
      int var4 = 0;
      int var5 = 0;
      DemuxResT.SampleDuration var6 = new DemuxResT.SampleDuration();

      for (int var7 = 0; var7 < var3.stsc.length; var7++) {
         DemuxResT.ChunkInfo var8 = var3.stsc[var7];
         int var9;
         if (var7 < var3.stsc.length - 1) {
            var9 = var3.stsc[var7 + 1].firstChunk;
         } else {
            var9 = var3.stco.length;
         }

         for (int var10 = var8.firstChunk; var10 <= var9; var10++) {
            int var11 = var3.stco[var10 - 1];

            for (int var12 = var8.samplesPerChunk; var12 > 0; var12--) {
               var3.getSampleInfo(var5, var6);
               var4 += var6.sampleDuration;
               if (var1 < var4) {
                  this.inputStream.seek(var11);
                  this.currentSampleBlock = var5;
                  this.offset = (int)(var1 - (var4 - var6.sampleDuration)) * this.getNumChannels();
                  return;
               }

               var11 += var6.sampleByteSize;
               var5++;
            }
         }
      }
   }

   public int getNumSamples() {
      int var1 = 0;
      boolean var2 = false;
      boolean var3 = false;

      for (int var4 = 0; var4 < this.demuxRes.sampleByteSize.length; var4++) {
         int var5 = 0;
         int var6 = 0;
         DemuxResT.SampleDuration var7 = new DemuxResT.SampleDuration();
         this.demuxRes.getSampleInfo(var4, var7);
         var5 = var7.sampleDuration;
         var6 = var7.sampleByteSize;
         var1 += var5;
      }

      return var1;
   }

   public int getBytesPerSample() {
      return this.demuxRes.sampleSize != 0 ? (int)Math.ceil(this.demuxRes.sampleSize / 8.0) : 2;
   }

   public int getBitsPerSample() {
      return this.demuxRes.sampleSize != 0 ? this.demuxRes.sampleSize : 16;
   }

   public int getNumChannels() {
      return this.demuxRes.numChannels != 0 ? this.demuxRes.numChannels : 2;
   }

   public int getSampleRate() {
      return this.demuxRes.sampleRate != 0 ? this.demuxRes.sampleRate : 44100;
   }

   public int unpackSamples(int[] var1) {
      DemuxResT.SampleDuration var2 = new DemuxResT.SampleDuration();
      byte[] var3 = this.readBuffer;
      int var4 = var1.length;
      MyStream var5 = new MyStream(this.inputStream);
      if (this.currentSampleBlock >= this.demuxRes.sampleByteSize.length) {
         return -1;
      }

      this.demuxRes.getSampleInfo(this.currentSampleBlock, var2);
      int var6 = var2.sampleByteSize;
      var5.read(var6, var3, 0);
      int var7 = var4;
      var7 = this.file.decodeFrame(var3, var1, var7);
      this.currentSampleBlock++;
      var7 -= this.offset * this.getBytesPerSample();
      System.arraycopy(var1, this.offset, var1, 0, var7);
      this.offset = 0;
      return var7;
   }

   public void close() {
      if (null != this.inputStream) {
         this.inputStream.close();
      }
   }

   private static class AlacInputStream extends DataInputStream {
      int total;

      public AlacInputStream(InputStream var1) {
         super(var1);
         this.total = var1.available();
         AlacContext.logger.log(Level.DEBUG, "total: " + this.total);
      }

      public void seek(long var1) {
         if (this.in instanceof FileInputStream) {
            FileChannel var3 = ((FileInputStream)this.in).getChannel();
            var3.position(var1);
            AlacContext.logger.log(Level.DEBUG, "position: " + var3.position());
         } else if (this.in.markSupported()) {
            this.in.reset();
            this.in.mark(this.total);
            AlacContext.logger.log(Level.DEBUG, "reset: " + this.in.available());
            if (var1 != 0L) {
               this.skipBytes((int)var1);
            }
         }
      }
   }
}
