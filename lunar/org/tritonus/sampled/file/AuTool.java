package org.tritonus.sampled.file;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

public class AuTool {
   public static final int AU_HEADER_MAGIC = 779316836;
   public static final int AUDIO_UNKNOWN_SIZE = -1;
   public static final int DATA_OFFSET = 24;
   public static final int SND_FORMAT_UNSPECIFIED = 0;
   public static final int SND_FORMAT_MULAW_8 = 1;
   public static final int SND_FORMAT_LINEAR_8 = 2;
   public static final int SND_FORMAT_LINEAR_16 = 3;
   public static final int SND_FORMAT_LINEAR_24 = 4;
   public static final int SND_FORMAT_LINEAR_32 = 5;
   public static final int SND_FORMAT_FLOAT = 6;
   public static final int SND_FORMAT_DOUBLE = 7;
   public static final int SND_FORMAT_ADPCM_G721 = 23;
   public static final int SND_FORMAT_ADPCM_G722 = 24;
   public static final int SND_FORMAT_ADPCM_G723_3 = 25;
   public static final int SND_FORMAT_ADPCM_G723_5 = 26;
   public static final int SND_FORMAT_ALAW_8 = 27;

   public static int getFormatCode(AudioFormat var0) {
      Encoding var1 = var0.getEncoding();
      int var2 = var0.getSampleSizeInBits();
      boolean var3 = var0.getFrameSize() == -1 || var0.getChannels() != -1 || var0.getFrameSize() == var2 / 8 * var0.getChannels();
      boolean var4 = var1.equals(Encoding.PCM_SIGNED);
      boolean var5 = var1.equals(Encoding.PCM_UNSIGNED);
      if (var1.equals(Encoding.ULAW) && var2 == 8 && var3) {
         return 1;
      }

      if (var2 != 8 || !var3 || !var4 && !var5) {
         if (var4 && var3) {
            if (var2 == 16) {
               return 3;
            }

            if (var2 == 24) {
               return 4;
            }

            if (var2 == 32) {
               return 5;
            }
         } else if (var1.equals(Encoding.ALAW) && var2 == 8 && var3) {
            return 27;
         }

         return 0;
      } else {
         return 2;
      }
   }
}
