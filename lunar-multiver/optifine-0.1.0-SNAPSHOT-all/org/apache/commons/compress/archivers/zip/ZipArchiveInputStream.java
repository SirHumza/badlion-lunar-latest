package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.IOUtils;

public class ZipArchiveInputStream extends ArchiveInputStream {
   private final ZipEncoding zipEncoding;
   private final boolean useUnicodeExtraFields;
   private final InputStream in;
   private final Inflater inf = new Inflater(true);
   private final ByteBuffer buf = ByteBuffer.allocate(512);
   private ZipArchiveInputStream.CurrentEntry current = null;
   private boolean closed = false;
   private boolean hitCentralDirectory = false;
   private ByteArrayInputStream lastStoredEntry = null;
   private boolean allowStoredEntriesWithDataDescriptor = false;
   private static final int LFH_LEN = 30;
   private static final int CFH_LEN = 46;
   private static final long TWO_EXP_32 = 4294967296L;
   private final byte[] LFH_BUF = new byte[30];
   private final byte[] SKIP_BUF = new byte[1024];
   private final byte[] SHORT_BUF = new byte[2];
   private final byte[] WORD_BUF = new byte[4];
   private final byte[] TWO_DWORD_BUF = new byte[16];
   private int entriesRead = 0;
   private static final byte[] LFH = ZipLong.LFH_SIG.getBytes();
   private static final byte[] CFH = ZipLong.CFH_SIG.getBytes();
   private static final byte[] DD = ZipLong.DD_SIG.getBytes();

   public ZipArchiveInputStream(InputStream var1) {
      this(var1, "UTF8");
   }

   public ZipArchiveInputStream(InputStream var1, String var2) {
      this(var1, var2, true);
   }

   public ZipArchiveInputStream(InputStream var1, String var2, boolean var3) {
      this(var1, var2, var3, false);
   }

   public ZipArchiveInputStream(InputStream var1, String var2, boolean var3, boolean var4) {
      this.zipEncoding = ZipEncodingHelper.getZipEncoding(var2);
      this.useUnicodeExtraFields = var3;
      this.in = new PushbackInputStream(var1, this.buf.capacity());
      this.allowStoredEntriesWithDataDescriptor = var4;
      ((Buffer)this.buf).limit(0);
   }

   public ZipArchiveEntry getNextZipEntry() {
      boolean var1 = true;
      if (!this.closed && !this.hitCentralDirectory) {
         if (this.current != null) {
            this.closeEntry();
            var1 = false;
         }

         try {
            if (var1) {
               this.readFirstLocalFileHeader(this.LFH_BUF);
            } else {
               this.readFully(this.LFH_BUF);
            }
         } catch (EOFException var16) {
            return null;
         }

         ZipLong var2 = new ZipLong(this.LFH_BUF);
         if (var2.equals(ZipLong.CFH_SIG) || var2.equals(ZipLong.AED_SIG)) {
            this.hitCentralDirectory = true;
            this.skipRemainderOfArchive();
         }

         if (!var2.equals(ZipLong.LFH_SIG)) {
            return null;
         }

         int var3 = 4;
         this.current = new ZipArchiveInputStream.CurrentEntry();
         int var4 = ZipShort.getValue(this.LFH_BUF, var3);
         var3 += 2;
         this.current.entry.setPlatform(var4 >> 8 & 15);
         GeneralPurposeBit var5 = GeneralPurposeBit.parse(this.LFH_BUF, var3);
         boolean var6 = var5.usesUTF8ForNames();
         ZipEncoding var7 = var6 ? ZipEncodingHelper.UTF8_ZIP_ENCODING : this.zipEncoding;
         this.current.hasDataDescriptor = var5.usesDataDescriptor();
         this.current.entry.setGeneralPurposeBit(var5);
         var3 += 2;
         this.current.entry.setMethod(ZipShort.getValue(this.LFH_BUF, var3));
         var3 += 2;
         long var8 = ZipUtil.dosToJavaTime(ZipLong.getValue(this.LFH_BUF, var3));
         this.current.entry.setTime(var8);
         var3 += 4;
         ZipLong var10 = null;
         ZipLong var11 = null;
         if (!this.current.hasDataDescriptor) {
            this.current.entry.setCrc(ZipLong.getValue(this.LFH_BUF, var3));
            var3 += 4;
            var11 = new ZipLong(this.LFH_BUF, var3);
            var3 += 4;
            var10 = new ZipLong(this.LFH_BUF, var3);
            var3 += 4;
         } else {
            var3 += 12;
         }

         int var12 = ZipShort.getValue(this.LFH_BUF, var3);
         var3 += 2;
         int var13 = ZipShort.getValue(this.LFH_BUF, var3);
         var3 += 2;
         byte[] var14 = new byte[var12];
         this.readFully(var14);
         this.current.entry.setName(var7.decode(var14), var14);
         byte[] var15 = new byte[var13];
         this.readFully(var15);
         this.current.entry.setExtra(var15);
         if (!var6 && this.useUnicodeExtraFields) {
            ZipUtil.setNameAndCommentFromExtraFields(this.current.entry, var14, null);
         }

         this.processZip64Extra(var10, var11);
         if (this.current.entry.getCompressedSize() != -1L) {
            if (this.current.entry.getMethod() == ZipMethod.UNSHRINKING.getCode()) {
               this.current.in = new UnshrinkingInputStream(new ZipArchiveInputStream.BoundedInputStream(this.in, this.current.entry.getCompressedSize()));
            } else if (this.current.entry.getMethod() == ZipMethod.IMPLODING.getCode()) {
               this.current.in = new ExplodingInputStream(
                  this.current.entry.getGeneralPurposeBit().getSlidingDictionarySize(),
                  this.current.entry.getGeneralPurposeBit().getNumberOfShannonFanoTrees(),
                  new ZipArchiveInputStream.BoundedInputStream(this.in, this.current.entry.getCompressedSize())
               );
            }
         }

         this.entriesRead++;
         return this.current.entry;
      } else {
         return null;
      }
   }

   private void readFirstLocalFileHeader(byte[] var1) {
      this.readFully(var1);
      ZipLong var2 = new ZipLong(var1);
      if (var2.equals(ZipLong.DD_SIG)) {
         throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.SPLITTING);
      }

      if (var2.equals(ZipLong.SINGLE_SEGMENT_SPLIT_MARKER)) {
         byte[] var3 = new byte[4];
         this.readFully(var3);
         System.arraycopy(var1, 4, var1, 0, 26);
         System.arraycopy(var3, 0, var1, 26, 4);
      }
   }

   private void processZip64Extra(ZipLong var1, ZipLong var2) {
      Zip64ExtendedInformationExtraField var3 = (Zip64ExtendedInformationExtraField)this.current
         .entry
         .getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
      this.current.usesZip64 = var3 != null;
      if (!this.current.hasDataDescriptor) {
         if (var3 == null || !var2.equals(ZipLong.ZIP64_MAGIC) && !var1.equals(ZipLong.ZIP64_MAGIC)) {
            this.current.entry.setCompressedSize(var2.getValue());
            this.current.entry.setSize(var1.getValue());
         } else {
            this.current.entry.setCompressedSize(var3.getCompressedSize().getLongValue());
            this.current.entry.setSize(var3.getSize().getLongValue());
         }
      }
   }

   @Override
   public ArchiveEntry getNextEntry() {
      return this.getNextZipEntry();
   }

   @Override
   public boolean canReadEntryData(ArchiveEntry var1) {
      if (!(var1 instanceof ZipArchiveEntry)) {
         return false;
      }

      ZipArchiveEntry var2 = (ZipArchiveEntry)var1;
      return ZipUtil.canHandleEntryData(var2) && this.supportsDataDescriptorFor(var2);
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      if (this.closed) {
         throw new IOException("The stream is closed");
      }

      if (this.current == null) {
         return -1;
      }

      if (var2 <= var1.length && var3 >= 0 && var2 >= 0 && var1.length - var2 >= var3) {
         ZipUtil.checkRequestedFeatures(this.current.entry);
         if (!this.supportsDataDescriptorFor(this.current.entry)) {
            throw new UnsupportedZipFeatureException(UnsupportedZipFeatureException.Feature.DATA_DESCRIPTOR, this.current.entry);
         }

         int var4;
         if (this.current.entry.getMethod() == 0) {
            var4 = this.readStored(var1, var2, var3);
         } else if (this.current.entry.getMethod() == 8) {
            var4 = this.readDeflated(var1, var2, var3);
         } else {
            if (this.current.entry.getMethod() != ZipMethod.UNSHRINKING.getCode() && this.current.entry.getMethod() != ZipMethod.IMPLODING.getCode()) {
               throw new UnsupportedZipFeatureException(ZipMethod.getMethodByCode(this.current.entry.getMethod()), this.current.entry);
            }

            var4 = this.current.in.read(var1, var2, var3);
         }

         if (var4 >= 0) {
            this.current.crc.update(var1, var2, var4);
         }

         return var4;
      } else {
         throw new ArrayIndexOutOfBoundsException();
      }
   }

   private int readStored(byte[] var1, int var2, int var3) {
      if (this.current.hasDataDescriptor) {
         if (this.lastStoredEntry == null) {
            this.readStoredEntry();
         }

         return this.lastStoredEntry.read(var1, var2, var3);
      } else {
         long var4 = this.current.entry.getSize();
         if (this.current.bytesRead >= var4) {
            return -1;
         }

         if (this.buf.position() >= this.buf.limit()) {
            ((Buffer)this.buf).position(0);
            int var6 = this.in.read(this.buf.array());
            if (var6 == -1) {
               return -1;
            }

            ((Buffer)this.buf).limit(var6);
            this.count(var6);
            this.current.bytesReadFromStream += var6;
         }

         int var7 = Math.min(this.buf.remaining(), var3);
         if (var4 - this.current.bytesRead < var7) {
            var7 = (int)(var4 - this.current.bytesRead);
         }

         this.buf.get(var1, var2, var7);
         this.current.bytesRead += var7;
         return var7;
      }
   }

   private int readDeflated(byte[] var1, int var2, int var3) {
      int var4 = this.readFromInflater(var1, var2, var3);
      if (var4 <= 0) {
         if (this.inf.finished()) {
            return -1;
         }

         if (this.inf.needsDictionary()) {
            throw new ZipException("This archive needs a preset dictionary which is not supported by Commons Compress.");
         }

         if (var4 == -1) {
            throw new IOException("Truncated ZIP file");
         }
      }

      return var4;
   }

   private int readFromInflater(byte[] var1, int var2, int var3) {
      int var4 = 0;

      do {
         if (this.inf.needsInput()) {
            int var5 = this.fill();
            if (var5 <= 0) {
               if (var5 == -1) {
                  return -1;
               }
               break;
            }

            this.current.bytesReadFromStream += this.buf.limit();
         }

         try {
            var4 = this.inf.inflate(var1, var2, var3);
         } catch (DataFormatException var6) {
            throw (IOException)new ZipException(var6.getMessage()).initCause(var6);
         }
      } while (var4 == 0 && this.inf.needsInput());

      return var4;
   }

   @Override
   public void close() {
      if (!this.closed) {
         this.closed = true;
         this.in.close();
         this.inf.end();
      }
   }

   @Override
   public long skip(long var1) {
      if (var1 >= 0L) {
         long var3 = 0L;

         while (var3 < var1) {
            long var5 = var1 - var3;
            int var7 = this.read(this.SKIP_BUF, 0, (int)(this.SKIP_BUF.length > var5 ? var5 : this.SKIP_BUF.length));
            if (var7 == -1) {
               return var3;
            }

            var3 += var7;
         }

         return var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static boolean matches(byte[] var0, int var1) {
      return var1 < ZipArchiveOutputStream.LFH_SIG.length
         ? false
         : checksig(var0, ZipArchiveOutputStream.LFH_SIG)
            || checksig(var0, ZipArchiveOutputStream.EOCD_SIG)
            || checksig(var0, ZipArchiveOutputStream.DD_SIG)
            || checksig(var0, ZipLong.SINGLE_SEGMENT_SPLIT_MARKER.getBytes());
   }

   private static boolean checksig(byte[] var0, byte[] var1) {
      for (int var2 = 0; var2 < var1.length; var2++) {
         if (var0[var2] != var1[var2]) {
            return false;
         }
      }

      return true;
   }

   private void closeEntry() {
      if (this.closed) {
         throw new IOException("The stream is closed");
      }

      if (this.current != null) {
         if (this.current.bytesReadFromStream <= this.current.entry.getCompressedSize() && !this.current.hasDataDescriptor) {
            this.drainCurrentEntryData();
         } else {
            this.skip(Long.MAX_VALUE);
            long var1 = this.current.entry.getMethod() == 8 ? this.getBytesInflated() : this.current.bytesRead;
            int var3 = (int)(this.current.bytesReadFromStream - var1);
            if (var3 > 0) {
               this.pushback(this.buf.array(), this.buf.limit() - var3, var3);
            }
         }

         if (this.lastStoredEntry == null && this.current.hasDataDescriptor) {
            this.readDataDescriptor();
         }

         this.inf.reset();
         ((Buffer)this.buf).clear().flip();
         this.current = null;
         this.lastStoredEntry = null;
      }
   }

   private void drainCurrentEntryData() {
      long var1 = this.current.entry.getCompressedSize() - this.current.bytesReadFromStream;

      while (var1 > 0L) {
         long var3 = this.in.read(this.buf.array(), 0, (int)Math.min(this.buf.capacity(), var1));
         if (var3 < 0L) {
            throw new EOFException("Truncated ZIP entry: " + this.current.entry.getName());
         }

         this.count(var3);
         var1 -= var3;
      }
   }

   private long getBytesInflated() {
      long var1 = this.inf.getBytesRead();
      if (this.current.bytesReadFromStream >= 4294967296L) {
         while (var1 + 4294967296L <= this.current.bytesReadFromStream) {
            var1 += 4294967296L;
         }
      }

      return var1;
   }

   private int fill() {
      if (this.closed) {
         throw new IOException("The stream is closed");
      }

      int var1 = this.in.read(this.buf.array());
      if (var1 > 0) {
         ((Buffer)this.buf).limit(var1);
         this.count(this.buf.limit());
         this.inf.setInput(this.buf.array(), 0, this.buf.limit());
      }

      return var1;
   }

   private void readFully(byte[] var1) {
      int var2 = IOUtils.readFully(this.in, var1);
      this.count(var2);
      if (var2 < var1.length) {
         throw new EOFException();
      }
   }

   private void readDataDescriptor() {
      this.readFully(this.WORD_BUF);
      ZipLong var1 = new ZipLong(this.WORD_BUF);
      if (ZipLong.DD_SIG.equals(var1)) {
         this.readFully(this.WORD_BUF);
         var1 = new ZipLong(this.WORD_BUF);
      }

      this.current.entry.setCrc(var1.getValue());
      this.readFully(this.TWO_DWORD_BUF);
      ZipLong var2 = new ZipLong(this.TWO_DWORD_BUF, 8);
      if (!var2.equals(ZipLong.CFH_SIG) && !var2.equals(ZipLong.LFH_SIG)) {
         this.current.entry.setCompressedSize(ZipEightByteInteger.getLongValue(this.TWO_DWORD_BUF));
         this.current.entry.setSize(ZipEightByteInteger.getLongValue(this.TWO_DWORD_BUF, 8));
      } else {
         this.pushback(this.TWO_DWORD_BUF, 8, 8);
         this.current.entry.setCompressedSize(ZipLong.getValue(this.TWO_DWORD_BUF));
         this.current.entry.setSize(ZipLong.getValue(this.TWO_DWORD_BUF, 4));
      }
   }

   private boolean supportsDataDescriptorFor(ZipArchiveEntry var1) {
      return !var1.getGeneralPurposeBit().usesDataDescriptor() || this.allowStoredEntriesWithDataDescriptor && var1.getMethod() == 0 || var1.getMethod() == 8;
   }

   private void readStoredEntry() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      int var2 = 0;
      boolean var3 = false;
      int var4 = this.current.usesZip64 ? 20 : 12;

      while (!var3) {
         int var5 = this.in.read(this.buf.array(), var2, 512 - var2);
         if (var5 <= 0) {
            throw new IOException("Truncated ZIP file");
         }

         if (var5 + var2 < 4) {
            var2 += var5;
         } else {
            var3 = this.bufferContainsSignature(var1, var2, var5, var4);
            if (!var3) {
               var2 = this.cacheBytesRead(var1, var2, var5, var4);
            }
         }
      }

      byte[] var6 = var1.toByteArray();
      this.lastStoredEntry = new ByteArrayInputStream(var6);
   }

   private boolean bufferContainsSignature(ByteArrayOutputStream var1, int var2, int var3, int var4) {
      boolean var5 = false;
      int var6 = 0;

      for (int var7 = 0; !var5 && var7 < var3 - 4; var7++) {
         if (this.buf.array()[var7] == LFH[0] && this.buf.array()[var7 + 1] == LFH[1]) {
            if ((this.buf.array()[var7 + 2] != LFH[2] || this.buf.array()[var7 + 3] != LFH[3])
               && (this.buf.array()[var7] != CFH[2] || this.buf.array()[var7 + 3] != CFH[3])) {
               if (this.buf.array()[var7 + 2] == DD[2] && this.buf.array()[var7 + 3] == DD[3]) {
                  var6 = var2 + var3 - var7;
                  var5 = true;
               }
            } else {
               var6 = var2 + var3 - var7 - var4;
               var5 = true;
            }

            if (var5) {
               this.pushback(this.buf.array(), var2 + var3 - var6, var6);
               var1.write(this.buf.array(), 0, var7);
               this.readDataDescriptor();
            }
         }
      }

      return var5;
   }

   private int cacheBytesRead(ByteArrayOutputStream var1, int var2, int var3, int var4) {
      int var5 = var2 + var3 - var4 - 3;
      if (var5 > 0) {
         var1.write(this.buf.array(), 0, var5);
         System.arraycopy(this.buf.array(), var5, this.buf.array(), 0, var4 + 3);
         var2 = var4 + 3;
      } else {
         var2 += var3;
      }

      return var2;
   }

   private void pushback(byte[] var1, int var2, int var3) {
      ((PushbackInputStream)this.in).unread(var1, var2, var3);
      this.pushedBackBytes(var3);
   }

   private void skipRemainderOfArchive() {
      this.realSkip(this.entriesRead * 46 - 30);
      this.findEocdRecord();
      this.realSkip(16L);
      this.readFully(this.SHORT_BUF);
      this.realSkip(ZipShort.getValue(this.SHORT_BUF));
   }

   private void findEocdRecord() {
      int var1 = -1;
      boolean var2 = false;

      while (var2 || (var1 = this.readOneByte()) > -1) {
         var2 = false;
         if (this.isFirstByteOfEocdSig(var1)) {
            var1 = this.readOneByte();
            if (var1 != ZipArchiveOutputStream.EOCD_SIG[1]) {
               if (var1 == -1) {
                  break;
               }

               var2 = this.isFirstByteOfEocdSig(var1);
            } else {
               var1 = this.readOneByte();
               if (var1 != ZipArchiveOutputStream.EOCD_SIG[2]) {
                  if (var1 == -1) {
                     break;
                  }

                  var2 = this.isFirstByteOfEocdSig(var1);
               } else {
                  var1 = this.readOneByte();
                  if (var1 == -1 || var1 == ZipArchiveOutputStream.EOCD_SIG[3]) {
                     break;
                  }

                  var2 = this.isFirstByteOfEocdSig(var1);
               }
            }
         }
      }
   }

   private void realSkip(long var1) {
      if (var1 >= 0L) {
         long var3 = 0L;

         while (var3 < var1) {
            long var5 = var1 - var3;
            int var7 = this.in.read(this.SKIP_BUF, 0, (int)(this.SKIP_BUF.length > var5 ? var5 : this.SKIP_BUF.length));
            if (var7 == -1) {
               return;
            }

            this.count(var7);
            var3 += var7;
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   private int readOneByte() {
      int var1 = this.in.read();
      if (var1 != -1) {
         this.count(1);
      }

      return var1;
   }

   private boolean isFirstByteOfEocdSig(int var1) {
      return var1 == ZipArchiveOutputStream.EOCD_SIG[0];
   }

   private class BoundedInputStream extends InputStream {
      private final InputStream in;
      private final long max;
      private long pos = 0L;

      public BoundedInputStream(InputStream var2, long var3) {
         this.max = var3;
         this.in = var2;
      }

      @Override
      public int read() {
         if (this.max >= 0L && this.pos >= this.max) {
            return -1;
         }

         int var1 = this.in.read();
         this.pos++;
         ZipArchiveInputStream.this.count(1);
         ZipArchiveInputStream.this.current.bytesReadFromStream++;
         return var1;
      }

      @Override
      public int read(byte[] var1) {
         return this.read(var1, 0, var1.length);
      }

      @Override
      public int read(byte[] var1, int var2, int var3) {
         if (this.max >= 0L && this.pos >= this.max) {
            return -1;
         }

         long var4 = this.max >= 0L ? Math.min(var3, this.max - this.pos) : var3;
         int var6 = this.in.read(var1, var2, (int)var4);
         if (var6 == -1) {
            return -1;
         }

         this.pos += var6;
         ZipArchiveInputStream.this.count(var6);
         ZipArchiveInputStream.this.current.bytesReadFromStream += var6;
         return var6;
      }

      @Override
      public long skip(long var1) {
         long var3 = this.max >= 0L ? Math.min(var1, this.max - this.pos) : var1;
         long var5 = this.in.skip(var3);
         this.pos += var5;
         return var5;
      }

      @Override
      public int available() {
         return this.max >= 0L && this.pos >= this.max ? 0 : this.in.available();
      }
   }

   private static final class CurrentEntry {
      private final ZipArchiveEntry entry = new ZipArchiveEntry();
      private boolean hasDataDescriptor;
      private boolean usesZip64;
      private long bytesRead;
      private long bytesReadFromStream;
      private final CRC32 crc = new CRC32();
      private InputStream in;

      private CurrentEntry() {
      }
   }
}
