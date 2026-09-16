package org.tritonus.share.sampled.convert;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import org.tritonus.share.sampled.AudioUtils;
import org.tritonus.share.sampled.FloatSampleBuffer;
import org.tritonus.share.sampled.FloatSampleInput;

public abstract class TSynchronousFilteredAudioInputStream extends TAudioInputStream implements FloatSampleInput {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioConverter");
   private AudioInputStream originalStream;
   private FloatSampleInput originalStreamFloat;
   private AudioFormat originalFormat;
   private int originalFrameSize;
   private int newFrameSize;
   private boolean EOF = false;
   protected byte[] m_buffer = null;
   private boolean m_bConvertInPlace;
   private boolean m_enableFloatConversion;
   private byte[] m_floatByteBuffer = null;

   public TSynchronousFilteredAudioInputStream(AudioInputStream var1, AudioFormat var2) {
      super(var1, var2, var1.getFrameLength());
      this.originalStream = var1;
      this.originalFormat = var1.getFormat();
      this.originalFrameSize = this.originalFormat.getFrameSize() <= 0 ? 1 : this.originalFormat.getFrameSize();
      this.newFrameSize = this.getFormat().getFrameSize() <= 0 ? 1 : this.getFormat().getFrameSize();
      if (this.originalStream instanceof FloatSampleInput) {
         this.originalStreamFloat = (FloatSampleInput)this.originalStream;
      }

      logger.log(Level.TRACE, "TSynchronousFilteredAudioInputStream: original format =" + AudioUtils.format2ShortStr(this.originalFormat));
      logger.log(Level.TRACE, "TSynchronousFilteredAudioInputStream: converted format=" + AudioUtils.format2ShortStr(this.getFormat()));
      this.m_bConvertInPlace = false;
      this.m_enableFloatConversion = false;
   }

   protected boolean enableConvertInPlace() {
      if (this.newFrameSize >= this.originalFrameSize) {
         this.m_bConvertInPlace = true;
      }

      return this.m_bConvertInPlace;
   }

   protected void enableFloatConversion() {
      this.m_enableFloatConversion = true;
   }

   protected abstract int convert(byte[] var1, byte[] var2, int var3, int var4);

   protected void convertInPlace(byte[] var1, int var2, int var3) {
      throw new RuntimeException("illegal call to convertInPlace");
   }

   protected void convert(FloatSampleBuffer var1, int var2, int var3) {
      throw new RuntimeException("illegal call to convert(FloatSampleBuffer)");
   }

   @Override
   public int read() {
      if (this.newFrameSize != 1) {
         throw new IOException("frame size must be 1 to read a single byte");
      } else {
         byte[] var1 = new byte[1];
         int var2 = this.read(var1);
         if (var2 == -1) {
            return -1;
         } else {
            return var2 == 0 ? -1 : var1[0] & 0xFF;
         }
      }
   }

   private void clearBuffer() {
      this.m_buffer = null;
      this.m_floatByteBuffer = null;
   }

   public AudioInputStream getOriginalStream() {
      return this.originalStream;
   }

   public AudioFormat getOriginalFormat() {
      return this.originalFormat;
   }

   @Override
   public final int read(byte[] var1, int var2, int var3) {
      int var4 = var3 / this.newFrameSize;
      int var5 = var4 * this.originalFrameSize;
      logger.log(Level.TRACE, "> TSynchronousFilteredAIS.read(buffer[" + var1.length + "], " + var2 + " ," + var3 + " bytes ^=" + var4 + " frames)");
      byte[] var7;
      int var8;
      if (this.m_bConvertInPlace) {
         var7 = var1;
         var8 = var2;
      } else {
         if (this.m_buffer == null || this.m_buffer.length < var5) {
            this.m_buffer = new byte[var5];
         }

         var7 = this.m_buffer;
         var8 = 0;
      }

      int var9 = this.originalStream.read(var7, var8, var5);
      if (var9 == -1) {
         this.clearBuffer();
         this.EOF = true;
         return -1;
      }

      int var10 = var9 / this.originalFrameSize;
      logger.log(Level.TRACE, "original.read returned " + var9 + " bytes ^=" + var10 + " frames");
      int var6;
      if (this.m_bConvertInPlace) {
         this.convertInPlace(var1, var2, var10);
         var6 = var10;
      } else {
         var6 = this.convert(this.m_buffer, var1, var2, var10);
      }

      logger.log(Level.TRACE, "< converted " + var6 + " frames");
      return var6 * this.newFrameSize;
   }

   @Override
   public long skip(long var1) {
      long var3 = var1 / this.newFrameSize;
      long var5 = this.originalStream.skip(var3 * this.originalFrameSize);
      long var7 = var5 / this.originalFrameSize;
      return var7 * this.newFrameSize;
   }

   @Override
   public int available() {
      int var1 = this.originalStream.available() / this.originalFrameSize;
      return var1 * this.newFrameSize;
   }

   @Override
   public void close() {
      this.EOF = true;
      this.originalStream.close();
      this.clearBuffer();
   }

   @Override
   public void mark(int var1) {
      int var2 = var1 / this.newFrameSize;
      this.originalStream.mark(var2 * this.originalFrameSize);
   }

   @Override
   public void reset() {
      this.originalStream.reset();
   }

   @Override
   public boolean markSupported() {
      return this.originalStream.markSupported();
   }

   @Override
   public int getChannels() {
      return this.format.getChannels();
   }

   @Override
   public float getSampleRate() {
      return this.format.getSampleRate();
   }

   @Override
   public boolean isDone() {
      if (this.EOF) {
         return true;
      } else {
         return this.originalStreamFloat != null ? this.originalStreamFloat.isDone() : false;
      }
   }

   @Override
   public void read(FloatSampleBuffer var1, int var2, int var3) {
      try {
         if (this.originalStreamFloat == null && this.m_enableFloatConversion) {
            if (var2 > 0 || var3 != var1.getSampleCount()) {
               throw new IllegalArgumentException("float reading with offset not supported");
            }

            int var7 = var3 * this.originalFrameSize;
            if (this.m_floatByteBuffer == null || this.m_floatByteBuffer.length < var7) {
               this.m_floatByteBuffer = new byte[var7];
            }

            int var8 = this.originalStream.read(this.m_floatByteBuffer, 0, var7);
            if (var8 <= 0) {
               var1.setSampleCount(0, false);
               return;
            }

            var1.initFromByteArray(this.m_floatByteBuffer, 0, var8, this.originalFormat);
            this.convert(var1, 0, var1.getSampleCount());
         } else if (this.originalStreamFloat != null && this.m_enableFloatConversion) {
            this.originalStreamFloat.read(var1, var2, var3);
            if (var2 + var3 > var1.getSampleCount()) {
               var3 = var1.getSampleCount() - var2;
               if (var3 < 0) {
                  var3 = 0;
               }
            }

            this.convert(var1, var2, var3);
         } else {
            if (var2 > 0 || var3 != var1.getSampleCount()) {
               throw new IllegalArgumentException("float reading with offset not supported");
            }

            int var4 = var3 * this.format.getFrameSize();
            if (this.m_floatByteBuffer == null || this.m_floatByteBuffer.length < var4) {
               this.m_floatByteBuffer = new byte[var4];
            }

            int var5 = this.read(this.m_floatByteBuffer, 0, var4);
            if (var5 <= 0) {
               var1.setSampleCount(0, false);
               return;
            }

            var1.initFromByteArray(this.m_floatByteBuffer, 0, var5, this.format);
         }
      } catch (IOException var6) {
         logger.log(Level.ERROR, var6.getMessage(), var6);
         var1.setSampleCount(0, false);
      }
   }

   @Override
   public void read(FloatSampleBuffer var1) {
      this.read(var1, 0, var1.getSampleCount());
   }
}
