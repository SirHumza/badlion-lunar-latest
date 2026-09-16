package com.nothome.delta.text;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.CharBuffer;

public class CharBufferSeekableSource implements SeekableSource {
   private CharBuffer cb;
   private CharBuffer cur;

   public CharBufferSeekableSource(CharBuffer var1) {
      if (var1 == null) {
         throw new NullPointerException("cb");
      }

      this.cb = var1;

      try {
         this.seek(0L);
      } catch (IOException var3) {
         throw new RuntimeException(var3);
      }
   }

   public CharBufferSeekableSource(CharSequence var1) {
      this(CharBuffer.wrap(var1));
   }

   @Override
   public void seek(long var1) {
      ((Buffer)this.cb).rewind();
      this.cur = this.cb.slice();
      if (var1 > this.cur.limit()) {
         throw new IOException("pos " + var1 + " cannot seek " + this.cur.limit());
      }

      ((Buffer)this.cur).position((int)var1);
   }

   @Override
   public int read(CharBuffer var1) {
      return this.cur.read(var1);
   }

   @Override
   public void close() {
   }
}
