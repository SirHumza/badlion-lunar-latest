package org.tritonus.share.sampled.file;

import java.io.DataOutputStream;
import java.io.OutputStream;

public class TNonSeekableDataOutputStream extends DataOutputStream implements TDataOutputStream {
   public TNonSeekableDataOutputStream(OutputStream var1) {
      super(var1);
   }

   @Override
   public boolean supportsSeek() {
      return false;
   }

   @Override
   public void seek(long var1) {
      throw new IllegalArgumentException("TNonSeekableDataOutputStream: Call to seek not allowed.");
   }

   @Override
   public long getFilePointer() {
      throw new IllegalArgumentException("TNonSeekableDataOutputStream: Call to getFilePointer not allowed.");
   }

   @Override
   public long length() {
      throw new IllegalArgumentException("TNonSeekableDataOutputStream: Call to length not allowed.");
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
