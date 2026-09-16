package org.tritonus.share.sampled.convert;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collection;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFormat.Encoding;
import org.tritonus.share.ArraySet;

public abstract class TEncodingFormatConversionProvider extends TSimpleFormatConversionProvider {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioConverter");

   protected TEncodingFormatConversionProvider(Collection<AudioFormat> var1, Collection<AudioFormat> var2) {
      super(var1, var2);
   }

   @Override
   public AudioFormat[] getTargetFormats(Encoding var1, AudioFormat var2) {
      logger.log(Level.TRACE, ">TEncodingFormatConversionProvider.getTargetFormats(AudioFormat.Encoding, AudioFormat):");
      logger.log(Level.TRACE, "checking if conversion possible");
      logger.log(Level.TRACE, "from: " + var2);
      logger.log(Level.TRACE, "to: " + var1);
      if (!this.isConversionSupported(var1, var2)) {
         logger.log(Level.TRACE, "< returning empty array.");
         return EMPTY_FORMAT_ARRAY;
      }

      ArraySet var3 = new ArraySet();

      for (AudioFormat var5 : this.getCollectionTargetFormats()) {
         var5 = this.replaceNotSpecified(var2, var5);
         var3.add(var5);
      }

      logger.log(Level.TRACE, "< returning " + var3.size() + " elements.");
      return var3.toArray(EMPTY_FORMAT_ARRAY);
   }
}
