package io.sentry.exception;

import io.sentry.protocol.Mechanism;
import io.sentry.util.Objects;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public final class ExceptionMechanismException extends RuntimeException {
   private static final long serialVersionUID = 142345454265713915L;
   @NotNull
   private final Mechanism exceptionMechanism;
   @NotNull
   private final Throwable throwable;
   @NotNull
   private final Thread thread;
   private final boolean snapshot;

   public ExceptionMechanismException(@NotNull Mechanism var1, @NotNull Throwable var2, @NotNull Thread var3, boolean var4) {
      this.exceptionMechanism = Objects.requireNonNull(var1, "Mechanism is required.");
      this.throwable = Objects.requireNonNull(var2, "Throwable is required.");
      this.thread = Objects.requireNonNull(var3, "Thread is required.");
      this.snapshot = var4;
   }

   public ExceptionMechanismException(@NotNull Mechanism var1, @NotNull Throwable var2, @NotNull Thread var3) {
      this(var1, var2, var3, false);
   }

   @NotNull
   public Mechanism getExceptionMechanism() {
      return this.exceptionMechanism;
   }

   @NotNull
   public Throwable getThrowable() {
      return this.throwable;
   }

   @NotNull
   public Thread getThread() {
      return this.thread;
   }

   public boolean isSnapshot() {
      return this.snapshot;
   }
}
