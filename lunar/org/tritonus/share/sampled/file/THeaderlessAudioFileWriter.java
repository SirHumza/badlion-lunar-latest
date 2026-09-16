package org.tritonus.share.sampled.file;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collection;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioFileFormat.Type;

public class THeaderlessAudioFileWriter extends TAudioFileWriter {
   private static final Logger logger = System.getLogger("org.tritonus.TraceAudioFileWriter");

   protected THeaderlessAudioFileWriter(Collection<Type> var1, Collection<AudioFormat> var2) {
      super(var1, var2);
      logger.log(Level.TRACE, "THeaderlessAudioFileWriter.<init>(): begin");
      logger.log(Level.TRACE, "THeaderlessAudioFileWriter.<init>(): end");
   }

   @Override
   protected AudioOutputStream getAudioOutputStream(AudioFormat var1, long var2, Type var4, TDataOutputStream var5) {
      logger.log(Level.TRACE, "THeaderlessAudioFileWriter.getAudioOutputStream(): begin");
      HeaderlessAudioOutputStream var6 = new HeaderlessAudioOutputStream(var1, var2, var5);
      logger.log(Level.TRACE, "THeaderlessAudioFileWriter.getAudioOutputStream(): end");
      return var6;
   }
}
