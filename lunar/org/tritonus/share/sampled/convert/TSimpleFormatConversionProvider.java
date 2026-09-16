package org.tritonus.share.sampled.convert;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collection;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.ArraySet;
import org.tritonus.share.sampled.AudioFormats;

public abstract class TSimpleFormatConversionProvider extends TFormatConversionProvider {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioConverter");
   private Collection<Encoding> m_sourceEncodings = new ArraySet<>();
   private Collection<Encoding> m_targetEncodings = new ArraySet<>();
   private Collection<AudioFormat> m_sourceFormats;
   private Collection<AudioFormat> m_targetFormats;

   protected TSimpleFormatConversionProvider(Collection<AudioFormat> var1, Collection<AudioFormat> var2) {
      if (var1 == null) {
         var1 = new ArraySet();
      }

      if (var2 == null) {
         var2 = new ArraySet();
      }

      this.m_sourceFormats = var1;
      this.m_targetFormats = var2;
      collectEncodings(this.m_sourceFormats, this.m_sourceEncodings);
      collectEncodings(this.m_targetFormats, this.m_targetEncodings);
   }

   protected void disable() {
      logger.log(Level.TRACE, "TSimpleFormatConversionProvider.disable(): disabling " + this.getClass().getName());
      this.m_sourceEncodings = new ArraySet<>();
      this.m_targetEncodings = new ArraySet<>();
      this.m_sourceFormats = new ArraySet<>();
      this.m_targetFormats = new ArraySet<>();
   }

   private static void collectEncodings(Collection<AudioFormat> var0, Collection<Encoding> var1) {
      for (AudioFormat var3 : var0) {
         var1.add(var3.getEncoding());
      }
   }

   @Override
   public Encoding[] getSourceEncodings() {
      return this.m_sourceEncodings.toArray(EMPTY_ENCODING_ARRAY);
   }

   @Override
   public Encoding[] getTargetEncodings() {
      return this.m_targetEncodings.toArray(EMPTY_ENCODING_ARRAY);
   }

   @Override
   public boolean isSourceEncodingSupported(Encoding var1) {
      return this.m_sourceEncodings.contains(var1);
   }

   @Override
   public boolean isTargetEncodingSupported(Encoding var1) {
      return this.m_targetEncodings.contains(var1);
   }

   @Override
   public Encoding[] getTargetEncodings(AudioFormat var1) {
      return this.isAllowedSourceFormat(var1) ? this.getTargetEncodings() : EMPTY_ENCODING_ARRAY;
   }

   @Override
   public AudioFormat[] getTargetFormats(Encoding var1, AudioFormat var2) {
      return this.isConversionSupported(var1, var2) ? this.m_targetFormats.toArray(EMPTY_FORMAT_ARRAY) : EMPTY_FORMAT_ARRAY;
   }

   protected boolean isAllowedSourceEncoding(Encoding var1) {
      return this.m_sourceEncodings.contains(var1);
   }

   protected boolean isAllowedTargetEncoding(Encoding var1) {
      return this.m_targetEncodings.contains(var1);
   }

   protected boolean isAllowedSourceFormat(AudioFormat var1) {
      for (AudioFormat var3 : this.m_sourceFormats) {
         if (AudioFormats.matches(var3, var1)) {
            return true;
         }
      }

      return false;
   }

   protected boolean isAllowedTargetFormat(AudioFormat var1) {
      for (AudioFormat var3 : this.m_targetFormats) {
         if (AudioFormats.matches(var3, var1)) {
            return true;
         }
      }

      return false;
   }

   protected Collection<Encoding> getCollectionSourceEncodings() {
      return this.m_sourceEncodings;
   }

   protected Collection<Encoding> getCollectionTargetEncodings() {
      return this.m_targetEncodings;
   }

   protected Collection<AudioFormat> getCollectionSourceFormats() {
      return this.m_sourceFormats;
   }

   protected Collection<AudioFormat> getCollectionTargetFormats() {
      return this.m_targetFormats;
   }

   protected static boolean doMatch(int var0, int var1) {
      return var0 == -1 || var1 == -1 || var0 == var1;
   }

   protected static boolean doMatch(float var0, float var1) {
      return var0 == -1.0F || var1 == -1.0F || Math.abs(var0 - var1) < 1.0E-9;
   }

   protected AudioFormat replaceNotSpecified(AudioFormat var1, AudioFormat var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      if (var2.getSampleSizeInBits() == -1 && var1.getSampleSizeInBits() != -1) {
         var3 = true;
      }

      if (var2.getChannels() == -1 && var1.getChannels() != -1) {
         var4 = true;
      }

      if (var2.getSampleRate() == -1.0F && var1.getSampleRate() != -1.0F) {
         var5 = true;
      }

      if (var2.getFrameRate() == -1.0F && var1.getFrameRate() != -1.0F) {
         var6 = true;
      }

      if (var3 || var4 || var5 || var6 || var2.getFrameSize() == -1 && var1.getFrameSize() != -1) {
         float var7 = var5 ? var1.getSampleRate() : var2.getSampleRate();
         float var8 = var6 ? var1.getFrameRate() : var2.getFrameRate();
         int var9 = var3 ? var1.getSampleSizeInBits() : var2.getSampleSizeInBits();
         int var10 = var4 ? var1.getChannels() : var2.getChannels();
         int var11 = this.getFrameSize(var2.getEncoding(), var7, var9, var10, var8, var2.isBigEndian(), var2.getFrameSize());
         var2 = new AudioFormat(var2.getEncoding(), var7, var9, var10, var11, var8, var2.isBigEndian());
      }

      return var2;
   }

   protected int getFrameSize(Encoding var1, float var2, int var3, int var4, float var5, boolean var6, int var7) {
      return var3 != -1 && var4 != -1 ? (var3 + 7) / 8 * var4 : -1;
   }
}
