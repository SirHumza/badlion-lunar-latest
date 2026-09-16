package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.FileInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class FileInputStreamInitData {
   @Nullable
   final File file;
   @Nullable
   final ISpan span;
   @NotNull
   final FileInputStream delegate;
   @NotNull
   final SentryOptions options;

   FileInputStreamInitData(@Nullable File var1, @Nullable ISpan var2, @NotNull FileInputStream var3, @NotNull SentryOptions var4) {
      this.file = var1;
      this.span = var2;
      this.delegate = var3;
      this.options = var4;
   }
}
