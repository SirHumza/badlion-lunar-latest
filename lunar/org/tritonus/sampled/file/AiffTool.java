package org.tritonus.sampled.file;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

public class AiffTool {
   public static final int AIFF_FORM_MAGIC = 1179603533;
   public static final int AIFF_AIFF_MAGIC = 1095321158;
   public static final int AIFF_AIFC_MAGIC = 1095321155;
   public static final int AIFF_COMM_MAGIC = 1129270605;
   public static final int AIFF_SSND_MAGIC = 1397968452;
   public static final int AIFF_FVER_MAGIC = 1180058962;
   public static final int AIFF_COMM_UNSPECIFIED = 0;
   public static final int AIFF_COMM_PCM = 1313820229;
   public static final int AIFF_COMM_TWOS = 1953984371;
   public static final int AIFF_COMM_SOWT = 1936684916;
   public static final int AIFF_COMM_ULAW = 1970037111;
   public static final int AIFF_COMM_IMA_ADPCM = 1768775988;
   public static final int AIFF_FVER_TIME_STAMP = -1568648896;

   public static int getFormatCode(AudioFormat var0) {
      Encoding var1 = var0.getEncoding();
      int var2 = var0.getSampleSizeInBits();
      boolean var3 = var0.getFrameSize() == -1 || var0.getChannels() != -1 || var0.getFrameSize() == var2 / 8 * var0.getChannels();
      boolean var4 = var1.equals(Encoding.PCM_SIGNED);
      boolean var5 = var1.equals(Encoding.PCM_UNSIGNED);
      if (var2 != 8 || !var3 || !var4 && !var5) {
         if (var2 > 8 && var2 <= 32 && var3 && var4) {
            return 1313820229;
         } else if (var1.equals(Encoding.ULAW) && var2 == 8 && var3) {
            return 1970037111;
         } else {
            return var1.equals(new Encoding("IMA_ADPCM")) && var2 == 4 ? 1768775988 : 0;
         }
      } else {
         return 1313820229;
      }
   }
}
