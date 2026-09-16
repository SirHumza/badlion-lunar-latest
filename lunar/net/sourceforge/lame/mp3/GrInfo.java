package net.sourceforge.lame.mp3;

public final class GrInfo {
   float[] xr = new float[576];
   int[] l3_enc = new int[576];
   int[] scalefac = new int[39];
   float xrpow_max;
   int part2_3_length;
   int big_values;
   int count1;
   int global_gain;
   int scalefac_compress;
   int block_type;
   int mixed_block_flag;
   int[] table_select = new int[3];
   int[] subblock_gain = new int[4];
   int region0_count;
   int region1_count;
   int preflag;
   int scalefac_scale;
   int count1table_select;
   int part2_length;
   int sfb_lmax;
   int sfb_smin;
   int psy_lmax;
   int sfbmax;
   int psymax;
   int sfbdivide;
   int[] width = new int[39];
   int[] window = new int[39];
   int count1bits;
   int[] sfb_partition_table;
   int[] slen = new int[4];
   int max_nonzero_coeff;

   public final void assign(GrInfo var1) {
      this.xr = (float[])var1.xr.clone();
      this.l3_enc = (int[])var1.l3_enc.clone();
      this.scalefac = (int[])var1.scalefac.clone();
      this.xrpow_max = var1.xrpow_max;
      this.part2_3_length = var1.part2_3_length;
      this.big_values = var1.big_values;
      this.count1 = var1.count1;
      this.global_gain = var1.global_gain;
      this.scalefac_compress = var1.scalefac_compress;
      this.block_type = var1.block_type;
      this.mixed_block_flag = var1.mixed_block_flag;
      this.table_select = (int[])var1.table_select.clone();
      this.subblock_gain = (int[])var1.subblock_gain.clone();
      this.region0_count = var1.region0_count;
      this.region1_count = var1.region1_count;
      this.preflag = var1.preflag;
      this.scalefac_scale = var1.scalefac_scale;
      this.count1table_select = var1.count1table_select;
      this.part2_length = var1.part2_length;
      this.sfb_lmax = var1.sfb_lmax;
      this.sfb_smin = var1.sfb_smin;
      this.psy_lmax = var1.psy_lmax;
      this.sfbmax = var1.sfbmax;
      this.psymax = var1.psymax;
      this.sfbdivide = var1.sfbdivide;
      this.width = (int[])var1.width.clone();
      this.window = (int[])var1.window.clone();
      this.count1bits = var1.count1bits;
      this.sfb_partition_table = (int[])var1.sfb_partition_table.clone();
      this.slen = (int[])var1.slen.clone();
      this.max_nonzero_coeff = var1.max_nonzero_coeff;
   }
}
