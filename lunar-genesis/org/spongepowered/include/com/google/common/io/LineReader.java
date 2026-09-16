package org.spongepowered.include.com.google.common.io;

import java.io.Reader;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.Queue;
import org.spongepowered.include.com.google.common.base.Preconditions;
import org.spongepowered.include.com.google.errorprone.annotations.CanIgnoreReturnValue;

public final class LineReader {
   private final Readable readable;
   private final Reader reader;
   private final CharBuffer cbuf = CharStreams.createBuffer();
   private final char[] buf = this.cbuf.array();
   private final Queue<String> lines = new LinkedList<>();
   private final LineBuffer lineBuf = new LineBuffer() {
      @Override
      protected void handleLine(String var1, String var2) {
         LineReader.this.lines.add(var1);
      }
   };

   public LineReader(Readable var1) {
      this.readable = Preconditions.checkNotNull(var1);
      this.reader = var1 instanceof Reader ? (Reader)var1 : null;
   }

   @CanIgnoreReturnValue
   public String readLine() {
      while (this.lines.peek() == null) {
         ((Buffer)this.cbuf).clear();
         int var1 = this.reader != null ? this.reader.read(this.buf, 0, this.buf.length) : this.readable.read(this.cbuf);
         if (var1 == -1) {
            this.lineBuf.finish();
            break;
         }

         this.lineBuf.add(this.buf, 0, var1);
      }

      return this.lines.poll();
   }
}
