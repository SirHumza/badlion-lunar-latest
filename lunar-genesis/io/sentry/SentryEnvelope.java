package io.sentry;

import io.sentry.protocol.SdkVersion;
import io.sentry.protocol.SentryId;
import io.sentry.util.Objects;
import java.util.ArrayList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public final class SentryEnvelope {
   @NotNull
   private final SentryEnvelopeHeader header;
   @NotNull
   private final Iterable<SentryEnvelopeItem> items;

   @NotNull
   public Iterable<SentryEnvelopeItem> getItems() {
      return this.items;
   }

   @NotNull
   public SentryEnvelopeHeader getHeader() {
      return this.header;
   }

   public SentryEnvelope(@NotNull SentryEnvelopeHeader var1, @NotNull Iterable<SentryEnvelopeItem> var2) {
      this.header = Objects.requireNonNull(var1, "SentryEnvelopeHeader is required.");
      this.items = Objects.requireNonNull(var2, "SentryEnvelope items are required.");
   }

   public SentryEnvelope(@Nullable SentryId var1, @Nullable SdkVersion var2, @NotNull Iterable<SentryEnvelopeItem> var3) {
      this.header = new SentryEnvelopeHeader(var1, var2);
      this.items = Objects.requireNonNull(var3, "SentryEnvelope items are required.");
   }

   public SentryEnvelope(@Nullable SentryId var1, @Nullable SdkVersion var2, @NotNull SentryEnvelopeItem var3) {
      Objects.requireNonNull(var3, "SentryEnvelopeItem is required.");
      this.header = new SentryEnvelopeHeader(var1, var2);
      ArrayList var4 = new ArrayList(1);
      var4.add(var3);
      this.items = var4;
   }

   @NotNull
   public static SentryEnvelope from(@NotNull ISerializer var0, @NotNull Session var1, @Nullable SdkVersion var2) {
      Objects.requireNonNull(var0, "Serializer is required.");
      Objects.requireNonNull(var1, "session is required.");
      return new SentryEnvelope(null, var2, SentryEnvelopeItem.fromSession(var0, var1));
   }

   @NotNull
   public static SentryEnvelope from(@NotNull ISerializer var0, @NotNull SentryBaseEvent var1, @Nullable SdkVersion var2) {
      Objects.requireNonNull(var0, "Serializer is required.");
      Objects.requireNonNull(var1, "item is required.");
      return new SentryEnvelope(var1.getEventId(), var2, SentryEnvelopeItem.fromEvent(var0, var1));
   }

   @NotNull
   public static SentryEnvelope from(@NotNull ISerializer var0, @NotNull ProfilingTraceData var1, long var2, @Nullable SdkVersion var4) {
      Objects.requireNonNull(var0, "Serializer is required.");
      Objects.requireNonNull(var1, "Profiling trace data is required.");
      return new SentryEnvelope(new SentryId(var1.getProfileId()), var4, SentryEnvelopeItem.fromProfilingTrace(var1, var2, var0));
   }
}
