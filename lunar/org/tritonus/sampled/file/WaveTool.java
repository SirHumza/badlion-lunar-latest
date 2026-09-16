package org.tritonus.sampled.file;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

public class WaveTool {
   public static final int WAVE_RIFF_MAGIC = 1380533830;
   public static final int WAVE_WAVE_MAGIC = 1463899717;
   public static final int WAVE_FMT_MAGIC = 1718449184;
   public static final int WAVE_DATA_MAGIC = 1684108385;
   public static final int WAVE_FACT_MAGIC = 1717658484;
   public static final short WAVE_FORMAT_UNSPECIFIED = 0;
   public static final short WAVE_FORMAT_PCM = 1;
   public static final short WAVE_FORMAT_MS_ADPCM = 2;
   public static final short WAVE_FORMAT_ALAW = 6;
   public static final short WAVE_FORMAT_ULAW = 7;
   public static final short WAVE_FORMAT_IMA_ADPCM = 17;
   public static final short WAVE_FORMAT_G723_ADPCM = 20;
   public static final short WAVE_FORMAT_GSM610 = 49;
   public static final short WAVE_FORMAT_G721_ADPCM = 64;
   public static final short WAVE_FORMAT_MPEG = 80;
   public static final int MIN_FMT_CHUNK_LENGTH = 14;
   public static final int MIN_DATA_OFFSET = 42;
   public static final int MIN_FACT_CHUNK_LENGTH = 4;
   public static final int FMT_CHUNK_SIZE = 18;
   public static final int RIFF_CONTAINER_CHUNK_SIZE = 12;
   public static final int CHUNK_HEADER_SIZE = 8;
   public static final int DATA_OFFSET = 46;
   public static Encoding GSM0610 = new Encoding("MS GSM0610");
   public static Encoding IMA_ADPCM = new Encoding("IMA_ADPCM");

   public static short getFormatCode(AudioFormat var0) {
      Encoding var1 = var0.getEncoding();
      int var2 = var0.getSampleSizeInBits();
      boolean var3 = var0.getFrameSize() == -1 || var0.getChannels() != -1 || var0.getFrameSize() == (var2 + 7) / 8 * var0.getChannels();
      boolean var4 = var1.equals(Encoding.PCM_SIGNED);
      boolean var5 = var1.equals(Encoding.PCM_UNSIGNED);
      if (var2 != 8 || !var3 || !var4 && !var5) {
         if (var2 > 8 && var2 <= 32 && var3 && var4) {
            return 1;
         } else if (var1.equals(Encoding.ULAW) && (var2 == -1 || var2 == 8) && var3) {
            return 7;
         } else if (var1.equals(Encoding.ALAW) && (var2 == -1 || var2 == 8) && var3) {
            return 6;
         } else if (var1.equals(new Encoding("IMA_ADPCM")) && var2 == 4) {
            return 17;
         } else {
            return (short)(var1.equals(GSM0610) ? 49 : 0);
         }
      } else {
         return 1;
      }
   }
}
