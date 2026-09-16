package io.sentry.exception;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class InvalidSentryTraceHeaderException extends Exception {
   private static final long serialVersionUID = -8353316997083420940L;
   @NotNull
   private final String sentryTraceHeader;

   public InvalidSentryTraceHeaderException(@NotNull String var1) {
      this(var1, null);
   }

   public InvalidSentryTraceHeaderException(@NotNull String var1, @Nullable Throwable var2) {
      super("sentry-trace header does not conform to expected format: " + var1, var2);
      this.sentryTraceHeader = var1;
   }

   @NotNull
   public String getSentryTraceHeader() {
      return this.sentryTraceHeader;
   }
}
