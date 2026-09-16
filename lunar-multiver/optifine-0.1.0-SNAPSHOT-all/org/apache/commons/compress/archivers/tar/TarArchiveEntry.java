package org.apache.commons.compress.archivers.tar;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.apache.commons.compress.utils.ArchiveUtils;

public class TarArchiveEntry implements ArchiveEntry, TarConstants {
   private String name = "";
   private int mode;
   private int userId = 0;
   private int groupId = 0;
   private long size = 0L;
   private long modTime;
   private boolean checkSumOK;
   private byte linkFlag;
   private String linkName = "";
   private String magic = "ustar\u0000";
   private String version = "00";
   private String userName;
   private String groupName = "";
   private int devMajor = 0;
   private int devMinor = 0;
   private boolean isExtended;
   private long realSize;
   private final File file;
   public static final int MAX_NAMELEN = 31;
   public static final int DEFAULT_DIR_MODE = 16877;
   public static final int DEFAULT_FILE_MODE = 33188;
   public static final int MILLIS_PER_SECOND = 1000;

   private TarArchiveEntry() {
      String var1 = System.getProperty("user.name", "");
      if (var1.length() > 31) {
         var1 = var1.substring(0, 31);
      }

      this.userName = var1;
      this.file = null;
   }

   public TarArchiveEntry(String var1) {
      this(var1, false);
   }

   public TarArchiveEntry(String var1, boolean var2) {
      this();
      var1 = normalizeFileName(var1, var2);
      boolean var3 = var1.endsWith("/");
      this.name = var1;
      this.mode = var3 ? 16877 : 33188;
      this.linkFlag = (byte)(var3 ? 53 : 48);
      this.modTime = new Date().getTime() / 1000L;
      this.userName = "";
   }

   public TarArchiveEntry(String var1, byte var2) {
      this(var1, var2, false);
   }

   public TarArchiveEntry(String var1, byte var2, boolean var3) {
      this(var1, var3);
      this.linkFlag = var2;
      if (var2 == 76) {
         this.magic = "ustar ";
         this.version = " \u0000";
      }
   }

   public TarArchiveEntry(File var1) {
      this(var1, normalizeFileName(var1.getPath(), false));
   }

   public TarArchiveEntry(File var1, String var2) {
      this.file = var1;
      if (var1.isDirectory()) {
         this.mode = 16877;
         this.linkFlag = 53;
         int var3 = var2.length();
         if (var3 != 0 && var2.charAt(var3 - 1) == '/') {
            this.name = var2;
         } else {
            this.name = var2 + "/";
         }
      } else {
         this.mode = 33188;
         this.linkFlag = 48;
         this.size = var1.length();
         this.name = var2;
      }

      this.modTime = var1.lastModified() / 1000L;
      this.userName = "";
   }

   public TarArchiveEntry(byte[] var1) {
      this();
      this.parseTarHeader(var1);
   }

   public TarArchiveEntry(byte[] var1, ZipEncoding var2) {
      this();
      this.parseTarHeader(var1, var2);
   }

   public boolean equals(TarArchiveEntry var1) {
      return this.getName().equals(var1.getName());
   }

   @Override
   public boolean equals(Object var1) {
      return var1 != null && this.getClass() == var1.getClass() ? this.equals((TarArchiveEntry)var1) : false;
   }

   @Override
   public int hashCode() {
      return this.getName().hashCode();
   }

   public boolean isDescendent(TarArchiveEntry var1) {
      return var1.getName().startsWith(this.getName());
   }

   @Override
   public String getName() {
      return this.name.toString();
   }

   public void setName(String var1) {
      this.name = normalizeFileName(var1, false);
   }

   public void setMode(int var1) {
      this.mode = var1;
   }

   public String getLinkName() {
      return this.linkName.toString();
   }

   public void setLinkName(String var1) {
      this.linkName = var1;
   }

   public int getUserId() {
      return this.userId;
   }

   public void setUserId(int var1) {
      this.userId = var1;
   }

   public int getGroupId() {
      return this.groupId;
   }

   public void setGroupId(int var1) {
      this.groupId = var1;
   }

   public String getUserName() {
      return this.userName.toString();
   }

   public void setUserName(String var1) {
      this.userName = var1;
   }

   public String getGroupName() {
      return this.groupName.toString();
   }

   public void setGroupName(String var1) {
      this.groupName = var1;
   }

   public void setIds(int var1, int var2) {
      this.setUserId(var1);
      this.setGroupId(var2);
   }

   public void setNames(String var1, String var2) {
      this.setUserName(var1);
      this.setGroupName(var2);
   }

   public void setModTime(long var1) {
      this.modTime = var1 / 1000L;
   }

   public void setModTime(Date var1) {
      this.modTime = var1.getTime() / 1000L;
   }

   public Date getModTime() {
      return new Date(this.modTime * 1000L);
   }

   @Override
   public Date getLastModifiedDate() {
      return this.getModTime();
   }

   public boolean isCheckSumOK() {
      return this.checkSumOK;
   }

   public File getFile() {
      return this.file;
   }

   public int getMode() {
      return this.mode;
   }

   @Override
   public long getSize() {
      return this.size;
   }

   public void setSize(long var1) {
      if (var1 < 0L) {
         throw new IllegalArgumentException("Size is out of range: " + var1);
      }

      this.size = var1;
   }

   public int getDevMajor() {
      return this.devMajor;
   }

   public void setDevMajor(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Major device number is out of range: " + var1);
      }

      this.devMajor = var1;
   }

   public int getDevMinor() {
      return this.devMinor;
   }

   public void setDevMinor(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("Minor device number is out of range: " + var1);
      }

      this.devMinor = var1;
   }

   public boolean isExtended() {
      return this.isExtended;
   }

   public long getRealSize() {
      return this.realSize;
   }

   public boolean isGNUSparse() {
      return this.linkFlag == 83;
   }

   public boolean isGNULongLinkEntry() {
      return this.linkFlag == 75 && this.name.equals("././@LongLink");
   }

   public boolean isGNULongNameEntry() {
      return this.linkFlag == 76 && this.name.equals("././@LongLink");
   }

   public boolean isPaxHeader() {
      return this.linkFlag == 120 || this.linkFlag == 88;
   }

   public boolean isGlobalPaxHeader() {
      return this.linkFlag == 103;
   }

   @Override
   public boolean isDirectory() {
      if (this.file != null) {
         return this.file.isDirectory();
      } else {
         return this.linkFlag == 53 ? true : this.getName().endsWith("/");
      }
   }

   public boolean isFile() {
      if (this.file != null) {
         return this.file.isFile();
      } else {
         return this.linkFlag != 0 && this.linkFlag != 48 ? !this.getName().endsWith("/") : true;
      }
   }

   public boolean isSymbolicLink() {
      return this.linkFlag == 50;
   }

   public boolean isLink() {
      return this.linkFlag == 49;
   }

   public boolean isCharacterDevice() {
      return this.linkFlag == 51;
   }

   public boolean isBlockDevice() {
      return this.linkFlag == 52;
   }

   public boolean isFIFO() {
      return this.linkFlag == 54;
   }

   public TarArchiveEntry[] getDirectoryEntries() {
      if (this.file != null && this.file.isDirectory()) {
         String[] var1 = this.file.list();
         TarArchiveEntry[] var2 = new TarArchiveEntry[var1.length];

         for (int var3 = 0; var3 < var1.length; var3++) {
            var2[var3] = new TarArchiveEntry(new File(this.file, var1[var3]));
         }

         return var2;
      } else {
         return new TarArchiveEntry[0];
      }
   }

   public void writeEntryHeader(byte[] var1) {
      try {
         this.writeEntryHeader(var1, TarUtils.DEFAULT_ENCODING, false);
      } catch (IOException var5) {
         try {
            this.writeEntryHeader(var1, TarUtils.FALLBACK_ENCODING, false);
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }
      }
   }

   public void writeEntryHeader(byte[] var1, ZipEncoding var2, boolean var3) {
      int var4 = 0;
      var4 = TarUtils.formatNameBytes(this.name, var1, var4, 100, var2);
      var4 = this.writeEntryHeaderField(this.mode, var1, var4, 8, var3);
      var4 = this.writeEntryHeaderField(this.userId, var1, var4, 8, var3);
      var4 = this.writeEntryHeaderField(this.groupId, var1, var4, 8, var3);
      var4 = this.writeEntryHeaderField(this.size, var1, var4, 12, var3);
      var4 = this.writeEntryHeaderField(this.modTime, var1, var4, 12, var3);
      int var5 = var4;

      for (int var6 = 0; var6 < 8; var6++) {
         var1[var4++] = 32;
      }

      var1[var4++] = this.linkFlag;
      var4 = TarUtils.formatNameBytes(this.linkName, var1, var4, 100, var2);
      var4 = TarUtils.formatNameBytes(this.magic, var1, var4, 6);
      var4 = TarUtils.formatNameBytes(this.version, var1, var4, 2);
      var4 = TarUtils.formatNameBytes(this.userName, var1, var4, 32, var2);
      var4 = TarUtils.formatNameBytes(this.groupName, var1, var4, 32, var2);
      var4 = this.writeEntryHeaderField(this.devMajor, var1, var4, 8, var3);
      var4 = this.writeEntryHeaderField(this.devMinor, var1, var4, 8, var3);

      while (var4 < var1.length) {
         var1[var4++] = 0;
      }

      long var22 = TarUtils.computeCheckSum(var1);
      TarUtils.formatCheckSumOctalBytes(var22, var1, var5, 8);
   }

   private int writeEntryHeaderField(long var1, byte[] var3, int var4, int var5, boolean var6) {
      return var6 || var1 >= 0L && var1 < 1L << 3 * (var5 - 1)
         ? TarUtils.formatLongOctalOrBinaryBytes(var1, var3, var4, var5)
         : TarUtils.formatLongOctalBytes(0L, var3, var4, var5);
   }

   public void parseTarHeader(byte[] var1) {
      try {
         this.parseTarHeader(var1, TarUtils.DEFAULT_ENCODING);
      } catch (IOException var5) {
         try {
            this.parseTarHeader(var1, TarUtils.DEFAULT_ENCODING, true);
         } catch (IOException var4) {
            throw new RuntimeException(var4);
         }
      }
   }

   public void parseTarHeader(byte[] var1, ZipEncoding var2) {
      this.parseTarHeader(var1, var2, false);
   }

   private void parseTarHeader(byte[] var1, ZipEncoding var2, boolean var3) {
      int var4 = 0;
      this.name = var3 ? TarUtils.parseName(var1, var4, 100) : TarUtils.parseName(var1, var4, 100, var2);
      var4 += 100;
      this.mode = (int)TarUtils.parseOctalOrBinary(var1, var4, 8);
      var4 += 8;
      this.userId = (int)TarUtils.parseOctalOrBinary(var1, var4, 8);
      var4 += 8;
      this.groupId = (int)TarUtils.parseOctalOrBinary(var1, var4, 8);
      var4 += 8;
      this.size = TarUtils.parseOctalOrBinary(var1, var4, 12);
      var4 += 12;
      this.modTime = TarUtils.parseOctalOrBinary(var1, var4, 12);
      var4 += 12;
      this.checkSumOK = TarUtils.verifyCheckSum(var1);
      var4 += 8;
      this.linkFlag = var1[var4++];
      this.linkName = var3 ? TarUtils.parseName(var1, var4, 100) : TarUtils.parseName(var1, var4, 100, var2);
      var4 += 100;
      this.magic = TarUtils.parseName(var1, var4, 6);
      var4 += 6;
      this.version = TarUtils.parseName(var1, var4, 2);
      var4 += 2;
      this.userName = var3 ? TarUtils.parseName(var1, var4, 32) : TarUtils.parseName(var1, var4, 32, var2);
      var4 += 32;
      this.groupName = var3 ? TarUtils.parseName(var1, var4, 32) : TarUtils.parseName(var1, var4, 32, var2);
      var4 += 32;
      this.devMajor = (int)TarUtils.parseOctalOrBinary(var1, var4, 8);
      var4 += 8;
      this.devMinor = (int)TarUtils.parseOctalOrBinary(var1, var4, 8);
      var4 += 8;
      int var5 = this.evaluateType(var1);
      switch (var5) {
         case 2:
            var4 += 12;
            var4 += 12;
            var4 += 12;
            var4 += 4;
            var4 = ++var4 + 96;
            this.isExtended = TarUtils.parseBoolean(var1, var4);
            this.realSize = TarUtils.parseOctal(var1, ++var4, 12);
            var4 += 12;
            break;
         case 3:
         default:
            String var6 = var3 ? TarUtils.parseName(var1, var4, 155) : TarUtils.parseName(var1, var4, 155, var2);
            if (this.isDirectory() && !this.name.endsWith("/")) {
               this.name = this.name + "/";
            }

            if (var6.length() > 0) {
               this.name = var6 + "/" + this.name;
            }
      }
   }

   private static String normalizeFileName(String var0, boolean var1) {
      String var2 = System.getProperty("os.name").toLowerCase(Locale.ENGLISH);
      if (var2 != null) {
         if (var2.startsWith("windows")) {
            if (var0.length() > 2) {
               char var3 = var0.charAt(0);
               char var4 = var0.charAt(1);
               if (var4 == ':' && (var3 >= 'a' && var3 <= 'z' || var3 >= 'A' && var3 <= 'Z')) {
                  var0 = var0.substring(2);
               }
            }
         } else if (var2.indexOf("netware") > -1) {
            int var6 = var0.indexOf(58);
            if (var6 != -1) {
               var0 = var0.substring(var6 + 1);
            }
         }
      }

      var0 = var0.replace(File.separatorChar, '/');

      while (!var1 && var0.startsWith("/")) {
         var0 = var0.substring(1);
      }

      return var0;
   }

   private int evaluateType(byte[] var1) {
      if (ArchiveUtils.matchAsciiBuffer("ustar ", var1, 257, 6)) {
         return 2;
      } else {
         return ArchiveUtils.matchAsciiBuffer("ustar\u0000", var1, 257, 6) ? 3 : 0;
      }
   }
}
