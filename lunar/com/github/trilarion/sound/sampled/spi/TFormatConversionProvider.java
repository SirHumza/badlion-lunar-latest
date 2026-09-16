package com.github.trilarion.sound.sampled.spi;

import com.github.trilarion.sound.sampled.AudioFormats;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.spi.FormatConversionProvider;

public abstract class TFormatConversionProvider extends FormatConversionProvider {
   private static final Logger LOG = Logger.getLogger(TFormatConversionProvider.class.getName());
   protected static final Encoding[] EMPTY_ENCODING_ARRAY = new Encoding[0];
   protected static final AudioFormat[] EMPTY_FORMAT_ARRAY = new AudioFormat[0];

   @Override
   public AudioInputStream getAudioInputStream(Encoding var1, AudioInputStream var2) {
      AudioFormat var3 = var2.getFormat();
      AudioFormat var4 = new AudioFormat(var1, -1.0F, -1, -1, -1, -1.0F, var3.isBigEndian());
      LOG.log(Level.FINE, "TFormatConversionProvider.getAudioInputStream(AudioFormat.Encoding, AudioInputStream):");
      LOG.log(Level.FINE, "trying to convert to {0}", var4);
      return this.getAudioInputStream(var4, var2);
   }

   @Override
   public boolean isConversionSupported(AudioFormat var1, AudioFormat var2) {
      LOG.log(Level.FINE, ">TFormatConversionProvider.isConversionSupported(AudioFormat, AudioFormat):");
      LOG.log(Level.FINE, "class: {0}", this.getClass().getName());
      LOG.log(Level.FINE, "checking if conversion possible");
      LOG.log(Level.FINE, "from: {0}", var2);
      LOG.log(Level.FINE, "to: {0}", var1);
      AudioFormat[] var3 = this.getTargetFormats(var1.getEncoding(), var2);

      for (AudioFormat var7 : var3) {
         LOG.log(Level.FINE, "checking against possible target format: {0}", var7);
         if (var7 != null && AudioFormats.matches(var7, var1)) {
            LOG.log(Level.FINE, "<result=true");
            return true;
         }
      }

      LOG.log(Level.FINE, "<result=false");
      return false;
   }
}
