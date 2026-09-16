package org.tritonus.share.sampled.mixer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collection;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Control;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;

public class TClip extends TDataLine implements Clip {
   private static final Logger logger = System.getLogger("org.tritonus.TraceClip");

   public TClip(DataLine.Info var1) {
      super(null, var1);
   }

   public TClip(DataLine.Info var1, Collection<Control> var2) {
      super(null, var1, var2);
   }

   @Override
   public void open(AudioFormat var1, byte[] var2, int var3, int var4) {
      ByteArrayInputStream var5 = new ByteArrayInputStream(var2, var3, var4);
      AudioInputStream var6 = new AudioInputStream(var5, var1, -1L);

      try {
         this.open(var6);
      } catch (IOException var8) {
         logger.log(Level.ERROR, var8.getMessage(), var8);
         throw new LineUnavailableException("IOException occured");
      }
   }

   @Override
   public void open(AudioInputStream var1) {
      AudioFormat var2 = var1.getFormat();
      DataLine.Info var3 = new DataLine.Info(Clip.class, var2, -1);
      this.setLineInfo(var3);
   }

   @Override
   public int getFrameLength() {
      return -1;
   }

   @Override
   public long getMicrosecondLength() {
      return -1L;
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
      logger.log(Level.TRACE, "TClip.loop(int): called; count = " + var1);
      if (var1 == 0) {
         logger.log(Level.TRACE, "TClip.loop(int): starting sample (once)");
      } else {
         logger.log(Level.TRACE, "TClip.loop(int): starting sample (forever)");
      }
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
      logger.log(Level.TRACE, "TClip.start(): called");
      logger.log(Level.TRACE, "TClip.start(): calling 'loop(0)' [hack]");
      this.loop(0);
   }

   @Override
   public void stop() {
   }

   @Override
   public int available() {
      return -1;
   }
}
