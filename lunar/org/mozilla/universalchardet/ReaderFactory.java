package org.mozilla.universalchardet;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public final class ReaderFactory {
   private ReaderFactory() {
      throw new AssertionError("No instances allowed");
   }

   public static BufferedReader createBufferedReader(File var0, Charset var1) {
      Charset var2 = Objects.requireNonNull(var1, "defaultCharset must be not null");
      String var3 = UniversalDetector.detectCharset(var0);
      if (var3 != null) {
         var2 = Charset.forName(var3);
      }

      if (!var2.name().contains("UTF")) {
         return Files.newBufferedReader(var0.toPath(), var2);
      }

      Path var4 = var0.toPath();
      return new BufferedReader(new InputStreamReader(new UnicodeBOMInputStream(new BufferedInputStream(Files.newInputStream(var4))), var2));
   }

   public static BufferedReader createBufferedReader(File var0) {
      return createBufferedReader(var0, Charset.defaultCharset());
   }

   @Deprecated
   public static Reader createReaderFromFile(File var0, Charset var1) {
      return createBufferedReader(var0, var1);
   }

   @Deprecated
   public static Reader createReaderFromFile(File var0) {
      return createReaderFromFile(var0, Charset.defaultCharset());
   }
}
