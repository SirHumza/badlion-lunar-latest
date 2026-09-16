package io.sentry.exception;

import org.jetbrains.annotations.Nullable;

public final class SentryHttpClientException extends Exception {
   private static final long serialVersionUID = 348162238030337390L;

   public SentryHttpClientException(@Nullable String var1) {
      super(var1);
   }
}
