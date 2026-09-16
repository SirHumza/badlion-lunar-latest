package io.sentry.instrumentation.file;

import io.sentry.IHub;
import java.io.File;
import java.io.FileDescriptor;
import java.io.OutputStreamWriter;
import org.jetbrains.annotations.NotNull;

public final class SentryFileWriter extends OutputStreamWriter {
   public SentryFileWriter(@NotNull String var1) {
      super(new SentryFileOutputStream(var1));
   }

   public SentryFileWriter(@NotNull String var1, boolean var2) {
      super(new SentryFileOutputStream(var1, var2));
   }

   public SentryFileWriter(@NotNull File var1) {
      super(new SentryFileOutputStream(var1));
   }

   public SentryFileWriter(@NotNull File var1, boolean var2) {
      super(new SentryFileOutputStream(var1, var2));
   }

   public SentryFileWriter(@NotNull FileDescriptor var1) {
      super(new SentryFileOutputStream(var1));
   }

   SentryFileWriter(@NotNull File var1, boolean var2, @NotNull IHub var3) {
      super(new SentryFileOutputStream(var1, var2, var3));
   }
}
