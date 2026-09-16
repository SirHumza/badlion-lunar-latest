package org.tritonus.share.sampled.file;

import java.io.File;
import java.io.OutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collection;
import java.util.Iterator;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.spi.AudioFileWriter;
import org.tritonus.share.ArraySet;
import org.tritonus.share.sampled.AudioFormats;
import org.tritonus.share.sampled.AudioUtils;
import org.tritonus.share.sampled.TConversionTool;

public abstract class TAudioFileWriter extends AudioFileWriter {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioFileWriter");
   protected static final int ALL = -1;
   protected static final Encoding PCM_SIGNED = Encoding.PCM_SIGNED;
   protected static final Encoding PCM_UNSIGNED = Encoding.PCM_UNSIGNED;
   private static final int BUFFER_LENGTH = 16384;
   protected static final Type[] NULL_TYPE_ARRAY = new Type[0];
   private Collection<Type> m_audioFileTypes;
   private Collection<AudioFormat> m_audioFormats;

   protected TAudioFileWriter(Collection<Type> var1, Collection<AudioFormat> var2) {
      logger.log(Level.TRACE, "TAudioFileWriter.<init>(): begin");
      this.m_audioFileTypes = var1;
      this.m_audioFormats = var2;
      logger.log(Level.TRACE, "TAudioFileWriter.<init>(): end");
   }

   @Override
   public Type[] getAudioFileTypes() {
      return this.m_audioFileTypes.toArray(NULL_TYPE_ARRAY);
   }

   @Override
   public boolean isFileTypeSupported(Type var1) {
      return this.m_audioFileTypes.contains(var1);
   }

   @Override
   public Type[] getAudioFileTypes(AudioInputStream var1) {
      AudioFormat var2 = var1.getFormat();
      ArraySet var3 = new ArraySet();

      for (Type var5 : this.m_audioFileTypes) {
         if (this.isAudioFormatSupportedImpl(var2, var5)) {
            var3.add(var5);
         }
      }

      return var3.toArray(NULL_TYPE_ARRAY);
   }

   @Override
   public boolean isFileTypeSupported(Type var1, AudioInputStream var2) {
      return this.isFileTypeSupported(var1)
         && (this.isAudioFormatSupportedImpl(var2.getFormat(), var1) || this.findConvertableFormat(var2.getFormat(), var1) != null);
   }

   @Override
   public int write(AudioInputStream var1, Type var2, File var3) {
      logger.log(Level.TRACE, ">TAudioFileWriter.write(.., File): called");
      logger.log(Level.TRACE, "class: " + this.getClass().getName());
      if (!this.isFileTypeSupported(var2)) {
         logger.log(Level.TRACE, "< file type is not supported");
         throw new IllegalArgumentException("file type is not supported.");
      }

      AudioFormat var4 = var1.getFormat();
      logger.log(Level.TRACE, "input format: " + var4);
      AudioFormat var5;
      boolean var6;
      if (this.isAudioFormatSupportedImpl(var4, var2)) {
         logger.log(Level.TRACE, "input format is supported directely");
         var5 = var4;
         var6 = false;
      } else {
         logger.log(Level.TRACE, "input format is not supported directely; trying to find a convertable format");
         var5 = this.findConvertableFormat(var4, var2);
         if (var5 == null) {
            logger.log(Level.TRACE, "< input format is not supported and not convertable.");
            throw new IllegalArgumentException("format not supported and not convertable");
         }

         var6 = true;
         if (var5.getSampleSizeInBits() == 8 && var5.getEncoding().equals(var4.getEncoding())) {
            var6 = false;
         }
      }

      long var7 = AudioUtils.getLengthInBytes(var1);
      TSeekableDataOutputStream var9 = new TSeekableDataOutputStream(var3);
      AudioOutputStream var10 = this.getAudioOutputStream(var5, var7, var2, var9);
      int var11 = this.writeImpl(var1, var10, var6);
      logger.log(Level.TRACE, "< wrote " + var11 + " bytes.");
      return var11;
   }

   @Override
   public int write(AudioInputStream var1, Type var2, OutputStream var3) {
      if (!this.isFileTypeSupported(var2)) {
         throw new IllegalArgumentException("file type is not supported.");
      }

      logger.log(Level.TRACE, ">TAudioFileWriter.write(.., OutputStream): called");
      logger.log(Level.TRACE, "class: " + this.getClass().getName());
      AudioFormat var4 = var1.getFormat();
      logger.log(Level.TRACE, "input format: " + var4);
      AudioFormat var5;
      boolean var6;
      if (this.isAudioFormatSupportedImpl(var4, var2)) {
         logger.log(Level.TRACE, "input format is supported directely");
         var5 = var4;
         var6 = false;
      } else {
         logger.log(Level.TRACE, "input format is not supported directely; trying to find a convertable format");
         var5 = this.findConvertableFormat(var4, var2);
         if (var5 == null) {
            logger.log(Level.TRACE, "< format is not supported");
            throw new IllegalArgumentException("format not supported and not convertable");
         }

         var6 = true;
         if (var5.getSampleSizeInBits() == 8 && var5.getEncoding().equals(var4.getEncoding())) {
            var6 = false;
         }
      }

      long var7 = AudioUtils.getLengthInBytes(var1);
      TNonSeekableDataOutputStream var9 = new TNonSeekableDataOutputStream(var3);
      AudioOutputStream var10 = this.getAudioOutputStream(var5, var7, var2, var9);
      int var11 = this.writeImpl(var1, var10, var6);
      logger.log(Level.TRACE, "< wrote " + var11 + " bytes.");
      return var11;
   }

   protected int writeImpl(AudioInputStream var1, AudioOutputStream var2, boolean var3) {
      logger.log(Level.TRACE, ">TAudioFileWriter.writeImpl(): called");
      logger.log(Level.TRACE, "class: " + this.getClass().getName());
      int var4 = 0;
      AudioFormat var5 = var2.getFormat();
      int var6 = var5.getFrameSize() / var5.getChannels();
      int var7 = 16384 / var5.getFrameSize() * var5.getFrameSize();
      byte[] var8 = new byte[var7];

      while (true) {
         logger.log(Level.TRACE, "trying to read (bytes): " + var8.length);
         int var9 = var1.read(var8);
         logger.log(Level.TRACE, "read (bytes): " + var9);
         if (var9 == -1) {
            logger.log(Level.TRACE, "<TAudioFileWriter.writeImpl(): after main loop. Wrote " + var4 + " bytes");
            var2.close();
            return var4;
         }

         if (var3) {
            TConversionTool.changeOrderOrSign(var8, 0, var9, var6);
         }

         int var10 = var2.write(var8, 0, var9);
         var4 += var10;
      }
   }

   protected Iterator<AudioFormat> getSupportedAudioFormats(Type var1) {
      return this.m_audioFormats.iterator();
   }

   protected boolean isAudioFormatSupportedImpl(AudioFormat var1, Type var2) {
      logger.log(Level.TRACE, "> TAudioFileWriter.isAudioFormatSupportedImpl(): format to test: " + var1);
      logger.log(Level.TRACE, "class: " + this.getClass().getName());
      Iterator var3 = this.getSupportedAudioFormats(var2);

      while (var3.hasNext()) {
         AudioFormat var4 = (AudioFormat)var3.next();
         logger.log(Level.TRACE, "matching against format : " + var4);
         if (AudioFormats.matches(var4, var1)) {
            logger.log(Level.TRACE, "<...succeeded.");
            return true;
         }
      }

      logger.log(Level.TRACE, "< ... failed");
      return false;
   }

   protected abstract AudioOutputStream getAudioOutputStream(AudioFormat var1, long var2, Type var4, TDataOutputStream var5);

   private AudioFormat findConvertableFormat(AudioFormat var1, Type var2) {
      logger.log(Level.TRACE, "TAudioFileWriter.findConvertableFormat(): input format: " + var1);
      if (!this.isFileTypeSupported(var2)) {
         logger.log(Level.TRACE, "< input file type is not supported.");
         return null;
      }

      Encoding var3 = var1.getEncoding();
      if ((var3.equals(PCM_SIGNED) || var3.equals(PCM_UNSIGNED)) && var1.getSampleSizeInBits() == 8) {
         AudioFormat var5 = this.convertFormat(var1, true, false);
         logger.log(Level.TRACE, "trying output format: " + var5);
         if (this.isAudioFormatSupportedImpl(var5, var2)) {
            logger.log(Level.TRACE, "< ... succeeded");
            return var5;
         } else {
            var5 = this.convertFormat(var1, false, true);
            logger.log(Level.TRACE, "trying output format: " + var5);
            if (this.isAudioFormatSupportedImpl(var5, var2)) {
               logger.log(Level.TRACE, "< ... succeeded");
               return var5;
            } else {
               var5 = this.convertFormat(var1, true, true);
               logger.log(Level.TRACE, "trying output format: " + var5);
               if (this.isAudioFormatSupportedImpl(var5, var2)) {
                  logger.log(Level.TRACE, "< ... succeeded");
                  return var5;
               } else {
                  logger.log(Level.TRACE, "< ... failed");
                  return null;
               }
            }
         }
      } else if (var3.equals(PCM_SIGNED) && (var1.getSampleSizeInBits() == 16 || var1.getSampleSizeInBits() == 24 || var1.getSampleSizeInBits() == 32)) {
         AudioFormat var4 = this.convertFormat(var1, false, true);
         logger.log(Level.TRACE, "trying output format: " + var4);
         if (this.isAudioFormatSupportedImpl(var4, var2)) {
            logger.log(Level.TRACE, "< ... succeeded");
            return var4;
         } else {
            logger.log(Level.TRACE, "< ... failed");
            return null;
         }
      } else {
         logger.log(Level.TRACE, "< ... failed");
         return null;
      }
   }

   private AudioFormat convertFormat(AudioFormat var1, boolean var2, boolean var3) {
      Encoding var4 = PCM_SIGNED;
      if (var1.getEncoding().equals(PCM_UNSIGNED) != var2) {
         var4 = PCM_UNSIGNED;
      }

      return new AudioFormat(
         var4, var1.getSampleRate(), var1.getSampleSizeInBits(), var1.getChannels(), var1.getFrameSize(), var1.getFrameRate(), var1.isBigEndian() ^ var3
      );
   }
}
