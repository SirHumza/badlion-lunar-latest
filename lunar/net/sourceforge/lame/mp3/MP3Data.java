package net.sourceforge.lame.mp3;

public class MP3Data {
   public boolean header_parsed;
   public int stereo;
   public int samplerate;
   public int bitrate;
   public int mode;
   public int mode_ext;
   private int frameSize;
   private int numSamples;
   private int totalFrames;
   private int framesDecodedCounter;

   public int getFrameSize() {
      return this.frameSize;
   }

   public void setFrameSize(int var1) {
      this.frameSize = var1;
   }

   public int getNumSamples() {
      return this.numSamples;
   }

   public void setNumSamples(int var1) {
      this.numSamples = var1;
   }

   public int getTotalFrames() {
      return this.totalFrames;
   }

   public void setTotalFrames(int var1) {
      this.totalFrames = var1;
   }

   public int getFramesDecodedCounter() {
      return this.framesDecodedCounter;
   }

   public void setFramesDecodedCounter(int var1) {
      this.framesDecodedCounter = var1;
   }
}
