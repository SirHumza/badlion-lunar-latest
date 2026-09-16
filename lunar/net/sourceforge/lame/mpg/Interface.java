package net.sourceforge.lame.mpg;

import java.util.ArrayList;
import net.sourceforge.lame.mp3.VBRTag;
import net.sourceforge.lame.mp3.VBRTagData;

public class Interface {
   public static final int XING_HEADER_SIZE = 194;
   protected Decode decode = new Decode();
   private VBRTag vbr;
   private Common common = new Common();
   private Layer1 layer1 = new Layer1(this.common, this.decode);
   private Layer2 layer2 = new Layer2(this.common);
   private Layer3 layer3 = new Layer3(this.common);

   public void setModules(VBRTag var1) {
      this.vbr = var1;
   }

   MPGLib.mpstr_tag InitMP3() {
      MPGLib.mpstr_tag var1 = new MPGLib.mpstr_tag();
      var1.framesize = 0;
      var1.num_frames = 0;
      var1.enc_delay = -1;
      var1.enc_padding = -1;
      var1.vbr_header = false;
      var1.header_parsed = false;
      var1.side_parsed = false;
      var1.data_parsed = false;
      var1.free_format = false;
      var1.old_free_format = false;
      var1.ssize = 0;
      var1.dsize = 0;
      var1.fsizeold = -1;
      var1.bsize = 0;
      var1.list = new ArrayList<>();
      var1.fr.single = -1;
      var1.bsnum = 0;
      var1.wordpointer = var1.bsspace[var1.bsnum];
      var1.wordpointerPos = 512;
      var1.bitindex = 0;
      var1.synth_bo = 1;
      var1.sync_bitstream = true;
      this.layer3.init_layer3(32);
      this.layer2.init_layer2();
      return var1;
   }

   void ExitMP3(MPGLib.mpstr_tag var1) {
      var1.list.clear();
   }

   MPGLib.buf addbuf(MPGLib.mpstr_tag var1, byte[] var2, int var3, int var4) {
      MPGLib.buf var5 = new MPGLib.buf();
      var5.pnt = new byte[var4];
      var5.size = var4;
      System.arraycopy(var2, var3, var5.pnt, 0, var4);
      var5.pos = 0;
      var1.list.add(var5);
      var1.bsize += var4;
      return var5;
   }

   void remove_buf(MPGLib.mpstr_tag var1) {
      var1.list.remove(0);
   }

   int read_buf_byte(MPGLib.mpstr_tag var1) {
      int var3;
      for (var3 = var1.list.get(0).pos; var3 >= var1.list.get(0).size; var3 = var1.list.get(0).pos) {
         this.remove_buf(var1);
         if (null == var1.list.get(0)) {
            throw new RuntimeException("hip: Fatal error! tried to read past mp buffer");
         }
      }

      int var2 = var1.list.get(0).pnt[var3] & 255;
      var1.bsize--;
      var1.list.get(0).pos++;
      return var2;
   }

   void read_head(MPGLib.mpstr_tag var1) {
      long var2 = this.read_buf_byte(var1);
      var2 <<= 8;
      var2 |= this.read_buf_byte(var1);
      var2 <<= 8;
      var2 |= this.read_buf_byte(var1);
      var2 <<= 8;
      var2 |= this.read_buf_byte(var1);
      var1.header = var2;
   }

   void copy_mp(MPGLib.mpstr_tag var1, int var2, byte[] var3, int var4) {
      int var5 = 0;

      while (var5 < var2 && var1.list.get(0) != null) {
         int var7 = var1.list.get(0).size - var1.list.get(0).pos;
         int var6;
         if (var2 - var5 <= var7) {
            var6 = var2 - var5;
         } else {
            var6 = var7;
         }

         System.arraycopy(var1.list.get(0).pnt, var1.list.get(0).pos, var3, var4 + var5, var6);
         var5 += var6;
         var1.list.get(0).pos += var6;
         var1.bsize -= var6;
         if (var1.list.get(0).pos == var1.list.get(0).size) {
            this.remove_buf(var1);
         }
      }
   }

   int check_vbr_header(MPGLib.mpstr_tag var1, int var2) {
      int var5 = 0;
      MPGLib.buf var6 = var1.list.get(var5);
      byte[] var7 = new byte[194];
      int var4 = var6.pos;

      for (int var3 = 0; var3 < var2; var3++) {
         while (var4 >= var6.size) {
            if (++var5 == var1.list.size()) {
               return -1;
            }

            var6 = var1.list.get(var5);
            var4 = var6.pos;
         }

         var4++;
      }

      for (int var9 = 0; var9 < 194; var9++) {
         while (var4 >= var6.size) {
            if (++var5 == var1.list.size()) {
               return -1;
            }

            var6 = var1.list.get(var5);
            var4 = var6.pos;
         }

         var7[var9] = var6.pnt[var4];
         var4++;
      }

      VBRTagData var8 = this.vbr.getVbrTag(var7);
      var1.vbr_header = var8 != null;
      if (var1.vbr_header) {
         var1.num_frames = var8.frames;
         var1.enc_delay = var8.encDelay;
         var1.enc_padding = var8.encPadding;
         return var8.headersize < 1 ? 1 : var8.headersize;
      } else {
         return 0;
      }
   }

   int sync_buffer(MPGLib.mpstr_tag var1, boolean var2) {
      int[] var3 = new int[]{0, 0, 0, 0};
      int var7 = 0;
      if (var1.list.size() == 0) {
         return -1;
      }

      MPGLib.buf var8 = var1.list.get(var7);
      int var5 = var8.pos;

      for (int var4 = 0; var4 < var1.bsize; var4++) {
         var3[0] = var3[1];
         var3[1] = var3[2];

         for (var3[2] = var3[3]; var5 >= var8.size; var5 = var8.pos) {
            var8 = var1.list.get(++var7);
         }

         var3[3] = var8.pnt[var5] & 255;
         var5++;
         if (var4 >= 3) {
            Frame var9 = var1.fr;
            long var10 = var3[0];
            var10 <<= 8;
            var10 |= var3[1];
            var10 <<= 8;
            var10 |= var3[2];
            var10 <<= 8;
            var10 |= var3[3];
            boolean var6 = this.common.head_check(var10, var9.lay);
            if (var6 && var2) {
               byte var15;
               boolean var16;
               if ((var10 & 1048576L) != 0L) {
                  var15 = (byte)((var10 & 524288L) != 0L ? 0 : 1);
                  var16 = false;
               } else {
                  var15 = 1;
                  var16 = true;
               }

               int var12 = (int)(var10 >> 6 & 3L);
               int var13 = var12 == 3 ? 1 : 2;
               int var14;
               if (var16) {
                  var14 = (int)(6L + (var10 >> 10 & 3L));
               } else {
                  var14 = (int)((var10 >> 10 & 3L) + var15 * 3);
               }

               var6 = var13 == var9.stereo && var15 == var9.lsf && var16 == var9.mpeg25 && var14 == var9.sampling_frequency;
            }

            if (var6) {
               return var4 - 3;
            }
         }
      }

      return -1;
   }

   int audiodata_precedesframes(MPGLib.mpstr_tag var1) {
      return var1.fr.lay == 3 ? this.layer3.layer3_audiodata_precedesframes(var1) : 0;
   }

   int decodeMP3_clipchoice(MPGLib.mpstr_tag var1, byte[] var2, int var3, int var4, float[] var5, MPGLib.ProcessedBytes var6, Interface.ISynth var7) {
      if (var2 != null && var4 != 0 && this.addbuf(var1, var2, var3, var4) == null) {
         return -1;
      }

      if (!var1.header_parsed) {
         int var11;
         if (var1.fsizeold != -1 && !var1.sync_bitstream) {
            var11 = this.sync_buffer(var1, true);
         } else {
            var1.sync_bitstream = false;
            var11 = this.sync_buffer(var1, false);
            if (var1.bsize < var11 + 194) {
               return 1;
            }

            int var12 = this.check_vbr_header(var1, var11);
            if (var1.vbr_header) {
               if (var11 + var12 > var1.bsize) {
                  return 1;
               }

               for (int var8 = 0; var8 < var12 + var11; var8++) {
                  this.read_buf_byte(var1);
               }

               return 1;
            }
         }

         if (var11 < 0) {
            return 1;
         }

         if (var11 > 0) {
            System.err.printf("hip: bitstream problem, resyncing skipping %d bytes...\n", var11);
            var1.old_free_format = false;
            var1.sync_bitstream = true;
            int var16 = var1.wordpointerPos - 512;
            if (var16 > 2880) {
               System.err.printf("hip: wordpointer trashed.  size=%i (%i)  bytes=%i \n", var16, 2880, var11);
               var16 = 0;
               var1.wordpointer = var1.bsspace[var1.bsnum];
               var1.wordpointerPos = 512;
            }

            for (int var13 = var16 + var11 - 2880; var13 > 0; var13--) {
               var11--;
               this.read_buf_byte(var1);
            }

            this.copy_mp(var1, var11, var1.wordpointer, var1.wordpointerPos);
            var1.fsizeold += var11;
         }

         this.read_head(var1);
         this.common.decode_header(var1.fr, var1.header);
         var1.header_parsed = true;
         var1.framesize = var1.fr.framesize;
         var1.free_format = var1.framesize == 0;
         if (var1.fr.lsf != 0) {
            var1.ssize = var1.fr.stereo == 1 ? 9 : 17;
         } else {
            var1.ssize = var1.fr.stereo == 1 ? 17 : 32;
         }

         if (var1.fr.error_protection) {
            var1.ssize += 2;
         }

         var1.bsnum = 1 - var1.bsnum;
         var1.wordpointer = var1.bsspace[var1.bsnum];
         var1.wordpointerPos = 512;
         var1.bitindex = 0;
         if (var1.fsizeold == -1) {
            return 1;
         }
      }

      if (!var1.side_parsed) {
         if (var1.fr.lay == 3) {
            if (var1.bsize < var1.ssize) {
               return 1;
            }

            this.copy_mp(var1, var1.ssize, var1.wordpointer, var1.wordpointerPos);
            if (var1.fr.error_protection) {
               this.common.getbits(var1, 16);
            }

            int var10 = this.layer3.do_layer3_sideinfo(var1);
            if (var10 < 0) {
               var10 = 0;
            }

            var1.dsize = (var10 + 7) / 8;
         } else {
            if (var1.fr.framesize > var1.bsize) {
               return 1;
            }

            var1.dsize = var1.fr.framesize;
            var1.ssize = 0;
         }

         var1.side_parsed = true;
      }

      byte var9 = 1;
      if (!var1.data_parsed) {
         if (var1.dsize > var1.bsize) {
            return 1;
         }

         this.copy_mp(var1, var1.dsize, var1.wordpointer, var1.wordpointerPos);
         var6.pb = 0;
         switch (var1.fr.lay) {
            case 1:
               if (var1.fr.error_protection) {
                  this.common.getbits(var1, 16);
               }

               this.layer1.do_layer1(var1, var5, var6);
               break;
            case 2:
               if (var1.fr.error_protection) {
                  this.common.getbits(var1, 16);
               }

               this.layer2.do_layer2(var1, var5, var6, var7);
               break;
            case 3:
               this.layer3.do_layer3(var1, var5, var6, var7);
               break;
            default:
               System.err.printf("hip: invalid layer %d\n", var1.fr.lay);
         }

         var1.wordpointer = var1.bsspace[var1.bsnum];
         var1.wordpointerPos = 512 + var1.ssize + var1.dsize;
         var1.data_parsed = true;
         var9 = 0;
      }

      if (var1.free_format) {
         if (var1.old_free_format) {
            var1.framesize = var1.fsizeold_nopadding + var1.fr.padding;
         } else {
            int var14 = this.sync_buffer(var1, true);
            if (var14 < 0) {
               return var9;
            }

            var1.framesize = var14 + var1.ssize + var1.dsize;
            var1.fsizeold_nopadding = var1.framesize - var1.fr.padding;
         }
      }

      int var15 = var1.framesize - (var1.ssize + var1.dsize);
      if (var15 > var1.bsize) {
         return var9;
      }

      if (var15 > 0) {
         this.copy_mp(var1, var15, var1.wordpointer, var1.wordpointerPos);
         var1.wordpointerPos += var15;
         int var17 = var1.wordpointerPos - 512;
         if (var17 > 2880) {
            System.err.printf("hip: fatal error.  MAXFRAMESIZE not large enough.\n");
         }
      }

      var1.fsizeold = var1.framesize;
      var1.old_free_format = var1.free_format;
      var1.framesize = 0;
      var1.header_parsed = false;
      var1.side_parsed = false;
      var1.data_parsed = false;
      return var9;
   }

   int decodeMP3(MPGLib.mpstr_tag var1, byte[] var2, int var3, int var4, float[] var5, int var6, MPGLib.ProcessedBytes var7) {
      if (var6 < 2304) {
         System.err.printf("hip: Insufficient memory for decoding buffer %d\n", var6);
         return -1;
      } else {
         Interface.ISynth var8 = new Interface.ISynth() {
            @Override
            public int synth_1to1_mono_ptr(MPGLib.mpstr_tag var1, float[] var2x, int var3x, float[] var4x, MPGLib.ProcessedBytes var5x) {
               return Interface.this.decode.synth1to1mono(var1, var2x, var3x, var4x, var5x);
            }

            @Override
            public int synth_1to1_ptr(MPGLib.mpstr_tag var1, float[] var2x, int var3x, int var4x, float[] var5x, MPGLib.ProcessedBytes var6x) {
               return Interface.this.decode.synth_1to1(var1, var2x, var3x, var4x, var5x, var6x);
            }
         };
         return this.decodeMP3_clipchoice(var1, var2, var3, var4, var5, var7, var8);
      }
   }

   int decodeMP3_unclipped(MPGLib.mpstr_tag var1, byte[] var2, int var3, int var4, float[] var5, int var6, MPGLib.ProcessedBytes var7) {
      if (var6 < 2304) {
         System.err.printf("hip: out space too small for unclipped mode\n");
         return -1;
      } else {
         Interface.ISynth var8 = new Interface.ISynth() {
            @Override
            public int synth_1to1_mono_ptr(MPGLib.mpstr_tag var1, float[] var2x, int var3x, float[] var4x, MPGLib.ProcessedBytes var5x) {
               Interface.this.decode.synth1to1monoUnclipped(var1, var2x, var3x, var4x, var5x);
               return 0;
            }

            @Override
            public int synth_1to1_ptr(MPGLib.mpstr_tag var1, float[] var2x, int var3x, int var4x, float[] var5x, MPGLib.ProcessedBytes var6x) {
               Interface.this.decode.synth_1to1_unclipped(var1, var2x, var3x, var4x, var5x, var6x);
               return 0;
            }
         };
         return this.decodeMP3_clipchoice(var1, var2, var3, var4, var5, var7, var8);
      }
   }

   interface ISynth {
      int synth_1to1_mono_ptr(MPGLib.mpstr_tag var1, float[] var2, int var3, float[] var4, MPGLib.ProcessedBytes var5);

      int synth_1to1_ptr(MPGLib.mpstr_tag var1, float[] var2, int var3, int var4, float[] var5, MPGLib.ProcessedBytes var6);
   }
}
