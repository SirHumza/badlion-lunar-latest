package io.sentry.instrumentation.file;

import io.sentry.HubAdapter;
import io.sentry.IHub;
import io.sentry.ISpan;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryFileInputStream extends FileInputStream {
   @NotNull
   private final FileInputStream delegate;
   @NotNull
   private final FileIOSpanManager spanManager;

   public SentryFileInputStream(@Nullable String var1) {
      this(var1 != null ? new File(var1) : null, HubAdapter.getInstance());
   }

   public SentryFileInputStream(@Nullable File var1) {
      this(var1, HubAdapter.getInstance());
   }

   public SentryFileInputStream(@NotNull FileDescriptor var1) {
      this(var1, HubAdapter.getInstance());
   }

   SentryFileInputStream(@Nullable File var1, @NotNull IHub var2) {
      this(init(var1, null, var2));
   }

   SentryFileInputStream(@NotNull FileDescriptor var1, @NotNull IHub var2) {
      this(init(var1, null, var2), var1);
   }

   private SentryFileInputStream(@NotNull FileInputStreamInitData var1, @NotNull FileDescriptor var2) {
      super(var2);
      this.spanManager = new FileIOSpanManager(var1.span, var1.file, var1.options);
      this.delegate = var1.delegate;
   }

   private SentryFileInputStream(@NotNull FileInputStreamInitData var1) {
      super(getFileDescriptor(var1.delegate));
      this.spanManager = new FileIOSpanManager(var1.span, var1.file, var1.options);
      this.delegate = var1.delegate;
   }

   private static FileInputStreamInitData init(@Nullable File var0, @Nullable FileInputStream var1, @NotNull IHub var2) {
      ISpan var3 = FileIOSpanManager.startSpan(var2, "file.read");
      if (var1 == null) {
         var1 = new FileInputStream(var0);
      }

      return new FileInputStreamInitData(var0, var3, var1, var2.getOptions());
   }

   private static FileInputStreamInitData init(@NotNull FileDescriptor var0, @Nullable FileInputStream var1, @NotNull IHub var2) {
      ISpan var3 = FileIOSpanManager.startSpan(var2, "file.read");
      if (var1 == null) {
         var1 = new FileInputStream(var0);
      }

      return new FileInputStreamInitData(null, var3, var1, var2.getOptions());
   }

   @Override
   public int read() {
      AtomicInteger var1 = new AtomicInteger(0);
      this.spanManager.performIO(() -> {
         int var2 = this.delegate.read();
         var1.set(var2);
         return var2 != -1 ? 1 : 0;
      });
      return var1.get();
   }

   @Override
   public int read(byte @NotNull [] var1) {
      return this.spanManager.performIO(() -> this.delegate.read(var1));
   }

   @Override
   public int read(byte @NotNull [] var1, int var2, int var3) {
      return this.spanManager.performIO(() -> this.delegate.read(var1, var2, var3));
   }

   @Override
   public long skip(long var1) {
      return this.spanManager.performIO(() -> this.delegate.skip(var1));
   }

   @Override
   public void close() {
      this.spanManager.finish(this.delegate);
   }

   private static FileDescriptor getFileDescriptor(@NotNull FileInputStream var0) {
      try {
         return var0.getFD();
      } catch (IOException var2) {
         throw new FileNotFoundException("No file descriptor");
      }
   }

   public static final class Factory {
      public static FileInputStream create(@NotNull FileInputStream var0, @Nullable String var1) {
         return new SentryFileInputStream(SentryFileInputStream.init(var1 != null ? new File(var1) : null, var0, HubAdapter.getInstance()));
      }

      public static FileInputStream create(@NotNull FileInputStream var0, @Nullable File var1) {
         return new SentryFileInputStream(SentryFileInputStream.init(var1, var0, HubAdapter.getInstance()));
      }

      public static FileInputStream create(@NotNull FileInputStream var0, @NotNull FileDescriptor var1) {
         return new SentryFileInputStream(SentryFileInputStream.init(var1, var0, HubAdapter.getInstance()), var1);
      }

      static FileInputStream create(@NotNull FileInputStream var0, @Nullable File var1, @NotNull IHub var2) {
         return new SentryFileInputStream(SentryFileInputStream.init(var1, var0, var2));
      }
   }
}
