package io.sentry.instrumentation.file;

import io.sentry.IHub;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStreamReader;
import org.jetbrains.annotations.NotNull;

public final class SentryFileReader extends InputStreamReader {
   public SentryFileReader(@NotNull String var1) {
      super(new SentryFileInputStream(var1));
   }

   public SentryFileReader(@NotNull File var1) {
      super(new SentryFileInputStream(var1));
   }

   public SentryFileReader(@NotNull FileDescriptor var1) {
      super(new SentryFileInputStream(var1));
   }

   SentryFileReader(@NotNull File var1, @NotNull IHub var2) {
      super(new SentryFileInputStream(var1, var2));
   }
}
