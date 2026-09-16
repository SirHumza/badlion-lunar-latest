package org.apache.commons.compress.archivers.sevenz;

import java.util.LinkedList;

class Folder {
   Coder[] coders;
   long totalInputStreams;
   long totalOutputStreams;
   BindPair[] bindPairs;
   long[] packedStreams;
   long[] unpackSizes;
   boolean hasCrc;
   long crc;
   int numUnpackSubStreams;

   Iterable<Coder> getOrderedCoders() {
      LinkedList var1 = new LinkedList();
      int var2 = (int)this.packedStreams[0];

      while (var2 != -1) {
         var1.addLast(this.coders[var2]);
         int var3 = this.findBindPairForOutStream(var2);
         var2 = var3 != -1 ? (int)this.bindPairs[var3].inIndex : -1;
      }

      return var1;
   }

   int findBindPairForInStream(int var1) {
      for (int var2 = 0; var2 < this.bindPairs.length; var2++) {
         if (this.bindPairs[var2].inIndex == var1) {
            return var2;
         }
      }

      return -1;
   }

   int findBindPairForOutStream(int var1) {
      for (int var2 = 0; var2 < this.bindPairs.length; var2++) {
         if (this.bindPairs[var2].outIndex == var1) {
            return var2;
         }
      }

      return -1;
   }

   long getUnpackSize() {
      if (this.totalOutputStreams == 0L) {
         return 0L;
      }

      for (int var1 = (int)this.totalOutputStreams - 1; var1 >= 0; var1--) {
         if (this.findBindPairForOutStream(var1) < 0) {
            return this.unpackSizes[var1];
         }
      }

      return 0L;
   }

   long getUnpackSizeForCoder(Coder var1) {
      if (this.coders != null) {
         for (int var2 = 0; var2 < this.coders.length; var2++) {
            if (this.coders[var2] == var1) {
               return this.unpackSizes[var2];
            }
         }
      }

      return 0L;
   }

   @Override
   public String toString() {
      return "Folder with "
         + this.coders.length
         + " coders, "
         + this.totalInputStreams
         + " input streams, "
         + this.totalOutputStreams
         + " output streams, "
         + this.bindPairs.length
         + " bind pairs, "
         + this.packedStreams.length
         + " packed streams, "
         + this.unpackSizes.length
         + " unpack sizes, "
         + (this.hasCrc ? "with CRC " + this.crc : "without CRC")
         + " and "
         + this.numUnpackSubStreams
         + " unpack streams";
   }
}
