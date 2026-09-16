package org.apache.commons.compress.archivers.zip;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;

public class ZipArchiveEntry extends ZipEntry implements ArchiveEntry {
   public static final int PLATFORM_UNIX = 3;
   public static final int PLATFORM_FAT = 0;
   private static final int SHORT_MASK = 65535;
   private static final int SHORT_SHIFT = 16;
   private static final byte[] EMPTY = new byte[0];
   private int method = -1;
   private long size = -1L;
   private int internalAttributes = 0;
   private int platform = 0;
   private long externalAttributes = 0L;
   private LinkedHashMap<ZipShort, ZipExtraField> extraFields = null;
   private UnparseableExtraFieldData unparseableExtra = null;
   private String name = null;
   private byte[] rawName = null;
   private GeneralPurposeBit gpb = new GeneralPurposeBit();

   public ZipArchiveEntry(String var1) {
      super(var1);
      this.setName(var1);
   }

   public ZipArchiveEntry(ZipEntry var1) {
      super(var1);
      this.setName(var1.getName());
      byte[] var2 = var1.getExtra();
      if (var2 != null) {
         this.setExtraFields(ExtraFieldUtils.parse(var2, true, ExtraFieldUtils.UnparseableExtraField.READ));
      } else {
         this.setExtra();
      }

      this.setMethod(var1.getMethod());
      this.size = var1.getSize();
   }

   public ZipArchiveEntry(ZipArchiveEntry var1) {
      this((ZipEntry)var1);
      this.setInternalAttributes(var1.getInternalAttributes());
      this.setExternalAttributes(var1.getExternalAttributes());
      this.setExtraFields(var1.getExtraFields(true));
   }

   protected ZipArchiveEntry() {
      this("");
   }

   public ZipArchiveEntry(File var1, String var2) {
      this(var1.isDirectory() && !var2.endsWith("/") ? var2 + "/" : var2);
      if (var1.isFile()) {
         this.setSize(var1.length());
      }

      this.setTime(var1.lastModified());
   }

   @Override
   public Object clone() {
      ZipArchiveEntry var1 = (ZipArchiveEntry)super.clone();
      var1.setInternalAttributes(this.getInternalAttributes());
      var1.setExternalAttributes(this.getExternalAttributes());
      var1.setExtraFields(this.getExtraFields(true));
      return var1;
   }

   @Override
   public int getMethod() {
      return this.method;
   }

   @Override
   public void setMethod(int var1) {
      if (var1 < 0) {
         throw new IllegalArgumentException("ZIP compression method can not be negative: " + var1);
      }

      this.method = var1;
   }

   public int getInternalAttributes() {
      return this.internalAttributes;
   }

   public void setInternalAttributes(int var1) {
      this.internalAttributes = var1;
   }

   public long getExternalAttributes() {
      return this.externalAttributes;
   }

   public void setExternalAttributes(long var1) {
      this.externalAttributes = var1;
   }

   public void setUnixMode(int var1) {
      this.setExternalAttributes(var1 << 16 | ((var1 & 128) == 0 ? 1 : 0) | (this.isDirectory() ? 16 : 0));
      this.platform = 3;
   }

   public int getUnixMode() {
      return this.platform != 3 ? 0 : (int)(this.getExternalAttributes() >> 16 & 65535L);
   }

   public boolean isUnixSymlink() {
      return (this.getUnixMode() & 40960) == 40960;
   }

   public int getPlatform() {
      return this.platform;
   }

   protected void setPlatform(int var1) {
      this.platform = var1;
   }

   public void setExtraFields(ZipExtraField[] var1) {
      this.extraFields = new LinkedHashMap<>();

      for (ZipExtraField var5 : var1) {
         if (var5 instanceof UnparseableExtraFieldData) {
            this.unparseableExtra = (UnparseableExtraFieldData)var5;
         } else {
            this.extraFields.put(var5.getHeaderId(), var5);
         }
      }

      this.setExtra();
   }

   public ZipExtraField[] getExtraFields() {
      return this.getExtraFields(false);
   }

   public ZipExtraField[] getExtraFields(boolean var1) {
      if (this.extraFields != null) {
         ArrayList var2 = new ArrayList<>(this.extraFields.values());
         if (var1 && this.unparseableExtra != null) {
            var2.add(this.unparseableExtra);
         }

         return var2.toArray(new ZipExtraField[0]);
      } else {
         return var1 && this.unparseableExtra != null ? new ZipExtraField[]{this.unparseableExtra} : new ZipExtraField[0];
      }
   }

   public void addExtraField(ZipExtraField var1) {
      if (var1 instanceof UnparseableExtraFieldData) {
         this.unparseableExtra = (UnparseableExtraFieldData)var1;
      } else {
         if (this.extraFields == null) {
            this.extraFields = new LinkedHashMap<>();
         }

         this.extraFields.put(var1.getHeaderId(), var1);
      }

      this.setExtra();
   }

   public void addAsFirstExtraField(ZipExtraField var1) {
      if (var1 instanceof UnparseableExtraFieldData) {
         this.unparseableExtra = (UnparseableExtraFieldData)var1;
      } else {
         LinkedHashMap var2 = this.extraFields;
         this.extraFields = new LinkedHashMap<>();
         this.extraFields.put(var1.getHeaderId(), var1);
         if (var2 != null) {
            var2.remove(var1.getHeaderId());
            this.extraFields.putAll(var2);
         }
      }

      this.setExtra();
   }

   public void removeExtraField(ZipShort var1) {
      if (this.extraFields == null) {
         throw new NoSuchElementException();
      }

      if (this.extraFields.remove(var1) == null) {
         throw new NoSuchElementException();
      }

      this.setExtra();
   }

   public void removeUnparseableExtraFieldData() {
      if (this.unparseableExtra == null) {
         throw new NoSuchElementException();
      }

      this.unparseableExtra = null;
      this.setExtra();
   }

   public ZipExtraField getExtraField(ZipShort var1) {
      return this.extraFields != null ? this.extraFields.get(var1) : null;
   }

   public UnparseableExtraFieldData getUnparseableExtraFieldData() {
      return this.unparseableExtra;
   }

   @Override
   public void setExtra(byte[] var1) {
      try {
         ZipExtraField[] var2 = ExtraFieldUtils.parse(var1, true, ExtraFieldUtils.UnparseableExtraField.READ);
         this.mergeExtraFields(var2, true);
      } catch (ZipException var3) {
         throw new RuntimeException("Error parsing extra fields for entry: " + this.getName() + " - " + var3.getMessage(), var3);
      }
   }

   protected void setExtra() {
      super.setExtra(ExtraFieldUtils.mergeLocalFileDataData(this.getExtraFields(true)));
   }

   public void setCentralDirectoryExtra(byte[] var1) {
      try {
         ZipExtraField[] var2 = ExtraFieldUtils.parse(var1, false, ExtraFieldUtils.UnparseableExtraField.READ);
         this.mergeExtraFields(var2, false);
      } catch (ZipException var3) {
         throw new RuntimeException(var3.getMessage(), var3);
      }
   }

   public byte[] getLocalFileDataExtra() {
      byte[] var1 = this.getExtra();
      return var1 != null ? var1 : EMPTY;
   }

   public byte[] getCentralDirectoryExtra() {
      return ExtraFieldUtils.mergeCentralDirectoryData(this.getExtraFields(true));
   }

   @Override
   public String getName() {
      return this.name == null ? super.getName() : this.name;
   }

   @Override
   public boolean isDirectory() {
      return this.getName().endsWith("/");
   }

   protected void setName(String var1) {
      if (var1 != null && this.getPlatform() == 0 && var1.indexOf("/") == -1) {
         var1 = var1.replace('\\', '/');
      }

      this.name = var1;
   }

   @Override
   public long getSize() {
      return this.size;
   }

   @Override
   public void setSize(long var1) {
      if (var1 < 0L) {
         throw new IllegalArgumentException("invalid entry size");
      }

      this.size = var1;
   }

   protected void setName(String var1, byte[] var2) {
      this.setName(var1);
      this.rawName = var2;
   }

   public byte[] getRawName() {
      if (this.rawName != null) {
         byte[] var1 = new byte[this.rawName.length];
         System.arraycopy(this.rawName, 0, var1, 0, this.rawName.length);
         return var1;
      } else {
         return null;
      }
   }

   @Override
   public int hashCode() {
      return this.getName().hashCode();
   }

   public GeneralPurposeBit getGeneralPurposeBit() {
      return this.gpb;
   }

   public void setGeneralPurposeBit(GeneralPurposeBit var1) {
      this.gpb = var1;
   }

   private void mergeExtraFields(ZipExtraField[] var1, boolean var2) {
      if (this.extraFields == null) {
         this.setExtraFields(var1);
      } else {
         for (ZipExtraField var6 : var1) {
            ZipExtraField var7;
            if (var6 instanceof UnparseableExtraFieldData) {
               var7 = this.unparseableExtra;
            } else {
               var7 = this.getExtraField(var6.getHeaderId());
            }

            if (var7 == null) {
               this.addExtraField(var6);
            } else if (var2) {
               byte[] var8 = var6.getLocalFileDataData();
               var7.parseFromLocalFileData(var8, 0, var8.length);
            } else {
               byte[] var9 = var6.getCentralDirectoryData();
               var7.parseFromCentralDirectoryData(var9, 0, var9.length);
            }
         }

         this.setExtra();
      }
   }

   @Override
   public Date getLastModifiedDate() {
      return new Date(this.getTime());
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      }

      if (var1 != null && this.getClass() == var1.getClass()) {
         ZipArchiveEntry var2 = (ZipArchiveEntry)var1;
         String var3 = this.getName();
         String var4 = var2.getName();
         if (var3 == null) {
            if (var4 != null) {
               return false;
            }
         } else if (!var3.equals(var4)) {
            return false;
         }

         String var5 = this.getComment();
         String var6 = var2.getComment();
         if (var5 == null) {
            var5 = "";
         }

         if (var6 == null) {
            var6 = "";
         }

         return this.getTime() == var2.getTime()
            && var5.equals(var6)
            && this.getInternalAttributes() == var2.getInternalAttributes()
            && this.getPlatform() == var2.getPlatform()
            && this.getExternalAttributes() == var2.getExternalAttributes()
            && this.getMethod() == var2.getMethod()
            && this.getSize() == var2.getSize()
            && this.getCrc() == var2.getCrc()
            && this.getCompressedSize() == var2.getCompressedSize()
            && Arrays.equals(this.getCentralDirectoryExtra(), var2.getCentralDirectoryExtra())
            && Arrays.equals(this.getLocalFileDataExtra(), var2.getLocalFileDataExtra())
            && this.gpb.equals(var2.gpb);
      } else {
         return false;
      }
   }
}
