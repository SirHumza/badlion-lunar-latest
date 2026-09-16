package org.tritonus.share.sampled;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;

public class FloatInputStream extends AudioInputStream implements FloatSampleInput {
   private InputStream sourceStream;
   private FloatSampleInput sourceInput;
   private boolean eofReached = false;
   private byte[] tempBuffer = null;
   private FloatSampleBuffer tempFloatBuffer = null;

   public FloatInputStream(AudioInputStream var1) {
      super(var1, var1.getFormat(), var1.getFrameLength());
      this.sourceStream = var1;
      this.init();
   }

   public FloatInputStream(InputStream var1, AudioFormat var2, long var3) {
      super(var1, var2, var3);
      this.sourceStream = var1;
      this.init();
   }

   public FloatInputStream(FloatSampleInput var1, AudioFormat var2, long var3) {
      super(new ByteArrayInputStream(new byte[0]), var2, var3);
      this.sourceStream = null;
      this.sourceInput = var1;
      this.init();
   }

   @Override
   public void read(FloatSampleBuffer var1) {
      this.read(var1, 0, var1.getSampleCount());
   }

   private void init() {
      if (this.sourceStream != null && this.sourceStream instanceof FloatSampleInput) {
         this.sourceInput = (FloatSampleInput)this.sourceStream;
      }

      FloatSampleBuffer.checkFormatSupported(this.format);
   }

   @Override
   public void read(FloatSampleBuffer var1, int var2, int var3) {
      if (var3 != 0 && !this.isDone()) {
         if (var1.getChannelCount() != this.getChannels()) {
            throw new IllegalArgumentException("read: passed buffer has different channel count");
         }

         if (this.sourceInput != null) {
            this.sourceInput.read(var1, var2, var3);
         } else {
            int var4 = var1.getSampleCount() * this.getFormat().getFrameSize();
            byte[] var5 = this.tempBuffer;
            if (var5 == null || var4 > var5.length) {
               var5 = new byte[var4];
               this.tempBuffer = var5;
            }

            int var6 = 0;
            int var7 = 0;

            while (var6 < var3) {
               int var8;
               try {
                  var8 = this.sourceStream.read(var5, var7, var4);
               } catch (IOException var10) {
                  var8 = -1;
               }

               if (var8 < 0) {
                  this.eofReached = true;
                  boolean var11 = false;
                  break;
               }

               if (var8 == 0) {
                  Thread.yield();
               } else {
                  var6 += var8 / this.getFormat().getFrameSize();
                  var4 -= var8;
                  var7 += var8;
               }
            }

            var1.setSampleCount(var2 + var6, var2 > 0);
            if (var6 > 0) {
               var1.setSamplesFromBytes(var5, 0, this.getFormat(), var2, var6);
            }
         }
      } else {
         var1.setSampleCount(var2, true);
      }
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
      return !this.eofReached && this.sourceInput != null ? this.sourceInput.isDone() : this.eofReached;
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
      if (this.isDone()) {
         return -1;
      } else {
         return this.sourceStream != null ? this.readBytesFromInputStream(var1, var2, var3) : this.readBytesFromFloatInput(var1, var2, var3);
      }
   }

   protected int readBytesFromInputStream(byte[] var1, int var2, int var3) {
      int var4 = this.sourceStream.read(var1, var2, var3);
      if (var4 < 0) {
         this.eofReached = true;
      }

      return var4;
   }

   protected int readBytesFromFloatInput(byte[] var1, int var2, int var3) {
      FloatSampleInput var4 = this.sourceInput;
      if (var4.isDone()) {
         return -1;
      }

      int var5 = var3 / this.getFormat().getFrameSize();
      FloatSampleBuffer var6 = this.tempFloatBuffer;
      if (var6 == null) {
         var6 = new FloatSampleBuffer(this.getFormat().getChannels(), var5, this.getFormat().getSampleRate());
         this.tempFloatBuffer = var6;
      } else {
         var6.setSampleCount(var5, false);
      }

      var4.read(var6);
      if (var4.isDone()) {
         return -1;
      } else {
         return var1 != null ? this.tempFloatBuffer.convertToByteArray(var1, var2, this.getFormat()) : var5 * this.getFormat().getFrameSize();
      }
   }

   @Override
   public synchronized long skip(long var1) {
      long var3 = var1 / this.getFormat().getFrameSize();
      if (this.sourceStream != null) {
         return this.sourceStream.skip(var3 * this.getFormat().getFrameSize());
      } else {
         return !this.isDone() && var3 > 0L ? this.readBytesFromFloatInput(null, 0, (int)(var3 * this.getFormat().getFrameSize())) : 0L;
      }
   }

   @Override
   public int available() {
      return this.sourceStream != null ? this.sourceStream.available() : -1;
   }

   @Override
   public void mark(int var1) {
      if (this.sourceStream != null) {
         this.sourceStream.mark(var1);
      }
   }

   @Override
   public void reset() {
      if (this.sourceStream != null) {
         this.sourceStream.reset();
      }
   }

   @Override
   public boolean markSupported() {
      return this.sourceStream != null ? this.sourceStream.markSupported() : false;
   }

   @Override
   public void close() {
      if (!this.eofReached) {
         this.eofReached = true;
         if (this.sourceStream != null) {
            this.sourceStream.close();
         }

         this.tempBuffer = null;
         this.tempFloatBuffer = null;
      }
   }
}
