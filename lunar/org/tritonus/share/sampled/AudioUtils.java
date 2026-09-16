package org.tritonus.share.sampled;

import java.nio.ByteOrder;
import java.util.Iterator;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.Mixer.Info;

public class AudioUtils {
   public static double SILENCE_DECIBEL = -100.0;

   public static long getLengthInBytes(AudioInputStream var0) {
      return getLengthInBytes(var0.getFormat(), var0.getFrameLength());
   }

   public static long getLengthInBytes(AudioFormat var0, long var1) {
      int var3 = var0.getFrameSize();
      return var1 >= 0L && var3 >= 1 ? var1 * var3 : -1L;
   }

   public static boolean containsFormat(AudioFormat var0, Iterator<AudioFormat> var1) {
      while (var1.hasNext()) {
         AudioFormat var2 = (AudioFormat)var1.next();
         if (AudioFormats.matches(var2, var0)) {
            return true;
         }
      }

      return false;
   }

   public static int getFrameSize(int var0, int var1) {
      return var0 >= 0 && var1 >= 0 ? (var1 + 7) / 8 * var0 : -1;
   }

   public static long millis2Bytes(long var0, AudioFormat var2) {
      return millis2Bytes(var0, var2.getFrameRate(), var2.getFrameSize());
   }

   public static long millis2Bytes(long var0, double var2, int var4) {
      return (long)(var0 * var2 / 1000.0 * var4);
   }

   public static int millis2Bytes(int var0, AudioFormat var1) {
      return millis2Bytes(var0, var1.getFrameRate(), var1.getFrameSize());
   }

   public static int millis2Bytes(int var0, double var1, int var3) {
      return (int)(var0 * var1 / 1000.0 * var3);
   }

   public static long millis2Bytes(double var0, AudioFormat var2) {
      return millis2Bytes(var0, var2.getFrameRate(), var2.getFrameSize());
   }

   public static long millis2Bytes(double var0, double var2, int var4) {
      return (long)(var0 * var2 / 1000.0 * var4);
   }

   public static long millis2BytesFrameAligned(long var0, AudioFormat var2) {
      return millis2BytesFrameAligned(var0, var2.getFrameRate(), var2.getFrameSize());
   }

   public static long millis2BytesFrameAligned(long var0, double var2, int var4) {
      return (long)(var0 * var2 / 1000.0) * var4;
   }

   public static int millis2BytesFrameAligned(int var0, AudioFormat var1) {
      return millis2BytesFrameAligned(var0, var1.getFrameRate(), var1.getFrameSize());
   }

   public static int millis2BytesFrameAligned(int var0, double var1, int var3) {
      return (int)(var0 * var1 / 1000.0) * var3;
   }

   public static long millis2BytesFrameAligned(double var0, AudioFormat var2) {
      return millis2BytesFrameAligned(var0, var2.getFrameRate(), var2.getFrameSize());
   }

   public static long millis2BytesFrameAligned(double var0, double var2, int var4) {
      return (long)(var0 * var2 / 1000.0) * var4;
   }

   public static long millis2Frames(long var0, AudioFormat var2) {
      return millis2Frames(var0, var2.getFrameRate());
   }

   public static long millis2Frames(long var0, double var2) {
      return (long)(var0 * var2 / 1000.0);
   }

   public static int millis2Frames(int var0, AudioFormat var1) {
      return millis2Frames(var0, var1.getFrameRate());
   }

   public static int millis2Frames(int var0, double var1) {
      return (int)(var0 * var1 / 1000.0);
   }

   public static long millis2Frames(double var0, AudioFormat var2) {
      return (long)millis2FramesD(var0, var2.getFrameRate());
   }

   public static long millis2Frames(double var0, double var2) {
      return (long)millis2FramesD(var0, var2);
   }

   public static double millis2FramesD(double var0, AudioFormat var2) {
      return millis2FramesD(var0, var2.getFrameRate());
   }

   public static double millis2FramesD(double var0, double var2) {
      return var0 * var2 / 1000.0;
   }

   public static long bytes2Millis(long var0, AudioFormat var2) {
      return (long)frames2MillisD(var0 / var2.getFrameSize(), var2.getFrameRate());
   }

   public static int bytes2Millis(int var0, AudioFormat var1) {
      return (int)frames2MillisD(var0 / var1.getFrameSize(), var1.getFrameRate());
   }

   public static double bytes2MillisD(long var0, AudioFormat var2) {
      return frames2MillisD(var0 / var2.getFrameSize(), var2.getFrameRate());
   }

   public static double bytes2MillisD(long var0, double var2, int var4) {
      return frames2MillisD(var0 / var4, var2);
   }

   public static long frames2Millis(long var0, AudioFormat var2) {
      return (long)frames2MillisD(var0, var2.getFrameRate());
   }

   public static int frames2Millis(int var0, AudioFormat var1) {
      return (int)frames2MillisD(var0, var1.getFrameRate());
   }

   public static double frames2MillisD(long var0, AudioFormat var2) {
      return frames2MillisD(var0, var2.getFrameRate());
   }

   public static double frames2MillisD(long var0, double var2) {
      return var0 / var2 * 1000.0;
   }

   public static boolean sampleRateEquals(float var0, float var1) {
      return Math.abs(var0 - var1) < 1.0E-7;
   }

   public static boolean isPCM(AudioFormat var0) {
      return var0.getEncoding().equals(Encoding.PCM_SIGNED) || var0.getEncoding().equals(Encoding.PCM_UNSIGNED);
   }

   public static boolean isJavaSoundAudioEngine(Info var0) {
      return var0 != null && var0.getName() != null && var0.getName().equals("Java Sound Audio Engine");
   }

   public static boolean isJavaSoundAudioEngine(DataLine var0) {
      if (var0 == null) {
         return false;
      }

      String var1 = var0.getClass().toString();
      return var1.contains("MixerSourceLine") || var1.contains("MixerClip") || var1.contains("SimpleInputDevice");
   }

   public static boolean isSystemBigEndian() {
      return ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
   }

   public static String NS_or_number(int var0) {
      return var0 == -1 ? "NOT_SPECIFIED" : String.valueOf(var0);
   }

   public static String NS_or_number(float var0) {
      return var0 == -1.0F ? "NOT_SPECIFIED" : String.valueOf(var0);
   }

   public static String format2ShortStr(AudioFormat var0) {
      return var0.getEncoding()
         + "-"
         + NS_or_number(var0.getChannels())
         + "ch-"
         + NS_or_number(var0.getSampleSizeInBits())
         + "bit-"
         + NS_or_number((int)var0.getSampleRate())
         + "Hz-"
         + (var0.isBigEndian() ? "be" : "le");
   }

   public static double linear2decibel(double var0) {
      if (var0 <= 0.0) {
         return SILENCE_DECIBEL;
      }

      double var2 = Math.log10(var0) * 20.0;
      if (var2 < SILENCE_DECIBEL) {
         var2 = SILENCE_DECIBEL;
      }

      return var2;
   }

   public static double decibel2linear(double var0) {
      return var0 <= SILENCE_DECIBEL ? 0.0 : Math.pow(10.0, var0 * 0.05);
   }
}
