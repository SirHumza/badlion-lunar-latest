package net.sourceforge.lame.lowlevel;

import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;
import net.sourceforge.lame.mp3.Lame;
import net.sourceforge.lame.mp3.MPEGMode;
import net.sourceforge.lame.mp3.VbrMode;
import net.sourceforge.lame.mp3.Version;

public class LameEncoder {
   public static final Encoding MPEG1L3 = new Encoding("MPEG1L3");
   public static final Encoding MPEG2L3 = new Encoding("MPEG2L3");
   public static final Encoding MPEG2DOT5L3 = new Encoding("MPEG2DOT5L3");
   public static final String P_VBR = "vbr";
   public static final String P_CHMODE = "chmode";
   public static final String P_BITRATE = "bitrate";
   public static final String P_QUALITY = "quality";
   public static final int MPEG_VERSION_2 = 0;
   public static final int MPEG_VERSION_1 = 1;
   public static final int MPEG_VERSION_2DOT5 = 2;
   public static final int BITRATE_AUTO = -1;
   public static int DEFAULT_BITRATE = -1;
   private int bitRate = DEFAULT_BITRATE;
   private static final int DEFAULT_PCM_BUFFER_SIZE = 32768;
   public static int DEFAULT_QUALITY = 5;
   private int quality = DEFAULT_QUALITY;
   public static boolean DEFAULT_VBR = false;
   private boolean vbrMode = DEFAULT_VBR;
   private Lame lame = new Lame();
   private Version version = new Version();
   private int sampleSizeInBits;
   private ByteOrder byteOrder;
   private MPEGMode chMode;
   private int effQuality;
   private int effBitRate;
   private VbrMode effVbr;
   private MPEGMode effChMode;
   private int effSampleRate;
   private int effEncoding;

   public LameEncoder(AudioFormat var1) {
      this.readParams(var1, null);
      this.initParams(var1);
   }

   public LameEncoder(AudioFormat var1, AudioFormat var2) {
      this.readParams(var1, var2.properties());
      this.initParams(var1);
   }

   public LameEncoder(AudioFormat var1, int var2, MPEGMode var3, int var4, boolean var5) {
      this.bitRate = var2;
      this.chMode = var3;
      this.quality = var4;
      this.vbrMode = var5;
      this.initParams(var1);
   }

   private void readParams(AudioFormat var1, Map<String, Object> var2) {
      if (var2 != null) {
         this.readProps(var2);
      }
   }

   private void initParams(AudioFormat var1) {
      this.sampleSizeInBits = var1.getSampleSizeInBits();
      this.byteOrder = var1.isBigEndian() ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;
      if (var1.getSampleRate() < 32000.0F && this.bitRate > 160) {
         this.bitRate = 160;
      }

      int var2 = this.initParams(
         var1.getChannels(), Math.round(var1.getSampleRate()), this.bitRate, this.chMode, this.quality, this.vbrMode, var1.isBigEndian()
      );
      if (var2 < 0) {
         throw new IllegalArgumentException("parameters not supported by LAME (returned " + var2 + ")");
      }
   }

   private int initParams(int var1, int var2, int var3, MPEGMode var4, int var5, boolean var6, boolean var7) {
      this.lame.getFlags().setInNumChannels(var1);
      this.lame.getFlags().setInSampleRate(var2);
      this.lame.getFlags().setMode(var4);
      if (var6) {
         this.lame.getFlags().setVBR(VbrMode.vbr_default);
         this.lame.getFlags().setVBRQuality(var5);
      } else if (var3 != -1) {
         this.lame.getFlags().setBitRate(var3);
      }

      this.lame.getFlags().setQuality(var5);
      this.lame.getId3().init(this.lame.getFlags());
      this.lame.getFlags().setWriteId3tagAutomatic(false);
      this.lame.getFlags().setFindReplayGain(true);
      int var8 = this.lame.initParams();
      this.effSampleRate = this.lame.getFlags().getOutSampleRate();
      this.effBitRate = this.lame.getFlags().getBitRate();
      this.effChMode = this.lame.getFlags().getMode();
      this.effVbr = this.lame.getFlags().getVBR();
      this.effQuality = var6 ? this.lame.getFlags().getVBRQuality() : this.lame.getFlags().getQuality();
      return var8;
   }

   public final String getEncoderVersion() {
      return this.version.getLameVersion();
   }

   public final int getPCMBufferSize() {
      return 32768;
   }

   public final int getMP3BufferSize() {
      return this.getPCMBufferSize() / 2 + 1024;
   }

   private int doEncodeBuffer(byte[] var1, int var2, int var3, byte[] var4) {
      int var5 = this.sampleSizeInBits >> 3;
      int var6 = var3 / var5;
      int[] var7 = new int[var6];
      int var8 = var6;
      if (this.byteOrder == ByteOrder.LITTLE_ENDIAN) {
         if (var5 == 1) {
            int var9 = var6 * var5;

            while ((var9 -= var5) >= 0) {
               var7[--var8] = (var1[var2 + var9] & 255) << 24;
            }
         }

         if (var5 == 2) {
            int var14 = var6 * var5;

            while ((var14 -= var5) >= 0) {
               var7[--var8] = (var1[var2 + var14] & 255) << 16 | (var1[var2 + var14 + 1] & 255) << 24;
            }
         }

         if (var5 == 3) {
            int var15 = var6 * var5;

            while ((var15 -= var5) >= 0) {
               var7[--var8] = (var1[var2 + var15] & 255) << 8 | (var1[var2 + var15 + 1] & 255) << 16 | (var1[var2 + var15 + 2] & 255) << 24;
            }
         }

         if (var5 == 4) {
            int var16 = var6 * var5;

            while ((var16 -= var5) >= 0) {
               var7[--var8] = var1[var2 + var16] & 255
                  | (var1[var2 + var16 + 1] & 255) << 8
                  | (var1[var2 + var16 + 2] & 255) << 16
                  | (var1[var2 + var16 + 3] & 255) << 24;
            }
         }
      } else {
         if (var5 == 1) {
            int var17 = var6 * var5;

            while ((var17 -= var5) >= 0) {
               var7[--var8] = (var1[var2 + var17] & 255 ^ 128) << 24 | 8323072;
            }
         }

         if (var5 == 2) {
            int var18 = var6 * var5;

            while ((var18 -= var5) >= 0) {
               var7[--var8] = (var1[var2 + var18] & 255) << 24 | (var1[var2 + var18 + 1] & 255) << 16;
            }
         }

         if (var5 == 3) {
            int var19 = var6 * var5;

            while ((var19 -= var5) >= 0) {
               var7[--var8] = (var1[var2 + var19] & 255) << 24 | (var1[var2 + var19 + 1] & 255) << 16 | (var1[var2 + var19 + 2] & 255) << 8;
            }
         }

         if (var5 == 4) {
            int var20 = var6 * var5;

            while ((var20 -= var5) >= 0) {
               var7[--var8] = (var1[var2 + var20] & 255) << 24
                  | (var1[var2 + var20 + 1] & 255) << 16
                  | (var1[var2 + var20 + 2] & 255) << 8
                  | var1[var2 + var20 + 3] & 255;
            }
         }
      }

      var8 = var6;
      var6 /= this.lame.getFlags().getInNumChannels();
      float[][] var21 = new float[2][var6];
      if (this.lame.getFlags().getInNumChannels() == 2) {
         for (int var10 = var6; --var10 >= 0; var21[0][var10] = var7[--var8]) {
            var21[1][var10] = var7[--var8];
         }
      } else if (this.lame.getFlags().getInNumChannels() == 1) {
         Arrays.fill(var21[1], 0, var6, 0.0F);
         int var22 = var6;

         while (--var22 >= 0) {
            var21[0][var22] = var21[1][var22] = var7[--var8];
         }
      }

      return this.lame.encodeBuffer(var21[0], var21[1], var6, var4);
   }

   public final int encodeBuffer(byte[] var1, int var2, int var3, byte[] var4) {
      if (var3 >= 0 && var2 + var3 <= var1.length) {
         int var5 = this.doEncodeBuffer(var1, var2, var3, var4);
         if (var5 >= 0) {
            return var5;
         } else if (var5 == -1) {
            throw new ArrayIndexOutOfBoundsException("Encode buffer too small");
         } else {
            throw new RuntimeException("crucial error in encodeBuffer.");
         }
      } else {
         throw new IllegalArgumentException("inconsistent parameters");
      }
   }

   public final int encodeFinish(byte[] var1) {
      return this.lame.encodeFlush(var1);
   }

   public final void close() {
      this.lame.close();
   }

   private void readProps(Map<String, Object> var1) {
      this.quality = (Integer)var1.get("quality");
      this.bitRate = (Integer)var1.get("bitrate");
      this.chMode = (MPEGMode)var1.get("chmode");
      this.vbrMode = (Boolean)var1.get("vbr");
   }

   public final AudioFormat getEffectiveFormat() {
      HashMap var1 = new HashMap();
      var1.put("quality", this.getEffectiveQuality());
      var1.put("bitrate", this.getEffectiveBitRate());
      var1.put("chmode", this.getEffectiveChannelMode());
      var1.put("vbr", this.getEffectiveVBR());
      var1.put("encoder.name", "LAME");
      var1.put("encoder.version", this.getEncoderVersion());
      int var2 = this.chMode == MPEGMode.MONO ? 1 : 2;
      return new AudioFormat(this.getEffectiveEncoding(), this.getEffectiveSampleRate(), -1, var2, -1, -1.0F, false, var1);
   }

   public final int getEffectiveQuality() {
      if (this.effQuality >= 9) {
         return 9;
      } else if (this.effQuality >= 7) {
         return 7;
      } else if (this.effQuality >= 5) {
         return 5;
      } else {
         return this.effQuality >= 2 ? 2 : 1;
      }
   }

   public final int getEffectiveBitRate() {
      return this.effBitRate;
   }

   public final MPEGMode getEffectiveChannelMode() {
      return this.effChMode;
   }

   public final boolean getEffectiveVBR() {
      return this.effVbr != VbrMode.vbr_off;
   }

   public final int getEffectiveSampleRate() {
      return this.effSampleRate;
   }

   public final Encoding getEffectiveEncoding() {
      if (this.effEncoding == 0) {
         return this.getEffectiveSampleRate() < 16000 ? MPEG2DOT5L3 : MPEG2L3;
      } else {
         return this.effEncoding == 2 ? MPEG2DOT5L3 : MPEG1L3;
      }
   }
}
