package org.tritonus.share.sampled.convert;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioFormat.Encoding;
import javax.sound.sampled.spi.FormatConversionProvider;
import org.tritonus.share.sampled.AudioFormats;

public abstract class TFormatConversionProvider extends FormatConversionProvider {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioConverter");
   protected static final Encoding[] EMPTY_ENCODING_ARRAY = new Encoding[0];
   protected static final AudioFormat[] EMPTY_FORMAT_ARRAY = new AudioFormat[0];

   @Override
   public AudioInputStream getAudioInputStream(Encoding var1, AudioInputStream var2) {
      AudioFormat var3 = var2.getFormat();
      AudioFormat var4 = new AudioFormat(var1, -1.0F, -1, -1, -1, -1.0F, var3.isBigEndian());
      logger.log(Level.TRACE, "TFormatConversionProvider.getAudioInputStream(AudioFormat.Encoding, AudioInputStream):");
      logger.log(Level.TRACE, "trying to convert to " + var4);
      return this.getAudioInputStream(var4, var2);
   }

   @Override
   public boolean isConversionSupported(AudioFormat var1, AudioFormat var2) {
      logger.log(Level.TRACE, ">TFormatConversionProvider.isConversionSupported(AudioFormat, AudioFormat):");
      logger.log(Level.TRACE, "class: " + this.getClass().getName());
      logger.log(Level.TRACE, "checking if conversion possible");
      logger.log(Level.TRACE, "from: " + var2);
      logger.log(Level.TRACE, "to: " + var1);
      AudioFormat[] var3 = this.getTargetFormats(var1.getEncoding(), var2);

      for (AudioFormat var7 : var3) {
         logger.log(Level.TRACE, "checking against possible target format: " + var7);
         if (var7 != null && AudioFormats.matches(var7, var1)) {
            logger.log(Level.TRACE, "<result=true");
            return true;
         }
      }

      logger.log(Level.TRACE, "<result=false");
      return false;
   }

   public AudioFormat getMatchingFormat(AudioFormat var1, AudioFormat var2) {
      logger.log(Level.TRACE, ">TFormatConversionProvider.isConversionSupported(AudioFormat, AudioFormat):");
      logger.log(Level.TRACE, "class: " + this.getClass().getName());
      logger.log(Level.TRACE, "checking if conversion possible");
      logger.log(Level.TRACE, "from: " + var2);
      logger.log(Level.TRACE, "to: " + var1);
      AudioFormat[] var3 = this.getTargetFormats(var1.getEncoding(), var2);

      for (AudioFormat var7 : var3) {
         logger.log(Level.TRACE, "checking against possible target format: " + var7);
         if (var7 != null && AudioFormats.matches(var7, var1)) {
            logger.log(Level.TRACE, "<result=true");
            return var7;
         }
      }

      logger.log(Level.TRACE, "<result=false");
      return null;
   }
}
