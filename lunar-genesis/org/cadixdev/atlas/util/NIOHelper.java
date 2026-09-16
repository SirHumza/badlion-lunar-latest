package org.cadixdev.atlas.util;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.HashMap;

public final class NIOHelper {
   public static FileSystem openZip(Path var0, boolean var1) {
      URI var2 = URI.create("jar:" + var0.toUri());
      HashMap var3 = new HashMap();
      var3.put("create", Boolean.toString(var1));
      return FileSystems.newFileSystem(var2, var3);
   }

   private NIOHelper() {
   }
}
