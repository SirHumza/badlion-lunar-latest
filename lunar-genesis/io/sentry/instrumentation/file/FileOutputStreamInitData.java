package io.sentry.instrumentation.file;

import io.sentry.ISpan;
import io.sentry.SentryOptions;
import java.io.File;
import java.io.FileOutputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

final class FileOutputStreamInitData {
   @Nullable
   final File file;
   @Nullable
   final ISpan span;
   final boolean append;
   @NotNull
   final FileOutputStream delegate;
   @NotNull
   final SentryOptions options;

   FileOutputStreamInitData(@Nullable File var1, boolean var2, @Nullable ISpan var3, @NotNull FileOutputStream var4, @NotNull SentryOptions var5) {
      this.file = var1;
      this.append = var2;
      this.span = var3;
      this.delegate = var4;
      this.options = var5;
   }
}
