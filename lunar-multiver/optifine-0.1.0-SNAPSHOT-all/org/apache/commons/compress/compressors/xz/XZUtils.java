package org.apache.commons.compress.compressors.xz;

import java.util.HashMap;
import org.apache.commons.compress.compressors.FileNameUtil;

public class XZUtils {
   private static final FileNameUtil fileNameUtil;
   private static final byte[] HEADER_MAGIC = new byte[]{-3, 55, 122, 88, 90, 0};
   private static volatile XZUtils.CachedAvailability cachedXZAvailability = XZUtils.CachedAvailability.DONT_CACHE;

   private XZUtils() {
   }

   public static boolean matches(byte[] var0, int var1) {
      if (var1 < HEADER_MAGIC.length) {
         return false;
      }

      for (int var2 = 0; var2 < HEADER_MAGIC.length; var2++) {
         if (var0[var2] != HEADER_MAGIC[var2]) {
            return false;
         }
      }

      return true;
   }

   public static boolean isXZCompressionAvailable() {
      XZUtils.CachedAvailability var0 = cachedXZAvailability;
      return var0 != XZUtils.CachedAvailability.DONT_CACHE ? var0 == XZUtils.CachedAvailability.CACHED_AVAILABLE : internalIsXZCompressionAvailable();
   }

   private static boolean internalIsXZCompressionAvailable() {
      try {
         XZCompressorInputStream.matches(null, 0);
         return true;
      } catch (NoClassDefFoundError var1) {
         return false;
      }
   }

   public static boolean isCompressedFilename(String var0) {
      return fileNameUtil.isCompressedFilename(var0);
   }

   public static String getUncompressedFilename(String var0) {
      return fileNameUtil.getUncompressedFilename(var0);
   }

   public static String getCompressedFilename(String var0) {
      return fileNameUtil.getCompressedFilename(var0);
   }

   public static void setCacheXZAvailablity(boolean var0) {
      if (!var0) {
         cachedXZAvailability = XZUtils.CachedAvailability.DONT_CACHE;
      } else if (cachedXZAvailability == XZUtils.CachedAvailability.DONT_CACHE) {
         boolean var1 = internalIsXZCompressionAvailable();
         cachedXZAvailability = var1 ? XZUtils.CachedAvailability.CACHED_AVAILABLE : XZUtils.CachedAvailability.CACHED_UNAVAILABLE;
      }
   }

   static XZUtils.CachedAvailability getCachedXZAvailability() {
      return cachedXZAvailability;
   }

   static {
      HashMap var0 = new HashMap();
      var0.put(".txz", ".tar");
      var0.put(".xz", "");
      var0.put("-xz", "");
      fileNameUtil = new FileNameUtil(var0, ".xz");

      try {
         Class.forName("org.osgi.framework.BundleEvent");
      } catch (Exception var2) {
         setCacheXZAvailablity(true);
      }
   }

   enum CachedAvailability {
      DONT_CACHE,
      CACHED_AVAILABLE,
      CACHED_UNAVAILABLE;
   }
}
