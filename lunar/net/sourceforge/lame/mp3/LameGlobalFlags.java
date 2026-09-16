package net.sourceforge.lame.mp3;

public class LameGlobalFlags {
   public long class_id;
   public int num_samples;
   public float scale;
   public float scale_left;
   public float scale_right;
   public boolean analysis;
   public boolean bWriteVbrTag;
   public boolean decode_only;
   public boolean force_ms;
   public boolean free_format;
   public boolean decode_on_the_fly;
   public float compression_ratio;
   public int copyright;
   public int original;
   public int extension;
   public int emphasis;
   public boolean error_protection;
   public boolean strict_ISO;
   public boolean disable_reservoir;
   public int quant_comp;
   public int quant_comp_short;
   public boolean experimentalY;
   public int experimentalZ;
   public int exp_nspsytune;
   public int preset;
   public float VBR_q_frac;
   public int VBR_mean_bitrate_kbps;
   public int VBR_min_bitrate_kbps;
   public int VBR_max_bitrate_kbps;
   public int VBR_hard_min;
   public int lowpassfreq;
   public int highpassfreq;
   public int lowpasswidth;
   public int highpasswidth;
   public float maskingadjust;
   public float maskingadjust_short;
   public boolean ATHonly;
   public boolean ATHshort;
   public boolean noATH;
   public int ATHtype;
   public float ATHcurve;
   public float ATHlower;
   public int athaa_type;
   public int athaa_loudapprox;
   public float athaa_sensitivity;
   public ShortBlock short_blocks;
   public Boolean useTemporal;
   public float interChRatio;
   public float msfix;
   public boolean tune;
   public float tune_value_a;
   public int encoder_padding;
   public int frameNum;
   public int lame_allocated_gfp;
   public LameInternalFlags internal_flags;
   private int inNumChannels;
   private int inSampleRate;
   private int outSampleRate;
   private int quality;
   private MPEGMode mode = MPEGMode.STEREO;
   private boolean findReplayGain;
   private boolean writeId3tagAutomatic;
   private int bitRate;
   private VbrMode VBR;
   private int VBRQuality;
   private int mpegVersion;
   private int encoderDelay;
   private int frameSize;

   public final int getInNumChannels() {
      return this.inNumChannels;
   }

   public final void setInNumChannels(int var1) {
      this.inNumChannels = var1;
   }

   public final int getInSampleRate() {
      return this.inSampleRate;
   }

   public final void setInSampleRate(int var1) {
      this.inSampleRate = var1;
   }

   public int getOutSampleRate() {
      return this.outSampleRate;
   }

   public void setOutSampleRate(int var1) {
      this.outSampleRate = var1;
   }

   public int getQuality() {
      return this.quality;
   }

   public void setQuality(int var1) {
      this.quality = var1;
   }

   public final MPEGMode getMode() {
      return this.mode;
   }

   public final void setMode(MPEGMode var1) {
      this.mode = var1;
   }

   public boolean isFindReplayGain() {
      return this.findReplayGain;
   }

   public void setFindReplayGain(boolean var1) {
      this.findReplayGain = var1;
   }

   public final boolean isWriteId3tagAutomatic() {
      return this.writeId3tagAutomatic;
   }

   public final void setWriteId3tagAutomatic(boolean var1) {
      this.writeId3tagAutomatic = var1;
   }

   public final int getBitRate() {
      return this.bitRate;
   }

   public final void setBitRate(int var1) {
      this.bitRate = var1;
   }

   public final VbrMode getVBR() {
      return this.VBR;
   }

   public final void setVBR(VbrMode var1) {
      this.VBR = var1;
   }

   public final int getVBRQuality() {
      return this.VBRQuality;
   }

   public final void setVBRQuality(int var1) {
      this.VBRQuality = var1;
   }

   public int getMpegVersion() {
      return this.mpegVersion;
   }

   public void setMpegVersion(int var1) {
      this.mpegVersion = var1;
   }

   public int getEncoderDelay() {
      return this.encoderDelay;
   }

   public void setEncoderDelay(int var1) {
      this.encoderDelay = var1;
   }

   public int getFrameSize() {
      return this.frameSize;
   }

   public void setFrameSize(int var1) {
      this.frameSize = var1;
   }
}
