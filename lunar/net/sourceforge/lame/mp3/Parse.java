package net.sourceforge.lame.mp3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Scanner;

public class Parse {
   private static boolean INTERNAL_OPTS = false;
   public boolean swapbytes = false;
   public int silent;
   public boolean embedded;
   public boolean brhist;
   public float update_interval;
   public int mp3_delay;
   public boolean mp3_delay_set;
   public boolean disable_wav_header;
   public boolean print_clipping_info;
   public boolean in_signed = true;
   public ByteOrder in_endian = ByteOrder.LITTLE_ENDIAN;
   public int in_bitwidth = 16;
   ID3Tag id3;
   Presets pre;
   private Usage usage = new Usage();
   private Version version = new Version();
   private GetAudio.SoundFileFormat inputFormat;
   private boolean ignore_tag_errors;
   private MP3Data mp3InputData = new MP3Data();

   public final void setModules(ID3Tag var1, Presets var2) {
      this.id3 = var1;
      this.pre = var2;
   }

   public GetAudio.SoundFileFormat getInputFormat() {
      return this.inputFormat;
   }

   public void setInputFormat(GetAudio.SoundFileFormat var1) {
      this.inputFormat = var1;
   }

   public MP3Data getMp3InputData() {
      return this.mp3InputData;
   }

   public void setMp3InputData(MP3Data var1) {
      this.mp3InputData = var1;
   }

   private boolean set_id3tag(LameGlobalFlags var1, int var2, String var3) {
      switch (var2) {
         case 97:
            this.id3.id3tag_set_artist(var1, var3);
            return false;
         case 98:
         case 100:
         case 101:
         case 102:
         case 104:
         case 105:
         case 106:
         case 107:
         case 109:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         case 117:
         case 119:
         case 120:
         default:
            return false;
         case 99:
            this.id3.id3tag_set_comment(var1, var3);
            return false;
         case 103:
            this.id3.id3tag_set_genre(var1, var3);
            return false;
         case 108:
            this.id3.id3tag_set_album(var1, var3);
            return false;
         case 110:
            this.id3.id3tag_set_track(var1, var3);
            return false;
         case 116:
            this.id3.id3tag_set_title(var1, var3);
            return false;
         case 118:
            this.id3.id3tag_set_fieldvalue(var1, var3);
            return false;
         case 121:
            this.id3.id3tag_set_year(var1, var3);
            return false;
      }
   }

   private boolean set_id3v2tag(LameGlobalFlags var1, int var2, String var3) {
      switch (var2) {
         case 97:
            this.id3.id3tag_set_textinfo_ucs2(var1, "TPE1", var3);
            return false;
         case 98:
         case 100:
         case 101:
         case 102:
         case 104:
         case 105:
         case 106:
         case 107:
         case 109:
         case 111:
         case 112:
         case 113:
         case 114:
         case 115:
         default:
            return false;
         case 99:
            this.id3.id3tag_set_comment(var1, null, null, var3, 0);
            return false;
         case 103:
            this.id3.id3tag_set_textinfo_ucs2(var1, "TCON", var3);
            return false;
         case 108:
            this.id3.id3tag_set_textinfo_ucs2(var1, "TALB", var3);
            return false;
         case 110:
            this.id3.id3tag_set_textinfo_ucs2(var1, "TRCK", var3);
            return false;
         case 116:
            this.id3.id3tag_set_textinfo_ucs2(var1, "TIT2", var3);
            return false;
      }
   }

   private boolean id3_tag(LameGlobalFlags var1, int var2, Parse.TextEncoding var3, String var4) {
      String var5 = null;
      switch (var3) {
         case TENC_RAW:
         default:
            var5 = var4;
            break;
         case TENC_LATIN1:
            var5 = var4;
            break;
         case TENC_UCS2:
            var5 = var4;
      }

      boolean var6;
      switch (var3) {
         case TENC_RAW:
         case TENC_LATIN1:
         default:
            var6 = this.set_id3tag(var1, var2, var5);
            break;
         case TENC_UCS2:
            var6 = this.set_id3v2tag(var1, var2, var5);
      }

      return var6;
   }

   private int presets_set(LameGlobalFlags var1, int var2, int var3, String var4, String var5) {
      boolean var6 = false;
      if (var4.equals("help") && var2 < 1 && var3 < 1) {
         System.out.println(this.version.getVersion());
         System.out.println();
         this.usage.printPresets(System.out);
         return -1;
      }

      if (var4.equals("phone")) {
         var4 = "16";
         var6 = true;
      }

      if (var4.equals("phon+") || var4.equals("lw") || var4.equals("mw-eu") || var4.equals("sw")) {
         var4 = "24";
         var6 = true;
      }

      if (var4.equals("mw-us")) {
         var4 = "40";
         var6 = true;
      }

      if (var4.equals("voice")) {
         var4 = "56";
         var6 = true;
      }

      if (var4.equals("fm")) {
         var4 = "112";
      }

      if (var4.equals("radio") || var4.equals("tape")) {
         var4 = "112";
      }

      if (var4.equals("hifi")) {
         var4 = "160";
      }

      if (var4.equals("cd")) {
         var4 = "192";
      }

      if (var4.equals("studio")) {
         var4 = "256";
      }

      if (var4.equals("medium")) {
         this.pre.lame_set_VBR_q(var1, 4);
         if (var2 > 0) {
            var1.setVBR(VbrMode.vbr_mtrh);
         } else {
            var1.setVBR(VbrMode.vbr_rh);
         }

         return 0;
      } else if (var4.equals("standard")) {
         this.pre.lame_set_VBR_q(var1, 2);
         if (var2 > 0) {
            var1.setVBR(VbrMode.vbr_mtrh);
         } else {
            var1.setVBR(VbrMode.vbr_rh);
         }

         return 0;
      } else if (var4.equals("extreme")) {
         this.pre.lame_set_VBR_q(var1, 0);
         if (var2 > 0) {
            var1.setVBR(VbrMode.vbr_mtrh);
         } else {
            var1.setVBR(VbrMode.vbr_rh);
         }

         return 0;
      } else {
         if (var4.equals("insane") && var2 < 1) {
            var1.preset = 1003;
            this.pre.apply_preset(var1, 1003, 1);
            return 0;
         }

         if (Integer.valueOf(var4) > 0 && var2 < 1) {
            if (Integer.valueOf(var4) >= 8 && Integer.valueOf(var4) <= 320) {
               var1.preset = Integer.valueOf(var4);
               this.pre.apply_preset(var1, Integer.valueOf(var4), 1);
               if (var3 == 1) {
                  var1.setVBR(VbrMode.vbr_off);
               }

               if (var6) {
                  var1.setMode(MPEGMode.MONO);
               }

               return 0;
            } else {
               System.err.println(this.version.getVersion());
               System.err.println();
               System.err
                  .printf(
                     "Error: The bitrate specified is out of the valid range for this preset\n\nWhen using this mode you must enter a value between \"32\" and \"320\"\n\nFor further information try: \"%s --preset help\"\n",
                     var5
                  );
               return -1;
            }
         } else {
            System.err.println(this.version.getVersion());
            System.err.println();
            System.err
               .printf(
                  "Error: You did not enter a valid profile and/or options with --preset\n\nAvailable profiles are:\n\n   <fast>        medium\n   <fast>        standard\n   <fast>        extreme\n                 insane\n          <cbr> (ABR Mode) - The ABR Mode is implied. To use it,\n                             simply specify a bitrate. For example:\n                             \"--preset 185\" activates this\n                             preset and uses 185 as an average kbps.\n\n"
               );
            System.err
               .printf(
                  "    Some examples:\n\n or \"%s --preset fast standard <input file> <output file>\"\n or \"%s --preset cbr 192 <input file> <output file>\"\n or \"%s --preset 172 <input file> <output file>\"\n or \"%s --preset extreme <input file> <output file>\"\n\nFor further information try: \"%s --preset help\"\n",
                  var5,
                  var5,
                  var5,
                  var5,
                  var5
               );
            return -1;
         }
      }
   }

   private GetAudio.SoundFileFormat filename_to_type(String var1) {
      int var2 = var1.length();
      if (var2 < 4) {
         return GetAudio.SoundFileFormat.sf_unknown;
      } else {
         var1 = var1.substring(var2 - 4);
         if (var1.equalsIgnoreCase(".mpg")) {
            return GetAudio.SoundFileFormat.sf_mp123;
         } else if (var1.equalsIgnoreCase(".mp1")) {
            return GetAudio.SoundFileFormat.sf_mp123;
         } else if (var1.equalsIgnoreCase(".mp2")) {
            return GetAudio.SoundFileFormat.sf_mp123;
         } else if (var1.equalsIgnoreCase(".mp3")) {
            return GetAudio.SoundFileFormat.sf_mp123;
         } else if (var1.equalsIgnoreCase(".wav")) {
            return GetAudio.SoundFileFormat.sf_wave;
         } else if (var1.equalsIgnoreCase(".aif")) {
            return GetAudio.SoundFileFormat.sf_aiff;
         } else if (var1.equalsIgnoreCase(".raw")) {
            return GetAudio.SoundFileFormat.sf_raw;
         } else {
            return var1.equalsIgnoreCase(".ogg") ? GetAudio.SoundFileFormat.sf_ogg : GetAudio.SoundFileFormat.sf_unknown;
         }
      }
   }

   private int resample_rate(double var1) {
      if (var1 >= 1000.0) {
         var1 *= 0.001;
      }

      switch ((int)var1) {
         case 8:
            return 8000;
         case 11:
            return 11025;
         case 12:
            return 12000;
         case 16:
            return 16000;
         case 22:
            return 22050;
         case 24:
            return 24000;
         case 32:
            return 32000;
         case 44:
            return 44100;
         case 48:
            return 48000;
         default:
            System.err.printf("Illegal resample frequency: %.3f kHz\n", var1);
            return 0;
      }
   }

   private int set_id3_albumart(LameGlobalFlags var1, String var2) {
      byte var3 = -1;
      RandomAccessFile var4 = null;
      if (var2 == null) {
         return 0;
      }

      try {
         var4 = new RandomAccessFile(var2, "r");

         try {
            int var5 = (int)(var4.length() & 2147483647L);
            byte[] var6 = new byte[var5];
            var4.readFully(var6);
            var3 = (byte)(this.id3.id3tag_set_albumart(var1, var6, var5) ? 0 : 4);
         } catch (IOException var16) {
            var3 = 3;
         } finally {
            try {
               var4.close();
            } catch (IOException var15) {
               var15.printStackTrace();
            }
         }
      } catch (FileNotFoundException var18) {
         var3 = 1;
      }

      switch (var3) {
         case 1:
            System.err.printf("Could not find: '%s'.\n", var2);
            break;
         case 2:
            System.err.printf("Insufficient memory for reading the albumart.\n");
            break;
         case 3:
            System.err.printf("Read error: '%s'.\n", var2);
            break;
         case 4:
            System.err.printf("Unsupported image: '%s'.\nSpecify JPEG/PNG/GIF image (128KB maximum)\n", var2);
      }

      return var3;
   }

   public int parse_args(LameGlobalFlags var1, ArrayList<String> var2, StringBuilder var3, StringBuilder var4, String[] var5, Parse.NoGap var6) {
      boolean var7 = false;
      boolean var8 = false;
      boolean var11 = false;
      boolean var12 = false;
      String var13 = "lame";
      int var14 = 0;
      boolean var15 = false;
      Parse.ID3TAG_MODE var16 = Parse.ID3TAG_MODE.ID3TAG_MODE_DEFAULT;
      var3.setLength(0);
      var4.setLength(0);
      this.silent = 0;
      this.embedded = false;
      this.ignore_tag_errors = false;
      this.brhist = true;
      this.mp3_delay = 0;
      this.mp3_delay_set = false;
      this.print_clipping_info = false;
      this.disable_wav_header = false;
      this.id3.init(var1);

      for (int var17 = 0; var17 < var2.size(); var17++) {
         int var20 = 0;
         String var19 = (String)var2.get(var17);
         if (var19.charAt(var20++) == '-') {
            int var23 = 0;
            String var22 = var17 + 1 < var2.size() ? (String)var2.get(var17 + 1) : "";
            if (var19.length() - var20 == 0) {
               var7 = true;
               if (var3.length() == 0) {
                  var3.setLength(0);
                  var3.append((String)var2.get(var17));
               } else if (var4.length() == 0) {
                  var4.setLength(0);
                  var4.append((String)var2.get(var17));
               }
            }

            if (var19.charAt(var20) != '-') {
               while (var20 < var19.length()) {
                  String var21;
                  char var18 = var19.charAt(var20++);
                  var21 = var20 < var19.length() ? var19 : var22;
                  label1915:
                  switch (var18) {
                     case '?':
                        System.out.println(this.version.getVersion());
                        System.out.println();
                        this.usage.printLong(var1, System.out);
                        this.usage.printBitrates(System.out);
                        return -1;
                     case '@':
                     case 'A':
                     case 'C':
                     case 'D':
                     case 'E':
                     case 'G':
                     case 'H':
                     case 'I':
                     case 'J':
                     case 'K':
                     case 'L':
                     case 'M':
                     case 'N':
                     case 'O':
                     case 'P':
                     case 'Q':
                     case 'R':
                     case 'U':
                     case 'W':
                     case '[':
                     case '\\':
                     case ']':
                     case '^':
                     case '_':
                     case '`':
                     case 'd':
                     case 'g':
                     case 'i':
                     case 'j':
                     case 'k':
                     case 'l':
                     case 'n':
                     case 'u':
                     case 'w':
                     default:
                        System.err.printf("%s: unrecognized option -%c\n", "lame", var18);
                        return -1;
                     case 'B':
                        var23 = 1;
                        var1.VBR_max_bitrate_kbps = Integer.valueOf(var21);
                        break;
                     case 'F':
                        var1.VBR_hard_min = 1;
                        break;
                     case 'S':
                        this.silent = 10;
                        break;
                     case 'T':
                        var1.bWriteVbrTag = true;
                        var12 = true;
                        this.disable_wav_header = false;
                        break;
                     case 'V':
                        var23 = 1;
                        if (var1.getVBR() == VbrMode.vbr_off) {
                           var1.setVBRQuality(VbrMode.vbr_default.ordinal());
                           var1.VBR_q_frac = 0.0F;
                        }

                        var1.setVBRQuality((int)((float)Double.parseDouble(var21)));
                        var1.VBR_q_frac = (float)Double.parseDouble(var21) - var1.getVBRQuality();
                        break;
                     case 'X':
                        int var97;
                        int var100;
                        try (Scanner var106 = new Scanner(var21)) {
                           var97 = var106.nextInt();
                           if (!var106.hasNext()) {
                              var100 = var97;
                           } else {
                              var106.nextByte();
                              var100 = var106.nextInt();
                           }
                        }

                        var23 = 1;
                        if (INTERNAL_OPTS) {
                           var1.quant_comp = var97;
                           var1.quant_comp_short = var100;
                        }
                        break;
                     case 'Y':
                        var1.experimentalY = true;
                        break;
                     case 'Z':
                        int var95 = 1;

                        try (Scanner var99 = new Scanner(var21)) {
                           var95 = var99.nextInt();
                        }

                        if (INTERNAL_OPTS) {
                           var1.experimentalZ = var95;
                        }
                        break;
                     case 'a':
                        var8 = true;
                        var1.setMode(MPEGMode.MONO);
                        break;
                     case 'b':
                        var23 = 1;
                        var1.setBitRate(Integer.valueOf(var21));
                        if (var1.getBitRate() > 320) {
                           var1.disable_reservoir = true;
                        }

                        var1.VBR_min_bitrate_kbps = var1.getBitRate();
                        break;
                     case 'c':
                        var1.copyright = 1;
                        break;
                     case 'e':
                        var23 = 1;
                        switch (var21.charAt(0)) {
                           case '5':
                              var1.emphasis = 1;
                              break label1915;
                           case 'c':
                              var1.emphasis = 3;
                              break label1915;
                           case 'n':
                              var1.emphasis = 0;
                              break label1915;
                           default:
                              System.err.printf("%s: -e emp must be n/5/c not %s\n", "lame", var21);
                              return -1;
                        }
                     case 'f':
                        var1.setQuality(7);
                        break;
                     case 'h':
                        var1.setQuality(2);
                        break;
                     case 'm':
                        var23 = 1;
                        switch (var21.charAt(0)) {
                           case 'a':
                              var1.setMode(MPEGMode.JOINT_STEREO);
                              break label1915;
                           case 'b':
                           case 'c':
                           case 'e':
                           case 'g':
                           case 'h':
                           case 'i':
                           case 'k':
                           case 'l':
                           case 'n':
                           case 'o':
                           case 'p':
                           case 'q':
                           case 'r':
                           default:
                              System.err.printf("%s: -m mode must be s/d/j/f/m not %s\n", "lame", var21);
                              return -1;
                           case 'd':
                              var1.setMode(MPEGMode.DUAL_CHANNEL);
                              break label1915;
                           case 'f':
                              var1.force_ms = true;
                           case 'j':
                              var1.setMode(MPEGMode.JOINT_STEREO);
                              break label1915;
                           case 'm':
                              var1.setMode(MPEGMode.MONO);
                              break label1915;
                           case 's':
                              var1.setMode(MPEGMode.STEREO);
                              break label1915;
                        }
                     case 'o':
                        var1.original = 0;
                        break;
                     case 'p':
                        var1.error_protection = true;
                        break;
                     case 'q':
                        var23 = 1;
                        int var94 = Integer.valueOf(var21);
                        if (var94 < 0) {
                           var94 = 0;
                        }

                        if (var94 > 9) {
                           var94 = 9;
                        }

                        var1.setQuality(var94);
                        break;
                     case 'r':
                        this.setInputFormat(GetAudio.SoundFileFormat.sf_raw);
                        break;
                     case 's':
                        var23 = 1;
                        double var81 = Double.parseDouble(var21);
                        var1.setInSampleRate((int)(var81 * (var81 <= 192.0 ? 1000.0 : 1.0) + 0.5));
                        break;
                     case 't':
                        var1.bWriteVbrTag = false;
                        this.disable_wav_header = true;
                        break;
                     case 'v':
                        if (var1.getVBR() == VbrMode.vbr_off) {
                           var1.setVBR(VbrMode.vbr_mtrh);
                        }
                        break;
                     case 'x':
                        this.swapbytes = true;
                  }

                  if (var23 != 0) {
                     if (var21 == var19) {
                        var19 = "";
                     } else {
                        var17++;
                     }

                     var21 = "";
                     var23 = 0;
                  }
               }
            } else {
               if (var19.substring(++var20).equalsIgnoreCase("resample")) {
                  var23 = 1;
                  var1.setOutSampleRate(this.resample_rate(Double.parseDouble(var22)));
               } else if (var19.substring(var20).equalsIgnoreCase("vbr-old")) {
                  var1.setVBR(VbrMode.vbr_rh);
               } else if (var19.substring(var20).equalsIgnoreCase("vbr-new")) {
                  var1.setVBR(VbrMode.vbr_mtrh);
               } else if (var19.substring(var20).equalsIgnoreCase("vbr-mtrh")) {
                  var1.setVBR(VbrMode.vbr_mtrh);
               } else if (var19.substring(var20).equalsIgnoreCase("cbr")) {
                  var1.setVBR(VbrMode.vbr_off);
               } else if (var19.substring(var20).equalsIgnoreCase("abr")) {
                  var23 = 1;
                  var1.setVBR(VbrMode.vbr_abr);
                  var1.VBR_mean_bitrate_kbps = Integer.valueOf(var22);
                  if (var1.VBR_mean_bitrate_kbps >= 8000) {
                     var1.VBR_mean_bitrate_kbps = (var1.VBR_mean_bitrate_kbps + 500) / 1000;
                  }

                  var1.VBR_mean_bitrate_kbps = Math.min(var1.VBR_mean_bitrate_kbps, 320);
                  var1.VBR_mean_bitrate_kbps = Math.max(var1.VBR_mean_bitrate_kbps, 8);
               } else if (var19.substring(var20).equalsIgnoreCase("r3mix")) {
                  var1.preset = 1000;
                  this.pre.apply_preset(var1, 1000, 1);
               } else if (var19.substring(var20).equalsIgnoreCase("bitwidth")) {
                  var23 = 1;
                  this.in_bitwidth = Integer.valueOf(var22);
               } else if (var19.substring(var20).equalsIgnoreCase("signed")) {
                  this.in_signed = true;
               } else if (var19.substring(var20).equalsIgnoreCase("unsigned")) {
                  this.in_signed = false;
               } else if (var19.substring(var20).equalsIgnoreCase("little-endian")) {
                  this.in_endian = ByteOrder.LITTLE_ENDIAN;
               } else if (var19.substring(var20).equalsIgnoreCase("big-endian")) {
                  this.in_endian = ByteOrder.BIG_ENDIAN;
               } else if (var19.substring(var20).equalsIgnoreCase("mp1input")) {
                  this.setInputFormat(GetAudio.SoundFileFormat.sf_mp1);
               } else if (var19.substring(var20).equalsIgnoreCase("mp2input")) {
                  this.setInputFormat(GetAudio.SoundFileFormat.sf_mp2);
               } else if (var19.substring(var20).equalsIgnoreCase("mp3input")) {
                  this.setInputFormat(GetAudio.SoundFileFormat.sf_mp3);
               } else {
                  if (var19.substring(var20).equalsIgnoreCase("ogginput")) {
                     System.err.printf("sorry, vorbis support in LAME is deprecated.\n");
                     return -1;
                  }

                  if (var19.substring(var20).equalsIgnoreCase("phone")) {
                     if (this.presets_set(var1, 0, 0, var19, "lame") < 0) {
                        return -1;
                     }

                     System.err.printf("Warning: --phone is deprecated, use --preset phone instead!");
                  } else if (var19.substring(var20).equalsIgnoreCase("voice")) {
                     if (this.presets_set(var1, 0, 0, var19, "lame") < 0) {
                        return -1;
                     }

                     System.err.printf("Warning: --voice is deprecated, use --preset voice instead!");
                  } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("noshort")) {
                     var1.short_blocks = ShortBlock.short_block_dispensed;
                  } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("short")) {
                     var1.short_blocks = ShortBlock.short_block_allowed;
                  } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("allshort")) {
                     var1.short_blocks = ShortBlock.short_block_forced;
                  } else if (var19.substring(var20).equalsIgnoreCase("decode")) {
                     var1.decode_only = true;
                  } else if (var19.substring(var20).equalsIgnoreCase("decode-mp3delay")) {
                     this.mp3_delay = Integer.valueOf(var22);
                     this.mp3_delay_set = true;
                     var23 = 1;
                  } else if (var19.substring(var20).equalsIgnoreCase("nores")) {
                     var1.disable_reservoir = true;
                  } else if (var19.substring(var20).equalsIgnoreCase("strictly-enforce-ISO")) {
                     var1.strict_ISO = true;
                  } else if (var19.substring(var20).equalsIgnoreCase("scale")) {
                     var23 = 1;
                     var1.scale = (float)Double.parseDouble(var22);
                  } else if (var19.substring(var20).equalsIgnoreCase("scale-l")) {
                     var23 = 1;
                     var1.scale_left = (float)Double.parseDouble(var22);
                  } else if (var19.substring(var20).equalsIgnoreCase("scale-r")) {
                     var23 = 1;
                     var1.scale_right = (float)Double.parseDouble(var22);
                  } else if (var19.substring(var20).equalsIgnoreCase("freeformat")) {
                     var1.free_format = true;
                  } else if (var19.substring(var20).equalsIgnoreCase("replaygain-fast")) {
                     var1.setFindReplayGain(true);
                  } else if (var19.substring(var20).equalsIgnoreCase("replaygain-accurate")) {
                     var1.decode_on_the_fly = true;
                     var1.setFindReplayGain(true);
                  } else if (var19.substring(var20).equalsIgnoreCase("noreplaygain")) {
                     var15 = true;
                     var1.setFindReplayGain(false);
                  } else if (var19.substring(var20).equalsIgnoreCase("clipdetect")) {
                     this.print_clipping_info = true;
                     var1.decode_on_the_fly = true;
                  } else if (var19.substring(var20).equalsIgnoreCase("nohist")) {
                     this.brhist = false;
                  } else if (var19.substring(var20).equalsIgnoreCase("tt")) {
                     var23 = 1;
                     this.id3_tag(var1, 116, Parse.TextEncoding.TENC_RAW, var22);
                  } else if (var19.substring(var20).equalsIgnoreCase("ta")) {
                     var23 = 1;
                     this.id3_tag(var1, 97, Parse.TextEncoding.TENC_RAW, var22);
                  } else if (var19.substring(var20).equalsIgnoreCase("tl")) {
                     var23 = 1;
                     this.id3_tag(var1, 108, Parse.TextEncoding.TENC_RAW, var22);
                  } else if (var19.substring(var20).equalsIgnoreCase("ty")) {
                     var23 = 1;
                     this.id3_tag(var1, 121, Parse.TextEncoding.TENC_RAW, var22);
                  } else if (var19.substring(var20).equalsIgnoreCase("tc")) {
                     var23 = 1;
                     this.id3_tag(var1, 99, Parse.TextEncoding.TENC_RAW, var22);
                  } else if (var19.substring(var20).equalsIgnoreCase("tn")) {
                     boolean var24 = this.id3_tag(var1, 110, Parse.TextEncoding.TENC_RAW, var22);
                     var23 = 1;
                     if (var24 && !this.ignore_tag_errors) {
                        if (var16 == Parse.ID3TAG_MODE.ID3TAG_MODE_V1_ONLY) {
                           System.err.printf("The track number has to be between 1 and 255 for ID3v1.\n");
                           return -1;
                        }

                        if (var16 != Parse.ID3TAG_MODE.ID3TAG_MODE_V2_ONLY && this.silent < 10) {
                           System.err.printf("The track number has to be between 1 and 255 for ID3v1, ignored for ID3v1.\n");
                        }
                     }
                  } else if (var19.substring(var20).equalsIgnoreCase("tg")) {
                     this.id3_tag(var1, 103, Parse.TextEncoding.TENC_RAW, var22);
                     var23 = 1;
                  } else if (var19.substring(var20).equalsIgnoreCase("tv")) {
                     var23 = 1;
                     if (this.id3_tag(var1, 118, Parse.TextEncoding.TENC_RAW, var22) && this.silent < 10) {
                        System.err.printf("Invalid field value: '%s'. Ignored\n", var22);
                     }
                  } else if (var19.substring(var20).equalsIgnoreCase("ti")) {
                     var23 = 1;
                     if (this.set_id3_albumart(var1, var22) != 0 && !this.ignore_tag_errors) {
                        return -1;
                     }
                  } else if (var19.substring(var20).equalsIgnoreCase("ignore-tag-errors")) {
                     this.ignore_tag_errors = true;
                  } else if (var19.substring(var20).equalsIgnoreCase("add-id3v2")) {
                     this.id3.id3tag_add_v2(var1);
                  } else if (var19.substring(var20).equalsIgnoreCase("id3v1-only")) {
                     this.id3.id3tag_v1_only(var1);
                     var16 = Parse.ID3TAG_MODE.ID3TAG_MODE_V1_ONLY;
                  } else if (var19.substring(var20).equalsIgnoreCase("id3v2-only")) {
                     this.id3.id3tag_v2_only(var1);
                     var16 = Parse.ID3TAG_MODE.ID3TAG_MODE_V2_ONLY;
                  } else if (var19.substring(var20).equalsIgnoreCase("space-id3v1")) {
                     this.id3.id3tag_space_v1(var1);
                  } else if (var19.substring(var20).equalsIgnoreCase("pad-id3v2")) {
                     this.id3.id3tag_pad_v2(var1);
                  } else if (var19.substring(var20).equalsIgnoreCase("pad-id3v2-size")) {
                     int var85 = Integer.valueOf(var22);
                     var85 = var85 <= 128000 ? var85 : 128000;
                     var85 = var85 >= 0 ? var85 : 0;
                     this.id3.id3tag_set_pad(var1, var85);
                     var23 = 1;
                  } else {
                     if (var19.substring(var20).equalsIgnoreCase("genre-list")) {
                        this.id3.id3tag_genre_list(new GenreListHandler() {
                           @Override
                           public void genre_list_handler(int var1, String var2x) {
                              System.out.printf("%3d %s\n", var1, var2x);
                           }
                        });
                        return -2;
                     }

                     if (var19.substring(var20).equalsIgnoreCase("lowpass")) {
                        double var9 = Double.parseDouble(var22);
                        var23 = 1;
                        if (var9 < 0.0) {
                           var1.lowpassfreq = -1;
                        } else {
                           if (var9 < 0.001 || var9 > 50000.0) {
                              System.err.printf("Must specify lowpass with --lowpass freq, freq >= 0.001 kHz\n");
                              return -1;
                           }

                           var1.lowpassfreq = (int)(var9 * (var9 < 50.0 ? 1000.0 : 1.0) + 0.5);
                        }
                     } else if (var19.substring(var20).equalsIgnoreCase("lowpass-width")) {
                        double var77 = Double.parseDouble(var22);
                        var23 = 1;
                        if (var77 < 0.001 || var77 > 50000.0) {
                           System.err.printf("Must specify lowpass width with --lowpass-width freq, freq >= 0.001 kHz\n");
                           return -1;
                        }

                        var1.lowpassfreq = (int)(var77 * (var77 < 16.0 ? 1000.0 : 1.0) + 0.5);
                     } else if (var19.substring(var20).equalsIgnoreCase("highpass")) {
                        double var78 = Double.parseDouble(var22);
                        var23 = 1;
                        if (var78 < 0.0) {
                           var1.highpassfreq = -1;
                        } else {
                           if (var78 < 0.001 || var78 > 50000.0) {
                              System.err.printf("Must specify highpass with --highpass freq, freq >= 0.001 kHz\n");
                              return -1;
                           }

                           var1.highpassfreq = (int)(var78 * (var78 < 16.0 ? 1000.0 : 1.0) + 0.5);
                        }
                     } else if (var19.substring(var20).equalsIgnoreCase("highpass-width")) {
                        double var79 = Double.parseDouble(var22);
                        var23 = 1;
                        if (var79 < 0.001 || var79 > 50000.0) {
                           System.err.printf("Must specify highpass width with --highpass-width freq, freq >= 0.001 kHz\n");
                           return -1;
                        }

                        var1.highpasswidth = (int)var79;
                     } else if (var19.substring(var20).equalsIgnoreCase("comp")) {
                        var23 = 1;
                        double var80 = Double.parseDouble(var22);
                        if (var80 < 1.0) {
                           System.err.printf("Must specify compression ratio >= 1.0\n");
                           return -1;
                        }

                        var1.compression_ratio = (float)var80;
                     } else if (var19.substring(var20).equalsIgnoreCase("notemp")) {
                        var1.useTemporal = false;
                     } else if (var19.substring(var20).equalsIgnoreCase("interch")) {
                        var23 = 1;
                        var1.interChRatio = (float)Double.parseDouble(var22);
                     } else if (var19.substring(var20).equalsIgnoreCase("temporal-masking")) {
                        var23 = 1;
                        var1.useTemporal = Integer.valueOf(var22) != 0;
                     } else if (var19.substring(var20).equalsIgnoreCase("nssafejoint")) {
                        var1.exp_nspsytune |= 2;
                     } else if (var19.substring(var20).equalsIgnoreCase("nsmsfix")) {
                        var23 = 1;
                        var1.msfix = (float)Double.parseDouble(var22);
                     } else if (var19.substring(var20).equalsIgnoreCase("ns-bass")) {
                        var23 = 1;
                        double var88 = Double.parseDouble(var22);
                        int var26 = (int)(var88 * 4.0);
                        if (var26 < -32) {
                           var26 = -32;
                        }

                        if (var26 > 31) {
                           var26 = 31;
                        }

                        if (var26 < 0) {
                           var26 += 64;
                        }

                        var1.exp_nspsytune |= var26 << 2;
                     } else if (var19.substring(var20).equalsIgnoreCase("ns-alto")) {
                        var23 = 1;
                        double var89 = Double.parseDouble(var22);
                        int var101 = (int)(var89 * 4.0);
                        if (var101 < -32) {
                           var101 = -32;
                        }

                        if (var101 > 31) {
                           var101 = 31;
                        }

                        if (var101 < 0) {
                           var101 += 64;
                        }

                        var1.exp_nspsytune |= var101 << 8;
                     } else if (var19.substring(var20).equalsIgnoreCase("ns-treble")) {
                        var23 = 1;
                        double var90 = Double.parseDouble(var22);
                        int var102 = (int)(var90 * 4.0);
                        if (var102 < -32) {
                           var102 = -32;
                        }

                        if (var102 > 31) {
                           var102 = 31;
                        }

                        if (var102 < 0) {
                           var102 += 64;
                        }

                        var1.exp_nspsytune |= var102 << 14;
                     } else if (var19.substring(var20).equalsIgnoreCase("ns-sfb21")) {
                        var23 = 1;
                        double var91 = Double.parseDouble(var22);
                        int var103 = (int)(var91 * 4.0);
                        if (var103 < -32) {
                           var103 = -32;
                        }

                        if (var103 > 31) {
                           var103 = 31;
                        }

                        if (var103 < 0) {
                           var103 += 64;
                        }

                        var1.exp_nspsytune |= var103 << 20;
                     } else if (!var19.substring(var20).equalsIgnoreCase("nspsytune2")) {
                        if (var19.substring(var20).equalsIgnoreCase("quiet") || var19.substring(var20).equalsIgnoreCase("silent")) {
                           this.silent = 10;
                        } else if (var19.substring(var20).equalsIgnoreCase("brief")) {
                           this.silent = -5;
                        } else if (var19.substring(var20).equalsIgnoreCase("embedded")) {
                           this.embedded = true;
                        } else if (var19.substring(var20).equalsIgnoreCase("verbose")) {
                           this.silent = -10;
                        } else {
                           if (var19.substring(var20).equalsIgnoreCase("version") || var19.substring(var20).equalsIgnoreCase("license")) {
                              System.out.println(this.version.getVersion());
                              System.out.println();
                              this.usage.printLicense(System.out);
                              return -2;
                           }

                           if (var19.substring(var20).equalsIgnoreCase("help") || var19.substring(var20).equalsIgnoreCase("usage")) {
                              System.out.println(this.version.getVersion());
                              System.out.println();
                              this.usage.printShort(var1, System.out);
                              return -2;
                           }

                           if (var19.substring(var20).equalsIgnoreCase("longhelp")) {
                              System.out.println(this.version.getVersion());
                              System.out.println();
                              this.usage.printLong(var1, System.out);
                              this.usage.printBitrates(System.out);
                              return -2;
                           }

                           if (var19.substring(var20).equalsIgnoreCase("?")) {
                              System.out.println(this.version.getVersion());
                              System.out.println();
                              this.usage.printLong(var1, System.out);
                              this.usage.printBitrates(System.out);
                              return -2;
                           }

                           if (var19.substring(var20).equalsIgnoreCase("preset") || var19.substring(var20).equalsIgnoreCase("alt-preset")) {
                              var23 = 1;
                              byte var93 = 0;
                              byte var98 = 0;

                              while (var22.equals("fast") || var22.equals("cbr")) {
                                 if (var22.equals("fast") && var93 < 1) {
                                    var93 = 1;
                                 }

                                 if (var22.equals("cbr") && var98 < 1) {
                                    var98 = 1;
                                 }

                                 var23++;
                                 var22 = var17 + var23 < var2.size() ? (String)var2.get(var17 + var23) : "";
                              }

                              if (this.presets_set(var1, var93, var98, var22, "lame") < 0) {
                                 return -1;
                              }
                           } else if (var19.substring(var20).equalsIgnoreCase("disptime")) {
                              var23 = 1;
                              this.update_interval = (float)Double.parseDouble(var22);
                           } else if (var19.substring(var20).equalsIgnoreCase("nogaptags")) {
                              var12 = true;
                           } else if (var19.substring(var20).equalsIgnoreCase("nogapout")) {
                              var4.setLength(0);
                              var4.append(var22);
                              var23 = 1;
                           } else if (var19.substring(var20).equalsIgnoreCase("nogap")) {
                              var11 = true;
                           } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("tune")) {
                              var23 = 1;
                              var1.tune_value_a = (float)Double.parseDouble(var22);
                              var1.tune = true;
                           } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("shortthreshold")) {
                              float var25;
                              float var92;
                              try (Scanner var104 = new Scanner(var22)) {
                                 var92 = var104.nextFloat();
                                 if (!var104.hasNext()) {
                                    var25 = var92;
                                 } else {
                                    var104.nextByte();
                                    var25 = var104.nextFloat();
                                 }
                              }

                              var23 = 1;
                              var1.internal_flags.nsPsy.attackthre = var92;
                              var1.internal_flags.nsPsy.attackthre_s = var25;
                           } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("maskingadjust")) {
                              var23 = 1;
                              var1.maskingadjust = (float)Double.parseDouble(var22);
                           } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("maskingadjustshort")) {
                              var23 = 1;
                              var1.maskingadjust_short = (float)Double.parseDouble(var22);
                           } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("athcurve")) {
                              var23 = 1;
                              var1.ATHcurve = (float)Double.parseDouble(var22);
                           } else if (!INTERNAL_OPTS || !var19.substring(var20).equalsIgnoreCase("no-preset-tune")) {
                              if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("substep")) {
                                 var23 = 1;
                                 var1.internal_flags.substep_shaping = Integer.valueOf(var22);
                              } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("sbgain")) {
                                 var23 = 1;
                                 var1.internal_flags.subblock_gain = Integer.valueOf(var22);
                              } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("sfscale")) {
                                 var1.internal_flags.noise_shaping = 2;
                              } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("noath")) {
                                 var1.noATH = true;
                              } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("athonly")) {
                                 var1.ATHonly = true;
                              } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("athshort")) {
                                 var1.ATHshort = true;
                              } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("athlower")) {
                                 var23 = 1;
                                 var1.ATHlower = -((float)Double.parseDouble(var22)) / 10.0F;
                              } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("athtype")) {
                                 var23 = 1;
                                 var1.ATHtype = Integer.valueOf(var22);
                              } else if (INTERNAL_OPTS && var19.substring(var20).equalsIgnoreCase("athaa-type")) {
                                 var23 = 1;
                                 var1.athaa_type = Integer.valueOf(var22);
                              } else {
                                 if (!var19.substring(var20).equalsIgnoreCase("athaa-sensitivity")) {
                                    System.err.printf("%s: unrecognized option --%s\n", "lame", var19);
                                    return -1;
                                 }

                                 var23 = 1;
                                 var1.athaa_sensitivity = (float)Double.parseDouble(var22);
                              }
                           }
                        }
                     }
                  }
               }

               var17 += var23;
            }
         } else if (var11) {
            if (var6 == null || var14 >= var6.num_nogap) {
               System.err
                  .printf(
                     "Error: 'nogap option'.  Calling program does not allow nogap option, or\nyou have exceeded maximum number of input files for the nogap option\n"
                  );
               var6.num_nogap = -1;
               return -1;
            }

            var5[var14++] = (String)var2.get(var17);
            var7 = true;
         } else if (var3.length() == 0) {
            var3.setLength(0);
            var3.append((String)var2.get(var17));
            var7 = true;
         } else {
            if (var4.length() != 0) {
               System.err.printf("%s: excess arg %s\n", "lame", var2.get(var17));
               return -1;
            }

            var4.setLength(0);
            var4.append((String)var2.get(var17));
         }
      }

      if (!var7) {
         System.out.println(this.version.getVersion());
         System.out.println();
         this.usage.print(System.out);
         return -1;
      }

      if (var3.toString().charAt(0) == '-') {
         this.silent = this.silent <= 1 ? 1 : this.silent;
      }

      if (var4.length() == 0 && var14 == 0) {
         var4.setLength(0);
         var4.append(var3.substring(0, var3.length() - 4));
         if (var1.decode_only) {
            var4.append(".mp3.wav");
         } else {
            var4.append(".mp3");
         }
      }

      if (!var15) {
         var1.setFindReplayGain(true);
      }

      if (var11 && var1.bWriteVbrTag && !var12) {
         System.out.println("Note: Disabling VBR Xing/Info tag since it interferes with --nogap\n");
         var1.bWriteVbrTag = false;
      }

      if (var4.toString().charAt(0) == '-') {
         var1.bWriteVbrTag = false;
      }

      if (this.getInputFormat() == GetAudio.SoundFileFormat.sf_unknown) {
         this.setInputFormat(this.filename_to_type(var3.toString()));
      }

      if (this.getInputFormat() == GetAudio.SoundFileFormat.sf_ogg) {
         System.err.printf("sorry, vorbis support in LAME is deprecated.\n");
         return -1;
      }

      if (var8) {
         var1.setInNumChannels(2);
      } else if (MPEGMode.MONO == var1.getMode()) {
         var1.setInNumChannels(1);
      } else {
         var1.setInNumChannels(2);
      }

      if (!var1.free_format || var1.getBitRate() >= 8 && var1.getBitRate() <= 640) {
         if (var6 != null) {
            var6.num_nogap = var14;
         }

         return 0;
      } else {
         System.err.printf("For free format, specify a bitrate between 8 and 640 kbps\n");
         System.err.printf("with the -b <bitrate> option\n");
         return -1;
      }
   }

   private enum ID3TAG_MODE {
      ID3TAG_MODE_DEFAULT,
      ID3TAG_MODE_V1_ONLY,
      ID3TAG_MODE_V2_ONLY;
   }

   public static class NoGap {
      int num_nogap;
   }

   private enum TextEncoding {
      TENC_RAW,
      TENC_LATIN1,
      TENC_UCS2;
   }
}
