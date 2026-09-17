package com.github.trilarion.sound.sampled;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;

public abstract class AsynchronousFilteredAudioInputStream extends AudioInputStream implements CircularBuffer.BufferListener {
   private static final Logger LOG = Logger.getLogger(AsynchronousFilteredAudioInputStream.class.getName());
   private static final int DEFAULT_BUFFER_SIZE = 327670;
   private static final int DEFAULT_MIN_AVAILABLE = 4096;
   private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
   private final CircularBuffer m_circularBuffer;
   private byte[] m_abSingleByte;

   public AsynchronousFilteredAudioInputStream(AudioFormat var1, long var2) {
      this(var1, var2, 327670, 4096);
   }

   public AsynchronousFilteredAudioInputStream(AudioFormat var1, long var2, int var4, int var5) {
      super(new ByteArrayInputStream(EMPTY_BYTE_ARRAY), var1, var2);
      LOG.log(Level.FINE, "TAsynchronousFilteredAudioInputStream.<init>(): begin");
      this.m_circularBuffer = new CircularBuffer(var4, false, true, this);
      LOG.log(Level.FINE, "TAsynchronousFilteredAudioInputStream.<init>(): end");
   }

   protected CircularBuffer getCircularBuffer() {
      return this.m_circularBuffer;
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
      LOG.log(Level.FINE, "TAsynchronousFilteredAudioInputStream.read(byte[]): begin");
      int var2 = this.read(var1, 0, var1.length);
      LOG.log(Level.FINE, "TAsynchronousFilteredAudioInputStream.read(byte[]): end");
      return var2;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      LOG.log(Level.FINE, "TAsynchronousFilteredAudioInputStream.read(byte[], int, int): begin");
      int var4 = this.m_circularBuffer.read(var1, var2, var3);
      LOG.log(Level.FINE, "TAsynchronousFilteredAudioInputStream.read(byte[], int, int): end");
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
