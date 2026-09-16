package org.apache.commons.compress.archivers;

import java.io.File;
import java.io.OutputStream;

public abstract class ArchiveOutputStream extends OutputStream {
   private final byte[] oneByte = new byte[1];
   static final int BYTE_MASK = 255;
   private long bytesWritten = 0L;

   public abstract void putArchiveEntry(ArchiveEntry var1);

   public abstract void closeArchiveEntry();

   public abstract void finish();

   public abstract ArchiveEntry createArchiveEntry(File var1, String var2);

   @Override
   public void write(int var1) {
      this.oneByte[0] = (byte)(var1 & 0xFF);
      this.write(this.oneByte, 0, 1);
   }

   protected void count(int var1) {
      this.count((long)var1);
   }

   protected void count(long var1) {
      if (var1 != -1L) {
         this.bytesWritten += var1;
      }
   }

   @Deprecated
   public int getCount() {
      return (int)this.bytesWritten;
   }

   public long getBytesWritten() {
      return this.bytesWritten;
   }

   public boolean canWriteEntryData(ArchiveEntry var1) {
      return true;
   }
}
