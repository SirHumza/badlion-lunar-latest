package org.tritonus.share.sampled.file;

import java.io.DataOutput;

public interface TDataOutputStream extends DataOutput {
   boolean supportsSeek();

   void seek(long var1);

   long getFilePointer();

   long length();

   void writeLittleEndian32(int var1);

   void writeLittleEndian16(short var1);

   void close();
}
