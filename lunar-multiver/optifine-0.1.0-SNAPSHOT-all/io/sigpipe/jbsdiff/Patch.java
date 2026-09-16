package io.sigpipe.jbsdiff;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;

public class Patch {
   public static void patch(byte[] var0, byte[] var1, OutputStream var2) {
      ByteArrayInputStream var3 = new ByteArrayInputStream(var1);
      Header var4 = new Header(var3);
      var3.close();
      InputStream var5 = new ByteArrayInputStream(var1);
      InputStream var6 = new ByteArrayInputStream(var1);
      InputStream var7 = new ByteArrayInputStream(var1);

      try {
         var5.skip(32L);
         var6.skip(32 + var4.getControlLength());
         var7.skip(32 + var4.getControlLength() + var4.getDiffLength());
         CompressorStreamFactory var8 = new CompressorStreamFactory();
         var5 = var8.createCompressorInputStream(var5);
         var6 = var8.createCompressorInputStream(var6);
         var7 = var8.createCompressorInputStream(var7);
         int var9 = 0;
         int var10 = 0;
         byte[] var11 = new byte[var4.getOutputLength()];

         while (var9 < var11.length) {
            ControlBlock var12 = new ControlBlock(var5);
            read(var6, var11, var9, var12.getDiffLength());

            for (int var13 = 0; var13 < var12.getDiffLength(); var13++) {
               if (var10 + var13 >= 0 && var10 + var13 < var0.length) {
                  var11[var9 + var13] = (byte)(var11[var9 + var13] + var0[var10 + var13]);
               }
            }

            var9 += var12.getDiffLength();
            var10 += var12.getDiffLength();
            read(var7, var11, var9, var12.getExtraLength());
            var9 += var12.getExtraLength();
            var10 += var12.getSeekLength();
         }

         var2.write(var11);
      } finally {
         var5.close();
         var6.close();
         var7.close();
      }
   }

   private static void read(InputStream var0, byte[] var1, int var2, int var3) {
      if (var3 != 0) {
         int var4 = var0.read(var1, var2, var3);
         if (var4 < var3) {
            throw new IOException("Corrupt patch; bytes expected = " + var3 + " bytes read = " + var4);
         }
      }
   }
}
