package org.apache.commons.compress.archivers.sevenz;

import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.zip.CRC32;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.utils.CRC32VerifyingInputStream;
import org.apache.commons.compress.utils.IOUtils;

public class SevenZFile implements Closeable {
   static final int SIGNATURE_HEADER_SIZE = 32;
   private RandomAccessFile file;
   private final Archive archive;
   private int currentEntryIndex = -1;
   private int currentFolderIndex = -1;
   private InputStream currentFolderInputStream = null;
   private InputStream currentEntryInputStream = null;
   private byte[] password;
   static final byte[] sevenZSignature = new byte[]{55, 122, -68, -81, 39, 28};

   public SevenZFile(File var1, byte[] var2) {
      boolean var3 = false;
      this.file = new RandomAccessFile(var1, "r");

      try {
         this.archive = this.readHeaders(var2);
         if (var2 != null) {
            this.password = new byte[var2.length];
            System.arraycopy(var2, 0, this.password, 0, var2.length);
         } else {
            this.password = null;
         }

         var3 = true;
      } finally {
         if (!var3) {
            this.file.close();
         }
      }
   }

   public SevenZFile(File var1) {
      this(var1, null);
   }

   @Override
   public void close() {
      if (this.file != null) {
         try {
            this.file.close();
         } finally {
            this.file = null;
            if (this.password != null) {
               Arrays.fill(this.password, (byte)0);
            }

            this.password = null;
         }
      }
   }

   public SevenZArchiveEntry getNextEntry() {
      if (this.currentEntryIndex >= this.archive.files.length - 1) {
         return null;
      }

      this.currentEntryIndex++;
      SevenZArchiveEntry var1 = this.archive.files[this.currentEntryIndex];
      this.buildDecodingStream();
      return var1;
   }

   private Archive readHeaders(byte[] var1) {
      byte[] var2 = new byte[6];
      this.file.readFully(var2);
      if (!Arrays.equals(var2, sevenZSignature)) {
         throw new IOException("Bad 7z signature");
      }

      byte var3 = this.file.readByte();
      byte var4 = this.file.readByte();
      if (var3 != 0) {
         throw new IOException(String.format("Unsupported 7z version (%d,%d)", var3, var4));
      }

      long var5 = 4294967295L & Integer.reverseBytes(this.file.readInt());
      StartHeader var7 = this.readStartHeader(var5);
      int var8 = (int)var7.nextHeaderSize;
      if (var8 != var7.nextHeaderSize) {
         throw new IOException("cannot handle nextHeaderSize " + var7.nextHeaderSize);
      }

      this.file.seek(32L + var7.nextHeaderOffset);
      byte[] var9 = new byte[var8];
      this.file.readFully(var9);
      CRC32 var10 = new CRC32();
      var10.update(var9);
      if (var7.nextHeaderCrc != var10.getValue()) {
         throw new IOException("NextHeader CRC mismatch");
      }

      ByteArrayInputStream var11 = new ByteArrayInputStream(var9);
      DataInputStream var12 = new DataInputStream(var11);
      Archive var13 = new Archive();
      int var14 = var12.readUnsignedByte();
      if (var14 == 23) {
         var12 = this.readEncodedHeader(var12, var13, var1);
         var13 = new Archive();
         var14 = var12.readUnsignedByte();
      }

      if (var14 == 1) {
         this.readHeader(var12, var13);
         var12.close();
         return var13;
      } else {
         throw new IOException("Broken or unsupported archive: no Header");
      }
   }

   private StartHeader readStartHeader(long var1) {
      StartHeader var3 = new StartHeader();
      DataInputStream var4 = null;

      try {
         var4 = new DataInputStream(new CRC32VerifyingInputStream(new BoundedRandomAccessFileInputStream(this.file, 20L), 20L, var1));
         var3.nextHeaderOffset = Long.reverseBytes(var4.readLong());
         var3.nextHeaderSize = Long.reverseBytes(var4.readLong());
         var3.nextHeaderCrc = 4294967295L & Integer.reverseBytes(var4.readInt());
         return var3;
      } finally {
         if (var4 != null) {
            var4.close();
         }
      }
   }

   private void readHeader(DataInput var1, Archive var2) {
      int var3 = var1.readUnsignedByte();
      if (var3 == 2) {
         this.readArchiveProperties(var1);
         var3 = var1.readUnsignedByte();
      }

      if (var3 == 3) {
         throw new IOException("Additional streams unsupported");
      }

      if (var3 == 4) {
         this.readStreamsInfo(var1, var2);
         var3 = var1.readUnsignedByte();
      }

      if (var3 == 5) {
         this.readFilesInfo(var1, var2);
         var3 = var1.readUnsignedByte();
      }

      if (var3 != 0) {
         throw new IOException("Badly terminated header, found " + var3);
      }
   }

   private void readArchiveProperties(DataInput var1) {
      for (int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
         long var3 = readUint64(var1);
         byte[] var5 = new byte[(int)var3];
         var1.readFully(var5);
      }
   }

   private DataInputStream readEncodedHeader(DataInputStream var1, Archive var2, byte[] var3) {
      this.readStreamsInfo(var1, var2);
      Folder var4 = var2.folders[0];
      boolean var5 = false;
      long var6 = 32L + var2.packPos + 0L;
      this.file.seek(var6);
      InputStream var8 = new BoundedRandomAccessFileInputStream(this.file, var2.packSizes[0]);

      for (Coder var10 : var4.getOrderedCoders()) {
         if (var10.numInStreams != 1L || var10.numOutStreams != 1L) {
            throw new IOException("Multi input/output stream coders are not yet supported");
         }

         var8 = Coders.addDecoder(var8, var4.getUnpackSizeForCoder(var10), var10, var3);
      }

      if (var4.hasCrc) {
         var8 = new CRC32VerifyingInputStream(var8, var4.getUnpackSize(), var4.crc);
      }

      byte[] var14 = new byte[(int)var4.getUnpackSize()];
      DataInputStream var15 = new DataInputStream(var8);

      try {
         var15.readFully(var14);
      } finally {
         var15.close();
      }

      return new DataInputStream(new ByteArrayInputStream(var14));
   }

   private void readStreamsInfo(DataInput var1, Archive var2) {
      int var3 = var1.readUnsignedByte();
      if (var3 == 6) {
         this.readPackInfo(var1, var2);
         var3 = var1.readUnsignedByte();
      }

      if (var3 == 7) {
         this.readUnpackInfo(var1, var2);
         var3 = var1.readUnsignedByte();
      } else {
         var2.folders = new Folder[0];
      }

      if (var3 == 8) {
         this.readSubStreamsInfo(var1, var2);
         var3 = var1.readUnsignedByte();
      }

      if (var3 != 0) {
         throw new IOException("Badly terminated StreamsInfo");
      }
   }

   private void readPackInfo(DataInput var1, Archive var2) {
      var2.packPos = readUint64(var1);
      long var3 = readUint64(var1);
      int var5 = var1.readUnsignedByte();
      if (var5 == 9) {
         var2.packSizes = new long[(int)var3];

         for (int var6 = 0; var6 < var2.packSizes.length; var6++) {
            var2.packSizes[var6] = readUint64(var1);
         }

         var5 = var1.readUnsignedByte();
      }

      if (var5 == 10) {
         var2.packCrcsDefined = this.readAllOrBits(var1, (int)var3);
         var2.packCrcs = new long[(int)var3];

         for (int var7 = 0; var7 < (int)var3; var7++) {
            if (var2.packCrcsDefined.get(var7)) {
               var2.packCrcs[var7] = 4294967295L & Integer.reverseBytes(var1.readInt());
            }
         }

         var5 = var1.readUnsignedByte();
      }

      if (var5 != 0) {
         throw new IOException("Badly terminated PackInfo (" + var5 + ")");
      }
   }

   private void readUnpackInfo(DataInput var1, Archive var2) {
      int var3 = var1.readUnsignedByte();
      if (var3 != 11) {
         throw new IOException("Expected kFolder, got " + var3);
      }

      long var4 = readUint64(var1);
      Folder[] var6 = new Folder[(int)var4];
      var2.folders = var6;
      int var7 = var1.readUnsignedByte();
      if (var7 != 0) {
         throw new IOException("External unsupported");
      }

      for (int var8 = 0; var8 < (int)var4; var8++) {
         var6[var8] = this.readFolder(var1);
      }

      var3 = var1.readUnsignedByte();
      if (var3 != 12) {
         throw new IOException("Expected kCodersUnpackSize, got " + var3);
      }

      for (Folder var11 : var6) {
         var11.unpackSizes = new long[(int)var11.totalOutputStreams];

         for (int var12 = 0; var12 < var11.totalOutputStreams; var12++) {
            var11.unpackSizes[var12] = readUint64(var1);
         }
      }

      var3 = var1.readUnsignedByte();
      if (var3 == 10) {
         BitSet var16 = this.readAllOrBits(var1, (int)var4);

         for (int var17 = 0; var17 < (int)var4; var17++) {
            if (var16.get(var17)) {
               var6[var17].hasCrc = true;
               var6[var17].crc = 4294967295L & Integer.reverseBytes(var1.readInt());
            } else {
               var6[var17].hasCrc = false;
            }
         }

         var3 = var1.readUnsignedByte();
      }

      if (var3 != 0) {
         throw new IOException("Badly terminated UnpackInfo");
      }
   }

   private void readSubStreamsInfo(DataInput var1, Archive var2) {
      for (Folder var6 : var2.folders) {
         var6.numUnpackSubStreams = 1;
      }

      int var17 = var2.folders.length;
      int var18 = var1.readUnsignedByte();
      if (var18 == 13) {
         var17 = 0;

         for (Folder var8 : var2.folders) {
            long var9 = readUint64(var1);
            var8.numUnpackSubStreams = (int)var9;
            var17 = (int)(var17 + var9);
         }

         var18 = var1.readUnsignedByte();
      }

      SubStreamsInfo var20 = new SubStreamsInfo();
      var20.unpackSizes = new long[var17];
      var20.hasCrc = new BitSet(var17);
      var20.crcs = new long[var17];
      int var22 = 0;

      for (Folder var10 : var2.folders) {
         if (var10.numUnpackSubStreams != 0) {
            long var11 = 0L;
            if (var18 == 9) {
               for (int var13 = 0; var13 < var10.numUnpackSubStreams - 1; var13++) {
                  long var14 = readUint64(var1);
                  var20.unpackSizes[var22++] = var14;
                  var11 += var14;
               }
            }

            var20.unpackSizes[var22++] = var10.getUnpackSize() - var11;
         }
      }

      if (var18 == 9) {
         var18 = var1.readUnsignedByte();
      }

      int var24 = 0;

      for (Folder var34 : var2.folders) {
         if (var34.numUnpackSubStreams != 1 || !var34.hasCrc) {
            var24 += var34.numUnpackSubStreams;
         }
      }

      if (var18 == 10) {
         BitSet var27 = this.readAllOrBits(var1, var24);
         long[] var30 = new long[var24];

         for (int var32 = 0; var32 < var24; var32++) {
            if (var27.get(var32)) {
               var30[var32] = 4294967295L & Integer.reverseBytes(var1.readInt());
            }
         }

         int var33 = 0;
         int var35 = 0;

         for (Folder var15 : var2.folders) {
            if (var15.numUnpackSubStreams == 1 && var15.hasCrc) {
               var20.hasCrc.set(var33, true);
               var20.crcs[var33] = var15.crc;
               var33++;
            } else {
               for (int var16 = 0; var16 < var15.numUnpackSubStreams; var16++) {
                  var20.hasCrc.set(var33, var27.get(var35));
                  var20.crcs[var33] = var30[var35];
                  var33++;
                  var35++;
               }
            }
         }

         var18 = var1.readUnsignedByte();
      }

      if (var18 != 0) {
         throw new IOException("Badly terminated SubStreamsInfo");
      }

      var2.subStreamsInfo = var20;
   }

   private Folder readFolder(DataInput var1) {
      Folder var2 = new Folder();
      long var3 = readUint64(var1);
      Coder[] var5 = new Coder[(int)var3];
      long var6 = 0L;
      long var8 = 0L;

      for (int var10 = 0; var10 < var5.length; var10++) {
         var5[var10] = new Coder();
         int var11 = var1.readUnsignedByte();
         int var12 = var11 & 15;
         boolean var13 = (var11 & 16) == 0;
         boolean var14 = (var11 & 32) != 0;
         boolean var15 = (var11 & 128) != 0;
         var5[var10].decompressionMethodId = new byte[var12];
         var1.readFully(var5[var10].decompressionMethodId);
         if (var13) {
            var5[var10].numInStreams = 1L;
            var5[var10].numOutStreams = 1L;
         } else {
            var5[var10].numInStreams = readUint64(var1);
            var5[var10].numOutStreams = readUint64(var1);
         }

         var6 += var5[var10].numInStreams;
         var8 += var5[var10].numOutStreams;
         if (var14) {
            long var16 = readUint64(var1);
            var5[var10].properties = new byte[(int)var16];
            var1.readFully(var5[var10].properties);
         }

         if (var15) {
            throw new IOException("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
         }
      }

      var2.coders = var5;
      var2.totalInputStreams = var6;
      var2.totalOutputStreams = var8;
      if (var8 == 0L) {
         throw new IOException("Total output streams can't be 0");
      }

      long var18 = var8 - 1L;
      BindPair[] var19 = new BindPair[(int)var18];

      for (int var20 = 0; var20 < var19.length; var20++) {
         var19[var20] = new BindPair();
         var19[var20].inIndex = readUint64(var1);
         var19[var20].outIndex = readUint64(var1);
      }

      var2.bindPairs = var19;
      if (var6 < var18) {
         throw new IOException("Total input streams can't be less than the number of bind pairs");
      }

      long var21 = var6 - var18;
      long[] var22 = new long[(int)var21];
      if (var21 == 1L) {
         int var23 = 0;

         while (var23 < (int)var6 && var2.findBindPairForInStream(var23) >= 0) {
            var23++;
         }

         if (var23 == (int)var6) {
            throw new IOException("Couldn't find stream's bind pair index");
         }

         var22[0] = var23;
      } else {
         for (int var24 = 0; var24 < (int)var21; var24++) {
            var22[var24] = readUint64(var1);
         }
      }

      var2.packedStreams = var22;
      return var2;
   }

   private BitSet readAllOrBits(DataInput var1, int var2) {
      int var3 = var1.readUnsignedByte();
      BitSet var4;
      if (var3 != 0) {
         var4 = new BitSet(var2);

         for (int var5 = 0; var5 < var2; var5++) {
            var4.set(var5, true);
         }
      } else {
         var4 = this.readBits(var1, var2);
      }

      return var4;
   }

   private BitSet readBits(DataInput var1, int var2) {
      BitSet var3 = new BitSet(var2);
      short var4 = 0;
      int var5 = 0;

      for (int var6 = 0; var6 < var2; var6++) {
         if (var4 == 0) {
            var4 = 128;
            var5 = var1.readUnsignedByte();
         }

         var3.set(var6, (var5 & var4) != 0);
         var4 >>>= 1;
      }

      return var3;
   }

   private void readFilesInfo(DataInput var1, Archive var2) {
      long var3 = readUint64(var1);
      SevenZArchiveEntry[] var5 = new SevenZArchiveEntry[(int)var3];

      for (int var6 = 0; var6 < var5.length; var6++) {
         var5[var6] = new SevenZArchiveEntry();
      }

      BitSet var17 = null;
      BitSet var7 = null;
      BitSet var8 = null;

      while (true) {
         int var9 = var1.readUnsignedByte();
         if (var9 == 0) {
            var9 = 0;
            int var19 = 0;

            for (int var11 = 0; var11 < var5.length; var11++) {
               var5[var11].setHasStream(var17 == null ? true : !var17.get(var11));
               if (var5[var11].hasStream()) {
                  var5[var11].setDirectory(false);
                  var5[var11].setAntiItem(false);
                  var5[var11].setHasCrc(var2.subStreamsInfo.hasCrc.get(var9));
                  var5[var11].setCrcValue(var2.subStreamsInfo.crcs[var9]);
                  var5[var11].setSize(var2.subStreamsInfo.unpackSizes[var9]);
                  var9++;
               } else {
                  var5[var11].setDirectory(var7 == null ? true : !var7.get(var19));
                  var5[var11].setAntiItem(var8 == null ? false : var8.get(var19));
                  var5[var11].setHasCrc(false);
                  var5[var11].setSize(0L);
                  var19++;
               }
            }

            var2.files = var5;
            this.calculateStreamMap(var2);
            return;
         }

         long var10 = readUint64(var1);
         switch (var9) {
            case 14:
               var17 = this.readBits(var1, var5.length);
               break;
            case 15:
               if (var17 == null) {
                  throw new IOException("Header format error: kEmptyStream must appear before kEmptyFile");
               }

               var7 = this.readBits(var1, var17.cardinality());
               break;
            case 16:
               if (var17 == null) {
                  throw new IOException("Header format error: kEmptyStream must appear before kAnti");
               }

               var8 = this.readBits(var1, var17.cardinality());
               break;
            case 17:
               int var23 = var1.readUnsignedByte();
               if (var23 != 0) {
                  throw new IOException("Not implemented");
               }

               if ((var10 - 1L & 1L) != 0L) {
                  throw new IOException("File names length invalid");
               }

               byte[] var27 = new byte[(int)(var10 - 1L)];
               var1.readFully(var27);
               int var31 = 0;
               int var15 = 0;
               byte var16 = 0;

               for (; var16 < var27.length; var16 += 2) {
                  if (var27[var16] == 0 && var27[var16 + 1] == 0) {
                     var5[var31++].setName(new String(var27, var15, var16 - var15, "UTF-16LE"));
                     var15 = var16 + 2;
                  }
               }

               if (var15 != var27.length || var31 != var5.length) {
                  throw new IOException("Error parsing file names");
               }
               break;
            case 18:
               BitSet var22 = this.readAllOrBits(var1, var5.length);
               int var26 = var1.readUnsignedByte();
               if (var26 != 0) {
                  throw new IOException("Unimplemented");
               }

               for (int var30 = 0; var30 < var5.length; var30++) {
                  var5[var30].setHasCreationDate(var22.get(var30));
                  if (var5[var30].getHasCreationDate()) {
                     var5[var30].setCreationDate(Long.reverseBytes(var1.readLong()));
                  }
               }
               break;
            case 19:
               BitSet var21 = this.readAllOrBits(var1, var5.length);
               int var25 = var1.readUnsignedByte();
               if (var25 != 0) {
                  throw new IOException("Unimplemented");
               }

               for (int var29 = 0; var29 < var5.length; var29++) {
                  var5[var29].setHasAccessDate(var21.get(var29));
                  if (var5[var29].getHasAccessDate()) {
                     var5[var29].setAccessDate(Long.reverseBytes(var1.readLong()));
                  }
               }
               break;
            case 20:
               BitSet var20 = this.readAllOrBits(var1, var5.length);
               int var24 = var1.readUnsignedByte();
               if (var24 != 0) {
                  throw new IOException("Unimplemented");
               }

               for (int var28 = 0; var28 < var5.length; var28++) {
                  var5[var28].setHasLastModifiedDate(var20.get(var28));
                  if (var5[var28].getHasLastModifiedDate()) {
                     var5[var28].setLastModifiedDate(Long.reverseBytes(var1.readLong()));
                  }
               }
               break;
            case 21:
               BitSet var12 = this.readAllOrBits(var1, var5.length);
               int var13 = var1.readUnsignedByte();
               if (var13 != 0) {
                  throw new IOException("Unimplemented");
               }

               for (int var14 = 0; var14 < var5.length; var14++) {
                  var5[var14].setHasWindowsAttributes(var12.get(var14));
                  if (var5[var14].getHasWindowsAttributes()) {
                     var5[var14].setWindowsAttributes(Integer.reverseBytes(var1.readInt()));
                  }
               }
               break;
            case 22:
            case 23:
            default:
               if (skipBytesFully(var1, var10) < var10) {
                  throw new IOException("Incomplete property of type " + var9);
               }
               break;
            case 24:
               throw new IOException("kStartPos is unsupported, please report");
            case 25:
               if (skipBytesFully(var1, var10) < var10) {
                  throw new IOException("Incomplete kDummy property");
               }
         }
      }
   }

   private void calculateStreamMap(Archive var1) {
      StreamMap var2 = new StreamMap();
      int var3 = 0;
      int var4 = var1.folders != null ? var1.folders.length : 0;
      var2.folderFirstPackStreamIndex = new int[var4];

      for (int var5 = 0; var5 < var4; var5++) {
         var2.folderFirstPackStreamIndex[var5] = var3;
         var3 += var1.folders[var5].packedStreams.length;
      }

      long var11 = 0L;
      int var7 = var1.packSizes != null ? var1.packSizes.length : 0;
      var2.packStreamOffsets = new long[var7];

      for (int var8 = 0; var8 < var7; var8++) {
         var2.packStreamOffsets[var8] = var11;
         var11 += var1.packSizes[var8];
      }

      var2.folderFirstFileIndex = new int[var4];
      var2.fileFolderIndex = new int[var1.files.length];
      int var12 = 0;
      int var9 = 0;

      for (int var10 = 0; var10 < var1.files.length; var10++) {
         if (!var1.files[var10].hasStream() && var9 == 0) {
            var2.fileFolderIndex[var10] = -1;
         } else {
            if (var9 == 0) {
               while (var12 < var1.folders.length) {
                  var2.folderFirstFileIndex[var12] = var10;
                  if (var1.folders[var12].numUnpackSubStreams > 0) {
                     break;
                  }

                  var12++;
               }

               if (var12 >= var1.folders.length) {
                  throw new IOException("Too few folders in archive");
               }
            }

            var2.fileFolderIndex[var10] = var12;
            if (var1.files[var10].hasStream()) {
               if (++var9 >= var1.folders[var12].numUnpackSubStreams) {
                  var12++;
                  var9 = 0;
               }
            }
         }
      }

      var1.streamMap = var2;
   }

   private void buildDecodingStream() {
      int var1 = this.archive.streamMap.fileFolderIndex[this.currentEntryIndex];
      if (var1 < 0) {
         this.currentEntryInputStream = new BoundedInputStream(new ByteArrayInputStream(new byte[0]), 0L);
      } else {
         SevenZArchiveEntry var2 = this.archive.files[this.currentEntryIndex];
         if (this.currentFolderIndex == var1) {
            this.drainPreviousEntry();
            var2.setContentMethods(this.archive.files[this.currentEntryIndex - 1].getContentMethods());
         } else {
            this.currentFolderIndex = var1;
            if (this.currentFolderInputStream != null) {
               this.currentFolderInputStream.close();
               this.currentFolderInputStream = null;
            }

            Folder var3 = this.archive.folders[var1];
            int var4 = this.archive.streamMap.folderFirstPackStreamIndex[var1];
            long var5 = 32L + this.archive.packPos + this.archive.streamMap.packStreamOffsets[var4];
            this.currentFolderInputStream = this.buildDecoderStack(var3, var5, var4, var2);
         }

         BoundedInputStream var7 = new BoundedInputStream(this.currentFolderInputStream, var2.getSize());
         if (var2.getHasCrc()) {
            this.currentEntryInputStream = new CRC32VerifyingInputStream(var7, var2.getSize(), var2.getCrcValue());
         } else {
            this.currentEntryInputStream = var7;
         }
      }
   }

   private void drainPreviousEntry() {
      if (this.currentEntryInputStream != null) {
         IOUtils.skip(this.currentEntryInputStream, Long.MAX_VALUE);
         this.currentEntryInputStream.close();
         this.currentEntryInputStream = null;
      }
   }

   private InputStream buildDecoderStack(Folder var1, long var2, int var4, SevenZArchiveEntry var5) {
      this.file.seek(var2);
      InputStream var6 = new BoundedRandomAccessFileInputStream(this.file, this.archive.packSizes[var4]);
      LinkedList var7 = new LinkedList();

      for (Coder var9 : var1.getOrderedCoders()) {
         if (var9.numInStreams != 1L || var9.numOutStreams != 1L) {
            throw new IOException("Multi input/output stream coders are not yet supported");
         }

         SevenZMethod var10 = SevenZMethod.byId(var9.decompressionMethodId);
         var6 = Coders.addDecoder(var6, var1.getUnpackSizeForCoder(var9), var9, this.password);
         var7.addFirst(new SevenZMethodConfiguration(var10, Coders.findByMethod(var10).getOptionsFromCoder(var9, var6)));
      }

      var5.setContentMethods(var7);
      return var1.hasCrc ? new CRC32VerifyingInputStream(var6, var1.getUnpackSize(), var1.crc) : var6;
   }

   public int read() {
      if (this.currentEntryInputStream == null) {
         throw new IllegalStateException("No current 7z entry");
      } else {
         return this.currentEntryInputStream.read();
      }
   }

   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public int read(byte[] var1, int var2, int var3) {
      if (this.currentEntryInputStream == null) {
         throw new IllegalStateException("No current 7z entry");
      } else {
         return this.currentEntryInputStream.read(var1, var2, var3);
      }
   }

   private static long readUint64(DataInput var0) {
      long var1 = var0.readUnsignedByte();
      short var3 = 128;
      long var4 = 0L;

      for (int var6 = 0; var6 < 8; var6++) {
         if ((var1 & var3) == 0L) {
            return var4 | (var1 & var3 - 1) << 8 * var6;
         }

         long var7 = var0.readUnsignedByte();
         var4 |= var7 << 8 * var6;
         var3 >>>= 1;
      }

      return var4;
   }

   public static boolean matches(byte[] var0, int var1) {
      if (var1 < sevenZSignature.length) {
         return false;
      }

      for (int var2 = 0; var2 < sevenZSignature.length; var2++) {
         if (var0[var2] != sevenZSignature[var2]) {
            return false;
         }
      }

      return true;
   }

   private static long skipBytesFully(DataInput var0, long var1) {
      if (var1 < 1L) {
         return 0L;
      }

      long var3 = 0L;

      while (var1 > 2147483647L) {
         long var5 = skipBytesFully(var0, 2147483647L);
         if (var5 == 0L) {
            return var3;
         }

         var3 += var5;
         var1 -= var5;
      }

      while (var1 > 0L) {
         int var7 = var0.skipBytes((int)var1);
         if (var7 == 0) {
            return var3;
         }

         var3 += var7;
         var1 -= var7;
      }

      return var3;
   }
}
