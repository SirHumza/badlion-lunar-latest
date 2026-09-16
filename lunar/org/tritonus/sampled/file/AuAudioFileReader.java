package org.tritonus.sampled.file;

import java.io.DataInputStream;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.HashMap;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.file.TAudioFileFormat;
import org.tritonus.share.sampled.file.TAudioFileReader;

public class AuAudioFileReader extends TAudioFileReader {
   private static final Logger logger = System.getLogger(AuAudioFileReader.class.getName());
   private static final int READ_LIMIT = 1000;

   public AuAudioFileReader() {
      super(1000);
   }

   private static String readDescription(DataInputStream var0, int var1) {
      byte var2 = -1;
      StringBuilder var3 = new StringBuilder();

      while (var1 > 0 && (var2 = var0.readByte()) != 0) {
         var3.append((char)var2);
         var1--;
      }

      if (var1 > 1 && var2 == 0) {
         var0.skip(var1 - 1);
      }

      return var3.toString();
   }

   @Override
   protected AudioFileFormat getAudioFileFormat(InputStream var1, long var2) {
      logger.log(Level.TRACE, "AuAudioFileReader.getAudioFileFormat(InputStream, long): begin");
      DataInputStream var4 = new DataInputStream(var1);
      int var5 = var4.readInt();
      if (var5 != 779316836) {
         throw new UnsupportedAudioFileException("not an AU file: wrong header magic");
      }

      int var6 = var4.readInt();
      logger.log(Level.TRACE, "AuAudioFileReader.getAudioFileFormat(): data offset: " + var6);
      if (var6 < 24) {
         throw new UnsupportedAudioFileException("not an AU file: data offset must be 24 or greater");
      }

      int var7 = var4.readInt();
      logger.log(Level.TRACE, "AuAudioFileReader.getAudioFileFormat(): data length: " + var7);
      if (var7 < 0 && var7 != -1) {
         throw new UnsupportedAudioFileException("not an AU file: data length must be positive, 0 or -1 for unknown");
      }

      Encoding var8 = null;
      byte var9 = 0;
      int var10 = var4.readInt();

      var9 = switch (var10) {
         case 1 -> {
            var8 = Encoding.ULAW;
            yield 8;
         }
         case 2 -> {
            var8 = Encoding.PCM_SIGNED;
            yield 8;
         }
         case 3 -> {
            var8 = Encoding.PCM_SIGNED;
            yield 16;
         }
         case 4 -> {
            var8 = Encoding.PCM_SIGNED;
            yield 24;
         }
         case 5 -> {
            var8 = Encoding.PCM_SIGNED;
            yield 32;
         }
         case 27 -> {
            var8 = Encoding.ALAW;
            yield 8;
         }
         default -> var9;
      };
      if (var9 == 0) {
         throw new UnsupportedAudioFileException("unsupported AU file: unknown encoding " + var10);
      }

      int var11 = var4.readInt();
      if (var11 <= 0) {
         throw new UnsupportedAudioFileException("corrupt AU file: sample rate must be positive");
      }

      int var12 = var4.readInt();
      if (var12 <= 0) {
         throw new UnsupportedAudioFileException("corrupt AU file: number of channels must be positive");
      }

      String var13 = readDescription(var4, var6 - 24);
      HashMap var14 = new HashMap();
      if (!var13.isEmpty()) {
         var14.put("title", var13);
      }

      AudioFormat var15 = new AudioFormat(var8, var11, var9, var12, calculateFrameSize(var9, var12), var11, var9 > 8);
      TAudioFileFormat var16 = new TAudioFileFormat(Type.AU, var15, var7 == -1 ? -1 : var7 / var15.getFrameSize(), var7 == -1 ? -1 : var7 + var6, var14);
      logger.log(Level.TRACE, "AuAudioFileReader.getAudioFileFormat(InputStream, long): begin");
      return var16;
   }
}
