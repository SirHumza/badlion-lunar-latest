package com.nothome.delta.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.Buffer;
import java.nio.CharBuffer;

public class Delta {
   static final boolean debug = false;
   public static final int DEFAULT_CHUNK_SIZE = 16;
   private int S;
   private Delta.SourceState source;
   private Delta.TargetState target;
   private DiffTextWriter output;

   public Delta() {
      this.setChunkSize(16);
   }

   public void setChunkSize(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("Invalid size");
      }

      this.S = var1;
   }

   public void compute(CharSequence var1, CharSequence var2, Writer var3) {
      this.compute(new CharBufferSeekableSource(var1), new StringReader(var2.toString()), new GDiffTextWriter(var3));
   }

   public String compute(CharSequence var1, CharSequence var2) {
      StringWriter var3 = new StringWriter();
      this.compute(var1, var2, var3);
      return var3.toString();
   }

   public void compute(SeekableSource var1, Reader var2, DiffTextWriter var3) {
      this.source = new Delta.SourceState(var1);
      this.target = new Delta.TargetState(var2);
      this.output = var3;

      while (!this.target.eof()) {
         this.debug("!target.eof()");
         int var4 = this.target.find(this.source);
         if (var4 != -1) {
            int var5 = var4 * this.S;
            this.source.seek(var5);
            int var6 = this.target.longestMatch(this.source);
            if (var6 >= this.S) {
               var3.addCopy(var5, var6);
            } else {
               ((Buffer)this.target.tbuf).position(this.target.tbuf.position() - var6);
               this.addData();
            }
         } else {
            this.addData();
         }
      }

      var3.close();
   }

   private void addData() {
      int var1 = this.target.read();
      if (var1 != -1) {
         this.output.addData((char)var1);
      }
   }

   private void debug(String var1) {
   }

   static Reader forFile(File var0) {
      FileInputStream var1 = new FileInputStream(var0);
      InputStreamReader var2 = new InputStreamReader(var1);
      return new BufferedReader(var2);
   }

   static CharSequence toString(Reader var0) {
      StringBuilder var1 = new StringBuilder();

      while (true) {
         int var2 = var0.read();
         if (var2 == -1) {
            return var1;
         }

         var1.append((char)var2);
      }
   }

   public static void main(String[] var0) {
      if (var0.length != 2) {
         System.err.println("Usage: java ...Delta file1 file2 [> somefile]");
      } else {
         Reader var1 = forFile(new File(var0[0]));
         File var2 = new File(var0[1]);
         Reader var3 = forFile(var2);
         CharSequence var4 = toString(var1);
         Delta var5 = new Delta();
         OutputStreamWriter var6 = new OutputStreamWriter(System.out);
         var5.compute(new CharBufferSeekableSource(var4), var3, new GDiffTextWriter(var6));
         var6.close();
      }
   }

   class SourceState {
      private Checksum checksum;
      private SeekableSource source;

      public SourceState(SeekableSource var2) {
         this.checksum = new Checksum(var2, Delta.this.S);
         this.source = var2;
         var2.seek(0L);
      }

      public void seek(long var1) {
         this.source.seek(var1);
      }

      @Override
      public String toString() {
         return "Source checksum=" + this.checksum + " source=" + this.source + "";
      }
   }

   class TargetState {
      private Readable c;
      private CharBuffer tbuf = CharBuffer.allocate(this.blocksize());
      private CharBuffer sbuf = CharBuffer.allocate(this.blocksize());
      private long hash;
      private boolean hashReset = true;
      private boolean eof;

      TargetState(Reader var2) {
         this.c = var2;
         ((Buffer)this.tbuf).limit(0);
      }

      private int blocksize() {
         return Math.max(8192, Delta.this.S * 4);
      }

      public int find(Delta.SourceState var1) {
         if (this.eof) {
            return -1;
         }

         ((Buffer)this.sbuf).clear();
         ((Buffer)this.sbuf).limit(0);
         if (this.hashReset) {
            Delta.this.debug("hashReset");

            while (this.tbuf.remaining() < Delta.this.S) {
               this.tbuf.compact();
               int var2 = this.c.read(this.tbuf);
               ((Buffer)this.tbuf).flip();
               if (var2 == -1) {
                  Delta.this.debug("target ending");
                  return -1;
               }
            }

            this.hash = Checksum.queryChecksum(this.tbuf, Delta.this.S);
            this.hashReset = false;
         }

         return var1.checksum.findChecksumIndex(this.hash);
      }

      public boolean eof() {
         return this.eof;
      }

      public int read() {
         if (this.tbuf.remaining() <= Delta.this.S) {
            this.readMore();
         }

         if (!this.tbuf.hasRemaining()) {
            this.eof = true;
            return -1;
         }

         char var1 = this.tbuf.get();
         if (this.tbuf.remaining() >= Delta.this.S) {
            char var2 = this.tbuf.get(this.tbuf.position() + Delta.this.S - 1);
            this.hash = Checksum.incrementChecksum(this.hash, var1, var2, Delta.this.S);
         } else {
            Delta.this.debug("out of char");
         }

         return var1;
      }

      public int longestMatch(Delta.SourceState var1) {
         Delta.this.debug("longestMatch");
         int var2 = 0;
         this.hashReset = true;

         while (true) {
            if (!this.sbuf.hasRemaining()) {
               ((Buffer)this.sbuf).clear();
               int var3 = var1.source.read(this.sbuf);
               ((Buffer)this.sbuf).flip();
               if (var3 == -1) {
                  return var2;
               }
            }

            if (!this.tbuf.hasRemaining()) {
               this.readMore();
               if (!this.tbuf.hasRemaining()) {
                  Delta.this.debug("target ending");
                  this.eof = true;
                  return var2;
               }
            }

            if (this.sbuf.get() != this.tbuf.get()) {
               ((Buffer)this.tbuf).position(this.tbuf.position() - 1);
               return var2;
            }

            var2++;
         }
      }

      private void readMore() {
         this.tbuf.compact();
         this.c.read(this.tbuf);
         ((Buffer)this.tbuf).flip();
      }

      void hash() {
         this.hash = Checksum.queryChecksum(this.tbuf, Delta.this.S);
      }

      @Override
      public String toString() {
         return "Target[ targetBuff=" + this.dump() + " sourceBuff=" + this.sbuf + " hashf=" + this.hash + " eof=" + this.eof + "]";
      }

      private String dump() {
         return this.dump(this.tbuf);
      }

      private String dump(CharBuffer var1) {
         ((Buffer)var1).mark();
         StringBuilder var2 = new StringBuilder();

         while (var1.hasRemaining()) {
            var2.append(var1.get());
         }

         ((Buffer)var1).reset();
         return var2.toString();
      }
   }
}
