package com.nothome.delta.text;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.CharBuffer;

public class TextPatcher {
   private SeekableSource source;
   private CharBuffer buf = CharBuffer.allocate(1024);

   public TextPatcher(SeekableSource var1) {
      if (var1 == null) {
         throw new NullPointerException("source");
      }

      this.source = var1;
   }

   public TextPatcher(CharSequence var1) {
      this.source = new CharBufferSeekableSource(var1);
   }

   public String patch(CharSequence var1) {
      if (var1 == null) {
         throw new NullPointerException("patch");
      }

      StringWriter var2 = new StringWriter();

      try {
         this.patch(new StringReader(var1.toString()), var2);
         return var2.toString();
      } catch (IOException var4) {
         throw new IllegalArgumentException("Invalid patch: " + var4, var4);
      }
   }

   private long l(String var1) {
      return Long.parseLong(var1, 16);
   }

   public void patch(Reader var1, Writer var2) {
      if (var1 == null) {
         throw new NullPointerException("patch");
      }

      if (var2 == null) {
         throw new NullPointerException("out");
      }

      BufferedReader var3;
      if (var1 instanceof BufferedReader) {
         var3 = (BufferedReader)var1;
      } else {
         var3 = new BufferedReader(var1);
      }

      String var4 = var3.readLine();
      if (var4 == null) {
         throw new EOFException();
      }

      if (!var4.equals("gdt")) {
         throw new IOException("Unexpected header: " + var4);
      }

      int var6 = 0;

      String var5;
      while ((var5 = var3.readLine()) != null) {
         var6++;
         if (var5.length() == 0) {
            throw new IOException("invalid empty line: " + var6);
         }

         char var7 = var5.charAt(0);
         if (var7 == 'y') {
            int var8 = var5.indexOf(44);
            if (var8 == -1) {
               throw new IOException(", not found");
            }

            long var9 = this.l(var5.substring(1, var8));
            long var11 = this.l(var5.substring(var8 + 1));
            this.source.seek(var9);
            this.copy(this.source, var2, (int)var11);
         } else {
            if (var7 != 'i') {
               throw new IOException("invalid patch command: " + var6);
            }

            long var13 = this.l(var5.substring(1));
            this.copy(var3, var2, (int)var13);
            var3.readLine();
         }
      }

      var2.flush();
   }

   private void copy(Readable var1, Writer var2, int var3) {
      while (var3 > 0) {
         if (this.buf.limit() > var3) {
            ((Buffer)this.buf).limit(var3);
         }

         int var4 = var1.read(this.buf);
         if (var4 == -1) {
            throw new IOException("EOF in chunk");
         }

         ((Buffer)this.buf).flip();
         var2.append(this.buf);
         var3 -= var4;
      }
   }
}
