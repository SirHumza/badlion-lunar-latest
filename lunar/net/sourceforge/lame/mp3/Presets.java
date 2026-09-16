package net.sourceforge.lame.mp3;

public class Presets {
   private static final VBRPresets[] vbr_old_switch_map = new VBRPresets[]{
      new VBRPresets(0, 9, 9, 0, 5.2F, 125.0F, -4.2F, -6.3F, 4.8F, 1.0F, 0.0F, 0.0F, 2, 21, 0.97F),
      new VBRPresets(1, 9, 9, 0, 5.3F, 125.0F, -3.6F, -5.6F, 4.5F, 1.5F, 0.0F, 0.0F, 2, 21, 1.35F),
      new VBRPresets(2, 9, 9, 0, 5.6F, 125.0F, -2.2F, -3.5F, 2.8F, 2.0F, 0.0F, 0.0F, 2, 21, 1.49F),
      new VBRPresets(3, 9, 9, 1, 5.8F, 130.0F, -1.8F, -2.8F, 2.6F, 3.0F, -4.0F, 0.0F, 2, 20, 1.64F),
      new VBRPresets(4, 9, 9, 1, 6.0F, 135.0F, -0.7F, -1.1F, 1.1F, 3.5F, -8.0F, 0.0F, 2, 0, 1.79F),
      new VBRPresets(5, 9, 9, 1, 6.4F, 140.0F, 0.5F, 0.4F, -7.5F, 4.0F, -12.0F, 2.0E-4F, 0, 0, 1.95F),
      new VBRPresets(6, 9, 9, 1, 6.6F, 145.0F, 0.67F, 0.65F, -14.7F, 6.5F, -19.0F, 4.0E-4F, 0, 0, 2.3F),
      new VBRPresets(7, 9, 9, 1, 6.6F, 145.0F, 0.8F, 0.75F, -19.7F, 8.0F, -22.0F, 6.0E-4F, 0, 0, 2.7F),
      new VBRPresets(8, 9, 9, 1, 6.6F, 145.0F, 1.2F, 1.15F, -27.5F, 10.0F, -23.0F, 7.0E-4F, 0, 0, 0.0F),
      new VBRPresets(9, 9, 9, 1, 6.6F, 145.0F, 1.6F, 1.6F, -36.0F, 11.0F, -25.0F, 8.0E-4F, 0, 0, 0.0F),
      new VBRPresets(10, 9, 9, 1, 6.6F, 145.0F, 2.0F, 2.0F, -36.0F, 12.0F, -25.0F, 8.0E-4F, 0, 0, 0.0F)
   };
   private static final VBRPresets[] vbr_psy_switch_map = new VBRPresets[]{
      new VBRPresets(0, 9, 9, 0, 4.2F, 25.0F, -7.0F, -4.0F, 7.5F, 1.0F, 0.0F, 0.0F, 2, 26, 0.97F),
      new VBRPresets(1, 9, 9, 0, 4.2F, 25.0F, -5.6F, -3.6F, 4.5F, 1.5F, 0.0F, 0.0F, 2, 21, 1.35F),
      new VBRPresets(2, 9, 9, 0, 4.2F, 25.0F, -4.4F, -1.8F, 2.0F, 2.0F, 0.0F, 0.0F, 2, 18, 1.49F),
      new VBRPresets(3, 9, 9, 1, 4.2F, 25.0F, -3.4F, -1.25F, 1.1F, 3.0F, -4.0F, 0.0F, 2, 15, 1.64F),
      new VBRPresets(4, 9, 9, 1, 4.2F, 25.0F, -2.2F, 0.1F, 0.0F, 3.5F, -8.0F, 0.0F, 2, 0, 1.79F),
      new VBRPresets(5, 9, 9, 1, 4.2F, 25.0F, -1.0F, 1.65F, -7.7F, 4.0F, -12.0F, 2.0E-4F, 0, 0, 1.95F),
      new VBRPresets(6, 9, 9, 1, 4.2F, 25.0F, -0.0F, 2.47F, -7.7F, 6.5F, -19.0F, 4.0E-4F, 0, 0, 2.0F),
      new VBRPresets(7, 9, 9, 1, 4.2F, 25.0F, 0.5F, 2.0F, -14.5F, 8.0F, -22.0F, 6.0E-4F, 0, 0, 2.0F),
      new VBRPresets(8, 9, 9, 1, 4.2F, 25.0F, 1.0F, 2.4F, -22.0F, 10.0F, -23.0F, 7.0E-4F, 0, 0, 2.0F),
      new VBRPresets(9, 9, 9, 1, 4.2F, 25.0F, 1.5F, 2.95F, -30.0F, 11.0F, -25.0F, 8.0E-4F, 0, 0, 2.0F),
      new VBRPresets(10, 9, 9, 1, 4.2F, 25.0F, 2.0F, 2.95F, -36.0F, 12.0F, -30.0F, 8.0E-4F, 0, 0, 2.0F)
   };
   private static final ABRPresets[] abr_switch_map = new ABRPresets[]{
      new ABRPresets(8, 9, 9, 0, 0.0F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, -30.0F, 11.0F, 0.0012F, 1),
      new ABRPresets(16, 9, 9, 0, 0.0F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, -25.0F, 11.0F, 0.001F, 1),
      new ABRPresets(24, 9, 9, 0, 0.0F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, -20.0F, 11.0F, 0.001F, 1),
      new ABRPresets(32, 9, 9, 0, 0.0F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, -15.0F, 11.0F, 0.001F, 1),
      new ABRPresets(40, 9, 9, 0, 0.0F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, -10.0F, 11.0F, 9.0E-4F, 1),
      new ABRPresets(48, 9, 9, 0, 0.0F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, -10.0F, 11.0F, 9.0E-4F, 1),
      new ABRPresets(56, 9, 9, 0, 0.0F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, -6.0F, 11.0F, 8.0E-4F, 1),
      new ABRPresets(64, 9, 9, 0, 0.0F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, -2.0F, 11.0F, 8.0E-4F, 1),
      new ABRPresets(80, 9, 9, 0, 0.0F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, 0.0F, 8.0F, 7.0E-4F, 1),
      new ABRPresets(96, 9, 9, 0, 2.5F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, 1.0F, 5.5F, 6.0E-4F, 1),
      new ABRPresets(112, 9, 9, 0, 2.25F, 6.6F, 145.0F, 0.0F, 0.95F, 0.0F, 2.0F, 4.5F, 5.0E-4F, 1),
      new ABRPresets(128, 9, 9, 0, 1.95F, 6.4F, 140.0F, 0.0F, 0.95F, 0.0F, 3.0F, 4.0F, 2.0E-4F, 1),
      new ABRPresets(160, 9, 9, 1, 1.79F, 6.0F, 135.0F, 0.0F, 0.95F, -2.0F, 5.0F, 3.5F, 0.0F, 1),
      new ABRPresets(192, 9, 9, 1, 1.49F, 5.6F, 125.0F, 0.0F, 0.97F, -4.0F, 7.0F, 3.0F, 0.0F, 0),
      new ABRPresets(224, 9, 9, 1, 1.25F, 5.2F, 125.0F, 0.0F, 0.98F, -6.0F, 9.0F, 2.0F, 0.0F, 0),
      new ABRPresets(256, 9, 9, 1, 0.97F, 5.2F, 125.0F, 0.0F, 1.0F, -8.0F, 10.0F, 1.0F, 0.0F, 0),
      new ABRPresets(320, 9, 9, 1, 0.9F, 5.2F, 125.0F, 0.0F, 1.0F, -10.0F, 12.0F, 0.0F, 0.0F, 0)
   };
   Lame lame;

   public final void setModules(Lame var1) {
      this.lame = var1;
   }

   private void apply_vbr_preset(LameGlobalFlags var1, int var2, int var3) {
      VBRPresets[] var4 = var1.getVBR() == VbrMode.vbr_rh ? vbr_old_switch_map : vbr_psy_switch_map;
      float var5 = var1.VBR_q_frac;
      VBRPresets var6 = var4[var2];
      VBRPresets var7 = var4[var2 + 1];
      VBRPresets var8 = var6;
      var6.st_lrm = var6.st_lrm + var5 * (var7.st_lrm - var6.st_lrm);
      var6.st_s = var6.st_s + var5 * (var7.st_s - var6.st_s);
      var6.masking_adj = var6.masking_adj + var5 * (var7.masking_adj - var6.masking_adj);
      var6.masking_adj_short = var6.masking_adj_short + var5 * (var7.masking_adj_short - var6.masking_adj_short);
      var6.ath_lower = var6.ath_lower + var5 * (var7.ath_lower - var6.ath_lower);
      var6.ath_curve = var6.ath_curve + var5 * (var7.ath_curve - var6.ath_curve);
      var6.ath_sensitivity = var6.ath_sensitivity + var5 * (var7.ath_sensitivity - var6.ath_sensitivity);
      var6.interch = var6.interch + var5 * (var7.interch - var6.interch);
      var6.msfix = var6.msfix + var5 * (var7.msfix - var6.msfix);
      this.lame_set_VBR_q(var1, var8.vbr_q);
      if (var3 != 0) {
         var1.quant_comp = var8.quant_comp;
      } else if (Math.abs(var1.quant_comp - -1) <= 0) {
         var1.quant_comp = var8.quant_comp;
      }

      if (var3 != 0) {
         var1.quant_comp_short = var8.quant_comp_s;
      } else if (Math.abs(var1.quant_comp_short - -1) <= 0) {
         var1.quant_comp_short = var8.quant_comp_s;
      }

      if (var8.expY != 0) {
         var1.experimentalY = var8.expY != 0;
      }

      if (var3 != 0) {
         var1.internal_flags.nsPsy.attackthre = var8.st_lrm;
      } else if (!(Math.abs(var1.internal_flags.nsPsy.attackthre - -1.0F) > 0.0F)) {
         var1.internal_flags.nsPsy.attackthre = var8.st_lrm;
      }

      if (var3 != 0) {
         var1.internal_flags.nsPsy.attackthre_s = var8.st_s;
      } else if (!(Math.abs(var1.internal_flags.nsPsy.attackthre_s - -1.0F) > 0.0F)) {
         var1.internal_flags.nsPsy.attackthre_s = var8.st_s;
      }

      if (var3 != 0) {
         var1.maskingadjust = var8.masking_adj;
      } else if (!(Math.abs(var1.maskingadjust - 0.0F) > 0.0F)) {
         var1.maskingadjust = var8.masking_adj;
      }

      if (var3 != 0) {
         var1.maskingadjust_short = var8.masking_adj_short;
      } else if (!(Math.abs(var1.maskingadjust_short - 0.0F) > 0.0F)) {
         var1.maskingadjust_short = var8.masking_adj_short;
      }

      if (var3 != 0) {
         var1.ATHlower = -var8.ath_lower / 10.0F;
      } else if (!(Math.abs(-var1.ATHlower * 10.0 - 0.0) > 0.0)) {
         var1.ATHlower = -var8.ath_lower / 10.0F;
      }

      if (var3 != 0) {
         var1.ATHcurve = var8.ath_curve;
      } else if (!(Math.abs(var1.ATHcurve - -1.0F) > 0.0F)) {
         var1.ATHcurve = var8.ath_curve;
      }

      if (var3 != 0) {
         var1.athaa_sensitivity = var8.ath_sensitivity;
      } else if (!(Math.abs(var1.athaa_sensitivity - -1.0F) > 0.0F)) {
         var1.athaa_sensitivity = var8.ath_sensitivity;
      }

      if (var8.interch > 0.0F) {
         if (var3 != 0) {
            var1.interChRatio = var8.interch;
         } else if (!(Math.abs(var1.interChRatio - -1.0F) > 0.0F)) {
            var1.interChRatio = var8.interch;
         }
      }

      if (var8.safejoint > 0) {
         var1.exp_nspsytune = var1.exp_nspsytune | var8.safejoint;
      }

      if (var8.sfb21mod > 0) {
         var1.exp_nspsytune = var1.exp_nspsytune | var8.sfb21mod << 20;
      }

      if (var3 != 0) {
         var1.msfix = var8.msfix;
      } else if (!(Math.abs(var1.msfix - -1.0F) > 0.0F)) {
         var1.msfix = var8.msfix;
      }

      if (var3 == 0) {
         var1.setVBRQuality(var2);
         var1.VBR_q_frac = var5;
      }
   }

   private int apply_abr_preset(LameGlobalFlags var1, int var2, int var3) {
      int var4 = var2;
      int var5 = this.lame.nearestBitrateFullIndex(var2);
      var1.setVBR(VbrMode.vbr_abr);
      var1.VBR_mean_bitrate_kbps = var4;
      var1.VBR_mean_bitrate_kbps = Math.min(var1.VBR_mean_bitrate_kbps, 320);
      var1.VBR_mean_bitrate_kbps = Math.max(var1.VBR_mean_bitrate_kbps, 8);
      var1.setBitRate(var1.VBR_mean_bitrate_kbps);
      if (var1.VBR_mean_bitrate_kbps > 320) {
         var1.disable_reservoir = true;
      }

      if (abr_switch_map[var5].safejoint > 0) {
         var1.exp_nspsytune |= 2;
      }

      if (abr_switch_map[var5].sfscale > 0) {
         var1.internal_flags.noise_shaping = 2;
      }

      if (Math.abs(abr_switch_map[var5].nsbass) > 0.0F) {
         int var6 = (int)(abr_switch_map[var5].nsbass * 4.0F);
         if (var6 < 0) {
            var6 += 64;
         }

         var1.exp_nspsytune |= var6 << 2;
      }

      if (var3 != 0) {
         var1.quant_comp = abr_switch_map[var5].quant_comp;
      } else if (Math.abs(var1.quant_comp - -1) <= 0) {
         var1.quant_comp = abr_switch_map[var5].quant_comp;
      }

      if (var3 != 0) {
         var1.quant_comp_short = abr_switch_map[var5].quant_comp_s;
      } else if (Math.abs(var1.quant_comp_short - -1) <= 0) {
         var1.quant_comp_short = abr_switch_map[var5].quant_comp_s;
      }

      if (var3 != 0) {
         var1.msfix = abr_switch_map[var5].nsmsfix;
      } else if (!(Math.abs(var1.msfix - -1.0F) > 0.0F)) {
         var1.msfix = abr_switch_map[var5].nsmsfix;
      }

      if (var3 != 0) {
         var1.internal_flags.nsPsy.attackthre = abr_switch_map[var5].st_lrm;
      } else if (!(Math.abs(var1.internal_flags.nsPsy.attackthre - -1.0F) > 0.0F)) {
         var1.internal_flags.nsPsy.attackthre = abr_switch_map[var5].st_lrm;
      }

      if (var3 != 0) {
         var1.internal_flags.nsPsy.attackthre_s = abr_switch_map[var5].st_s;
      } else if (!(Math.abs(var1.internal_flags.nsPsy.attackthre_s - -1.0F) > 0.0F)) {
         var1.internal_flags.nsPsy.attackthre_s = abr_switch_map[var5].st_s;
      }

      if (var3 != 0) {
         var1.scale = abr_switch_map[var5].scale;
      } else if (!(Math.abs(var1.scale - -1.0F) > 0.0F)) {
         var1.scale = abr_switch_map[var5].scale;
      }

      if (var3 != 0) {
         var1.maskingadjust = abr_switch_map[var5].masking_adj;
      } else if (!(Math.abs(var1.maskingadjust - 0.0F) > 0.0F)) {
         var1.maskingadjust = abr_switch_map[var5].masking_adj;
      }

      if (abr_switch_map[var5].masking_adj > 0.0F) {
         if (var3 != 0) {
            var1.maskingadjust_short = (float)(abr_switch_map[var5].masking_adj * 0.9);
         } else if (!(Math.abs(var1.maskingadjust_short - 0.0F) > 0.0F)) {
            var1.maskingadjust_short = (float)(abr_switch_map[var5].masking_adj * 0.9);
         }
      } else if (var3 != 0) {
         var1.maskingadjust_short = (float)(abr_switch_map[var5].masking_adj * 1.1);
      } else if (!(Math.abs(var1.maskingadjust_short - 0.0F) > 0.0F)) {
         var1.maskingadjust_short = (float)(abr_switch_map[var5].masking_adj * 1.1);
      }

      if (var3 != 0) {
         var1.ATHlower = -abr_switch_map[var5].ath_lower / 10.0F;
      } else if (!(Math.abs(-var1.ATHlower * 10.0F - 0.0F) > 0.0F)) {
         var1.ATHlower = -abr_switch_map[var5].ath_lower / 10.0F;
      }

      if (var3 != 0) {
         var1.ATHcurve = abr_switch_map[var5].ath_curve;
      } else if (!(Math.abs(var1.ATHcurve - -1.0F) > 0.0F)) {
         var1.ATHcurve = abr_switch_map[var5].ath_curve;
      }

      if (var3 != 0) {
         var1.interChRatio = abr_switch_map[var5].interch;
      } else if (!(Math.abs(var1.interChRatio - -1.0F) > 0.0F)) {
         var1.interChRatio = abr_switch_map[var5].interch;
      }

      return var2;
   }

   public final int apply_preset(LameGlobalFlags var1, int var2, int var3) {
      switch (var2) {
         case 1000:
            var2 = 470;
            var1.setVBR(VbrMode.vbr_mtrh);
            break;
         case 1001:
            var2 = 480;
            var1.setVBR(VbrMode.vbr_rh);
            break;
         case 1002:
            var2 = 500;
            var1.setVBR(VbrMode.vbr_rh);
            break;
         case 1003:
            short var4 = 320;
            var1.preset = var4;
            this.apply_abr_preset(var1, var4, var3);
            var1.setVBR(VbrMode.vbr_off);
            return var4;
         case 1004:
            var2 = 480;
            var1.setVBR(VbrMode.vbr_mtrh);
            break;
         case 1005:
            var2 = 500;
            var1.setVBR(VbrMode.vbr_mtrh);
            break;
         case 1006:
            var2 = 460;
            var1.setVBR(VbrMode.vbr_rh);
            break;
         case 1007:
            var2 = 460;
            var1.setVBR(VbrMode.vbr_mtrh);
      }

      var1.preset = var2;
      switch (var2) {
         case 410:
            this.apply_vbr_preset(var1, 9, var3);
            return var2;
         case 420:
            this.apply_vbr_preset(var1, 8, var3);
            return var2;
         case 430:
            this.apply_vbr_preset(var1, 7, var3);
            return var2;
         case 440:
            this.apply_vbr_preset(var1, 6, var3);
            return var2;
         case 450:
            this.apply_vbr_preset(var1, 5, var3);
            return var2;
         case 460:
            this.apply_vbr_preset(var1, 4, var3);
            return var2;
         case 470:
            this.apply_vbr_preset(var1, 3, var3);
            return var2;
         case 480:
            this.apply_vbr_preset(var1, 2, var3);
            return var2;
         case 490:
            this.apply_vbr_preset(var1, 1, var3);
            return var2;
         case 500:
            this.apply_vbr_preset(var1, 0, var3);
            return var2;
         default:
            if (8 <= var2 && var2 <= 320) {
               return this.apply_abr_preset(var1, var2, var3);
            } else {
               var1.preset = 0;
               return var2;
            }
      }
   }

   public int lame_set_VBR_q(LameGlobalFlags var1, int var2) {
      byte var3 = 0;
      if (0 > var2) {
         var3 = -1;
         var2 = 0;
      }

      if (9 < var2) {
         var3 = -1;
         var2 = 9;
      }

      var1.setVBRQuality(var2);
      var1.VBR_q_frac = 0.0F;
      return var3;
   }
}
