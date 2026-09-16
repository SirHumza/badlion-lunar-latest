package org.apache.commons.compress.archivers.tar;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;

public class TarArchiveInputStream extends ArchiveInputStream {
   private static final int SMALL_BUFFER_SIZE = 256;
   private final byte[] SMALL_BUF = new byte[256];
   private final int recordSize;
   private final int blockSize;
   private boolean hasHitEOF;
   private long entrySize;
   private long entryOffset;
   private final InputStream is;
   private TarArchiveEntry currEntry;
   private final ZipEncoding encoding;

   public TarArchiveInputStream(InputStream var1) {
      this(var1, 10240, 512);
   }

   public TarArchiveInputStream(InputStream var1, String var2) {
      this(var1, 10240, 512, var2);
   }

   public TarArchiveInputStream(InputStream var1, int var2) {
      this(var1, var2, 512);
   }

   public TarArchiveInputStream(InputStream var1, int var2, String var3) {
      this(var1, var2, 512, var3);
   }

   public TarArchiveInputStream(InputStream var1, int var2, int var3) {
      this(var1, var2, var3, null);
   }

   public TarArchiveInputStream(InputStream var1, int var2, int var3, String var4) {
      this.is = var1;
      this.hasHitEOF = false;
      this.encoding = ZipEncodingHelper.getZipEncoding(var4);
      this.recordSize = var3;
      this.blockSize = var2;
   }

   @Override
   public void close() {
      this.is.close();
   }

   public int getRecordSize() {
      return this.recordSize;
   }

   @Override
   public int available() {
      return this.entrySize - this.entryOffset > 2147483647L ? Integer.MAX_VALUE : (int)(this.entrySize - this.entryOffset);
   }

   @Override
   public long skip(long var1) {
      if (var1 <= 0L) {
         return 0L;
      }

      long var3 = this.entrySize - this.entryOffset;
      long var5 = this.is.skip(Math.min(var1, var3));
      this.count(var5);
      this.entryOffset += var5;
      return var5;
   }

   @Override
   public boolean markSupported() {
      return false;
   }

   @Override
   public void mark(int var1) {
   }

   @Override
   public synchronized void reset() {
   }

   public TarArchiveEntry getNextTarEntry() {
      if (this.hasHitEOF) {
         return null;
      }

      if (this.currEntry != null) {
         IOUtils.skip(this, Long.MAX_VALUE);
         this.skipRecordPadding();
      }

      byte[] var1 = this.getRecord();
      if (var1 == null) {
         this.currEntry = null;
         return null;
      }

      try {
         this.currEntry = new TarArchiveEntry(var1, this.encoding);
      } catch (IllegalArgumentException var4) {
         IOException var3 = new IOException("Error detected parsing the header");
         var3.initCause(var4);
         throw var3;
      }

      this.entryOffset = 0L;
      this.entrySize = this.currEntry.getSize();
      if (this.currEntry.isGNULongLinkEntry()) {
         byte[] var2 = this.getLongNameData();
         if (var2 == null) {
            return null;
         }

         this.currEntry.setLinkName(this.encoding.decode(var2));
      }

      if (this.currEntry.isGNULongNameEntry()) {
         byte[] var5 = this.getLongNameData();
         if (var5 == null) {
            return null;
         }

         this.currEntry.setName(this.encoding.decode(var5));
      }

      if (this.currEntry.isPaxHeader()) {
         this.paxHeaders();
      }

      if (this.currEntry.isGNUSparse()) {
         this.readGNUSparse();
      }

      this.entrySize = this.currEntry.getSize();
      return this.currEntry;
   }

   private void skipRecordPadding() {
      if (this.entrySize > 0L && this.entrySize % this.recordSize != 0L) {
         long var1 = this.entrySize / this.recordSize + 1L;
         long var3 = var1 * this.recordSize - this.entrySize;
         long var5 = IOUtils.skip(this.is, var3);
         this.count(var5);
      }
   }

   protected byte[] getLongNameData() {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      int var2 = 0;

      while ((var2 = this.read(this.SMALL_BUF)) >= 0) {
         var1.write(this.SMALL_BUF, 0, var2);
      }

      this.getNextEntry();
      if (this.currEntry == null) {
         return null;
      }

      byte[] var3 = var1.toByteArray();
      var2 = var3.length;

      while (var2 > 0 && var3[var2 - 1] == 0) {
         var2--;
      }

      if (var2 != var3.length) {
         byte[] var4 = new byte[var2];
         System.arraycopy(var3, 0, var4, 0, var2);
         var3 = var4;
      }

      return var3;
   }

   private byte[] getRecord() {
      byte[] var1 = this.readRecord();
      this.hasHitEOF = this.isEOFRecord(var1);
      if (this.hasHitEOF && var1 != null) {
         this.tryToConsumeSecondEOFRecord();
         this.consumeRemainderOfLastBlock();
         var1 = null;
      }

      return var1;
   }

   protected boolean isEOFRecord(byte[] var1) {
      return var1 == null || ArchiveUtils.isArrayZero(var1, this.recordSize);
   }

   protected byte[] readRecord() {
      byte[] var1 = new byte[this.recordSize];
      int var2 = IOUtils.readFully(this.is, var1);
      this.count(var2);
      return var2 != this.recordSize ? null : var1;
   }

   private void paxHeaders() {
      Map var1 = this.parsePaxHeaders(this);
      this.getNextEntry();
      this.applyPaxHeadersToCurrentEntry(var1);
   }

   Map<String, String> parsePaxHeaders(InputStream var1) {
      HashMap var2 = new HashMap();

      int var3;
      do {
         int var4 = 0;
         int var5 = 0;

         while ((var3 = var1.read()) != -1) {
            var5++;
            if (var3 == 32) {
               ByteArrayOutputStream var6 = new ByteArrayOutputStream();

               while ((var3 = var1.read()) != -1) {
                  var5++;
                  if (var3 == 61) {
                     String var7 = var6.toString("UTF-8");
                     int var8 = var4 - var5;
                     byte[] var9 = new byte[var8];
                     int var10 = IOUtils.readFully(var1, var9);
                     if (var10 != var8) {
                        throw new IOException("Failed to read Paxheader. Expected " + var8 + " bytes, read " + var10);
                     }

                     String var11 = new String(var9, 0, var8 - 1, "UTF-8");
                     var2.put(var7, var11);
                     break;
                  }

                  var6.write((byte)var3);
               }
               break;
            }

            var4 *= 10;
            var4 += var3 - 48;
         }
      } while (var3 != -1);

      return var2;
   }

   private void applyPaxHeadersToCurrentEntry(Map<String, String> var1) {
      for (Entry var3 : var1.entrySet()) {
         String var4 = (String)var3.getKey();
         String var5 = (String)var3.getValue();
         if ("path".equals(var4)) {
            this.currEntry.setName(var5);
         } else if ("linkpath".equals(var4)) {
            this.currEntry.setLinkName(var5);
         } else if ("gid".equals(var4)) {
            this.currEntry.setGroupId(Integer.parseInt(var5));
         } else if ("gname".equals(var4)) {
            this.currEntry.setGroupName(var5);
         } else if ("uid".equals(var4)) {
            this.currEntry.setUserId(Integer.parseInt(var5));
         } else if ("uname".equals(var4)) {
            this.currEntry.setUserName(var5);
         } else if ("size".equals(var4)) {
            this.currEntry.setSize(Long.parseLong(var5));
         } else if ("mtime".equals(var4)) {
            this.currEntry.setModTime((long)(Double.parseDouble(var5) * 1000.0));
         } else if ("SCHILY.devminor".equals(var4)) {
            this.currEntry.setDevMinor(Integer.parseInt(var5));
         } else if ("SCHILY.devmajor".equals(var4)) {
            this.currEntry.setDevMajor(Integer.parseInt(var5));
         }
      }
   }

   private void readGNUSparse() {
      TarArchiveSparseEntry var1;
      if (this.currEntry.isExtended()) {
         do {
            byte[] var2 = this.getRecord();
            if (var2 == null) {
               this.currEntry = null;
               break;
            }

            var1 = new TarArchiveSparseEntry(var2);
         } while (var1.isExtended());
      }
   }

   @Override
   public ArchiveEntry getNextEntry() {
      return this.getNextTarEntry();
   }

   private void tryToConsumeSecondEOFRecord() {
      boolean var1 = true;
      boolean var2 = this.is.markSupported();
      if (var2) {
         this.is.mark(this.recordSize);
      }

      try {
         var1 = !this.isEOFRecord(this.readRecord());
      } finally {
         if (var1 && var2) {
            this.pushedBackBytes(this.recordSize);
            this.is.reset();
         }
      }
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      int var4 = 0;
      if (this.hasHitEOF || this.entryOffset >= this.entrySize) {
         return -1;
      }

      if (this.currEntry == null) {
         throw new IllegalStateException("No current tar entry");
      }

      var3 = Math.min(var3, this.available());
      var4 = this.is.read(var1, var2, var3);
      if (var4 == -1) {
         if (var3 > 0) {
            throw new IOException("Truncated TAR archive");
         }

         this.hasHitEOF = true;
      } else {
         this.count(var4);
         this.entryOffset += var4;
      }

      return var4;
   }

   @Override
   public boolean canReadEntryData(ArchiveEntry var1) {
      if (var1 instanceof TarArchiveEntry) {
         TarArchiveEntry var2 = (TarArchiveEntry)var1;
         return !var2.isGNUSparse();
      } else {
         return false;
      }
   }

   public TarArchiveEntry getCurrentEntry() {
      return this.currEntry;
   }

   protected final void setCurrentEntry(TarArchiveEntry var1) {
      this.currEntry = var1;
   }

   protected final boolean isAtEOF() {
      return this.hasHitEOF;
   }

   protected final void setAtEOF(boolean var1) {
      this.hasHitEOF = var1;
   }

   private void consumeRemainderOfLastBlock() {
      long var1 = this.getBytesRead() % this.blockSize;
      if (var1 > 0L) {
         long var3 = IOUtils.skip(this.is, this.blockSize - var1);
         this.count(var3);
      }
   }

   public static boolean matches(byte[] var0, int var1) {
      if (var1 < 265) {
         return false;
      } else if (ArchiveUtils.matchAsciiBuffer("ustar\u0000", var0, 257, 6) && ArchiveUtils.matchAsciiBuffer("00", var0, 263, 2)) {
         return true;
      } else {
         return !ArchiveUtils.matchAsciiBuffer("ustar ", var0, 257, 6)
               || !ArchiveUtils.matchAsciiBuffer(" \u0000", var0, 263, 2) && !ArchiveUtils.matchAsciiBuffer("0\u0000", var0, 263, 2)
            ? ArchiveUtils.matchAsciiBuffer("ustar\u0000", var0, 257, 6) && ArchiveUtils.matchAsciiBuffer("\u0000\u0000", var0, 263, 2)
            : true;
      }
   }
}
