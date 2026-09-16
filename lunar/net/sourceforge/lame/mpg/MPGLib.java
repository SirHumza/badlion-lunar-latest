package net.sourceforge.lame.mpg;

import java.util.List;
import net.sourceforge.lame.mp3.FrameSkip;
import net.sourceforge.lame.mp3.MP3Data;
import net.sourceforge.lame.mp3.PlottingData;

public class MPGLib {
   public static final int MP3_ERR = -1;
   public static final int MP3_OK = 0;
   static final int MP3_NEED_MORE = 1;
   private static final int[][] smpls = new int[][]{{0, 384, 1152, 1152}, {0, 384, 1152, 576}};
   private static final int OUTSIZE_CLIPPED = 4096;
   private static final int OUTSIZE_UNCLIPPED = 2304;
   Interface interf;

   public void setModules(Interface var1) {
      this.interf = var1;
   }

   protected void COPY_MONO(float[] var1, int var2, int var3, float[] var4) {
      int var5 = 0;

      for (int var6 = 0; var6 < var3; var6++) {
         var1[var2++] = var4[var5++];
      }
   }

   protected void COPY_STEREO(float[] var1, int var2, float[] var3, int var4, int var5, float[] var6) {
      int var7 = 0;

      for (int var8 = 0; var8 < var5; var8++) {
         var1[var2++] = var6[var7++];
         var3[var4++] = var6[var7++];
      }
   }

   private int decode1_headersB_clipchoice(
      MPGLib.mpstr_tag var1,
      byte[] var2,
      int var3,
      int var4,
      float[] var5,
      int var6,
      float[] var7,
      int var8,
      MP3Data var9,
      FrameSkip var10,
      float[] var11,
      int var12,
      MPGLib.IDecoder var13
   ) {
      var9.header_parsed = false;
      MPGLib.ProcessedBytes var14 = new MPGLib.ProcessedBytes();
      int var15 = var13.decode(var1, var2, var3, var4, var11, var12, var14);
      int var16 = var14.pb;
      if (var1.header_parsed || var1.fsizeold > 0 || var1.framesize > 0) {
         var9.header_parsed = true;
         var9.stereo = var1.fr.stereo;
         var9.samplerate = Common.freqs[var1.fr.sampling_frequency];
         var9.mode = var1.fr.mode;
         var9.mode_ext = var1.fr.mode_ext;
         var9.setFrameSize(smpls[var1.fr.lsf][var1.fr.lay]);
         if (var1.fsizeold > 0) {
            var9.bitrate = (int)(8 * (4 + var1.fsizeold) * var9.samplerate / (1000.0 * var9.getFrameSize()) + 0.5);
         } else if (var1.framesize > 0) {
            var9.bitrate = (int)(8 * (4 + var1.framesize) * var9.samplerate / (1000.0 * var9.getFrameSize()) + 0.5);
         } else {
            var9.bitrate = Common.tabsel_123[var1.fr.lsf][var1.fr.lay - 1][var1.fr.bitrate_index];
         }

         if (var1.num_frames > 0) {
            var9.setTotalFrames(var1.num_frames);
            var9.setNumSamples(var9.getFrameSize() * var1.num_frames);
            var10.setEncoderDelay(var1.enc_delay);
            var10.setEncoderPadding(var1.enc_padding);
         }
      }

      byte var17;
      switch (var15) {
         case -1:
            var17 = -1;
            break;
         case 0:
            switch (var1.fr.stereo) {
               case 1:
                  this.COPY_MONO(var5, var6, var16, var11);
                  return var16;
               case 2:
                  var16 >>= 1;
                  this.COPY_STEREO(var5, var6, var7, var8, var16, var11);
                  return var16;
               default:
                  var17 = -1;
                  assert false;
                  return var17;
            }
         case 1:
            var17 = 0;
            break;
         default:
            var17 = -1;
            assert false;
      }

      return var17;
   }

   public MPGLib.mpstr_tag hip_decode_init() {
      return this.interf.InitMP3();
   }

   public int hip_decode_exit(MPGLib.mpstr_tag var1) {
      if (var1 != null) {
         this.interf.ExitMP3(var1);
         Object var2 = null;
      }

      return 0;
   }

   public int hip_decode1_unclipped(MPGLib.mpstr_tag var1, byte[] var2, int var3, int var4, float[] var5, float[] var6) {
      MP3Data var7 = new MP3Data();
      FrameSkip var8 = new FrameSkip();
      if (var1 != null) {
         MPGLib.IDecoder var9 = new MPGLib.IDecoder() {
            @Override
            public int decode(MPGLib.mpstr_tag var1, byte[] var2x, int var3x, int var4x, float[] var5x, int var6x, MPGLib.ProcessedBytes var7x) {
               return MPGLib.this.interf.decodeMP3_unclipped(var1, var2x, var3x, var4x, var5x, var6x, var7x);
            }
         };
         float[] var10 = new float[2304];
         return this.decode1_headersB_clipchoice(var1, var2, var3, var4, var5, 0, var6, 0, var7, var8, var10, 2304, var9);
      } else {
         return 0;
      }
   }

   public int hip_decode1_headers(MPGLib.mpstr_tag var1, byte[] var2, int var3, float[] var4, float[] var5, MP3Data var6, FrameSkip var7) {
      if (var1 != null) {
         MPGLib.IDecoder var8 = new MPGLib.IDecoder() {
            @Override
            public int decode(MPGLib.mpstr_tag var1, byte[] var2x, int var3x, int var4x, float[] var5x, int var6x, MPGLib.ProcessedBytes var7x) {
               return MPGLib.this.interf.decodeMP3(var1, var2x, var3x, var4x, var5x, var6x, var7x);
            }
         };
         float[] var9 = new float[4096];
         return this.decode1_headersB_clipchoice(var1, var2, 0, var3, var4, 0, var5, 0, var6, var7, var9, 4096, var8);
      } else {
         return -1;
      }
   }

   void hip_set_pinfo(MPGLib.mpstr_tag var1, PlottingData var2) {
      if (var1 != null) {
         var1.pinfo = var2;
      }
   }

   interface IDecoder {
      int decode(MPGLib.mpstr_tag var1, byte[] var2, int var3, int var4, float[] var5, int var6, MPGLib.ProcessedBytes var7);
   }

   static class ProcessedBytes {
      int pb;
   }

   public static class buf {
      byte[] pnt;
      int size;
      int pos;
   }

   public static class mpstr_tag {
      List<MPGLib.buf> list;
      boolean vbr_header;
      int num_frames;
      int enc_delay;
      int enc_padding;
      boolean header_parsed;
      boolean side_parsed;
      boolean data_parsed;
      boolean free_format;
      boolean old_free_format;
      int bsize;
      int framesize;
      int ssize;
      int dsize;
      int fsizeold;
      int fsizeold_nopadding;
      Frame fr = new Frame();
      byte[][] bsspace = new byte[2][3904];
      float[][][] hybrid_block = new float[2][2][576];
      int[] hybrid_blc = new int[2];
      long header;
      int bsnum;
      float[][][] synth_buffs = new float[2][2][272];
      int synth_bo;
      boolean sync_bitstream;
      int bitindex;
      byte[] wordpointer;
      int wordpointerPos;
      PlottingData pinfo;
   }
}
