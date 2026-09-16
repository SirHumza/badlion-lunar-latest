package org.apache.commons.compress.compressors.pack200;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarFile;
import java.util.jar.JarOutputStream;
import java.util.jar.Pack200;
import java.util.jar.Pack200.Packer;
import java.util.jar.Pack200.Unpacker;

public class Pack200Utils {
   private Pack200Utils() {
   }

   public static void normalize(File var0) {
      normalize(var0, var0, null);
   }

   public static void normalize(File var0, Map<String, String> var1) {
      normalize(var0, var0, var1);
   }

   public static void normalize(File var0, File var1) {
      normalize(var0, var1, null);
   }

   public static void normalize(File var0, File var1, Map<String, String> var2) {
      if (var2 == null) {
         var2 = new HashMap();
      }

      var2.put("pack.segment.limit", "-1");
      File var3 = File.createTempFile("commons-compress", "pack200normalize");
      var3.deleteOnExit();

      try {
         OutputStream var4 = new FileOutputStream(var3);
         JarFile var5 = null;

         try {
            Packer var6 = Pack200.newPacker();
            var6.properties().putAll(var2);
            var6.pack(var5 = new JarFile(var0), var4);
            var5 = null;
            var4.close();
            var4 = null;
            Unpacker var7 = Pack200.newUnpacker();
            var4 = new JarOutputStream(new FileOutputStream(var1));
            var7.unpack(var3, (JarOutputStream)var4);
         } finally {
            if (var5 != null) {
               var5.close();
            }

            if (var4 != null) {
               var4.close();
            }
         }
      } finally {
         var3.delete();
      }
   }
}
