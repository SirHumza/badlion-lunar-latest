package net.sourceforge.lame.mp3;

import net.sourceforge.lame.mpg.MPGLib;

public class LameInternalFlags {
   public static final int MFSIZE = 3984;
   public float[][] mfbuf = new float[2][3984];
   public static final int MAX_BITS_PER_CHANNEL = 4095;
   public static final int MAX_BITS_PER_GRANULE = 7680;
   public static final int BPC = 320;
   public float[][] blackfilt = new float[641][];
   public static final int MAX_HEADER_BUF = 256;
   public LameInternalFlags.Header[] header = new LameInternalFlags.Header[256];
   private static final int MAX_HEADER_LEN = 40;
   public long Class_ID;
   public int lame_encode_frame_init;
   public int iteration_init_init;
   public int fill_buffer_resample_init;
   public int mode_gr;
   public int channels_in;
   public int channels_out;
   public double resample_ratio;
   public int mf_samples_to_encode;
   public int mf_size;
   public int VBR_min_bitrate;
   public int VBR_max_bitrate;
   public int bitrate_index;
   public int samplerate_index;
   public int mode_ext;
   public float lowpass1;
   public float lowpass2;
   public float highpass1;
   public float highpass2;
   public int noise_shaping;
   public int noise_shaping_amp;
   public int substep_shaping;
   public int psymodel;
   public int noise_shaping_stop;
   public int subblock_gain;
   public int use_best_huffman;
   public int full_outer_loop;
   public IIISideInfo l3_side = new IIISideInfo();
   public float[] ms_ratio = new float[2];
   public int padding;
   public int frac_SpF;
   public int slot_lag;
   public ID3TagSpec tag_spec;
   public int nMusicCRC;
   public int[] OldValue = new int[2];
   public int[] CurrentStep = new int[2];
   public float masking_lower;
   public int[] bv_scf = new int[576];
   public int[] pseudohalf = new int[39];
   public boolean sfb21_extra;
   public float[][] inbuf_old = new float[2][];
   public double[] itime = new double[2];
   public int sideinfo_len;
   public float[][][][] sb_sample = new float[2][2][18][32];
   public float[] amp_filter = new float[32];
   public int h_ptr;
   public int w_ptr;
   public int ancillary_flag;
   public int ResvSize;
   public int ResvMax;
   public ScaleFac scalefac_band = new ScaleFac();
   public float[] minval_l = new float[64];
   public float[] minval_s = new float[64];
   public float[][] nb_1 = new float[4][64];
   public float[][] nb_2 = new float[4][64];
   public float[][] nb_s1 = new float[4][64];
   public float[][] nb_s2 = new float[4][64];
   public float[] s3_ss;
   public float[] s3_ll;
   public float decay;
   public III_psy_xmin[] thm = new III_psy_xmin[4];
   public III_psy_xmin[] en = new III_psy_xmin[4];
   public float[] tot_ener = new float[4];
   public float[][] loudness_sq = new float[2][2];
   public float[] loudness_sq_save = new float[2];
   public float[] mld_l = new float[22];
   public float[] mld_s = new float[13];
   public int[] bm_l = new int[22];
   public int[] bo_l = new int[22];
   public int[] bm_s = new int[13];
   public int[] bo_s = new int[13];
   public int npart_l;
   public int npart_s;
   public int[][] s3ind = new int[64][2];
   public int[][] s3ind_s = new int[64][2];
   public int[] numlines_s = new int[64];
   public int[] numlines_l = new int[64];
   public float[] rnumlines_l = new float[64];
   public float[] mld_cb_l = new float[64];
   public float[] mld_cb_s = new float[64];
   public int numlines_s_num1;
   public int numlines_l_num1;
   public float[] pe = new float[4];
   public float ms_ratio_s_old;
   public float ms_ratio_l_old;
   public float ms_ener_ratio_old;
   public int[] blocktype_old = new int[2];
   public NsPsy nsPsy = new NsPsy();
   public VBRSeekInfo VBR_seek_table = new VBRSeekInfo();
   public ATH ATH;
   public PSY PSY;
   public int nogap_total;
   public int nogap_current;
   public boolean decode_on_the_fly = true;
   public boolean findReplayGain = true;
   public boolean findPeakSample = true;
   public float PeakSample;
   public int RadioGain;
   public int AudiophileGain;
   public ReplayGain rgdata;
   public int noclipGainChange;
   public float noclipScale;
   public int[][] bitrate_stereoMode_Hist = new int[16][5];
   public int[][] bitrate_blockType_Hist = new int[16][6];
   public PlottingData pinfo;
   public MPGLib.mpstr_tag hip;
   public int in_buffer_nsamples;
   public float[] in_buffer_0;
   public float[] in_buffer_1;
   public IIterationLoop iteration_loop;

   public LameInternalFlags() {
      for (int var1 = 0; var1 < this.en.length; var1++) {
         this.en[var1] = new III_psy_xmin();
      }

      for (int var2 = 0; var2 < this.thm.length; var2++) {
         this.thm[var2] = new III_psy_xmin();
      }

      for (int var3 = 0; var3 < this.header.length; var3++) {
         this.header[var3] = new LameInternalFlags.Header();
      }
   }

   public static class Header {
      public int write_timing;
      public int ptr;
      public byte[] buf = new byte[40];
   }
}
