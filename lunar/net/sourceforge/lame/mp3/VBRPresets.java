package net.sourceforge.lame.mp3;

class VBRPresets {
   int vbr_q;
   int quant_comp;
   int quant_comp_s;
   int expY;
   float st_lrm;
   float st_s;
   float masking_adj;
   float masking_adj_short;
   float ath_lower;
   float ath_curve;
   float ath_sensitivity;
   float interch;
   int safejoint;
   int sfb21mod;
   float msfix;

   public VBRPresets(
      int var1,
      int var2,
      int var3,
      int var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13,
      int var14,
      float var15
   ) {
      this.vbr_q = var1;
      this.quant_comp = var2;
      this.quant_comp_s = var3;
      this.expY = var4;
      this.st_lrm = var5;
      this.st_s = var6;
      this.masking_adj = var7;
      this.masking_adj_short = var8;
      this.ath_lower = var9;
      this.ath_curve = var10;
      this.ath_sensitivity = var11;
      this.interch = var12;
      this.safejoint = var13;
      this.sfb21mod = var14;
      this.msfix = var15;
   }
}
