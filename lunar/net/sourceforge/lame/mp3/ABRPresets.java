package net.sourceforge.lame.mp3;

class ABRPresets {
   int quant_comp;
   int quant_comp_s;
   int safejoint;
   float nsmsfix;
   float st_lrm;
   float st_s;
   float nsbass;
   float scale;
   float masking_adj;
   float ath_lower;
   float ath_curve;
   float interch;
   int sfscale;

   public ABRPresets(
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
      float var13,
      int var14
   ) {
      this.quant_comp = var2;
      this.quant_comp_s = var3;
      this.safejoint = var4;
      this.nsmsfix = var5;
      this.st_lrm = var6;
      this.st_s = var7;
      this.nsbass = var8;
      this.scale = var9;
      this.masking_adj = var10;
      this.ath_lower = var11;
      this.ath_curve = var12;
      this.interch = var13;
      this.sfscale = var14;
   }
}
