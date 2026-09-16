package org.fusesource.jansi.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Properties;
import java.util.Random;

public class JansiLoader {
   private static boolean extracted = false;
   private static String nativeLibraryPath;
   private static String nativeLibrarySourceUrl;

   public static synchronized boolean initialize() {
      if (!extracted) {
         cleanup();
      }

      try {
         loadJansiNativeLibrary();
      } catch (Exception var1) {
         throw new RuntimeException("Unable to load jansi native library", var1);
      }

      return extracted;
   }

   public static String getNativeLibraryPath() {
      return nativeLibraryPath;
   }

   public static String getNativeLibrarySourceUrl() {
      return nativeLibrarySourceUrl;
   }

   private static File getTempDir() {
      return new File(System.getProperty("jansi.tmpdir", System.getProperty("java.io.tmpdir")));
   }

   static void cleanup() {
      String var0 = getTempDir().getAbsolutePath();
      File var1 = new File(var0);
      File[] var2 = var1.listFiles(new FilenameFilter() {
         private final String searchPattern = "jansi-" + JansiLoader.getVersion();

         @Override
         public boolean accept(File var1, String var2x) {
            return var2x.startsWith(this.searchPattern) && !var2x.endsWith(".lck");
         }
      });
      if (var2 != null) {
         for (File var6 : var2) {
            File var7 = new File(var6.getAbsolutePath() + ".lck");
            if (!var7.exists()) {
               try {
                  var6.delete();
               } catch (SecurityException var9) {
                  System.err.println("Failed to delete old native lib" + var9.getMessage());
               }
            }
         }
      }
   }

   private static int readNBytes(InputStream var0, byte[] var1) {
      int var2 = 0;
      int var3 = var1.length;

      while (var2 < var3) {
         int var4 = var0.read(var1, var2, var3 - var2);
         if (var4 <= 0) {
            break;
         }

         var2 += var4;
      }

      return var2;
   }

   private static String contentsEquals(InputStream var0, InputStream var1) {
      byte[] var2 = new byte[8192];
      byte[] var3 = new byte[8192];

      do {
         int var4 = readNBytes(var0, var2);
         int var5 = readNBytes(var1, var3);
         if (var4 <= 0) {
            if (var5 > 0) {
               return "EOF on first stream but not second";
            }

            return null;
         }

         if (var5 <= 0) {
            return "EOF on second stream but not first";
         }

         if (var5 != var4) {
            return "Read size different (" + var4 + " vs " + var5 + ")";
         }
      } while (Arrays.equals(var2, var3));

      return "Content differs";
   }

   private static boolean extractAndLoadLibraryFile(String var0, String var1, String var2) {
      String var3 = var0 + "/" + var1;
      String var4 = randomUUID();
      String var5 = String.format("jansi-%s-%s-%s", getVersion(), var4, var1);
      String var6 = var5 + ".lck";
      File var7 = new File(var2, var5);
      File var8 = new File(var2, var6);

      try {
         InputStream var9 = JansiLoader.class.getResourceAsStream(var3);

         try {
            if (!var8.exists()) {
               new FileOutputStream(var8).close();
            }

            FileOutputStream var10 = new FileOutputStream(var7);

            try {
               copy(var9, var10);
            } finally {
               var10.close();
            }
         } finally {
            var7.deleteOnExit();
            var8.deleteOnExit();
            var9.close();
         }

         var7.setReadable(true);
         var7.setWritable(true, true);
         var7.setExecutable(true);
         InputStream var40 = JansiLoader.class.getResourceAsStream(var3);

         try {
            FileInputStream var11 = new FileInputStream(var7);

            try {
               String var12 = contentsEquals(var40, var11);
               if (var12 != null) {
                  throw new RuntimeException(String.format("Failed to write a native library file at %s because %s", var7, var12));
               }
            } finally {
               var11.close();
            }
         } finally {
            var40.close();
         }

         if (loadNativeLibrary(var7)) {
            nativeLibrarySourceUrl = JansiLoader.class.getResource(var3).toExternalForm();
            return true;
         }
      } catch (IOException var39) {
         System.err.println(var39.getMessage());
      }

      return false;
   }

   private static String randomUUID() {
      return Long.toHexString(new Random().nextLong());
   }

   private static void copy(InputStream var0, OutputStream var1) {
      byte[] var2 = new byte[8192];

      int var3;
      while ((var3 = var0.read(var2)) > 0) {
         var1.write(var2, 0, var3);
      }
   }

   private static boolean loadNativeLibrary(File var0) {
      if (var0.exists()) {
         try {
            String var1 = var0.getAbsolutePath();
            System.load(var1);
            nativeLibraryPath = var1;
            return true;
         } catch (UnsatisfiedLinkError var2) {
            System.err.println("Failed to load native library:" + var0.getName() + ". osinfo: " + OSInfo.getNativeLibFolderPathForCurrentOS());
            System.err.println(var2);
            return false;
         }
      } else {
         return false;
      }
   }

   private static void loadJansiNativeLibrary() {
      if (!extracted) {
         LinkedList var0 = new LinkedList();
         String var1 = System.getProperty("library.jansi.path");
         String var2 = System.getProperty("library.jansi.name");
         if (var2 == null) {
            var2 = System.mapLibraryName("jansi");
            assert var2 != null;
            if (var2.endsWith(".dylib")) {
               var2 = var2.replace(".dylib", ".jnilib");
            }
         }

         if (var1 != null) {
            String var3 = var1 + "/" + OSInfo.getNativeLibFolderPathForCurrentOS();
            if (loadNativeLibrary(new File(var3, var2))) {
               extracted = true;
               return;
            }

            var0.add(var3);
            if (loadNativeLibrary(new File(var1, var2))) {
               extracted = true;
               return;
            }

            var0.add(var1);
         }

         String var11 = JansiLoader.class.getPackage().getName().replace('.', '/');
         var1 = String.format("/%s/native/%s", var11, OSInfo.getNativeLibFolderPathForCurrentOS());
         boolean var4 = hasResource(var1 + "/" + var2);
         if (var4) {
            String var5 = getTempDir().getAbsolutePath();
            if (extractAndLoadLibraryFile(var1, var2, var5)) {
               extracted = true;
               return;
            }

            var0.add(var1);
         }

         String var12 = System.getProperty("java.library.path", "");

         for (String var9 : var12.split(File.pathSeparator)) {
            if (!var9.isEmpty()) {
               if (loadNativeLibrary(new File(var9, var2))) {
                  extracted = true;
                  return;
               }

               var0.add(var9);
            }
         }

         extracted = false;
         throw new Exception(
            String.format(
               "No native library found for os.name=%s, os.arch=%s, paths=[%s]", OSInfo.getOSName(), OSInfo.getArchName(), join(var0, File.pathSeparator)
            )
         );
      }
   }

   private static boolean hasResource(String var0) {
      return JansiLoader.class.getResource(var0) != null;
   }

   public static int getMajorVersion() {
      String[] var0 = getVersion().split("\\.");
      return var0.length > 0 ? Integer.parseInt(var0[0]) : 1;
   }

   public static int getMinorVersion() {
      String[] var0 = getVersion().split("\\.");
      return var0.length > 1 ? Integer.parseInt(var0[1]) : 0;
   }

   public static String getVersion() {
      URL var0 = JansiLoader.class.getResource("/META-INF/maven/org.fusesource.jansi/jansi/pom.properties");
      String var1 = "unknown";

      try {
         if (var0 != null) {
            Properties var2 = new Properties();
            var2.load(var0.openStream());
            var1 = var2.getProperty("version", var1);
            var1 = var1.trim().replaceAll("[^0-9\\.]", "");
         }
      } catch (IOException var3) {
         System.err.println(var3);
      }

      return var1;
   }

   private static String join(List<String> var0, String var1) {
      StringBuilder var2 = new StringBuilder();
      boolean var3 = true;

      for (String var5 : var0) {
         if (var3) {
            var3 = false;
         } else {
            var2.append(var1);
         }

         var2.append(var5);
      }

      return var2.toString();
   }
}
