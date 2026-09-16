package org.tritonus.share.sampled.mixer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class TSoftClip extends TClip implements Runnable {
   private static final Logger logger = System.getLogger("org.tritonus.TraceClip");
   private static final int BUFFER_SIZE = 16384;
   private SourceDataLine m_line;
   private byte[] m_abClip;
   private int m_nRepeatCount;
   private Thread m_thread;

   public TSoftClip(Mixer var1, AudioFormat var2) {
      super(null);
      DataLine.Info var3 = new DataLine.Info(SourceDataLine.class, var2);
      this.m_line = (SourceDataLine)AudioSystem.getLine(var3);
   }

   @Override
   public void open(AudioInputStream var1) {
      AudioFormat var2 = var1.getFormat();
      this.setFormat(var2);
      int var3 = var2.getFrameSize();
      if (var3 < 1) {
         throw new IllegalArgumentException("frame size must be positive");
      }

      logger.log(Level.TRACE, "TSoftClip.open(): format: " + var2);
      byte[] var4 = new byte[16384];
      ByteArrayOutputStream var5 = new ByteArrayOutputStream();
      int var6 = 0;

      while (var6 != -1) {
         try {
            var6 = var1.read(var4, 0, var4.length);
         } catch (IOException var8) {
            logger.log(Level.ERROR, var8.getMessage(), var8);
         }

         if (var6 >= 0) {
            logger.log(Level.TRACE, "TSoftClip.open(): Trying to write: " + var6);
            var5.write(var4, 0, var6);
            logger.log(Level.TRACE, "TSoftClip.open(): Written: " + var6);
         }
      }

      this.m_abClip = var5.toByteArray();
      this.setBufferSize(this.m_abClip.length);
      this.m_line.open(this.getFormat());
   }

   @Override
   public int getFrameLength() {
      return this.isOpen() ? this.getBufferSize() / this.getFormat().getFrameSize() : -1;
   }

   @Override
   public long getMicrosecondLength() {
      return this.isOpen() ? (long)(this.getFrameLength() * this.getFormat().getFrameRate() * 1000000.0F) : -1L;
   }

   @Override
   public void setFramePosition(int var1) {
   }

   @Override
   public void setMicrosecondPosition(long var1) {
   }

   @Override
   public int getFramePosition() {
      return -1;
   }

   @Override
   public long getMicrosecondPosition() {
      return -1L;
   }

   @Override
   public void setLoopPoints(int var1, int var2) {
   }

   @Override
   public void loop(int var1) {
      logger.log(Level.TRACE, "TSoftClip.loop(int): called; count = " + var1);
      this.m_nRepeatCount = var1;
      this.m_thread = new Thread(this);
      this.m_thread.start();
   }

   @Override
   public void flush() {
   }

   @Override
   public void drain() {
   }

   @Override
   public void close() {
   }

   @Override
   public void open() {
   }

   @Override
   public void start() {
      logger.log(Level.TRACE, "TSoftClip.start(): called");
      logger.log(Level.TRACE, "TSoftClip.start(): calling 'loop(0)' [hack]");
      this.loop(0);
   }

   @Override
   public void stop() {
   }

   @Override
   public int available() {
      return -1;
   }

   @Override
   public void run() {
      while (this.m_nRepeatCount >= 0) {
         this.m_line.write(this.m_abClip, 0, this.m_abClip.length);
         this.m_nRepeatCount--;
      }
   }
}
