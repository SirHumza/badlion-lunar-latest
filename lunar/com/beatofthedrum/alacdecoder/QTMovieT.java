package com.beatofthedrum.alacdecoder;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

class QTMovieT {
   private static final Logger logger = System.getLogger(QTMovieT.class.getName());
   MyStream qtStream;
   private DemuxResT res;
   int savedMDatPos = 0;

   public QTMovieT(DataInputStream var1) {
      this.qtStream = new MyStream(var1);
   }

   private static int makeFourCC32(int var0, int var1, int var2, int var3) {
      int var4 = var0 << 24;
      int var5 = var1;
      var4 |= var5 << 16;
      var5 = var2;
      var4 |= var5 << 8;
      var5 = var3;
      return var4 | var5;
   }

   private static int makeFourCC(int var0, int var1, int var2, int var3) {
      return var0 << 24 | var1 << 16 | var2 << 8 | var3;
   }

   static String splitFourCC(int var0) {
      char var1 = (char)(var0 >> 24 & 0xFF);
      char var2 = (char)(var0 >> 16 & 0xFF);
      char var3 = (char)(var0 >> 8 & 0xFF);
      char var4 = (char)(var0 & 0xFF);
      return var1 + " " + var2 + " " + var3 + " " + var4;
   }

   int setSavedMDat() {
      if (this.savedMDatPos == -1) {
         logger.log(Level.DEBUG, "stream contains mdat before moov but is not seekable");
         return 2;
      } else {
         logger.log(Level.TRACE, "savedMDatPos: " + this.savedMDatPos);
         return this.qtStream.position(this.savedMDatPos) != 0 ? 3 : 1;
      }
   }

   void readChunkMDat(int var1, int var2) {
      int var3 = var1 - 8;
      if (var3 != 0) {
         this.res.mdatLen = var3;
         if (var2 != 0) {
            this.savedMDatPos = this.qtStream.position();
            this.qtStream.skip(var3);
         }
      }
   }

   int readChunkMoov(int var1) {
      int var2 = var1 - 8;

      while (var2 != 0) {
         int var4 = 0;

         int var3;
         try {
            var3 = this.qtStream.readUInt32();
         } catch (IOException var6) {
            logger.log(Level.DEBUG, "(readChunkMoov) error reading subChunkLen - possibly number too large");
            var3 = 0;
         }

         if (var3 <= 1 || var3 > var2) {
            logger.log(Level.DEBUG, "strange size for chunk inside moov");
            return 0;
         }

         var4 = this.qtStream.readUInt32();
         if (var4 == makeFourCC32(109, 118, 104, 100)) {
            this.readChunkMvhd(var3);
         } else if (var4 == makeFourCC32(116, 114, 97, 107)) {
            if (this.readChunkTrak(var3) == 0) {
               return 0;
            }
         } else if (var4 == makeFourCC32(117, 100, 116, 97)) {
            this.readChunkUdta(var3);
         } else if (var4 == makeFourCC32(101, 108, 115, 116)) {
            this.readChunkElst(var3);
         } else if (var4 == makeFourCC32(105, 111, 100, 115)) {
            this.readChunkIods(var3);
         } else {
            if (var4 != makeFourCC32(102, 114, 101, 101)) {
               logger.log(Level.DEBUG, "(moov) unknown chunk id: " + splitFourCC(var4));
               return 0;
            }

            this.qtStream.skip(var3 - 8);
         }

         var2 -= var3;
      }

      return 1;
   }

   void readChunkIods(int var1) {
      int var2 = var1 - 8;
      this.qtStream.skip(var2);
   }

   void readChunkUdta(int var1) {
      int var2 = var1 - 8;
      this.qtStream.skip(var2);
   }

   void readChunkMvhd(int var1) {
      int var2 = var1 - 8;
      this.qtStream.skip(var2);
   }

   int readChunkTrak(int var1) {
      int var2 = var1 - 8;

      while (var2 != 0) {
         int var4 = 0;

         int var3;
         try {
            var3 = this.qtStream.readUInt32();
         } catch (IOException var6) {
            logger.log(Level.DEBUG, "(readChunkTrak) error reading subChunkLen - possibly number too large");
            var3 = 0;
         }

         if (var3 <= 1 || var3 > var2) {
            logger.log(Level.DEBUG, "strange size for chunk inside trak");
            return 0;
         }

         var4 = this.qtStream.readUInt32();
         if (var4 == makeFourCC32(116, 107, 104, 100)) {
            this.readChunkTkhd(var3);
         } else if (var4 == makeFourCC32(109, 100, 105, 97)) {
            if (this.readChunkMdia(var3) == 0) {
               return 0;
            }
         } else {
            if (var4 != makeFourCC32(101, 100, 116, 115)) {
               logger.log(Level.DEBUG, "(trak) unknown chunk id: " + splitFourCC(var4));
               return 0;
            }

            this.readChunkEdts(var3);
         }

         var2 -= var3;
      }

      return 1;
   }

   int readChunkMdia(int var1) {
      int var2 = var1 - 8;

      while (var2 != 0) {
         int var4 = 0;

         int var3;
         try {
            var3 = this.qtStream.readUInt32();
         } catch (IOException var6) {
            logger.log(Level.DEBUG, "(readChunkMdia) error reading subChunkLen - possibly number too large");
            var3 = 0;
         }

         if (var3 <= 1 || var3 > var2) {
            logger.log(Level.DEBUG, "strange size for chunk inside mdia\n");
            return 0;
         }

         var4 = this.qtStream.readUInt32();
         if (var4 == makeFourCC32(109, 100, 104, 100)) {
            this.readChunkMdhd(var3);
         } else if (var4 == makeFourCC32(104, 100, 108, 114)) {
            this.readChunkHdlr(var3);
         } else {
            if (var4 != makeFourCC32(109, 105, 110, 102)) {
               logger.log(Level.DEBUG, "(mdia) unknown chunk id: " + splitFourCC(var4));
               return 0;
            }

            if (this.readChunkMinf(var3) == 0) {
               return 0;
            }
         }

         var2 -= var3;
      }

      return 1;
   }

   int readChunkMinf(int var1) {
      int var4 = var1 - 8;

      int var5;
      try {
         var5 = this.qtStream.readUInt32();
      } catch (IOException var9) {
         logger.log(Level.DEBUG, "(readChunkMinf) error reading mediaInfoSize - possibly number too large");
         var5 = 0;
      }

      if (var5 != 16) {
         logger.log(Level.DEBUG, "unexpected size in media info\n");
         return 0;
      }

      if (this.qtStream.readUInt32() != makeFourCC32(115, 109, 104, 100)) {
         logger.log(Level.DEBUG, "not a sound header! can't handle this.");
         return 0;
      }

      this.qtStream.skip(8);
      var4 -= 16;

      int var2;
      try {
         var2 = this.qtStream.readUInt32();
      } catch (IOException var8) {
         logger.log(Level.DEBUG, "(readChunkMinf) error reading dinfSize - possibly number too large");
         var2 = 0;
      }

      if (this.qtStream.readUInt32() != makeFourCC32(100, 105, 110, 102)) {
         logger.log(Level.DEBUG, "expected dinf, didn't get it.");
         return 0;
      }

      this.qtStream.skip(var2 - 8);
      var4 -= var2;

      int var3;
      try {
         var3 = this.qtStream.readUInt32();
      } catch (Exception var7) {
         logger.log(Level.DEBUG, "(readChunkMinf) error reading stblSize - possibly number too large");
         var3 = 0;
      }

      if (this.qtStream.readUInt32() != makeFourCC32(115, 116, 98, 108)) {
         logger.log(Level.DEBUG, "expected stbl, didn't get it.");
         return 0;
      }

      if (this.readChunkStbl(var3) == 0) {
         return 0;
      }

      var4 -= var3;
      if (var4 != 0) {
         logger.log(Level.DEBUG, "(readChunkMinf) - size remaining?");
         this.qtStream.skip(var4);
      }

      return 1;
   }

   private void readChunkStsc(int var1) {
      MyStream var2 = this.qtStream;
      var2.skip(4);
      int var3 = var2.readUInt32();
      this.res.stsc = new DemuxResT.ChunkInfo[var3];

      for (int var4 = 0; var4 < var3; var4++) {
         DemuxResT.ChunkInfo var5 = new DemuxResT.ChunkInfo();
         var5.firstChunk = var2.readUInt32();
         var5.samplesPerChunk = var2.readUInt32();
         var5.sampleDescIndex = var2.readUInt32();
         this.res.stsc[var4] = var5;
      }
   }

   private void readChunkStco(int var1) {
      MyStream var2 = this.qtStream;
      var2.skip(4);
      int var3 = var2.readUInt32();
      this.res.stco = new int[var3];

      for (int var4 = 0; var4 < var3; var4++) {
         this.res.stco[var4] = var2.readUInt32();
      }
   }

   int readChunkStbl(int var1) {
      int var2 = var1 - 8;

      while (var2 != 0) {
         int var4 = 0;

         int var3;
         try {
            var3 = this.qtStream.readUInt32();
         } catch (IOException var6) {
            logger.log(Level.DEBUG, "(readChunkStbl) error reading subChunkLen - possibly number too large");
            var3 = 0;
         }

         if (var3 <= 1 || var3 > var2) {
            logger.log(Level.DEBUG, "strange size for chunk inside stbl " + var3 + " (remaining: " + var2 + ")");
            return 0;
         }

         var4 = this.qtStream.readUInt32();
         if (var4 == makeFourCC32(115, 116, 115, 100)) {
            if (this.readChunkStsd(var3) == 0) {
               return 0;
            }
         } else if (var4 == makeFourCC32(115, 116, 116, 115)) {
            this.readChunkStts(var3);
         } else if (var4 == makeFourCC32(115, 116, 115, 122)) {
            this.readChunkStsz(var3);
         } else if (var4 == makeFourCC32(115, 116, 115, 99)) {
            this.readChunkStsc(var3);
         } else {
            if (var4 != makeFourCC32(115, 116, 99, 111)) {
               logger.log(Level.DEBUG, "(stbl) unknown chunk id: " + splitFourCC(var4));
               return 0;
            }

            this.readChunkStco(var3);
         }

         var2 -= var3;
      }

      return 1;
   }

   void readChunkStsz(int var1) {
      int var2 = 0;
      int var3 = 0;
      int var4 = var1 - 8;
      this.qtStream.readUint8();
      var4--;
      this.qtStream.readUint8();
      this.qtStream.readUint8();
      this.qtStream.readUint8();
      var4 -= 3;
      var3 = this.qtStream.readUInt32();
      if (var3 != 0) {
         int var15 = 0;
         var15 = this.qtStream.readUInt32();
         this.res.sampleByteSize = new int[var15];

         for (int var6 = 0; var6 < var15; var6++) {
            this.res.sampleByteSize[var6] = var3;
         }

         var4 -= 4;
      } else {
         var4 -= 4;

         try {
            var2 = this.qtStream.readUInt32();
         } catch (IOException var7) {
            logger.log(Level.DEBUG, "(readChunkStsz) error reading numEntries - possibly number too large");
            var2 = 0;
         }

         var4 -= 4;
         this.res.sampleByteSize = new int[var2];

         for (int var5 = 0; var5 < var2; var5++) {
            this.res.sampleByteSize[var5] = this.qtStream.readUInt32();
            var4 -= 4;
         }

         if (var4 != 0) {
            logger.log(Level.DEBUG, "(readChunkStsz) size remaining?");
            this.qtStream.skip(var4);
         }
      }
   }

   void readChunkStts(int var1) {
      int var2 = 0;
      int var3 = var1 - 8;
      this.qtStream.readUint8();
      var3--;
      this.qtStream.readUint8();
      this.qtStream.readUint8();
      this.qtStream.readUint8();
      var3 -= 3;

      try {
         var2 = this.qtStream.readUInt32();
      } catch (IOException var5) {
         logger.log(Level.DEBUG, "(readChunkStsz) error reading numentries - possibly number too large");
         var2 = 0;
      }

      var3 -= 4;
      this.res.numTimeToSamples = var2;

      for (int var4 = 0; var4 < var2; var4++) {
         this.res.timeToSample[var4].sampleCount = this.qtStream.readUInt32();
         this.res.timeToSample[var4].sampleDuration = this.qtStream.readUInt32();
         var3 -= 8;
      }

      if (var3 != 0) {
         logger.log(Level.DEBUG, "(readChunkStsz) size remaining?");
         this.qtStream.skip(var3);
      }
   }

   int readChunkStsd(int var1) {
      int var2 = 0;
      int var3 = var1 - 8;
      this.qtStream.readUint8();
      var3--;
      this.qtStream.readUint8();
      this.qtStream.readUint8();
      this.qtStream.readUint8();
      var3 -= 3;

      try {
         var2 = this.qtStream.readUInt32();
      } catch (IOException var9) {
         logger.log(Level.DEBUG, "(readChunkStsd) error reading numentries - possibly number too large");
         var2 = 0;
      }

      var3 -= 4;
      if (var2 != 1) {
         logger.log(Level.DEBUG, "only expecting one entry in sample description atom!");
         return 0;
      }

      for (int var4 = 0; var4 < var2; var4++) {
         int var5 = this.qtStream.readUInt32();
         this.res.format = this.qtStream.readUInt32();
         int var7 = var5;
         var7 -= 8;
         if (this.res.format != makeFourCC32(97, 108, 97, 99)) {
            logger.log(Level.DEBUG, "(readChunkStsd) error reading description atom - expecting file, got " + splitFourCC(this.res.format));
            return 0;
         }

         this.qtStream.skip(6);
         var7 -= 6;
         int var6 = this.qtStream.readUInt16();
         if (var6 != 1) {
            logger.log(Level.DEBUG, "unknown version??");
         }

         var7 -= 2;
         this.qtStream.readUInt16();
         this.qtStream.readUInt32();
         var7 -= 6;
         this.qtStream.readUInt16();
         var7 -= 2;
         this.qtStream.skip(4);
         var7 -= 4;
         this.qtStream.readUInt16();
         this.qtStream.readUInt16();
         var7 -= 4;
         this.qtStream.skip(4);
         var7 -= 4;
         this.res.codecDataLen = var7 + 12 + 8;
         if (this.res.codecDataLen > this.res.codecData.length) {
            logger.log(Level.DEBUG, "(readChunkStsd) unexpected codec data length read from atom " + this.res.codecDataLen);
            return 0;
         }

         for (int var8 = 0; var8 < this.res.codecDataLen; var8++) {
            this.res.codecData[var8] = 0;
         }

         this.res.codecData[0] = 201326592;
         this.res.codecData[1] = makeFourCC(97, 109, 114, 102);
         this.res.codecData[2] = makeFourCC(99, 97, 108, 97);
         this.qtStream.read(var7, this.res.codecData, 12);
         var7 -= var7;
         byte var23 = 29;
         this.res.sampleSize = this.res.codecData[var23] & 0xFF;
         var23 = 33;
         this.res.numChannels = this.res.codecData[var23] & 0xFF;
         var23 = 44;
         this.res.sampleRate = (this.res.codecData[var23] & 0xFF) << 24
            | (this.res.codecData[var23 + 1] & 0xFF) << 16
            | (this.res.codecData[var23 + 2] & 0xFF) << 8
            | this.res.codecData[var23 + 3] & 0xFF;
         if (var7 != 0) {
            this.qtStream.skip(var7);
         }

         this.res.formatRead = 1;
         if (this.res.format != makeFourCC32(97, 108, 97, 99)) {
            return 0;
         }
      }

      return 1;
   }

   void readChunkHdlr(int var1) {
      int var2 = var1 - 8;
      this.qtStream.readUint8();
      var2--;
      this.qtStream.readUint8();
      this.qtStream.readUint8();
      this.qtStream.readUint8();
      var2 -= 3;
      int var3 = this.qtStream.readUInt32();
      int var4 = this.qtStream.readUInt32();
      var2 -= 8;
      this.qtStream.readUInt32();
      var2 -= 4;
      this.qtStream.readUInt32();
      this.qtStream.readUInt32();
      var2 -= 8;
      int var5 = this.qtStream.readUint8();
      this.qtStream.skip(--var2);
   }

   void readChunkElst(int var1) {
      int var2 = var1 - 8;
      this.qtStream.skip(var2);
   }

   void readChunkEdts(int var1) {
      int var2 = var1 - 8;
      this.qtStream.skip(var2);
   }

   void readChunkMdhd(int var1) {
      int var2 = var1 - 8;
      this.qtStream.skip(var2);
   }

   void readChunkTkhd(int var1) {
      int var2 = var1 - 8;
      this.qtStream.skip(var2);
   }

   void readChunkFtyp(int var1) {
      int var2 = var1 - 8;
      int var3 = this.qtStream.readUInt32();
      var2 -= 4;
      if (var3 != makeFourCC32(77, 52, 65, 32)) {
         logger.log(Level.DEBUG, "not M4A file");
      } else {
         int var4 = this.qtStream.readUInt32();

         for (int var6 = var2 - 4; var6 != 0; var6 -= 4) {
            this.qtStream.readUInt32();
         }
      }
   }

   public int read(DemuxResT var1) {
      boolean var2 = false;
      boolean var3 = false;
      this.res = var1;

      while (true) {
         logger.log(Level.TRACE, "available: " + this.qtStream.stream.available());
         int var5 = 0;

         int var4;
         try {
            var4 = this.qtStream.readUInt32();
         } catch (IOException var7) {
            logger.log(Level.WARNING, "(top) error reading chunkLen - possibly number too large");
            var4 = 1;
         }

         if (this.qtStream.isEof() != 0) {
            return 0;
         }

         if (var4 == 1) {
            logger.log(Level.DEBUG, "need 64bit support");
            return 0;
         }

         var5 = this.qtStream.readUInt32();
         logger.log(Level.TRACE, "fourcc: " + splitFourCC(var5) + ", " + var4);
         if (var5 == makeFourCC32(102, 116, 121, 112)) {
            this.readChunkFtyp(var4);
         } else if (var5 == makeFourCC32(109, 111, 111, 118)) {
            if (this.readChunkMoov(var4) == 0) {
               return 0;
            }

            if (var3) {
               return this.setSavedMDat();
            }

            var2 = true;
         } else if (var5 == makeFourCC32(109, 100, 97, 116)) {
            byte var6 = 0;
            if (!var2) {
               var6 = 1;
            }

            this.readChunkMDat(var4, var6);
            if (var2) {
               return 1;
            }

            var3 = true;
         } else if (var5 == makeFourCC32(102, 114, 101, 101)) {
            this.qtStream.skip(var4 - 8);
         } else {
            if (var5 != makeFourCC32(106, 117, 110, 107)) {
               logger.log(Level.DEBUG, "(top) unknown chunk id: " + splitFourCC(var5));
               return 0;
            }

            this.qtStream.skip(var4 - 8);
         }
      }
   }
}
