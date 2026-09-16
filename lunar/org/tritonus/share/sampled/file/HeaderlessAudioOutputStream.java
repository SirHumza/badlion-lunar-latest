package org.tritonus.share.sampled.file;

import javax.sound.sampled.AudioFormat;

public class HeaderlessAudioOutputStream extends TAudioOutputStream {
   public HeaderlessAudioOutputStream(AudioFormat var1, long var2, TDataOutputStream var4) {
      super(var1, var2, var4, false);
   }

   @Override
   protected void writeHeader() {
   }
}
