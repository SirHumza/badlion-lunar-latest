package net.sourceforge.lame.mp3;

public enum MPEGMode {
   STEREO(0),
   JOINT_STEREO(1),
   DUAL_CHANNEL(2),
   MONO(3),
   NOT_SET(-1);

   private int mode;

   MPEGMode(int var3) {
      this.mode = var3;
   }

   public final int getNumMode() {
      return this.mode;
   }
}
