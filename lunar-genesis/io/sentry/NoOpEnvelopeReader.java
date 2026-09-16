package io.sentry;

import java.io.InputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class NoOpEnvelopeReader implements IEnvelopeReader {
   private static final NoOpEnvelopeReader instance = new NoOpEnvelopeReader();

   private NoOpEnvelopeReader() {
   }

   public static NoOpEnvelopeReader getInstance() {
      return instance;
   }

   @Nullable
   @Override
   public SentryEnvelope read(@NotNull InputStream var1) {
      return null;
   }
}
