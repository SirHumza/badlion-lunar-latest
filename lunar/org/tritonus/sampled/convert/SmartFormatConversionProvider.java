package org.tritonus.sampled.convert;

import java.util.HashSet;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.sampled.convert.TFormatConversionProvider;

public class SmartFormatConversionProvider extends TFormatConversionProvider {
   private Set<Thread> m_blockedThreads = new HashSet<>();

   @Override
   public Encoding[] getSourceEncodings() {
      return EMPTY_ENCODING_ARRAY;
   }

   @Override
   public Encoding[] getTargetEncodings() {
      return EMPTY_ENCODING_ARRAY;
   }

   @Override
   public Encoding[] getTargetEncodings(AudioFormat var1) {
      return null;
   }

   @Override
   public boolean isConversionSupported(Encoding var1, AudioFormat var2) {
      return false;
   }

   @Override
   public AudioFormat[] getTargetFormats(Encoding var1, AudioFormat var2) {
      return null;
   }

   @Override
   public boolean isConversionSupported(AudioFormat var1, AudioFormat var2) {
      if (this.isCurrentThreadBlocked()) {
         return false;
      }

      AudioFormat[] var3 = this.getIntermediateFormats(var2, var1);
      return var3 != null;
   }

   @Override
   public AudioInputStream getAudioInputStream(Encoding var1, AudioInputStream var2) {
      return null;
   }

   @Override
   public AudioInputStream getAudioInputStream(AudioFormat var1, AudioInputStream var2) {
      return null;
   }

   private AudioFormat[] getIntermediateFormats(AudioFormat var1, AudioFormat var2) {
      Encoding var3 = var1.getEncoding();
      Encoding var4 = var2.getEncoding();
      this.blockCurrentThread();
      boolean var5 = AudioSystem.isConversionSupported(var2, var1);
      this.unblockCurrentThread();
      if (var5) {
         return EMPTY_FORMAT_ARRAY;
      }

      if (isPCM(var3) && isPCM(var4)) {
         return null;
      }

      if (!isPCM(var3)) {
         AudioFormat var10 = new AudioFormat(
            Encoding.PCM_SIGNED, var1.getSampleRate(), var1.getSampleSizeInBits(), var1.getChannels(), -1, var1.getSampleRate(), true
         );
         this.blockCurrentThread();
         AudioFormat[] var11 = this.getIntermediateFormats(var1, var10);
         this.unblockCurrentThread();
         AudioFormat[] var12 = this.getIntermediateFormats(var10, var2);
         if (var11 != null && var12 != null) {
            AudioFormat[] var13 = new AudioFormat[var11.length + 1 + var12.length];
            System.arraycopy(var11, 0, var13, 0, var11.length);
            var13[var11.length] = var10;
            System.arraycopy(var12, 0, var13, var11.length, var12.length);
            return var13;
         } else {
            return null;
         }
      } else if (!isPCM(var4)) {
         AudioFormat var6 = new AudioFormat(
            Encoding.PCM_SIGNED, var2.getSampleRate(), var2.getSampleSizeInBits(), var2.getChannels(), -1, var2.getSampleRate(), true
         );
         AudioFormat[] var7 = this.getIntermediateFormats(var1, var6);
         this.blockCurrentThread();
         AudioFormat[] var8 = this.getIntermediateFormats(var6, var2);
         this.unblockCurrentThread();
         if (var7 != null && var8 != null) {
            AudioFormat[] var9 = new AudioFormat[var7.length + 1 + var8.length];
            System.arraycopy(var7, 0, var9, 0, var7.length);
            var9[var7.length] = var6;
            System.arraycopy(var8, 0, var9, var7.length, var8.length);
            return var9;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static boolean isPCM(Encoding var0) {
      return var0.equals(Encoding.PCM_SIGNED) || var0.equals(Encoding.PCM_SIGNED);
   }

   protected static boolean isSignedPCM(Encoding var0) {
      return var0.equals(Encoding.PCM_SIGNED);
   }

   private boolean isCurrentThreadBlocked() {
      return this.m_blockedThreads.contains(Thread.currentThread());
   }

   private void blockCurrentThread() {
      this.m_blockedThreads.add(Thread.currentThread());
   }

   private void unblockCurrentThread() {
      this.m_blockedThreads.remove(Thread.currentThread());
   }
}
