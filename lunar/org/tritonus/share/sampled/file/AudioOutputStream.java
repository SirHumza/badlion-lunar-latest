package org.tritonus.share.sampled.file;

import javax.sound.sampled.AudioFormat;

public interface AudioOutputStream {
   AudioFormat getFormat();

   long getLength();

   int write(byte[] var1, int var2, int var3);

   void close();
}
