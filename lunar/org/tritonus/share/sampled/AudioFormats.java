package org.tritonus.share.sampled;

import javax.sound.sampled.AudioFormat;

public class AudioFormats {
   private static boolean doMatch(int var0, int var1) {
      return var0 == -1 || var1 == -1 || var0 == var1;
   }

   private static boolean doMatch(float var0, float var1) {
      return var0 == -1.0F || var1 == -1.0F || Math.abs(var0 - var1) < 1.0E-9;
   }

   public static boolean matches(AudioFormat var0, AudioFormat var1) {
      return var0.getEncoding().equals(var1.getEncoding())
         && (
            var1.getSampleSizeInBits() <= 8 || var0.getSampleSizeInBits() == -1 || var1.getSampleSizeInBits() == -1 || var0.isBigEndian() == var1.isBigEndian()
         )
         && doMatch(var0.getChannels(), var1.getChannels())
         && doMatch(var0.getSampleSizeInBits(), var1.getSampleSizeInBits())
         && doMatch(var0.getFrameSize(), var1.getFrameSize())
         && doMatch(var0.getSampleRate(), var1.getSampleRate())
         && doMatch(var0.getFrameRate(), var1.getFrameRate());
   }

   public static boolean equals(AudioFormat var0, AudioFormat var1) {
      return var0.getEncoding().equals(var1.getEncoding())
         && var0.getChannels() == var1.getChannels()
         && var0.getSampleSizeInBits() == var1.getSampleSizeInBits()
         && var0.getFrameSize() == var1.getFrameSize()
         && Math.abs(var0.getSampleRate() - var1.getSampleRate()) < 1.0E-9
         && Math.abs(var0.getFrameRate() - var1.getFrameRate()) < 1.0E-9;
   }
}
