package org.apache.commons.compress.archivers.ar;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveInputStream;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.apache.commons.compress.utils.IOUtils;

public class ArArchiveInputStream extends ArchiveInputStream {
   private final InputStream input;
   private long offset = 0L;
   private boolean closed;
   private ArArchiveEntry currentEntry = null;
   private byte[] namebuffer = null;
   private long entryOffset = -1L;
   private final byte[] NAME_BUF = new byte[16];
   private final byte[] LAST_MODIFIED_BUF = new byte[12];
   private final byte[] ID_BUF = new byte[6];
   private final byte[] FILE_MODE_BUF = new byte[8];
   private final byte[] LENGTH_BUF = new byte[10];
   static final String BSD_LONGNAME_PREFIX = "#1/";
   private static final int BSD_LONGNAME_PREFIX_LEN = "#1/".length();
   private static final String BSD_LONGNAME_PATTERN = "^#1/\\d+";
   private static final String GNU_STRING_TABLE_NAME = "//";
   private static final String GNU_LONGNAME_PATTERN = "^/\\d+";

   public ArArchiveInputStream(InputStream var1) {
      this.input = var1;
      this.closed = false;
   }

   public ArArchiveEntry getNextArEntry() {
      if (this.currentEntry != null) {
         long var1 = this.entryOffset + this.currentEntry.getLength();
         IOUtils.skip(this, var1 - this.offset);
         this.currentEntry = null;
      }

      if (this.offset == 0L) {
         byte[] var6 = ArchiveUtils.toAsciiBytes("!<arch>\n");
         byte[] var2 = new byte[var6.length];
         int var3 = IOUtils.readFully(this, var2);
         if (var3 != var6.length) {
            throw new IOException("failed to read header. Occured at byte: " + this.getBytesRead());
         }

         for (int var4 = 0; var4 < var6.length; var4++) {
            if (var6[var4] != var2[var4]) {
               throw new IOException("invalid header " + ArchiveUtils.toAsciiString(var2));
            }
         }
      }

      if (this.offset % 2L != 0L && this.read() < 0) {
         return null;
      }

      if (this.input.available() == 0) {
         return null;
      }

      IOUtils.readFully(this, this.NAME_BUF);
      IOUtils.readFully(this, this.LAST_MODIFIED_BUF);
      IOUtils.readFully(this, this.ID_BUF);
      int var7 = this.asInt(this.ID_BUF, true);
      IOUtils.readFully(this, this.ID_BUF);
      IOUtils.readFully(this, this.FILE_MODE_BUF);
      IOUtils.readFully(this, this.LENGTH_BUF);
      byte[] var8 = ArchiveUtils.toAsciiBytes("`\n");
      byte[] var10 = new byte[var8.length];
      int var12 = IOUtils.readFully(this, var10);
      if (var12 != var8.length) {
         throw new IOException("failed to read entry trailer. Occured at byte: " + this.getBytesRead());
      }

      for (int var5 = 0; var5 < var8.length; var5++) {
         if (var8[var5] != var10[var5]) {
            throw new IOException("invalid entry trailer. not read the content? Occured at byte: " + this.getBytesRead());
         }
      }

      this.entryOffset = this.offset;
      String var9 = ArchiveUtils.toAsciiString(this.NAME_BUF).trim();
      if (isGNUStringTable(var9)) {
         this.currentEntry = this.readGNUStringTable(this.LENGTH_BUF);
         return this.getNextArEntry();
      }

      long var11 = this.asLong(this.LENGTH_BUF);
      if (var9.endsWith("/")) {
         var9 = var9.substring(0, var9.length() - 1);
      } else if (this.isGNULongName(var9)) {
         int var13 = Integer.parseInt(var9.substring(1));
         var9 = this.getExtendedName(var13);
      } else if (isBSDLongName(var9)) {
         var9 = this.getBSDLongName(var9);
         int var14 = var9.length();
         var11 -= var14;
         this.entryOffset += var14;
      }

      this.currentEntry = new ArArchiveEntry(
         var9, var11, var7, this.asInt(this.ID_BUF, true), this.asInt(this.FILE_MODE_BUF, 8), this.asLong(this.LAST_MODIFIED_BUF)
      );
      return this.currentEntry;
   }

   private String getExtendedName(int var1) {
      if (this.namebuffer == null) {
         throw new IOException("Cannot process GNU long filename as no // record was found");
      }

      for (int var2 = var1; var2 < this.namebuffer.length; var2++) {
         if (this.namebuffer[var2] == 10) {
            if (this.namebuffer[var2 - 1] == 47) {
               var2--;
            }

            return ArchiveUtils.toAsciiString(this.namebuffer, var1, var2 - var1);
         }
      }

      throw new IOException("Failed to read entry: " + var1);
   }

   private long asLong(byte[] var1) {
      return Long.parseLong(ArchiveUtils.toAsciiString(var1).trim());
   }

   private int asInt(byte[] var1) {
      return this.asInt(var1, 10, false);
   }

   private int asInt(byte[] var1, boolean var2) {
      return this.asInt(var1, 10, var2);
   }

   private int asInt(byte[] var1, int var2) {
      return this.asInt(var1, var2, false);
   }

   private int asInt(byte[] var1, int var2, boolean var3) {
      String var4 = ArchiveUtils.toAsciiString(var1).trim();
      return var4.length() == 0 && var3 ? 0 : Integer.parseInt(var4, var2);
   }

   @Override
   public ArchiveEntry getNextEntry() {
      return this.getNextArEntry();
   }

   @Override
   public void close() {
      if (!this.closed) {
         this.closed = true;
         this.input.close();
      }

      this.currentEntry = null;
   }

   @Override
   public int read(byte[] var1, int var2, int var3) {
      int var4 = var3;
      if (this.currentEntry != null) {
         long var5 = this.entryOffset + this.currentEntry.getLength();
         if (var3 <= 0 || var5 <= this.offset) {
            return -1;
         }

         var4 = (int)Math.min(var3, var5 - this.offset);
      }

      int var7 = this.input.read(var1, var2, var4);
      this.count(var7);
      this.offset += var7 > 0 ? var7 : 0L;
      return var7;
   }

   public static boolean matches(byte[] var0, int var1) {
      if (var1 < 8) {
         return false;
      } else if (var0[0] != 33) {
         return false;
      } else if (var0[1] != 60) {
         return false;
      } else if (var0[2] != 97) {
         return false;
      } else if (var0[3] != 114) {
         return false;
      } else if (var0[4] != 99) {
         return false;
      } else if (var0[5] != 104) {
         return false;
      } else {
         return var0[6] != 62 ? false : var0[7] == 10;
      }
   }

   private static boolean isBSDLongName(String var0) {
      return var0 != null && var0.matches("^#1/\\d+");
   }

   private String getBSDLongName(String var1) {
      int var2 = Integer.parseInt(var1.substring(BSD_LONGNAME_PREFIX_LEN));
      byte[] var3 = new byte[var2];
      int var4 = IOUtils.readFully(this.input, var3);
      this.count(var4);
      if (var4 != var2) {
         throw new EOFException();
      } else {
         return ArchiveUtils.toAsciiString(var3);
      }
   }

   private static boolean isGNUStringTable(String var0) {
      return "//".equals(var0);
   }

   private ArArchiveEntry readGNUStringTable(byte[] var1) {
      int var2 = this.asInt(var1);
      this.namebuffer = new byte[var2];
      int var3 = IOUtils.readFully(this, this.namebuffer, 0, var2);
      if (var3 != var2) {
         throw new IOException("Failed to read complete // record: expected=" + var2 + " read=" + var3);
      } else {
         return new ArArchiveEntry("//", var2);
      }
   }

   private boolean isGNULongName(String var1) {
      return var1 != null && var1.matches("^/\\d+");
   }
}
