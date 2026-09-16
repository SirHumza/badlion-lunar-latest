package com.nothome.delta;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Delta {
   static final boolean debug = false;
   public static final int DEFAULT_CHUNK_SIZE = 16;
   private int S;
   private Delta.SourceState source;
   private Delta.TargetState target;
   private DiffWriter output;

   public Delta() {
      this.setChunkSize(16);
   }

   public void setChunkSize(int var1) {
      if (var1 <= 0) {
         throw new IllegalArgumentException("Invalid size");
      }

      this.S = var1;
   }

   public void compute(byte[] var1, byte[] var2, OutputStream var3) {
      this.compute(new ByteBufferSeekableSource(var1), new ByteArrayInputStream(var2), new GDiffWriter(var3));
   }

   public byte[] compute(byte[] var1, byte[] var2) {
      ByteArrayOutputStream var3 = new ByteArrayOutputStream();
      this.compute(var1, var2, var3);
      return var3.toByteArray();
   }

   public void compute(byte[] var1, InputStream var2, DiffWriter var3) {
      this.compute(new ByteBufferSeekableSource(var1), var2, var3);
   }

   public void compute(File var1, File var2, DiffWriter var3) {
      RandomAccessFileSeekableSource var4 = new RandomAccessFileSeekableSource(new RandomAccessFile(var1, "r"));
      BufferedInputStream var5 = new BufferedInputStream(new FileInputStream(var2));

      try {
         this.compute(var4, var5, var3);
      } finally {
         var4.close();
         var5.close();
      }
   }

   public void compute(SeekableSource var1, InputStream var2, DiffWriter var3) {
      this.source = new Delta.SourceState(var1);
      this.target = new Delta.TargetState(var2);
      this.output = var3;

      while (!this.target.eof()) {
         this.debug("!target.eof()");
         int var4 = this.target.find(this.source);
         if (var4 != -1) {
            long var5 = (long)var4 * this.S;
            this.source.seek(var5);
            int var7 = this.target.longestMatch(this.source);
            if (var7 >= this.S) {
               var3.addCopy(var5, var7);
            } else {
               ((Buffer)this.target.tbuf).position(this.target.tbuf.position() - var7);
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
         this.output.addData((byte)var1);
      }
   }

   public static void main(String[] var0) {
      if (var0.length != 3) {
         System.err.println("usage Delta [-d] source target [output]");
         System.err.println("either -d or an output filename must be specified.");
         System.err.println("aborting..");
      } else {
         DiffWriter var1;
         File var2;
         File var3;
         if (var0[0].equals("-d")) {
            var2 = new File(var0[1]);
            var3 = new File(var0[2]);
            var1 = new DebugDiffWriter();
         } else {
            var2 = new File(var0[0]);
            var3 = new File(var0[1]);
            var1 = new GDiffWriter(new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File(var0[2])))));
         }

         if (var2.length() <= 2147483647L && var3.length() <= 2147483647L) {
            Delta var4 = new Delta();
            var4.compute(var2, var3, var1);
            var1.flush();
            var1.close();
         } else {
            System.err.println("source or target is too large, max length is 2147483647");
            System.err.println("aborting..");
            var1.close();
         }
      }
   }

   private void debug(String var1) {
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
      private ReadableByteChannel c;
      private ByteBuffer tbuf = ByteBuffer.allocate(this.blocksize());
      private ByteBuffer sbuf = ByteBuffer.allocate(this.blocksize());
      private long hash;
      private boolean hashReset = true;
      private boolean eof;

      TargetState(InputStream var2) {
         this.c = Channels.newChannel(var2);
         ((Buffer)this.tbuf).limit(0);
      }

      private int blocksize() {
         return Math.min(16384, Delta.this.S * 4);
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
            if (!this.tbuf.hasRemaining()) {
               this.eof = true;
               return -1;
            }
         }

         byte var1 = this.tbuf.get();
         if (this.tbuf.remaining() >= Delta.this.S) {
            byte var2 = this.tbuf.get(this.tbuf.position() + Delta.this.S - 1);
            this.hash = Checksum.incrementChecksum(this.hash, var1, var2, Delta.this.S);
         } else {
            Delta.this.debug("out of char");
         }

         return var1 & 0xFF;
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

      private String dump(ByteBuffer var1) {
         return this.getTextDump(var1);
      }

      private void append(StringBuffer var1, int var2) {
         char var3 = (char)(var2 >> 4 & 15);
         char var4 = (char)(var2 & 15);
         var1.append(Character.forDigit(var3, 16));
         var1.append(Character.forDigit(var4, 16));
      }

      public String getTextDump(ByteBuffer var1) {
         StringBuffer var2 = new StringBuffer(var1.remaining() * 2);
         ((Buffer)var1).mark();

         while (var1.hasRemaining()) {
            byte var3 = var1.get();
            if (var3 > 32 && var3 < 127) {
               var2.append(" ").append((char)var3);
            } else {
               this.append(var2, var3);
            }
         }

         ((Buffer)var1).reset();
         return var2.toString();
      }
   }
}
