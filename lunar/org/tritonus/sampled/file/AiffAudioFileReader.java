package org.tritonus.sampled.file;

import java.io.DataInputStream;
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

public class AiffAudioFileReader extends TAudioFileReader {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioFileReader");
   private static final int READ_LIMIT = 1000;

   public AiffAudioFileReader() {
      super(1000);
   }

   private void skipChunk(DataInputStream var1, int var2, int var3) {
      var2 -= var3;
      if (var2 > 0) {
         var1.skip(var2 + var2 % 2);
      }
   }

   private AudioFormat readCommChunk(DataInputStream var1, int var2) {
      short var3 = var1.readShort();
      if (var3 <= 0) {
         throw new UnsupportedAudioFileException("not an AIFF file: number of channels must be positive");
      }

      logger.log(Level.TRACE, "Found " + var3 + " channels.");
      var1.readInt();
      short var4 = var1.readShort();
      float var5 = (float)readIeeeExtended(var1);
      if (var5 <= 0.0) {
         throw new UnsupportedAudioFileException("not an AIFF file: sample rate must be positive");
      }

      logger.log(Level.TRACE, "Found framerate " + var5);
      Encoding var6 = Encoding.PCM_SIGNED;
      byte var7 = 18;
      boolean var8 = false;
      if (var2 > var7) {
         int var9 = var1.readInt();
         var7 += 4;
         if (var9 == 1313820229 || var9 == 1953984371 || var9 == 1936684916) {
            var8 = var9 == 1936684916;
         } else if (var9 == 1970037111) {
            var6 = Encoding.ULAW;
            var4 = 8;
         } else {
            if (var9 != 1768775988) {
               throw new UnsupportedAudioFileException("Encoding 0x" + Integer.toHexString(var9) + " of AIFF file not supported");
            }

            var6 = new Encoding("IMA_ADPCM");
            var4 = 4;
         }
      }

      int var11 = var4 == 4 ? -1 : calculateFrameSize(var4, var3);
      logger.log(Level.TRACE, "calculated frame size: " + var11);
      this.skipChunk(var1, var2, var7);
      return new AudioFormat(var6, var5, var4, var3, var11, var5, var4 > 8 && !var8);
   }

   private void readVerChunk(DataInputStream var1, int var2) {
      if (var2 < 4) {
         throw new UnsupportedAudioFileException("Corrput AIFF file: FVER chunk too small.");
      }

      int var3 = var1.readInt();
      if (var3 != -1568648896) {
         throw new UnsupportedAudioFileException("Unsupported AIFF file: version not known.");
      }

      this.skipChunk(var1, var2, 4);
   }

   @Override
   protected AudioFileFormat getAudioFileFormat(InputStream var1, long var2) {
      logger.log(Level.TRACE, "AiffAudioFileReader.getAudioFileFormat(InputStream, long): begin");
      DataInputStream var4 = new DataInputStream(var1);
      int var5 = var4.readInt();
      if (var5 != 1179603533) {
         throw new UnsupportedAudioFileException("not an AIFF file: header magic is not FORM");
      }

      int var6 = var4.readInt();
      var5 = var4.readInt();
      boolean var7;
      if (var5 == 1095321158) {
         var7 = false;
      } else {
         if (var5 != 1095321155) {
            throw new UnsupportedAudioFileException("unsupported IFF file: header magic neither AIFF nor AIFC");
         }

         var7 = true;
      }

      boolean var8 = !var7;
      boolean var9 = false;
      boolean var10 = false;
      AudioFormat var11 = null;
      int var12 = 0;

      while (!var8 || !var9 || !var10) {
         var5 = var4.readInt();
         int var13 = var4.readInt();
         switch (var5) {
            case 1129270605:
               var11 = this.readCommChunk(var4, var13);
               logger.log(Level.TRACE, "Read COMM chunk with length " + var13);
               var9 = true;
               break;
            case 1180058962:
               if (!var8) {
                  this.readVerChunk(var4, var13);
                  logger.log(Level.TRACE, "Read FVER chunk with length " + var13);
                  var8 = true;
               } else {
                  this.skipChunk(var4, var13, 0);
               }
               break;
            case 1397968452:
               if (!var9 || !var8) {
                  throw new UnsupportedAudioFileException("cannot handle AIFF file: SSND not last chunk");
               }

               var10 = true;
               var12 = var13 - 8;
               var4.skip(8L);
               logger.log(Level.TRACE, "Found SSND chunk with length " + var13);
               break;
            default:
               logger.log(Level.TRACE, "Skipping unknown chunk: " + Integer.toHexString(var5));
               this.skipChunk(var4, var13, 0);
         }
      }

      TAudioFileFormat var16 = new TAudioFileFormat(var7 ? Type.AIFC : Type.AIFF, var11, var12 / var11.getFrameSize(), var6 + 8);
      logger.log(Level.TRACE, "AiffAudioFileReader.getAudioFileFormat(InputStream, long): end");
      return var16;
   }
}
