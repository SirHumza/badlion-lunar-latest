package org.tritonus.sampled.file;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioFileFormat.Type;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.file.TAudioFileFormat;
import org.tritonus.share.sampled.file.TAudioFileReader;

public class WaveAudioFileReader extends TAudioFileReader {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioFileReader");
   private static final int READ_LIMIT = 1000;

   public WaveAudioFileReader() {
      super(1000);
   }

   protected static void advanceChunk(DataInputStream var0, long var1, long var3) {
      long var5 = (var1 + 1L & 4294967294L) - var3;
      if (var1 > 0L) {
         long var7 = 0L;

         while (var7 < var5) {
            var7 += var0.skip(var5);
         }
      }
   }

   protected static long findChunk(DataInputStream var0, int var1) {
      long var3 = 0L;

      int var2;
      do {
         advanceChunk(var0, var3, 0L);

         try {
            var2 = var0.readInt();
         } catch (IOException var6) {
            logger.log(Level.TRACE, var6);
            throw new UnsupportedAudioFileException("unsupported WAVE file: required chunk not found.");
         }

         var3 = readLittleEndianInt(var0) & 4294967295L;
      } while (var2 != var1);

      return var3;
   }

   protected static AudioFormat readFormatChunk(DataInputStream var0, long var1) {
      String var3 = "";
      byte var4 = 14;
      if (var1 < 14L) {
         throw new UnsupportedAudioFileException("corrupt WAVE file: format chunk is too small");
      }

      short var5 = readLittleEndianShort(var0);
      short var6 = readLittleEndianShort(var0);
      if (var6 <= 0) {
         throw new UnsupportedAudioFileException("corrupt WAVE file: number of channels must be positive");
      }

      int var7 = readLittleEndianInt(var0);
      if (var7 <= 0) {
         throw new UnsupportedAudioFileException("corrupt WAVE file: sample rate must be positive");
      }

      int var8 = readLittleEndianInt(var0);
      short var9 = readLittleEndianShort(var0);
      int var12 = 0;
      float var13 = var7;
      Encoding var10;
      short var17;
      switch (var5) {
         case 1:
            if (var1 < 16L) {
               throw new UnsupportedAudioFileException("corrupt WAVE file: format chunk is too small");
            }

            var17 = readLittleEndianShort(var0);
            if (var17 <= 0) {
               throw new UnsupportedAudioFileException("corrupt WAVE file: sample size must be positive");
            }

            var10 = var17 <= 8 ? Encoding.PCM_UNSIGNED : Encoding.PCM_SIGNED;
            if (logger.isLoggable(Level.TRACE)) {
               var3 = var3 + ", wBitsPerSample=" + var17;
            }

            var4 += 2;
            break;
         case 6:
            var17 = 8;
            var10 = Encoding.ALAW;
            break;
         case 7:
            var17 = 8;
            var10 = Encoding.ULAW;
            break;
         case 17:
            if (var1 < 16L) {
               throw new UnsupportedAudioFileException("corrupt WAVE file: extra GSM bytes are missing");
            }

            var17 = readLittleEndianShort(var0);
            short var19 = readLittleEndianShort(var0);
            if (var19 < 2) {
               throw new UnsupportedAudioFileException("corrupt WAVE file: extra IMA ADPCM bytes are corrupt");
            }

            int var16 = readLittleEndianShort(var0) & '\uffff';
            if (logger.isLoggable(Level.TRACE)) {
               var3 = var3 + ", wBitsPerSample=" + var17 + ", cbSize=" + var19 + ", wSamplesPerBlock=" + var16;
            }

            var17 = -1;
            var10 = WaveTool.GSM0610;
            var12 = var9;
            var13 = (float)var7 / var16;
            var4 += 6;
            break;
         case 49:
            if (var1 < 20L) {
               throw new UnsupportedAudioFileException("corrupt WAVE file: extra GSM bytes are missing");
            }

            var17 = readLittleEndianShort(var0);
            short var14 = readLittleEndianShort(var0);
            if (var14 < 2) {
               throw new UnsupportedAudioFileException("corrupt WAVE file: extra GSM bytes are corrupt");
            }

            int var15 = readLittleEndianShort(var0) & '\uffff';
            if (logger.isLoggable(Level.TRACE)) {
               var3 = var3 + ", wBitsPerSample=" + var17 + ", cbSize=" + var14 + ", wSamplesPerBlock=" + var15;
            }

            var17 = -1;
            var10 = WaveTool.GSM0610;
            var12 = var9;
            var13 = (float)var7 / var15;
            var4 += 6;
            break;
         default:
            throw new UnsupportedAudioFileException("unsupported WAVE file: unknown format code " + var5);
      }

      if (var12 == 0) {
         var12 = calculateFrameSize(var17, var6);
      }

      logger.log(Level.TRACE, "WaveAudioFileReader.readFormatChunk():");
      logger.log(
         Level.TRACE,
         "  read values: wFormatTag="
            + var5
            + ", nChannels="
            + var6
            + ", nSamplesPerSec="
            + var7
            + ", nAvgBytesPerSec="
            + var8
            + ", nBlockAlign=="
            + var9
            + var3
      );
      logger.log(
         Level.TRACE,
         "  constructed values: encoding="
            + var10
            + ", sampleRate="
            + var7
            + ", sampleSizeInBits="
            + var17
            + ", channels="
            + var6
            + ", frameSize="
            + var12
            + ", frameRate="
            + var13
      );
      advanceChunk(var0, var1, var4);
      return new AudioFormat(var10, var7, var17, var6, var12, var13, false);
   }

   @Override
   protected AudioFileFormat getAudioFileFormat(InputStream var1, long var2) {
      DataInputStream var4 = new DataInputStream(var1);
      int var5 = var4.readInt();
      if (var5 != 1380533830) {
         throw new UnsupportedAudioFileException("not a WAVE file: wrong header magic");
      }

      long var6 = readLittleEndianInt(var4) & 4294967295L;
      var5 = var4.readInt();
      if (var5 != 1463899717) {
         throw new UnsupportedAudioFileException("not a WAVE file: wrong header magic");
      }

      long var8 = findChunk(var4, 1718449184);
      AudioFormat var10 = readFormatChunk(var4, var8);
      long var11 = findChunk(var4, 1684108385);
      long var13 = var11 / var10.getFrameSize();
      logger.log(Level.TRACE, "WaveAudioFileReader.getAudioFileFormat(): total length: " + var6 + ", frame length = " + var13);
      return new TAudioFileFormat(Type.WAVE, var10, (int)var13, (int)(var6 + 8L));
   }
}
