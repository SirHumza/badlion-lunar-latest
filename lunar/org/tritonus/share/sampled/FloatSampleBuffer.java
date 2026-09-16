package org.tritonus.share.sampled;

import javax.sound.sampled.AudioFormat;

public class FloatSampleBuffer {
   private static final boolean LAZY_DEFAULT = true;
   private Object[] channels = new Object[2];
   private int sampleCount = 0;
   private int channelCount = 0;
   private float sampleRate = 0.0F;
   private int originalFormatType = 0;
   public static final int DITHER_MODE_AUTOMATIC = 0;
   public static final int DITHER_MODE_ON = 1;
   public static final int DITHER_MODE_OFF = 2;
   private float ditherBits = 0.7F;
   private int ditherMode = 0;
   private AudioFormat lastConvertToByteArrayFormat = null;
   private int lastConvertToByteArrayFormatCode = 0;

   public FloatSampleBuffer() {
      this(0, 0, 1.0F);
   }

   public FloatSampleBuffer(int var1, int var2, float var3) {
      this.init(var1, var2, var3, true);
   }

   public FloatSampleBuffer(byte[] var1, int var2, int var3, AudioFormat var4) {
      this(var4.getChannels(), var3 / (var4.getSampleSizeInBits() / 8 * var4.getChannels()), var4.getSampleRate());
      this.initFromByteArray(var1, var2, var3, var4);
   }

   public void init(int var1, int var2, float var3) {
      this.init(var1, var2, var3, true);
   }

   public void init(int var1, int var2, float var3, boolean var4) {
      if (var1 >= 0 && var2 >= 0 && !(var3 <= 0.0F)) {
         this.setSampleRate(var3);
         if (this.sampleCount != var2 || this.channelCount != var1) {
            this.createChannels(var1, var2, var4);
         }
      } else {
         throw new IllegalArgumentException("invalid parameters in initialization of FloatSampleBuffer.");
      }
   }

   public static void checkFormatSupported(AudioFormat var0) {
      FloatSampleTools.getFormatType(var0);
   }

   private void grow(int var1, boolean var2) {
      if (this.channels.length < var1 || !var2) {
         Object[] var3 = new Object[var1];
         System.arraycopy(this.channels, 0, var3, 0, Math.min(this.channelCount, var1));
         this.channels = var3;
      }
   }

   private void createChannels(int var1, int var2, boolean var3) {
      if (var3 && var1 <= this.channelCount && var2 <= this.sampleCount) {
         this.setSampleCountImpl(var2);
         this.setChannelCountImpl(var1);
      } else {
         this.setSampleCountImpl(var2);
         this.grow(var1, true);
         this.setChannelCountImpl(0);

         for (int var4 = 0; var4 < var1; var4++) {
            this.insertChannel(var4, false, var3);
         }

         this.grow(var1, var3);
      }
   }

   public void initFromByteArray(byte[] var1, int var2, int var3, AudioFormat var4) {
      this.initFromByteArray(var1, var2, var3, var4, true);
   }

   public void initFromByteArray(byte[] var1, int var2, int var3, AudioFormat var4, boolean var5) {
      if (var2 + var3 > var1.length) {
         throw new IllegalArgumentException("FloatSampleBuffer.initFromByteArray: buffer too small.");
      }

      int var6 = var3 / var4.getFrameSize();
      this.init(var4.getChannels(), var6, var4.getSampleRate(), var5);
      this.originalFormatType = FloatSampleTools.getFormatType(var4);
      FloatSampleTools.byte2float(var1, var2, this.channels, 0, this.sampleCount, var4);
   }

   public void initFromFloatSampleBuffer(FloatSampleBuffer var1) {
      this.init(var1.getChannelCount(), var1.getSampleCount(), var1.getSampleRate());

      for (int var2 = 0; var2 < this.getChannelCount(); var2++) {
         System.arraycopy(var1.getChannel(var2), 0, this.getChannel(var2), 0, this.sampleCount);
      }
   }

   public int writeByteBuffer(byte[] var1, int var2, AudioFormat var3, int var4, int var5) {
      if (var4 + var5 > this.getSampleCount()) {
         var5 = this.getSampleCount() - var4;
      }

      int var6 = var3.getChannels();
      if (var6 > this.getChannelCount()) {
         var6 = this.getChannelCount();
      }

      if (var6 > var3.getChannels()) {
         var6 = var3.getChannels();
      }

      for (int var7 = 0; var7 < var6; var7++) {
         float[] var8 = this.getChannel(var7);
         FloatSampleTools.byte2floatGeneric(var1, var2, var3.getFrameSize(), var8, var4, var5, var3);
         var2 += var3.getFrameSize() / var3.getChannels();
      }

      return var5;
   }

   public void reset() {
      this.init(0, 0, 1.0F, false);
   }

   public void reset(int var1, int var2, float var3) {
      this.init(var1, var2, var3, false);
   }

   public int getByteArrayBufferSize(AudioFormat var1) {
      return this.getByteArrayBufferSize(var1, this.getSampleCount());
   }

   public int getByteArrayBufferSize(AudioFormat var1, int var2) {
      checkFormatSupported(var1);
      return var1.getFrameSize() * var2;
   }

   public int convertToByteArray(byte[] var1, int var2, AudioFormat var3) {
      return this.convertToByteArray(0, this.getSampleCount(), var1, var2, var3);
   }

   public int convertToByteArray(int var1, int var2, byte[] var3, int var4, AudioFormat var5) {
      int var6 = var5.getFrameSize() * var2;
      if (var4 + var6 > var3.length) {
         throw new IllegalArgumentException("FloatSampleBuffer.convertToByteArray: buffer too small.");
      }

      if (var5 != this.lastConvertToByteArrayFormat) {
         if (var5.getSampleRate() != this.getSampleRate()) {
            throw new IllegalArgumentException("FloatSampleBuffer.convertToByteArray: different samplerates.");
         }

         if (var5.getChannels() != this.getChannelCount()) {
            throw new IllegalArgumentException("FloatSampleBuffer.convertToByteArray: different channel count.");
         }

         this.lastConvertToByteArrayFormat = var5;
         this.lastConvertToByteArrayFormatCode = FloatSampleTools.getFormatType(var5);
      }

      FloatSampleTools.float2byte(
         this.channels,
         var1,
         var3,
         var4,
         var2,
         this.lastConvertToByteArrayFormatCode,
         var5.getChannels(),
         var5.getFrameSize(),
         this.getConvertDitherBits(this.lastConvertToByteArrayFormatCode)
      );
      return var6;
   }

   public byte[] convertToByteArray(AudioFormat var1) {
      byte[] var2 = new byte[this.getByteArrayBufferSize(var1)];
      this.convertToByteArray(var2, 0, var1);
      return var2;
   }

   public void changeSampleCount(int var1, boolean var2) {
      int var3 = this.getSampleCount();
      if (var3 >= var1) {
         this.setSampleCountImpl(var1);
      } else if (this.channelCount != 1 && this.channelCount != 2) {
         Object[] var11 = null;
         if (var2) {
            var11 = this.getAllChannels();
         }

         this.init(this.getChannelCount(), var1, this.getSampleRate());
         if (var2) {
            int var15 = Math.min(var1, var3);

            for (int var6 = 0; var6 < this.channelCount; var6++) {
               float[] var7 = (float[])var11[var6];
               float[] var8 = (float[])this.channels[var6];
               if (var7 != var8) {
                  System.arraycopy(var7, 0, var8, 0, var15);
               }

               if (var3 < var1) {
                  for (int var9 = var3; var9 < var1; var9++) {
                     var8[var9] = 0.0F;
                  }
               }
            }
         }
      } else {
         float[] var4 = this.getChannel(0);
         if (var4.length < var1) {
            float[] var5 = new float[var1];
            if (var2 && var3 > 0) {
               System.arraycopy(var4, 0, var5, 0, var3);
            }

            this.channels[0] = var5;
         } else if (var2) {
            for (int var12 = var3; var12 < var1; var12++) {
               var4[var12] = 0.0F;
            }
         }

         if (this.channelCount == 2) {
            var4 = this.getChannel(1);
            if (var4.length < var1) {
               float[] var13 = new float[var1];
               if (var2 && var3 > 0) {
                  System.arraycopy(var4, 0, var13, 0, var3);
               }

               this.channels[1] = var13;
            } else if (var2) {
               for (int var14 = var3; var14 < var1; var14++) {
                  var4[var14] = 0.0F;
               }
            }
         }

         this.setSampleCountImpl(var1);
      }
   }

   public void makeSilence() {
      this.makeSilence(0, this.getSampleCount());
   }

   public void makeSilence(int var1, int var2) {
      if (var1 >= 0 && var2 + var1 <= this.getSampleCount() && var2 >= 0) {
         int var3 = this.getChannelCount();

         for (int var4 = 0; var4 < var3; var4++) {
            this.makeSilence(this.getChannel(var4), var1, var2);
         }
      } else {
         throw new IllegalArgumentException("offset and/or sampleCount out of bounds");
      }
   }

   public void makeSilence(int var1) {
      this.makeSilence(var1, 0, this.getSampleCount());
   }

   public void makeSilence(int var1, int var2, int var3) {
      if (var2 >= 0 && var3 + var2 <= this.getSampleCount() && var3 >= 0) {
         this.makeSilence(this.getChannel(var1), var2, var3);
      } else {
         throw new IllegalArgumentException("offset and/or sampleCount out of bounds");
      }
   }

   private void makeSilence(float[] var1, int var2, int var3) {
      var3 += var2;

      for (int var4 = var2; var4 < var3; var4++) {
         var1[var4] = 0.0F;
      }
   }

   public void linearFade(float var1, float var2) {
      this.linearFade(var1, var2, 0, this.getSampleCount());
   }

   public void linearFade(float var1, float var2, int var3, int var4) {
      for (int var5 = 0; var5 < this.getChannelCount(); var5++) {
         this.linearFade(var5, var1, var2, var3, var4);
      }
   }

   public void linearFade(int var1, float var2, float var3, int var4, int var5) {
      if (var5 > 0) {
         float var6 = var5 + var4;
         float var7 = (var3 - var2) / var5;
         float[] var8 = this.getChannel(var1);
         float var9 = var2;

         for (int var10 = var4; var10 < var6; var10++) {
            var8[var10] *= var9;
            var9 += var7;
         }
      }
   }

   public void addChannel(boolean var1) {
      this.insertChannel(this.getChannelCount(), var1);
   }

   public void insertChannel(int var1, boolean var2) {
      this.insertChannel(var1, var2, true);
   }

   public void insertChannel(int var1, boolean var2, boolean var3) {
      this.grow(this.channelCount + 1, true);
      int var4 = this.channels.length;
      int var5 = this.channelCount;
      float[] var6 = null;
      if (var4 > var5) {
         for (int var7 = var5; var7 < var4; var7++) {
            float[] var8 = (float[])this.channels[var7];
            if (var8 != null && (var3 && var8.length >= this.getSampleCount() || !var3 && var8.length == this.getSampleCount())) {
               var6 = var8;
               this.channels[var7] = null;
               break;
            }
         }
      }

      if (var6 == null) {
         var6 = new float[this.getSampleCount()];
      }

      for (int var9 = var1; var9 < var5; var9++) {
         this.channels[var9 + 1] = this.channels[var9];
      }

      this.channels[var1] = var6;
      this.setChannelCountImpl(this.channelCount + 1);
      if (var2) {
         this.makeSilence(var1);
      }

      this.grow(this.channelCount, var3);
   }

   public void removeChannel(int var1) {
      this.removeChannel(var1, true);
   }

   public void removeChannel(int var1, boolean var2) {
      float[] var3 = (float[])this.channels[var1];

      for (int var4 = var1; var4 < this.channelCount - 1; var4++) {
         this.channels[var4] = this.channels[var4 + 1];
      }

      if (!var2) {
         this.grow(this.channelCount - 1, true);
      } else {
         this.channels[this.channelCount - 1] = var3;
      }

      this.setChannelCountImpl(this.channelCount - 1);
   }

   public void copyChannel(int var1, int var2) {
      float[] var3 = this.getChannel(var1);
      float[] var4 = this.getChannel(var2);
      System.arraycopy(var3, 0, var4, 0, this.getSampleCount());
   }

   public void copyChannel(int var1, int var2, int var3, int var4, int var5) {
      float[] var6 = this.getChannel(var1);
      float[] var7 = this.getChannel(var3);
      System.arraycopy(var6, var2, var7, var4, var5);
   }

   public void copy(int var1, int var2, int var3) {
      int var4 = this.getChannelCount();

      for (int var5 = 0; var5 < var4; var5++) {
         this.copy(var5, var1, var2, var3);
      }
   }

   public void copy(int var1, int var2, int var3, int var4) {
      float[] var5 = this.getChannel(var1);
      int var6 = this.getSampleCount();
      if (var2 + var4 <= var6 && var3 + var4 <= var6 && var2 >= 0 && var3 >= 0 && var4 >= 0) {
         System.arraycopy(var5, var2, var5, var3, var4);
      } else {
         throw new IndexOutOfBoundsException("parameters exceed buffer size");
      }
   }

   public void expandChannel(int var1) {
      if (this.getChannelCount() != 1) {
         throw new IllegalArgumentException("FloatSampleBuffer: can only expand channels for mono signals.");
      }

      for (int var2 = 1; var2 < var1; var2++) {
         this.addChannel(false);
         this.copyChannel(0, var2);
      }
   }

   public void mixDownChannels() {
      float[] var1 = this.getChannel(0);
      int var2 = this.getSampleCount();

      for (int var3 = this.getChannelCount() - 1; var3 > 0; var3--) {
         float[] var4 = this.getChannel(var3);

         for (int var5 = 0; var5 < var2; var5++) {
            var1[var5] += var4[var5];
         }

         this.removeChannel(var3);
      }
   }

   public void mix(FloatSampleBuffer var1) {
      int var2 = this.getSampleCount();
      if (var2 > var1.getSampleCount()) {
         var2 = var1.getSampleCount();
      }

      int var3 = this.getChannelCount();
      if (var3 > var1.getChannelCount()) {
         var3 = var1.getChannelCount();
      }

      for (int var4 = 0; var4 < var3; var4++) {
         float[] var5 = this.getChannel(var4);
         float[] var6 = var1.getChannel(var4);

         for (int var7 = 0; var7 < var2; var7++) {
            var5[var7] += var6[var7];
         }
      }
   }

   public void mix(FloatSampleBuffer var1, int var2, int var3, int var4) {
      int var5 = this.getChannelCount();

      for (int var6 = 0; var6 < var5; var6++) {
         float[] var7 = this.getChannel(var6);
         float[] var8 = var1.getChannel(var6);

         for (int var9 = 0; var9 < var4; var9++) {
            var7[var9 + var3] = var7[var9 + var3] + var8[var9 + var2];
         }
      }
   }

   public int copyTo(FloatSampleBuffer var1, int var2, int var3) {
      return this.copyTo(0, var1, var2, var3);
   }

   public int copyTo(int var1, FloatSampleBuffer var2, int var3, int var4) {
      if (var1 + var4 > this.getSampleCount()) {
         var4 = this.getSampleCount() - var1;
      }

      if (var4 + var3 > var2.getSampleCount()) {
         var4 = var2.getSampleCount() - var3;
      }

      int var5 = this.getChannelCount();
      if (var5 > var2.getChannelCount()) {
         var5 = var2.getChannelCount();
      }

      for (int var6 = 0; var6 < var5; var6++) {
         System.arraycopy(this.getChannel(var6), var1, var2.getChannel(var6), var3, var4);
      }

      return var4;
   }

   public void setSamplesFromBytes(byte[] var1, int var2, AudioFormat var3, int var4, int var5) {
      if (var4 >= 0 && var5 >= 0 && var2 >= 0) {
         if (var2 + var5 * var3.getFrameSize() > var1.length) {
            throw new IllegalArgumentException("FloatSampleBuffer.setSamplesFromBytes: input buffer too small.");
         }

         if (var4 + var5 > this.getSampleCount()) {
            throw new IllegalArgumentException("FloatSampleBuffer.setSamplesFromBytes: frameCount too large");
         }

         FloatSampleTools.byte2float(var1, var2, this.channels, var4, var5, var3, false);
      } else {
         throw new IllegalArgumentException("FloatSampleBuffer.setSamplesFromBytes: negative inByteOffset, floatOffset, or frameCount");
      }
   }

   public int getChannelCount() {
      return this.channelCount;
   }

   public int getSampleCount() {
      return this.sampleCount;
   }

   public float getSampleRate() {
      return this.sampleRate;
   }

   protected void setChannelCountImpl(int var1) {
      if (this.channelCount != var1) {
         this.channelCount = var1;
         this.lastConvertToByteArrayFormat = null;
      }
   }

   protected void setSampleCountImpl(int var1) {
      if (this.sampleCount != var1) {
         this.sampleCount = var1;
      }
   }

   public void setSampleCount(int var1, boolean var2) {
      this.changeSampleCount(var1, var2);
   }

   public void setSampleRate(float var1) {
      if (var1 <= 0.0F) {
         throw new IllegalArgumentException("Invalid samplerate for FloatSampleBuffer.");
      }

      if (this.sampleRate != var1) {
         this.sampleRate = var1;
         this.lastConvertToByteArrayFormat = null;
      }
   }

   public float[] getChannel(int var1) {
      if (var1 >= this.channelCount) {
         throw new IllegalArgumentException("FloatSampleBuffer: invalid channel number.");
      } else {
         return (float[])this.channels[var1];
      }
   }

   public float[] setRawChannel(int var1, float[] var2) {
      if (var2 == null) {
         throw new IllegalArgumentException("cannot set a channel to a null array");
      }

      float[] var3 = this.getChannel(var1);
      this.channels[var1] = var2;
      return var3;
   }

   public Object[] getAllChannels() {
      Object[] var1 = new Object[this.getChannelCount()];

      for (int var2 = 0; var2 < this.getChannelCount(); var2++) {
         var1[var2] = this.getChannel(var2);
      }

      return var1;
   }

   public void setDitherBits(float var1) {
      if (var1 <= 0.0F) {
         throw new IllegalArgumentException("DitherBits must be greater than 0");
      }

      this.ditherBits = var1;
   }

   public float getDitherBits() {
      return this.ditherBits;
   }

   public void setDitherMode(int var1) {
      if (var1 != 0 && var1 != 1 && var1 != 2) {
         throw new IllegalArgumentException("Illegal DitherMode");
      }

      this.ditherMode = var1;
   }

   public int getDitherMode() {
      return this.ditherMode;
   }

   protected float getConvertDitherBits(int var1) {
      boolean var2 = false;
      switch (this.ditherMode) {
         case 0:
            var2 = (this.originalFormatType & 7) > (var1 & 7);
            break;
         case 1:
            var2 = true;
            break;
         case 2:
            var2 = false;
      }

      return var2 ? this.ditherBits : 0.0F;
   }
}
