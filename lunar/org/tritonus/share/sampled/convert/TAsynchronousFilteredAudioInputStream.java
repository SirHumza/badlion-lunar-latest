package org.tritonus.share.sampled.convert;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.AudioFormat;
import org.tritonus.share.TCircularBuffer;

public abstract class TAsynchronousFilteredAudioInputStream extends TAudioInputStream implements TCircularBuffer.Trigger {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioConverter");
   private static final int DEFAULT_BUFFER_SIZE = 327670;
   private static final int DEFAULT_MIN_AVAILABLE = 4096;
   private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
   protected TCircularBuffer m_circularBuffer;
   private int m_nMinAvailable;
   private byte[] m_abSingleByte;

   public TAsynchronousFilteredAudioInputStream(AudioFormat var1, long var2) {
      this(var1, var2, 327670, 4096);
   }

   public TAsynchronousFilteredAudioInputStream(AudioFormat var1, long var2, int var4, int var5) {
      super(new ByteArrayInputStream(EMPTY_BYTE_ARRAY), var1, var2);
      logger.log(Level.TRACE, "TAsynchronousFilteredAudioInputStream.<init>(): begin");
      this.m_circularBuffer = new TCircularBuffer(var4, false, true, this);
      this.m_nMinAvailable = var5;
      logger.log(Level.TRACE, "TAsynchronousFilteredAudioInputStream.<init>(): end");
   }

   protected TCircularBuffer getCircularBuffer() {
      return this.m_circularBuffer;
   }

   protected boolean writeMore() {
      return this.getCircularBuffer().availableWrite() > this.m_nMinAvailable;
   }

   @Override
   public int read() {
      if (this.m_abSingleByte == null) {
         this.m_abSingleByte = new byte[1];
      }

      int var2 = this.read(this.m_abSingleByte);
      int var1;
      if (var2 == -1) {
         var1 = -1;
      } else {
         var1 = this.m_abSingleByte[0] & 255;
      }

      return var1;
   }

   @Override
   public int read(byte[] var1) {
      logger.log(Level.TRACE, "TAsynchronousFilteredAudioInputStream.read(byte[]): begin");
      int var2 = this.read(var1, 0, var1.length);
      logger.log(Level.TRACE, "TAsynchronousFilteredAudioInputStream.read(byte[]): end");
      return var2;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      logger.log(Level.TRACE, "TAsynchronousFilteredAudioInputStream.read(byte[], int, int): begin");
      int var4 = this.m_circularBuffer.read(var1, var2, var3);
      logger.log(Level.TRACE, "TAsynchronousFilteredAudioInputStream.read(byte[], int, int): end");
      return var4;
   }

   @Override
   public long skip(long var1) {
      for (long var3 = 0L; var3 < var1; var3++) {
         int var5 = this.read();
         if (var5 == -1) {
            return var3;
         }
      }

      return var1;
   }

   @Override
   public int available() {
      return this.m_circularBuffer.availableRead();
   }

   @Override
   public void close() {
      this.m_circularBuffer.close();
   }

   @Override
   public boolean markSupported() {
      return false;
   }

   @Override
   public void mark(int var1) {
   }

   @Override
   public void reset() {
      throw new IOException("mark not supported");
   }
}
