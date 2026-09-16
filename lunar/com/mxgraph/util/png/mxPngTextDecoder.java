package com.mxgraph.util.png;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

public class mxPngTextDecoder {
   private static final Logger log = Logger.getLogger(mxPngTextDecoder.class.getName());
   public static final int PNG_CHUNK_ZTXT = 2052348020;
   public static final int PNG_CHUNK_IEND = 1229278788;

   public static Map<String, String> decodeCompressedText(InputStream var0) {
      Hashtable var1 = new Hashtable();
      if (!var0.markSupported()) {
         var0 = new BufferedInputStream(var0);
      }

      DataInputStream var2 = new DataInputStream(var0);

      try {
         long var3 = var2.readLong();
         if (var3 != -8552249625308161526L) {
            throw new RuntimeException("PNGImageDecoder0");
         }
      } catch (Exception var13) {
         throw new RuntimeException("PNGImageDecoder1", var13);
      }

      while (true) {
         try {
            int var16 = var2.readInt();
            int var4 = var2.readInt();
            byte[] var5 = new byte[var16];
            var2.readFully(var5);
            var2.readInt();
            if (var4 == 1229278788) {
               return var1;
            }

            if (var4 == 2052348020) {
               int var6 = 0;

               while (var5[var6++] != 0) {
               }

               String var7 = new String(var5, 0, var6 - 1);
               byte var8 = var5[var6++];
               StringBuffer var9 = new StringBuffer();

               try {
                  ByteArrayInputStream var10 = new ByteArrayInputStream(var5, var6, var16);
                  InflaterInputStream var11 = new InflaterInputStream(var10, new Inflater(true));

                  int var12;
                  while ((var12 = var11.read()) != -1) {
                     var9.append((char)var12);
                  }

                  var1.put(String.valueOf(var7), String.valueOf(var9));
               } catch (Exception var14) {
                  log.log(Level.SEVERE, "Failed to decode PNG text", var14);
               }
            }
         } catch (Exception var15) {
            log.log(Level.SEVERE, "Failed to decode PNG text", var15);
            return null;
         }
      }
   }
}
