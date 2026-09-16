package org.tritonus.share.sampled.file;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.spi.AudioFileReader;

public abstract class TAudioFileReader extends AudioFileReader {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioFileReader");
   private int m_nMarkLimit;
   private boolean m_bRereading;

   protected TAudioFileReader(int var1) {
      this(var1, false);
   }

   protected TAudioFileReader(int var1, boolean var2) {
      this.m_nMarkLimit = var1;
      this.m_bRereading = var2;
   }

   protected int getMarkLimit() {
      return this.m_nMarkLimit;
   }

   protected void setMarkLimit(int var1) {
      this.m_nMarkLimit = var1;
   }

   private boolean isRereading() {
      return this.m_bRereading;
   }

   @Override
   public AudioFileFormat getAudioFileFormat(File var1) {
      logger.log(Level.TRACE, "TAudioFileReader.getAudioFileFormat(File): begin (class: " + this.getClass().getSimpleName() + ")");
      long var2 = var1.length();
      InputStream var4 = Files.newInputStream(var1.toPath());

      AudioFileFormat var5;
      try {
         var5 = this.getAudioFileFormat(var4, var2);
      } finally {
         var4.close();
      }

      logger.log(Level.TRACE, "TAudioFileReader.getAudioFileFormat(File): end");
      return var5;
   }

   @Override
   public AudioFileFormat getAudioFileFormat(URL var1) {
      logger.log(Level.TRACE, "TAudioFileReader.getAudioFileFormat(URL): begin (class: " + this.getClass().getSimpleName() + ")");
      long var2 = getDataLength(var1);
      InputStream var4 = var1.openStream();

      AudioFileFormat var5;
      try {
         var5 = this.getAudioFileFormat(var4, var2);
      } finally {
         var4.close();
      }

      logger.log(Level.TRACE, "TAudioFileReader.getAudioFileFormat(URL): end");
      return var5;
   }

   @Override
   public AudioFileFormat getAudioFileFormat(InputStream var1) {
      logger.log(Level.TRACE, "TAudioFileReader.getAudioFileFormat(InputStream): begin (class: " + this.getClass().getSimpleName() + ")");
      long var2 = -1L;
      if (!var1.markSupported()) {
         var1 = new BufferedInputStream(var1, this.getMarkLimit());
      }

      var1.mark(this.getMarkLimit());

      AudioFileFormat var4;
      try {
         var4 = this.getAudioFileFormat(var1, var2);
      } finally {
         var1.reset();
      }

      logger.log(Level.TRACE, "TAudioFileReader.getAudioFileFormat(InputStream): end");
      return var4;
   }

   protected abstract AudioFileFormat getAudioFileFormat(InputStream var1, long var2);

   @Override
   public AudioInputStream getAudioInputStream(File var1) {
      logger.log(Level.TRACE, "TAudioFileReader.getAudioInputStream(File): begin (class: " + this.getClass().getSimpleName() + ")");
      long var2 = var1.length();
      InputStream var4 = Files.newInputStream(var1.toPath());

      AudioInputStream var5;
      try {
         var5 = this.getAudioInputStream(var4, var2);
      } catch (UnsupportedAudioFileException | IOException var7) {
         var4.close();
         throw var7;
      }

      logger.log(Level.TRACE, "TAudioFileReader.getAudioInputStream(File): end");
      return var5;
   }

   @Override
   public AudioInputStream getAudioInputStream(URL var1) {
      logger.log(Level.TRACE, "TAudioFileReader.getAudioInputStream(URL): begin (class: " + this.getClass().getSimpleName() + ")");
      long var2 = getDataLength(var1);
      InputStream var4 = var1.openStream();

      AudioInputStream var5;
      try {
         var5 = this.getAudioInputStream(var4, var2);
      } catch (UnsupportedAudioFileException | IOException var7) {
         var4.close();
         throw var7;
      }

      logger.log(Level.TRACE, "TAudioFileReader.getAudioInputStream(URL): end");
      return var5;
   }

   @Override
   public AudioInputStream getAudioInputStream(InputStream var1) {
      logger.log(Level.TRACE, "TAudioFileReader.getAudioInputStream(InputStream): begin (class: " + this.getClass().getSimpleName() + ")");
      long var2 = -1L;
      if (!var1.markSupported()) {
         var1 = new BufferedInputStream(var1, this.getMarkLimit());
         logger.log(Level.TRACE, "wrapped: " + var1.getClass().getName() + ", " + this.getMarkLimit());
      }

      var1.mark(this.getMarkLimit());

      AudioInputStream var4;
      try {
         var4 = this.getAudioInputStream(var1, var2);
      } catch (UnsupportedAudioFileException var9) {
         try {
            var1.reset();
         } catch (IOException var7) {
            logger.log(Level.ERROR, var7.getMessage(), var7);
         }

         throw var9;
      } catch (IOException var10) {
         try {
            var1.reset();
         } catch (IOException var8) {
            if (var8.getCause() == null) {
               var8.initCause(var10);
               throw var8;
            }
         }

         throw var10;
      }

      logger.log(Level.TRACE, "TAudioFileReader.getAudioInputStream(InputStream): end");
      return var4;
   }

   protected AudioInputStream getAudioInputStream(InputStream var1, long var2) {
      logger.log(Level.TRACE, "TAudioFileReader.getAudioInputStream(InputStream, long): begin (class: " + this.getClass().getSimpleName() + ")");
      if (this.isRereading()) {
         if (!var1.markSupported()) {
            var1 = new BufferedInputStream(var1, this.getMarkLimit());
         }

         var1.mark(this.getMarkLimit());
      }

      AudioFileFormat var4 = this.getAudioFileFormat(var1, var2);
      if (this.isRereading()) {
         var1.reset();
      }

      AudioInputStream var5 = new AudioInputStream(var1, var4.getFormat(), var4.getFrameLength());
      logger.log(Level.TRACE, "TAudioFileReader.getAudioInputStream(InputStream, long): end");
      return var5;
   }

   protected static int calculateFrameSize(int var0, int var1) {
      return (var0 + 7) / 8 * var1;
   }

   private static long getDataLength(URL var0) {
      long var1 = -1L;
      URLConnection var3 = var0.openConnection();
      var3.connect();
      int var4 = var3.getContentLength();
      if (var4 > 0) {
         var1 = var4;
      }

      return var1;
   }

   public static int readLittleEndianInt(InputStream var0) {
      int var1 = var0.read();
      int var2 = var0.read();
      int var3 = var0.read();
      int var4 = var0.read();
      if ((var1 | var2 | var3 | var4) < 0) {
         throw new EOFException();
      } else {
         return (var4 << 24) + (var3 << 16) + (var2 << 8) + (var1 << 0);
      }
   }

   public static short readLittleEndianShort(InputStream var0) {
      int var1 = var0.read();
      int var2 = var0.read();
      if ((var1 | var2) < 0) {
         throw new EOFException();
      } else {
         return (short)((var2 << 8) + (var1 << 0));
      }
   }

   public static double readIeeeExtended(DataInputStream var0) {
      double var8 = Float.MAX_VALUE;
      int var3 = var0.readUnsignedShort();
      long var10 = var0.readUnsignedShort();
      long var12 = var0.readUnsignedShort();
      long var4 = var10 << 16 | var12;
      var10 = var0.readUnsignedShort();
      var12 = var0.readUnsignedShort();
      long var6 = var10 << 16 | var12;
      double var1;
      if (var3 == 0 && var4 == 0L && var6 == 0L) {
         var1 = 0.0;
      } else if (var3 == 32767) {
         var1 = var8;
      } else {
         var3 -= 16383;
         var3 -= 31;
         var1 = var4 * Math.pow(2.0, var3);
         var3 -= 32;
         var1 += var6 * Math.pow(2.0, var3);
      }

      return var1;
   }
}
