package org.apache.commons.compress.archivers.dump;

import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class DumpArchiveEntry implements ArchiveEntry {
   private String name;
   private DumpArchiveEntry.TYPE type = DumpArchiveEntry.TYPE.UNKNOWN;
   private int mode;
   private Set<DumpArchiveEntry.PERMISSION> permissions = Collections.emptySet();
   private long size;
   private long atime;
   private long mtime;
   private int uid;
   private int gid;
   private final DumpArchiveSummary summary = null;
   private final DumpArchiveEntry.TapeSegmentHeader header = new DumpArchiveEntry.TapeSegmentHeader();
   private String simpleName;
   private String originalName;
   private int volume;
   private long offset;
   private int ino;
   private int nlink;
   private long ctime;
   private int generation;
   private boolean isDeleted;

   public DumpArchiveEntry() {
   }

   public DumpArchiveEntry(String var1, String var2) {
      this.setName(var1);
      this.simpleName = var2;
   }

   protected DumpArchiveEntry(String var1, String var2, int var3, DumpArchiveEntry.TYPE var4) {
      this.setType(var4);
      this.setName(var1);
      this.simpleName = var2;
      this.ino = var3;
      this.offset = 0L;
   }

   public String getSimpleName() {
      return this.simpleName;
   }

   protected void setSimpleName(String var1) {
      this.simpleName = var1;
   }

   public int getIno() {
      return this.header.getIno();
   }

   public int getNlink() {
      return this.nlink;
   }

   public void setNlink(int var1) {
      this.nlink = var1;
   }

   public Date getCreationTime() {
      return new Date(this.ctime);
   }

   public void setCreationTime(Date var1) {
      this.ctime = var1.getTime();
   }

   public int getGeneration() {
      return this.generation;
   }

   public void setGeneration(int var1) {
      this.generation = var1;
   }

   public boolean isDeleted() {
      return this.isDeleted;
   }

   public void setDeleted(boolean var1) {
      this.isDeleted = var1;
   }

   public long getOffset() {
      return this.offset;
   }

   public void setOffset(long var1) {
      this.offset = var1;
   }

   public int getVolume() {
      return this.volume;
   }

   public void setVolume(int var1) {
      this.volume = var1;
   }

   public DumpArchiveConstants.SEGMENT_TYPE getHeaderType() {
      return this.header.getType();
   }

   public int getHeaderCount() {
      return this.header.getCount();
   }

   public int getHeaderHoles() {
      return this.header.getHoles();
   }

   public boolean isSparseRecord(int var1) {
      return (this.header.getCdata(var1) & 1) == 0;
   }

   @Override
   public int hashCode() {
      return this.ino;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      }

      if (var1 != null && var1.getClass().equals(this.getClass())) {
         DumpArchiveEntry var2 = (DumpArchiveEntry)var1;
         if (this.header == null || var2.header == null) {
            return false;
         } else {
            return this.ino != var2.ino ? false : (this.summary != null || var2.summary == null) && (this.summary == null || this.summary.equals(var2.summary));
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return this.getName();
   }

   static DumpArchiveEntry parse(byte[] var0) {
      DumpArchiveEntry var1 = new DumpArchiveEntry();
      DumpArchiveEntry.TapeSegmentHeader var2 = var1.header;
      var2.type = DumpArchiveConstants.SEGMENT_TYPE.find(DumpArchiveUtil.convert32(var0, 0));
      var2.volume = DumpArchiveUtil.convert32(var0, 12);
      var1.ino = var2.ino = DumpArchiveUtil.convert32(var0, 20);
      int var3 = DumpArchiveUtil.convert16(var0, 32);
      var1.setType(DumpArchiveEntry.TYPE.find(var3 >> 12 & 15));
      var1.setMode(var3);
      var1.nlink = DumpArchiveUtil.convert16(var0, 34);
      var1.setSize(DumpArchiveUtil.convert64(var0, 40));
      long var4 = 1000L * DumpArchiveUtil.convert32(var0, 48) + DumpArchiveUtil.convert32(var0, 52) / 1000;
      var1.setAccessTime(new Date(var4));
      var4 = 1000L * DumpArchiveUtil.convert32(var0, 56) + DumpArchiveUtil.convert32(var0, 60) / 1000;
      var1.setLastModifiedDate(new Date(var4));
      var4 = 1000L * DumpArchiveUtil.convert32(var0, 64) + DumpArchiveUtil.convert32(var0, 68) / 1000;
      var1.ctime = var4;
      var1.generation = DumpArchiveUtil.convert32(var0, 140);
      var1.setUserId(DumpArchiveUtil.convert32(var0, 144));
      var1.setGroupId(DumpArchiveUtil.convert32(var0, 148));
      var2.count = DumpArchiveUtil.convert32(var0, 160);
      var2.holes = 0;

      for (int var6 = 0; var6 < 512 && var6 < var2.count; var6++) {
         if (var0[164 + var6] == 0) {
            var2.holes++;
         }
      }

      System.arraycopy(var0, 164, var2.cdata, 0, 512);
      var1.volume = var2.getVolume();
      return var1;
   }

   void update(byte[] var1) {
      this.header.volume = DumpArchiveUtil.convert32(var1, 16);
      this.header.count = DumpArchiveUtil.convert32(var1, 160);
      this.header.holes = 0;

      for (int var2 = 0; var2 < 512 && var2 < this.header.count; var2++) {
         if (var1[164 + var2] == 0) {
            this.header.holes++;
         }
      }

      System.arraycopy(var1, 164, this.header.cdata, 0, 512);
   }

   @Override
   public String getName() {
      return this.name;
   }

   String getOriginalName() {
      return this.originalName;
   }

   public final void setName(String var1) {
      this.originalName = var1;
      if (var1 != null) {
         if (this.isDirectory() && !var1.endsWith("/")) {
            var1 = var1 + "/";
         }

         if (var1.startsWith("./")) {
            var1 = var1.substring(2);
         }
      }

      this.name = var1;
   }

   @Override
   public Date getLastModifiedDate() {
      return new Date(this.mtime);
   }

   @Override
   public boolean isDirectory() {
      return this.type == DumpArchiveEntry.TYPE.DIRECTORY;
   }

   public boolean isFile() {
      return this.type == DumpArchiveEntry.TYPE.FILE;
   }

   public boolean isSocket() {
      return this.type == DumpArchiveEntry.TYPE.SOCKET;
   }

   public boolean isChrDev() {
      return this.type == DumpArchiveEntry.TYPE.CHRDEV;
   }

   public boolean isBlkDev() {
      return this.type == DumpArchiveEntry.TYPE.BLKDEV;
   }

   public boolean isFifo() {
      return this.type == DumpArchiveEntry.TYPE.FIFO;
   }

   public DumpArchiveEntry.TYPE getType() {
      return this.type;
   }

   public void setType(DumpArchiveEntry.TYPE var1) {
      this.type = var1;
   }

   public int getMode() {
      return this.mode;
   }

   public void setMode(int var1) {
      this.mode = var1 & 4095;
      this.permissions = DumpArchiveEntry.PERMISSION.find(var1);
   }

   public Set<DumpArchiveEntry.PERMISSION> getPermissions() {
      return this.permissions;
   }

   @Override
   public long getSize() {
      return this.isDirectory() ? -1L : this.size;
   }

   long getEntrySize() {
      return this.size;
   }

   public void setSize(long var1) {
      this.size = var1;
   }

   public void setLastModifiedDate(Date var1) {
      this.mtime = var1.getTime();
   }

   public Date getAccessTime() {
      return new Date(this.atime);
   }

   public void setAccessTime(Date var1) {
      this.atime = var1.getTime();
   }

   public int getUserId() {
      return this.uid;
   }

   public void setUserId(int var1) {
      this.uid = var1;
   }

   public int getGroupId() {
      return this.gid;
   }

   public void setGroupId(int var1) {
      this.gid = var1;
   }

   public enum PERMISSION {
      SETUID(2048),
      SETGUI(1024),
      STICKY(512),
      USER_READ(256),
      USER_WRITE(128),
      USER_EXEC(64),
      GROUP_READ(32),
      GROUP_WRITE(16),
      GROUP_EXEC(8),
      WORLD_READ(4),
      WORLD_WRITE(2),
      WORLD_EXEC(1);

      private int code;

      PERMISSION(int var3) {
         this.code = var3;
      }

      public static Set<DumpArchiveEntry.PERMISSION> find(int var0) {
         HashSet var1 = new HashSet();

         for (DumpArchiveEntry.PERMISSION var5 : values()) {
            if ((var0 & var5.code) == var5.code) {
               var1.add(var5);
            }
         }

         return var1.isEmpty() ? Collections.emptySet() : EnumSet.copyOf(var1);
      }
   }

   public enum TYPE {
      WHITEOUT(14),
      SOCKET(12),
      LINK(10),
      FILE(8),
      BLKDEV(6),
      DIRECTORY(4),
      CHRDEV(2),
      FIFO(1),
      UNKNOWN(15);

      private int code;

      TYPE(int var3) {
         this.code = var3;
      }

      public static DumpArchiveEntry.TYPE find(int var0) {
         DumpArchiveEntry.TYPE var1 = UNKNOWN;

         for (DumpArchiveEntry.TYPE var5 : values()) {
            if (var0 == var5.code) {
               var1 = var5;
            }
         }

         return var1;
      }
   }

   static class TapeSegmentHeader {
      private DumpArchiveConstants.SEGMENT_TYPE type;
      private int volume;
      private int ino;
      private int count;
      private int holes;
      private final byte[] cdata = new byte[512];

      public DumpArchiveConstants.SEGMENT_TYPE getType() {
         return this.type;
      }

      public int getVolume() {
         return this.volume;
      }

      public int getIno() {
         return this.ino;
      }

      void setIno(int var1) {
         this.ino = var1;
      }

      public int getCount() {
         return this.count;
      }

      public int getHoles() {
         return this.holes;
      }

      public int getCdata(int var1) {
         return this.cdata[var1];
      }
   }
}
