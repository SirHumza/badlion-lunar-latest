package org.apache.commons.compress.archivers.sevenz;

import java.util.BitSet;

class Archive {
   long packPos;
   long[] packSizes;
   BitSet packCrcsDefined;
   long[] packCrcs;
   Folder[] folders;
   SubStreamsInfo subStreamsInfo;
   SevenZArchiveEntry[] files;
   StreamMap streamMap;

   @Override
   public String toString() {
      return "Archive with packed streams starting at offset "
         + this.packPos
         + ", "
         + lengthOf(this.packSizes)
         + " pack sizes, "
         + lengthOf(this.packCrcs)
         + " CRCs, "
         + lengthOf(this.folders)
         + " folders, "
         + lengthOf(this.files)
         + " files and "
         + this.streamMap;
   }

   private static String lengthOf(long[] var0) {
      return var0 == null ? "(null)" : String.valueOf(var0.length);
   }

   private static String lengthOf(Object[] var0) {
      return var0 == null ? "(null)" : String.valueOf(var0.length);
   }
}
