package org.tritonus.share.sampled.file;

import java.io.File;
import java.io.RandomAccessFile;

public class TSeekableDataOutputStream extends RandomAccessFile implements TDataOutputStream {
   public TSeekableDataOutputStream(File var1) {
      super(var1, "rw");
   }

   @Override
   public boolean supportsSeek() {
      return true;
   }

   @Override
   public void writeLittleEndian32(int var1) {
      this.writeByte(var1 & 0xFF);
      this.writeByte(var1 >> 8 & 0xFF);
      this.writeByte(var1 >> 16 & 0xFF);
      this.writeByte(var1 >> 24 & 0xFF);
   }

   @Override
   public void writeLittleEndian16(short var1) {
      this.writeByte(var1 & 255);
      this.writeByte(var1 >> 8 & 0xFF);
   }
}
