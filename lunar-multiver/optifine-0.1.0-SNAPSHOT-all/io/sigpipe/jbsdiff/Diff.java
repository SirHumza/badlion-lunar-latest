package io.sigpipe.jbsdiff;

import io.sigpipe.jbsdiff.sort.SearchResult;
import io.sigpipe.jbsdiff.sort.SuffixSort;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;

public class Diff {
   public static void diff(byte[] var0, byte[] var1, OutputStream var2) {
      diff(var0, var1, var2, new DefaultDiffSettings());
   }

   public static void diff(byte[] var0, byte[] var1, OutputStream var2, DiffSettings var3) {
      CompressorStreamFactory var4 = new CompressorStreamFactory();
      String var5 = var3.getCompression();
      int[] var6 = var3.sort(var0);
      ByteArrayOutputStream var7 = new ByteArrayOutputStream();
      CompressorOutputStream var8 = var4.createCompressorOutputStream(var5, var7);
      SearchResult var9 = null;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      int var16 = 0;
      int var17 = 0;
      byte[] var26 = new byte[var1.length + 1];
      byte[] var27 = new byte[var1.length + 1];
      int var28 = 0;
      int var29 = 0;

      while (var10 < var1.length) {
         var16 = 0;
         var17 = var10 += var11;

         while (var10 < var1.length) {
            var9 = SuffixSort.search(var6, var0, 0, var1, var10, 0, var0.length);
            var11 = var9.getLength();
            var12 = var9.getPosition();

            while (var17 < var10 + var11) {
               if (var17 + var15 < var0.length && var0[var17 + var15] == var1[var17]) {
                  var16++;
               }

               var17++;
            }

            if (var11 == var16 && var11 != 0 || var11 > var16 + 8) {
               break;
            }

            if (var10 + var15 < var0.length && var0[var10 + var15] == var1[var10]) {
               var16--;
            }

            var10++;
         }

         if (var11 != var16 || var10 == var1.length) {
            int var18 = 0;
            int var19 = 0;
            int var20 = 0;
            int var30 = 0;

            while (var13 + var30 < var10 && var14 + var30 < var0.length) {
               if (var0[var14 + var30] == var1[var13 + var30]) {
                  var18++;
               }

               if (var18 * 2 - ++var30 > var19 * 2 - var20) {
                  var19 = var18;
                  var20 = var30;
               }
            }

            int var22 = 0;
            if (var10 < var1.length) {
               var18 = 0;
               int var21 = 0;

               for (int var38 = 1; var10 >= var13 + var38 && var12 >= var38; var38++) {
                  if (var0[var12 - var38] == var1[var10 - var38]) {
                     var18++;
                  }

                  if (var18 * 2 - var38 > var21 * 2 - var22) {
                     var21 = var18;
                     var22 = var38;
                  }
               }
            }

            if (var13 + var20 > var10 - var22) {
               int var23 = var13 + var20 - (var10 - var22);
               var18 = 0;
               int var24 = 0;
               int var25 = 0;

               for (int var39 = 0; var39 < var23; var39++) {
                  if (var1[var13 + var20 - var23 + var39] == var0[var14 + var20 - var23 + var39]) {
                     var18++;
                  }

                  if (var1[var10 - var22 + var39] == var0[var12 - var22 + var39]) {
                     var18--;
                  }

                  if (var18 > var24) {
                     var24 = var18;
                     var25 = var39 + 1;
                  }
               }

               var20 += var25 - var23;
               var22 -= var25;
            }

            for (int var40 = 0; var40 < var20; var40++) {
               var26[var28 + var40] = (byte)(var26[var28 + var40] | var1[var13 + var40] - var0[var14 + var40]);
            }

            for (int var41 = 0; var41 < var10 - var22 - (var13 + var20); var41++) {
               var27[var29 + var41] = var1[var13 + var20 + var41];
            }

            var28 += var20;
            var29 += var10 - var22 - (var13 + var20);
            ControlBlock var42 = new ControlBlock();
            var42.setDiffLength(var20);
            var42.setExtraLength(var10 - var22 - (var13 + var20));
            var42.setSeekLength(var12 - var22 - (var14 + var20));
            var42.write(var8);
            var13 = var10 - var22;
            var14 = var12 - var22;
            var15 = var12 - var10;
         }
      }

      var8.close();
      Header var43 = new Header();
      var43.setControlLength(var7.size());
      var8 = var4.createCompressorOutputStream(var5, var7);
      var8.write(var26);
      var8.close();
      var43.setDiffLength(var7.size() - var43.getControlLength());
      var8 = var4.createCompressorOutputStream(var5, var7);
      var8.write(var27);
      var8.close();
      var43.setOutputLength(var1.length);
      var43.write(var2);
      var2.write(var7.toByteArray());
   }
}
