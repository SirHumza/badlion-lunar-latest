package org.tritonus.share.sampled.mixer;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Collection;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.Control;
import javax.sound.sampled.DataLine;

public abstract class TBaseDataLine extends TDataLine {
   private static final Logger logger = System.getLogger("org.tritonus.TraceDataLine");

   public TBaseDataLine(TMixer var1, DataLine.Info var2) {
      super(var1, var2);
   }

   public TBaseDataLine(TMixer var1, DataLine.Info var2, Collection<Control> var3) {
      super(var1, var2, var3);
   }

   public void open(AudioFormat var1, int var2) {
      logger.log(Level.TRACE, "TBaseDataLine.open(AudioFormat, int): called with buffer size: " + var2);
      this.setBufferSize(var2);
      this.open(var1);
   }

   public void open(AudioFormat var1) {
      logger.log(Level.TRACE, "TBaseDataLine.open(AudioFormat): called");
      this.setFormat(var1);
      this.open();
   }
}
