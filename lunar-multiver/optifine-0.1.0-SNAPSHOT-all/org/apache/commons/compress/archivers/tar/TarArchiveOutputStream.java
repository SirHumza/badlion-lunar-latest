package org.apache.commons.compress.archivers.tar;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.archivers.zip.ZipEncodingHelper;
import org.apache.commons.compress.utils.CountingOutputStream;

public class TarArchiveOutputStream extends ArchiveOutputStream {
   public static final int LONGFILE_ERROR = 0;
   public static final int LONGFILE_TRUNCATE = 1;
   public static final int LONGFILE_GNU = 2;
   public static final int LONGFILE_POSIX = 3;
   public static final int BIGNUMBER_ERROR = 0;
   public static final int BIGNUMBER_STAR = 1;
   public static final int BIGNUMBER_POSIX = 2;
   private long currSize;
   private String currName;
   private long currBytes;
   private final byte[] recordBuf;
   private int assemLen;
   private final byte[] assemBuf;
   private int longFileMode = 0;
   private int bigNumberMode = 0;
   private int recordsWritten;
   private final int recordsPerBlock;
   private final int recordSize;
   private boolean closed = false;
   private boolean haveUnclosedEntry = false;
   private boolean finished = false;
   private final OutputStream out;
   private final ZipEncoding encoding;
   private boolean addPaxHeadersForNonAsciiNames = false;
   private static final ZipEncoding ASCII = ZipEncodingHelper.getZipEncoding("ASCII");

   public TarArchiveOutputStream(OutputStream var1) {
      this(var1, 10240, 512);
   }

   public TarArchiveOutputStream(OutputStream var1, String var2) {
      this(var1, 10240, 512, var2);
   }

   public TarArchiveOutputStream(OutputStream var1, int var2) {
      this(var1, var2, 512);
   }

   public TarArchiveOutputStream(OutputStream var1, int var2, String var3) {
      this(var1, var2, 512, var3);
   }

   public TarArchiveOutputStream(OutputStream var1, int var2, int var3) {
      this(var1, var2, var3, null);
   }

   public TarArchiveOutputStream(OutputStream var1, int var2, int var3, String var4) {
      this.out = new CountingOutputStream(var1);
      this.encoding = ZipEncodingHelper.getZipEncoding(var4);
      this.assemLen = 0;
      this.assemBuf = new byte[var3];
      this.recordBuf = new byte[var3];
      this.recordSize = var3;
      this.recordsPerBlock = var2 / var3;
   }

   public void setLongFileMode(int var1) {
      this.longFileMode = var1;
   }

   public void setBigNumberMode(int var1) {
      this.bigNumberMode = var1;
   }

   public void setAddPaxHeadersForNonAsciiNames(boolean var1) {
      this.addPaxHeadersForNonAsciiNames = var1;
   }

   @Deprecated
   @Override
   public int getCount() {
      return (int)this.getBytesWritten();
   }

   @Override
   public long getBytesWritten() {
      return ((CountingOutputStream)this.out).getBytesWritten();
   }

   @Override
   public void finish() {
      if (this.finished) {
         throw new IOException("This archive has already been finished");
      }

      if (this.haveUnclosedEntry) {
         throw new IOException("This archives contains unclosed entries.");
      }

      this.writeEOFRecord();
      this.writeEOFRecord();
      this.padAsNeeded();
      this.out.flush();
      this.finished = true;
   }

   @Override
   public void close() {
      if (!this.finished) {
         this.finish();
      }

      if (!this.closed) {
         this.out.close();
         this.closed = true;
      }
   }

   public int getRecordSize() {
      return this.recordSize;
   }

   @Override
   public void putArchiveEntry(ArchiveEntry var1) {
      if (this.finished) {
         throw new IOException("Stream has already been finished");
      }

      TarArchiveEntry var2 = (TarArchiveEntry)var1;
      HashMap var3 = new HashMap();
      String var4 = var2.getName();
      boolean var5 = this.handleLongName(var2, var4, var3, "path", (byte)76, "file name");
      String var6 = var2.getLinkName();
      boolean var7 = var6 != null && var6.length() > 0 && this.handleLongName(var2, var6, var3, "linkpath", (byte)75, "link name");
      if (this.bigNumberMode == 2) {
         this.addPaxHeadersForBigNumbers(var3, var2);
      } else if (this.bigNumberMode != 1) {
         this.failForBigNumbers(var2);
      }

      if (this.addPaxHeadersForNonAsciiNames && !var5 && !ASCII.canEncode(var4)) {
         var3.put("path", var4);
      }

      if (this.addPaxHeadersForNonAsciiNames && !var7 && (var2.isLink() || var2.isSymbolicLink()) && !ASCII.canEncode(var6)) {
         var3.put("linkpath", var6);
      }

      if (var3.size() > 0) {
         this.writePaxHeaders(var2, var4, var3);
      }

      var2.writeEntryHeader(this.recordBuf, this.encoding, this.bigNumberMode == 1);
      this.writeRecord(this.recordBuf);
      this.currBytes = 0L;
      if (var2.isDirectory()) {
         this.currSize = 0L;
      } else {
         this.currSize = var2.getSize();
      }

      this.currName = var4;
      this.haveUnclosedEntry = true;
   }

   @Override
   public void closeArchiveEntry() {
      if (this.finished) {
         throw new IOException("Stream has already been finished");
      }

      if (!this.haveUnclosedEntry) {
         throw new IOException("No current entry to close");
      }

      if (this.assemLen > 0) {
         for (int var1 = this.assemLen; var1 < this.assemBuf.length; var1++) {
            this.assemBuf[var1] = 0;
         }

         this.writeRecord(this.assemBuf);
         this.currBytes = this.currBytes + this.assemLen;
         this.assemLen = 0;
      }

      if (this.currBytes < this.currSize) {
         throw new IOException(
            "entry '" + this.currName + "' closed at '" + this.currBytes + "' before the '" + this.currSize + "' bytes specified in the header were written"
         );
      }

      this.haveUnclosedEntry = false;
   }

   @Override
   public void write(byte[] var1, int var2, int var3) {
      if (!this.haveUnclosedEntry) {
         throw new IllegalStateException("No current tar entry");
      }

      if (this.currBytes + var3 > this.currSize) {
         throw new IOException(
            "request to write '" + var3 + "' bytes exceeds size in header of '" + this.currSize + "' bytes for entry '" + this.currName + "'"
         );
      }

      if (this.assemLen > 0) {
         if (this.assemLen + var3 >= this.recordBuf.length) {
            int var4 = this.recordBuf.length - this.assemLen;
            System.arraycopy(this.assemBuf, 0, this.recordBuf, 0, this.assemLen);
            System.arraycopy(var1, var2, this.recordBuf, this.assemLen, var4);
            this.writeRecord(this.recordBuf);
            this.currBytes = this.currBytes + this.recordBuf.length;
            var2 += var4;
            var3 -= var4;
            this.assemLen = 0;
         } else {
            System.arraycopy(var1, var2, this.assemBuf, this.assemLen, var3);
            var2 += var3;
            this.assemLen += var3;
            var3 = 0;
         }
      }

      while (var3 > 0) {
         if (var3 < this.recordBuf.length) {
            System.arraycopy(var1, var2, this.assemBuf, this.assemLen, var3);
            this.assemLen += var3;
            break;
         }

         this.writeRecord(var1, var2);
         int var5 = this.recordBuf.length;
         this.currBytes += var5;
         var3 -= var5;
         var2 += var5;
      }
   }

   void writePaxHeaders(TarArchiveEntry var1, String var2, Map<String, String> var3) {
      String var4 = "./PaxHeaders.X/" + this.stripTo7Bits(var2);
      if (var4.length() >= 100) {
         var4 = var4.substring(0, 99);
      }

      TarArchiveEntry var5 = new TarArchiveEntry(var4, (byte)120);
      this.transferModTime(var1, var5);
      StringWriter var6 = new StringWriter();

      for (Entry var8 : var3.entrySet()) {
         String var9 = (String)var8.getKey();
         String var10 = (String)var8.getValue();
         int var11 = var9.length() + var10.length() + 3 + 2;
         String var12 = var11 + " " + var9 + "=" + var10 + "\n";

         for (int var13 = var12.getBytes("UTF-8").length; var11 != var13; var13 = var12.getBytes("UTF-8").length) {
            var11 = var13;
            var12 = var11 + " " + var9 + "=" + var10 + "\n";
         }

         var6.write(var12);
      }

      byte[] var14 = var6.toString().getBytes("UTF-8");
      var5.setSize(var14.length);
      this.putArchiveEntry(var5);
      this.write(var14);
      this.closeArchiveEntry();
   }

   private String stripTo7Bits(String var1) {
      int var2 = var1.length();
      StringBuilder var3 = new StringBuilder(var2);

      for (int var4 = 0; var4 < var2; var4++) {
         char var5 = (char)(var1.charAt(var4) & 127);
         if (this.shouldBeReplaced(var5)) {
            var3.append("_");
         } else {
            var3.append(var5);
         }
      }

      return var3.toString();
   }

   private boolean shouldBeReplaced(char var1) {
      return var1 == 0 || var1 == '/' || var1 == '\\';
   }

   private void writeEOFRecord() {
      Arrays.fill(this.recordBuf, (byte)0);
      this.writeRecord(this.recordBuf);
   }

   @Override
   public void flush() {
      this.out.flush();
   }

   @Override
   public ArchiveEntry createArchiveEntry(File var1, String var2) {
      if (this.finished) {
         throw new IOException("Stream has already been finished");
      } else {
         return new TarArchiveEntry(var1, var2);
      }
   }

   private void writeRecord(byte[] var1) {
      if (var1.length != this.recordSize) {
         throw new IOException("record to write has length '" + var1.length + "' which is not the record size of '" + this.recordSize + "'");
      }

      this.out.write(var1);
      this.recordsWritten++;
   }

   private void writeRecord(byte[] var1, int var2) {
      if (var2 + this.recordSize > var1.length) {
         throw new IOException(
            "record has length '" + var1.length + "' with offset '" + var2 + "' which is less than the record size of '" + this.recordSize + "'"
         );
      }

      this.out.write(var1, var2, this.recordSize);
      this.recordsWritten++;
   }

   private void padAsNeeded() {
      int var1 = this.recordsWritten % this.recordsPerBlock;
      if (var1 != 0) {
         for (int var2 = var1; var2 < this.recordsPerBlock; var2++) {
            this.writeEOFRecord();
         }
      }
   }

   private void addPaxHeadersForBigNumbers(Map<String, String> var1, TarArchiveEntry var2) {
      this.addPaxHeaderForBigNumber(var1, "size", var2.getSize(), 8589934591L);
      this.addPaxHeaderForBigNumber(var1, "gid", var2.getGroupId(), 2097151L);
      this.addPaxHeaderForBigNumber(var1, "mtime", var2.getModTime().getTime() / 1000L, 8589934591L);
      this.addPaxHeaderForBigNumber(var1, "uid", var2.getUserId(), 2097151L);
      this.addPaxHeaderForBigNumber(var1, "SCHILY.devmajor", var2.getDevMajor(), 2097151L);
      this.addPaxHeaderForBigNumber(var1, "SCHILY.devminor", var2.getDevMinor(), 2097151L);
      this.failForBigNumber("mode", var2.getMode(), 2097151L);
   }

   private void addPaxHeaderForBigNumber(Map<String, String> var1, String var2, long var3, long var5) {
      if (var3 < 0L || var3 > var5) {
         var1.put(var2, String.valueOf(var3));
      }
   }

   private void failForBigNumbers(TarArchiveEntry var1) {
      this.failForBigNumber("entry size", var1.getSize(), 8589934591L);
      this.failForBigNumber("group id", var1.getGroupId(), 2097151L);
      this.failForBigNumber("last modification time", var1.getModTime().getTime() / 1000L, 8589934591L);
      this.failForBigNumber("user id", var1.getUserId(), 2097151L);
      this.failForBigNumber("mode", var1.getMode(), 2097151L);
      this.failForBigNumber("major device number", var1.getDevMajor(), 2097151L);
      this.failForBigNumber("minor device number", var1.getDevMinor(), 2097151L);
   }

   private void failForBigNumber(String var1, long var2, long var4) {
      if (var2 < 0L || var2 > var4) {
         throw new RuntimeException(var1 + " '" + var2 + "' is too big ( > " + var4 + " )");
      }
   }

   private boolean handleLongName(TarArchiveEntry var1, String var2, Map<String, String> var3, String var4, byte var5, String var6) {
      ByteBuffer var7 = this.encoding.encode(var2);
      int var8 = var7.limit() - var7.position();
      if (var8 >= 100) {
         if (this.longFileMode == 3) {
            var3.put(var4, var2);
            return true;
         }

         if (this.longFileMode == 2) {
            TarArchiveEntry var9 = new TarArchiveEntry("././@LongLink", var5);
            var9.setSize(var8 + 1);
            this.transferModTime(var1, var9);
            this.putArchiveEntry(var9);
            this.write(var7.array(), var7.arrayOffset(), var8);
            this.write(0);
            this.closeArchiveEntry();
         } else if (this.longFileMode != 1) {
            throw new RuntimeException(var6 + " '" + var2 + "' is too long ( > " + 100 + " bytes)");
         }
      }

      return false;
   }

   private void transferModTime(TarArchiveEntry var1, TarArchiveEntry var2) {
      Date var3 = var1.getModTime();
      long var4 = var3.getTime() / 1000L;
      if (var4 < 0L || var4 > 8589934591L) {
         var3 = new Date(0L);
      }

      var2.setModTime(var3);
   }
}
