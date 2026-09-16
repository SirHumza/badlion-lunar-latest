package net.sourceforge.lame.mp3;

import java.io.DataOutput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import net.sourceforge.lame.mpg.MPGLib;

public class GetAudio {
   private static final String type_name = "MP3 file";
   private static final int IFF_ID_FORM = 1179603533;
   private static final int IFF_ID_AIFF = 1095321158;
   private static final int IFF_ID_AIFC = 1095321155;
   private static final int IFF_ID_COMM = 1129270605;
   private static final int IFF_ID_SSND = 1397968452;
   private static final int IFF_ID_NONE = 1313820229;
   private static final int IFF_ID_2CBE = 1953984371;
   private static final int IFF_ID_2CLE = 1936684916;
   private static final int WAV_ID_RIFF = 1380533830;
   private static final int WAV_ID_WAVE = 1463899717;
   private static final int WAV_ID_FMT = 1718449184;
   private static final int WAV_ID_DATA = 1684108385;
   private static final short WAVE_FORMAT_PCM = 1;
   private static final short WAVE_FORMAT_EXTENSIBLE = -2;
   private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
   private static final char[] abl2 = new char[]{
      '\u0000', '\u0007', '\u0007', '\u0007', '\u0000', '\u0007', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\b', '\b', '\b', '\b', '\b'
   };
   Parse parse;
   MPGLib mpg;
   private boolean count_samples_carefully;
   private int pcmbitwidth;
   private boolean pcmswapbytes;
   private boolean pcm_is_unsigned_8bit;
   private int num_samples_read;
   private RandomAccessFile musicin;
   private MPGLib.mpstr_tag hip;

   public void setModules(Parse var1, MPGLib var2) {
      this.parse = var1;
      this.mpg = var2;
   }

   public final void initInFile(LameGlobalFlags var1, String var2, FrameSkip var3) {
      this.count_samples_carefully = false;
      this.num_samples_read = 0;
      this.pcmbitwidth = this.parse.in_bitwidth;
      this.pcmswapbytes = this.parse.swapbytes;
      this.pcm_is_unsigned_8bit = !this.parse.in_signed;
      this.musicin = this.OpenSndFile(var1, var2, var3);
   }

   public final void close_infile() {
      if (this.musicin != null) {
         try {
            this.musicin.close();
         } catch (IOException var2) {
            throw new RuntimeException("Could not close sound file", var2);
         }
      }
   }

   public final int get_audio(LameGlobalFlags var1, float[][] var2) {
      return this.get_audio_common(var1, var2, (float[][])null);
   }

   public final int get_audio16(LameGlobalFlags var1, float[][] var2) {
      return this.get_audio_common(var1, (float[][])null, var2);
   }

   private int get_audio_common(LameGlobalFlags var1, float[][] var2, float[][] var3) {
      int var4 = var1.getInNumChannels();
      int[] var5 = new int[2304];
      float[][] var6 = new float[2][1152];
      int var8;
      int var9 = var8 = var1.getFrameSize();
      assert var8 <= 1152;
      int var11 = var1.num_samples;
      if (this.count_samples_carefully) {
         int var10 = var11 - Math.min(var11, this.num_samples_read);
         if (var10 < var8 && 0 != var11) {
            var9 = var10;
         }
      }

      int var7;
      if (this.is_mpeg_file_format(this.parse.getInputFormat())) {
         if (var2 != null) {
            var7 = this.read_samples_mp3(var1, this.musicin, var6);
         } else {
            var7 = this.read_samples_mp3(var1, this.musicin, var3);
         }

         if (var7 < 0) {
            return var7;
         }
      } else {
         var7 = this.read_samples_pcm(this.musicin, var5, var4 * var9);
         if (var7 < 0) {
            return var7;
         }

         int var12 = var7;
         var7 /= var4;
         if (var2 != null) {
            if (var4 == 2) {
               for (int var13 = var7; --var13 >= 0; var2[0][var13] = var5[--var12]) {
                  var2[1][var13] = var5[--var12];
               }
            } else if (var4 == 1) {
               Arrays.fill(var2[1], 0, var7, 0.0F);
               int var19 = var7;

               while (--var19 >= 0) {
                  var2[0][var19] = var5[--var12];
               }
            } else {
               assert false;
            }
         } else if (var4 == 2) {
            int var20 = var7;

            while (--var20 >= 0) {
               var3[1][var20] = var5[--var12] >> 16 & 65535;
               var3[0][var20] = var5[--var12] >> 16 & 65535;
            }
         } else if (var4 == 1) {
            Arrays.fill(var3[1], 0, var7, 0.0F);
            int var21 = var7;

            while (--var21 >= 0) {
               var3[0][var21] = var5[--var12] >> 16 & 65535;
            }
         } else {
            assert false;
         }
      }

      if (this.is_mpeg_file_format(this.parse.getInputFormat()) && var2 != null) {
         int var17 = var7;

         while (--var17 >= 0) {
            int var22 = (int)var6[0][var17];
            var2[0][var17] = var22 << 16;
         }

         if (var4 == 2) {
            var17 = var7;

            while (--var17 >= 0) {
               int var23 = (int)var6[1][var17];
               var2[1][var17] = var23 << 16;
            }
         } else if (var4 == 1) {
            Arrays.fill(var2[1], 0, var7, 0.0F);
         } else {
            assert false;
         }
      }

      if (var11 != Integer.MAX_VALUE) {
         this.num_samples_read += var7;
      }

      return var7;
   }

   int read_samples_mp3(LameGlobalFlags var1, RandomAccessFile var2, float[][] var3) {
      int var4 = this.lame_decode_fromfile(var2, var3[0], var3[1], this.parse.getMp3InputData());
      if (var4 < 0) {
         Arrays.fill(var3[0], 0.0F);
         Arrays.fill(var3[1], 0.0F);
         return 0;
      }

      if (var1.getInNumChannels() != this.parse.getMp3InputData().stereo) {
         if (this.parse.silent < 10) {
            System.err.printf("Error: number of channels has changed in %s - not supported\n", "MP3 file");
         }

         var4 = -1;
      }

      if (var1.getInSampleRate() != this.parse.getMp3InputData().samplerate) {
         if (this.parse.silent < 10) {
            System.err.printf("Error: sample frequency has changed in %s - not supported\n", "MP3 file");
         }

         var4 = -1;
      }

      return var4;
   }

   public final int WriteWaveHeader(DataOutput var1, int var2, int var3, int var4, int var5) {
      try {
         int var6 = (var5 + 7) / 8;
         var1.writeBytes("RIFF");
         this.write32BitsLowHigh(var1, var2 + 44 - 8);
         var1.writeBytes("WAVEfmt ");
         this.write32BitsLowHigh(var1, 16);
         this.write16BitsLowHigh(var1, 1);
         this.write16BitsLowHigh(var1, var4);
         this.write32BitsLowHigh(var1, var3);
         this.write32BitsLowHigh(var1, var3 * var4 * var6);
         this.write16BitsLowHigh(var1, var4 * var6);
         this.write16BitsLowHigh(var1, var5);
         var1.writeBytes("data");
         this.write32BitsLowHigh(var1, var2);
         return 0;
      } catch (IOException var7) {
         return -1;
      }
   }

   private int unpack_read_samples(int var1, int var2, boolean var3, int[] var4, RandomAccessFile var5) {
      byte[] var6 = new byte[var2 * var1];
      var5.readFully(var6);
      int var7 = var1;
      int var8 = var7;
      if (!var3) {
         if (var2 == 1) {
            int var9 = var7 * var2;

            while ((var9 -= var2) >= 0) {
               var4[--var8] = (var6[var9] & 255) << 24;
            }
         }

         if (var2 == 2) {
            int var10 = var7 * var2;

            while ((var10 -= var2) >= 0) {
               var4[--var8] = (var6[var10] & 255) << 16 | (var6[var10 + 1] & 255) << 24;
            }
         }

         if (var2 == 3) {
            int var11 = var7 * var2;

            while ((var11 -= var2) >= 0) {
               var4[--var8] = (var6[var11] & 255) << 8 | (var6[var11 + 1] & 255) << 16 | (var6[var11 + 2] & 255) << 24;
            }
         }

         if (var2 == 4) {
            int var12 = var7 * var2;

            while ((var12 -= var2) >= 0) {
               var4[--var8] = var6[var12] & 255 | (var6[var12 + 1] & 255) << 8 | (var6[var12 + 2] & 255) << 16 | (var6[var12 + 3] & 255) << 24;
            }
         }
      } else {
         if (var2 == 1) {
            int var13 = var7 * var2;

            while ((var13 -= var2) >= 0) {
               var4[--var8] = ((var6[var13] ^ 128) & 0xFF) << 24 | 8323072;
            }
         }

         if (var2 == 2) {
            int var14 = var7 * var2;

            while ((var14 -= var2) >= 0) {
               var4[--var8] = (var6[var14] & 255) << 24 | (var6[var14 + 1] & 255) << 16;
            }
         }

         if (var2 == 3) {
            int var15 = var7 * var2;

            while ((var15 -= var2) >= 0) {
               var4[--var8] = (var6[var15] & 255) << 24 | (var6[var15 + 1] & 255) << 16 | (var6[var15 + 2] & 255) << 8;
            }
         }

         if (var2 == 4) {
            int var16 = var7 * var2;

            while ((var16 -= var2) >= 0) {
               var4[--var8] = (var6[var16] & 255) << 24 | (var6[var16 + 1] & 255) << 16 | (var6[var16 + 2] & 255) << 8 | var6[var16 + 3] & 255;
            }
         }
      }

      return var7;
   }

   private int read_samples_pcm(RandomAccessFile var1, int[] var2, int var3) {
      int var4 = 0;

      try {
         switch (this.pcmbitwidth) {
            case 8:
               var4 = this.unpack_read_samples(var3, 1, this.pcm_is_unsigned_8bit, var2, var1);
               break;
            case 16:
            case 24:
            case 32:
               if (!this.parse.in_signed) {
                  throw new RuntimeException("Unsigned input only supported with bitwidth 8");
               }

               boolean var5 = this.parse.in_endian != ByteOrder.LITTLE_ENDIAN;
               if (this.pcmswapbytes) {
                  var5 = !var5;
               }

               var4 = this.unpack_read_samples(var3, this.pcmbitwidth / 8, var5, var2, var1);
               break;
            default:
               throw new RuntimeException("Only 8, 16, 24 and 32 bit input files supported");
         }

         return var4;
      } catch (IOException var7) {
         throw new RuntimeException("Error reading input file", var7);
      }
   }

   private int parse_wave_header(LameGlobalFlags var1, RandomAccessFile var2) {
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      boolean var7 = false;
      int var8 = 0;
      int var9 = 0;
      boolean var10 = false;
      this.Read32BitsHighLow(var2);
      if (this.Read32BitsHighLow(var2) != 1463899717) {
         return -1;
      }

      for (int var24 = 0; var24 < 20; var24++) {
         int var11 = this.Read32BitsHighLow(var2);
         if (var11 == 1718449184) {
            var9 = this.Read32BitsLowHigh(var2);
            if (var9 < 16) {
               return -1;
            }

            var3 = this.Read16BitsLowHigh(var2);
            var9 -= 2;
            var4 = this.Read16BitsLowHigh(var2);
            var9 -= 2;
            var6 = this.Read32BitsLowHigh(var2);
            var9 -= 4;
            this.Read32BitsLowHigh(var2);
            var9 -= 4;
            this.Read16BitsLowHigh(var2);
            var9 -= 2;
            var5 = this.Read16BitsLowHigh(var2);
            var9 -= 2;
            if (var9 > 9 && var3 == -2) {
               this.Read16BitsLowHigh(var2);
               this.Read16BitsLowHigh(var2);
               this.Read32BitsLowHigh(var2);
               var3 = this.Read16BitsLowHigh(var2);
               var9 -= 10;
            }

            if (var9 > 0) {
               try {
                  var2.skipBytes(var9);
               } catch (IOException var14) {
                  return -1;
               }
            }
         } else {
            if (var11 == 1684108385) {
               var9 = this.Read32BitsLowHigh(var2);
               var8 = var9;
               var7 = true;
               break;
            }

            var9 = this.Read32BitsLowHigh(var2);

            try {
               var2.skipBytes(var9);
            } catch (IOException var13) {
               return -1;
            }
         }
      }

      if (var7) {
         if (var3 != 1) {
            if (this.parse.silent < 10) {
               System.err.printf("Unsupported data format: 0x%04X\n", var3);
            }

            return 0;
         } else {
            var1.setInNumChannels(var4);
            if (-1 == var1.getInNumChannels()) {
               if (this.parse.silent < 10) {
                  System.err.printf("Unsupported number of channels: %d\n", var4);
               }

               return 0;
            } else {
               var1.setInSampleRate(var6);
               this.pcmbitwidth = var5;
               this.pcm_is_unsigned_8bit = true;
               var1.num_samples = var8 / (var4 * ((var5 + 7) / 8));
               return 1;
            }
         }
      } else {
         return -1;
      }
   }

   private int aiff_check2(GetAudio.IFF_AIFF var1) {
      if (var1.sampleType != 1397968452) {
         if (this.parse.silent < 10) {
            System.err.printf("ERROR: input sound data is not PCM\n");
         }

         return 1;
      } else {
         switch (var1.sampleSize) {
            case 8:
            case 16:
            case 24:
            case 32:
               if (var1.numChannels != 1 && var1.numChannels != 2) {
                  if (this.parse.silent < 10) {
                     System.err.printf("ERROR: input sound data is not mono or stereo\n");
                  }

                  return 1;
               } else {
                  if (var1.blkAlgn.blockSize != 0) {
                     if (this.parse.silent < 10) {
                        System.err.printf("ERROR: block size of input sound data is not 0 bytes\n");
                     }

                     return 1;
                  }

                  return 0;
               }
            default:
               if (this.parse.silent < 10) {
                  System.err.printf("ERROR: input sound data is not 8, 16, 24 or 32 bits\n");
               }

               return 1;
         }
      }
   }

   private long make_even_number_of_bytes_in_length(int var1) {
      return (var1 & 1) != 0 ? var1 + 1 : var1;
   }

   private int parse_aiff_header(LameGlobalFlags var1, RandomAccessFile var2) {
      int var3 = 0;
      int var4 = 1313820229;
      GetAudio.IFF_AIFF var5 = new GetAudio.IFF_AIFF();
      int var6 = 0;
      byte var7 = 0;
      long var8 = -1L;
      int var10 = this.Read32BitsHighLow(var2);
      int var11 = this.Read32BitsHighLow(var2);
      if (var11 != 1095321158 && var11 != 1095321155) {
         return -1;
      }

      while (var10 > 0) {
         int var14 = this.Read32BitsHighLow(var2);
         var10 -= 4;
         if (var14 == 1129270605) {
            var6 = var7 + 1;
            var3 = this.Read32BitsHighLow(var2);
            long var30 = this.make_even_number_of_bytes_in_length(var3);
            var10 = (int)(var10 - var30);
            var5.numChannels = (short)this.Read16BitsHighLow(var2);
            var30 -= 2L;
            var5.numSampleFrames = this.Read32BitsHighLow(var2);
            var30 -= 4L;
            var5.sampleSize = (short)this.Read16BitsHighLow(var2);
            var30 -= 2L;

            try {
               var5.sampleRate = this.readIeeeExtendedHighLow(var2);
            } catch (IOException var21) {
               return -1;
            }

            var30 -= 10L;
            if (var11 == 1095321155) {
               var4 = this.Read32BitsHighLow(var2);
               var30 -= 4L;
            }

            try {
               var2.skipBytes((int)var30);
            } catch (IOException var20) {
               return -1;
            }
         } else if (var14 == 1397968452) {
            var7 = 1;
            var3 = this.Read32BitsHighLow(var2);
            long var27 = this.make_even_number_of_bytes_in_length(var3);
            var10 = (int)(var10 - var27);
            var5.blkAlgn.offset = this.Read32BitsHighLow(var2);
            var27 -= 4L;
            var5.blkAlgn.blockSize = this.Read32BitsHighLow(var2);
            var27 -= 4L;
            var5.sampleType = 1397968452;
            if (var6 > 0) {
               try {
                  var2.skipBytes(var5.blkAlgn.offset);
                  break;
               } catch (IOException var16) {
                  return -1;
               }
            }

            try {
               var8 = var2.getFilePointer();
            } catch (IOException var19) {
               return -1;
            }

            if (var8 >= 0L) {
               var8 += var5.blkAlgn.offset;
            }

            try {
               var2.skipBytes((int)var27);
            } catch (IOException var18) {
               return -1;
            }
         } else {
            var3 = this.Read32BitsHighLow(var2);
            long var12 = this.make_even_number_of_bytes_in_length(var3);
            var10 = (int)(var10 - var12);

            try {
               var2.skipBytes((int)var12);
            } catch (IOException var17) {
               return -1;
            }
         }
      }

      if (var4 == 1936684916) {
         this.pcmswapbytes = this.parse.swapbytes;
      } else if (var4 == 1953984371) {
         this.pcmswapbytes = !this.parse.swapbytes;
      } else {
         if (var4 != 1313820229) {
            return -1;
         }

         this.pcmswapbytes = !this.parse.swapbytes;
      }

      if (var6 != 0 && (var7 > 0 || var5.numSampleFrames == 0)) {
         if (0 != this.aiff_check2(var5)) {
            return 0;
         }

         var1.setInNumChannels(var5.numChannels);
         if (-1 == var1.getInNumChannels()) {
            if (this.parse.silent < 10) {
               System.err.printf("Unsupported number of channels: %u\n", var5.numChannels);
            }

            return 0;
         } else {
            var1.setInSampleRate((int)var5.sampleRate);
            var1.num_samples = var5.numSampleFrames;
            this.pcmbitwidth = var5.sampleSize;
            this.pcm_is_unsigned_8bit = false;
            if (var8 >= 0L) {
               try {
                  var2.seek(var8);
               } catch (IOException var22) {
                  if (this.parse.silent < 10) {
                     System.err.printf("Can't rewind stream to audio data position\n");
                  }

                  return 0;
               }
            }

            return 1;
         }
      } else {
         return -1;
      }
   }

   private GetAudio.SoundFileFormat parse_file_header(LameGlobalFlags var1, RandomAccessFile var2) {
      int var3 = this.Read32BitsHighLow(var2);
      this.count_samples_carefully = false;
      this.pcm_is_unsigned_8bit = !this.parse.in_signed;
      if (var3 == 1380533830) {
         int var4 = this.parse_wave_header(var1, var2);
         if (var4 > 0) {
            this.count_samples_carefully = true;
            return GetAudio.SoundFileFormat.sf_wave;
         }

         if (var4 < 0 && this.parse.silent < 10) {
            System.err.println("Warning: corrupt or unsupported WAVE format");
         }
      } else if (var3 == 1179603533) {
         int var5 = this.parse_aiff_header(var1, var2);
         if (var5 > 0) {
            this.count_samples_carefully = true;
            return GetAudio.SoundFileFormat.sf_aiff;
         }

         if (var5 < 0 && this.parse.silent < 10) {
            System.err.printf("Warning: corrupt or unsupported AIFF format\n");
         }
      } else if (this.parse.silent < 10) {
         System.err.println("Warning: unsupported audio format\n");
      }

      return GetAudio.SoundFileFormat.sf_unknown;
   }

   private RandomAccessFile OpenSndFile(LameGlobalFlags var1, String var2, FrameSkip var3) {
      var1.num_samples = -1;

      try {
         this.musicin = new RandomAccessFile(var2, "r");
      } catch (FileNotFoundException var9) {
         throw new RuntimeException(String.format("Could not find \"%s\".", var2), var9);
      }

      if (this.is_mpeg_file_format(this.parse.getInputFormat())) {
         if (-1 == this.lame_decode_initfile(this.musicin, this.parse.getMp3InputData(), var3)) {
            throw new RuntimeException(String.format("Error reading headers in mp3 input file %s.", var2));
         }

         var1.setInNumChannels(this.parse.getMp3InputData().stereo);
         var1.setInSampleRate(this.parse.getMp3InputData().samplerate);
         var1.num_samples = this.parse.getMp3InputData().getNumSamples();
      } else {
         if (this.parse.getInputFormat() == GetAudio.SoundFileFormat.sf_ogg) {
            throw new RuntimeException("sorry, vorbis support in LAME is deprecated.");
         }

         if (this.parse.getInputFormat() == GetAudio.SoundFileFormat.sf_raw) {
            if (this.parse.silent < 10) {
               System.out.println("Assuming raw pcm input file");
               if (this.parse.swapbytes) {
                  System.out.printf(" : Forcing byte-swapping\n");
               } else {
                  System.out.printf("\n");
               }
            }

            this.pcmswapbytes = this.parse.swapbytes;
         } else {
            this.parse.setInputFormat(this.parse_file_header(var1, this.musicin));
         }
      }

      if (this.parse.getInputFormat() == GetAudio.SoundFileFormat.sf_unknown) {
         throw new RuntimeException("Unknown sound format!");
      }

      if (var1.num_samples == -1) {
         double var4 = new File(var2).length();
         if (var4 >= 0.0) {
            if (this.is_mpeg_file_format(this.parse.getInputFormat())) {
               if (this.parse.getMp3InputData().bitrate > 0) {
                  double var6 = var4 * 8.0 / (1000.0 * this.parse.getMp3InputData().bitrate);
                  int var8 = (int)(var6 * var1.getInSampleRate());
                  var1.num_samples = var8;
                  this.parse.getMp3InputData().setNumSamples(var8);
               }
            } else {
               var1.num_samples = (int)(var4 / (2 * var1.getInNumChannels()));
            }
         }
      }

      return this.musicin;
   }

   private boolean check_aid(byte[] var1) {
      return new String(var1, ISO_8859_1).startsWith("AiD\u0001");
   }

   private boolean is_syncword_mp123(byte[] var1) {
      byte var2 = 0;
      if ((var1[var2 + 0] & 255) != 255) {
         return false;
      }

      if ((var1[var2 + 1] & 224) != 224) {
         return false;
      }

      if ((var1[var2 + 1] & 24) == 8) {
         return false;
      }

      switch (var1[var2 + 1] & 6) {
         case 0:
         case 1:
         case 3:
         case 5:
         default:
            return false;
         case 2:
            if (this.parse.getInputFormat() != GetAudio.SoundFileFormat.sf_mp3 && this.parse.getInputFormat() != GetAudio.SoundFileFormat.sf_mp123) {
               return false;
            }

            this.parse.setInputFormat(GetAudio.SoundFileFormat.sf_mp3);
            break;
         case 4:
            if (this.parse.getInputFormat() != GetAudio.SoundFileFormat.sf_mp2 && this.parse.getInputFormat() != GetAudio.SoundFileFormat.sf_mp123) {
               return false;
            }

            this.parse.setInputFormat(GetAudio.SoundFileFormat.sf_mp2);
            break;
         case 6:
            if (this.parse.getInputFormat() != GetAudio.SoundFileFormat.sf_mp1 && this.parse.getInputFormat() != GetAudio.SoundFileFormat.sf_mp123) {
               return false;
            }

            this.parse.setInputFormat(GetAudio.SoundFileFormat.sf_mp1);
      }

      if ((var1[var2 + 1] & 6) == 0) {
         return false;
      } else if ((var1[var2 + 2] & 240) == 240) {
         return false;
      } else if ((var1[var2 + 2] & 12) == 12) {
         return false;
      } else {
         return (var1[var2 + 1] & 24) == 24 && (var1[var2 + 1] & 6) == 4 && (abl2[(var1[var2 + 2] & 255) >> 4] & 1 << ((var1[var2 + 3] & 255) >> 6)) != 0
            ? false
            : (var1[var2 + 3] & 3) != 2;
      }
   }

   private int lame_decode_initfile(RandomAccessFile var1, MP3Data var2, FrameSkip var3) {
      byte[] var4 = new byte[100];
      float[] var5 = new float[1152];
      float[] var6 = new float[1152];
      boolean var7 = false;
      if (this.hip != null) {
         this.mpg.hip_decode_exit(this.hip);
      }

      this.hip = this.mpg.hip_decode_init();
      int var8 = 4;

      try {
         var1.readFully(var4, 0, var8);
      } catch (IOException var19) {
         var19.printStackTrace();
         return -1;
      }

      if (var4[0] == 73 && var4[1] == 68 && var4[2] == 51) {
         if (this.parse.silent < 10) {
            System.out.println("ID3v2 found. Be aware that the ID3 tag is currently lost when transcoding.");
         }

         var8 = (byte)6;

         try {
            var1.readFully(var4, 0, var8);
         } catch (IOException var18) {
            var18.printStackTrace();
            return -1;
         }

         var4[2] = (byte)(var4[2] & 127);
         var4[3] = (byte)(var4[3] & 127);
         var4[4] = (byte)(var4[4] & 127);
         var4[5] = (byte)(var4[5] & 127);
         var8 = (((var4[2] << 7) + var4[3] << 7) + var4[4] << 7) + var4[5];

         try {
            var1.skipBytes(var8);
         } catch (IOException var17) {
            var17.printStackTrace();
            return -1;
         }

         var8 = 4;

         try {
            var1.readFully(var4, 0, var8);
         } catch (IOException var16) {
            var16.printStackTrace();
            return -1;
         }
      }

      if (this.check_aid(var4)) {
         try {
            var1.readFully(var4, 0, 2);
         } catch (IOException var15) {
            var15.printStackTrace();
            return -1;
         }

         int var9 = (var4[0] & 255) + 256 * (var4[1] & 255);
         if (this.parse.silent < 10) {
            System.out.printf("Album ID found.  length=%d \n", var9);
         }

         try {
            var1.skipBytes(var9 - 6);
         } catch (IOException var14) {
            var14.printStackTrace();
            return -1;
         }

         try {
            var1.readFully(var4, 0, var8);
         } catch (IOException var13) {
            var13.printStackTrace();
            return -1;
         }
      }

      byte var22 = 4;

      while (!this.is_syncword_mp123(var4)) {
         for (int var23 = 0; var23 < var22 - 1; var23++) {
            var4[var23] = var4[var23 + 1];
         }

         try {
            var1.readFully(var4, var22 - 1, 1);
         } catch (IOException var12) {
            var12.printStackTrace();
            return -1;
         }
      }

      if ((var4[2] & 240) == 0) {
         if (this.parse.silent < 10) {
            System.out.println("Input file is freeformat.");
         }

         var7 = true;
      }

      int var24 = this.mpg.hip_decode1_headers(this.hip, var4, var22, var5, var6, var2, var3);
      if (-1 == var24) {
         return -1;
      }

      while (!var2.header_parsed) {
         try {
            var1.readFully(var4);
         } catch (IOException var11) {
            var11.printStackTrace();
            return -1;
         }

         var24 = this.mpg.hip_decode1_headers(this.hip, var4, var4.length, var5, var6, var2, var3);
         if (-1 == var24) {
            return -1;
         }
      }

      if (var2.bitrate == 0 && !var7) {
         if (this.parse.silent < 10) {
            System.err.println("fail to sync...");
         }

         return this.lame_decode_initfile(var1, var2, var3);
      } else {
         if (var2.getTotalFrames() <= 0) {
            var2.setNumSamples(-1);
         }

         return 0;
      }
   }

   private int lame_decode_fromfile(RandomAccessFile var1, float[] var2, float[] var3, MP3Data var4) {
      int var5 = 0;
      int var6 = 0;
      byte[] var7 = new byte[1024];
      var5 = (byte)-1;
      var5 = this.mpg.hip_decode1_headers(this.hip, var7, var6, var2, var3, var4, new FrameSkip());
      if (var5 != 0) {
         return var5;
      }

      do {
         try {
            var6 = var1.read(var7, 0, 1024);
         } catch (IOException var9) {
            var9.printStackTrace();
            return -1;
         }

         if (var6 <= 0) {
            var5 = this.mpg.hip_decode1_headers(this.hip, var7, 0, var2, var3, var4, new FrameSkip());
            if (var5 <= 0) {
               this.mpg.hip_decode_exit(this.hip);
               this.hip = null;
               return -1;
            }
            break;
         }

         var5 = this.mpg.hip_decode1_headers(this.hip, var7, var6, var2, var3, var4, new FrameSkip());
         if (var5 == -1) {
            this.mpg.hip_decode_exit(this.hip);
            this.hip = null;
            return -1;
         }
      } while (var5 <= 0);

      return var5;
   }

   private boolean is_mpeg_file_format(GetAudio.SoundFileFormat var1) {
      switch (var1) {
         case sf_mp1:
         case sf_mp2:
         case sf_mp3:
         case sf_mp123:
            return true;
         default:
            return false;
      }
   }

   private int Read32BitsLowHigh(RandomAccessFile var1) {
      int var2 = 65535 & this.Read16BitsLowHigh(var1);
      int var3 = 65535 & this.Read16BitsLowHigh(var1);
      return (var3 << 16) + var2;
   }

   private int Read16BitsLowHigh(RandomAccessFile var1) {
      try {
         int var2 = 0xFF & var1.read();
         int var3 = 0xFF & var1.read();
         return (var3 << 8) + var2;
      } catch (IOException var5) {
         var5.printStackTrace();
         return 0;
      }
   }

   private int Read16BitsHighLow(RandomAccessFile var1) {
      try {
         int var2 = var1.readUnsignedByte();
         int var3 = var1.readUnsignedByte();
         return var2 << 8 | var3;
      } catch (IOException var4) {
         var4.printStackTrace();
         return 0;
      }
   }

   private int Read32BitsHighLow(RandomAccessFile var1) {
      int var2 = 65535 & this.Read16BitsHighLow(var1);
      int var3 = 65535 & this.Read16BitsHighLow(var1);
      return (var2 << 16) + var3;
   }

   private double unsignedToFloat(double var1) {
      return (long)(var1 - 2.147483647E9 - 1.0) + 2.1474836E9F;
   }

   private double ldexp(double var1, double var3) {
      return var1 * Math.pow(2.0, var3);
   }

   private double convertFromIeeeExtended(byte[] var1) {
      long var4 = (var1[0] & 127) << 8 | var1[1] & 0xFF;
      long var6 = (long)(var1[2] & 0xFF) << 24 | (long)(var1[3] & 0xFF) << 16 | (long)(var1[4] & 0xFF) << 8 | var1[5] & 0xFF;
      long var8 = (long)(var1[6] & 0xFF) << 24 | (long)(var1[7] & 0xFF) << 16 | (long)(var1[8] & 0xFF) << 8 | var1[9] & 0xFF;
      double var2;
      if (var4 == 0L && var6 == 0L && var8 == 0L) {
         var2 = 0.0;
      } else if (var4 == 32767L) {
         var2 = Double.POSITIVE_INFINITY;
      } else {
         var4 -= 16383L;
         long var12;
         var2 = this.ldexp(this.unsignedToFloat(var6), (int)(var12 = var4 - 31L));
         var2 += this.ldexp(this.unsignedToFloat(var8), (int)(var4 = var12 - 32L));
      }

      return (var1[0] & 128) != 0 ? -var2 : var2;
   }

   private double readIeeeExtendedHighLow(RandomAccessFile var1) {
      byte[] var2 = new byte[10];
      var1.readFully(var2);
      return this.convertFromIeeeExtended(var2);
   }

   private void write32BitsLowHigh(DataOutput var1, int var2) {
      this.write16BitsLowHigh(var1, (int)(var2 & 65535L));
      this.write16BitsLowHigh(var1, (int)(var2 >> 16 & 65535L));
   }

   public final void write16BitsLowHigh(DataOutput var1, int var2) {
      var1.write(var2 & 0xFF);
      var1.write(var2 >> 8 & 0xFF);
   }

   protected static final class BlockAlign {
      int offset;
      int blockSize;
   }

   protected static final class IFF_AIFF {
      short numChannels;
      int numSampleFrames;
      short sampleSize;
      double sampleRate;
      int sampleType;
      GetAudio.BlockAlign blkAlgn = new GetAudio.BlockAlign();
   }

   public enum SoundFileFormat {
      sf_unknown,
      sf_raw,
      sf_wave,
      sf_aiff,
      sf_mp1,
      sf_mp2,
      sf_mp3,
      sf_mp123,
      sf_ogg;
   }
}
