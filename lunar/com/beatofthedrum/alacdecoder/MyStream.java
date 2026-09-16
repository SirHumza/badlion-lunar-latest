package com.beatofthedrum.alacdecoder;

import java.io.DataInputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

class MyStream {
   private static final Logger logger = System.getLogger(MyStream.class.getName());
   DataInputStream stream;
   int currentPos = 0;
   private final byte[] readBuf = new byte[8];

   MyStream(DataInputStream var1) {
      this.stream = var1;
   }

   int position(int var1) {
      return -1;
   }

   int position() {
      return this.currentPos;
   }

   int isEof() {
      return 0;
   }

   void skip(int var1) {
      int var2 = var1;
      int var3 = 0;
      if (var2 < 0) {
         throw new IllegalArgumentException("skip: request to seek backwards in stream - not supported, sorry");
      }

      logger.log(Level.TRACE, "skip: " + var2);
      var3 = this.stream.skipBytes(var2);
      this.currentPos += var3;
   }

   int readUint8() {
      byte[] var1 = this.readBuf;
      int var2 = this.stream.read(var1, 0, 1);
      int var3 = var1[0] & 255;
      this.currentPos++;
      return var3;
   }

   int readUInt16() {
      int var1 = 0;
      int var2 = 0;
      byte[] var3 = this.readBuf;
      int var4 = 0;
      var4 = this.stream.read(var3, 0, 2);
      this.currentPos += var4;
      var2 = var3[0] & 255;
      var1 = var2 << 8;
      var2 = var3[1] & 255;
      return var1 | var2;
   }

   int readInt16() {
      short var1 = this.stream.readShort();
      this.currentPos += 2;
      return var1;
   }

   int readUInt32() {
      byte[] var1 = this.readBuf;
      int var2 = this.stream.read(var1, 0, 4);
      this.currentPos += var2;
      int var3 = var1[0] & 255;
      int var4 = var3 << 24;
      var3 = var1[1] & 255;
      var4 |= var3 << 16;
      var3 = var1[2] & 255;
      var4 |= var3 << 8;
      var3 = var1[3] & 255;
      return var4 | var3;
   }

   int read(int var1, byte[] var2, int var3) {
      int var4 = 0;
      var4 = this.stream.read(var2, var3, var1);
      this.currentPos += var4;
      return var4;
   }

   void read(int var1, int[] var2, int var3) {
      byte[] var4 = new byte[var1];
      int var5 = this.read(var1, var4, 0);

      for (int var6 = 0; var6 < var5; var6++) {
         var2[var3 + var6] = var4[var6];
      }
   }
}
