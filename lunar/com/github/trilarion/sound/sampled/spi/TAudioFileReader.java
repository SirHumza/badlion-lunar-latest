package com.github.trilarion.sound.sampled.spi;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.spi.AudioFileReader;

public abstract class TAudioFileReader extends AudioFileReader {
   private static final Logger LOG = Logger.getLogger(TAudioFileReader.class.getName());
   private int m_nMarkLimit = -1;
   private final boolean m_bRereading;

   protected TAudioFileReader(int var1, boolean var2) {
      this.m_nMarkLimit = var1;
      this.m_bRereading = var2;
   }

   private int getMarkLimit() {
      return this.m_nMarkLimit;
   }

   private boolean isRereading() {
      return this.m_bRereading;
   }

   @Override
   public AudioFileFormat getAudioFileFormat(File var1) {
      LOG.log(Level.FINE, "TAudioFileReader.getAudioFileFormat(File): begin (class: {0})", this.getClass().getSimpleName());
      long var2 = var1.length();
      FileInputStream var5 = new FileInputStream(var1);

      AudioFileFormat var4;
      try {
         var4 = this.getAudioFileFormat(var5, var2);
      } catch (Throwable var9) {
         try {
            var5.close();
         } catch (Throwable var8) {
            var9.addSuppressed(var8);
         }

         throw var9;
      }

      var5.close();
      LOG.log(Level.FINE, "TAudioFileReader.getAudioFileFormat(File): end");
      return var4;
   }

   @Override
   public AudioFileFormat getAudioFileFormat(URL var1) {
      LOG.log(Level.FINE, "TAudioFileReader.getAudioFileFormat(URL): begin (class: {0})", this.getClass().getSimpleName());
      long var2 = getDataLength(var1);
      InputStream var5 = var1.openStream();

      AudioFileFormat var4;
      try {
         var4 = this.getAudioFileFormat(var5, var2);
      } catch (Throwable var9) {
         if (var5 != null) {
            try {
               var5.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var5 != null) {
         var5.close();
      }

      LOG.log(Level.FINE, "TAudioFileReader.getAudioFileFormat(URL): end");
      return var4;
   }

   @Override
   public AudioFileFormat getAudioFileFormat(InputStream var1) {
      LOG.log(Level.FINE, "TAudioFileReader.getAudioFileFormat(InputStream): begin (class: {0})", this.getClass().getSimpleName());
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

      LOG.log(Level.FINE, "TAudioFileReader.getAudioFileFormat(InputStream): end");
      return var4;
   }

   protected abstract AudioFileFormat getAudioFileFormat(InputStream var1, long var2);

   @Override
   public AudioInputStream getAudioInputStream(File var1) {
      LOG.log(Level.FINE, "TAudioFileReader.getAudioInputStream(File): begin (class: {0})", this.getClass().getSimpleName());
      long var2 = var1.length();
      FileInputStream var4 = new FileInputStream(var1);

      AudioInputStream var5;
      try {
         var5 = this.getAudioInputStream(var4, var2);
      } catch (UnsupportedAudioFileException | IOException var7) {
         var4.close();
         throw var7;
      }

      LOG.log(Level.FINE, "TAudioFileReader.getAudioInputStream(File): end");
      return var5;
   }

   @Override
   public AudioInputStream getAudioInputStream(URL var1) {
      LOG.log(Level.FINE, "TAudioFileReader.getAudioInputStream(URL): begin (class: {0})", this.getClass().getSimpleName());
      long var2 = getDataLength(var1);
      InputStream var4 = var1.openStream();
      AudioInputStream var5 = null;

      try {
         var5 = this.getAudioInputStream(var4, var2);
      } catch (UnsupportedAudioFileException | IOException var7) {
         var4.close();
         throw var7;
      }

      LOG.log(Level.FINE, "TAudioFileReader.getAudioInputStream(URL): end");
      return var5;
   }

   @Override
   public AudioInputStream getAudioInputStream(InputStream var1) {
      LOG.log(Level.FINE, "TAudioFileReader.getAudioInputStream(InputStream): begin (class: {0})", this.getClass().getSimpleName());
      long var2 = -1L;
      AudioInputStream var4 = null;
      if (!var1.markSupported()) {
         var1 = new BufferedInputStream(var1, this.getMarkLimit());
      }

      var1.mark(this.getMarkLimit());

      try {
         var4 = this.getAudioInputStream(var1, var2);
      } catch (UnsupportedAudioFileException var8) {
         var1.reset();
         throw var8;
      } catch (IOException var9) {
         try {
            var1.reset();
         } catch (IOException var7) {
            if (var7.getCause() == null) {
               var7.initCause(var9);
               throw var7;
            }
         }

         throw var9;
      }

      LOG.log(Level.FINE, "TAudioFileReader.getAudioInputStream(InputStream): end");
      return var4;
   }

   protected AudioInputStream getAudioInputStream(InputStream var1, long var2) {
      LOG.log(Level.FINE, "TAudioFileReader.getAudioInputStream(InputStream, long): begin (class: {0})", this.getClass().getSimpleName());
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
      LOG.log(Level.FINE, "TAudioFileReader.getAudioInputStream(InputStream, long): end");
      return var5;
   }

   private static long getDataLength(URL var0) {
      URLConnection var1 = var0.openConnection();
      var1.connect();
      int var2 = var1.getContentLength();
      return var2 > 0 ? var2 : -1L;
   }
}
