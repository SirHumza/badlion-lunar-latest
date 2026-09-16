package net.sourceforge.lame.mp3;

public class FrameSkip {
   private int encoderDelay = -1;
   private int encoderPadding = -1;

   public final int getEncoderDelay() {
      return this.encoderDelay;
   }

   public final void setEncoderDelay(int var1) {
      this.encoderDelay = var1;
   }

   public final int getEncoderPadding() {
      return this.encoderPadding;
   }

   public final void setEncoderPadding(int var1) {
      this.encoderPadding = var1;
   }
}
