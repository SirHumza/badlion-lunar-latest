package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;

public class ZipArchiveOutputStream extends ArchiveOutputStream {
   static final int BUFFER_SIZE = 512;
   protected boolean finished = false;
   private static final int DEFLATER_BLOCK_SIZE = 8192;
   public static final int DEFLATED = 8;
   public static final int DEFAULT_COMPRESSION = -1;
   public static final int STORED = 0;
   static final String DEFAULT_ENCODING = "UTF8";
   @Deprecated
   public static final int EFS_FLAG = 2048;
   private static final byte[] EMPTY = new byte[0];
   private ZipArchiveOutputStream.CurrentEntry entry;
   private String comment = "";
   private int level = -1;
   private boolean hasCompressionLevelChanged = false;
   private int method = 8;
   private final List<ZipArchiveEntry> entries = new LinkedList<>();
   private final CRC32 crc = new CRC32();
   private long written = 0L;
   private long cdOffset = 0L;
   private long cdLength = 0L;
   private static final byte[] ZERO = new byte[]{0, 0};
   private static final byte[] LZERO = new byte[]{0, 0, 0, 0};
   private final Map<ZipArchiveEntry, Long> offsets = new HashMap<>();
   private String encoding = "UTF8";
   private ZipEncoding zipEncoding = ZipEncodingHelper.getZipEncoding("UTF8");
   protected final Deflater def = new Deflater(this.level, true);
   private final byte[] buf = new byte[512];
   private final RandomAccessFile raf;
   private final OutputStream out;
   private boolean useUTF8Flag = true;
   private boolean fallbackToUTF8 = false;
   private ZipArchiveOutputStream.UnicodeExtraFieldPolicy createUnicodeExtraFields = ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER;
   private boolean hasUsedZip64 = false;
   private Zip64Mode zip64Mode = Zip64Mode.AsNeeded;
   static final byte[] LFH_SIG = ZipLong.LFH_SIG.getBytes();
   static final byte[] DD_SIG = ZipLong.DD_SIG.getBytes();
   static final byte[] CFH_SIG = ZipLong.CFH_SIG.getBytes();
   static final byte[] EOCD_SIG = ZipLong.getBytes(101010256L);
   static final byte[] ZIP64_EOCD_SIG = ZipLong.getBytes(101075792L);
   static final byte[] ZIP64_EOCD_LOC_SIG = ZipLong.getBytes(117853008L);
   private static final byte[] ONE = ZipLong.getBytes(1L);

   public ZipArchiveOutputStream(OutputStream var1) {
      this.out = var1;
      this.raf = null;
   }

   public ZipArchiveOutputStream(File var1) {
      FileOutputStream var2 = null;
      RandomAccessFile var3 = null;

      try {
         var3 = new RandomAccessFile(var1, "rw");
         var3.setLength(0L);
      } catch (IOException var5) {
         IOUtils.closeQuietly(var3);
         var3 = null;
         var2 = new FileOutputStream(var1);
      }

      this.out = var2;
      this.raf = var3;
   }

   public boolean isSeekable() {
      return this.raf != null;
   }

   public void setEncoding(String var1) {
      this.encoding = var1;
      this.zipEncoding = ZipEncodingHelper.getZipEncoding(var1);
      if (this.useUTF8Flag && !ZipEncodingHelper.isUTF8(var1)) {
         this.useUTF8Flag = false;
      }
   }

   public String getEncoding() {
      return this.encoding;
   }

   public void setUseLanguageEncodingFlag(boolean var1) {
      this.useUTF8Flag = var1 && ZipEncodingHelper.isUTF8(this.encoding);
   }

   public void setCreateUnicodeExtraFields(ZipArchiveOutputStream.UnicodeExtraFieldPolicy var1) {
      this.createUnicodeExtraFields = var1;
   }

   public void setFallbackToUTF8(boolean var1) {
      this.fallbackToUTF8 = var1;
   }

   public void setUseZip64(Zip64Mode var1) {
      this.zip64Mode = var1;
   }

   @Override
   public void finish() {
      if (this.finished) {
         throw new IOException("This archive has already been finished");
      }

      if (this.entry != null) {
         throw new IOException("This archive contains unclosed entries.");
      }

      this.cdOffset = this.written;

      for (ZipArchiveEntry var2 : this.entries) {
         this.writeCentralFileHeader(var2);
      }

      this.cdLength = this.written - this.cdOffset;
      this.writeZip64CentralDirectory();
      this.writeCentralDirectoryEnd();
      this.offsets.clear();
      this.entries.clear();
      this.def.end();
      this.finished = true;
   }

   @Override
   public void closeArchiveEntry() {
      if (this.finished) {
         throw new IOException("Stream has already been finished");
      }

      if (this.entry == null) {
         throw new IOException("No current entry to close");
      }

      if (!this.entry.hasWritten) {
         this.write(EMPTY, 0, 0);
      }

      this.flushDeflater();
      Zip64Mode var1 = this.getEffectiveZip64Mode(this.entry.entry);
      long var2 = this.written - this.entry.dataStart;
      long var4 = this.crc.getValue();
      this.crc.reset();
      boolean var6 = this.handleSizesAndCrc(var2, var4, var1);
      if (this.raf != null) {
         this.rewriteSizesAndCrc(var6);
      }

      this.writeDataDescriptor(this.entry.entry);
      this.entry = null;
   }

   private void flushDeflater() {
      if (this.entry.entry.getMethod() == 8) {
         this.def.finish();

         while (!this.def.finished()) {
            this.deflate();
         }
      }
   }

   private boolean handleSizesAndCrc(long var1, long var3, Zip64Mode var5) {
      if (this.entry.entry.getMethod() == 8) {
         this.entry.entry.setSize(this.entry.bytesRead);
         this.entry.entry.setCompressedSize(var1);
         this.entry.entry.setCrc(var3);
         this.def.reset();
      } else if (this.raf == null) {
         if (this.entry.entry.getCrc() != var3) {
            throw new ZipException(
               "bad CRC checksum for entry "
                  + this.entry.entry.getName()
                  + ": "
                  + Long.toHexString(this.entry.entry.getCrc())
                  + " instead of "
                  + Long.toHexString(var3)
            );
         }

         if (this.entry.entry.getSize() != var1) {
            throw new ZipException("bad size for entry " + this.entry.entry.getName() + ": " + this.entry.entry.getSize() + " instead of " + var1);
         }
      } else {
         this.entry.entry.setSize(var1);
         this.entry.entry.setCompressedSize(var1);
         this.entry.entry.setCrc(var3);
      }

      boolean var6 = var5 == Zip64Mode.Always || this.entry.entry.getSize() >= 4294967295L || this.entry.entry.getCompressedSize() >= 4294967295L;
      if (var6 && var5 == Zip64Mode.Never) {
         throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
      } else {
         return var6;
      }
   }

   private void rewriteSizesAndCrc(boolean var1) {
      long var2 = this.raf.getFilePointer();
      this.raf.seek(this.entry.localDataStart);
      this.writeOut(ZipLong.getBytes(this.entry.entry.getCrc()));
      if (this.hasZip64Extra(this.entry.entry) && var1) {
         this.writeOut(ZipLong.ZIP64_MAGIC.getBytes());
         this.writeOut(ZipLong.ZIP64_MAGIC.getBytes());
      } else {
         this.writeOut(ZipLong.getBytes(this.entry.entry.getCompressedSize()));
         this.writeOut(ZipLong.getBytes(this.entry.entry.getSize()));
      }

      if (this.hasZip64Extra(this.entry.entry)) {
         this.raf.seek(this.entry.localDataStart + 12L + 4L + this.getName(this.entry.entry).limit() + 4L);
         this.writeOut(ZipEightByteInteger.getBytes(this.entry.entry.getSize()));
         this.writeOut(ZipEightByteInteger.getBytes(this.entry.entry.getCompressedSize()));
         if (!var1) {
            this.raf.seek(this.entry.localDataStart - 10L);
            this.writeOut(ZipShort.getBytes(10));
            this.entry.entry.removeExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
            this.entry.entry.setExtra();
            if (this.entry.causedUseOfZip64) {
               this.hasUsedZip64 = false;
            }
         }
      }

      this.raf.seek(var2);
   }

   @Override
   public void putArchiveEntry(ArchiveEntry var1) {
      if (this.finished) {
         throw new IOException("Stream has already been finished");
      }

      if (this.entry != null) {
         this.closeArchiveEntry();
      }

      this.entry = new ZipArchiveOutputStream.CurrentEntry((ZipArchiveEntry)var1);
      this.entries.add(this.entry.entry);
      this.setDefaults(this.entry.entry);
      Zip64Mode var2 = this.getEffectiveZip64Mode(this.entry.entry);
      this.validateSizeInformation(var2);
      if (this.shouldAddZip64Extra(this.entry.entry, var2)) {
         Zip64ExtendedInformationExtraField var3 = this.getZip64Extra(this.entry.entry);
         ZipEightByteInteger var4 = ZipEightByteInteger.ZERO;
         if (this.entry.entry.getMethod() == 0 && this.entry.entry.getSize() != -1L) {
            var4 = new ZipEightByteInteger(this.entry.entry.getSize());
         }

         var3.setSize(var4);
         var3.setCompressedSize(var4);
         this.entry.entry.setExtra();
      }

      if (this.entry.entry.getMethod() == 8 && this.hasCompressionLevelChanged) {
         this.def.setLevel(this.level);
         this.hasCompressionLevelChanged = false;
      }

      this.writeLocalFileHeader(this.entry.entry);
   }

   private void setDefaults(ZipArchiveEntry var1) {
      if (var1.getMethod() == -1) {
         var1.setMethod(this.method);
      }

      if (var1.getTime() == -1L) {
         var1.setTime(System.currentTimeMillis());
      }
   }

   private void validateSizeInformation(Zip64Mode var1) {
      if (this.entry.entry.getMethod() == 0 && this.raf == null) {
         if (this.entry.entry.getSize() == -1L) {
            throw new ZipException("uncompressed size is required for STORED method when not writing to a file");
         }

         if (this.entry.entry.getCrc() == -1L) {
            throw new ZipException("crc checksum is required for STORED method when not writing to a file");
         }

         this.entry.entry.setCompressedSize(this.entry.entry.getSize());
      }

      if ((this.entry.entry.getSize() >= 4294967295L || this.entry.entry.getCompressedSize() >= 4294967295L) && var1 == Zip64Mode.Never) {
         throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
      }
   }

   private boolean shouldAddZip64Extra(ZipArchiveEntry var1, Zip64Mode var2) {
      return var2 == Zip64Mode.Always
         || var1.getSize() >= 4294967295L
         || var1.getCompressedSize() >= 4294967295L
         || var1.getSize() == -1L && this.raf != null && var2 != Zip64Mode.Never;
   }

   public void setComment(String var1) {
      this.comment = var1;
   }

   public void setLevel(int var1) {
      if (var1 >= -1 && var1 <= 9) {
         this.hasCompressionLevelChanged = this.level != var1;
         this.level = var1;
      } else {
         throw new IllegalArgumentException("Invalid compression level: " + var1);
      }
   }

   public void setMethod(int var1) {
      this.method = var1;
   }

   @Override
   public boolean canWriteEntryData(ArchiveEntry var1) {
      if (!(var1 instanceof ZipArchiveEntry)) {
         return false;
      }

      ZipArchiveEntry var2 = (ZipArchiveEntry)var1;
      return var2.getMethod() != ZipMethod.IMPLODING.getCode() && var2.getMethod() != ZipMethod.UNSHRINKING.getCode() && ZipUtil.canHandleEntryData(var2);
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      if (this.entry == null) {
         throw new IllegalStateException("No current entry");
      }

      ZipUtil.checkRequestedFeatures(this.entry.entry);
      this.entry.hasWritten = true;
      if (this.entry.entry.getMethod() == 8) {
         this.writeDeflated(var1, var2, var3);
      } else {
         this.writeOut(var1, var2, var3);
         this.written += var3;
      }

      this.crc.update(var1, var2, var3);
      this.count(var3);
   }

   private void writeDeflated(byte[] var1, int var2, int var3) {
      if (var3 > 0 && !this.def.finished()) {
         this.entry.bytesRead += var3;
         if (var3 <= 8192) {
            this.def.setInput(var1, var2, var3);
            this.deflateUntilInputIsNeeded();
         } else {
            int var4 = var3 / 8192;

            for (int var5 = 0; var5 < var4; var5++) {
               this.def.setInput(var1, var2 + var5 * 8192, 8192);
               this.deflateUntilInputIsNeeded();
            }

            int var6 = var4 * 8192;
            if (var6 < var3) {
               this.def.setInput(var1, var2 + var6, var3 - var6);
               this.deflateUntilInputIsNeeded();
            }
         }
      }
   }

   @Override
   public void close() {
      if (!this.finished) {
         this.finish();
      }

      this.destroy();
   }

   @Override
   public void flush() {
      if (this.out != null) {
         this.out.flush();
      }
   }

   protected final void deflate() {
      int var1 = this.def.deflate(this.buf, 0, this.buf.length);
      if (var1 > 0) {
         this.writeOut(this.buf, 0, var1);
         this.written += var1;
      }
   }

   protected void writeLocalFileHeader(ZipArchiveEntry var1) {
      boolean var2 = this.zipEncoding.canEncode(var1.getName());
      ByteBuffer var3 = this.getName(var1);
      if (this.createUnicodeExtraFields != ZipArchiveOutputStream.UnicodeExtraFieldPolicy.NEVER) {
         this.addUnicodeExtraFields(var1, var2, var3);
      }

      this.offsets.put(var1, this.written);
      this.writeOut(LFH_SIG);
      this.written += 4L;
      int var4 = var1.getMethod();
      this.writeVersionNeededToExtractAndGeneralPurposeBits(var4, !var2 && this.fallbackToUTF8, this.hasZip64Extra(var1));
      this.written += 4L;
      this.writeOut(ZipShort.getBytes(var4));
      this.written += 2L;
      this.writeOut(ZipUtil.toDosTime(var1.getTime()));
      this.written += 4L;
      this.entry.localDataStart = this.written;
      if (var4 != 8 && this.raf == null) {
         this.writeOut(ZipLong.getBytes(var1.getCrc()));
         byte[] var5 = ZipLong.ZIP64_MAGIC.getBytes();
         if (!this.hasZip64Extra(var1)) {
            var5 = ZipLong.getBytes(var1.getSize());
         }

         this.writeOut(var5);
         this.writeOut(var5);
      } else {
         this.writeOut(LZERO);
         if (this.hasZip64Extra(this.entry.entry)) {
            this.writeOut(ZipLong.ZIP64_MAGIC.getBytes());
            this.writeOut(ZipLong.ZIP64_MAGIC.getBytes());
         } else {
            this.writeOut(LZERO);
            this.writeOut(LZERO);
         }
      }

      this.written += 12L;
      this.writeOut(ZipShort.getBytes(var3.limit()));
      this.written += 2L;
      byte[] var6 = var1.getLocalFileDataExtra();
      this.writeOut(ZipShort.getBytes(var6.length));
      this.written += 2L;
      this.writeOut(var3.array(), var3.arrayOffset(), var3.limit() - var3.position());
      this.written = this.written + var3.limit();
      this.writeOut(var6);
      this.written += var6.length;
      this.entry.dataStart = this.written;
   }

   private void addUnicodeExtraFields(ZipArchiveEntry var1, boolean var2, ByteBuffer var3) {
      if (this.createUnicodeExtraFields == ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS || !var2) {
         var1.addExtraField(new UnicodePathExtraField(var1.getName(), var3.array(), var3.arrayOffset(), var3.limit() - var3.position()));
      }

      String var4 = var1.getComment();
      if (var4 != null && !"".equals(var4)) {
         boolean var5 = this.zipEncoding.canEncode(var4);
         if (this.createUnicodeExtraFields == ZipArchiveOutputStream.UnicodeExtraFieldPolicy.ALWAYS || !var5) {
            ByteBuffer var6 = this.getEntryEncoding(var1).encode(var4);
            var1.addExtraField(new UnicodeCommentExtraField(var4, var6.array(), var6.arrayOffset(), var6.limit() - var6.position()));
         }
      }
   }

   protected void writeDataDescriptor(ZipArchiveEntry var1) {
      if (var1.getMethod() == 8 && this.raf == null) {
         this.writeOut(DD_SIG);
         this.writeOut(ZipLong.getBytes(var1.getCrc()));
         byte var2 = 4;
         if (!this.hasZip64Extra(var1)) {
            this.writeOut(ZipLong.getBytes(var1.getCompressedSize()));
            this.writeOut(ZipLong.getBytes(var1.getSize()));
         } else {
            var2 = 8;
            this.writeOut(ZipEightByteInteger.getBytes(var1.getCompressedSize()));
            this.writeOut(ZipEightByteInteger.getBytes(var1.getSize()));
         }

         this.written += 8 + 2 * var2;
      }
   }

   protected void writeCentralFileHeader(ZipArchiveEntry var1) {
      this.writeOut(CFH_SIG);
      this.written += 4L;
      long var2 = this.offsets.get(var1);
      boolean var4 = this.hasZip64Extra(var1) || var1.getCompressedSize() >= 4294967295L || var1.getSize() >= 4294967295L || var2 >= 4294967295L;
      if (var4 && this.zip64Mode == Zip64Mode.Never) {
         throw new Zip64RequiredException("archive's size exceeds the limit of 4GByte.");
      }

      this.handleZip64Extra(var1, var2, var4);
      this.writeOut(ZipShort.getBytes(var1.getPlatform() << 8 | (!this.hasUsedZip64 ? 20 : 45)));
      this.written += 2L;
      int var5 = var1.getMethod();
      boolean var6 = this.zipEncoding.canEncode(var1.getName());
      this.writeVersionNeededToExtractAndGeneralPurposeBits(var5, !var6 && this.fallbackToUTF8, var4);
      this.written += 4L;
      this.writeOut(ZipShort.getBytes(var5));
      this.written += 2L;
      this.writeOut(ZipUtil.toDosTime(var1.getTime()));
      this.written += 4L;
      this.writeOut(ZipLong.getBytes(var1.getCrc()));
      if (var1.getCompressedSize() < 4294967295L && var1.getSize() < 4294967295L) {
         this.writeOut(ZipLong.getBytes(var1.getCompressedSize()));
         this.writeOut(ZipLong.getBytes(var1.getSize()));
      } else {
         this.writeOut(ZipLong.ZIP64_MAGIC.getBytes());
         this.writeOut(ZipLong.ZIP64_MAGIC.getBytes());
      }

      this.written += 12L;
      ByteBuffer var7 = this.getName(var1);
      this.writeOut(ZipShort.getBytes(var7.limit()));
      this.written += 2L;
      byte[] var8 = var1.getCentralDirectoryExtra();
      this.writeOut(ZipShort.getBytes(var8.length));
      this.written += 2L;
      String var9 = var1.getComment();
      if (var9 == null) {
         var9 = "";
      }

      ByteBuffer var10 = this.getEntryEncoding(var1).encode(var9);
      this.writeOut(ZipShort.getBytes(var10.limit()));
      this.written += 2L;
      this.writeOut(ZERO);
      this.written += 2L;
      this.writeOut(ZipShort.getBytes(var1.getInternalAttributes()));
      this.written += 2L;
      this.writeOut(ZipLong.getBytes(var1.getExternalAttributes()));
      this.written += 4L;
      this.writeOut(ZipLong.getBytes(Math.min(var2, 4294967295L)));
      this.written += 4L;
      this.writeOut(var7.array(), var7.arrayOffset(), var7.limit() - var7.position());
      this.written = this.written + var7.limit();
      this.writeOut(var8);
      this.written += var8.length;
      this.writeOut(var10.array(), var10.arrayOffset(), var10.limit() - var10.position());
      this.written = this.written + var10.limit();
   }

   private void handleZip64Extra(ZipArchiveEntry var1, long var2, boolean var4) {
      if (var4) {
         Zip64ExtendedInformationExtraField var5 = this.getZip64Extra(var1);
         if (var1.getCompressedSize() < 4294967295L && var1.getSize() < 4294967295L) {
            var5.setCompressedSize(null);
            var5.setSize(null);
         } else {
            var5.setCompressedSize(new ZipEightByteInteger(var1.getCompressedSize()));
            var5.setSize(new ZipEightByteInteger(var1.getSize()));
         }

         if (var2 >= 4294967295L) {
            var5.setRelativeHeaderOffset(new ZipEightByteInteger(var2));
         }

         var1.setExtra();
      }
   }

   protected void writeCentralDirectoryEnd() {
      this.writeOut(EOCD_SIG);
      this.writeOut(ZERO);
      this.writeOut(ZERO);
      int var1 = this.entries.size();
      if (var1 > 65535 && this.zip64Mode == Zip64Mode.Never) {
         throw new Zip64RequiredException("archive contains more than 65535 entries.");
      }

      if (this.cdOffset > 4294967295L && this.zip64Mode == Zip64Mode.Never) {
         throw new Zip64RequiredException("archive's size exceeds the limit of 4GByte.");
      }

      byte[] var2 = ZipShort.getBytes(Math.min(var1, 65535));
      this.writeOut(var2);
      this.writeOut(var2);
      this.writeOut(ZipLong.getBytes(Math.min(this.cdLength, 4294967295L)));
      this.writeOut(ZipLong.getBytes(Math.min(this.cdOffset, 4294967295L)));
      ByteBuffer var3 = this.zipEncoding.encode(this.comment);
      this.writeOut(ZipShort.getBytes(var3.limit()));
      this.writeOut(var3.array(), var3.arrayOffset(), var3.limit() - var3.position());
   }

   protected void writeZip64CentralDirectory() {
      if (this.zip64Mode != Zip64Mode.Never) {
         if (!this.hasUsedZip64 && (this.cdOffset >= 4294967295L || this.cdLength >= 4294967295L || this.entries.size() >= 65535)) {
            this.hasUsedZip64 = true;
         }

         if (this.hasUsedZip64) {
            long var1 = this.written;
            this.writeOut(ZIP64_EOCD_SIG);
            this.writeOut(ZipEightByteInteger.getBytes(44L));
            this.writeOut(ZipShort.getBytes(45));
            this.writeOut(ZipShort.getBytes(45));
            this.writeOut(LZERO);
            this.writeOut(LZERO);
            byte[] var3 = ZipEightByteInteger.getBytes(this.entries.size());
            this.writeOut(var3);
            this.writeOut(var3);
            this.writeOut(ZipEightByteInteger.getBytes(this.cdLength));
            this.writeOut(ZipEightByteInteger.getBytes(this.cdOffset));
            this.writeOut(ZIP64_EOCD_LOC_SIG);
            this.writeOut(LZERO);
            this.writeOut(ZipEightByteInteger.getBytes(var1));
            this.writeOut(ONE);
         }
      }
   }

   protected final void writeOut(byte[] var1) {
      this.writeOut(var1, 0, var1.length);
   }

   protected final void writeOut(byte[] var1, int var2, int var3) {
      if (this.raf != null) {
         this.raf.write(var1, var2, var3);
      } else {
         this.out.write(var1, var2, var3);
      }
   }

   private void deflateUntilInputIsNeeded() {
      while (!this.def.needsInput()) {
         this.deflate();
      }
   }

   private void writeVersionNeededToExtractAndGeneralPurposeBits(int var1, boolean var2, boolean var3) {
      byte var4 = 10;
      GeneralPurposeBit var5 = new GeneralPurposeBit();
      var5.useUTF8ForNames(this.useUTF8Flag || var2);
      if (var1 == 8 && this.raf == null) {
         var4 = 20;
         var5.useDataDescriptor(true);
      }

      if (var3) {
         var4 = 45;
      }

      this.writeOut(ZipShort.getBytes(var4));
      this.writeOut(var5.encode());
   }

   @Override
   public ArchiveEntry createArchiveEntry(File var1, String var2) {
      if (this.finished) {
         throw new IOException("Stream has already been finished");
      } else {
         return new ZipArchiveEntry(var1, var2);
      }
   }

   private Zip64ExtendedInformationExtraField getZip64Extra(ZipArchiveEntry var1) {
      if (this.entry != null) {
         this.entry.causedUseOfZip64 = !this.hasUsedZip64;
      }

      this.hasUsedZip64 = true;
      Zip64ExtendedInformationExtraField var2 = (Zip64ExtendedInformationExtraField)var1.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
      if (var2 == null) {
         var2 = new Zip64ExtendedInformationExtraField();
      }

      var1.addAsFirstExtraField(var2);
      return var2;
   }

   private boolean hasZip64Extra(ZipArchiveEntry var1) {
      return var1.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID) != null;
   }

   private Zip64Mode getEffectiveZip64Mode(ZipArchiveEntry var1) {
      return this.zip64Mode == Zip64Mode.AsNeeded && this.raf == null && var1.getMethod() == 8 && var1.getSize() == -1L ? Zip64Mode.Never : this.zip64Mode;
   }

   private ZipEncoding getEntryEncoding(ZipArchiveEntry var1) {
      boolean var2 = this.zipEncoding.canEncode(var1.getName());
      return !var2 && this.fallbackToUTF8 ? ZipEncodingHelper.UTF8_ZIP_ENCODING : this.zipEncoding;
   }

   private ByteBuffer getName(ZipArchiveEntry var1) {
      return this.getEntryEncoding(var1).encode(var1.getName());
   }

   void destroy() {
      if (this.raf != null) {
         this.raf.close();
      }

      if (this.out != null) {
         this.out.close();
      }
   }

   private static final class CurrentEntry {
      private final ZipArchiveEntry entry;
      private long localDataStart = 0L;
      private long dataStart = 0L;
      private long bytesRead = 0L;
      private boolean causedUseOfZip64 = false;
      private boolean hasWritten;

      private CurrentEntry(ZipArchiveEntry var1) {
         this.entry = var1;
      }
   }

   public static final class UnicodeExtraFieldPolicy {
      public static final ZipArchiveOutputStream.UnicodeExtraFieldPolicy ALWAYS = new ZipArchiveOutputStream.UnicodeExtraFieldPolicy("always");
      public static final ZipArchiveOutputStream.UnicodeExtraFieldPolicy NEVER = new ZipArchiveOutputStream.UnicodeExtraFieldPolicy("never");
      public static final ZipArchiveOutputStream.UnicodeExtraFieldPolicy NOT_ENCODEABLE = new ZipArchiveOutputStream.UnicodeExtraFieldPolicy("not encodeable");
      private final String name;

      private UnicodeExtraFieldPolicy(String var1) {
         this.name = var1;
      }

      @Override
      public String toString() {
         return this.name;
      }
   }
}
