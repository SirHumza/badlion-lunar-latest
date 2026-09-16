package net.sourceforge.lame.mp3;

public class Encoder {
   public static final int ENCDELAY = 576;
   public static final int POSTDELAY = 1152;
   public static final int MDCTDELAY = 48;
   public static final int FFTOFFSET = 272;
   public static final int DECDELAY = 528;
   public static final int SBLIMIT = 32;
   public static final int CBANDS = 64;
   public static final int SBPSY_l = 21;
   public static final int SBPSY_s = 12;
   public static final int SBMAX_l = 22;
   public static final int SBMAX_s = 13;
   public static final int PSFB21 = 6;
   public static final int PSFB12 = 6;
   public static final int BLKSIZE = 1024;
   public static final int HBLKSIZE = 513;
   public static final int BLKSIZE_s = 256;
   public static final int HBLKSIZE_s = 129;
   public static final int NORM_TYPE = 0;
   public static final int START_TYPE = 1;
   public static final int SHORT_TYPE = 2;
   public static final int STOP_TYPE = 3;
   public static final int MPG_MD_LR_LR = 0;
   public static final int MPG_MD_LR_I = 1;
   public static final int MPG_MD_MS_LR = 2;
   public static final int MPG_MD_MS_I = 3;
   private static final float[] fircoef = new float[]{
      -0.1039435F, -0.18920651F, -0.216236F, -0.155915F, 3.898045E-17F, 0.2338725F, 0.50455F, 0.756825F, 0.93549F
   };
   public PsyModel psy;
   BitStream bs;
   VBRTag vbr;
   QuantizePVT qupvt;
   private NewMDCT newMDCT = new NewMDCT();

   public final void setModules(BitStream var1, PsyModel var2, QuantizePVT var3, VBRTag var4) {
      this.bs = var1;
      this.psy = var2;
      this.vbr = var4;
      this.qupvt = var3;
   }

   private void adjust_ATH(LameInternalFlags var1) {
      if (var1.ATH.useAdjust == 0) {
         var1.ATH.adjust = 1.0F;
      } else {
         float var3 = var1.loudness_sq[0][0];
         float var2 = var1.loudness_sq[1][0];
         if (var1.channels_out == 2) {
            var3 += var1.loudness_sq[0][1];
            var2 += var1.loudness_sq[1][1];
         } else {
            var3 += var3;
            var2 += var2;
         }

         if (var1.mode_gr == 2) {
            var3 = Math.max(var3, var2);
         }

         var3 = (float)(var3 * 0.5);
         var3 *= var1.ATH.aaSensitivityP;
         if (var3 > 0.03125) {
            if (var1.ATH.adjust >= 1.0) {
               var1.ATH.adjust = 1.0F;
            } else if (var1.ATH.adjust < var1.ATH.adjustLimit) {
               var1.ATH.adjust = var1.ATH.adjustLimit;
            }

            var1.ATH.adjustLimit = 1.0F;
         } else {
            float var4 = 31.98F * var3 + 6.25E-4F;
            if (var1.ATH.adjust >= var4) {
               var1.ATH.adjust = (float)(var1.ATH.adjust * (var4 * 0.075 + 0.925));
               if (var1.ATH.adjust < var4) {
                  var1.ATH.adjust = var4;
               }
            } else if (var1.ATH.adjustLimit >= var4) {
               var1.ATH.adjust = var4;
            } else if (var1.ATH.adjust < var1.ATH.adjustLimit) {
               var1.ATH.adjust = var1.ATH.adjustLimit;
            }

            var1.ATH.adjustLimit = var4;
         }
      }
   }

   private void updateStats(LameInternalFlags var1) {
      assert 0 <= var1.bitrate_index && var1.bitrate_index < 16;
      assert 0 <= var1.mode_ext && var1.mode_ext < 4;
      var1.bitrate_stereoMode_Hist[var1.bitrate_index][4]++;
      var1.bitrate_stereoMode_Hist[15][4]++;
      if (var1.channels_out == 2) {
         var1.bitrate_stereoMode_Hist[var1.bitrate_index][var1.mode_ext]++;
         var1.bitrate_stereoMode_Hist[15][var1.mode_ext]++;
      }

      for (int var2 = 0; var2 < var1.mode_gr; var2++) {
         for (int var3 = 0; var3 < var1.channels_out; var3++) {
            int var4 = var1.l3_side.tt[var2][var3].block_type;
            if (var1.l3_side.tt[var2][var3].mixed_block_flag != 0) {
               var4 = 4;
            }

            var1.bitrate_blockType_Hist[var1.bitrate_index][var4]++;
            var1.bitrate_blockType_Hist[var1.bitrate_index][5]++;
            var1.bitrate_blockType_Hist[15][var4]++;
            var1.bitrate_blockType_Hist[15][5]++;
         }
      }
   }

   private void lame_encode_frame_init(LameGlobalFlags var1, float[][] var2) {
      LameInternalFlags var3 = var1.internal_flags;
      if (var3.lame_encode_frame_init == 0) {
         float[] var8 = new float[2014];
         float[] var9 = new float[2014];
         var3.lame_encode_frame_init = 1;
         int var6 = 0;
         int var7 = 0;

         while (var6 < 286 + 576 * (1 + var3.mode_gr)) {
            if (var6 < 576 * var3.mode_gr) {
               var8[var6] = 0.0F;
               if (var3.channels_out == 2) {
                  var9[var6] = 0.0F;
               }
            } else {
               var8[var6] = var2[0][var7];
               if (var3.channels_out == 2) {
                  var9[var6] = var2[1][var7];
               }

               var7++;
            }

            var6++;
         }

         for (int var5 = 0; var5 < var3.mode_gr; var5++) {
            for (int var4 = 0; var4 < var3.channels_out; var4++) {
               var3.l3_side.tt[var5][var4].block_type = 2;
            }
         }

         this.newMDCT.mdct_sub48(var3, var8, var9);
         assert var3.mf_size >= 1024 + var1.getFrameSize() - 272;
         assert var3.mf_size >= 512 + var1.getFrameSize() - 32;
      }
   }

   public final int lame_encode_mp3_frame(LameGlobalFlags var1, float[] var2, float[] var3, byte[] var4, int var5, int var6) {
      III_psy_ratio[][] var8 = new III_psy_ratio[2][2];
      var8[0][0] = new III_psy_ratio();
      var8[0][1] = new III_psy_ratio();
      var8[1][0] = new III_psy_ratio();
      var8[1][1] = new III_psy_ratio();
      III_psy_ratio[][] var9 = new III_psy_ratio[2][2];
      var9[0][0] = new III_psy_ratio();
      var9[0][1] = new III_psy_ratio();
      var9[1][0] = new III_psy_ratio();
      var9[1][1] = new III_psy_ratio();
      float[][] var11 = new float[2][];
      LameInternalFlags var12 = var1.internal_flags;
      float[][] var13 = new float[2][4];
      float[] var14 = new float[]{0.5F, 0.5F};
      float[][] var15 = new float[][]{{0.0F, 0.0F}, {0.0F, 0.0F}};
      float[][] var16 = new float[][]{{0.0F, 0.0F}, {0.0F, 0.0F}};
      var11[0] = var2;
      var11[1] = var3;
      if (var12.lame_encode_frame_init == 0) {
         this.lame_encode_frame_init(var1, var11);
      }

      var12.padding = 0;
      if ((var12.slot_lag = var12.slot_lag - var12.frac_SpF) < 0) {
         var12.slot_lag = var12.slot_lag + var1.getOutSampleRate();
         var12.padding = 1;
      }

      if (var12.psymodel != 0) {
         float[][] var21 = new float[2][];
         int var22 = 0;
         int[] var23 = new int[2];

         for (int var19 = 0; var19 < var12.mode_gr; var19++) {
            for (int var18 = 0; var18 < var12.channels_out; var18++) {
               var21[var18] = var11[var18];
               var22 = 576 + var19 * 576 - 272;
            }

            int var20;
            if (var1.getVBR() != VbrMode.vbr_mtrh && var1.getVBR() != VbrMode.vbr_mt) {
               var20 = this.psy.L3psycho_anal_ns(var1, var21, var22, var19, var8, var9, var15[var19], var16[var19], var13[var19], var23);
            } else {
               var20 = this.psy.L3psycho_anal_vbr(var1, var21, var22, var19, var8, var9, var15[var19], var16[var19], var13[var19], var23);
            }

            if (var20 != 0) {
               return -4;
            }

            if (var1.getMode() == MPEGMode.JOINT_STEREO) {
               var14[var19] = var13[var19][2] + var13[var19][3];
               if (var14[var19] > 0.0F) {
                  var14[var19] = var13[var19][3] / var14[var19];
               }
            }

            for (int var25 = 0; var25 < var12.channels_out; var25++) {
               GrInfo var24 = var12.l3_side.tt[var19][var25];
               var24.block_type = var23[var25];
               var24.mixed_block_flag = 0;
            }
         }
      } else {
         for (int var32 = 0; var32 < var12.mode_gr; var32++) {
            for (int var26 = 0; var26 < var12.channels_out; var26++) {
               var12.l3_side.tt[var32][var26].block_type = 0;
               var12.l3_side.tt[var32][var26].mixed_block_flag = 0;
               var16[var32][var26] = var15[var32][var26] = 700.0F;
            }
         }
      }

      this.adjust_ATH(var12);
      this.newMDCT.mdct_sub48(var12, var11[0], var11[1]);
      var12.mode_ext = 0;
      if (var1.force_ms) {
         var12.mode_ext = 2;
      } else if (var1.getMode() == MPEGMode.JOINT_STEREO) {
         float var37 = 0.0F;
         float var42 = 0.0F;

         for (int var33 = 0; var33 < var12.mode_gr; var33++) {
            for (int var27 = 0; var27 < var12.channels_out; var27++) {
               var37 += var16[var33][var27];
               var42 += var15[var33][var27];
            }
         }

         if (var37 <= 1.0 * var42) {
            GrInfo[] var46 = var12.l3_side.tt[0];
            GrInfo[] var47 = var12.l3_side.tt[var12.mode_gr - 1];
            if (var46[0].block_type == var46[1].block_type && var47[0].block_type == var47[1].block_type) {
               var12.mode_ext = 2;
            }
         }
      }

      III_psy_ratio[][] var10;
      float[][] var17;
      if (var12.mode_ext == 2) {
         var10 = var9;
         var17 = var16;
      } else {
         var10 = var8;
         var17 = var15;
      }

      if (var1.analysis && var12.pinfo != null) {
         for (int var34 = 0; var34 < var12.mode_gr; var34++) {
            for (int var28 = 0; var28 < var12.channels_out; var28++) {
               var12.pinfo.ms_ratio[var34] = var12.ms_ratio[var34];
               var12.pinfo.ms_ener_ratio[var34] = var14[var34];
               var12.pinfo.blocktype[var34][var28] = var12.l3_side.tt[var34][var28].block_type;
               var12.pinfo.pe[var34][var28] = var17[var34][var28];
               System.arraycopy(var12.l3_side.tt[var34][var28].xr, 0, var12.pinfo.xr[var34][var28], 0, 576);
               if (var12.mode_ext == 2) {
                  var12.pinfo.ers[var34][var28] = var12.pinfo.ers[var34][var28 + 2];
                  System.arraycopy(var12.pinfo.energy[var34][var28 + 2], 0, var12.pinfo.energy[var34][var28], 0, var12.pinfo.energy[var34][var28].length);
               }
            }
         }
      }

      if (var1.getVBR() == VbrMode.vbr_off || var1.getVBR() == VbrMode.vbr_abr) {
         for (int var38 = 0; var38 < 18; var38++) {
            var12.nsPsy.pefirbuf[var38] = var12.nsPsy.pefirbuf[var38 + 1];
         }

         float var43 = 0.0F;

         for (int var35 = 0; var35 < var12.mode_gr; var35++) {
            for (int var29 = 0; var29 < var12.channels_out; var29++) {
               var43 += var17[var35][var29];
            }
         }

         var12.nsPsy.pefirbuf[18] = var43;
         var43 = var12.nsPsy.pefirbuf[9];

         for (int var39 = 0; var39 < 9; var39++) {
            var43 += (var12.nsPsy.pefirbuf[var39] + var12.nsPsy.pefirbuf[18 - var39]) * fircoef[var39];
         }

         var43 = 3350 * var12.mode_gr * var12.channels_out / var43;

         for (int var36 = 0; var36 < var12.mode_gr; var36++) {
            for (int var30 = 0; var30 < var12.channels_out; var30++) {
               var17[var36][var30] = var17[var36][var30] * var43;
            }
         }
      }

      var12.iteration_loop.iteration_loop(var1, var17, var14, var10);
      this.bs.format_bitstream(var1);
      int var7 = this.bs.copy_buffer(var12, var4, var5, var6, 1);
      if (var1.bWriteVbrTag) {
         this.vbr.addVbrFrame(var1);
      }

      if (var1.analysis && var12.pinfo != null) {
         for (int var31 = 0; var31 < var12.channels_out; var31++) {
            for (int var40 = 0; var40 < 272; var40++) {
               var12.pinfo.pcmdata[var31][var40] = var12.pinfo.pcmdata[var31][var40 + var1.getFrameSize()];
            }

            for (int var41 = 272; var41 < 1600; var41++) {
               var12.pinfo.pcmdata[var31][var41] = var11[var31][var41 - 272];
            }
         }

         this.qupvt.set_frame_pinfo(var1, var10);
      }

      this.updateStats(var12);
      return var7;
   }
}
