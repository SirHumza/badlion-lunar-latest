package org.tritonus.sampled.convert;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Arrays;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.ArraySet;
import org.tritonus.share.sampled.AudioFormats;
import org.tritonus.share.sampled.AudioUtils;
import org.tritonus.share.sampled.FloatSampleBuffer;
import org.tritonus.share.sampled.FloatSampleInput;
import org.tritonus.share.sampled.convert.TSimpleFormatConversionProvider;

public class SampleRateConversionProvider extends TSimpleFormatConversionProvider {
   private static final Logger logger = System.getLogger(SampleRateConversionProvider.class.getName());
   public static Encoding PCM_SIGNED = Encoding.PCM_SIGNED;
   public static Encoding PCM_UNSIGNED = Encoding.PCM_UNSIGNED;
   private static final boolean DEBUG_STREAM = false;
   private static final boolean DEBUG_STREAM_PROBLEMS = false;
   private static final int ALL = -1;
   private static final AudioFormat[] OUTPUT_FORMATS = new AudioFormat[]{
      new AudioFormat(PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(PCM_SIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, false),
      new AudioFormat(PCM_UNSIGNED, -1.0F, 8, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, false),
      new AudioFormat(PCM_SIGNED, -1.0F, 16, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 24, -1, -1, -1.0F, false),
      new AudioFormat(PCM_SIGNED, -1.0F, 24, -1, -1, -1.0F, true),
      new AudioFormat(PCM_SIGNED, -1.0F, 32, -1, -1, -1.0F, false),
      new AudioFormat(PCM_SIGNED, -1.0F, 32, -1, -1, -1.0F, true)
   };
   private static final float[] commonSampleRates = new float[]{
      8000.0F, 11025.0F, 12000.0F, 16000.0F, 22050.0F, 24000.0F, 32000.0F, 44100.0F, 48000.0F, 56000.0F, 64000.0F, 88200.0F, 96000.0F, 192000.0F
   };

   public SampleRateConversionProvider() {
      super(Arrays.asList(OUTPUT_FORMATS), Arrays.asList(OUTPUT_FORMATS));
   }

   @Override
   public AudioInputStream getAudioInputStream(AudioFormat var1, AudioInputStream var2) {
      AudioFormat var3 = var2.getFormat();
      if (AudioFormats.matches(var3, var1)) {
         return var2;
      } else {
         var1 = this.replaceNotSpecified(var3, var1);
         if (var1.getSampleRate() != -1.0F
            && var3.getSampleRate() != -1.0F
            && var1.getChannels() != -1
            && var3.getChannels() != -1
            && var1.getSampleSizeInBits() != -1
            && var3.getSampleSizeInBits() != -1
            && this.isConversionSupported(var1, var3)) {
            return new SampleRateConversionProvider.SampleRateConverterStream(var2, var1);
         } else {
            throw new IllegalArgumentException("format conversion not supported");
         }
      }
   }

   private static AudioFormat replaceSampleRate(AudioFormat var0, float var1) {
      return var0.getSampleRate() == var1
         ? var0
         : new AudioFormat(var0.getEncoding(), var1, var0.getSampleSizeInBits(), var0.getChannels(), var0.getFrameSize(), var1, var0.isBigEndian());
   }

   @Override
   public AudioFormat[] getTargetFormats(Encoding var1, AudioFormat var2) {
      logger.log(Level.TRACE, ">SampleRateConversionProvider.getTargetFormats(AudioFormat.Encoding, AudioFormat):");
      logger.log(Level.TRACE, "checking out possible target formats");
      logger.log(Level.TRACE, "from: " + var2);
      logger.log(Level.TRACE, "to  : " + var1);
      float var3 = var2.getSampleRate();
      var2 = replaceSampleRate(var2, -1.0F);
      if (!this.isConversionSupported(var1, var2)) {
         logger.log(Level.TRACE, "<returning empty array.");
         return EMPTY_FORMAT_ARRAY;
      }

      ArraySet var4 = new ArraySet();

      for (AudioFormat var6 : this.getCollectionTargetFormats()) {
         var6 = this.replaceNotSpecified(var2, var6);
         if (this.isConversionSupported(var6, var2)) {
            var4.add(var6);
         }
      }

      if (!var4.isEmpty() && var3 != -1.0F) {
         int var13 = var4.size();

         for (int var15 = 0; var15 < var13; var15++) {
            AudioFormat var7 = (AudioFormat)var4.get(var15);

            for (float var11 : commonSampleRates) {
               if (!doMatch(var3, var11)) {
                  var4.add(replaceSampleRate(var7, var11));
               }
            }
         }
      }

      logger.log(Level.TRACE, "<found " + var4.size() + " matching formats.");
      return var4.toArray(EMPTY_FORMAT_ARRAY);
   }

   @Override
   public boolean isConversionSupported(AudioFormat var1, AudioFormat var2) {
      boolean var3 = (
            var1.getSampleRate() == -1.0F
               || var1.getSampleRate() == -1.0F
               || !doMatch(var1.getSampleRate(), var2.getSampleRate()) && doMatch(var1.getChannels(), var2.getChannels())
         )
         && AudioUtils.containsFormat(var2, this.getCollectionSourceFormats().iterator())
         && AudioUtils.containsFormat(var1, this.getCollectionTargetFormats().iterator());
      logger.log(Level.TRACE, ">SampleRateConverter: isConversionSupported(AudioFormat, AudioFormat):");
      logger.log(Level.TRACE, "checking if conversion possible");
      logger.log(Level.TRACE, "from: " + var2);
      logger.log(Level.TRACE, "to  : " + var1);
      logger.log(Level.TRACE, "< result : " + var3);
      return var3;
   }

   protected static long convertLength(AudioFormat var0, AudioFormat var1, long var2) {
      return var2 == -1L ? var2 : (long)(var1.getSampleRate() / var0.getSampleRate() * (float)var2);
   }

   protected static long convertLength(float var0, float var1, long var2) {
      return var2 == -1L ? var2 : (long)(var1 / var0 * (float)var2);
   }

   public static class SRCAudioFormat extends AudioFormat {
      private float sampleRate;

      public SRCAudioFormat(AudioFormat var1) {
         super(
            var1.getEncoding(),
            var1.getSampleRate(),
            var1.getSampleSizeInBits(),
            var1.getChannels(),
            AudioUtils.getFrameSize(var1.getChannels(), var1.getSampleSizeInBits()),
            var1.getSampleRate(),
            var1.isBigEndian(),
            var1.properties()
         );
         this.sampleRate = var1.getSampleRate();
      }

      public void setSampleRate(float var1) {
         if (var1 > 0.0F) {
            this.sampleRate = var1;
         }
      }

      @Override
      public float getSampleRate() {
         return this.sampleRate;
      }

      @Override
      public float getFrameRate() {
         return this.sampleRate;
      }
   }

   public static class SampleRateConverterStream extends AudioInputStream implements FloatSampleInput {
      private FloatSampleBuffer thisBuffer = null;
      private FloatSampleBuffer writeBuffer = null;
      private byte[] byteBuffer;
      private AudioInputStream sourceStream;
      private FloatSampleInput sourceInput;
      private float sourceSampleRate;
      private float targetSampleRate;
      private long sourceFrameLength;
      private double dPos;
      public static final int SAMPLE_AND_HOLD = 1;
      public static final int LINEAR_INTERPOLATION = 2;
      public static final int RESAMPLE = 3;
      private boolean eofReached = false;
      private int sourceBufferTime;
      private int sourceBufferSizeSamples;
      private int conversionAlgorithm = 2;
      private FloatSampleBuffer historyBuffer = null;
      private static final int minimumSamplesInHistory = 1;
      private boolean thisBufferValid = false;
      private long testInFramesRead = 0L;
      private long testOutFramesReturned = 0L;

      public SampleRateConverterStream(AudioInputStream var1, AudioFormat var2) {
         super(
            var1,
            new SampleRateConversionProvider.SRCAudioFormat(var2),
            SampleRateConversionProvider.convertLength(var1.getFormat(), var2, var1.getFrameLength())
         );
         SampleRateConversionProvider.logger.log(Level.TRACE, "SampleRateConverterStream: <init>");
         this.sourceStream = var1;
         if (var1 instanceof FloatSampleInput) {
            this.sourceInput = (FloatSampleInput)var1;
         } else {
            this.sourceInput = null;
         }

         this.sourceSampleRate = var1.getFormat().getSampleRate();
         this.targetSampleRate = var2.getSampleRate();
         this.sourceFrameLength = var1.getFrameLength();
         this.dPos = 0.0;
         this.sourceBufferTime = 100;
         this.resizeBuffers();
         this.flush();
      }

      public SampleRateConverterStream(FloatSampleInput var1, AudioFormat var2, long var3) {
         super(
            new ByteArrayInputStream(new byte[0]),
            new SampleRateConversionProvider.SRCAudioFormat(var2),
            SampleRateConversionProvider.convertLength(var1.getSampleRate(), var2.getSampleRate(), var3)
         );
         SampleRateConversionProvider.logger.log(Level.TRACE, "SampleRateConverterStream: <init>");
         this.sourceStream = null;
         this.sourceInput = var1;
         this.sourceSampleRate = var1.getSampleRate();
         this.targetSampleRate = var2.getSampleRate();
         this.sourceFrameLength = var3;
         this.dPos = 0.0;
         this.sourceBufferTime = 100;
         this.resizeBuffers();
         this.flush();
      }

      private synchronized void resizeBuffers() {
         this.sourceBufferSizeSamples = (int)AudioUtils.millis2Frames(this.sourceBufferTime, this.sourceSampleRate);
         if (this.sourceBufferSizeSamples < 1) {
            this.sourceBufferSizeSamples = 1;
         }

         if (this.sourceBufferSizeSamples < this.outSamples2inSamples(1.0)) {
            this.sourceBufferSizeSamples = (int)this.outSamples2inSamples(1.0) + 1;
         }

         if (this.historyBuffer == null) {
            this.historyBuffer = new FloatSampleBuffer(this.getFormat().getChannels(), this.sourceBufferSizeSamples, this.sourceSampleRate);
            this.historyBuffer.makeSilence();
         }

         this.historyBuffer.changeSampleCount(this.sourceBufferSizeSamples, true);
         if (this.thisBuffer == null) {
            this.thisBuffer = new FloatSampleBuffer(this.getFormat().getChannels(), this.sourceBufferSizeSamples, this.sourceSampleRate);
         }

         this.thisBuffer.changeSampleCount(this.sourceBufferSizeSamples, true);
      }

      private void beforeReadFromSourceStream() {
         FloatSampleBuffer var1 = this.thisBuffer;
         if (var1 != null && var1.getSampleCount() != this.sourceBufferSizeSamples) {
            var1.changeSampleCount(this.sourceBufferSizeSamples, false);
         }
      }

      private void readFromByteSourceStream() {
         int var1 = this.thisBuffer.getByteArrayBufferSize(this.sourceStream.getFormat());
         if (this.byteBuffer == null || this.byteBuffer.length < var1) {
            this.byteBuffer = new byte[var1];
         }

         int var2 = 0;

         int var3;
         do {
            try {
               var3 = this.sourceStream.read(this.byteBuffer, var2, var1 - var2);
            } catch (IOException var5) {
               var3 = -1;
            }

            if (var3 > 0) {
               var2 += var3;
            }
         } while (var2 < var1 && var3 > 0);

         if (var2 == 0) {
            this.close();
         } else {
            this.thisBuffer.initFromByteArray(this.byteBuffer, 0, var2, this.sourceStream.getFormat());
         }
      }

      private void readFromSourceInput() {
         if (this.sourceInput.isDone()) {
            this.close();
         } else {
            this.sourceInput.read(this.thisBuffer);
         }
      }

      private void readFromSourceStream() {
         if (!this.isClosed()) {
            FloatSampleBuffer var1 = this.historyBuffer;
            this.historyBuffer = this.thisBuffer;
            this.thisBuffer = var1;
            this.beforeReadFromSourceStream();
            int var2 = this.thisBuffer.getSampleCount();
            if (this.sourceFrameLength != -1L && var1.getSampleCount() + this.testInFramesRead > this.sourceFrameLength) {
               long var3 = this.sourceFrameLength - this.testInFramesRead;
               if (var3 <= 0L) {
                  this.close();
                  return;
               }

               var1.changeSampleCount((int)var3, false);
            }

            if (this.sourceInput != null) {
               this.readFromSourceInput();
            } else {
               this.readFromByteSourceStream();
            }

            int var8 = var1 == null ? 0 : var1.getSampleCount();
            this.testInFramesRead += var8;
            double var4 = this.outSamples2inSamples(1.0);
            if (!this.thisBufferValid) {
               this.thisBufferValid = true;
               this.dPos = 0.0;
            } else {
               double var6 = this.dPos;
               this.dPos -= var2;
               if ((this.dPos > var4 || this.dPos < -var4) && (int)this.dPos != 0) {
                  this.dPos = 0.0;
               }
            }
         }
      }

      protected void convertSampleAndHold1(float[] var1, double var2, int var4, double var5, float[] var7, int var8, int var9, float[] var10, int var11) {
         for (int var12 = 0; var12 < var9; var12++) {
            int var13 = (int)(var2 + var5 * var12);
            if (var13 < 0) {
               var7[var12 + var8] = var10[var13 + var11];
            } else if (var13 < var4) {
               var7[var12 + var8] = var1[var13];
            }
         }
      }

      private void convertSampleAndHold2(float[] var1, double var2, int var4, double var5, float[] var7, int var8, int var9, float[] var10, int var11) {
         int var12 = var8 + var9;
         double var13 = var11;

         while (var2 < 0.0 && var8 < var12) {
            double var15 = var2 + var13;
            var7[var8] = var10[(int)var15];
            var2 += var5;
            var8++;
         }

         while (var8 < var12) {
            var7[var8] = var1[(int)var2];
            var2 += var5;
            var8++;
         }
      }

      protected void convertLinearInterpolation1(float[] var1, double var2, int var4, double var5, float[] var7, int var8, int var9, float[] var10, int var11) {
         for (int var12 = 0; var12 < var9; var12++) {
            try {
               double var13 = var2 + var5 * var12 - 1.0;
               int var15 = (int)Math.floor(var13);
               double var16 = 1.0 - (var13 - var15);
               float var18 = 0.0F;

               for (int var19 = 0; var19 < 2; var19++) {
                  if (var15 < var4) {
                     if (var15 < 0) {
                        int var20 = var15 + var11;
                        if (var20 >= 0) {
                           var18 += (float)(var10[var20] * var16);
                        }
                     } else {
                        var18 += (float)(var1[var15] * var16);
                     }
                  }

                  var16 = 1.0 - var16;
                  var15++;
               }

               var7[var12 + var8] = var18;
            } catch (ArrayIndexOutOfBoundsException var21) {
            }
         }
      }

      private void convertLinearInterpolation2(float[] var1, double var2, int var4, double var5, float[] var7, int var8, int var9, float[] var10, int var11) {
         try {
            int var12 = var8 + var9;
            double var13 = var11;

            while (var2 < 0.0 && var8 < var12) {
               double var15 = var2 + var13;
               int var17 = (int)var15;
               float var18 = (float)(var15 - var17);
               var7[var8] = var10[var17 - 1] * (1.0F - var18) + var10[var17] * var18;
               var2 += var5;
               var8++;
            }

            while (var2 < 1.0 && var8 < var12) {
               float var20 = (float)var2;
               var7[var8] = var10[var11 - 1] * (1.0F - var20) + var1[0] * var20;
               var2 += var5;
               var8++;
            }

            while (var8 < var12) {
               int var21 = (int)var2;
               float var16 = (float)(var2 - var21);
               var7[var8] = var1[var21 - 1] * (1.0F - var16) + var1[var21] * var16;
               var2 += var5;
               var8++;
            }
         } catch (ArrayIndexOutOfBoundsException var19) {
            SampleRateConversionProvider.logger.log(Level.ERROR, var19.getMessage(), var19);
         }
      }

      private double inSamples2outSamples(double var1) {
         return var1 * this.targetSampleRate / this.sourceSampleRate;
      }

      private double outSamples2inSamples(double var1) {
         return var1 * this.sourceSampleRate / this.targetSampleRate;
      }

      @Override
      public int getChannels() {
         return this.getFormat().getChannels();
      }

      @Override
      public float getSampleRate() {
         return this.getFormat().getSampleRate();
      }

      @Override
      public boolean isDone() {
         return this.isClosed();
      }

      @Override
      public void read(FloatSampleBuffer var1) {
         this.read(var1, 0, var1.getSampleCount());
      }

      @Override
      public void read(FloatSampleBuffer var1, int var2, int var3) {
         if (!this.isClosed() && var3 != 0) {
            if (var1.getChannelCount() != this.thisBuffer.getChannelCount()) {
               throw new IllegalArgumentException("passed buffer has different channel count");
            }

            FloatSampleBuffer var4 = this.thisBuffer;
            double var8 = this.outSamples2inSamples(1.0);
            int var10 = 0;

            do {
               int var11 = var4.getSampleCount();
               if ((int)this.dPos >= var11 || !this.thisBufferValid) {
                  this.readFromSourceStream();
                  if (this.isClosed()) {
                     break;
                  }

                  var4 = this.thisBuffer;
                  var11 = this.thisBuffer.getSampleCount();
                  if (var11 == 0) {
                     break;
                  }
               }

               int var12 = var3 - var10;
               if ((int)(this.outSamples2inSamples(var12) + this.dPos) >= var11) {
                  int var13 = (int)this.inSamples2outSamples(var11 - this.dPos) + 1;

                  while ((int)(this.outSamples2inSamples(var13) + this.dPos) >= var11) {
                     var13--;
                  }

                  var12 = var13 + 1;
               }

               for (int var14 = 0; var14 < var1.getChannelCount(); var14++) {
                  float[] var6 = var4.getChannel(var14);
                  float[] var5 = var1.getChannel(var14);
                  float[] var7 = this.historyBuffer.getChannel(var14);
                  switch (this.conversionAlgorithm) {
                     case 1:
                        this.convertSampleAndHold2(var6, this.dPos, var11, var8, var5, var10 + var2, var12, var7, this.historyBuffer.getSampleCount());
                        break;
                     case 2:
                        this.convertLinearInterpolation2(var6, this.dPos, var11, var8, var5, var10 + var2, var12, var7, this.historyBuffer.getSampleCount());
                  }
               }

               var10 += var12;
               this.dPos = this.dPos + this.outSamples2inSamples(var12);
            } while (!this.isClosed() && var10 < var1.getSampleCount());

            if (var10 < var3) {
               var1.changeSampleCount(var10 + var2, true);
            }
         } else {
            var1.setSampleCount(var2, true);
         }
      }

      protected double sourceFrames2targetFrames(double var1) {
         return this.targetSampleRate / this.sourceSampleRate * var1;
      }

      protected double targetFrames2sourceFrames(double var1) {
         return this.sourceSampleRate / this.targetSampleRate * var1;
      }

      protected long sourceBytes2targetBytes(long var1) {
         long var3 = var1 / this.getSourceFrameSize();
         long var5 = (long)this.sourceFrames2targetFrames(var3);
         return var5 * this.getFrameSize();
      }

      protected long targetBytes2sourceBytes(long var1) {
         long var3 = var1 / this.getFrameSize();
         long var5 = (long)this.targetFrames2sourceFrames(var3);
         return var5 * this.getSourceFrameSize();
      }

      public int getFrameSize() {
         return this.getFormat().getFrameSize();
      }

      public int getSourceFrameSize() {
         return this.sourceStream != null ? this.sourceStream.getFormat().getFrameSize() : 1;
      }

      @Override
      public int read() {
         if (this.getFormat().getFrameSize() != 1) {
            throw new IOException("frame size must be 1 to read a single byte");
         }

         byte[] var1 = new byte[1];
         int var2 = this.read(var1);
         return var2 <= 0 ? -1 : var1[0] & 0xFF;
      }

      @Override
      public int read(byte[] var1) {
         return this.read(var1, 0, var1.length);
      }

      @Override
      public int read(byte[] var1, int var2, int var3) {
         if (this.isClosed()) {
            return -1;
         }

         int var4 = var3 / this.getFrameSize();
         if (this.writeBuffer == null) {
            this.writeBuffer = new FloatSampleBuffer(this.getFormat().getChannels(), var4, this.getFormat().getSampleRate());
         } else {
            this.writeBuffer.changeSampleCount(var4, false);
         }

         this.read(this.writeBuffer);
         return this.writeBuffer.getSampleCount() == 0 && this.eofReached ? -1 : this.writeBuffer.convertToByteArray(var1, var2, this.getFormat());
      }

      @Override
      public synchronized long skip(long var1) {
         long var3 = this.targetBytes2sourceBytes(var1);
         long var5 = this.sourceStream != null ? this.sourceStream.skip(var3) : 0L;
         this.flush();
         return this.sourceBytes2targetBytes(var5);
      }

      @Override
      public int available() {
         return this.sourceStream == null ? -1 : (int)this.sourceBytes2targetBytes(this.sourceStream.available());
      }

      @Override
      public void mark(int var1) {
         if (this.sourceStream != null) {
            this.sourceStream.mark((int)this.targetBytes2sourceBytes(var1));
         }
      }

      @Override
      public synchronized void reset() {
         if (this.sourceStream != null) {
            this.sourceStream.reset();
            this.flush();
         }
      }

      @Override
      public boolean markSupported() {
         return this.sourceStream != null ? this.sourceStream.markSupported() : false;
      }

      @Override
      public void close() {
         if (!this.isClosed()) {
            if (this.sourceStream != null) {
               try {
                  this.sourceStream.close();
               } catch (IOException var2) {
               }
            }

            this.eofReached = true;
            this.thisBuffer = null;
            this.historyBuffer = null;
            this.byteBuffer = null;
         }
      }

      public boolean isClosed() {
         return this.eofReached || this.thisBuffer == null;
      }

      public synchronized void flush() {
         if (!this.isClosed()) {
            this.thisBufferValid = false;
            this.historyBuffer.makeSilence();
         }
      }

      public synchronized void setTargetSampleRate(float var1) {
         if (var1 > 0.0F) {
            this.targetSampleRate = var1;
            this.resizeBuffers();
         }
      }

      public synchronized void setConversionAlgorithm(int var1) {
         if ((var1 == 1 || var1 == 2) && var1 != this.conversionAlgorithm) {
            this.conversionAlgorithm = var1;
            this.resizeBuffers();
         }
      }

      public synchronized float getTargetSampleRate() {
         return this.targetSampleRate;
      }

      public synchronized int getConversionAlgorithm() {
         return this.conversionAlgorithm;
      }
   }
}
