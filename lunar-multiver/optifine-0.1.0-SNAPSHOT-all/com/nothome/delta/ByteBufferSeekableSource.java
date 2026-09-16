package com.nothome.delta;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public class ByteBufferSeekableSource implements SeekableSource {
   private ByteBuffer bb;
   private ByteBuffer cur;

   public ByteBufferSeekableSource(byte[] var1) {
      this(ByteBuffer.wrap(var1));
   }

   public ByteBufferSeekableSource(ByteBuffer var1) {
      if (var1 == null) {
         throw new NullPointerException("bb");
      }

      this.bb = var1;
      ((Buffer)var1).rewind();

      try {
         this.seek(0L);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   @Override
   public void seek(long var1) {
      this.cur = this.bb.slice();
      if (var1 > this.cur.limit()) {
         throw new IOException("pos " + var1 + " cannot seek " + this.cur.limit());
      }

      ((Buffer)this.cur).position((int)var1);
   }

   @Override
   public int read(ByteBuffer var1) {
      if (!this.cur.hasRemaining()) {
         return -1;
      }

      int var2;
      for (var2 = 0; this.cur.hasRemaining() && var1.hasRemaining(); var2++) {
         var1.put(this.cur.get());
      }

      return var2;
   }

   @Override
   public void close() {
      this.bb = null;
      this.cur = null;
   }

   @Override
   public String toString() {
      return "BBSeekable bb=" + this.bb.position() + "-" + this.bb.limit() + " cur=" + this.cur.position() + "-" + this.cur.limit() + "";
   }
}
