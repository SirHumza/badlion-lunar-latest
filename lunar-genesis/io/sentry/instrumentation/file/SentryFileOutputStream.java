package io.sentry.instrumentation.file;

import io.sentry.HubAdapter;
import io.sentry.IHub;
import io.sentry.ISpan;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class SentryFileOutputStream extends FileOutputStream {
   @NotNull
   private final FileOutputStream delegate;
   @NotNull
   private final FileIOSpanManager spanManager;

   public SentryFileOutputStream(@Nullable String var1) {
      this(var1 != null ? new File(var1) : null, false, HubAdapter.getInstance());
   }

   public SentryFileOutputStream(@Nullable String var1, boolean var2) {
      this(init(var1 != null ? new File(var1) : null, var2, null, HubAdapter.getInstance()));
   }

   public SentryFileOutputStream(@Nullable File var1) {
      this(var1, false, HubAdapter.getInstance());
   }

   public SentryFileOutputStream(@Nullable File var1, boolean var2) {
      this(init(var1, var2, null, HubAdapter.getInstance()));
   }

   public SentryFileOutputStream(@NotNull FileDescriptor var1) {
      this(init(var1, null, HubAdapter.getInstance()), var1);
   }

   SentryFileOutputStream(@Nullable File var1, boolean var2, @NotNull IHub var3) {
      this(init(var1, var2, null, var3));
   }

   private SentryFileOutputStream(@NotNull FileOutputStreamInitData var1, @NotNull FileDescriptor var2) {
      super(var2);
      this.spanManager = new FileIOSpanManager(var1.span, var1.file, var1.options);
      this.delegate = var1.delegate;
   }

   private SentryFileOutputStream(@NotNull FileOutputStreamInitData var1) {
      super(getFileDescriptor(var1.delegate));
      this.spanManager = new FileIOSpanManager(var1.span, var1.file, var1.options);
      this.delegate = var1.delegate;
   }

   private static FileOutputStreamInitData init(@Nullable File var0, boolean var1, @Nullable FileOutputStream var2, @NotNull IHub var3) {
      ISpan var4 = FileIOSpanManager.startSpan(var3, "file.write");
      if (var2 == null) {
         var2 = new FileOutputStream(var0, var1);
      }

      return new FileOutputStreamInitData(var0, var1, var4, var2, var3.getOptions());
   }

   private static FileOutputStreamInitData init(@NotNull FileDescriptor var0, @Nullable FileOutputStream var1, @NotNull IHub var2) {
      ISpan var3 = FileIOSpanManager.startSpan(var2, "file.write");
      if (var1 == null) {
         var1 = new FileOutputStream(var0);
      }

      return new FileOutputStreamInitData(null, false, var3, var1, var2.getOptions());
   }

   @Override
   public void write(int var1) {
      this.spanManager.performIO(() -> {
         this.delegate.write(var1);
         return 1;
      });
   }

   @Override
   public void write(byte @NotNull [] var1) {
      this.spanManager.performIO(() -> {
         this.delegate.write(var1);
         return var1.length;
      });
   }

   @Override
   public void write(byte @NotNull [] var1, int var2, int var3) {
      this.spanManager.performIO(() -> {
         this.delegate.write(var1, var2, var3);
         return var3;
      });
   }

   @Override
   public void close() {
      this.spanManager.finish(this.delegate);
   }

   private static FileDescriptor getFileDescriptor(@NotNull FileOutputStream var0) {
      try {
         return var0.getFD();
      } catch (IOException var2) {
         throw new FileNotFoundException("No file descriptor");
      }
   }

   public static final class Factory {
      public static FileOutputStream create(@NotNull FileOutputStream var0, @Nullable String var1) {
         return new SentryFileOutputStream(SentryFileOutputStream.init(var1 != null ? new File(var1) : null, false, var0, HubAdapter.getInstance()));
      }

      public static FileOutputStream create(@NotNull FileOutputStream var0, @Nullable String var1, boolean var2) {
         return new SentryFileOutputStream(SentryFileOutputStream.init(var1 != null ? new File(var1) : null, var2, var0, HubAdapter.getInstance()));
      }

      public static FileOutputStream create(@NotNull FileOutputStream var0, @Nullable File var1) {
         return new SentryFileOutputStream(SentryFileOutputStream.init(var1, false, var0, HubAdapter.getInstance()));
      }

      public static FileOutputStream create(@NotNull FileOutputStream var0, @Nullable File var1, boolean var2) {
         return new SentryFileOutputStream(SentryFileOutputStream.init(var1, var2, var0, HubAdapter.getInstance()));
      }

      public static FileOutputStream create(@NotNull FileOutputStream var0, @NotNull FileDescriptor var1) {
         return new SentryFileOutputStream(SentryFileOutputStream.init(var1, var0, HubAdapter.getInstance()), var1);
      }
   }
}
