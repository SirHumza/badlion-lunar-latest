package com.github.trilarion.sound.sampled.spi;

import com.github.trilarion.sound.sampled.AudioFormats;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;

public abstract class SimpleFormatConversionProvider extends TFormatConversionProvider {
   private static final Logger LOG = Logger.getLogger(SimpleFormatConversionProvider.class.getName());
   private final Collection<Encoding> m_sourceEncodings = new ArrayList<>();
   private final Collection<Encoding> m_targetEncodings = new ArrayList<>();
   private final Collection<AudioFormat> m_sourceFormats;
   private final Collection<AudioFormat> m_targetFormats;

   private static void collectEncodings(Collection<AudioFormat> var0, Collection<Encoding> var1) {
      for (AudioFormat var3 : var0) {
         var1.add(var3.getEncoding());
      }
   }

   protected SimpleFormatConversionProvider(Collection<AudioFormat> var1, Collection<AudioFormat> var2) {
      if (var1 == null) {
         var1 = new ArrayList();
      }

      if (var2 == null) {
         var2 = new ArrayList();
      }

      this.m_sourceFormats = var1;
      this.m_targetFormats = var2;
      collectEncodings(this.m_sourceFormats, this.m_sourceEncodings);
      collectEncodings(this.m_targetFormats, this.m_targetEncodings);
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

   protected boolean isAllowedSourceFormat(AudioFormat var1) {
      for (AudioFormat var3 : this.m_sourceFormats) {
         if (AudioFormats.matches(var3, var1)) {
            return true;
         }
      }

      return false;
   }
}
